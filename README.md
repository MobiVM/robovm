# RoboVM

[Website](http://robovm.mobidevelop.com)

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
 * IntelliJ IDEA 15 or higher, stored under /Applications/IntelliJ IDEA CE.app

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

# Development Setup
Eclipse seems to be the easiest to setup to work on RoboVM. The general idea is to run the Eclipse plugin in a second Eclipse instance directly from your main Eclipse instance. This allows you to debug compiler internals as well as the Eclipse plugin. Here's the setup used so far, based on the [old hacking guide](https://github.com/robovm/robovm-docs/blob/13fc4c5ac5232a812767f28121479ef5c3ad836e/en/advanced-topics/hacking.md).

## Importing into Eclipse
1. Install the Eclipse plugin development environment (Help -> Install New Software, select "The Eclipse Project Updates" update URL)
2. Build RoboVM via `build.sh` in the root folder, this will put all the required artifacts into your local `~/.m2` repository as well as jars that contain the RoboVM distribution used by the Eclipse plugin. They'll be written to `plugins/eclipse/libs` when the Eclipse plugin is build via Maven. If you don't perform this step, the Eclipse plugin can't be compiled in Eclipse!
3. Import all projects into Eclipse via their Maven poms. You will be prompted to install a bunch of m2e connectors, install them all!

At this point you should have two errors.

1. Project `org.robovm.eclipse.feature` has an error due to the missing m2e connector for the maven-antrun-plugin
2. Project `robovm-rt` will have an error due to source set shenanigans

For the first error, locate the error in the `Problems` view, right click and apply a quick fix telling Eclipse to ignore that error.

For the second error we can follow the old hacking guide:
1. Right click the `robovm-rt` project, select `Properties`, select `Java Build Path`, select the `Source` tab
2. Locate the entry for `robovm-rt/libcore/luni/src/main/java` and remove the `**` filter from the `Excluded` attribute
3. Refresh/clean your workspace

All projects should now build cleanly.

## Running the Eclipse plugin

1. Right click the `org.robovm.eclipse.ui` project
2. Select `Debug As`, select `Eclipse Application`
3. Set breakpoints in the Eclipse plugin source code in your first Eclipse instance, play with the functionality in the second Eclipse instance

This setup only allows you to debug the Eclipse plugin source code.

## RoboVM Dev Root
By default, RoboVM will extract the native libraries and Java runtime class jars from its distribution jar. For development, you can set the ROBOVM_DEV_ROOT environment variable to the root folder of the `compiler` module. If set, RoboVM will use the native libraries (either debug or release mode) and Java runtime classes found in `compiler/vm/target/binaries/` and `compiler/rt/target`, `compiler/objc/target` and `compiler/cocoatouch/target`. This allows you to modify the native code and runtime class libraries without having to rebuild the whole RoboVM distribution.

You can set this environment variable when running the Eclipse plugin project:

1. Open the run configuration for the Eclipse plugin project created earlier
2. Go to the `Environment` tab
3. Add a new entry called `ROBOVM_DEV_ROOT` and set it to the absolute path of the `compiler/` directory in the repository.

If you run the Eclipse plugin project again, you will see that the classpath containers now point to the `target/` folders of the `compiler/rt`, `compiler/objc` and `compiler/cocoatouch` modules. If you change the classes in the first Eclipse instance and have Eclipse recompile them, the RoboVM compiler will pick them up when you compile a RoboVM project in the second Eclipse instance.

Similarily, if you change the native code and recompile it on the command line, the RoboVM compiler will use the updated native libraries from `compiler/vm/target/binaries`. If you want to use the debug mode native libraries, go to `AbstractLaunchConfigurationDelegate:207` and pass `true`. I have not found a way yet to pass the `robovm.useDebugLibs` property to the Eclipse run configuration. To debug the native code of a running RoboVM process, you can fire up Xcode, create an Mac OS X project or iOS project, then attach to the running RoboVM process via `Debug -> Attach to Process`. Alternatively you can attach a CLI LLDB session to the running process. All of these sadly doesn't seem to work for debugging native code on devices.

## Debugging the compiler
With the development setup so far, you can debug the Eclipse plugin but not the compiler code paths when running the Eclipse plugin project. This can be fixed according to the old hacking guide.

1. Right click the `org.robovm.eclipse.ui` project, select `Properties`
2. Select `Java Build Path`, select the `Libraries` tab and remove `robovm-dist-compiler.jar` and `robovm-templater.jar`
3. In the `Libraries` tab, click `Add external JARS`, then add `~/.m2/repository/commons-io/commons-io/2.4/commons-io-2.4.jar` (hit CMD + SHIFT + G to enter that file location)
3. In the `Libraries` tab, click `Add external JARS`, then add `~/.m2/repository/org/apache/commons/commons-exec/1.0.1/commons-exec-1.0.1.jar`
3. In the `Libraries` tab, click `Add external JARS`, then add `~/.m2/repository/com/googlecode/plist/dd-plist/1.16/dd-plist-1.16.jar` 
4. Select the `Projects` tab and add all other RoboVM projects
5. Modify the `MANIFEST.MF` file in `plugins/eclipse/ui/META-INF/` folder:

```
Manifest-Version: 1.0
Bundle-ActivationPolicy: lazy
Bundle-Name: RoboVM Eclipse IDE Plugin
Bundle-RequiredExecutionEnvironment: JavaSE-1.7
Require-Bundle: org.eclipse.core.runtime,
 org.eclipse.ui,
 org.eclipse.jdt.ui,
 org.eclipse.jdt.core,
 org.eclipse.core.resources,
 org.eclipse.ui.console,
 org.eclipse.ui.ide,
 org.eclipse.debug.core,
 org.eclipse.debug.ui,
 org.eclipse.jdt.debug,
 org.eclipse.jdt.debug.ui,
 org.eclipse.jdt.launching,
 org.eclipse.jdt.junit,
 org.eclipse.jdt.junit.runtime,
 org.eclipse.jdt.junit4.runtime
Bundle-Version: 2.0.0.qualifier
Bundle-ManifestVersion: 2
Bundle-Activator: org.robovm.eclipse.RoboVMPlugin
Bundle-SymbolicName: org.robovm.eclipse.ui;singleton:=true
Bundle-ClassPath: .,
 lib/commons-compress.jar,
 external:/Users/nex/.m2/repository/commons-io/commons-io/2.4/commons-io-2.4.jar,
 external:/Users/nex/.m2/repository/org/apache/commons/commons-exec/1.0.1/commons-exec-1.0.1.jar,
 external:/Users/nex/.m2/repository/org/apache/commons/commons-lang3/3.3.2/commons-lang3-3.3.2.jar,
 external:/Users/nex/.m2/repository/com/googlecode/plist/dd-plist/1.16/dd-plist-1.16.jar,
 external:/Users/nex/.m2/repository/org/simpleframework/simple-xml/2.7/simple-xml-2.7.jar,
 external:/Users/nex/.m2/repository/org/bouncycastle/bcpkix-jdk15on/1.49/bcpkix-jdk15on-1.49.jar,
 external:/Users/nex/.m2/repository/org/bouncycastle/bcprov-jdk15on/1.49/bcprov-jdk15on-1.49.jar,
 external:/Users/nex/.m2/repository/com/googlecode/json-simple/json-simple/1.1.1/json-simple-1.1.1.jar,
 external:/Users/nex/.m2/repository/org/ow2/asm/asm-debug-all/5.0.3/asm-debug-all-5.0.3.jar,
 external:/Users/nex/.m2/repository/org/zeroturnaround/zt-zip/1.7/zt-zip-1.7.jar,
 external:/Users/nex/.m2/repository/org/slf4j/slf4j-api/1.6.6/slf4j-api-1.6.6.jar,
 external:/Users/nex/.m2/repository/net/java/dev/jna/jna/4.1.0/jna-4.1.0.jar,
 external:/Users/nex/.m2/repository//org/robovm/robovm-soot/2.5.0-2/robovm-soot-2.5.0-2.jar,
 external:/Users/nex/workspace/robovm/compiler/rt/target/classes,
 external:/Users/nex/workspace/robovm/compiler/libimobiledevice/target/classes,
 external:/Users/nex/workspace/robovm/compiler/llvm/target/classes,
 external:/Users/nex/workspace/robovm/compiler/compiler/target/classes,
 external:/Users/nex/workspace/robovm/plugins/templates/templater/target/classes,
 external:/Users/nex/workspace/robovm/plugins/templates/console/target/classes,
 external:/Users/nex/workspace/robovm/plugins/templates/ios-single-view-no-ib//target/classes 

```

Do NOT commit this file to your repo. If you build the Eclipse plugin via `build.sh` or Maven, you'll get all kinds of weird errors, so use this only locally. Also, every time you update the Maven configuration of the Eclipse plugin modules in Eclipse, you'll have to redo these steps.

Once everything is setup, you can run the Eclipse plugin run configuration again. Set a breakpoint in `AppCompiler:346`. Run the Eclipse plugin run configuration and compile a RoboVM project in that second Eclipse instance. The breakpoint will be hit, but the sources won't be displayed correctly. Click the `Edit Source Lookup Path` button, then click `Add`, `Java Project` and select all projects. The source should now show up, and you can even perform code hot swapping!
