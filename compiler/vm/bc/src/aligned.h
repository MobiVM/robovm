/*
 * Copyright (C) 2012 RoboVM AB
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
#ifndef ALIGNED_H
#define ALIGNED_H

#include <robovm.h>

#define ALIGN(pp, t) (void*)(((uintptr_t) (pp) + sizeof(t) - 1) & ~(sizeof(t) - 1))

static inline jbyte readByte(void** p) {
    jbyte v = *(jbyte*) *p;
    *p += sizeof(jbyte);
    return v;
}

static inline jchar readChar(void** p) {
    *p = ALIGN(*p, jchar);
    jchar v = *(jchar*) *p;
    *p += sizeof(jchar);
    return v;
}

static inline jshort readShort(void** p) {
    *p = ALIGN(*p, jshort);
    jshort v = *(jshort*) *p;
    *p += sizeof(jshort);
    return v;
}

static inline jint readInt(void** p) {
    *p = ALIGN(*p, jint);
    jint v = *(jint*) *p;
    *p += sizeof(jint);
    return v;
}

static inline char* readString(void** p) {
    *p = ALIGN(*p, char*);
    char* v = *(char**) *p;
    *p += sizeof(char*);
    return v;
}

static inline void* readPtr(void** p) {
    *p = ALIGN(*p, void*);
    void* v = *(void**) *p;
    *p += sizeof(void*);
    return v;
}

static inline void writeInt(void** p, jint v) {
    *p = ALIGN(*p, jint);
    *(jint*) *p = v;
    *p += sizeof(jint);
}

#endif

