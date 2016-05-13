#/bin/sh
set -e
mvn clean install -Pbuild-natives
mvn -f plugins/idea/pom.xml clean install
mvn -f plugins/eclipse/pom.xml clean install
./plugins/gradle/gradlew -b plugins/gradle/build.gradle clean assemble install