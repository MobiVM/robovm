RoboVM Gradle plugin
====================

# Usage
To use the RoboVM plugin, include in your build script:

```groovy
// Pull the plugin from Maven Central
buildscript {
    ext.roboVMVersion = "2.3.19-SNAPSHOT"
    repositories {
        mavenCentral()
        maven { url 'https://oss.sonatype.org/content/repositories/snapshots' }
    }
    dependencies {
        classpath "com.mobidevelop.robovm:robovm-gradle-plugin:${roboVMVersion}"
    }
}

apply plugin: 'java'

// Apply the plugin
apply plugin: 'robovm'

repositories {
    mavenLocal()
    mavenCentral()
    maven { url 'https://oss.sonatype.org/content/repositories/snapshots' }
}

dependencies {
    implementation "com.mobidevelop.robovm:robovm-rt:${roboVMVersion}"
    implementation "com.mobidevelop.robovm:robovm-cocoatouch:${roboVMVersion}"
}

robovm {
    // Configure robovm
}
```

## Tasks

The RoboVM plugin defines the following tasks:

* `launchIPhoneSimulator`: Runs your iOS app in the iPhone simulator.
* `launchIPadSimulator`: Runs your iOS app in the iPad simulator.
* `launchIOSDevice`: Runs your iOS app on a connected iOS device.
* `launchTVOSSimulator`: Runs your tvOS app in the AppleTV simulator.
* `launchTVOSDevice`: Runs your tvOS app on a connected AppleTV device.
* `launchConsole`: Runs a console app.
* `createIPA`: Creates .ipa file. This is an alias for the `robovmArchive` task.
* `robovmArchive`: Compiles a binary, archives it in a format suitable for distribution and saves it to `build/robovm/`.
* `robovmInstall`: Compiles a binary and installs it to `build/robovm/`.

## Project properties

The simulator launcher properties can be set by project properties via `gradle.properties` or `-P` command line parameter:

* `robovm.device.name`: Set the device name property.
 * iPhone-4s
 * iPhone-5
 * iPhone-5s
 * iPhone-6
 * iPhone-6-Plus
 * iPhone-6s
 * iPhone-6s-Plus
 * iPad-2
 * iPad-Air
 * iPad-Air-2
 * iPad-Pro
 * iPad-Retina
 * Apple-TV-1080p
* `robovm.device.udid`: Select one of several USB-connected physical devices by UDID to run your app on.
* `robovm.sdk.version`: Set the sdk version property.

The arch can be specified using the `gradle.properties` or `-P` command line parameter. To launch on the simulator in 64-bit mode use:

```
gradle -Probovm.arch=x86_64 -Probovm.device.name=iPhone-5s launchIPhoneSimulator
```

Make sure to specify a 64-bit capable device type to simulate, e.g. `iPhone-5s`.

To launch on device in 64-bit mode:

```
gradle -Probovm.arch=arm64 launchIOSDevice
```

To launch on a device with a given UDID in 64-bit mode:

```
gradle -Probovm.arch=arm64 -Probovm.device.udid=eecfc85775e44c5b3061dc3571c848e4cfc3221a launchIOSDevice
```

The `robovmArchive` task will by default include the archs listed in the `robovm.xml` file in the archive. Use the `robovm.archs` property to specify the archs to include in the archive:

```
gradle -Probovm.archs=thumbv7:arm64 robovmArchive
```

The `createIPA` task is an alias for the `robovmArchive` task.

The `robovmInstall` task is very similar to the `robovmArchive` task but doesn't archive the folder structure it creates. It also supports the `robovm.archs` property:

```
gradle -Probovm.archs=x86:x86_64 robovmInstall
```

## Headless code signing

When building iOS/tvOS apps on a CI server `codesign` may need a password in order to unlock the keychain where the signing key is located. The Gradle plugin recognizes two properties which can be used to specify this password. If none of these properties have been specified the compiler will also look for a `KEYCHAIN_PASSWORD` environment variable.

### robovm.keychainPassword

Keychain password to use when unlocking the `codesign` keychain.

### robovm.keychainPasswordFile

Read the keychain password to use when unlocking the `codesign` keychain from the specified file.


## Debugging
You can instruct the RoboVM Gradle plugin to compile and run your app in debug mode:

```
gradle -Probovm.debug=true -Probovm.debugPort=7777 launchIPhoneSimulator
```

You can then attach a debugger, e.g. the Eclipse or IntelliJ IDEA debugger via a remote run configuration. Simply set the host to `localhost` and the port to what you specified via `-Probovm.debugPort` (7777 in the case above).


## Plugin Development
To debug the plugin, build and install it to your local repository. Next, set `GRADLE_OPTS` as follows:

```bash
export GRADLE_OPTS="-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=5006"
```
You can now fire up a Gradle build for some test project. Gradle will wait for a JDWP debugger to attach. You can do so in Eclipse or Intellij IDEA.

Note: if your test project uses the Gradle daemon, you have to disable it. Also, if you have a gradle.properties file specifying JVM arguments, Gradle will spawn a new JVM. You can remove/rename the gradle.properties file while debugging.
