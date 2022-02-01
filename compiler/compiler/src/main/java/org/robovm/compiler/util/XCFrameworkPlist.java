/*
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
package org.robovm.compiler.util;

import com.dd.plist.NSArray;
import com.dd.plist.NSDictionary;
import com.dd.plist.NSObject;
import com.dd.plist.PropertyListParser;
import org.robovm.compiler.config.CpuArch;
import org.robovm.compiler.config.Environment;
import org.robovm.compiler.config.OS;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Reads/Writes .xcframework/Info.plist
 */
public class XCFrameworkPlist {
    private static final String KEY_AVAILABLE_LIBRARIES = "AvailableLibraries";
    private static final String KEY_LIBRARY_IDENTIFIER = "LibraryIdentifier";
    private static final String KEY_LIBRARY_PATH = "LibraryPath";
    private static final String KEY_SUPPORTED_ARCHITECTURES = "SupportedArchitectures";
    private static final String KEY_SUPPORTED_PLATFORM = "SupportedPlatform";
    private static final String KEY_SUPPORTED_PLATFORM_VARIANT = "SupportedPlatformVariant";
    private static final String KEY_DEBUG_SYMBOLS_PATH = "DebugSymbolsPath";
    private static final String KEY_CFBUNDLE_PACKAGE_TYPE = "CFBundlePackageType";
    private static final String KEY_XCFRAMEWORK_FORMAT_VERSION = "XCFrameworkFormatVersion";

    private final Library[] availableLibraries;

    public XCFrameworkPlist(Library[] availableLibraries) {
        this.availableLibraries = availableLibraries;
    }

    public Library[] getAvailableLibraries() {
        return availableLibraries;
    }

    public static class Library {
        private final String identifier;
        private final String path;
        private final OS platform;
        private final CpuArch[] supportedArchitectures;
        private final Environment variant;
        private final String debugSymbolPath;

        public Library(String identifier, String path, OS platform, CpuArch[] supportedArchitectures,
                       Environment variant, String debugSymbolPath) {
            this.identifier = identifier;
            this.path = path;
            this.platform = platform;
            this.supportedArchitectures = supportedArchitectures;
            this.variant = variant;
            this.debugSymbolPath = debugSymbolPath;
        }

        public String getIdentifier() {
            return identifier;
        }

        public String getPath() {
            return path;
        }

        public OS getPlatform() {
            return platform;
        }

        public CpuArch[] getSupportedArchitectures() {
            return supportedArchitectures;
        }

        public Environment getVariant() {
            return variant;
        }
    }

    public static class Builder {
        private final List<Library> libraries = new ArrayList<>();

        public Builder addLibrary(Library lib) {
            libraries.add(lib);
            return this;
        }

        public XCFrameworkPlist build() {
            return new XCFrameworkPlist(libraries.toArray(new Library[0]));
        }
    }

    /**
     * Builds plist and writes to file
     */
    public void writeTo(File infoPlistFile) throws IOException {
        // construct plist object
        NSDictionary plist = new NSDictionary();
        if (availableLibraries.length > 0) {
            NSArray arrayLibs = new NSArray(availableLibraries.length);
            for (int libIdx = 0; libIdx < availableLibraries.length; libIdx++) {
                Library lib = availableLibraries[libIdx];

                NSDictionary dictLib = new NSDictionary();
                dictLib.put(KEY_LIBRARY_IDENTIFIER, lib.identifier);
                dictLib.put(KEY_LIBRARY_PATH, lib.path);
                dictLib.put(KEY_SUPPORTED_PLATFORM, lib.platform.toString());
                if (lib.variant != Environment.Native)
                    dictLib.put(KEY_SUPPORTED_PLATFORM_VARIANT, lib.variant.getLlvmName());
                if (lib.debugSymbolPath != null)
                    dictLib.put(KEY_DEBUG_SYMBOLS_PATH, lib.debugSymbolPath);
                NSArray arrayArches = new NSArray(lib.supportedArchitectures.length);
                for (int archIdx = 0; archIdx < lib.supportedArchitectures.length; archIdx++)
                    arrayArches.setValue(archIdx, lib.supportedArchitectures[archIdx].getClangName());
                dictLib.put(KEY_SUPPORTED_ARCHITECTURES, arrayArches);

                arrayLibs.setValue(libIdx, dictLib);
            }
            plist.put(KEY_AVAILABLE_LIBRARIES, arrayLibs);
            plist.put(KEY_CFBUNDLE_PACKAGE_TYPE, "XFWK");
            plist.put(KEY_XCFRAMEWORK_FORMAT_VERSION, "1.0");
        }

        PropertyListParser.saveAsXML(plist, infoPlistFile);
    }

    /**
     * Parses XCFramework structure from plist
     */
    public static XCFrameworkPlist load(File f) throws IOException {
        try {
            List<Library> libraries = new ArrayList<>();
            NSDictionary plist = (NSDictionary) PropertyListParser.parse(f);
            NSArray arrayLibs = (NSArray) plist.get(KEY_AVAILABLE_LIBRARIES);
            for (NSObject o: arrayLibs.getArray()) {
                // if something failed -- just ignore the entry
                try {
                    // pick values
                    NSDictionary dictLib = (NSDictionary) o;
                    String identifier = dictLib.get(KEY_LIBRARY_IDENTIFIER).toString();
                    String libraryPath = dictLib.get(KEY_LIBRARY_PATH).toString();
                    String supportedPlatform = dictLib.get(KEY_SUPPORTED_PLATFORM).toString();
                    String supportedPlatformVariant = dictLib.get(KEY_SUPPORTED_PLATFORM_VARIANT).toString();
                    String debugSymbolsPath = dictLib.get(KEY_DEBUG_SYMBOLS_PATH).toString();
                    NSArray arrayArches = (NSArray) dictLib.get(KEY_SUPPORTED_ARCHITECTURES);

                    // parse
                    OS os = OS.valueOf(supportedPlatform);
                    Environment env = supportedPlatformVariant != null ? Environment.parse(supportedPlatformVariant)
                            : Environment.Native;
                    Set<CpuArch> arches = new LinkedHashSet<>();
                    for (NSObject archO: arrayArches.getArray()) {
                        CpuArch arch = parse(archO.toString());
                        if (arch != null)
                            arches.add(arch);
                    }

                    // if there are all object add library
                    if (!arches.isEmpty())
                        libraries.add(new Library(identifier, libraryPath, os, arches.toArray(new CpuArch[0]), env,
                                debugSymbolsPath));
                } catch (Throwable ignored) {
                }
            }

            return new XCFrameworkPlist(libraries.toArray(new Library[0]));
        } catch (IOException e) {
            throw e;
        } catch (Throwable t) {
            throw new IOException(t);
        }
    }

    private static CpuArch parse(String s) {
        for (CpuArch v: CpuArch.values())
            if (s.equals(v.getClangName()))
                return v;
        return null;
    }
}
