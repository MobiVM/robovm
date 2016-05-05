#ifndef ROBOVM_SHADOW_FRAMES_H
#define ROBOVM_SHADOW_FRAMES_H

void rvmPushShadowFrame(Env* env, ShadowFrame* frame);
void rvmPopShadowFrame(Env* env);
void rvmPushShadowFrameLineNumber(ShadowFrame* frame, jint lineNumber);

#endif