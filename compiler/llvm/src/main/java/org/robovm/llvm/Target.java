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
package org.robovm.llvm;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.bytedeco.javacpp.BytePointer;
import org.robovm.llvm.binding.LLVM;
import org.robovm.llvm.binding.LLVM.LLVMTargetMachineRef;
import org.robovm.llvm.binding.LLVM.LLVMTargetRef;

/**
 * 
 */
public class Target {
    private static final String HOST_TRIPLE = LLVM.llvmHostTriple().getString();
    
    protected LLVMTargetRef ref;
    private String name;
    private String description;
    
    static {
    	LLVM.LLVMStartMultithreaded();
        LLVM.LLVMInitializeAllTargets();
        LLVM.LLVMInitializeAllTargetInfos();
        LLVM.LLVMInitializeAllTargetMCs();
        LLVM.LLVMInitializeAllAsmPrinters();
        LLVM.LLVMInitializeAllAsmParsers();
    }

    Target(LLVMTargetRef ref) {
        this.ref = ref;
        this.name = LLVM.LLVMGetTargetName(ref).getString();
        this.description = LLVM.LLVMGetTargetDescription(ref).getString();
    }

    public String getName() {
        return name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public boolean hasJIT() {
        return LLVM.LLVMTargetHasJIT(ref) != 0;
    }

    public boolean hasTargetMachine() {
        return LLVM.LLVMTargetHasTargetMachine(ref) != 0;
    }

    public boolean hasAsmBackend() {
        return LLVM.LLVMTargetHasAsmBackend(ref) != 0;
    }

    public TargetMachine createTargetMachine(String triple) {
        return createTargetMachine(triple, null, null, LLVM.LLVMCodeGenLevelDefault, LLVM.LLVMRelocDefault, LLVM.LLVMCodeModelDefault);
    }
    
    public TargetMachine createTargetMachine(String triple, String cpu, String features, 
    		int optLevel, int relocMode, int codeModel) {
        
        if (triple == null) {
            throw new NullPointerException("triple");
        }
        
        cpu = cpu == null ? "" : cpu;
        features = features == null ? "" : features;
        
        LLVMTargetMachineRef machineRef = LLVM.LLVMCreateTargetMachine(ref, triple, cpu, features, optLevel, relocMode, codeModel);
        if (machineRef == null) {
            throw new LlvmException("Failed to create TargetMachine for triple '" + triple + "'");
        }
        return new TargetMachine(machineRef);
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((ref == null) ? 0 : ref.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Target other = (Target) obj;
        if (ref == null) {
            if (other.ref != null) {
                return false;
            }
        } else if (!ref.equals(other.ref)) {
            return false;
        }
        return true;
    }

    public static String getHostTriple() {
        return HOST_TRIPLE;
    }
    
    public static Target getHostTarget() {
        return lookupTarget(HOST_TRIPLE);
    }
    
    public static Target getTarget(String name) {
        if (name == null) {
            throw new NullPointerException("name");
        }
        LLVMTargetRef ref = LLVM.LLVMGetFirstTarget();
        while (ref != null) {
            if (name.equals(LLVM.LLVMGetTargetName(ref).getString())) {
                return new Target(ref);
            }
            ref = LLVM.LLVMGetNextTarget(ref);
        }
        throw new LlvmException("No target with name '" + name + "' found");
    }

    public static Target lookupTarget(String triple) {
        if (triple == null) {
            throw new NullPointerException("triple");
        }
        BytePointer error = new BytePointer();
        LLVMTargetRef ref = LLVM.LLVMLookupTarget(triple, error);
        if (ref == null) {
            throw new LlvmException(error.getString());
        }
        return new Target(ref);
    }
    
    public static List<Target> getTargets() {
        List<Target> result = new ArrayList<Target>();
        LLVMTargetRef ref = LLVM.LLVMGetFirstTarget();
        while (ref != null) {
            result.add(new Target(ref));
            ref = LLVM.LLVMGetNextTarget(ref);
        }
        return result;
    }
    
    public static Map<String, Target> getTargetsMap() {
        Map<String, Target> result = new TreeMap<String, Target>();
        for (Target target : getTargets()) {
            result.put(target.name, target);
        }
        return result;
    }
}
