# RoboVM
RoboVM is an ahead-of-time compiler for Java bytecode, targeting Linux, Mac OS X and iOS.

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
 * IntelliJ IDEA 15 or higher, stored under /Applications/IntelliJ IDEA.app

To build RoboVM locally, execute the `build.sh` script in the root folder. This
will 

 1. Generate Maven artifacts into your local Maven repository
 2. Put the IDEA plugin in `plugins/idea/target`
 3. Put the Eclipse plugin in `plugins/eclipse/update-site/target/site`

## License
See the LICENSE files in the various sub directories. Generally, RoboVM is GPL2,
with the runtime code being Apache 2 for distribution on iOS.
