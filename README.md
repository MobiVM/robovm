# RoboVM

[**Website**](http://robovm.mobidevelop.com) - [**Developer Guide**](../wiki/Developer-Guide)

RoboVM is an ahead-of-time compiler for Java bytecode, targeting Linux, Mac OS X and iOS.

## Using RoboVM

There are pre-built plugins for Eclipse and IntelliJ IDEA, for installation take a look at the [homepage](http://robovm.mobidevelop.com/).

For using the RoboVM Grade plugin, follow the [README in the repository](https://github.com/MobiDevelop/robovm/tree/master/plugins/gradle)

## Project Structure

This is a fork of the [last open-source release of RoboVM](https://github.com/robovm/robovm). The originally seperate repositories have been merged into a single repository.

 * `compiler/` contains the compiler infrastructure and code to package and launch apps on
   Linux, Mac OS X and iOS. It also contains the native code of the VM.
 * `dist/` packages everything in `compiler/` into two artifacts used by IDE plugins and
   the Gradle plugin
 * `plugins/` contains the Gradle, Eclipse and IDEA plugins, as well as the templates

Note that the groupId of all artifacts has been changed to `com.mobidevelop.robovm` so
it doesn't collide with the original `org.robovm` groupId. The version has been changed
to 2.0.0-SNAPSHOT. The artifactIds stay the same to make it easier to use with libGDX.

This fork is meant to be used with [libGDX](https://github.com/libgdx/libgdx/). Normal
iOS apps have not been tested against it. Use at your own risk.

## Building
You will need the following dependencies installed (iOS only, never tried Linux):

 * JDK
 * Maven
 * CMake
 * Xcode and command line tools
 * IntelliJ IDEA 15 or higher, stored under /Applications/IntelliJ IDEA CE.app
 * OpenSSL development libraries, install via `brew install openssl` on Mac OS X
 * autoconf, install via `brew install autoconf` on Mac OS X
 * automake, install via `brew install automake` on Mac OS X
 * libtool, install via `brew install libtool` on Mac OS X

To build RoboVM locally, execute the `build.sh` script in the root folder. This
will

 1. Generate Maven artifacts into your local Maven repository
 2. Put the IDEA plugin in `plugins/idea/target`
 3. Put the Eclipse plugin in `plugins/eclipse/update-site/target/site`

## Communicating
[![Join the chat at https://gitter.im/MobiDevelop/robovm](https://badges.gitter.im/MobiDevelop/robovm.svg)](https://gitter.im/MobiDevelop/robovm?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

## License
See the LICENSE files in the various sub directories. Generally, RoboVM is GPL2,
with the runtime code being Apache 2 for distribution on iOS.
