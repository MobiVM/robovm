/*
 * Copyright (C) 2021 The Android Open Source Project
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

#include <nativehelper/ScopedLocalRef.h>
#include "ScopedBytes.h"

/**
 * ScopedByteBufferArray manages the dynamic buffer array of ScopedBytesRW/ScopedBytesRO.
 */
class ScopedByteBufferArray {
public:
    ScopedByteBufferArray(JNIEnv* env, int isRW)
    : mEnv(env), mIsRW(isRW)
    {
        mArrayPtr = NULL;
        mArraySize = 0;
    }

    ~ScopedByteBufferArray() {
        if(!mArrayPtr) {
            return;
        }

        // Loop over arrary and release memory.
        for (int i = 0; i < mArraySize; ++i) {
            if (!mArrayPtr[i])
                continue;

            if (mIsRW) {
                jobject tmp = ((ScopedBytesRW*)mArrayPtr[i])->getObject();
                delete (ScopedBytesRW*)mArrayPtr[i];
                mEnv->DeleteLocalRef(tmp);
            } else {
                jobject tmp = ((ScopedBytesRO*)mArrayPtr[i])->getObject();
                delete (ScopedBytesRO*)mArrayPtr[i];
                mEnv->DeleteLocalRef(tmp);
            }
        }
        delete[] mArrayPtr;
    }

    bool initArray(int size) {
        if (mArrayPtr) {
            return false;
        }

        mArraySize = size;

        if (mIsRW) {
            mArrayPtr = (void**)(new ScopedBytesRW*[size]);
        }
        else {
            mArrayPtr = (void**)(new ScopedBytesRO*[size]);
        }

        if (!mArrayPtr) {
            return false;
        }

        for (int i=0; i<size; ++i) {
            mArrayPtr[i] = 0;
        }

        return true;
    }

    bool isRW() const {
        return mIsRW;
    }

    bool setArrayItem(int itemNo, void* item) {
        if (itemNo >= mArraySize || itemNo < 0) {
            return false;
        }
        mArrayPtr[itemNo] = item;
        return true;
    }

private:
    JNIEnv* const mEnv;
    int mIsRW;
    int mArraySize;
    void** mArrayPtr;
};
