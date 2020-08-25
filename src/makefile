COMPILER_DIR = compiler
ANTLR_DIR = antlr
ANTLR_GRAMAR_DIR = ${ANTLR_DIR}/gramar
RUN_APP = dotnet run
TEST_FOLDER = test
DEBUG_JS_FILE = ${TEST_FOLDER}/debug.js
RUN_JS_DEBUG_FILE = node ${DEBUG_JS_FILE}
DIST_FOLDER = ${COMPILER_DIR}/dist
DEBUG_IL_FILE = ${DIST_FOLDER}/Debug.il
DEBUG_EXE_FILE = ${DIST_FOLDER}/Debug.exe
ILASM_APP = ilasm

.PHONY: all install-tools run clean clean-antlr generate test-base run-js-debug compile-debug compile-debug-run deasm-program

#Prevent all echoing (echoing - lines that are executed)
.SILENT:

#Make main rule empty (for now)
all:

install-tools:
	#Update system packages
	sudo apt update
	sudo apt upgrade
	sudo apt dist-upgrade

	#Install needed packages for C#
	wget https://packages.microsoft.com/config/ubuntu/19.10/packages-microsoft-prod.deb -O packages-microsoft-prod.deb
	sudo dpkg -i packages-microsoft-prod.deb
	sudo apt update
	sudo apt install apt-transport-https
	sudo apt install dotnet-sdk-3.1
	
	#Install needed packages for Java
	sudo apt install default-jdk

	#Install needed packages for Nodejs
	sudo apt install nodejs

	#Install ilasm ildasm
	sudo apt install mono-devel

	#Clean up after installation
	rm -rf packages-microsoft-prod.deb
	sudo apt autoclean
	sudo apt autoremove
	sudo apt clean

run:
	cd ${COMPILER_DIR} && ${RUN_APP} $(ARGS)

run-debug:
	cd ${COMPILER_DIR} && ${RUN_APP} ../${DEBUG_JS_FILE}

run-js-debug:
	${RUN_JS_DEBUG_FILE}

# test-base:
# 	${RUN_APP} ${TEST_FOLDER}/base.js

compile-debug-run: compile-debug
	${DEBUG_EXE_FILE}

compile-debug: ${DEBUG_IL_FILE}
	rm ${DIST_FOLDER}/*.exe || true
	${ILASM_APP} ${DEBUG_IL_FILE}

deasm-program:
	ikdasm bin/Debug/netcoreapp3.1/src.dll > bin/test.txt

generate:
	cd ${ANTLR_GRAMAR_DIR} && java -jar antlr.jar -Dlanguage=CSharp *.g4
	mv ${ANTLR_GRAMAR_DIR}/*cs ${ANTLR_DIR}

clean-antlr:
	rm ${ANTLR_DIR}/*er.cs
	rm ${ANTLR_GRAMAR_DIR}/*.interp
	rm ${ANTLR_GRAMAR_DIR}/*.tokens

clean: clean-antlr
	rm ${DIST_FOLDER}/* || true
	dotnet clean
