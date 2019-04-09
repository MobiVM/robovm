#!/bin/sh
XCODE_BIN_DIR=`xcode-select --print-path`/Toolchains/XcodeDefault.xctoolchain/usr/bin/
export PATH="$XCODE_BIN_DIR:$PATH"
set -e
mvn clean install
mvn -f plugins/idea/pom.xml clean install
mvn -f plugins/eclipse/pom.xml clean install
./plugins/gradle/gradlew -b plugins/gradle/build.gradle clean assemble install
