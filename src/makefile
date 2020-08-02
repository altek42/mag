
.PHONY: all install-tools run clean

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
	dotnet run

clean:
	dotnet clean
