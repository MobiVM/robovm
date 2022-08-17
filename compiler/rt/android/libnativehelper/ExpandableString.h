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

#pragma once

#include <sys/cdefs.h>

#include <stdbool.h>
#include <stddef.h>

__BEGIN_DECLS

struct ExpandableString {
    size_t dataSize;  // The length of the C string data (not including the null-terminator).
    char* data;       // The C string data.
};

// Initialize ExpandableString.
void ExpandableStringInitialize(struct ExpandableString* s);

// Release memory associated with ExpandableString.
void ExpandableStringRelease(struct ExpandableString* s);

// Append null-terminated string |text| to ExpandableString, expanding the storage if required.
// Returns true on success, false othewise.
bool ExpandableStringAppend(struct ExpandableString* s, const char* text);

// Assign null-terminate string |text| to ExpandableString, expanding the storage if required.
// Returns true on success, false othewise.
bool ExpandableStringAssign(struct ExpandableString*s, const char* text);

__END_DECLS
