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
package org.robovm.libimobiledevice.util;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Another simple version class, local withing libmobiledevice
 */
class Version implements Comparable<Version> {
    // parts of version -- parsed dot separated values "1.2.3" -> [1,2,3]
    public final int[] parts;

    public Version(int... parts) {
        this.parts = parts;
    }

    @Override
    public int compareTo(Version other) {
        // walk by shortest common part
        int commonPart = Math.min(parts.length, other.parts.length);
        for (int i = 0; i < commonPart; i++) {
            int diff = parts[i] - other.parts[i];
            if (diff != 0)
                return diff;
        }

        // same common part, longer wins
        return this.parts.length - other.parts.length;
    }

    public int getMajor() {
        return parts[0];
    }

    public static Version parse(String v) {
        String[] tokens = v.split("\\.");
        int[] parts = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++)
            parts[i] = Integer.parseInt(tokens[i]);
        return new Version(parts);
    }

    @Override
    public String toString() {
        return Arrays.stream(parts).mapToObj(Integer::toString).collect(Collectors.joining("."));
    }
}
