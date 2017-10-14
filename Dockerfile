FROM ubuntu
# Clone our private GitHub Repository
RUN  apt-get update
RUN  apt-get upgrade
RUN  apt-get install -y git
RUN  apt-get install -y openjdk-8-jdk
RUN mkdir mygitdocker
RUN pwd
RUN cd /mygitdocker && git init && git pull https://github.com/suyash333/testingcloudarena.git
RUN cat /mygitdocker/HelloGit.txt
RUN cd /mygitdocker && javac Main.java && java Main
# This will copy your content in docker contianer and in given folder