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
#include <robovm.h>
#include <gc.h>

jboolean Java_org_robovm_rt_GC_getDontExpand(Env* env, Class* c) {
    return (jboolean)GC_call_with_alloc_lock((void*)GC_get_dont_expand, NULL);
}

void Java_org_robovm_rt_GC_setDontExpand(Env* env, Class* c, jboolean value) {
    GC_call_with_alloc_lock(GC_set_dont_expand, value);
}

jint Java_org_robovm_rt_GC_getVersion(Env* env, Class* c) {
    return GC_get_version();
}

jlong Java_org_robovm_rt_GC_getCount(Env* env, Class* c) {
    return (jlong)GC_call_with_alloc_lock((void*)(GC_get_gc_no), NULL);
}

void Java_org_robovm_rt_GC_disable(Env* env, Class* c) {
    GC_disable();
}

void Java_org_robovm_rt_GC_enable(Env* env, Class* c) {
    GC_enable();
}

jboolean Java_org_robovm_rt_GC_isDisabled(Env* env, Class* c) {
    return GC_is_disabled();
}

jlong Java_org_robovm_rt_GC_getHeapSize(Env* env, Class* c) {
    return (jlong)GC_call_with_alloc_lock((void*)GC_get_heap_size, NULL);
}

jlong Java_org_robovm_rt_GC_getFreeBytes(Env* env, Class* c) {
    return (jlong)GC_call_with_alloc_lock((void*)GC_get_free_bytes, NULL);
}

jlong Java_org_robovm_rt_GC_getUnmappedBytes(Env* env, Class* c) {
    return (jlong)GC_call_with_alloc_lock((void*)GC_get_unmapped_bytes, NULL);
}

jlong Java_org_robovm_rt_GC_getBytesSinceGC(Env* env, Class* c) {

    return (jlong)GC_call_with_alloc_lock((void*)GC_get_bytes_since_gc, NULL);
}

jlong Java_org_robovm_rt_GC_getTotalBytes(Env* env, Class* c) {
    return (jlong)GC_call_with_alloc_lock((void*)GC_get_total_bytes, NULL);
}

jint Java_org_robovm_rt_GC_collectALittle(Env* env, Class* c) {
    return GC_collect_a_little();
}

jlong Java_org_robovm_rt_GC_getFreeSpaceDivisor(Env* env, Class* c) {
    return (jlong)GC_call_with_alloc_lock((void*)GC_get_free_space_divisor, NULL);
}

void Java_org_robovm_rt_GC_setFreeSpaceDivisor(Env* env, Class* c, jlong value) {
    GC_call_with_alloc_lock((void*)GC_set_free_space_divisor, value);
}

jlong Java_org_robovm_rt_GC_getMaxRetries(Env* env, Class* c) {
    return (jlong)GC_call_with_alloc_lock((void*)GC_get_max_retries, NULL);
}

void Java_org_robovm_rt_GC_setMaxRetries(Env* env, Class* c, jlong value) {
    GC_call_with_alloc_lock((void*)GC_set_max_retries, value);
}

jlong Java_org_robovm_rt_GC_getTimeLimit(Env* env, Class* c) {
    return (jlong)GC_call_with_alloc_lock((void*)GC_get_time_limit, NULL);
}

void Java_org_robovm_rt_GC_setTimeLimit(Env* env, Class* c, jlong value) {
    GC_call_with_alloc_lock((void*)GC_set_time_limit, value);
}