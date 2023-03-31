/*
 * Copyright (C) 2012 RoboVM AB
 * Copyright (C) 2018 Daniel Thommes, NeverNull GmbH, <daniel.thommes@nevernull.io>
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
package org.robovm.compiler.util;

import org.apache.commons.exec.ExecuteException;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.robovm.compiler.config.Config;
import org.robovm.compiler.config.OS;
import org.robovm.compiler.config.tools.ActoolOptions;
import org.robovm.compiler.config.tools.TextureAtlas;
import org.robovm.compiler.log.ConsoleLogger;
import org.robovm.compiler.log.Logger;
import org.robovm.compiler.target.ios.IOSTarget;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author niklas
 *
 */
public class ToolchainUtil {
    private static String IOS_DEV_CLANG;
    private static String IOS_SIM_CLANG;
    private static String PNGCRUSH;
    private static String PLUTIL;
    private static String LIPO;
    private static String BITCODE_STRIP;
    private static String PACKAGE_APPLICATION;
    private static String TEXTUREATLAS;
    private static String ACTOOL;
    private static String IBTOOL;
    private static String NM;
    private static String OTOOL;
    private static String FILE;
    private static String DSYMUTIL;
    private static String SYMBOLS;

    private static String getIOSDevClang() throws IOException {
        if (IOS_DEV_CLANG == null) {
            IOS_DEV_CLANG = findXcodeCommand("clang++", "iphoneos");
        }
        return IOS_DEV_CLANG;
    }

    private static String getIOSSimClang() throws IOException {
        if (IOS_SIM_CLANG == null) {
            IOS_SIM_CLANG = findXcodeCommand("clang++", "iphonesimulator");
        }
        return IOS_SIM_CLANG;
    }

    private static String getPngCrush() throws IOException {
        if (PNGCRUSH == null) {
            PNGCRUSH = findXcodeCommand("pngcrush", "iphoneos");
        }
        return PNGCRUSH;
    }

    private static String getTextureAtlas() throws IOException {
        if (TEXTUREATLAS == null) {
            TEXTUREATLAS = findXcodeCommand("TextureAtlas", "iphoneos");
        }
        return TEXTUREATLAS;
    }

    private static String getACTool() throws IOException {
        if (ACTOOL == null) {
            ACTOOL = findXcodeCommand("actool", "iphoneos");
        }
        return ACTOOL;
    }

    private static String getIBTool() throws IOException {
        if (IBTOOL == null) {
            IBTOOL = findXcodeCommand("ibtool", "iphoneos");
        }
        return IBTOOL;
    }

    private static String getPlutil() throws IOException {
        if (PLUTIL == null) {
            PLUTIL = findXcodeCommand("plutil", "iphoneos");
        }
        return PLUTIL;
    }

    private static String getLipo() throws IOException {
        if (LIPO == null) {
            LIPO = findXcodeCommand("lipo", "iphoneos");
        }
        return LIPO;
    }

    private static String getBitcodeStrip() throws IOException {
        if (BITCODE_STRIP == null) {
            BITCODE_STRIP = findXcodeCommand("bitcode_strip", "iphoneos");
        }
        return BITCODE_STRIP;
    }

    private static String getNm() throws IOException {
        if (NM == null) {
            NM = findXcodeCommand("nm", "iphoneos");
        }
        return NM;
    }
    
    private static String getOtool() throws IOException {
        if(OTOOL == null) {
            OTOOL = findXcodeCommand("otool", "iphoneos");
        }
        return OTOOL;
    }
    
    private static String getFile() throws IOException {
        if (FILE == null) {
            FILE = findXcodeCommand("file", "iphoneos");
        }
        return FILE;
    }

    private static String getPackageApplication() throws IOException {
        if (PACKAGE_APPLICATION == null) {
            PACKAGE_APPLICATION = findXcodeCommand("PackageApplication", "iphoneos");
        }
        return PACKAGE_APPLICATION;
    }

    private static String getDsymutil() throws IOException {
        if (DSYMUTIL == null) {
            DSYMUTIL = findXcodeCommand("dsymutil", "iphoneos");
        }
        return DSYMUTIL;
    }

    private static String getSymbols() throws IOException {
        if (SYMBOLS == null) {
            SYMBOLS = findXcodeCommand("symbols", "iphoneos");
        }
        return SYMBOLS;
    }

    private static void handleExecuteException(ExecuteException e) {
        if (e.getExitValue() == 2) {
            throw new IllegalArgumentException("No Xcode is selected. Is Xcode installed? "
                    + "If yes, use 'sudo xcode-select -switch <path-to-xcode>' from a Terminal "
                    + "to switch to the correct Xcode path.");
        }
        if (e.getExitValue() == 69) {
            throw new IllegalArgumentException("You must agree to the Xcode/iOS license. "
                    + "Please open Xcode once or run 'sudo xcrun clang' from a Terminal to agree to the terms.");
        }
        throw new IllegalArgumentException(e.getMessage());
    }

    public static String findXcodePath() throws IOException {
        try {
            String path = new Executor(Logger.NULL_LOGGER, "xcode-select").args("--print-path").execCapture();
            File f = new File(path);
            if (f.exists() && f.isDirectory()) {
                if (new File(f, "Platforms").exists() && new File(f, "Toolchains").exists()) {
                    return path;
                }
            }
            throw new IllegalArgumentException(String.format(
                    "The path '%s' does not appear to be a valid Xcode path. Use "
                            + "'sudo xcode-select -switch <path-to-xcode>' from a Terminal "
                            + "to switch to the correct Xcode path.", path));
        } catch (ExecuteException e) {
            handleExecuteException(e);
            return null;
        }
    }

    public static boolean isXcodeInstalled() {
        try {
            findXcodePath();
            return true;
        } catch(Exception e) {
            return false;
        }
    }

    public static String findXcodeCommand(String cmd, String sdk) throws IOException {
        try {
            return new Executor(Logger.NULL_LOGGER, "xcrun").args("-sdk", sdk, "-f", cmd).execCapture();
        } catch (ExecuteException e) {
            handleExecuteException(e);
            return null;
        }
    }

    public static void pngcrush(Config config, File inFile, File outFile) throws IOException {
        new Executor(config.getLogger(), getPngCrush()).args("-q", "-iphone", "-f", "0", inFile, outFile).exec();
    }

    public static void textureatlas(Config config, File inDir, File outDir) throws IOException {
        List<String> opts = new ArrayList<String>();
        int outputFormat = 1;
        int maxTextureDimension = 1;

        if (config.getTools() != null && config.getTools().getTextureAtlas() != null) {
            TextureAtlas atlasConfig = config.getTools().getTextureAtlas();
            outputFormat = 1 + atlasConfig.getOutputFormat().ordinal();
            maxTextureDimension = 1 + atlasConfig.getMaximumTextureDimension().ordinal();

            if (atlasConfig.usePowerOfTwo()) {
                opts.add("-p");
            }
        }

        new Executor(config.getLogger(), getTextureAtlas()).args(opts, "-f", outputFormat, "-s", maxTextureDimension,
                inDir, outDir).exec();
    }

    public static void actool(Config config, File partialInfoPlist, File outDir, File inDir) throws IOException {
        actool(config, partialInfoPlist, outDir, Collections.singletonList(inDir));
    }

    public static void actool(Config config, File partialInfoPlist, File outDir, List<File> inDirs) throws IOException {
        List<Object> opts = new ArrayList<>();
        String appIconSetName = null;
        boolean appIconSetNameByArgs = false;
        String launchImagesName = null;
        boolean launchImagesNameByArgs = false;
        boolean includeAllAppIcons = false;

        // pick values from config of robovm.xml
        if (config.getTools() != null && config.getTools().getActool() != null) {
            ActoolOptions options = config.getTools().getActool();
            opts.addAll(options.getArguments());
            // if "--app-icon" specified in arguments will not use iconName option or look up for asset
            appIconSetNameByArgs = opts.contains("--app-icon");
            // if "--launch-image" specified in arguments will not use launchImagesName option or look up for asset
            launchImagesNameByArgs = opts.contains("--launch-image");
            // pick other options
            includeAllAppIcons = options.shouldIncludeAllAppIcons();
            appIconSetName = appIconSetNameByArgs ? null : options.getAppIconName();
            launchImagesName = launchImagesNameByArgs ? null: options.getLaunchImageName();
        }

        // look for icon and launch image sets if not specified by config
        // these options might be provided also in argument list. do lookup only if required
        List<String> availableIcons = appIconSetName == null && !appIconSetNameByArgs ?  new ArrayList<>() : null;
        List<String> availableImages = launchImagesName == null && !launchImagesNameByArgs ? new ArrayList<>() : null;
        if (availableIcons != null || availableImages != null) {
            final String appiconset = "appiconset";
            final String launchimage = "launchimage";

            for (File inDir : inDirs) {
                for (String fileName : inDir.list()) {
                    String ext = FilenameUtils.getExtension(fileName);
                    if (ext.equals(appiconset)) {
                        if (availableIcons != null)
                            availableIcons.add(FilenameUtils.getBaseName(fileName));
                    } else if (ext.equals(launchimage)) {
                        if (availableImages != null)
                            availableImages.add(FilenameUtils.getBaseName(fileName));
                    }
                }
            }

            // pick values
            if (availableIcons != null && availableIcons.size() >= 1) {
                appIconSetName = availableIcons.get(0);
                if (availableIcons.size() > 1)
                    config.getLogger().error("actool: multiple .appiconset found but %s will be used", appIconSetName);
            }
            if (availableImages != null && availableImages.size() >= 1) {
                launchImagesName = availableImages.get(0);
                if (availableImages.size() > 1)
                    config.getLogger().error("actool: multiple .launchimage found but %s will be used", launchImagesName);
            }
        }

        if (appIconSetName != null) {
            opts.add("--app-icon");
            opts.add(appIconSetName);
            appIconSetNameByArgs = true;
        }
        if (launchImagesName != null) {
            opts.add("--launch-image");
            opts.add(launchImagesName);
            launchImagesNameByArgs = true;
        }

        if (appIconSetNameByArgs || launchImagesNameByArgs) {
            opts.add("--output-partial-info-plist");
            opts.add(partialInfoPlist);
        }

        if (includeAllAppIcons) {
            opts.add("--include-all-app-icons");
        }

        opts.add("--platform");
        if (IOSTarget.isDeviceArch(config.getArch())) {
            opts.add("iphoneos");
        } else if (IOSTarget.isSimulatorArch(config.getArch())) {
            opts.add("iphonesimulator");
        }

        String minOSVersion = config.getOs().getMinVersion();
        if (config.getIosInfoPList() != null) {
            String v = config.getIosInfoPList().getMinimumOSVersion();
            if (v != null) {
                minOSVersion = v;
            }
        }

        //Writes a text file with paths of resources that are compiled to the asset catalog.
        //This information can be used to skip asset creation as needed.
        opts.add("--export-dependency-info");
        opts.add(config.getTmpDir().getAbsolutePath() + "/assetcatalog_dependencies");

        new Executor(config.getLogger(), getACTool()).args("--output-format", "human-readable-text", opts,
                "--minimum-deployment-target", minOSVersion, "--target-device", "iphone", "--target-device", "ipad",
                "--compress-pngs", "--compile", outDir, inDirs).exec();
    }

    public static void ibtool(Config config, File partialInfoPlist, File inFile, File outFile) throws IOException {
        String minOSVersion = config.getOs().getMinVersion();
        if (config.getIosInfoPList() != null) {
            String v = config.getIosInfoPList().getMinimumOSVersion();
            if (v != null) {
                minOSVersion = v;
            }
        }

        Executor executor = new Executor(config.getLogger(), getIBTool()).args("--target-device", "iphone",
                "--target-device", "ipad", "--minimum-deployment-target", minOSVersion,
                "--output-partial-info-plist", partialInfoPlist, "--auto-activate-custom-fonts", "--output-format",
                "human-readable-text");
        if (outFile.isDirectory()) {
            executor.args("--compilation-directory", outFile);
        } else {
            executor.args("--compile", outFile);
        }
        executor.args(inFile).exec();
    }

    public static void compileStrings(Config config, File inFile, File outFile) throws IOException {
        new Executor(config.getLogger(), getPlutil()).args("-convert", "binary1", inFile, "-o", outFile).exec();
    }

    public static void decompileXml(Config config, File inFile, File outFile) throws IOException {
        new Executor(Logger.NULL_LOGGER, getPlutil()).args("-convert", "xml1", inFile, "-o", outFile).exec();
    }

    public static String nm(File file) throws IOException {
        return new Executor(Logger.NULL_LOGGER, getNm()).args(file.getAbsolutePath()).execCapture();
    }

    public static String otool(File file) throws IOException {
        return new Executor(new ConsoleLogger(false), getOtool()).args("-L", file.getAbsolutePath()).execCapture();
    }

    public static void lipo(Config config, File outFile, List<File> inFiles) throws IOException {
        new Executor(config.getLogger(), getLipo()).args(inFiles, "-create", "-output", outFile).exec();
    }
    
    public static void lipoRemoveArchs(Config config, File inFile, File outFile, String ... archs) throws IOException {
        List<Object> args = new ArrayList<>();
        args.add(inFile);
        for(String arch: archs) {
            args.add("-remove");
            args.add(arch);
        }
        args.add("-output");
        args.add(outFile);
        new Executor(config.getLogger(), getLipo()).args(args).exec();
    }


    public static void bitcodeStrip(Config config, File inFile, File outFile) throws IOException {
        new Executor(config.getLogger(), getBitcodeStrip()).args(inFile, "-r", "-o", outFile).exec();
    }

    public static String lipoInfo(Config config, File inFile) throws IOException {
        List<Object> args = new ArrayList<>();
        args.add("-info");
        args.add(inFile);        
        return new Executor(Logger.NULL_LOGGER, getLipo()).args(args).execCapture();
    }
    
    public static String file(File file) throws IOException {
        return new Executor(Logger.NULL_LOGGER, getFile()).args(file).execCapture();
    }

    public static void packageApplication(Config config, File appDir, File outFile) throws IOException {
        new Executor(config.getLogger(), getPackageApplication()).args(appDir, "-o", outFile).exec();
    }

    public static void generateDsym(Config config, File dsymDir, File exePath) throws IOException {
        new Executor(config.getLogger(), getDsymutil()).args("-o", dsymDir, exePath).exec();
    }

    public static void dsymToSymbols(Config config, File dsymExecutable, File outDir) throws IOException {
        new Executor(config.getLogger(), getSymbols()).args("-noTextInSOD", "-noDaemon", "-arch", "all",
                "-symbolsPackageDir", outDir, dsymExecutable).exec();
    }

    private static List<File> writeObjectsFiles(Config config, List<File> objectFiles, int maxObjectsPerFile,
            boolean quote) throws IOException {

        ArrayList<File> files = new ArrayList<>();
        for (int i = 0, start = 0; start < objectFiles.size(); i++, start += maxObjectsPerFile) {
            List<File> partition = objectFiles.subList(start, Math.min(objectFiles.size(), start + maxObjectsPerFile));
            List<String> paths = new ArrayList<>();
            for (File f : partition) {
                paths.add((quote ? "\"" : "") + f.getAbsolutePath() + (quote ? "\"" : ""));
            }

            File objectsFile = new File(config.getTmpDir(), "objects" + i);
            FileUtils.writeLines(objectsFile, paths, "\n");
            files.add(objectsFile);
        }

        return files;
    }

    public static void link(Config config, List<String> args, List<File> objectFiles, List<String> libs, File outFile)
            throws IOException {
        
        boolean isDarwin = config.getOs().getFamily() == OS.Family.darwin;
        /*
         * The Xcode linker doesn't need paths with spaces to be quoted and will
         * fail if we do quote. The Xcode linker will crash if we pass more than
         * 65535 files in an objects file.
         * 
         * The linker on Linux will fail if we don't quote paths with spaces.
         */
        List<File> objectsFiles = writeObjectsFiles(config, objectFiles, isDarwin ? 0xffff : Integer.MAX_VALUE,
                !isDarwin);

        List<String> opts = new ArrayList<String>();
        if (config.isDebug()) {
            opts.add("-g");
        }
        if (isDarwin) {
            for (File objectsFile : objectsFiles) {
                opts.add("-Wl,-filelist," + objectsFile.getAbsolutePath());
            }
        } else {
            opts.add(config.getArch().is32Bit() ? "-m32" : "-m64");
            for (File objectsFile : objectsFiles) {
                opts.add("@" + objectsFile.getAbsolutePath());
            }
        }
        opts.addAll(args);

        new Executor(config.getLogger(), getCcPath(config)).args("-o", outFile, opts, libs).exec();
    }

    private static String getCcPath(Config config) throws IOException {
        String ccPath = config.getOs().getFamily() == OS.Family.darwin ? "clang++" : "g++";
        if (config.getCcBinPath() != null) {
            ccPath = config.getCcBinPath().getAbsolutePath();
        } else if (config.getOs() == OS.ios) {
            ccPath = getIOSDevClang();
        }
        return ccPath;
    }
}
