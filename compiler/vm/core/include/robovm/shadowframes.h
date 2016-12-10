#ifndef ROBOVM_SHADOW_FRAMES_H
#define ROBOVM_SHADOW_FRAMES_H

void rvmPushShadowFrame(Env* env, void* functionAddress);
void rvmPopShadowFrame(Env* env);
void rvmPushShadowFrameLineNumber(Env* env, jint lineNumber);

#endif
