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
import org.robovm.llvm.binding.LLVM.LLVMTargetOptionsRef;

/**
 * 
 */
public class TargetOptions {
    protected LLVMTargetOptionsRef ref;

    TargetOptions(LLVMTargetOptionsRef ref) {
        this.ref = ref;
    }

    public boolean getPrintMachineCode() {
        return LLVM.LLVMTargetOptionsGetPrintMachineCode(ref) != 0;
    }

    public void setPrintMachineCode(boolean value) {
        LLVM.LLVMTargetOptionsSetPrintMachineCode(ref, value ? 1 : 0);
    }

    public boolean getLessPreciseFPMADOption() {
        return LLVM.LLVMTargetOptionsGetLessPreciseFPMADOption(ref) != 0;
    }

    public void setLessPreciseFPMADOption(boolean value) {
        LLVM.LLVMTargetOptionsSetLessPreciseFPMADOption(ref, value ? 1 : 0);
    }

    public boolean getUnsafeFPMath() {
        return LLVM.LLVMTargetOptionsGetUnsafeFPMath(ref) != 0;
    }

    public void setUnsafeFPMath(boolean value) {
        LLVM.LLVMTargetOptionsSetUnsafeFPMath(ref, value ? 1 : 0);
    }

    public boolean getNoInfsFPMath() {
        return LLVM.LLVMTargetOptionsGetNoInfsFPMath(ref) != 0;
    }

    public void setNoInfsFPMath(boolean value) {
        LLVM.LLVMTargetOptionsSetNoInfsFPMath(ref, value ? 1 : 0);
    }

    public boolean getNoNaNsFPMath() {
        return LLVM.LLVMTargetOptionsGetNoNaNsFPMath(ref) != 0;
    }

    public void setNoNaNsFPMath(boolean value) {
        LLVM.LLVMTargetOptionsSetNoNaNsFPMath(ref, value ? 1 : 0);
    }

    public boolean getHonorSignDependentRoundingFPMathOption() {
        return LLVM.LLVMTargetOptionsGetHonorSignDependentRoundingFPMathOption(ref) != 0;
    }

    public void setHonorSignDependentRoundingFPMathOption(boolean value) {
        LLVM.LLVMTargetOptionsSetHonorSignDependentRoundingFPMathOption(ref, value ? 1 : 0);
    }

    public boolean getNoZerosInBSS() {
        return LLVM.LLVMTargetOptionsGetNoZerosInBSS(ref) != 0;
    }

    public void setNoZerosInBSS(boolean value) {
        LLVM.LLVMTargetOptionsSetNoZerosInBSS(ref, value ? 1 : 0);
    }

    public boolean getGuaranteedTailCallOpt() {
        return LLVM.LLVMTargetOptionsGetGuaranteedTailCallOpt(ref) != 0;
    }

    public void setGuaranteedTailCallOpt(boolean value) {
        LLVM.LLVMTargetOptionsSetGuaranteedTailCallOpt(ref, value ? 1 : 0);
    }

    public int getStackAlignmentOverride() {
        return LLVM.LLVMTargetOptionsGetStackAlignmentOverride(ref);
    }

    public void setStackAlignmentOverride(int value) {
        LLVM.LLVMTargetOptionsSetStackAlignmentOverride(ref, value);
    }

    public boolean getEnableFastISel() {
        return LLVM.LLVMTargetOptionsGetEnableFastISel(ref) != 0;
    }

    public void setEnableFastISel(boolean value) {
        LLVM.LLVMTargetOptionsSetEnableFastISel(ref, value ? 1 : 0);
    }

    public boolean getUseInitArray() {
        return LLVM.LLVMTargetOptionsGetUseInitArray(ref) != 0;
    }

    public void setUseInitArray(boolean value) {
        LLVM.LLVMTargetOptionsSetUseInitArray(ref, value ? 1 : 0);
    }

    public int getFloatABIType() {
        return LLVM.LLVMTargetOptionsGetFloatABIType(ref);
    }

    public void setFloatABIType(int value) {
        LLVM.LLVMTargetOptionsSetFloatABIType(ref, value);
    }

    public int getAllowFPOpFusion() {
        return LLVM.LLVMTargetOptionsGetAllowFPOpFusion(ref);
    }

    public void setAllowFPOpFusion(int value) {
        LLVM.LLVMTargetOptionsSetAllowFPOpFusion(ref, value);
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
        TargetOptions other = (TargetOptions) obj;
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
