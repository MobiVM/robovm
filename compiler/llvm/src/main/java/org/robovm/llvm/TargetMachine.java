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

import java.io.File;
import java.io.OutputStream;

import org.bytedeco.javacpp.BytePointer;
import org.robovm.llvm.binding.LLVM;
import org.robovm.llvm.binding.LLVM.LLVMMemoryBufferRef;
import org.robovm.llvm.binding.LLVM.LLVMTargetMachineRef;

/**
 * 
 */
public class TargetMachine implements AutoCloseable {
    protected LLVMTargetMachineRef ref;

    TargetMachine(LLVMTargetMachineRef ref) {
        this.ref = ref;
    }
    
    protected final void checkDisposed() {
        if (ref == null) {
            throw new LlvmException("Already disposed");
        }
    }
    
    public synchronized void dispose() {
        checkDisposed();
        LLVM.LLVMDisposeTargetMachine(ref);
        ref = null;
    }

    @Override
    public void close() {
        dispose();
    }

    public Target getTarget() {
        checkDisposed();
        return new Target(LLVM.LLVMGetTargetMachineTarget(ref));
    }
    
    public DataLayout getDataLayout() {
        checkDisposed();
        return new DataLayout(LLVM.LLVMCreateTargetDataLayout(ref));
    }
    
    public TargetOptions getOptions() {
        return new TargetOptions(LLVM.LLVMGetTargetMachineTargetOptions(ref));
    }
    
    public String getTriple() {
        checkDisposed();
        return LLVM.LLVMGetTargetMachineTriple(ref).getString();
    }

    public String getCPU() {
        checkDisposed();
        return LLVM.LLVMGetTargetMachineCPU(ref).getString();
    }
    
    public String getFeatureString() {
        checkDisposed();
        return LLVM.LLVMGetTargetMachineFeatureString(ref).getString();
    }
    
    public boolean getAsmVerbosityDefault() {
        return LLVM.LLVMTargetMachineGetAsmVerbosityDefault(ref) != 0;
    }

    public void setAsmVerbosityDefault(boolean value) {
        LLVM.LLVMSetTargetMachineAsmVerbosity(ref, value ? 1 : 0);
    }

    public boolean getDataSections() {
        return LLVM.LLVMTargetMachineGetDataSections(ref) != 0;
    }

    public boolean getFunctionSections() {
        return LLVM.LLVMTargetMachineGetFunctionSections(ref) != 0;
    }

    public void setDataSections(boolean value) {
        LLVM.LLVMTargetMachineSetDataSections(ref, value ? 1 : 0);
    }

    public void setFunctionSections(boolean value) {
        LLVM.LLVMTargetMachineSetFunctionSections(ref, value ? 1 : 0);
    }
    
    public void emit(Module module, File outFile, int fileType) {
        checkDisposed();
        module.checkDisposed();
        BytePointer error = new BytePointer();
        if (LLVM.LLVMTargetMachineEmitToFile(ref, module.getRef(), new BytePointer(outFile.getAbsolutePath()), fileType, error) != 0) {
            // Returns true on failure!
            throw new LlvmException(error.getString());
        }
    }

    public void assemble(byte[] asm, File outFile) {
        LLVMMemoryBufferRef memoryBufferRef = LLVM.LLVMCreateMemoryBufferWithMemoryRangeCopy(new BytePointer(asm), asm.length, new BytePointer(outFile.getAbsolutePath()));
        if (memoryBufferRef == null) {
            throw new LlvmException("Failed to create memory buffer");
        }
        BytePointer errorMessage = new BytePointer();
        // LLVMTargetMachineAssembleToOutputStream() takes ownership of the MemoryBuffer so there's no need for us
        // to dispose of it
        if (LLVM.LLVMTargetMachineAssembleToFile(ref, memoryBufferRef, new BytePointer(outFile.getAbsolutePath()), 0, 1, 1, 0, errorMessage) != 0) {
            String error = errorMessage.getString() != null 
                    ? errorMessage.getString().trim() 
                    : "Unknown error";
            throw new LlvmException(error);
        }
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
        TargetMachine other = (TargetMachine) obj;
        if (ref == null) {
            if (other.ref != null) {
                return false;
            }
        } else if (!ref.equals(other.ref)) {
            return false;
        }
        return true;
    }
}
