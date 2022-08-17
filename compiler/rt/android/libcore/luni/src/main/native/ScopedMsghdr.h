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

#include <nativehelper/JNIHelp.h>

#include "JniConstants.h"
#include "ScopedBytes.h"

/**
 * Wrapper for managing the name and length of msghdr.
 */
class ScopedMsghdr {
public:
    ScopedMsghdr() {
    }

    ~ScopedMsghdr() {
        if (mMsghdrValue.msg_iov)
            free(mMsghdrValue.msg_iov);
        if (mMsghdrValue.msg_control)
            free(mMsghdrValue.msg_control);
    }

    struct msghdr& getObject() {
        return mMsghdrValue;
    }

    void setMsgNameAndLen(sockaddr* ss, socklen_t sa_len) {
        mMsghdrValue.msg_name = ss;
        mMsghdrValue.msg_namelen = sa_len;
    }

    bool isNameLenValid() const {
        if(mMsghdrValue.msg_name == NULL) {
            return false;
        }
        if ((mMsghdrValue.msg_namelen != sizeof(sockaddr_in6)) &&
            (mMsghdrValue.msg_namelen != sizeof(sockaddr_in))) {
            return false;
        }
        return true;
    }

private:
    struct msghdr mMsghdrValue = {};

};


