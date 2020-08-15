
# Makefile commands:

| Command |Description|
|:-|:-|
|install-tools| Installing the necesary tools like: dotnet-sdk-3.1, default-jdk (Java), nodejs, mono-devel. |
| run ARGS=[filePath]| Run program to process file located in `filePath`. |
| run-debug | Run program to process `test/debug.js` file. |
| run-js-debug | Run `test/debug.js` file on nodejs enviroment. |
| compile-debug | Remove `*.exe` files and compile `Debug.il` file. |
| compile-debug-run | Run `compile-debug` command and run compiled file. |
| generate | Compile grammar files (`*.g4`). |
| clean-antlr | Remove grammar generated files. |
| clean | Clean project. |
