#!/bin/bash

BASE=$(cd $(dirname $0); pwd -P)
JAVAOUT="$BASE/src/main/java/org/robovm/llvm/binding"
COUT="$BASE/src/main/native"

function rename {
    from=$1
    to=$2
    if [ $(uname) == 'Darwin' ]; then
    	sed -i '' -e "s/[[:<:]]$from[[:>:]]/$to/g" "$JAVAOUT"/*.java
    else
    	sed -i -e "s/\b$from\b/$to/g" "$JAVAOUT"/*.java
    fi
    mv "$JAVAOUT/$from.java" "$JAVAOUT/$to.java"
}

mkdir -p "$JAVAOUT"
mkdir -p "$COUT"
swig  -I"$BASE/src/main/swig/include" -I"/usr/include" -I"/usr/include/linux" -I"/usr/include/bits" -outdir "$JAVAOUT" -o "$COUT"/LLVM_wrap.c -java -package org.robovm.llvm.binding "$BASE/src/main/swig/LLVM.i"

rename SWIGTYPE_p_LLVMBasicBlockRef BasicBlockRef
rename SWIGTYPE_p_LLVMBuilderRef BuilderRef
rename SWIGTYPE_p_LLVMContextRef ContextRef
rename SWIGTYPE_p_LLVMMemoryBufferRef MemoryBufferRef
rename SWIGTYPE_p_LLVMModuleRef ModuleRef
rename SWIGTYPE_p_LLVMModuleProviderRef ModuleProviderRef
rename SWIGTYPE_p_LLVMPassManagerRef PassManagerRef
rename SWIGTYPE_p_LLVMOpaquePassManagerBuilder PassManagerBuilderRef
rename SWIGTYPE_p_LLVMPassRegistryRef PassRegistryRef
rename SWIGTYPE_p_LLVMTypeRef TypeRef
rename SWIGTYPE_p_LLVMUseRef UseRef
rename SWIGTYPE_p_LLVMValueRef ValueRef
rename SWIGTYPE_p_LLVMOpaqueTargetData TargetDataRef
rename SWIGTYPE_p_LLVMOpaqueTargetLibraryInfotData TargetLibraryInfoRef
rename SWIGTYPE_p_LLVMOpaqueTargetMachine TargetMachineRef
rename SWIGTYPE_p_LLVMTarget TargetRef
rename SWIGTYPE_p_LLVMOpaqueTargetOptions TargetOptionsRef
rename SWIGTYPE_p_LLVMOpaqueObjectFile ObjectFileRef
rename SWIGTYPE_p_LLVMOpaqueRelocationIterator RelocationIteratorRef
rename SWIGTYPE_p_LLVMOpaqueSectionIterator SectionIteratorRef
rename SWIGTYPE_p_LLVMOpaqueSymbolIterator SymbolIteratorRef
rename SWIGTYPE_p_LLVMDiagnosticInfoRef DiagnosticInfoRef
