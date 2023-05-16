/*
 * Copyright (C) 2013 RoboVM AB
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/gpl-2.0.html>.
 */
package org.robovm.compiler.config;

import static org.junit.Assert.*;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.robovm.compiler.config.Config.Builder;
import org.robovm.compiler.config.Config.Home;
import org.robovm.compiler.config.Config.Lib;
import org.robovm.compiler.target.ConsoleTarget;
import org.robovm.compiler.target.ios.IOSTarget;
import org.zeroturnaround.zip.ZipUtil;

/**
 * Tests {@link Config}.
 */
public class ConfigTest {
    String savedUserDir;
    File tmp;
    File wd;
    Home fakeHome;
    
    @Before
    public void setUp() throws Exception {
        savedUserDir = System.getProperty("user.dir");
        tmp = new File("/tmp");
        wd = new File(tmp, "wd");
        System.setProperty("user.dir", wd.getAbsolutePath());
        
        fakeHome = new FakeHome();
    }
    
    @After
    public void tearDown() {
        System.setProperty("user.dir", savedUserDir);
    }
    
    @Test
    public void testReadConsole() throws Exception {
        Config.Builder builder = new Config.Builder();
        builder.read(new InputStreamReader(getClass().getResourceAsStream("ConfigTest.console.xml"), "utf-8"), wd);
        Config config = builder.config;
        assertEquals(Arrays.asList(new File(wd, "foo1.jar"), new File(tmp, "foo2.jar")), config.getClasspath());
        assertEquals(Arrays.asList("Foundation", "AppKit"), config.getFrameworks());
        assertEquals(Arrays.asList(
                new Config.Lib("dl", true),
                new Config.Lib("/tmp/wd/libs/libmy.a", true),
                new Config.Lib("/tmp/wd/libs/foo.o", true),
                new Config.Lib("/usr/lib/libbar.a", false)
                ), config.getLibs());
        assertEquals(Arrays.asList(
                new Resource(new File(wd, "resources")), 
                new Resource(new File("/usr/share/resources")),
                new Resource(null, null).include("data/**/*"),
                new Resource(null, null).include("videos/**/*.avi"),
                new Resource(new File(wd, "resources"), "data")
                    .include("**/*.png")
                    .exclude("**/foo.png")
                    .flatten(true)
                ), config.getResources());
        assertEquals(Arrays.asList("javax.**.*"), config.getForceLinkClasses());
        assertEquals(OS.macosx, config.getOs());
        assertEquals(2, config.getArchs().size());
        assertEquals(Arch.x86_64, config.getArchs().get(0));
        assertEquals(Arch.arm64, config.getArchs().get(1));
    }
    
    @Test
    public void testReadOldConsole() throws Exception {
        Config.Builder builder = new Config.Builder();
        builder.read(new InputStreamReader(getClass().getResourceAsStream("ConfigTest.old.console.xml"), "utf-8"), wd);
        Config config = builder.config;
        assertEquals(Arrays.asList(new File(wd, "foo1.jar"), new File(tmp, "foo2.jar")), config.getClasspath());
        assertEquals(Arrays.asList("Foundation", "AppKit"), config.getFrameworks());
        assertEquals(Arrays.asList(
                new Config.Lib("dl", true),
                new Config.Lib("/tmp/wd/libs/libmy.a", true),
                new Config.Lib("/tmp/wd/libs/foo.o", true),
                new Config.Lib("/usr/lib/libbar.a", false)
                ), config.getLibs());
        assertEquals(Arrays.asList(new Resource(new File("/tmp/wd/resources")), 
                new Resource(new File("/usr/share/resources"))),
                config.getResources());
        assertEquals(Arrays.asList("javax.**.*"), config.getForceLinkClasses());
        assertEquals(OS.macosx, config.getOs());
        assertEquals(1, config.getArchs().size());
        assertEquals(Arch.x86_64, config.getArchs().get(0));
    }
    
    @Test
    public void testWriteConsole() throws Exception {
        Config.Builder builder = new Config.Builder();
        builder.addClasspathEntry(new File("foo1.jar"));
        builder.addClasspathEntry(new File(tmp, "foo2.jar"));
        builder.addFramework("Foundation");
        builder.addFramework("AppKit");
        builder.addLib(new Config.Lib("dl", true));
        builder.addLib(new Config.Lib("libs/libmy.a", true));
        builder.addLib(new Config.Lib("libs/foo.o", true));
        builder.addLib(new Config.Lib("/usr/lib/libbar.a", false));
        builder.addResource(new Resource(new File("/tmp/wd/resources")));
        builder.addResource(new Resource(new File("/usr/share/resources")));
        builder.addResource(new Resource(new File("/tmp/wd"), null).include("data/**/*"));
        builder.addResource(new Resource(null, null).include("videos/**/*.avi"));
        builder.addResource(
                new Resource(new File("/tmp/wd/resources"), "data")
                    .include("**/*.png")
                    .exclude("**/foo.png")
                    .flatten(true));
        builder.addForceLinkClass("javax.**.*");
        builder.os(OS.macosx);
        builder.archs(Arch.x86_64, Arch.arm64);
        
        StringWriter out = new StringWriter();
        builder.write(out, wd);
        assertEquals(IOUtils.toString(getClass().getResourceAsStream("ConfigTest.console.xml")), out.toString());
    }

    @Test
    public void testReadIOS() throws Exception {
        Config.Builder builder = new Config.Builder();
        builder.read(new InputStreamReader(getClass().getResourceAsStream("ConfigTest.ios.xml"), "utf-8"), wd);
        Config config = builder.config;
        assertEquals("6.1", config.getIosSdkVersion());
        assertEquals(new File(wd, "Info.plist"), config.getIosInfoPList().getFile());
        assertEquals(new File(wd, "entitlements.plist"), config.getIosEntitlementsPList());        
    }
    
    @Test
    public void testWriteIOS() throws Exception {
        Config.Builder builder = new Config.Builder();
        builder.iosSdkVersion("6.1");
        builder.iosInfoPList(new File("Info.plist"));
        builder.iosEntitlementsPList(new File("entitlements.plist"));        
        builder.targetType(IOSTarget.TYPE);
        
        StringWriter out = new StringWriter();
        builder.write(out, wd);
        assertEquals(IOUtils.toString(getClass().getResourceAsStream("ConfigTest.ios.xml")), out.toString());
    }

    @Test
    public void testVariantFiltering() throws Exception {
        // three different target of same ARM64
        Config.Builder builder = new Config.Builder();
        builder.home(fakeHome);
        builder.targetType(ConsoleTarget.TYPE);
        builder.mainClass("Main");
        builder.addClasspathEntry(new File("foo1.jar"));
        Config.Lib lib1 = new Config.Lib("ios_arm64", true, new OS[]{OS.ios},
                new PlatformVariant[]{PlatformVariant.device}, new Arch[]{Arch.arm64} );
        Config.Lib lib2 = new Config.Lib("iossim_arm64", true, new OS[]{OS.ios},
                new PlatformVariant[]{PlatformVariant.simulator}, new Arch[]{Arch.arm64.copy(Environment.Simulator)} );
        Config.Lib lib3 = new Config.Lib("mac_arm64", true, new OS[]{OS.macosx},
                new PlatformVariant[]{PlatformVariant.device}, new Arch[]{Arch.arm64} );
        builder.addLib(lib1);
        builder.addLib(lib2);
        builder.addLib(lib3);

        // case 1
        builder.os(OS.ios);
        builder.archs(Arch.arm64);
        Config config = builder.build();
        assertEquals(Collections.singletonList(lib1), config.getLibs());

        // case 2
        builder.os(OS.ios);
        builder.archs(Arch.arm64.copy(Environment.Simulator));
        config = builder.build();
        assertEquals(Collections.singletonList(lib2), config.getLibs());

        // case 3
        builder.os(OS.macosx);
        builder.archs(Arch.arm64);
        config = builder.build();
        assertEquals(Collections.singletonList(lib3), config.getLibs());
    }

    private File createMergeConfig(File tmpDir, String dir, String id, OS os, Arch arch, boolean jar) throws Exception {
        File p = new File(tmpDir, dir);
        for (OS os2 : OS.values()) {
            for (Arch arch2 : Arch.supported(os2)) {
                File root = new File(p, "META-INF/robovm/" + os2 + "/" + arch2);
                root.mkdirs();
                if (!new File(root, "robovm.xml").exists()) {
                    new Config.Builder().write(new File(root, "robovm.xml"));
                }
            }
        }

        File root = new File(p, "META-INF/robovm/" + os + "/" + arch);
        new Config.Builder()
            .addExportedSymbol(id.toUpperCase() + "*")
            .addForceLinkClass("com." + id.toLowerCase() + ".**")
            .addFrameworkPath(new File(root, id.toLowerCase() + "/bar"))
            .addFramework(id)
            .addLib(new Lib(id.toLowerCase(), true))
            .addLib(new Lib(new File(root, "lib" + id.toLowerCase() + ".a").getAbsolutePath(), true))
            .addResource(new Resource(new File(root, "resources")))
            .addWeakFramework("Weak" + id)
            .write(new File(root, "robovm.xml"));

        if (jar) {
            File jarFile = new File(tmpDir, p.getName() + ".jar");
            ZipUtil.pack(p, jarFile);
            FileUtils.deleteDirectory(p);
            return jarFile;
        } else {
            return p;
        }
    }
    
    private File createTempDir() throws IOException {
        final File tmp = File.createTempFile(getClass().getName(), ".tmp");
        tmp.delete();
        FileUtils.deleteDirectory(tmp);
        tmp.mkdirs();
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                try {
                    FileUtils.deleteDirectory(tmp);
                } catch (IOException e) {
                }
            }
        });
        return tmp;
    }
    
    @Test
    public void testMergeConfigsFromClasspath() throws Exception {
        File tmpDir = createTempDir();
        File cacheDir = new File(tmpDir, "cache");
        File p1 = createMergeConfig(tmpDir, "p1", "Foo", OS.macosx, Arch.arm64, false);
        File p2 = createMergeConfig(tmpDir, "p2", "Wooz", OS.linux, Arch.x86_64, false);
        // Create a jar file with both arm64 and x86_64 by first creating a folder for x86 in p3/
        // and then passing p3/ again but this time compress it to a jar.
                  createMergeConfig(tmpDir, "p3", "Baaz", OS.macosx, Arch.arm64, false);
        File p3 = createMergeConfig(tmpDir, "p3", "Raaz", OS.macosx, Arch.x86_64, true);
        
        Config.Builder builder = new Config.Builder();
        builder.cacheDir(cacheDir);
        builder.os(OS.macosx);
        builder.arch(Arch.arm64);
        builder.targetType(ConsoleTarget.TYPE);
        builder.mainClass("Main");
        builder.addClasspathEntry(p1);
        builder.addClasspathEntry(p2);
        builder.addClasspathEntry(p3);
        builder.addExportedSymbol("YADA*");
        builder.addFrameworkPath(new File(p1, "yada"));
        builder.addFramework("Yada");
        builder.addForceLinkClass("org.yada.**");
        builder.addLib(new Lib("yada", true));
        builder.addResource(new Resource(new File(p1, "resources")));
        builder.addWeakFramework("WeakYada");
        builder.home(fakeHome);
        Config config = builder.build();

        File p1XArm64Root = new File(p1, "META-INF/robovm/macosx/arm64");
        File p3XArm64Cache = config.getCacheDir(config.getClazzes().getClasspathPaths().get(2));
        File p3XArm64Root = new File(p3XArm64Cache.getParentFile(), p3XArm64Cache.getName() + ".extracted/META-INF/robovm/macosx/arm64");

        assertEquals(Arrays.asList("FOO*", "BAAZ*", "YADA*"), config.getExportedSymbols());
        assertEquals(Arrays.asList("com.foo.**", "com.baaz.**", "org.yada.**"), config.getForceLinkClasses());
        assertEquals(Arrays.asList(
                new File(p1XArm64Root, "foo/bar"),
                new File(p3XArm64Root, "baaz/bar"),
                new File(p1, "yada")), 
                config.getFrameworkPaths());
        assertEquals(Arrays.asList("Foo", "Baaz", "Yada"), config.getFrameworks());
        assertEquals(Arrays.asList(
                new Lib("foo", true), 
                new Lib(new File(p1XArm64Root, "libfoo.a").getAbsolutePath(), true),
                new Lib("baaz", true), 
                new Lib(new File(p3XArm64Root, "libbaaz.a").getAbsolutePath(), true),
                new Lib("yada", true)), 
                config.getLibs());
        assertEquals(Arrays.asList(
                new Resource(new File(p1XArm64Root, "resources")),
                new Resource(new File(p3XArm64Root, "resources")),
                new Resource(new File(p1, "resources"))), 
                config.getResources());
        assertEquals(Arrays.asList("WeakFoo", "WeakBaaz", "WeakYada"), config.getWeakFrameworks());
        
        // Make sure builder() returns a config which merges in x86_64 configs instead
        config = config.builder().arch(Arch.x86_64).build();
        
        File p3X86_64Cache = config.getCacheDir(config.getClazzes().getClasspathPaths().get(2));
        File p3X86_64Root = new File(p3X86_64Cache.getParentFile(), p3X86_64Cache.getName() + ".extracted/META-INF/robovm/macosx/x86_64");
        
        assertEquals(Arrays.asList("RAAZ*", "YADA*"), config.getExportedSymbols());
        assertEquals(Arrays.asList("com.raaz.**", "org.yada.**"), config.getForceLinkClasses());
        assertEquals(Arrays.asList(
                new File(p3X86_64Root, "raaz/bar"), 
                new File(p1, "yada")), 
                config.getFrameworkPaths());
        assertEquals(Arrays.asList("Raaz", "Yada"), config.getFrameworks());
        assertEquals(Arrays.asList(
                new Lib("raaz", true), 
                new Lib(new File(p3X86_64Root, "libraaz.a").getAbsolutePath(), true), 
                new Lib("yada", true)), 
                config.getLibs());
        assertEquals(Arrays.asList(
                new Resource(new File(p3X86_64Root, "resources")), 
                new Resource(new File(p1, "resources"))), 
                config.getResources());
        assertEquals(Arrays.asList("WeakRaaz", "WeakYada"), config.getWeakFrameworks());
    }

    @Test
    public void testCreateBuilderFromConfig() throws Exception {
        File tmpDir = createTempDir();
        File cacheDir = new File(tmpDir, "cache");
        
        Config.Builder builder = new Config.Builder();
        builder.tmpDir(tmpDir);
        builder.cacheDir(cacheDir);
        builder.os(OS.macosx);
        builder.arch(Arch.arm64);
        builder.targetType(ConsoleTarget.TYPE);
        builder.mainClass("Main");
        builder.addBootClasspathEntry(new File(tmpDir, "bcp1"));
        builder.addBootClasspathEntry(new File(tmpDir, "bcp2"));
        builder.addBootClasspathEntry(new File(tmpDir, "bcp3"));
        builder.addClasspathEntry(new File(tmpDir, "cp1"));
        builder.addClasspathEntry(new File(tmpDir, "cp2"));
        builder.addClasspathEntry(new File(tmpDir, "cp3"));
        builder.addExportedSymbol("YADA*");
        builder.addFrameworkPath(new File(tmpDir, "yada"));
        builder.addFramework("Yada");
        builder.addForceLinkClass("org.yada.**");
        builder.addLib(new Lib("yada", true));
        builder.addResource(new Resource(new File(tmpDir, "resources")));
        builder.addWeakFramework("WeakYada");
        builder.addPluginArgument("foo:bar=yada");
        builder.home(fakeHome);

        Config config = builder.build();
        
        Builder builder2 = config.builder();
        builder2.arch(Arch.arm64);
        Config config2 = builder2.build();
        
        assertNotSame(config, config2);
        assertEquals(config.getTmpDir(), config2.getTmpDir());
        assertEquals(config.getCacheDir().getParentFile().getParentFile(), 
                config2.getCacheDir().getParentFile().getParentFile());
        assertEquals(config.getOs(), config2.getOs());
        assertEquals(config.getMainClass(), config2.getMainClass());
        assertEquals(config.getBootclasspath(), config2.getBootclasspath());
        assertNotSame(config.getBootclasspath(), config2.getBootclasspath());
        assertEquals(config.getClasspath(), config2.getClasspath());
        assertNotSame(config.getClasspath(), config2.getClasspath());
        assertEquals(config.getExportedSymbols(), config2.getExportedSymbols());
        assertNotSame(config.getExportedSymbols(), config2.getExportedSymbols());
        assertEquals(config.getFrameworkPaths(), config2.getFrameworkPaths());
        assertNotSame(config.getFrameworkPaths(), config2.getFrameworkPaths());
        assertEquals(config.getFrameworks(), config2.getFrameworks());
        assertNotSame(config.getFrameworks(), config2.getFrameworks());
        assertEquals(config.getForceLinkClasses(), config2.getForceLinkClasses());
        assertNotSame(config.getForceLinkClasses(), config2.getForceLinkClasses());
        assertEquals(config.getLibs(), config2.getLibs());
        assertNotSame(config.getLibs(), config2.getLibs());
        assertEquals(config.getResources(), config2.getResources());
        assertNotSame(config.getResources(), config2.getResources());
        assertEquals(config.getPluginArguments(), config2.getPluginArguments());
        assertNotSame(config.getPluginArguments(), config2.getPluginArguments());
        
        assertEquals(Arch.arm64, config2.getArch());
        
        assertFalse(config.getPlugins().equals(config2.getPlugins()));
        assertNotSame(config.getTarget(), config2.getTarget());
        assertNotSame(config.getClazzes(), config2.getClazzes());
    }

    @Test
    public void testGetFileName() throws Exception {
        assertEquals("201a6b3053cc1422d2c3670b62616221d2290929.class.o", Config.getFileName("Foo", "class.o", 0));
        assertEquals("201a6b3053cc1422d2c3670b62616221d2290929.class.o", Config.getFileName("Foo", "class.o", 1));
        assertEquals("201a6b3053cc1422d2c3670b62616221d2290929.class.o", Config.getFileName("Foo", "class.o", 10));
        assertEquals("Foo.class.o", Config.getFileName("Foo", "class.o", 11));

        assertEquals("com/example/201a6b3053cc1422d2c3670b62616221d2290929.class.o",
                Config.getFileName("com/example/Foo", "class.o", 0));
        assertEquals("com/example/201a6b3053cc1422d2c3670b62616221d2290929.class.o",
                Config.getFileName("com/example/Foo", "class.o", 1));
        assertEquals("com/example/201a6b3053cc1422d2c3670b62616221d2290929.class.o",
                Config.getFileName("com/example/Foo", "class.o", 10));
        assertEquals("com/example/Foo.class.o", Config.getFileName("com/example/Foo", "class.o", 11));

        assertEquals("com/example/AB9ca44297c0e0d22df654119dce73ee52d3d51c71.class.o",
                Config.getFileName("com/example/ABCDEFGIHJABCDEFGIHJABCDEFGIHJABCDEFGIHJABCDEFGIHJ", "class.o", 50));
    }

    @Test
    public void testSwiftSupportEnabledByDefault() throws Exception {
        String configText = "<config>\n" +
                "  <target>ios</target>\n" +
                "</config>";
        Config.Builder builder = new Config.Builder();

        builder.read(new StringReader(configText), wd);
        Config config = builder.config;

        assertTrue(config.hasSwiftSupport());
        assertNotNull(config.getSwiftSupport());
        assertTrue(config.getSwiftSupport().isEnabled());
        assertTrue(config.getSwiftSupport().shouldCopySwiftLibs());
    }

    @Test
    public void testSwiftSupportCanBeDisabled() throws Exception {
        String configText = "<config>\n" +
                "  <swiftSupport>\n" +
                "    <enable>false</enable>\n" +
                "  </swiftSupport>\n" +
                "</config>";
        Config.Builder builder = new Config.Builder();
        builder.read(new StringReader(configText), wd);
        Config config = builder.config;
        assertFalse(config.hasSwiftSupport());
        assertNull(config.getSwiftSupport());
    }


    @Test
    public void testXCFrameworkLookupResolved() throws Exception {
        // testing simple xcframework expansion
        // path should be expanded with simulator platform
        File testDir = createTempDir();
        File tmpDir = new File(testDir, "tmp");
        File workingDirectory = new File(tmpDir, "wd");
        File frameworkLocation = new File(workingDirectory, "Frameworks");
        Config.Builder builder = new Config.Builder();
        builder.tmpDir(tmpDir);
        builder.os(OS.ios);
        builder.arch(new Arch(CpuArch.arm64, Environment.Simulator));
        builder.targetType(IOSTarget.TYPE);
        builder.mainClass("Main");
        builder.addFrameworkPath(frameworkLocation);
        builder.addFramework("candidate");
        builder.home(fakeHome);
        builder.addClasspathEntry(new File(tmpDir, "cp1"));
        Config config = builder.build();

        File xcFramework = new File(frameworkLocation, "candidate.xcframework");
        xcFramework.mkdirs();
        byte[] data = IOUtils.toByteArray(getClass().getResourceAsStream("ConfigTest.xcframework.plist.xml"));
        FileUtils.writeByteArrayToFile(new File(xcFramework, "Info.plist"), data);

        assertEquals(
                Arrays.asList(frameworkLocation, new File(xcFramework, "ios-arm64-simulator/")),
                config.getFrameworkPaths());
        assertEquals(Collections.singletonList("library3"), config.getFrameworks());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testXCFrameworkLookupFailedIfNoMatchingLib() throws Exception {
        // when existing arch/os combination is not found in xcframework -- throw an exception
        File testDir = createTempDir();
        File tmpDir = new File(testDir, "tmp");
        File workingDirectory = new File(tmpDir, "wd");
        File frameworkLocation = new File(workingDirectory, "Frameworks");
        Config.Builder builder = new Config.Builder();
        builder.tmpDir(tmpDir);
        builder.os(OS.macosx);
        builder.arch(new Arch(CpuArch.arm64, Environment.Native));
        builder.targetType(ConsoleTarget.TYPE);
        builder.mainClass("Main");
        builder.addFrameworkPath(frameworkLocation);
        builder.addFramework("candidate");
        builder.home(fakeHome);
        builder.addClasspathEntry(new File(tmpDir, "cp1"));
        Config config = builder.build();

        File xcFramework = new File(frameworkLocation, "candidate.xcframework");
        xcFramework.mkdirs();
        byte[] data = IOUtils.toByteArray(getClass().getResourceAsStream("ConfigTest.xcframework.plist.xml"));
        FileUtils.writeByteArrayToFile(new File(xcFramework, "Info.plist"), data);

        config.getFrameworkPaths(); // exception here
    }

    @Test(expected = IllegalArgumentException.class)
    public void testXCFrameworkLookupFailedIfContainsMultipleMatchingLibs() throws Exception {
        // when xcframework contains two frameworks matching same os/arch it should fail with exception
        // it should be ignored as invalid
        File testDir = createTempDir();
        File tmpDir = new File(testDir, "tmp");
        File workingDirectory = new File(tmpDir, "wd");
        File frameworkLocation = new File(workingDirectory, "Frameworks");
        Config.Builder builder = new Config.Builder();
        builder.tmpDir(tmpDir);
        builder.os(OS.ios);
        builder.arch(new Arch(CpuArch.arm64, Environment.Native));
        builder.targetType(IOSTarget.TYPE);
        builder.mainClass("Main");
        builder.addFrameworkPath(frameworkLocation);
        builder.addFramework("candidate");
        builder.home(fakeHome);
        builder.addClasspathEntry(new File(tmpDir, "cp1"));
        Config config = builder.build();

        File xcFramework = new File(frameworkLocation, "candidate.xcframework");
        xcFramework.mkdirs();
        byte[] data = IOUtils.toByteArray(getClass().getResourceAsStream("ConfigTest.xcframework.plist.xml"));
        FileUtils.writeByteArrayToFile(new File(xcFramework, "Info.plist"), data);

        config.getFrameworkPaths(); // exception here
    }

    @Test
    public void testXCFrameworkLookupResolvedIntoStaticLib() throws Exception {
        // when xcframework contains static lib
        File testDir = createTempDir();
        File tmpDir = new File(testDir, "tmp");
        File workingDirectory = new File(tmpDir, "wd");
        File frameworkLocation = new File(workingDirectory, "Frameworks");
        Config.Builder builder = new Config.Builder();
        builder.tmpDir(tmpDir);
        builder.os(OS.ios);
        builder.arch(new Arch(CpuArch.x86_64, Environment.Simulator));
        builder.targetType(IOSTarget.TYPE);
        builder.mainClass("Main");
        builder.addFrameworkPath(frameworkLocation);
        builder.addFramework("candidate");
        builder.home(fakeHome);
        builder.addClasspathEntry(new File(tmpDir, "cp1"));
        Config config = builder.build();

        File xcFramework = new File(frameworkLocation, "candidate.xcframework");
        xcFramework.mkdirs();
        byte[] data = IOUtils.toByteArray(getClass().getResourceAsStream("ConfigTest.xcframework.plist.xml"));
        FileUtils.writeByteArrayToFile(new File(xcFramework, "Info.plist"), data);

        assertEquals(Collections.singletonList(frameworkLocation), config.getFrameworkPaths());
        assertEquals(Collections.emptyList(), config.getFrameworks());
        assertEquals(Arrays.asList(
                new Lib(new File(xcFramework, "ios-x86_64-simulator/library-static3.a").getAbsolutePath(), false)),
                config.getLibs());
    }

    @Test
    public void testXCFrameworkResolved() throws Exception {
        // test that stand-alon <xcframeworks><path> parameter is resolved into static lib
        File testDir = createTempDir();
        File tmpDir = new File(testDir, "tmp");
        File workingDirectory = new File(tmpDir, "wd");
        File frameworkLocation = new File(workingDirectory, "Frameworks");
        File xcFramework = new File(frameworkLocation, "candidate.xcframework");
        Config.Builder builder = new Config.Builder();
        builder.tmpDir(tmpDir);
        builder.os(OS.ios);
        builder.arch(new Arch(CpuArch.x86_64, Environment.Simulator));
        builder.targetType(IOSTarget.TYPE);
        builder.mainClass("Main");
        builder.addFrameworkPath(frameworkLocation);
        builder.addXCFramework(xcFramework);
        builder.home(fakeHome);
        builder.addClasspathEntry(new File(tmpDir, "cp1"));
        Config config = builder.build();

        xcFramework.mkdirs();
        byte[] data = IOUtils.toByteArray(getClass().getResourceAsStream("ConfigTest.xcframework.plist.xml"));
        FileUtils.writeByteArrayToFile(new File(xcFramework, "Info.plist"), data);

        assertEquals(Collections.singletonList(frameworkLocation), config.getFrameworkPaths());
        assertEquals(Collections.emptyList(), config.getFrameworks());
        assertEquals(Arrays.asList(
                        new Lib(new File(xcFramework, "ios-x86_64-simulator/library-static3.a").getAbsolutePath(), false)),
                config.getLibs());
    }

    @Test
    public void testXCFrameworkLookupCanBeDisabled() throws Exception {
        // testing that xcFrameworks can be disabled by config settings
        File testDir = createTempDir();
        File tmpDir = new File(testDir, "tmp");
        File workingDirectory = new File(tmpDir, "wd");
        File frameworkLocation = new File(workingDirectory, "Frameworks");

        String configText = "<config>\n" +
                "  <experimental>\n" +
                "    <xcFrameworkLookup>false</xcFrameworkLookup>\n" +
                "  </experimental>\n" +
                "</config>";
        Config.Builder builder = new Config.Builder();
        builder.read(new StringReader(configText), wd);
        builder.tmpDir(tmpDir);
        builder.os(OS.ios);
        builder.arch(new Arch(CpuArch.arm64, Environment.Simulator));
        builder.targetType(IOSTarget.TYPE);
        builder.mainClass("Main");
        builder.addFrameworkPath(frameworkLocation);
        builder.addFramework("candidate");
        builder.home(fakeHome);
        builder.addClasspathEntry(new File(tmpDir, "cp1"));
        Config config = builder.build();

        File xcFramework = new File(frameworkLocation, "candidate.xcframework");
        xcFramework.mkdirs();
        byte[] data = IOUtils.toByteArray(getClass().getResourceAsStream("ConfigTest.xcframework.plist.xml"));
        FileUtils.writeByteArrayToFile(new File(xcFramework, "Info.plist"), data);

        assertEquals(
                Collections.singletonList(frameworkLocation),
                config.getFrameworkPaths());
        assertEquals(Collections.singletonList("candidate"), config.getFrameworks());
    }


    @Test
    public void testFrameworkLookupCanBeQualified() throws Exception {
        // testing whether <frameworks>/<weakFrameworks>/<xcFrameworks>/<frameworkPaths> can be
        // qualified (by arch in this test)
        File testDir = createTempDir();
        File tmpDir = new File(testDir, "tmp");
        File workingDirectory = new File(testDir, "wd");
        String configText = "\n" +
                "<config>\n" +
                "  <frameworks>\n" +
                "     <framework arch=\"x86_64\">x86_64_framework</framework>\n" +
                "     <framework>uni_framework</framework>\n" +
                "     <framework arch=\"thumbv7\">thumbv7</framework>\n" +
                "  </frameworks>\n" +
                "  <weakFrameworks>\n" +
                "     <framework arch=\"arm64\">arm64_weakframework</framework>\n" +
                "     <framework>uni_weakframework</framework>\n" +
                "  </weakFrameworks>\n" +
                "  <xcFrameworks>\n" +
                "     <path arch=\"x86_64,thumbv7\">thumbv7.xcframework</path>\n" +
                "  </xcFrameworks>\n" +
                "</config>";
        // drop xcframework there
        File xcFramework = new File(workingDirectory, "thumbv7.xcframework");
        xcFramework.mkdirs();
        byte[] data = IOUtils.toByteArray(getClass().getResourceAsStream("ConfigTest.xcframework.plist.xml"));
        FileUtils.writeByteArrayToFile(new File(xcFramework, "Info.plist"), data);

        // test
        Config.Builder builder = new Config.Builder();
        builder.read(new StringReader(configText), workingDirectory);
        builder.tmpDir(tmpDir);
        builder.os(OS.ios);
        builder.targetType(IOSTarget.TYPE);
        builder.iosSkipSigning(true);
        builder.skipLinking(true);
        builder.mainClass("Main");
        builder.home(fakeHome);
        builder.addClasspathEntry(new File(tmpDir, "cp1"));

        // arm64
        builder.arch(new Arch(CpuArch.arm64, Environment.Native));
        Config config = builder.build();
        assertEquals(Collections.singletonList("uni_framework"), config.getFrameworks());
        assertEquals(Arrays.asList("arm64_weakframework", "uni_weakframework"), config.getWeakFrameworks());
        assertEquals(Collections.emptyList(), config.getFrameworkPaths());

        // x86_64
        builder.arch(new Arch(CpuArch.x86_64, Environment.Simulator));
        config = builder.build();
        assertEquals(Arrays.asList("x86_64_framework", "uni_framework"), config.getFrameworks());
        assertEquals(Collections.singletonList("uni_weakframework"), config.getWeakFrameworks());
        assertEquals(Collections.emptyList(), config.getFrameworkPaths());

        // thumbv7
        builder.arch(new Arch(CpuArch.thumbv7));
        config = builder.build();
        assertEquals(Arrays.asList("uni_framework", "thumbv7", "library1"), config.getFrameworks());
        assertEquals(Collections.singletonList("uni_weakframework"), config.getWeakFrameworks());
        assertEquals(Collections.singletonList(new File(xcFramework, "/ios-arm64_armv7")), config.getFrameworkPaths());
    }



}
