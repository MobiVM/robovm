/*
 * Copyright (C) 2012 RoboVM AB
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
package org.robovm.compiler;

import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Reads the compiler version from auto generated <code>version.properties</code> file.
 */
public final class Version implements Comparable<Version>{

    enum BuildType {
        Snapshot("-SNAPSHOT"),
        Alpha("-alpha-"),
        Beta("-beta-"),
        RC("-rc-"),
        Release(null);

        private final String suffix;

        BuildType(String suffix) {
            this.suffix = suffix;
        }

        String suffixWithBuild(int build) {
            switch (this) {
                case Snapshot: return this.suffix;
                case Alpha:
                case Beta:
                case RC: return this.suffix + build;
                default: return "";
            }
        }
    }

    // parts of version -- parsed dot separated values "1.2.3" -> [1,2,3]
    public final int[] parts;
    public final int build;
    public final BuildType buildType;

    public Version(BuildType buildType, int buildPart, int ...parts) {
        this.buildType = buildType;
        this.build = buildPart;
        this.parts = parts;
    }

    public Version(int ...parts) {
        this(BuildType.Release, 1, parts);
    }

    @Override
    public int compareTo(Version other) {
        // compare by type
        int diff = buildType.compareTo(other.buildType);
        if (diff != 0)
            return diff;

        // by common version numbers
        int commonPart = Math.min(parts.length, other.parts.length);
        for (int i = 0; i < commonPart; i++) {
            diff = parts[i] - other.parts[i];
            if (diff != 0)
                return diff;
        }

        // common part is same
        diff = parts.length - other.parts.length;
        if (diff != 0) return diff;

        return build - other.build;
    }

    public int[] getParts() {
        return parts;
    }

    public BuildType getBuildType() {
        return buildType;
    }

    public int getMajor() {
        return parts[0];
    }

    public int getMinor() {
        return parts.length > 1 ? parts[1] : 0;
    }

    public int getRevision() {
        return parts.length > 2 ? parts[2] : 0;
    }

    public int getBuild() {
        return build;
    }

    public static Version parse(String v) {
        String buildPart = "";
        BuildType buildType = BuildType.Release;
        if (v.endsWith(BuildType.Snapshot.suffix)) {
            buildPart = "";
            v = v.substring(0, v.indexOf(BuildType.Snapshot.suffix));
            buildType = BuildType.Snapshot;
        } else if (v.contains(BuildType.Alpha.suffix)) {
            buildPart = v.substring(v.lastIndexOf('-') + 1);
            v = v.substring(0, v.indexOf(BuildType.Alpha.suffix));
            buildType = BuildType.Alpha;
        } else if (v.contains(BuildType.Beta.suffix)) {
            buildPart = v.substring(v.lastIndexOf('-') + 1);
            v = v.substring(0, v.indexOf(BuildType.Beta.suffix));
            buildType = BuildType.Beta;
        } else if (v.contains(BuildType.RC.suffix)) {
            buildPart = v.substring(v.lastIndexOf('-') + 1);
            v = v.substring(0, v.indexOf(BuildType.RC.suffix));
            buildType = BuildType.RC;
        }

        String[] tokens = v.split("\\.");
        int[] parts = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++)
            parts[i] = Integer.parseInt(tokens[i]);

        int build = buildPart.isEmpty() ? 0 : Integer.parseInt(buildPart);
        return new Version(buildType, build, parts);
    }

    public static Version parseOrNull(String v) {
        try {
            return parse(v);
        } catch (Exception ignored) {
        }

        return null;
    }

    @Override
    public String toString() {
        return StringUtils.join(parts, '.') + buildType.suffixWithBuild(build);
    }

    private static String versionString = null;
    private static Version version = null;
    private static String PROPERTIES_RESOURCE = "/META-INF/robovm/version.properties";
    /**
     * Returns the version number of the compiler by reading the <code>version.properties</code>
     * file.
     * 
     * @return the version.
     */
    public static String getCompilerVersion() {
        if (versionString != null) {
            return versionString;
        }
        try(InputStream is = Version.class.getResourceAsStream(PROPERTIES_RESOURCE)) {
            Properties props = new Properties();
            props.load(is);
            versionString = props.getProperty("version");
            return versionString;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Returns <code>true</code> if this version is less than the specified
     * version number.
     */
    public static boolean isOlderThan(String version, String otherVersion) {
        return parse(version).compareTo(parse(otherVersion)) < 0;
    }
    
    public static void main(String[] args) {
        System.out.println(parse("1.0.0-alpha-01"));
    }
}
