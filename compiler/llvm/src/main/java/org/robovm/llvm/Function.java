/*
 * Copyright (C) 2015 RoboVM AB
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

import org.robovm.llvm.binding.LLVM;
import org.robovm.llvm.binding.LLVM.LLVMValueRef;


/**
 * 
 */
public class Function {
    private LLVMValueRef ref;
    
    public static int[] FUNCTION_ATTRIBUTES = {
    		LLVM.LLVMZExtAttribute,
    		LLVM.LLVMSExtAttribute,
    		LLVM.LLVMNoReturnAttribute,
    		LLVM.LLVMInRegAttribute,
    		LLVM.LLVMStructRetAttribute,
    		LLVM.LLVMNoUnwindAttribute,
    		LLVM.LLVMNoAliasAttribute,
    		LLVM.LLVMByValAttribute,
    		LLVM.LLVMNestAttribute,
    		LLVM.LLVMReadNoneAttribute,
    		LLVM.LLVMReadOnlyAttribute,
    		LLVM.LLVMNoInlineAttribute,
    		LLVM.LLVMAlwaysInlineAttribute,
    		LLVM.LLVMOptimizeForSizeAttribute,
    		LLVM.LLVMStackProtectAttribute,
    		LLVM.LLVMStackProtectReqAttribute,
    		LLVM.LLVMAlignment,
    		LLVM.LLVMNoCaptureAttribute,
    		LLVM.LLVMNoRedZoneAttribute,
    		LLVM.LLVMNoImplicitFloatAttribute,
    		LLVM.LLVMNakedAttribute,
    		LLVM.LLVMInlineHintAttribute,
    		LLVM.LLVMStackAlignment,
    		LLVM.LLVMReturnsTwice,
    		LLVM.LLVMUWTable,
    		LLVM.LLVMNonLazyBind
    };

    Function(LLVMValueRef ref) {
        this.ref = ref;
    }

    protected LLVMValueRef getRef() {
        return ref;
    }
    
    public String getName() {
        return LLVM.LLVMGetValueName(getRef()).getString();
    }
    
    public int getLinkage() {
        return LLVM.LLVMGetLinkage(getRef());
    }

    public void setLinkage(int linkage) {
        LLVM.LLVMSetLinkage(getRef(), linkage);
    }
    
    public Integer[] getAttributes() {
        int mask = LLVM.LLVMGetFunctionAttr(getRef());
        List<Integer> result = new ArrayList<>();
        for (int a : FUNCTION_ATTRIBUTES) {
            if ((a & mask) != 0) {
                result.add(a);
            }
        }
        return result.toArray(new Integer[result.size()]);
    }
    
    public void addAttribute(int attribute) {
        LLVM.LLVMAddFunctionAttr(getRef(), attribute);
    }

    public void removeAttribute(int attribute) {
        LLVM.LLVMRemoveFunctionAttr(getRef(), attribute);
    }
}
