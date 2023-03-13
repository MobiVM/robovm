#!/bin/sh
set -e
mvn -Dmaven.wagon.httpconnectionManager.ttlSeconds=30 -Dhttp.keepAlive=false -Dmaven.wagon.http.retryHandler.count=3 clean install
./plugins/idea/gradlew -b plugins/idea/build.gradle clean buildPlugin
mvn -Dmaven.wagon.httpconnectionManager.ttlSeconds=30 -Dhttp.keepAlive=false -Dmaven.wagon.http.retryHandler.count=3 -f plugins/eclipse/pom.xml clean install
./plugins/gradle/gradlew -b plugins/gradle/build.gradle clean assemble publishToMavenLocal
