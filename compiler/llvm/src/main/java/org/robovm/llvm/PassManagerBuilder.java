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

import org.robovm.llvm.binding.LLVM;
import org.robovm.llvm.binding.LLVM.LLVMPassManagerBuilderRef;

/**
 * 
 */
public class PassManagerBuilder implements AutoCloseable {
    protected LLVMPassManagerBuilderRef ref;

    public PassManagerBuilder() {
        ref = LLVM.LLVMPassManagerBuilderCreate();
        if (ref == null) {
            throw new LlvmException("Failed to create PassManagerBuilder");
        }
    }

    protected final void checkDisposed() {
        if (ref == null) {
            throw new LlvmException("Already disposed");
        }
    }

    public synchronized void dispose() {
        checkDisposed();
        LLVM.LLVMPassManagerBuilderDispose(ref);
        ref = null;
    }

    @Override
    public void close() {
        dispose();
    }

    public void setDisableSimplifyLibCalls(boolean b) {
        checkDisposed();
        LLVM.LLVMPassManagerBuilderSetDisableSimplifyLibCalls(ref, b ? 1 : 0);
    }

    public void setDisableUnitAtATime(boolean b) {
        checkDisposed();
        LLVM.LLVMPassManagerBuilderSetDisableUnitAtATime(ref, b ? 1 : 0);
    }

    public void setDisableUnrollLoops(boolean b) {
        checkDisposed();
        LLVM.LLVMPassManagerBuilderSetDisableUnrollLoops(ref, b ? 1 : 0);
    }

    public void setDisableTailCalls(boolean b) {
        checkDisposed();
        LLVM.LLVMPassManagerBuilderSetDisableTailCalls(ref, b ? 1 : 0);
    }

    public void setSetOptLevel(int level) {
        checkDisposed();
        LLVM.LLVMPassManagerBuilderSetOptLevel(ref, level);
    }

    public void setSetSizeLevel(int level) {
        checkDisposed();
        LLVM.LLVMPassManagerBuilderSetSizeLevel(ref, level);
    }

    public void useInlinerWithThreshold(int threshold) {
        checkDisposed();
        LLVM.LLVMPassManagerBuilderUseInlinerWithThreshold(ref, threshold);
    }

    public void useAlwaysInliner(boolean insertLifeTime) {
        checkDisposed();
        LLVM.LLVMPassManagerBuilderUseAlwaysInliner(ref, insertLifeTime ? 1 : 0);
    }

    public void populateFunctionPassManager(PassManager passManager) {
        checkDisposed();
        LLVM.LLVMPassManagerBuilderPopulateFunctionPassManager(ref, passManager.ref);
    }

    public void populateModulePassManager(PassManager passManager) {
        checkDisposed();
        LLVM.LLVMPassManagerBuilderPopulateModulePassManager(ref, passManager.ref);
    }

    public void populateLTOPassManager(PassManager passManager, boolean internalize, boolean runInliner) {
        checkDisposed();
        LLVM.LLVMPassManagerBuilderPopulateLTOPassManager(ref, passManager.ref, internalize ? 1 : 0, runInliner ? 1 : 0);
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
        PassManagerBuilder other = (PassManagerBuilder) obj;
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
