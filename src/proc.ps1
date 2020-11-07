param(
  [string]$Function,
  [string]$f,
  [string]$TestName,
  [string]$t
)
$rootDir = Get-Location

$csc = "csc.exe"
$ilasm = "ilasm.exe"
$ildasm = "ildasm.exe"

$testsDir = "$rootDir\test"
$compilerDir = "$rootDir\compiler"
$distDir = "$compilerDir\dist"

$logFile = "$rootDir\proc.log"
$debugJsFile = "$testsDir\debug.js"

$parserDir = "$compilerDir\antlr"
$parserGenDir = "$parserDir\gramar"

function Write-Warning{
  param([string]$text)
  Write-Host "[WARN] " -ForegroundColor Yellow -NoNewline
  Write-Host "$text"
}
function Write-Error{
  param([string]$text)
  Write-Host "[ERROR] " -ForegroundColor Red -NoNewline
  Write-Host "$text"
}

function Exit-WithError {
  param([string]$text)
  Write-Error $text
  exit
}

function CreatePaths {
  param([Parameter(Mandatory)][string]$name)

  $destFolder = "$testsDir\$name"
  return @{
    destFolder = $destFolder
    jsFile = "$destFolder\program.js"
    csFile = "$destFolder\program.cs"
  
    csDFile = "$destFolder\cs.il"
    exeFile = "$destFolder\cs.exe"
    resFile = "$destFolder\cs.res"
    jsIlFile = "$destFolder\js.il"
    jsExeFile = "$destFolder\js.exe"

    jsIlDistFile = "$compilerDir\dist\Program.il"
  }
}

function ProcessTest {
  param ([Parameter(Mandatory)][string]$name)
  $paths = CreatePaths($name);
  CleanTestFolder($name);

  if(Test-Path -Path $paths['csFile']){
    Start-Process $csc -ArgumentList /out:$($paths['exeFile']), /o, $paths['csFile'] -NoNewWindow -Wait -RedirectStandardOutput $logFile;
    Start-Process $ildasm -ArgumentList $paths['exeFile'], /out=$($paths['csDFile']) -NoNewWindow -Wait -RedirectStandardOutput $logFile;
    Remove-Item -Path $paths['resFile'] -ErrorAction Ignore;
  } else {
    Write-Warning "$($paths['csFile']) not exist".
  }
  
  if(Test-Path -Path $paths['jsFile']){
    Set-Location $compilerDir;
    Start-Process dotnet -ArgumentList run, $paths['jsFile'] -NoNewWindow -Wait -RedirectStandardOutput $logFile;
    Set-Location $rootDir;
    Move-Item -Path $paths['jsIlDistFile'] -Destination $paths['jsIlFile'];
    Start-Process $ilasm -ArgumentList $paths['jsIlFile'], /OUTPUT=$($paths['jsExeFile']) -NoNewWindow -Wait -RedirectStandardOutput $logFile;
  } else {
    Write-Warning "$($paths['jsFile']) not exist".
  }
}

function InvokeForEachTest {
  param ([Parameter(Mandatory)][scriptblock]$Callback)
  $dirs = Get-ChildItem -Path $testsDir -Directory
  $length = $dirs.Length;
  for ($i = 0; $i -lt $length; $i++) {
    $Callback.Invoke($dirs[$i], $i, $dirs);
  }
}

function CleanTestFolder {
  param ([Parameter(Mandatory)][string]$name)
  $paths = CreatePaths($name);
  Remove-Item -Path $paths['csDFile'] -ErrorAction Ignore;
  Remove-Item -Path $paths['exeFile'] -ErrorAction Ignore;
  Remove-Item -Path $paths['jsIlFile'] -ErrorAction Ignore;
  Remove-Item -Path $paths['jsExeFile'] -ErrorAction Ignore;
}

function ProcessAllTests {
  InvokeForEachTest({
    param([string]$element, [int]$index, [array]$array)
    $len = $array.Length;
    $num = $index + 1;
    Write-Host "[$num\$len] Processing `"$element`""
    ProcessTest($element);
  });
  Write-Host "Done"
}

function CleanAllTests {
  InvokeForEachTest({
    param([string]$element, [int]$index, [array]$array)
    $len = $array.Length;
    $num = $index + 1;
    Write-Host "[$num\$len] Clean `"$element`"";
    CleanTestFolder($element);
  });
  Write-Host "Done"
}

function RunCompilerWithDebugFile {
  Set-Location $compilerDir;
  Start-Process dotnet -ArgumentList run, $debugJsFile -NoNewWindow -Wait -RedirectStandardOutput $logFile;
  Set-Location $rootDir;
}

function CleanParserFiles {
  Remove-Item -Path $parserDir\*er.cs -ErrorAction Ignore;
  Remove-Item -Path $parserGenDir\*.interp -ErrorAction Ignore;
  Remove-Item -Path $parserGenDir\*.tokens -ErrorAction Ignore;
}

function GenerateParserFiles {
  Set-Location $parserGenDir;
  Start-Process java -ArgumentList "-jar antlr.jar -Dlanguage=CSharp *.g4" -NoNewWindow -Wait -RedirectStandardOutput $logFile;
  Set-Location $rootDir;
  Move-Item -Path "$parserGenDir\*cs" -Destination $parserDir;
}

function CleanCompiler {
  Remove-Item -Path "$distDir\*" -ErrorAction Ignore;
  Set-Location $compilerDir;
  Start-Process dotnet -ArgumentList clean -NoNewWindow -Wait -RedirectStandardOutput $logFile;
  Set-Location $rootDir;
}

function GetParam {
  param (
    [array] $params,
    [string] $errorText
  )
  foreach($param in $params){
    if(-not [string]::IsNullOrEmpty($param)){
      return $param;
    }
  }
  Exit-WithError $errorText
}

function GetTestNameParam {
  return GetParam $TestName, $t -errorText "Test name not provided";
}

Try {
  $funcName = GetParam $Function, $f -errorText "Function name not provided";
  switch ($funcName) {
    "GenerateParserFiles" { GenerateParserFiles }
    "RunCompilerWithDebugFile" { RunCompilerWithDebugFile }
    "ProcessTest" { ProcessTest(GetTestNameParam) }
    "ProcessAllTests" { ProcessAllTests }
    "CleanTestFolder" { CleanTestFolder(GetTestNameParam) }
    "CleanAllTests" { CleanAllTests }
    "CleanParserFiles" { CleanParserFiles }
    "CleanCompiler" { CleanCompiler }
    Default { Exit-WithError "Function name was not recognized" }
  }
}
Finally {
  Set-Location $rootDir;
}

