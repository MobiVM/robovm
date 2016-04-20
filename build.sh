#/bin/sh
set -e
compiler/vm/build.sh
mvn -f compiler/pom.xml clean install
mvn -f dist/pom.xml clean install
mvn -f plugins/templates/pom.xml clean install
mvn -f plugins/idea/pom.xml clean install -Pdeployment
mvn -f plugins/eclipse/pom.xml clean install
./plugins/gradle/gradlew -b plugins/gradle/build.gradle clean assemble install