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

#pragma once

#include <nativehelper/JNIHelp.h>
#include <nativehelper/jni_macros.h>

#include "unicode/parseerr.h"
#include "unicode/regex.h"

/**
 * Encapsulates an instance of ICU4C's RegexMatcher class along with a copy of
 * the input it's currently operating on in the native heap.
 *
 * Rationale: We choose to make a copy here because it turns out to be a lot
 * cheaper when a moving GC and/or string compression is enabled. This is
 * because env->GetStringChars() always copies in this scenario. This becomes
 * especially bad when the String in question is long and/or contains a large
 * number of matches.
 *
 * Drawbacks: The native allocation associated with this class is no longer
 * fixed size, but NativeAllocationRegistry should be able to determine
 * the native heap size by mallinfo().
 */
class MatcherState {
public:
    MatcherState(icu::RegexMatcher* matcher);
    ~MatcherState();

    bool updateInput(JNIEnv* env, jstring input);

    icu::RegexMatcher* matcher();

    UErrorCode& status();

    void updateOffsets(JNIEnv* env, jintArray javaOffsets);

private:
    std::unique_ptr<icu::RegexMatcher> mMatcher;
    std::unique_ptr<UChar[]> mUChars;
    UText* mUText;
    UErrorCode mStatus;

    // Disallow copy and assignment.
    MatcherState(const MatcherState&);
    void operator=(const MatcherState&);
};