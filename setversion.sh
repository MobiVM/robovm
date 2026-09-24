#!/bin/sh
#
# run as
# DEVELOPMENT_VERSION=2.3.24 ./setversion.sh
#
set -e
: ${DEVELOPMENT_VERSION?"Need to set env var DEVELOPMENT_VERSION for next development version"}
export TIMESTAMP=`date +"%Y%m%d%H%M"`

#
# set maven version everywhere 
#
mvn versions:set -DnewVersion="$DEVELOPMENT_VERSION"
mvn versions:commit


#
# update plugins/eclipse
#
pushd plugins/eclipse
## Set the pom version to the next development version
mvn org.eclipse.tycho:tycho-versions-plugin:1.5.1:set-version -DnewVersion="$DEVELOPMENT_VERSION"
mv pom.xml pom.xml.bak && sed "s/<robovm.version>.*<\/robovm.version>/<robovm.version>$DEVELOPMENT_VERSION<\/robovm.version>/" pom.xml.bak > pom.xml
rm pom.xml.bak
popd

#
# update plugins/idea
#
# Set the pom version to the next development version (it always have to be development)
pushd plugins/idea
mvn versions:set -DnewVersion=$DEVELOPMENT_VERSION
mvn versions:commit
mv pom.xml pom.xml.bak && sed "s/<robovm.version>.*<\/robovm.version>/<robovm.version>$DEVELOPMENT_VERSION<\/robovm.version>/" pom.xml.bak > pom.xml
rm pom.xml.bak
sed "s/roboVMVersion *=.*/roboVMVersion = '$DEVELOPMENT_VERSION'/" build.gradle > build.gradle.tmp
mv build.gradle.tmp build.gradle
popd

#
# update Gradle plugin
#
pushd plugins/gradle
sed "s/^version *=.*/version = '$DEVELOPMENT_VERSION'/" build.gradle | sed "s/roboVMVersion *=.*/roboVMVersion = '$DEVELOPMENT_VERSION'/" > build.gradle.tmp
mv build.gradle.tmp build.gradle
popd
