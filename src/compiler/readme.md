
# Makefile commands:

| Command |Description|
|:-|:-|
| install-tools | Installing the necesary tools like: dotnet-sdk-3.1, default-jdk (Java), nodejs, mono-devel. |
| run ARGS=[filePath]| Run program to process file located in `filePath`. |
| run-debug | Run program to process `test/debug.js` file. |
| run-js-debug | Run `test/debug.js` file on nodejs enviroment. |
| compile-debug | Remove `*.exe` files and compile `Debug.il` file. |
| compile-debug-run | Run `compile-debug` command and run compiled file. |
| generate | Compile grammar files (`*.g4`). |
| deasm-program | Deasembly "Debug" cs program |
| process-test | Compile test.js files into exe and deasembly test cs solutions |
| rebuild-all | Clean project and generate all files |
| build-test-cs | Build test cs solutions as release version |
| asm-test-js | Compile test.js files into ilasm |
| deasm-test-cs | Deasembly test cs solutions |
| asm-compile-tests | Compile tests il |
| asm-run | Run test exe file |
| clean-test-dir | Clean test folders |
| clean-antlr | Remove grammar generated files. |
| clean | Clean project. |
