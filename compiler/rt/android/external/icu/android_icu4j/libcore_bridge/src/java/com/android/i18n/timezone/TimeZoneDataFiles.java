/*
 * Copyright (C) 2017 The Android Open Source Project
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

package com.android.i18n.timezone;

import android.icu.platform.AndroidDataFiles;

import java.io.File;
import java.io.IOException;

/**
 * Utility methods associated with finding updateable time zone data files. ICU4C and ICU4J also
 * read files affected by time zone updates. That logic is kept in {@link AndroidDataFiles}
 * and should be updated if file locations or lookup order changes.
 *
 * @hide
 */
@libcore.api.CorePlatformApi
public final class TimeZoneDataFiles {
    private static final String ANDROID_ROOT_ENV = AndroidDataFiles.ANDROID_ROOT_ENV;
    private static final String ANDROID_TZDATA_ROOT_ENV = AndroidDataFiles.ANDROID_TZDATA_ROOT_ENV;
    private static final String ANDROID_DATA_ENV = AndroidDataFiles.ANDROID_DATA_ENV;

    private TimeZoneDataFiles() {}

    /**
     * Returns time zone file paths for the specified file name in an array in the order they
     * should be tried. See {@link AndroidDataFiles#generateIcuDataPath()} for ICU files instead.
     * <ul>
     * <li>[0] - the location of the file in the /data partition (may not exist).</li>
     * <li>[1] - the location of the file from the time zone module under /apex (must exist).</li>
     * </ul>
     */
    // VisibleForTesting
    public static String[] getTimeZoneFilePaths(String fileName) {
        return new String[] {
                getDataTimeZoneFile(fileName),
                getTimeZoneModuleTzFile(fileName),
        };
    }

    // Remove from CorePlatformApi when all users in platform code are removed. http://b/123398797
    @libcore.api.CorePlatformApi
    public static String getDataTimeZoneRootDir() {
        return System.getenv(ANDROID_DATA_ENV) + "/misc/zoneinfo/";
    }

    // Remove from CorePlatformApi when all users in platform code are removed. http://b/123398797
    @libcore.api.CorePlatformApi
    public static String getDataTimeZoneFile(String fileName) {
        return getDataTimeZoneRootDir() + "current/" + fileName;
    }

    public static String getTimeZoneModuleTzFile(String fileName) {
        return getTimeZoneModuleFile("tz/" + fileName);
    }

    // Remove from CorePlatformApi when all users in platform code are removed. http://b/123398797
    @libcore.api.CorePlatformApi
    public static String getTimeZoneModuleTzVersionFile() {
        return getTimeZoneModuleTzFile(TzDataSetVersion.DEFAULT_FILE_NAME);
    }

    /**
     * Reads the version of time zone data supplied by the time zone data module.
     */
    @libcore.api.CorePlatformApi
    public static TzDataSetVersion readTimeZoneModuleVersion()
            throws IOException, TzDataSetVersion.TzDataSetException {
        String tzVersionFileName = getTimeZoneModuleTzFile(TzDataSetVersion.DEFAULT_FILE_NAME);
        return TzDataSetVersion.readFromFile(new File(tzVersionFileName));
    }

    // VisibleForTesting
    public static String getTimeZoneModuleFile(String fileName) {
        return System.getenv(ANDROID_TZDATA_ROOT_ENV) + "/etc/" + fileName;
    }

    public static String getSystemTzFile(String fileName) {
        return getEnvironmentPath(ANDROID_ROOT_ENV, "/usr/share/zoneinfo/" + fileName);
    }

    // VisibleForTesting
    public static String getSystemIcuFile(String fileName) {
        return getEnvironmentPath(ANDROID_ROOT_ENV, "/usr/icu/" + fileName);
    }

    /**
     * Creates a path by combining the value of an environment variable with a relative path.
     * Returns {@code null} if the environment variable is not set.
     */
    private static String getEnvironmentPath(String environmentVariable, String path) {
        String variable = System.getenv(environmentVariable);
        if (variable == null) {
            return null;
        }
        return variable + path;
    }
}
