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

#include "DlHelp.h"

#include <stdbool.h>

#ifdef WIN32_LEAN_AND_MEAN
#include <stdio.h>
#include <windows.h>
#else
#include <dlfcn.h>
#endif

DlLibrary DlOpenLibrary(const char* filename) {
#ifdef _WIN32
  return LoadLibrary(filename);
#else
  // Load with RTLD_NODELETE in order to ensure that libart.so is not unmapped when it is closed.
  // This is due to the fact that it is possible that some threads might have yet to finish
  // exiting even after JNI_DeleteJavaVM returns, which can lead to segfaults if the library is
  // unloaded.
  return dlopen(filename, RTLD_NOW | RTLD_NODELETE);
#endif
}

bool DlCloseLibrary(DlLibrary library) {
#ifdef _WIN32
  return (FreeLibrary(library) == TRUE);
#else
  return (dlclose(library) == 0);
#endif
}

DlSymbol DlGetSymbol(DlLibrary handle, const char* symbol) {
#ifdef _WIN32
  return (DlSymbol) GetProcAddress(handle, symbol);
#else
  return dlsym(handle, symbol);
#endif
}

const char* DlGetError() {
#ifdef _WIN32
  static char buffer[256];

  DWORD cause = GetLastError();
  DWORD flags = FORMAT_MESSAGE_FROM_SYSTEM | FORMAT_MESSAGE_IGNORE_INSERTS;
  DWORD length = FormatMessageA(flags, NULL, cause, 0, buffer, sizeof(buffer), NULL);
  if (length == 0) {
    snprintf(buffer, sizeof(buffer),
             "Error %lu while retrieving message for error %lu",
             GetLastError(), cause);
    length = strlen(buffer);
  }

  // Trim trailing whitespace.
  for (DWORD i = length - 1; i > 0; --i) {
    if (!isspace(buffer[i])) {
      break;
    }
    buffer[i] = '\0';
  }

  return buffer;
#else
  return dlerror();
#endif
}
