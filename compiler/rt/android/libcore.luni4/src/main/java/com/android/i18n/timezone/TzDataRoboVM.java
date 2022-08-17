/*
 * Copyright (C) 2007 The Android Open Source Project
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
/*
 * Copyright (C) 2012 RoboVM AB
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

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TimeZone;
import java.util.TreeSet;

import com.android.i18n.timezone.internal.BufferIterator;
import com.android.i18n.timezone.internal.ByteBufferIterator;
import libcore.io.IoUtils;
import libcore.util.NonNull;
import libcore.util.Nullable;

/**
 * RoboVM implementation of {@link TzData} which loads the zoneinfo
 * from a standard Olson tzdata folder structure as used in Mac OS X, iOS and
 * most Linux distributions.
 */
final class TzDataRoboVM implements TzData {

    private static final String ZONE_DIRECTORY_NAME = "/usr/share/zoneinfo/";

    private static final String VERSION = readVersion();

    /**
     * Deprecated TimeZone aliases for JDK 1.1.x compatibility. We use the same mappings as used by GCJ.
     */
    private static final Map<String, String> deprecatedAliases;
    
    /**
     * Cached {@link ZoneInfoData}s. The first time a ZoneInfoData is loaded we store it in this array at the same
     * index as the index of the timezone's id in ids. Subsequent calls for the same TimeZone will return a clone
     * of the cached ZoneInfo.
     */
    private static ZoneInfoData[] zoneInfos;
    
    /**
     * The 'ids' array contains time zone ids sorted alphabetically, for binary searching.
     */
    private static String[] ids;

    static {
        deprecatedAliases = new HashMap<String, String>();
        deprecatedAliases.put("ACT", "Australia/Darwin");
        deprecatedAliases.put("AET", "Australia/Sydney");
        deprecatedAliases.put("AGT", "America/Argentina/Buenos_Aires");
        deprecatedAliases.put("ART", "Africa/Cairo");
        deprecatedAliases.put("AST", "America/Juneau");
        deprecatedAliases.put("BET", "Etc/GMT-11");
        deprecatedAliases.put("BST", "Asia/Colombo");
        deprecatedAliases.put("CAT", "Africa/Gaborone");
        deprecatedAliases.put("CNT", "America/St_Johns");
        deprecatedAliases.put("CST", "CST6CDT");
        deprecatedAliases.put("CTT", "Asia/Brunei");
        deprecatedAliases.put("EAT", "Indian/Comoro");
        deprecatedAliases.put("ECT", "CET");
        deprecatedAliases.put("EST", "EST5EDT");
        deprecatedAliases.put("EST5", "EST5EDT");
        deprecatedAliases.put("IET", "EST5EDT");
        deprecatedAliases.put("IST", "Asia/Calcutta");
        deprecatedAliases.put("JST", "Asia/Seoul");
        deprecatedAliases.put("MIT", "Pacific/Niue");
        deprecatedAliases.put("MST", "MST7MDT");
        deprecatedAliases.put("MST7", "MST7MDT");
        deprecatedAliases.put("NET", "Indian/Mauritius");
        deprecatedAliases.put("NST", "Pacific/Auckland");
        deprecatedAliases.put("PLT", "Indian/Kerguelen");
        deprecatedAliases.put("PNT", "MST7MDT");
        deprecatedAliases.put("PRT", "America/Anguilla");
        deprecatedAliases.put("PST", "PST8PDT");
        deprecatedAliases.put("SST", "Pacific/Ponape");
        deprecatedAliases.put("VST", "Asia/Bangkok");        
        
        readIndex();
    }

    /**
     * Reads the file indicating the database version in use.
     */
    private static String readVersion() {
        // Mac OS X / iOS have a +VERSION file in /usr/share/zoneinfo containing the version number
        try {
            byte[] bytes = IoUtils.readFileAsByteArray(ZONE_DIRECTORY_NAME + "+VERSION");
            return new String(bytes, 0, bytes.length, StandardCharsets.ISO_8859_1).trim();
        } catch (IOException ex) {
            // Linux (at least Ubuntu) doesn't have a +VERSION file. Just return unknown.
            return "unknown";
        }            
    }

    /**
     * Traditionally, Unix systems have one file per time zone. We have one big data file, which
     * is just a concatenation of regular time zone files. To allow random access into this big
     * data file, we also have an index. We read the index at startup, and keep it in memory so
     * we can binary search by id when we need time zone data.
     *
     * The format of this file is, I believe, Android's own, and undocumented.
     *
     * All this code assumes strings are US-ASCII.
     */
    private static void readIndex() {
        try {
            readIndexMulti();
        } catch (Exception ex) {
            throw new AssertionError(ex);
        }
        
        zoneInfos = new ZoneInfoData[ids.length];
    }

    /**
     * Populates the ids array when using a multi file timezone database. Reads the contents of 
     * {@link #ZONE_DIRECTORY_NAME}. We assume that all files beginning with an upper case letter at depth 0 to 2 are
     * proper TZ files. Fragile but known to work on Ubuntu 12.04, Mac OS X 10.7 and iOS 6.0.
     * This was added in RoboVM.
     */
    private static void readIndexMulti() throws IOException {
        TreeSet<String> set = new TreeSet<String>();
        
        for (File f1 : new File(ZONE_DIRECTORY_NAME).listFiles()) {
            String name1 = f1.getName();
            if ("Factory".equals(name1)) {
                // Skip
                continue;
            }
            if (name1.charAt(0) < 'A' || name1.charAt(0) > 'Z') {
                // Must start with upper case character. Skip.
                continue;
            }
            if (f1.isDirectory()) {
                for (File f2 : f1.listFiles()) {
                    String name2 = f2.getName();
                    if (name2.charAt(0) < 'A' || name2.charAt(0) > 'Z') {
                        // Must start with upper case character. Skip.
                        continue;
                    }
                    if (f2.isDirectory()) {
                        for (File f3 : f2.listFiles()) {
                            String name3 = f3.getName();
                            if (name3.charAt(0) < 'A' || name3.charAt(0) > 'Z') {
                                // Must start with upper case character. Skip.
                                continue;
                            }
                            if (!f3.isDirectory()) {
                                set.add(name1 + "/" + name2 + "/" + name3);
                            }
                        }
                    } else {
                        set.add(name1 + "/" + name2);                                
                    }
                }
            } else {
                set.add(name1);
            }
        }
        
        for (Entry<String, String> alias : deprecatedAliases.entrySet()) {
            if (set.contains(alias.getValue())) {
                set.add(alias.getKey());
            }
        }

        ids = set.toArray(new String[set.size()]);
    }

    public @Nullable ZoneInfoData makeZoneInfoData(@NonNull String id) {
        // Check the aliases first
        String realId = deprecatedAliases.get(id);
        if (realId != null) {
            return makeZoneInfoData(realId);
        }
        
        // Work out where in the big data file this time zone is.
        int index = Arrays.binarySearch(ids, id);
        if (index < 0) {
            return null;
        }

        ZoneInfoData zoneInfo = zoneInfos[index];
        if (zoneInfo != null) {
            return zoneInfo;
        }

        try {
            byte[] bytes = IoUtils.readFileAsByteArray(ZONE_DIRECTORY_NAME + id);
            ByteBuffer buffer = ByteBuffer.wrap(bytes);
            buffer.order(ByteOrder.BIG_ENDIAN);
            BufferIterator it = new ByteBufferIterator(buffer);
            zoneInfo = ZoneInfoData.readTimeZone(id, it);
            zoneInfos[index] = zoneInfo;
        } catch (IOException e) {
            throw new IllegalStateException("Unable to load timezone for ID=" + id, e);
        }
        return zoneInfo;
    }

    @Override
    public String[] getAvailableIDs() {
        return ids.clone();
    }

    @Override
    public String[] getAvailableIDs(int rawOffset) {
        List<String> matches = new ArrayList<String>();
        // Unfortunately we need load each ZoneInfo to determine the offset
        for (String id : ids) {
            ZoneInfoData zoneInfo = makeZoneInfoData(id);
            if (zoneInfo != null && zoneInfo.getRawOffset() == rawOffset) {
                matches.add(id);
            }
        }
        return matches.toArray(new String[0]);
    }

    @Override
    public String getDefaultID() {
        // In RoboVM we check the files /etc/timezone, /etc/localtime and /private/var/db/timezone/localtime.
        // The first file is a text file containing the id of the current time zone, e.g. 'Europe/Stockholm'
        // The two other files should be symlinks into the /usr/share/zoneinfo dir pointing out the current
        // time zone.
        String zoneName = null;
        try {
            // Ubuntu places the time zone in /etc/timezone
            zoneName = IoUtils.readFileAsString("/etc/timezone").trim();
        } catch (IOException e) {
        }
        if (zoneName == null || zoneName.isEmpty()) {
            // Mac OS X symlinks /etc/localtime to the current time zone file in /usr/share/zoneinfo
            File link = new File("/etc/localtime");
            if (!link.exists()) {
                // iOS uses the link /private/var/db/timezone/localtime instead
                link = new File("/private/var/db/timezone/localtime");
            }
            try {
                String path = link.getCanonicalPath(); // Resolve the link
                for (String id : ids) {
                    if (path.endsWith(id)) {
                        zoneName = id;
                    }
                }
            } catch (IOException e) {
            }
        }
        return zoneName;
    }
    
    public String getVersion() {
        return VERSION;
    }
}
