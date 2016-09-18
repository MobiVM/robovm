#include <robovm.h>
#include <string.h>

#define LOG_TAG "shadowframes"

int popcount = 0;

void rvmPushShadowFrame(Env* env, void* functionAddress, void* functionName) {
    ShadowFrame* frame = rvmAllocateMemory(env, sizeof(ShadowFrame));
    frame->functionAddress = functionAddress;

    int length = strlen((char*) functionName) + 1;
    char* functionNamePtr = rvmAllocateMemory(env, length);
    strncpy(functionNamePtr, (char*) functionName, length);

    frame->functionName = functionNamePtr;
    frame->prev = env->shadowFrame;
    env->shadowFrame = frame;
        
    popcount++;

    ERRORF("PUSH %s with FRAME %i", (char*) functionName, popcount);
}

void rvmPopShadowFrame(Env* env) {
    if(env->shadowFrame) {
        ERRORF("POP %s with FRAME %i", env->shadowFrame->functionName, popcount);

        popcount--;
        
        env->shadowFrame = env->shadowFrame->prev;
    }
}

void rvmPushShadowFrameLineNumber(Env* env, jint lineNumber) {
    env->shadowFrame->lineNumber = lineNumber;
    ERRORF("LINE %s %i with FRAME %i", env->shadowFrame->functionName, lineNumber, popcount);
}
