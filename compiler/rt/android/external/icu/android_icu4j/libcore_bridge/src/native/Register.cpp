/*
 * Copyright (C) 2010 The Android Open Source Project
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

#define LOG_TAG "Register"

#include <stdlib.h>
#include <nativehelper/ScopedLocalFrame.h>
#include <log/log.h>

#include <unicode/uclean.h>

#include "JniConstants.h"

// ART calls this on startup, so we can statically register all our native methods.
jint JNI_OnLoad(JavaVM* vm, void*) {
    ALOGV("libicu_jni JNI_OnLoad");
    JNIEnv* env;
    if (vm->GetEnv(reinterpret_cast<void**>(&env), JNI_VERSION_1_6) != JNI_OK) {
        ALOGE("JavaVM::GetEnv() failed");
        abort();
    }

    ScopedLocalFrame localFrame(env);

    // Failures to find the ICU data tend to be somewhat obscure because ICU loads
    // its data on first use, which can be anywhere. Force loading of a portion of
    // ICU's data up front so we can report a nice clear error and bail.
    UErrorCode status = U_ZERO_ERROR;
    u_init(&status);
    if (status != U_ZERO_ERROR) {
      ALOGE("Couldn't initialize ICU (u_init): %s", u_errorName(status));
      abort();
    }


#define REGISTER(FN) extern void FN(JNIEnv*); FN(env)
    REGISTER(register_com_android_icu_text_TimeZoneNamesNative);
    REGISTER(register_com_android_i18n_timezone_internal_Memory);
    REGISTER(register_com_android_i18n_util_Log);
    REGISTER(register_com_android_icu_util_CaseMapperNative);
    REGISTER(register_com_android_icu_util_Icu4cMetadata);
    REGISTER(register_com_android_icu_util_LocaleNative);
    REGISTER(register_com_android_icu_util_regex_PatternNative);
    REGISTER(register_com_android_icu_util_regex_MatcherNative);
    REGISTER(register_com_android_icu_util_charset_NativeConverter);
#undef REGISTER

    JniConstants::Initialize(env);
    return JNI_VERSION_1_6;
}

// ART calls this on shutdown, do any global cleanup here.
// -- Very important if we restart multiple ART runtimes in the same process to reset the state.
void JNI_OnUnload(JavaVM*, void*) {
    // Don't use the JavaVM in this method. ART only calls this once all threads are
    // unregistered.
    ALOGV("libicu_jni JNI_OnUnload");
    JniConstants::Invalidate();

    // De-init ICU. Do the opposite of the above u_init() function.
    u_cleanup();
}
