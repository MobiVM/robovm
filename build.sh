#!/bin/sh
set -e
mvn -T 10 clean install
./plugins/idea/gradlew -p plugins/idea/ clean buildPlugin
mvn -T 10 -f plugins/eclipse/pom.xml clean install
./plugins/gradle/gradlew -p plugins/gradle/ clean assemble validatePlugins publishToMavenLocal
