/*
 * Copyright (C) 2014 RoboVM AB
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

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests {@link Version}.
 */
public class VersionTest {

    @Test
    public void testVersion() {
        Version version = Version.parse("1.2.15");
        assertEquals(1, version.getMajor(), 1);
        assertEquals(2, version.getMinor(), 2);
        assertEquals(15, version.getRevision(), 15);
        assertEquals(0, version.getBuild(), 0);
        assertEquals(Version.BuildType.Release, version.getBuildType());

        assertEquals(Version.BuildType.Snapshot, Version.parse("1.2.3-SNAPSHOT").getBuildType());
        assertEquals(Version.BuildType.Alpha, Version.parse("1.2.3-alpha-01").getBuildType());
        assertEquals(Version.BuildType.Beta, Version.parse("1.2.3-beta-23").getBuildType());
        assertEquals(Version.BuildType.RC, Version.parse("1.2.3-rc-07").getBuildType());

        assertCompareSmallerThan(Version.parse("1.2.3.4"), Version.parse("1.2.3.5"));
        assertCompareSmallerThan(Version.parse("1.2.3.4"), Version.parse("1.2.3.4.5"));
        assertCompareSmallerThan(Version.parse("1.2.3.4-rc-1"), Version.parse("1.2.3.4"));
        assertCompareSmallerThan(Version.parse("1.2.3.4-beta-1"), Version.parse("1.2.3.4-rc-1"));
        assertCompareSmallerThan(Version.parse("1.2.3.4-alpha-1"), Version.parse("1.2.3.4-beta-1"));
        assertCompareSmallerThan(Version.parse("1.2.3.4-SNAPSHOT"), Version.parse("1.2.3.4-alpha-1"));

        // basic to string
        assertEquals("1.2.3-SNAPSHOT", Version.parse("1.2.3-SNAPSHOT").toString());
        assertEquals("1.2.3-alpha-1", Version.parse("1.2.3-alpha-1").toString());
        assertEquals("1.2.3-beta-23", Version.parse("1.2.3-beta-23").toString());
        assertEquals("1.2.3-rc-7", Version.parse("1.2.3-rc-7").toString());
        assertEquals("1.2.3", Version.parse("1.2.3").toString());
    }


    static <T> void assertCompareSmallerThan(Comparable<T> a, T b) {
        assertTrue(a.compareTo(b) < 0);
    }
}
