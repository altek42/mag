$rootDir = Get-Location

$csc = "csc.exe"
$ilasm = "ilasm.exe"
$ildasm = "ildasm.exe"

$testsDir = "$rootDir\test"
$compilerDir = "$rootDir\compiler"

$logFile = "$rootDir\proc.log"
$debugJsFile = "$testsDir\debug.js"

$parserDir = "$compilerDir\antlr"
$parserGenDir = "$parserDir\gramar"

function Write-Warning{
  param([string]$text)
  Write-Host "[WARN] " -ForegroundColor Yellow -NoNewline
  Write-Host "$text"
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
  ClearTestFolder($name);

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

function ClearTestFolder {
  param ([Parameter(Mandatory)][string]$name)
  $paths = CreatePaths($name);
  Remove-Item -Path $paths['csDFile'] -ErrorAction Ignore;
  Remove-Item -Path $paths['exeFile'] -ErrorAction Ignore;
  Remove-Item -Path $paths['jsIlFile'] -ErrorAction Ignore;
  Remove-Item -Path $paths['jsExeFile'] -ErrorAction Ignore;
}

function ProcessAllTests {
  $dirs = Get-ChildItem -Path $testsDir -Directory
  $counter = 0;
  $length = $dirs.Length;
  foreach ($dir in $dirs) {
    $counter++;
    Write-Host "[$counter\$length] Processing `"$dir`""
    ProcessTest($dir);
  }
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

Try {
  # ProcessAllTests;
  # RunCompilerWithDebugFile;
  # CleanParserFiles;
  # GenerateParserFiles
  ProcessTest("console");
}
Finally {
  Set-Location $rootDir;
}

