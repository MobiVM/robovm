/*
 * Copyright (C) 2018 The Android Open Source Project
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

import com.android.i18n.timezone.TzDataSetVersion.TzDataSetException;
import com.android.i18n.util.Log;
import com.android.icu.util.Icu4cMetadata;

import java.io.File;
import java.io.IOException;

/**
 * Provides APIs for obtaining metadata for the i18n library and lower-level
 * components like timezone.
 *
 * @hide
 */
@libcore.api.CorePlatformApi
public class I18nModuleDebug {

    private static final String CORE_LIBRARY_TIMEZONE_DEBUG_PREFIX = "core_library.timezone.";

    private I18nModuleDebug() {}

    /**
     * Returns information about the Core Library for debugging.
     */
    @libcore.api.CorePlatformApi
    public static DebugInfo getDebugInfo() {
        DebugInfo debugInfo = new DebugInfo();
        populateTimeZoneFilesInfo(debugInfo);
        populateTimeZoneLibraryReportedVersion(debugInfo);
        return debugInfo;
    }

    /**
     * Adds information about the available time zone file sets on the device to the supplied
     * {@link DebugInfo}. See also {@link #populateTimeZoneLibraryReportedVersion(DebugInfo)} for a method
     * that provides information about the time zone files actually in use by libraries.
     */
    private static void populateTimeZoneFilesInfo(DebugInfo debugInfo) {
        String debugKeyPrefix = CORE_LIBRARY_TIMEZONE_DEBUG_PREFIX + "source.";

        // Time zone module tz data set.
        {
            String tzDataModulePrefix = debugKeyPrefix + "tzdata_module_";
            String versionFile =
                    TimeZoneDataFiles.getTimeZoneModuleTzFile(TzDataSetVersion.DEFAULT_FILE_NAME);
            addTzDataSetVersionDebugInfo(versionFile, tzDataModulePrefix, debugInfo);
        }

        // /system tz data set.
        {
            String systemDirPrefix = debugKeyPrefix + "system_";
            String versionFile =
                    TimeZoneDataFiles.getSystemTzFile(TzDataSetVersion.DEFAULT_FILE_NAME);
            addTzDataSetVersionDebugInfo(versionFile, systemDirPrefix, debugInfo);
        }
    }

    private static void addTzDataSetVersionDebugInfo(String tzDataSetVersionFile,
            String debugKeyPrefix, DebugInfo debugInfo) {
        File file = new File(tzDataSetVersionFile);
        String statusKey = debugKeyPrefix + "status";
        if (file.exists()) {
            try {
                TzDataSetVersion tzDataSetVersion =
                        TzDataSetVersion.readFromFile(file);
                String formatVersionString = tzDataSetVersion.getFormatMajorVersion() + "."
                        + tzDataSetVersion.getFormatMinorVersion();
                debugInfo.addStringEntry(statusKey, "OK")
                        .addStringEntry(debugKeyPrefix + "formatVersion", formatVersionString)
                        .addStringEntry(debugKeyPrefix + "rulesVersion",
                                tzDataSetVersion.getRulesVersion())
                        .addStringEntry(debugKeyPrefix + "revision",
                                tzDataSetVersion.getRevision());
            } catch (IOException | TzDataSetException e) {
                debugInfo.addStringEntry(statusKey, "ERROR");
                debugInfo.addStringEntry(debugKeyPrefix + "exception_class", e.getClass().getName());
                debugInfo.addStringEntry(debugKeyPrefix + "exception_msg", e.getMessage());
                Log.e("Error reading " + file, e);
            }
        } else {
            debugInfo.addStringEntry(statusKey, "NOT_FOUND");
        }
    }

    private static void populateTimeZoneLibraryReportedVersion(DebugInfo debugInfo) {
        String debugKeyPrefix = CORE_LIBRARY_TIMEZONE_DEBUG_PREFIX + "lib.";
        debugInfo.addStringEntry(
                debugKeyPrefix + "icu4j.tzdb_version",
                android.icu.util.TimeZone.getTZDataVersion());
        debugInfo.addStringEntry(
                debugKeyPrefix + "libcore.tzdb_version",
                ZoneInfoDb.getInstance().getVersion());
        debugInfo.addStringEntry(
                debugKeyPrefix + "icu4c.tzdb_version",
                Icu4cMetadata.getTzdbVersion());
    }
}
