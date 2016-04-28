/*
 * Copyright (C) 2014 RoboVM AB.
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
package org.robovm.maven.resolver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.io.IOUtils;

class Archiver {

    public static void unarchive(Logger logger, File archive, File destDir) throws IOException {
        TarArchiveInputStream in = null;
        try {
            in = new TarArchiveInputStream(new GZIPInputStream(new FileInputStream(archive)));
            ArchiveEntry entry = null;
            while ((entry = in.getNextEntry()) != null) {
                File f = new File(destDir, entry.getName());
                if (entry.isDirectory()) {
                    f.mkdirs();
                } else {
                    logger.debug(f.getAbsolutePath());
                    f.getParentFile().mkdirs();
                    OutputStream out = null;
                    try {
                        out = new FileOutputStream(f);
                        IOUtils.copy(in, out);
                    } finally {
                        IOUtils.closeQuietly(out);
                    }
                }
                f.setLastModified(entry.getLastModifiedDate().getTime());
                if (entry instanceof TarArchiveEntry) {
                    int mode = ((TarArchiveEntry) entry).getMode();
                    if ((mode & 00100) > 0) {
                        // Preserve execute permissions
                        f.setExecutable(true, (mode & 00001) == 0);
                    }
                }
            }
        } finally {
            IOUtils.closeQuietly(in);
        }
    }
    
}
