#include <robovm.h>

void rvmPushShadowFrame(Env* env, ShadowFrame* frame) {
    frame->prev = env->shadowFrame;
    env->shadowFrame = frame;
}

void rvmPopShadowFrame(Env* env) {
    if(env->shadowFrame) {
        env->shadowFrame = env->shadowFrame->prev;
    }
}