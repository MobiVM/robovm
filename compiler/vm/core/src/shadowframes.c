#include <robovm.h>

#define LOG_TAG "shadowframes"

void rvmPushShadowFrame(Env* env, void* functionAddress) {
    ShadowFrame* frame = rvmAllocateMemory(env, sizeof(ShadowFrame));
    frame->functionAddress = functionAddress;

    frame->prev = env->shadowFrame;
    env->shadowFrame = frame;
}

void rvmPopShadowFrame(Env* env) {
    if(env->shadowFrame) {
        env->shadowFrame = env->shadowFrame->prev;
    }
}

void rvmPushShadowFrameLineNumber(Env* env, jint lineNumber) {
    env->shadowFrame->lineNumber = lineNumber;
}
