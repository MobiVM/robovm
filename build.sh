#/bin/sh
set -e
mvn clean install
mvn -f plugins/idea/pom.xml clean install
mvn -f plugins/eclipse/pom.xml clean install
mvn -f plugins/maven/maven-resolver/pom.xml clean install
mvn -f plugins/maven/junit/pom.xml clean install
mvn -f plugins/maven/robovm-maven-plugin/pom.xml clean install
./plugins/gradle/gradlew -b plugins/gradle/build.gradle clean assemble install