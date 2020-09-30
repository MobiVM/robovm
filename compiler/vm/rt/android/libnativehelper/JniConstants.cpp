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

#define LOG_TAG "JniConstants"
#include "ALog-priv.h"

#include "JniConstants.h"

#include <atomic>
#include <mutex>
#include <string>

#include "nativehelper/ScopedLocalRef.h"

namespace {

// Mutex protecting the initialization of cached class references.
std::mutex g_class_refs_mutex;

// Atomic boolean flag for double locked checking that class references are
// initialized before use.
std::atomic<bool> g_class_refs_initialized(false);

// Cached global references to class instances.
//
// These are GC heap references that are initialized under the protection of
// |g_class_refs_mutex| as they should only be initialized once to avoid losing a
// global reference. Initialization happens lazily when an accessor tries to
// retrieve one of these classes.

jclass g_file_descriptor_class = nullptr;  // java.io.FileDescriptor
jclass g_nio_access_class = nullptr;       // java.nio.Access
jclass g_nio_buffer_class = nullptr;       // java.nio.Buffer
jclass g_reference_class = nullptr;        // java.lang.ref.Reference
jclass g_string_class = nullptr;           // java.lang.String

// Cached field and method ids.
//
// These are non-GC heap values. They are initialized lazily and racily. We
// avoid holding a mutex here because the JNI API supports concurrent calls to
// Get{Field,Method}ID and also because finding an id may recursively call into
// Get{Field,Method}ID.
//
// The recursion issue occurs here for the fields in the FileDescriptor class
// since retrieving a field id requires the class to be initialized. Class
// initialization leads to the initialization of static fields. The
// FileDescriptor class has static fields that are FileDescriptor instances. The
// initialization of these static FileDescriptor fields follows a convoluted
// path that that leads to a call to jniGetFDFromFileDescriptor() which then
// needs to call GetFieldID() which is in the call stack. If thread-safety were
// desirable here, a recursive mutex would be required.
//
// These field and method ids have default values of nullptr. They are reset
// back to nullptr in JniConstants::Uninitialize(), along with the class
// references, when a new runtime instance is created via JNI_CreateJavaVM(). The
// reset happens before the new runtime instance is returned to the caller and
// under the protection of the |g_class_refs_mutex|.

jfieldID g_file_descriptor_descriptor_field = nullptr;  // java.io.FileDescriptor.descriptor
jfieldID g_file_descriptor_owner_id_field = nullptr;    // java.io.FileDescriptor.ownerId
jmethodID g_file_descriptor_init_method = nullptr;      // void java.io.FileDescriptor.<init>()
jmethodID g_nio_access_get_base_array_method = nullptr;        // Object java.nio.NIOAccess.getBaseArray()
jmethodID g_nio_access_get_base_array_offset_method = nullptr; // Object java.nio.NIOAccess.getBaseArray()
jfieldID g_nio_buffer_address_field = nullptr;          // long java.nio.Buffer.address
jfieldID g_nio_buffer_element_size_shift_field = nullptr; // int java.nio.Buffer._elementSizeShift
jfieldID g_nio_buffer_limit_field = nullptr;            // int java.nio.Buffer.limit
jfieldID g_nio_buffer_position_field = nullptr;         // int java.nio.Buffer.position
jmethodID g_nio_buffer_array_method = nullptr;          // Object java.nio.Buffer.array()
jmethodID g_nio_buffer_array_offset_method = nullptr;   // int java.nio.Buffer.arrayOffset()
jmethodID g_reference_get_method = nullptr;             // Object java.lang.ref.Reference.get()

jclass FindClass(JNIEnv* env, const char* name) {
    ScopedLocalRef<jclass> klass(env, env->FindClass(name));
    ALOG_ALWAYS_FATAL_IF(klass.get() == nullptr, "failed to find class '%s'", name);
    return reinterpret_cast<jclass>(env->NewGlobalRef(klass.get()));
}

jfieldID FindField(JNIEnv* env, jclass klass, const char* name, const char* desc) {
    jfieldID result = env->GetFieldID(klass, name, desc);
    ALOG_ALWAYS_FATAL_IF(result == nullptr, "failed to find field '%s:%s'", name, desc);
    return result;
}

jmethodID FindMethod(JNIEnv* env, jclass klass, const char* name, const char* signature) {
    jmethodID result = env->GetMethodID(klass, name, signature);
    ALOG_ALWAYS_FATAL_IF(result == nullptr, "failed to find method '%s%s'", name, signature);
    return result;
}

jmethodID FindStaticMethod(JNIEnv* env, jclass klass, const char* name, const char* signature) {
    jmethodID result = env->GetStaticMethodID(klass, name, signature);
    ALOG_ALWAYS_FATAL_IF(result == nullptr, "failed to find static method '%s%s'", name, signature);
    return result;
}

}  // namespace

jclass JniConstants::GetFileDescriptorClass(JNIEnv* env) {
    EnsureClassReferencesInitialized(env);
    return g_file_descriptor_class;
}

jclass JniConstants::GetNioAccessClass(JNIEnv* env) {
    EnsureClassReferencesInitialized(env);
    return g_nio_access_class;
}

jclass JniConstants::GetNioBufferClass(JNIEnv* env) {
    EnsureClassReferencesInitialized(env);
    return g_nio_buffer_class;
}

jclass JniConstants::GetReferenceClass(JNIEnv* env) {
    EnsureClassReferencesInitialized(env);
    return g_reference_class;
}

jclass JniConstants::GetStringClass(JNIEnv* env) {
    EnsureClassReferencesInitialized(env);
    return g_string_class;
}

jfieldID JniConstants::GetFileDescriptorDescriptorField(JNIEnv* env) {
    if (g_file_descriptor_descriptor_field == nullptr) {
        jclass klass = GetFileDescriptorClass(env);
        g_file_descriptor_descriptor_field = FindField(env, klass, "descriptor", "I");
    }
    return g_file_descriptor_descriptor_field;
}

jfieldID JniConstants::GetFileDescriptorOwnerIdField(JNIEnv* env) {
    if (g_file_descriptor_owner_id_field == nullptr) {
        jclass klass = GetFileDescriptorClass(env);
        g_file_descriptor_owner_id_field = FindField(env, klass, "ownerId", "J");
    }
    return g_file_descriptor_owner_id_field;
}

jmethodID JniConstants::GetFileDescriptorInitMethod(JNIEnv* env) {
    if (g_file_descriptor_init_method == nullptr) {
        jclass klass = GetFileDescriptorClass(env);
        g_file_descriptor_init_method = FindMethod(env, klass, "<init>", "()V");
    }
    return g_file_descriptor_init_method;
}

jmethodID JniConstants::GetNioAccessGetBaseArrayMethod(JNIEnv* env) {
    if (g_nio_access_get_base_array_method == nullptr) {
        jclass klass = GetNioAccessClass(env);
        g_nio_access_get_base_array_method =
                FindStaticMethod(env, klass, "getBaseArray",
                                 "(Ljava/nio/Buffer;)Ljava/lang/Object;");
    }
    return g_nio_access_get_base_array_method;
}

jmethodID JniConstants::GetNioAccessGetBaseArrayOffsetMethod(JNIEnv* env) {
    if (g_nio_access_get_base_array_offset_method == nullptr) {
        jclass klass = GetNioAccessClass(env);
        g_nio_access_get_base_array_offset_method =
                FindStaticMethod(env, klass, "getBaseArrayOffset", "(Ljava/nio/Buffer;)I");
    }
    return g_nio_access_get_base_array_offset_method;
}

jfieldID JniConstants::GetNioBufferAddressField(JNIEnv* env) {
    if (g_nio_buffer_address_field == nullptr) {
        jclass klass = GetNioBufferClass(env);
        g_nio_buffer_address_field = FindField(env, klass, "address", "J");
    }
    return g_nio_buffer_address_field;
}

jfieldID JniConstants::GetNioBufferElementSizeShiftField(JNIEnv* env) {
    if (g_nio_buffer_element_size_shift_field == nullptr) {
        jclass klass = GetNioBufferClass(env);
        g_nio_buffer_element_size_shift_field = FindField(env, klass, "_elementSizeShift", "I");
    }
    return g_nio_buffer_element_size_shift_field;
}

jfieldID JniConstants::GetNioBufferLimitField(JNIEnv* env) {
    if (g_nio_buffer_limit_field == nullptr) {
        jclass klass = GetNioBufferClass(env);
        g_nio_buffer_limit_field = FindField(env, klass, "limit", "I");
    }
    return g_nio_buffer_limit_field;
}

jfieldID JniConstants::GetNioBufferPositionField(JNIEnv* env) {
    if (g_nio_buffer_position_field == nullptr) {
        jclass klass = GetNioBufferClass(env);
        g_nio_buffer_position_field = FindField(env, klass, "position", "I");
    }
    return g_nio_buffer_position_field;
}

jmethodID JniConstants::GetNioBufferArrayMethod(JNIEnv* env) {
    if (g_nio_buffer_array_method == nullptr) {
        jclass klass = GetNioBufferClass(env);
        g_nio_buffer_array_method = FindMethod(env, klass, "array", "()Ljava/lang/Object;");
    }
    return g_nio_buffer_array_method;
}

jmethodID JniConstants::GetNioBufferArrayOffsetMethod(JNIEnv* env) {
    if (g_nio_buffer_array_offset_method == nullptr) {
        jclass klass = GetNioBufferClass(env);
        g_nio_buffer_array_offset_method = FindMethod(env, klass, "arrayOffset", "()I");
    }
    return g_nio_buffer_array_offset_method;
}

jmethodID JniConstants::GetReferenceGetMethod(JNIEnv* env) {
    if (g_reference_get_method == nullptr) {
        jclass klass = GetReferenceClass(env);
        g_reference_get_method = FindMethod(env, klass, "get", "()Ljava/lang/Object;");
    }
    return g_reference_get_method;
}

void JniConstants::EnsureClassReferencesInitialized(JNIEnv* env) {
    // Fast check if class references are initialized.
    if (g_class_refs_initialized.load(std::memory_order_acquire)) {
        return;
    }

    // Slower check with initialization if necessary.
    std::lock_guard<std::mutex> guard(g_class_refs_mutex);
    if (g_class_refs_initialized.load(std::memory_order_relaxed)) {
        return;
    }

    // Class constants should be initialized only once because they global
    // references. Field ids and Method ids can be initialized later since they
    // are not references and races only have trivial performance
    // consequences.
    g_file_descriptor_class = FindClass(env, "java/io/FileDescriptor");
    g_nio_access_class = FindClass(env, "java/nio/NIOAccess");
    g_nio_buffer_class = FindClass(env, "java/nio/Buffer");
    g_reference_class = FindClass(env, "java/lang/ref/Reference");
    g_string_class = FindClass(env, "java/lang/String");
    g_class_refs_initialized.store(true, std::memory_order_release);
}

void JniConstants::Uninitialize() {
    // This method is called when a new runtime instance is created. There is no
    // notification of a runtime instance being destroyed in the JNI interface
    // so we piggyback on creation. Since only one runtime is supported at a
    // time, we know the constants are invalid when JNI_CreateJavaVM() is
    // called.
    //
    // Clean shutdown would require calling DeleteGlobalRef() for each of the
    // class references.
    std::lock_guard<std::mutex> guard(g_class_refs_mutex);
    g_file_descriptor_class = nullptr;
    g_file_descriptor_descriptor_field = nullptr;
    g_file_descriptor_owner_id_field = nullptr;
    g_file_descriptor_init_method = nullptr;
    g_nio_access_class = nullptr;
    g_nio_access_get_base_array_method = nullptr;
    g_nio_access_get_base_array_offset_method = nullptr;
    g_nio_buffer_class = nullptr;
    g_nio_buffer_address_field = nullptr;
    g_nio_buffer_element_size_shift_field = nullptr;
    g_nio_buffer_limit_field = nullptr;
    g_nio_buffer_position_field = nullptr;
    g_nio_buffer_array_method = nullptr;
    g_nio_buffer_array_offset_method = nullptr;
    g_reference_class = nullptr;
    g_reference_get_method = nullptr;
    g_string_class = nullptr;
    g_class_refs_initialized.store(false, std::memory_order_release);
}
