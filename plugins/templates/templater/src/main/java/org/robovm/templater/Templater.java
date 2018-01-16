/*
 * Copyright (C) 2015 RoboVM AB.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.templater;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;

/**
 * The RoboVM {@code Templater} generates a new RoboVM project from a template.
 *
 * @author BlueRiver Interactive
 */
public class Templater {
    private static final String PACKAGE_FOLDER_PLACEHOLDER = "__packageInPathFormat__";
    private static final String MAIN_CLASS_FILE_PLACEHOLDER = "__mainClass__";
    private static final String APP_NAME_FILE_PLACEHOLDER = "__appName__";
    private static final Set<String> SUBSTITUTED_PLACEHOLDER_FILES_EXTENSIONS = new HashSet<>(Arrays.asList("xml",
            "java", "kt", "h", "modulemap"));
    private static final String DOLLAR_SYMBOL_PLACEHOLDER = Pattern.quote("${symbol_dollar}");
    private static final String PACKAGE_PLACEHOLDER = Pattern.quote("${package}");
    private static final String MAIN_CLASS_PLACEHOLDER = Pattern.quote("${mainClass}");
    private static final String APP_NAME_PLACEHOLDER = Pattern.quote("${appName}");
    private static final String MAVEN_ARCHETYPE_SET_PLACEHOLDER = "#set\\(.*\\)\n";

    private static final String ROBOVM_PROPERTIES_FILE = "robovm.properties";
    private static final String ROBOVM_PROPERTIES_PACKAGE_PLACEHOLDER = Pattern.quote("${package}");
    private static final String ROBOVM_PROPERTIES_MAIN_CLASS_PLACEHOLDER = Pattern.quote("${mainClass}");
    private static final String ROBOVM_PROPERTIES_APP_NAME_PLACEHOLDER = Pattern.quote("${appName}");

    private static final String ANDROID_MANIFEST_FILE = "AndroidManifest.xml";
    private static final String ANDROID_MANIFEST_PACKAGE_PLACEHOLDER = Pattern.quote("${package}");
    private static final String ANDROID_MANIFEST_MAIN_CLASS_PLACEHOLDER = Pattern.quote("${mainClass}");
    private static final String ANDROID_STRINGS_APP_NAME_PLACEHOLDER = Pattern.quote("${appName}");
    private static final String ANDROID_BUILD_FILE = "build.gradle";
    private static final String ANDROID_SDK_VERSION = Pattern.quote("${androidSdkVersion}");
    private static final String ANDROID_BUILD_TOOLS_VERSION = Pattern.quote("${androidBuildToolsVersion}");
    private static final String ANDROID_STRINGS_FILE = "strings.xml";

    private final String template;
    private final URL templateURL;
    private String mainClass;
    private String mainClassName;
    private String packageName;
    private String packageDirName;
    private String appName;
    private String appId;
    private String executable;
    private String androidSdkVersion = "23";
    private String androidBuildToolsVersion = "\"23.0.1\"";

    /**
     * Creates a new {@code Templater} with the specified {@code template}.
     * 
     * @throws NullPointerException if {@code template == null}.
     * @throws IllegalArgumentException if the specified {@code template} 
     *             doesn't exist.
     */
    public Templater(String template) {
        if (template == null) {
            throw new IllegalArgumentException("No template specified");
        }
        this.template = template;
        templateURL = Templater.class.getResource("/templates/robovm-templates-" + template + ".tar.gz");
        if (templateURL == null) {
            throw new IllegalArgumentException(String.format("Template with name '%s' doesn't exist!", template));
        }
    }

    /**
     * <p>
     * Sets the main class for the generated project. This is the only required
     * parameter. All other parameters will derive from this one if not
     * explicitly specified.
     * </p>
     * 
     * Example: {@code com.company.app.MainClass}
     * 
     * @param mainClass
     * @return
     */
    public Templater mainClass(String mainClass) {
        this.mainClass = mainClass;
        return this;
    }

    /**
     * <p>
     * Sets the package name for the generated project. Will derive from the
     * main class name if not explicitly specified.
     * </p>
     * 
     * Example: {@code com.company.app}
     * 
     * @param packageName
     * @return
     */
    public Templater packageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    /**
     * <p>
     * Sets the app name for the generated project. Will derive from the main
     * class name if not explicitly specified.
     * </p>
     * 
     * Example: {@code MyApp}
     * 
     * @param appName
     * @return
     */
    public Templater appName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * <p>
     * Sets the app id for the generated project. Will derive from the main
     * class name if not explicitly specified.
     * </p>
     * 
     * Example: {@code com.company.app}
     * 
     * @param appId
     * @return
     */
    public Templater appId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * <p>
     * Sets the executable name for the generated project. Will derive from the
     * main class name if not explicitly specified.
     * </p>
     * 
     * Example: {@code MyApp}
     * 
     * @param executable
     * @return
     */
    public Templater executable(String executable) {
        this.executable = executable;
        return this;
    }

    /**
     * <p>
     * Sets the Android SDK version, defaults to 23.
     * </p>
     * @param androidSdkVersion
     * @return
     */
    public Templater androidSdkVersion(String androidSdkVersion) {
        this.androidSdkVersion = androidSdkVersion;
        return this;
    }

    /**
     * <p>
     * Sets the Android build tools version, defaults to 23.0.1.
     * </p>
     * @param androidBuildToolsVersion
     * @return
     */
    public Templater androidBuildToolsVersion(String androidBuildToolsVersion) {
        this.androidBuildToolsVersion = androidBuildToolsVersion;
        return this;
    }

    /**
     * Builds the project and stores it at the specified {@code projectRoot}.
     * You need to have specified at least the main class name for the project
     * to be built.
     * 
     * @param projectRoot
     * 
     * @throws NullPointerException if {@code projectRoot == null}.
     * @throws IllegalArgumentException if no main class had been specified.
     */
    public void buildProject(File projectRoot) {
        if (projectRoot == null) {
            throw new NullPointerException("projectRoot");
        }
        if (mainClass == null) {
            throw new IllegalArgumentException("No main class specified");
        }
        mainClassName = mainClass.substring(mainClass.lastIndexOf('.') + 1);

        if (executable == null || executable.length() == 0) {
            executable = mainClassName;
        }
        if (appName == null || appName.length() == 0) {
            appName = mainClassName;
        }
        if (packageName == null || packageName.length() == 0) {
            int index = mainClass.lastIndexOf('.');
            if (index == -1) {
                packageName = "";
            } else {
                packageName = mainClass.substring(0, index);
            }
        }
        packageDirName = packageName.replace('.', '/');
        if (appId == null || appId.length() == 0) {
            appId = packageName;
            if (appId == null || appId.length() == 0) {
                appId = mainClassName;
            }
        }

        try {
            File targetFile = new File(projectRoot, FilenameUtils.getBaseName(templateURL.getPath()));
            FileUtils.copyURLToFile(templateURL, targetFile);
            extractArchive(targetFile, targetFile.getParentFile());
            targetFile.delete();
        } catch (IOException e) {
            throw new Error(e);
        }
    }

    private void extractArchive(File archive, File destDir) throws IOException {
        TarArchiveInputStream in = null;
        try {
            in = new TarArchiveInputStream(new GZIPInputStream(new FileInputStream(archive)));
            ArchiveEntry entry = null;
            while ((entry = in.getNextEntry()) != null) {
                File f = new File(destDir, substitutePlaceholdersInFileName(entry.getName()));
                if (entry.isDirectory()) {
                    f.mkdirs();
                } else {
                    f.getParentFile().mkdirs();
                    OutputStream out = null;
                    try {
                        out = new FileOutputStream(f);
                        IOUtils.copy(in, out);
                    } finally {
                        IOUtils.closeQuietly(out);
                    }
                    substitutePlaceholdersInFile(f);
                }
            }
        } finally {
            IOUtils.closeQuietly(in);
        }
    }

    private String substitutePlaceholdersInFileName(String fileName) {
        fileName = fileName.replaceAll(PACKAGE_FOLDER_PLACEHOLDER, packageDirName);
        fileName = fileName.replaceAll(MAIN_CLASS_FILE_PLACEHOLDER, mainClassName);
        fileName = fileName.replaceAll(APP_NAME_FILE_PLACEHOLDER, appName);
        return fileName;
    }

    private void substitutePlaceholdersInFile(File file) throws IOException {
        String extension = FilenameUtils.getExtension(file.getName());

        if (ROBOVM_PROPERTIES_FILE.equals(file.getName())) {
            String content = FileUtils.readFileToString(file, "UTF-8");
            content = content.replace("\r", ""); // windows is special...
            // special case for app id
            content = content.replaceAll(Pattern.quote("app.id=${package}"), "app.id=" + appId);
            content = content.replaceAll(ROBOVM_PROPERTIES_APP_NAME_PLACEHOLDER, appName);
            content = content.replaceAll(ROBOVM_PROPERTIES_MAIN_CLASS_PLACEHOLDER, mainClassName);
            String propsPackageName = packageName == null || packageName.length() == 0 ? "" : packageName;
            content = content.replaceAll(ROBOVM_PROPERTIES_PACKAGE_PLACEHOLDER, propsPackageName);
            // need to fix up app.mainclass in case package name was empty
            content = content.replaceAll(Pattern.quote("mainclass=."), "mainclass=");
            FileUtils.writeStringToFile(file, content, "UTF-8");
        } else if (ANDROID_MANIFEST_FILE.equals(file.getName())) {
            String content = FileUtils.readFileToString(file, "UTF-8");
            content = content.replace("\r", ""); // windows is special...
            String propsPackageName = packageName == null || packageName.length() == 0 ? "" : packageName;
            content = content.replaceAll(ANDROID_MANIFEST_PACKAGE_PLACEHOLDER, propsPackageName);
            content = content.replaceAll(ANDROID_MANIFEST_MAIN_CLASS_PLACEHOLDER, mainClassName);
            FileUtils.writeStringToFile(file, content, "UTF-8");
        } else if (ANDROID_STRINGS_FILE.equals(file.getName())) {
            String content = FileUtils.readFileToString(file, "UTF-8");
            content = content.replace("\r", ""); // windows is special...
            content = content.replaceAll(ANDROID_STRINGS_APP_NAME_PLACEHOLDER, appName);
            FileUtils.writeStringToFile(file, content, "UTF-8");
        } else if (ANDROID_BUILD_FILE.equals(file.getName())) {
            String content = FileUtils.readFileToString(file, "UTF-8");
            content = content.replace("\r", ""); // windows is special...
            content = content.replaceAll(ANDROID_SDK_VERSION, androidSdkVersion);
            content = content.replaceAll(ANDROID_BUILD_TOOLS_VERSION, "\"" + androidBuildToolsVersion + "\"");
            String propsPackageName = packageName == null || packageName.length() == 0 ? "" : packageName;
            content = content.replaceAll(ROBOVM_PROPERTIES_PACKAGE_PLACEHOLDER, propsPackageName);
            FileUtils.writeStringToFile(file, content, "UTF-8");
        } else if (SUBSTITUTED_PLACEHOLDER_FILES_EXTENSIONS.contains(extension)) {
            String content = FileUtils.readFileToString(file, "UTF-8");
            content = content.replace("\r", ""); // windows is special...
            content = content.replaceAll(MAVEN_ARCHETYPE_SET_PLACEHOLDER, "");
            content = content.replaceAll(DOLLAR_SYMBOL_PLACEHOLDER, Matcher.quoteReplacement("$"));
            content = content.replaceAll(PACKAGE_PLACEHOLDER, getPackageNameReplacement(extension, packageName));
            content = content.replaceAll(MAIN_CLASS_PLACEHOLDER, mainClassName);
            content = content.replaceAll(APP_NAME_PLACEHOLDER, appName);
            FileUtils.writeStringToFile(file, content, "UTF-8");
        }
    }

    private static String getPackageNameReplacement(String extension, String packageName) {
        if (packageName == null || packageName.length() == 0) {
            return "";
        }
        if(extension.equals("kt")) {
            return String.format("package %s", packageName);
        } if(extension.equals("java"))  {
            return String.format("package %s;", packageName);
        } else {
            return packageName;
        }
    }

    public static void main(String[] args) {
        if (args.length <= 1) {
            printHelpText();
            return;
        }

        String template = null;
        String mainClass = null;
        String packageName = null;
        String appName = null;
        String appId = null;
        String executable = null;
        File projectRoot = null;
        String androidSdkVersion = null;
        String androidBuildToolsVersion = null;

        for (int i = 0; i < args.length; i += 2) {
            if (isOption(args[i])) {
                if (args[i].length() <= 1) {
                    throw new IllegalArgumentException("invalid option: " + args[i]);
                }

                char option = args[i].charAt(1);
                switch (option) {
                case 't': // template
                    template = getOptionValue(args, i);
                    break;
                case 'c': // main class
                    mainClass = getOptionValue(args, i);
                    break;
                case 'p': // package name
                    packageName = getOptionValue(args, i);
                    break;
                case 'n': // app name
                    appName = getOptionValue(args, i);
                    break;
                case 'i': // app id
                    appId = getOptionValue(args, i);
                    break;
                case 'e': // executable name
                    executable = getOptionValue(args, i);
                    break;
                case 'g': // generate
                    projectRoot = new File(getOptionValue(args, i));
                    break;
                case 'a': // android sdk version
                    androidSdkVersion = getOptionValue(args, i);
                    break;
                case 'b': // android build tools version
                    androidBuildToolsVersion = "\"" + getOptionValue(args, i) + "\"";
                default:
                    // ignore
                    break;
                }
            } else {
                printHelpText();
            }
        }

        new Templater(template).mainClass(mainClass).packageName(packageName).appName(appName)
                .appId(appId)
                .executable(executable).buildProject(projectRoot);
        System.out.println("Project created in " + projectRoot.getAbsolutePath());
    }

    private static boolean isOption(String arg) {
        return arg.startsWith("-");
    }

    private static String getOptionValue(String[] args, int option) {
        if (args.length < option + 1) {
            throw new IllegalArgumentException("value missing for option: " + args[option]);
        }
        String value = args[option + 1];
        if (isOption(value)) {
            throw new IllegalArgumentException("illegal value for option: " + args[option]);
        }
        return value;
    }

    private static void printHelpText() {
        System.out.println("RoboVM Templater\n"
                + "Generates a new RoboVM project from a template\n"
                + "Usage: templater\n"
                + "-t <TEMPLATE>                        template (required)\n"
                + "-c <CLASS>                           main class (required)\n"
                + "-p <PACKAGE>                         package name\n"
                + "-n <NAME>                            app name\n"
                + "-i <ID>                              app id\n"
                + "-e <EXECUTABLE>                      executable name\n"
                + "-g <PROJECT_ROOT>                    generates project to project root (required)\n"
                + "-a <ANDROID_SDK_VERSION>             Android SDK version, default 23 (optional)\n"
                + "-b <ANDROID_BUILD_TOOLS_VERSION>     Android build tools version, default 23.0.1 (optional)\n");
    }
}
