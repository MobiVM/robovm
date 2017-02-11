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
import org.robovm.llvm.binding.LLVM.LLVMPassManagerRef;

/**
 * 
 */
public class PassManager implements AutoCloseable {
    protected LLVMPassManagerRef ref;

    public PassManager() {
        ref = LLVM.LLVMCreatePassManager();
        if (ref == null) {
            throw new LlvmException("Failed to create PassManager");
        }
    }

    protected final void checkDisposed() {
        if (ref == null) {
            throw new LlvmException("Already disposed");
        }
    }

    public synchronized void dispose() {
        checkDisposed();
        LLVM.LLVMDisposePassManager(ref);
        ref = null;
    }

    @Override
    public void close() {
        dispose();
    }

    public void addAggressiveDCEPass() {
        checkDisposed();
        LLVM.LLVMAddAggressiveDCEPass(ref);
    }
    public void addAlwaysInlinerPass() {
        checkDisposed();
        LLVM.LLVMAddAlwaysInlinerPass(ref);
    }
    public void addArgumentPromotionPass() {
        checkDisposed();
        LLVM.LLVMAddArgumentPromotionPass(ref);
    }
    public void addBasicAliasAnalysisPass() {
        checkDisposed();
        LLVM.LLVMAddBasicAliasAnalysisPass(ref);
    }
    public void addBBVectorizePass() {
        checkDisposed();
        LLVM.LLVMAddBBVectorizePass(ref);
    }
    public void addCFGSimplificationPass() {
        checkDisposed();
        LLVM.LLVMAddCFGSimplificationPass(ref);
    }
    public void addConstantMergePass() {
        checkDisposed();
        LLVM.LLVMAddConstantMergePass(ref);
    }
    public void addConstantPropagationPass() {
        checkDisposed();
        LLVM.LLVMAddConstantPropagationPass(ref);
    }
    public void addCorrelatedValuePropagationPass() {
        checkDisposed();
        LLVM.LLVMAddCorrelatedValuePropagationPass(ref);
    }
    public void addDeadArgEliminationPass() {
        checkDisposed();
        LLVM.LLVMAddDeadArgEliminationPass(ref);
    }
    public void addDeadStoreEliminationPass() {
        checkDisposed();
        LLVM.LLVMAddDeadStoreEliminationPass(ref);
    }
    public void addDemoteMemoryToRegisterPass() {
        checkDisposed();
        LLVM.LLVMAddDemoteMemoryToRegisterPass(ref);
    }
    public void addEarlyCSEPass() {
        checkDisposed();
        LLVM.LLVMAddEarlyCSEPass(ref);
    }
    public void addFunctionAttrsPass() {
        checkDisposed();
        LLVM.LLVMAddFunctionAttrsPass(ref);
    }
    public void addFunctionInliningPass() {
        checkDisposed();
        LLVM.LLVMAddFunctionInliningPass(ref);
    }
    public void addGlobalDCEPass() {
        checkDisposed();
        LLVM.LLVMAddGlobalDCEPass(ref);
    }
    public void addGlobalOptimizerPass() {
        checkDisposed();
        LLVM.LLVMAddGlobalOptimizerPass(ref);
    }
    public void addGVNPass() {
        checkDisposed();
        LLVM.LLVMAddGVNPass(ref);
    }
    public void addIndVarSimplifyPass() {
        checkDisposed();
        LLVM.LLVMAddIndVarSimplifyPass(ref);
    }
    public void addInstructionCombiningPass() {
        checkDisposed();
        LLVM.LLVMAddInstructionCombiningPass(ref);
    }
    public void addInternalizePass(boolean allButMain) {
        checkDisposed();
        LLVM.LLVMAddInternalizePass(ref, allButMain ? 1 : 0);
    }
    public void addIPConstantPropagationPass() {
        checkDisposed();
        LLVM.LLVMAddIPConstantPropagationPass(ref);
    }
    public void addIPSCCPPass() {
        checkDisposed();
        LLVM.LLVMAddIPSCCPPass(ref);
    }
    public void addJumpThreadingPass() {
        checkDisposed();
        LLVM.LLVMAddJumpThreadingPass(ref);
    }
    public void addLICMPass() {
        checkDisposed();
        LLVM.LLVMAddLICMPass(ref);
    }
    public void addLoopDeletionPass() {
        checkDisposed();
        LLVM.LLVMAddLoopDeletionPass(ref);
    }
    public void addLoopIdiomPass() {
        checkDisposed();
        LLVM.LLVMAddLoopIdiomPass(ref);
    }
    public void addLoopRotatePass() {
        checkDisposed();
        LLVM.LLVMAddLoopRotatePass(ref);
    }
    public void addLoopUnrollPass() {
        checkDisposed();
        LLVM.LLVMAddLoopUnrollPass(ref);
    }
    public void addLoopUnswitchPass() {
        checkDisposed();
        LLVM.LLVMAddLoopUnswitchPass(ref);
    }
    public void addLoopVectorizePass() {
        checkDisposed();
        LLVM.LLVMAddLoopVectorizePass(ref);
    }
    public void addLowerExpectIntrinsicPass() {
        checkDisposed();
        LLVM.LLVMAddLowerExpectIntrinsicPass(ref);
    }
    public void addMemCpyOptPass() {
        checkDisposed();
        LLVM.LLVMAddMemCpyOptPass(ref);
    }
    public void addPromoteMemoryToRegisterPass() {
        checkDisposed();
        LLVM.LLVMAddPromoteMemoryToRegisterPass(ref);
    }
    public void addPruneEHPass() {
        checkDisposed();
        LLVM.LLVMAddPruneEHPass(ref);
    }
    public void addReassociatePass() {
        checkDisposed();
        LLVM.LLVMAddReassociatePass(ref);
    }
    public void addScalarReplAggregatesPass() {
        checkDisposed();
        LLVM.LLVMAddScalarReplAggregatesPass(ref);
    }
    public void addScalarReplAggregatesPassSSA() {
        checkDisposed();
        LLVM.LLVMAddScalarReplAggregatesPassSSA(ref);
    }
    public void addScalarReplAggregatesPassWithThreshold(int threshold) {
        checkDisposed();
        LLVM.LLVMAddScalarReplAggregatesPassWithThreshold(ref, threshold);
    }
    public void addSCCPPass() {
        checkDisposed();
        LLVM.LLVMAddSCCPPass(ref);
    }
    public void addSimplifyLibCallsPass() {
        checkDisposed();
        LLVM.LLVMAddSimplifyLibCallsPass(ref);
    }
    public void addSLPVectorizePass() {
        checkDisposed();
        LLVM.LLVMAddSLPVectorizePass(ref);
    }
    public void addStripDeadPrototypesPass() {
        checkDisposed();
        LLVM.LLVMAddStripDeadPrototypesPass(ref);
    }
    public void addStripSymbolsPass() {
        checkDisposed();
        LLVM.LLVMAddStripSymbolsPass(ref);
    }
    public void addTailCallEliminationPass() {
        checkDisposed();
        LLVM.LLVMAddTailCallEliminationPass(ref);
    }
    public void addTypeBasedAliasAnalysisPass() {
        checkDisposed();
        LLVM.LLVMAddTypeBasedAliasAnalysisPass(ref);
    }
    public void addVerifierPass() {
        checkDisposed();
        LLVM.LLVMAddVerifierPass(ref);
    }
    
    public void run(Module module) {
        checkDisposed();
        LLVM.LLVMRunPassManager(ref, module.getRef());
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
        PassManager other = (PassManager) obj;
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
