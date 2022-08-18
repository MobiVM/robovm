/*
 * Copyright (C) 2008 The Android Open Source Project
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

#define LOG_NDEBUG 1
#define LOG_TAG "ICU"

#include <errno.h>
#include <fcntl.h>
#include <stdlib.h>
#include <string.h>
#include <string>
#include <sys/mman.h>
#include <sys/stat.h>
#include <sys/time.h>
#include <sys/types.h>
#include <time.h>
#include <unistd.h>

#include <memory>
#include <vector>

#include <android-base/unique_fd.h>
#include <log/log.h>
#include <nativehelper/JNIHelp.h>

#include <unicode/udata.h>
#include <unicode/uclean.h>

// RoboVM note: Start change.
#if defined(__APPLE__)
#include <mach-o/dyld.h> // for _NSGetExecutablePath()
#include <libgen.h>      // for dirname()
#include "zlib.h"
#endif
#include "icudt68l.dat.gz.h"
// RoboVM note: End change.

#define FAIL_WITH_STRERROR(s) \
    ALOGE("Couldn't " s " '%s': %s", path_.c_str(), strerror(errno)); \
    return FALSE;

#define MAYBE_FAIL_WITH_ICU_ERROR(s) \
    if (status != U_ZERO_ERROR) {\
        ALOGE("Couldn't initialize ICU (" s "): %s (%s)", u_errorName(status), path_.c_str()); \
        return FALSE; \
    }

// Common struct for icu-data sources
struct IcuData {
    IcuData(void * d, size_t l) : data_(d), data_length_(l) {
    }

    void *data_;          // Save for munmap.
    size_t data_length_;  // Save for munmap.
};

// Contain the unpacked minimal ICU data.
// Automatically adds the data file to ICU's list of data files upon constructing.
//
// - Automatically frees in destructor
struct IcuDataGzip : IcuData {
    static std::unique_ptr<IcuDataGzip> Create() {
      std::unique_ptr<IcuDataGzip> gzip(new IcuDataGzip());

      if (!gzip->Load()) {
        // Destructor will take care of cleaning up a partial init.
        return nullptr;
      }

      return gzip;
    }

    IcuDataGzip() : IcuData(nullptr, 0)
    {}

    // Free the ICU data.
    ~IcuDataGzip() {
      if (data_)
        free(data_);
    }

private:
    bool Load() {
      ALOGI("Using builtin minimal ICU data");
      data_ = malloc(icudt68l_dat_len);
      if (!data_) {
        ALOGE("Failed to allocate %d bytes for builtin ICU data", icudt68l_dat_len);
        abort();
      }
      int ret = inflate(icudt68l_dat_gz, icudt68l_dat_gz_len, data_, icudt68l_dat_len);
      if (ret != icudt68l_dat_len) {
        ALOGE("Failed to inflate %d->%d bytes of builtin ICU data: %d",
              icudt68l_dat_gz_len, icudt68l_dat_len, ret);
        abort();
      }
      data_length_ = icudt68l_dat_len;

      return true;
    }

    int inflate(const void *src, int srcLen, void *dst, int dstLen) {
      z_stream strm  = {0};
      strm.total_in  = strm.avail_in  = srcLen;
      strm.total_out = strm.avail_out = dstLen;
      strm.next_in   = (Bytef *) src;
      strm.next_out  = (Bytef *) dst;

      strm.zalloc = Z_NULL;
      strm.zfree  = Z_NULL;
      strm.opaque = Z_NULL;

      int err = -1;
      int ret = -1;

      err = inflateInit2(&strm, (15 + 16)); // 15 window bits, gzipped data (16)
      if (err == Z_OK) {
        err = ::inflate(&strm, Z_FINISH);
        if (err == Z_STREAM_END) {
          ret = strm.total_out;
        } else {
          inflateEnd(&strm);
          return err;
        }
      } else {
        inflateEnd(&strm);
        return err;
      }

      inflateEnd(&strm);
      return ret;
    }
};

// Contain the memory map for ICU data files.
// Automatically adds the data file to ICU's list of data files upon constructing.
//
// - Automatically unmaps in the destructor.
struct IcuDataMap : IcuData {
  // Map in ICU data at the path, returning null if it failed (prints error to ALOGE).
  static std::unique_ptr<IcuDataMap> Create(const std::string& path) {
    std::unique_ptr<IcuDataMap> map(new IcuDataMap(path));

    if (!map->TryMap()) {
      // madvise or ICU could fail but mmap still succeeds.
      // Destructor will take care of cleaning up a partial init.
      return nullptr;
    }

    return map;
  }

  // Unmap the ICU data.
  ~IcuDataMap() {
    TryUnmap();
  }

 private:
  IcuDataMap(const std::string& path)
    : IcuData(MAP_FAILED, 0), path_(path)
  {}

  bool TryMap() {
    // Open the file and get its length.
    android::base::unique_fd fd(TEMP_FAILURE_RETRY(open(path_.c_str(), O_RDONLY)));

    if (fd.get() == -1) {
        FAIL_WITH_STRERROR("open");
    }

    struct stat sb;
    if (fstat(fd.get(), &sb) == -1) {
        FAIL_WITH_STRERROR("stat");
    }

    data_length_ = sb.st_size;

    // Map it.
    data_ = mmap(NULL, data_length_, PROT_READ, MAP_SHARED, fd.get(), 0  /* offset */);
    if (data_ == MAP_FAILED) {
        FAIL_WITH_STRERROR("mmap");
    }

    // Tell the kernel that accesses are likely to be random rather than sequential.
    if (madvise(data_, data_length_, MADV_RANDOM) == -1) {
        FAIL_WITH_STRERROR("madvise(MADV_RANDOM)");
    }

    return true;
  }

  bool TryUnmap() {
    // Don't need to do opposite of udata_setCommonData,
    // u_cleanup (performed in unregister_libcore_icu_ICU) takes care of it.

    // Don't need to opposite of madvise, munmap will take care of it.

    if (data_ != MAP_FAILED) {
      if (munmap(data_, data_length_) == -1) {
        FAIL_WITH_STRERROR("munmap");
      }
    }

    // Don't need to close the file, it was closed automatically during TryMap.
    return true;
  }

  std::string path_;    // Save for error messages.
};

struct ICURegistration {
  // Init ICU, configuring it and loading the data files.
  ICURegistration(JNIEnv* env) {
    UErrorCode status = U_ZERO_ERROR;
    // RoboVM note: Start change. Look for custom ICU data and fall back to builtin minimal data if not found.
    std::string path;
    if (findCustomICUData(path))
      icu_data_ = IcuDataMap::Create(path);
    else
      icu_data_ = IcuDataGzip::Create();
    if (icu_data_ == nullptr) {
        abort();
    }

    // Tell ICU to use our memory-mapped data.
    udata_setCommonData(icu_data_->data_, &status);
    if (status != U_ZERO_ERROR) {
      ALOGE("Couldn't initialize ICU ( udata_setCommonData ): %s", u_errorName(status));
      abort();
    }

    // Tell ICU it can *only* use our memory-mapped data.
    udata_setFileAccess(UDATA_NO_FILES, &status);
    if (status != U_ZERO_ERROR) {
        ALOGE("Couldn't initialize ICU (s_setFileAccess): %s", u_errorName(status));
        abort();
    }

    // Failures to find the ICU data tend to be somewhat obscure because ICU loads its data on first
    // use, which can be anywhere. Force initialization up front so we can report a nice clear error
    // and bail.
    u_init(&status);
    if (status != U_ZERO_ERROR) {\
        ALOGE("Couldn't initialize ICU (u_init): %s", u_errorName(status));
        abort();
    }
  }

  // De-init ICU, unloading the data files. Do the opposite of the above function.
  ~ICURegistration() {
    // Skip unregistering JNI methods explicitly, class unloading takes care of it.

    // Reset libicu state to before it was loaded.
    u_cleanup();

    // Unmap ICU data files from the runtime module.
    icu_data_.reset();

    // We don't need to call udata_setFileAccess because u_cleanup takes care of it.
  }

  // RoboVM note: Start change.
#if (__APPLE__)
  static std::string getExecutablePath() {
    std::string exePath;
    uint32_t size = 0;
    char empty[] = "";
    char *buf = empty;
    _NSGetExecutablePath(buf, &size);
    buf = (char *) alloca(size);
    if (_NSGetExecutablePath(buf, &size) == -1) {
      abort();
    }
    buf = realpath(buf, NULL);
    if (!buf) {
      abort();
    }
    exePath = buf;
    free(buf);
    return exePath;
  }
#endif

  static bool findCustomICUData(std::string &result) {
#if (__APPLE__)
    std::string exePath = getExecutablePath();
    std::string basePath = dirname((char *) exePath.c_str());
#else
    // TODO: Implement custom ICU data lookup on Linux.
    std::string basePath = "/usr/share/icu";
#endif
    std::string icuDataPath = basePath;
    icuDataPath += "/";
    icuDataPath += U_ICUDATA_NAME;
    icuDataPath += ".dat";
    ALOGD("Looking for icu data at: %s", icuDataPath.c_str());
    if (!access(icuDataPath.c_str(), R_OK)) {
      result = icuDataPath;
      return true;
    }

    return false;
  }

  std::unique_ptr<IcuData> icu_data_;
};

// Use RAII-style initialization/teardown so that we can get unregistered
// when dlclose is called (even if JNI_OnUnload is not).
static std::unique_ptr<ICURegistration> sIcuRegistration;

extern "C" JNIEXPORT jobject Java_android_icu_impl_ICUBinary_getIcuData(JNIEnv* env, jclass) {
  if (sIcuRegistration.get() == nullptr)
    return nullptr;
  IcuData *data = sIcuRegistration.get()->icu_data_.get();
  return env->NewDirectByteBuffer(data->data_, data->data_length_);
}


// Init ICU, configuring it and loading the data files.
extern "C" void register_libcore_icu_ICU(JNIEnv* env) {
  sIcuRegistration.reset(new ICURegistration(env));
}

