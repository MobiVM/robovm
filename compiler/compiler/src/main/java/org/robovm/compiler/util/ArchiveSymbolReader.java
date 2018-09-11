/*
 * Copyright (C) 2018 Achrouf Abdenour <achroufabdenour@gmail.com>
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

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.exec.ExecuteException;
import org.robovm.compiler.config.Config;
import org.robovm.compiler.config.Config.Lib;
import org.robovm.compiler.config.OS;
import org.robovm.compiler.config.OS.Family;
import org.robovm.compiler.log.Logger;
import org.simpleframework.xml.Transient;

public class ArchiveSymbolReader {
    @Transient
    private Config config;

    public ArchiveSymbolReader() {}

    public ArchiveSymbolReader(Config config) {
        this.config = config;
    }

    public Set<String> readSymbolsFromArchives() throws ExecuteException, IOException {
        final HashSet<String> archives = new HashSet<String>();

        String libSuffix = config.isUseDebugLibs() ? "-dbg" : "";

        archives.add(new File(config.getOsArchDepLibDir(), "librobovm-rt" + libSuffix + ".a").getAbsolutePath());

        for (Lib lib : config.getLibs()) {
            archives.add(lib.getValue());
        }

        return readSymbolsFromArchives(archives);
    }

    public Set<String> readSymbolsFromArchives(Set<String> archives) throws ExecuteException, IOException {
        final HashSet<String> symbols = new HashSet<String>();
        new Executor(new Logger() {
            public void info(String format, Object... args) {
                String[] lines = String.format(format, args).split("\n");
                for (String line : lines) {
                    if (line.startsWith("Java_"))
                        symbols.add(line);
                }
            }

            public void error(String format, Object... args) {

            }

            public void warn(String format, Object... args) {

            }

            public void debug(String format, Object... args) {

            }
        }, getNmDir()).args("-just-symbol-name", archives).exec();

        return symbols;
    }

    private String getNmDir() {
        String nmName = (config.getOs().getFamily() == Family.linux ? "llvm-nm-linux" : "llvm-nm");
        return new File(config.getHome().getBinDir(), nmName).getPath();
    }
}
