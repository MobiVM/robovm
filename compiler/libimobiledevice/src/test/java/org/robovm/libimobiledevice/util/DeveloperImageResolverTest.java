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

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests {@link DeveloperImageResolver}.
 */
public class DeveloperImageResolverTest {

    private File createDeveloperImage(Path dsDir, String version) throws Exception {
        return createDeveloperImage(dsDir, version, true);
    }
    private File createDeveloperImage(Path dsDir, String version, boolean createSignature) throws Exception {
        Files.createDirectory(dsDir.resolve(version));
        if (createSignature) {
            Files.createFile(dsDir.resolve(version + "/DeveloperDiskImage.dmg.signature"));
        }
        return Files.createFile(dsDir.resolve(version + "/DeveloperDiskImage.dmg")).toFile();
    }
    
    @SuppressWarnings("unused")
    @Test
    public void testFindDeveloperImage() throws Exception {
        Path dsDir = Files.createTempDirectory(getClass().getSimpleName());
        File f50 = createDeveloperImage(dsDir, "5.0");
        File f51 = createDeveloperImage(dsDir, "5.1");
        File f60 = createDeveloperImage(dsDir, "6.0");
        File f61 = createDeveloperImage(dsDir, "6.1");
        File f612 = createDeveloperImage(dsDir, "6.1.2");
        File f613 = createDeveloperImage(dsDir, "6.1.3", false);
        File f70_11A465 = createDeveloperImage(dsDir, "7.0 (11A465)");
        File f703_11B508 = createDeveloperImage(dsDir, "7.0.3 (11B508)");
        File f812_13B812 = createDeveloperImage(dsDir, "8.1.2 (13B812)");
        File f92 = createDeveloperImage(dsDir, "9.2");
        File f102 = createDeveloperImage(dsDir, "10.2 (14D123)");

        assertEquals(f703_11B508, DeveloperImageResolver.findDeveloperImage(dsDir.toFile(), new Version(7, 0, 3)).dmg);
        assertEquals(f612, DeveloperImageResolver.findDeveloperImage(dsDir.toFile(), new Version(6, 1, 2)).dmg);
        assertEquals(f703_11B508, DeveloperImageResolver.findDeveloperImage(dsDir.toFile(), new Version(7, 0, 3)).dmg);
        // finding not exact match
        assertEquals(f612, DeveloperImageResolver.findDeveloperImage(dsDir.toFile(), new Version(6, 1, 3)).dmg);
        assertEquals(f61, DeveloperImageResolver.findDeveloperImage(dsDir.toFile(), new Version(6, 1, 1)).dmg);
        assertEquals(f70_11A465, DeveloperImageResolver.findDeveloperImage(dsDir.toFile(), new Version(7, 0, 2)).dmg);
        assertEquals(f812_13B812, DeveloperImageResolver.findDeveloperImage(dsDir.toFile(), new Version(8, 1, 3)).dmg);
        assertEquals(f812_13B812, DeveloperImageResolver.findDeveloperImage(dsDir.toFile(), new Version(8, 2)).dmg);
        assertEquals(f92, DeveloperImageResolver.findDeveloperImage(dsDir.toFile(), new Version(9, 3, 3)).dmg);
        assertEquals(f92, DeveloperImageResolver.findDeveloperImage(dsDir.toFile(), new Version(9, 3)).dmg);
        assertEquals(f102, DeveloperImageResolver.findDeveloperImage(dsDir.toFile(), new Version(10, 3, 5)).dmg);
        assertEquals(f102, DeveloperImageResolver.findDeveloperImage(dsDir.toFile(), new Version(10, 3)).dmg);
    }

}
