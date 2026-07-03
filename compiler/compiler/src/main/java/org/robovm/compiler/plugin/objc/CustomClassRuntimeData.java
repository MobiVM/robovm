/*
 * Copyright (C) 2025 The MobiVM Contributors
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
package org.robovm.compiler.plugin.objc;

import org.robovm.compiler.Linker;

import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.LinkedHashSet;

/**
 * single place to track custom class that need to be preloaded
 * (to be discovered by objc runtime)
 */
class CustomClassRuntimeData implements Linker.RuntimeData {
    static final String ID = "org.robovm.apple.uikit.UIApplication.preloadClasses";

    LinkedHashSet<String> preloadClasses;

    void addClass(String className) {
        if (preloadClasses == null) {
            preloadClasses = new LinkedHashSet<>();
        }
        preloadClasses.add(className);
    }

    public void addClasses(Collection<String> preloadClasses) {
        if (preloadClasses == null || preloadClasses.isEmpty())
            return;
        if (this.preloadClasses == null) {
            this.preloadClasses = new LinkedHashSet<>();
        }
        this.preloadClasses.addAll(preloadClasses);
    }

    @Override
    public byte[] toBytes() {
        if (preloadClasses == null) return new byte[0];
        return String.join(",", preloadClasses).getBytes(StandardCharsets.UTF_8);
    }
}
