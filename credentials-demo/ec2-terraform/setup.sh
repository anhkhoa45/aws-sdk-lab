#!/bin/bash

# create ~/.aws
mkdir /home/ubuntu/.aws

# install pip & boto3
sudo apt-get update -y
sudo apt-get -y install python3-pip
sudo pip3 install boto3

# install java
sudo apt install openjdk-11-jdk -y
java -version

# install gradle
sudo apt install gradle -y

# install maven
sudo apt install maven -y

# install dotnet
wget https://packages.microsoft.com/config/ubuntu/21.04/packages-microsoft-prod.deb -O packages-microsoft-prod.deb
sudo dpkg -i packages-microsoft-prod.deb
sudo apt-get update -y
sudo apt-get install dotnet-sdk-5.0 -y

# install cmake
sudo apt install libssl-dev libcurl4-openssl-dev cmake -y
 