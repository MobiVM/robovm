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

#include "ExpandableString.h"

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void ExpandableStringInitialize(struct ExpandableString *s) {
    memset(s, 0, sizeof(*s));
}

void ExpandableStringRelease(struct ExpandableString* s) {
    free(s->data);
    memset(s, 0, sizeof(*s));
}

bool ExpandableStringAppend(struct ExpandableString* s, const char* text) {
    size_t textSize = strlen(text);
    size_t requiredSize = s->dataSize + textSize + 1;
    char* data = (char*) realloc(s->data, requiredSize);
    if (data == NULL) {
        return false;
    }
    s->data = data;
    memcpy(s->data + s->dataSize, text, textSize + 1);
    s->dataSize += textSize;
    return true;
}

bool ExpandableStringAssign(struct ExpandableString* s, const char* text) {
    ExpandableStringRelease(s);
    return ExpandableStringAppend(s, text);
}