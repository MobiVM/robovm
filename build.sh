#!/bin/sh

set -e
#if build environment changes (e.g. xcode path) this might be needed to clear cmake-cache in /compiler/vm/target
if [ "$1" = '--fullclean' ];
then
    mvn clean install -Pclean-all
else
    mvn clean install 
fi
mvn -f plugins/idea/pom.xml clean install
mvn -f plugins/eclipse/pom.xml clean install
./plugins/gradle/gradlew -b plugins/gradle/build.gradle clean assemble install
