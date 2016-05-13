#!/bin/sh
: ${RELEASE_VERSION?"Need to set env var RELEASE_VERSION, e.g. 2.0.0"}
: ${DEVELOPMENT_VERSION?"Need to set env var DEVELOPMENT_VERSION for next development version, e.g. 2.1.0 (don't include SNAPSHOT)"}
export RELEASE_VERSION=$RELEASE_VERSION
export DEVELOPMENT_VERSION=$DEVELOPMENT_VERSION
export TIMESTAMP=`date +"%Y%m%d%H%M"`

# release compiler/ and dist/
mvn --batch-mode -Dtag=robovm-$RELEASE_VERSION -DreleaseVersion=$RELEASE_VERSION -DdevelopmentVersion=$DEVELOPMENT_VERSION-SNAPSHOT release:prepare
mvn --batch-mode -Dtag=robovm-$RELEASE_VERSION -DreleaseVersion=$RELEASE_VERSION -DdevelopmentVersion=$DEVELOPMENT_VERSION-SNAPSHOT release:perform

# release plugins/eclipse
cd plugins/eclipse

# Set the pom version to the release version
mvn org.eclipse.tycho:tycho-versions-plugin:0.20.0:set-version -DnewVersion="$RELEASE_VERSION.$TIMESTAMP"
mv ui/pom.xml ui/pom.xml.bak && sed "s/<robovm.version>.*<\/robovm.version>/<robovm.version>$RELEASE_VERSION<\/robovm.version>/" ui/pom.xml.bak > ui/pom.xml


# Create the update site for the release version
mvn clean install
git commit -am "Set release version of Eclipse plugin, $RELEASE_VERSION"
git push

# Copy the update-site/target/ to whereever you want it
ssh robovm@robovm.mobidevelop.com "mkdir -p /usr/share/nginx/html/downloads/releases/eclipse/$RELEASE_VERSION"
scp -r update-site/target/site/ robovm@robovm.mobidevelop.com:/usr/share/nginx/html/downloads/releases/eclipse/$RELEASE_VERSION/

# Set the pom version to the next development version
mv ui/pom.xml.bak ui/pom.xml
mvn org.eclipse.tycho:tycho-versions-plugin:0.20.0:set-version -DnewVersion="$DEVELOPMENT_VERSION-SNAPSHOT"
git commit -am "Set next development version of Eclipse plugin, $DEVELOPMENT_VERSION"
git push

# release plugins/idea
cd ../idea

# Set the pom version to the release version
mvn versions:set -DnewVersion=$RELEASE_VERSION
mvn versions:commit

# Create the plugin Jar for the release version
mvn clean install -Pdeployment
git commit -am "Set release version of IDEA plugin, $RELEASE_VERSION"
git push

# Copy the target/*-dist.jar to whereever you want it
scp target/org.robovm.idea-$RELEASE_VERSION-plugin-dist.jar robovm@robovm.mobidevelop.com:/usr/share/nginx/html/downloads/releases/idea

# Set the pom version to the next development version
mvn versions:set -DnewVersion=$DEVELOPMENT_VERSION-SNAPSHOT
mvn versions:commit
git commit -am "Set next development version of IDEA plugin, $DEVELOPMENT_VERSION"
git push

# Publish Gradle plugin
cd ../gradle

# Set release version
sed "s/^version *=.*/version = '$RELEASE_VERSION'/" build.gradle | sed "s/roboVMVersion *=.*/    roboVMVersion = '$RELEASE_VERSION'/" > build.gradle.tmp
mv build.gradle.tmp build.gradle
./gradlew clean build install
git commit -am "Set release version of Gradle plugin, $RELEASE_VERSION"
git push

# Release
./gradlew uploadArchives

# Set development version
sed "s/^version *=.*/version = '$DEVELOPMENT_VERSION-SNAPSHOT'/" build.gradle | sed "s/roboVMVersion *=.*/    roboVMVersion = '$DEVELOPMENT_VERSION-SNAPSHOT'/" > build.gradle.tmp
mv build.gradle.tmp build.gradle

git commit -am "Set next development version of Gradle plugin, $DEVELOPMENT_VERSION-SNAPSHOT"
git push

