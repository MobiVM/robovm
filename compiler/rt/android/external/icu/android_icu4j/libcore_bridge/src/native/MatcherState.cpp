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

#define LOG_TAG "MatcherState"

#include "IcuUtilities.h"
#include "MatcherState.h"

#include <android-base/logging.h>

#include <nativehelper/ScopedPrimitiveArray.h>
#include <nativehelper/ScopedStringChars.h>


MatcherState::MatcherState(icu::RegexMatcher* matcher) :
    mMatcher(matcher),
    mUChars(nullptr),
    mUText(nullptr),
    mStatus(U_ZERO_ERROR) {
}

bool MatcherState::updateInput(JNIEnv* env, jstring input) {
    // First, close the UText struct, since we're about to allocate a new one.
    if (mUText != nullptr) {
        utext_close(mUText);
        mUText = nullptr;
    }

    // Then delete the UChar* associated with the UText struct..
    mUChars.reset(nullptr);

    // TODO: We should investigate whether we can avoid an additional copy
    // in the native heap when is_copy == JNI_TRUE. The problem with doing
    // that is that we might call ReleaseStringChars with a different
    // JNIEnv* on a different downcall. This is currently safe as
    // implemented in ART, but is unlikely to be portable and the spec stays
    // silent on the matter.
    ScopedStringChars inputChars(env, input);
    if (inputChars.get() == nullptr) {
        // There will be an exception pending if we get here.
        return false;
    }

    // Make a copy of |input| on the native heap. This copy will be live
    // until the next call to updateInput or close.
    mUChars.reset(new (std::nothrow) UChar[inputChars.size()]);
    if (mUChars.get() == nullptr) {
        env->ThrowNew(env->FindClass("Ljava/lang/OutOfMemoryError;"), "Out of memory");
        return false;
    }

    static_assert(sizeof(UChar) == sizeof(jchar), "sizeof(Uchar) != sizeof(jchar)");
    memcpy(mUChars.get(), inputChars.get(), inputChars.size() * sizeof(jchar));

    // Reset any errors that might have occurred on previous patches.
    mStatus = U_ZERO_ERROR;
    mUText = utext_openUChars(nullptr, mUChars.get(), inputChars.size(), &mStatus);
    if (mUText == nullptr) {
        CHECK(maybeThrowIcuException(env, "utext_openUChars", mStatus));
        return false;
    }

    // It is an error for ICU to have returned a non-null mUText but to
    // still have indicated an error.
    CHECK(U_SUCCESS(mStatus));

    mMatcher->reset(mUText);
    return true;
}

MatcherState::~MatcherState() {
    if (mUText != nullptr) {
        utext_close(mUText);
    }
}

icu::RegexMatcher* MatcherState::matcher() {
    return mMatcher.get();
}

UErrorCode& MatcherState::status() {
    return mStatus;
}

void MatcherState::updateOffsets(JNIEnv* env, jintArray javaOffsets) {
    ScopedIntArrayRW offsets(env, javaOffsets);
    if (offsets.get() == NULL) {
        return;
    }

    for (size_t i = 0, groupCount = mMatcher->groupCount(); i <= groupCount; ++i) {
        offsets[2*i + 0] = mMatcher->start(i, mStatus);
        offsets[2*i + 1] = mMatcher->end(i, mStatus);
    }
}
