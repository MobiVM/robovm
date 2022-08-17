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

/**
 * @addtogroup FileDescriptor File Descriptor
 * @{
 */

/**
 * @file file_descriptor_jni.h
 */

#pragma once

#include <sys/cdefs.h>

#include <jni.h>

#if !defined(__BIONIC__) && !defined(__INTRODUCED_IN)
#define __INTRODUCED_IN(x)
#endif

__BEGIN_DECLS

/**
 * Returns a new java.io.FileDescriptor.
 *
 * The FileDescriptor created represents an invalid Unix file descriptor (represented by
 * a file descriptor value of -1).
 *
 * Callers of this method should be aware that it can fail, returning NULL with a pending Java
 * exception.
 *
 * Available since API level 31.
 *
 * \param env a pointer to the JNI Native Interface of the current thread.
 * \return a java.io.FileDescriptor on success, nullptr if insufficient heap memory is available.
 */
jobject AFileDescriptor_create(JNIEnv* env) __INTRODUCED_IN(31);

/**
 * Returns the Unix file descriptor represented by the given java.io.FileDescriptor.
 *
 * A return value of -1 indicates that \a fileDescriptor represents an invalid file descriptor.
 *
 * Aborts the program if \a fileDescriptor is not a java.io.FileDescriptor instance.
 *
 * Available since API level 31.
 *
 * \param env a pointer to the JNI Native Interface of the current thread.
 * \param fileDescriptor a java.io.FileDescriptor instance.
 * \return the Unix file descriptor wrapped by \a fileDescriptor.
 */
int AFileDescriptor_getFd(JNIEnv* env, jobject fileDescriptor) __INTRODUCED_IN(31);

/**
 * Sets the Unix file descriptor represented by the given java.io.FileDescriptor.
 *
 * This function performs no validation of the Unix file descriptor argument, \a fd. Android uses
 * the value -1 to represent an invalid file descriptor, all other values are considered valid.
 * The validity of a file descriptor can be checked with FileDescriptor#valid().
 *
 * Aborts the program if \a fileDescriptor is not a java.io.FileDescriptor instance.
 *
 * Available since API level 31.
 *
 * \param env a pointer to the JNI Native Interface of the current thread.
 * \param fileDescriptor a java.io.FileDescriptor instance.
 * \param fd a Unix file descriptor that \a fileDescriptor will subsequently represent.
 */
void AFileDescriptor_setFd(JNIEnv* env, jobject fileDescriptor, int fd) __INTRODUCED_IN(31);

__END_DECLS

/** @} */
