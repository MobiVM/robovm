#ifndef LLVM_EXTRA_H
#define LLVM_EXTRA_H

#include <llvm-c/Core.h>
#include <llvm-c/Transforms/PassManagerBuilder.h>
#include <llvm-c/Object.h>

#ifdef __cplusplus
extern "C" {
#endif

typedef enum LLVMFloatABIType {
    LLVMFloatABITypeDefault,
    LLVMFloatABITypeSoft,
    LLVMFloatABITypeHard
} LLVMFloatABIType;

typedef enum LLVMFPOpFusionMode {
    LLVMFPOpFusionModeFast,
    LLVMFPOpFusionModeStandard,
    LLVMFPOpFusionModeStrict
} LLVMFPOpFusionMode;

typedef enum LLVMPIELevel {
  LLVMPIELevelDefault = 0,
  LLVMPIELevelSmall = 1,
  LLVMPIELevelLarge = 2
} LLVMPIELevel;

typedef struct LLVMOpaqueTargetOptions *LLVMTargetOptionsRef;

extern const char *llvmHostTriple;

void LLVMPassManagerBuilderSetDisableTailCalls(LLVMPassManagerBuilderRef PMB,
                                            LLVMBool Value);
void LLVMPassManagerBuilderUseAlwaysInliner(LLVMPassManagerBuilderRef PMB, LLVMBool InsertLifetime);

LLVMBool LLVMParseIR(LLVMMemoryBufferRef MemBuf,
                          LLVMModuleRef *OutModule, char **OutMessage);

LLVMBool LLVMParseIRInContext(LLVMContextRef ContextRef,
                                   LLVMMemoryBufferRef MemBuf,
                                   LLVMModuleRef *OutModule,
                                   char **OutMessage);

LLVMTargetRef LLVMLookupTarget(const char *Triple, char **ErrorMessage);

LLVMBool LLVMTargetMachineGetAsmVerbosityDefault(LLVMTargetMachineRef T);
LLVMBool LLVMTargetMachineGetDataSections(LLVMTargetMachineRef T);
LLVMBool LLVMTargetMachineGetFunctionSections(LLVMTargetMachineRef T);
void LLVMTargetMachineSetDataSections(LLVMTargetMachineRef T, LLVMBool Value);
void LLVMTargetMachineSetFunctionSections(LLVMTargetMachineRef T, LLVMBool Value);

LLVMTargetOptionsRef LLVMGetTargetMachineTargetOptions(LLVMTargetMachineRef T);

LLVMBool LLVMTargetOptionsGetPrintMachineCode(LLVMTargetOptionsRef O);
void LLVMTargetOptionsSetPrintMachineCode(LLVMTargetOptionsRef O, LLVMBool V);
LLVMBool LLVMTargetOptionsGetLessPreciseFPMADOption(LLVMTargetOptionsRef O);
void LLVMTargetOptionsSetLessPreciseFPMADOption(LLVMTargetOptionsRef O, LLVMBool V);
LLVMBool LLVMTargetOptionsGetUnsafeFPMath(LLVMTargetOptionsRef O);
void LLVMTargetOptionsSetUnsafeFPMath(LLVMTargetOptionsRef O, LLVMBool V);
LLVMBool LLVMTargetOptionsGetNoInfsFPMath(LLVMTargetOptionsRef O);
void LLVMTargetOptionsSetNoInfsFPMath(LLVMTargetOptionsRef O, LLVMBool V);
LLVMBool LLVMTargetOptionsGetNoNaNsFPMath(LLVMTargetOptionsRef O);
void LLVMTargetOptionsSetNoNaNsFPMath(LLVMTargetOptionsRef O, LLVMBool V);
LLVMBool LLVMTargetOptionsGetHonorSignDependentRoundingFPMathOption(LLVMTargetOptionsRef O);
void LLVMTargetOptionsSetHonorSignDependentRoundingFPMathOption(LLVMTargetOptionsRef O, LLVMBool V);
LLVMBool LLVMTargetOptionsGetNoZerosInBSS(LLVMTargetOptionsRef O);
void LLVMTargetOptionsSetNoZerosInBSS(LLVMTargetOptionsRef O, LLVMBool V);
LLVMBool LLVMTargetOptionsGetGuaranteedTailCallOpt(LLVMTargetOptionsRef O);
void LLVMTargetOptionsSetGuaranteedTailCallOpt(LLVMTargetOptionsRef O, LLVMBool V);
unsigned LLVMTargetOptionsGetStackAlignmentOverride(LLVMTargetOptionsRef O);
void LLVMTargetOptionsSetStackAlignmentOverride(LLVMTargetOptionsRef O, unsigned V);
LLVMBool LLVMTargetOptionsGetEnableFastISel(LLVMTargetOptionsRef O);
void LLVMTargetOptionsSetEnableFastISel(LLVMTargetOptionsRef O, LLVMBool V);
LLVMBool LLVMTargetOptionsGetUseInitArray(LLVMTargetOptionsRef O);
void LLVMTargetOptionsSetUseInitArray(LLVMTargetOptionsRef O, LLVMBool V);
LLVMFloatABIType LLVMTargetOptionsGetFloatABIType(LLVMTargetOptionsRef O);
void LLVMTargetOptionsSetFloatABIType(LLVMTargetOptionsRef O, LLVMFloatABIType V);
LLVMFPOpFusionMode LLVMTargetOptionsGetAllowFPOpFusion(LLVMTargetOptionsRef O);
void LLVMTargetOptionsSetAllowFPOpFusion(LLVMTargetOptionsRef O, LLVMFPOpFusionMode V);

void LLVMModuleSetPIELevel(LLVMModuleRef M, LLVMPIELevel V);
LLVMPIELevel LLVMModuleGetPIELevel(LLVMModuleRef M);

void *AllocOutputStreamWrapper(JNIEnv *env, jobject OutputStream);
void FreeOutputStreamWrapper(void *p);
int LLVMTargetMachineAssembleToFile(LLVMTargetMachineRef TM, LLVMMemoryBufferRef Mem, char* FilePath,
    LLVMBool RelaxAll, LLVMBool IncrementalLinkerCompatible, LLVMBool DWARFMustBeAtTheEnd, LLVMBool NoExecStack, char **ErrorMessage);
//LLVMBool LLVMTargetMachineEmitToOutputStream(LLVMTargetMachineRef T, LLVMModuleRef M,
//    void *OutputStream, LLVMCodeGenFileType codegen, char** ErrorMessage);

void LLVMGetLineInfoForAddressRange(LLVMObjectFileRef O, uint64_t Address, uint64_t Size, int* OutSize, uint64_t** Out);
size_t LLVMCopySectionContents(LLVMSectionIteratorRef SI, char* Dest, size_t DestSize);
#ifdef __cplusplus
}
#endif

#endif
