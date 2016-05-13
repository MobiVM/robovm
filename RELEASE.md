# Releasing
We already have a GPG keys for signing as well as SonaType accounts. Ask MobiDevelop for details. Below
you'll find instructions on how to reproduce these things (though you'll have to publish under your
own groupId for your domain).

## Setup GPG Key
Setup a GPG keypair with a passphrase. 

```
# brew install gpg if you are on Mac OS X
gpg --gen-key
```

Then publish your public key to a keyserver (`your-key-id` is what you see after `2048D/` in the first line of `gpg --list-keys`):
```
gpg --keyserver pgp.mit.edu --send-key <your-key-id>
```

If you already have a GPG keypair files, e.g. `key.pub`/`key.priv`, import them into your local key chain:

```
gpg --import key.pub
gpg --allow-secret-key-import --import key.priv
```

## Setup SonaType Account
Follow [their guide](http://central.sonatype.org/pages/ossrh-guide.html)

## Setup Maven
You need to setup the SonaType repositories as well as the GPG passphrase in your
local `~/.m2/settings.xml` file:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0" 
          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
          xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0 http://maven.apache.org/xsd/settings-1.0.0.xsd">
  <servers>
    <server>
      <id>sonatype-nexus-snapshots</id>
      <username>your-sonatype-username-here</username>
      <password>your-sonatype-password-here></password>
    </server>
    <server>
      <id>sonatype-nexus-staging</id>
      <username>your-sonatype-username-here</username>
      <password>your-sonatype-password-here></password>
    </server>
  </servers>

  <profiles>
    <profile>
      <id>gpg</id>
      <properties>
        <gpg.executable>gpg</gpg.executable>
        <gpg.passphrase>your-gpg-passphrase-here</gpg.passphrase>
      </properties>
    </profile>
  </profiles>
  <activeProfiles>
    <activeProfile>gpg</activeProfile>
  </activeProfiles>
</settings>
```

## Setup Gradle
Finally, create a file in `~/.gradle/gradle.properies` and add the following content:

```
signing.keyId=<your-key-id>
signing.password=<your-key-passphrase>
nexusUsername=<your-sonatype-username-here>
nexusPassword=<your-sonatype-password-here>
```

This is needed to deploy the Gradle plugin to SonaType

## Performing the Release
Before we release the plugins, we'll setup a few environment variables on the CLI:

```
export RELEASE_VERSION=2.0.0
export DEVELOPMENT_VERSION=2.1.0-SNAPSHOT
export TIMESTAMP=`date +"%Y%m%d%H%M"`
```

Next, we release the modules in `compiler/` and `dist` via the root `pom.xml`

```
# prepare the release, swap out the version numbers! This will modify the poms, try to build everything
# then commit the changed release poms, tag the master branch, set the pom versions to the next
# development version, and commit those as well
mvn --batch-mode -Dtag=robovm-$RELEASE_VERSION -DreleaseVersion=$RELEASE_VERSION -DdevelopmentVersion=$DEVELOPMENT_VERSION-SNAPSHOT release:prepare

# perform the release, checks out the tag, compiles and signs the jars, and uploads them to SonaType
mvn --batch-mode -Dtag=robovm-$RELEASE_VERSION -DreleaseVersion=$RELEASE_VERSION -DdevelopmentVersion=$DEVELOPMENT_VERSION-SNAPSHOT release:perform
```

Login to SonaType and release the artifacts in the staging repository. It will take a while until they are
available from Maven Central and its mirrors.

Next, release the Eclipse plugin:

```
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
git commit -am "Set next development version of Eclipse plugin, $DEVELOPMENT_VERSION-SNAPSHOT"
git push
```

Next, release the Gradle plugin:

```
cd plugins/

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
```

Next, release the IntelliJ IDEA plugin:

```
cd plugins/idea

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
mvn versions:set -DnewVersion=$DEVELOPMENT_VERSION
mvn versions:commit
git commit -am "Set next development version of IDEA plugin, $DEVELOPMENT_VERSION"
git push
```