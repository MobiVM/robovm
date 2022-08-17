/*
 * Copyright (C) 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

#define LOG_TAG "Log"

#include <memory>

#include "jni.h"
#include <log/log.h>
#include <nativehelper/JNIHelp.h>
#include <nativehelper/jni_macros.h>

typedef std::unique_ptr<char const[], std::function<void(char const*)>> jni_string;

static void Log_log(JNIEnv* env, jclass, jint priority, jstring msg, jthrowable throwable) {
  if (msg == NULL) {
    jniThrowNullPointerException(env, "Log needs a message");
    return;
  }

  std::unique_ptr<char const[], std::function<void(char const*)>> message(
      env->GetStringUTFChars(msg, 0),
      [=](char const* p) mutable{ env->ReleaseStringUTFChars(msg, p); }
  );

  LOG_PRI(priority, "Log", "%s", message.get());

  if (throwable != NULL) {
      jniLogException(env, priority, "Log", throwable);
  }
}

static JNINativeMethod gMethods[] = {
  NATIVE_METHOD(Log, log, "(ILjava/lang/String;Ljava/lang/Throwable;)V"),
};
void register_com_android_i18n_util_Log(JNIEnv* env) {
  jniRegisterNativeMethods(env, "com/android/i18n/util/Log", gMethods, NELEM(gMethods));
}
