#!/bin/bash
cd /opt/export
/usr/lib/jvm/jdk1.7/bin/java -classpath \
./bin:\
./libs/commons-logging-1.1.jar:\
./libs/log4j-1.2.17.jar:\
./libs/mysql-connector-java-5.1.7-bin.jar:\
./libs/proxool-0.9.1.jar:\
./libs/proxool-cglib.jar:\
./libs/wocloud.v3.startup.jar \
export.Go1 >> logs1.log &
