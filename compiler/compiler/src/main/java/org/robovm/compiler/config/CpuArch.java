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
package org.robovm.compiler.config;

import org.robovm.compiler.CompilerException;

import java.nio.ByteOrder;

/**
 * @author niklas
 *
 */
public enum CpuArch {
    x86_64("x86_64", "x86_64", "penryn", false),
    arm64("arm64", "arm64", true);

    private final String llvmName;
    private final String clangName;
    private final String llvmCpu;
    private final boolean isArm;
    private final ByteOrder byteOrder;

    private CpuArch(String llvmName, String clangName, boolean isArm) {
        this(llvmName, clangName, "generic", isArm);
    }

    private CpuArch(String llvmName, String clangName, String llvmCpu, boolean isArm) {
        this(llvmName, clangName, llvmCpu, isArm, ByteOrder.LITTLE_ENDIAN);
    }

    private CpuArch(String llvmName, String clangName, String llvmCpu, boolean isArm, ByteOrder byteOrder) {
        this.llvmName = llvmName;
        this.clangName = clangName;
        this.llvmCpu = llvmCpu;
        this.isArm = isArm;
        this.byteOrder = byteOrder;
    }

    public String getLlvmName() {
        return llvmName;
    }

    public String getClangName() {
        return clangName;
    }

    public String getLlvmCpu() {
        return llvmCpu;
    }

    public boolean isArm() {
        return isArm;
    }

    public ByteOrder getByteOrder() {
        return byteOrder;
    }

    public static CpuArch getDefaultArch() {
        String archProp = System.getProperty("os.arch").toLowerCase();
        if (archProp.matches("amd64|x86[-_]64")) {
            return CpuArch.x86_64;
        } else if (archProp.matches("aarch64|arm64")) {
            // MacOSX m1 CPU
            return CpuArch.arm64;
        }
        throw new CompilerException("Unrecognized arch in os.arch: " + archProp);
    }
}
