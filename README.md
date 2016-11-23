# RoboVM

[**Website**](http://robovm.mobidevelop.com) -
[**Developer Guide**](https://github.com/MobiDevelop/robovm/wiki/Developer-Guide) -
[**Changelog**](https://github.com/MobiDevelop/robovm/wiki/Changelog) -
[**RoboPods**](https://github.com/MobiDevelop/robovm-robopods)

RoboVM is an ahead-of-time compiler for Java bytecode, targeting Linux, Mac OS X and iOS.

This is a fork of the [last open-source release of RoboVM](https://github.com/robovm/robovm).

**iOS 10 and XCode 8** are fully supported, for details please read [this wiki article](https://github.com/MobiDevelop/robovm/wiki/iOS-10-and-XCode-8-compatibility).

## Using RoboVM

There are pre-built plugins for Eclipse and IntelliJ IDEA, for installation take a look at the [homepage](http://robovm.mobidevelop.com/).

For using the RoboVM Gradle plugin, follow the [README in the repository](https://github.com/MobiDevelop/robovm/tree/master/plugins/gradle)

## Communicating
[![Join the chat at https://gitter.im/MobiDevelop/robovm](https://badges.gitter.im/MobiDevelop/robovm.svg)](https://gitter.im/MobiDevelop/robovm?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

## License
See the LICENSE files in the various sub directories. Generally, RoboVM is GPL2,
with the runtime code being Apache 2 for distribution on iOS.

## How to release

### Prerequisites

#### Setup Maven
You need to setup the bintray username/password in your
local `~/.m2/settings.xml` file:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0" 
          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
          xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0 http://maven.apache.org/xsd/settings-1.0.0.xsd">
  <servers>
	<server>
		<id>bintray</id>
		<username>raisercostin</username>
		<password>10d49f760982f6*as sample*e133a0dec77439</password>
	</server>
  </servers>
</settings>
```

(!) You can find the password at https://bintray.com/profile/edit > API Key

### Releasing

Change the versions to the release one:
   `mvn org.eclipse.tycho:tycho-versions-plugin:0.20.0:set-version -Dtycho.mode=maven -DnewVersion=2.2.1`
   (!) The tycho-versions plugin handles the versions for eclipse too compared with *versions* plugin.

Deploy to bintray with profile *release* to generate and deploy javadoc and sources as well.
    `mvn deploy -DskipTests -Prelease`
    (!) For now the idea plugin is not generated since needs a intelij to be installed.

Publish manually in bintray if in pom.xml distributionManagement url is finished with publish=0. Change publish=1 to publish in bintray automatically.

Tag the release in git:
    ```
	git commit -am "Set release version 2.2.1"
	git tag robovm-2.2.1
	```

Prepare next development cycle
     ```
     mvn org.eclipse.tycho:tycho-versions-plugin:0.20.0:set-version -Dtycho.mode=maven -DnewVersion=2.2.2-SNAPSHOT
     git commit -am "Set next development version 2.2.2-SNAPSHOT"
	git push --tags
	```
   