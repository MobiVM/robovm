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

import java.nio.ByteOrder;

/**
 * Information about build slice -- incorporates arch, os and Environment
 * such as x86_64, x86_64-simulator or x86_64-macosx
 *
 * @author dkimitsa
 */
public class Arch implements Comparable<Arch> {
    // constants to keep old code
    public static final Arch thumbv7 = new Arch(CpuArch.thumbv7);
    public static final Arch arm64 = new Arch(CpuArch.arm64);
    public static final Arch x86_64 = new Arch(CpuArch.x86_64);

    private final CpuArch cpuArch;
    private final Environment env;

    public Arch(CpuArch arch, Environment env) {
        this.cpuArch = arch;
        this.env = env;
    }

    public Arch(CpuArch arch) {
        this.cpuArch = arch;
        this.env = Environment.Native;
    }

    public static Arch getDefaultArch() {
        return new Arch(CpuArch.getDefaultArch());
    }

    /**
     * promote CpuArch with environment if it wasn't specified
     * E.g. x86_64 and iOS exists only for Simulator environment
     */
    public Arch promoteTo(OS os) {
        if (os == OS.ios && env == Environment.Native && cpuArch == CpuArch.x86_64)
            return new Arch(cpuArch, Environment.Simulator);
        return this;
    }

    /**
     * returns possible supported arches for given os
     */
    public static Arch[] supported(OS os) {
        switch (os) {
            case linux:
                return new Arch[]{Arch.x86_64};
            case macosx:
                return new Arch[]{Arch.x86_64, Arch.arm64};
            case ios:
                return new Arch[]{
                        new Arch(CpuArch.x86_64, Environment.Simulator),
                        new Arch(CpuArch.arm64, Environment.Simulator),
                        Arch.arm64, Arch.thumbv7};
            default:
                throw new IllegalArgumentException("Unexpected OS");
        }
    }

    public CpuArch getCpuArch() {
        return cpuArch;
    }

    public Environment getEnv() {
        return env;
    }

    public Arch copy(Environment anotherEnv) {
        return new Arch(cpuArch, anotherEnv);
    }

    @Override
    public String toString() {
        return cpuArch + env.asLlvmSuffix("-");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Arch arch = (Arch) o;
        if (cpuArch != arch.cpuArch) return false;
        return env == arch.env;
    }

    @Override
    public int hashCode() {
        int result = cpuArch.hashCode();
        result = 31 * result + env.hashCode();
        return result;
    }

    @Override
    public int compareTo(Arch o) {
        int res = cpuArch.compareTo(o.cpuArch);
        if (res == 0)
            res = env.compareTo(o.env);
        return res;
    }


    static public Arch parse(String s) {
        String[] chunks = s.split("-");
        CpuArch cpuArch;
        Environment env = Environment.Native;
        if (chunks.length == 1) {
            // arch only, already parsed s
            cpuArch = CpuArch.valueOf(chunks[0]);
        } else if (chunks.length == 2) {
            cpuArch = CpuArch.valueOf(chunks[0]);
            env = Environment.parse(chunks[1]);
        } else {
            throw new IllegalArgumentException("Unexpected Slice configuration `" + s + "`");
        }

        return new Arch(cpuArch, env);
    }

    public boolean is32Bit() {
        return cpuArch.is32Bit();
    }

    public ByteOrder getByteOrder() {
        return cpuArch.getByteOrder();
    }

    public boolean isArm() {
        return cpuArch.isArm();
    }

    public String getLlvmCpu() {
        return cpuArch.getLlvmCpu();
    }
}
