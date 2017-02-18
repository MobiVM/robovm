#ifndef CLANG_EXTRA_H
#define CLANG_EXTRA_H

#include <llvm-c/Core.h>

#ifdef __cplusplus
extern "C" {
#endif

LLVMBool ClangCompileFile(LLVMContextRef Context, char* Data, char* FileName, char* Triple, LLVMModuleRef *OutM, char **ErrorMessage);

#ifdef __cplusplus
}
#endif

#endif
