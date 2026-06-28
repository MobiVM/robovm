#!/bin/sh
set -e
mvn -T 10 clean install
./plugins/idea/gradlew -p plugins/idea/ clean buildPlugin
MAVEN_OPTS="-Djdk.xml.maxGeneralEntitySizeLimit=0 -Djdk.xml.totalEntitySizeLimit=0" mvn -T 10 -f plugins/eclipse/pom.xml clean install
./plugins/gradle/gradlew -b plugins/gradle/build.gradle clean assemble validatePlugins publishToMavenLocal
