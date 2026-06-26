#!/bin/sh
set -e
mvn -T 10 clean install
./plugins/idea/gradlew -b plugins/idea/build.gradle clean buildPlugin
mvn -T 10 -f plugins/eclipse/pom.xml clean install
./plugins/gradle/gradlew -p plugins/gradle/ clean assemble validatePlugins publishToMavenLocal
