project(android-external-sqlite)

set(LIB_PATH "${ANDROID_RT_PATH}/external/sqlite")
set(ICU_PATH "${ANDROID_RT_PATH}/external/icu/icu4c")

include_directories(
  ${ICU_PATH}/common
  ${ICU_PATH}/i18n
)

# NOTE the following flags,
#   SQLITE_TEMP_STORE=3 causes all TEMP files to go into RAM. and thats the behavior we want
#   SQLITE_ENABLE_FTS3   enables usage of FTS3 - NOT FTS1 or 2.
#   SQLITE_DEFAULT_AUTOVACUUM=1  causes the databases to be subject to auto-vacuum
add_definitions(
  -DSQLITE_ENABLE_ICU
  -DNDEBUG=1  
  -DHAVE_USLEEP=1  
  -DSQLITE_HAVE_ISNAN  
  -DSQLITE_DEFAULT_JOURNAL_SIZE_LIMIT=1048576  
  -DSQLITE_THREADSAFE=2  
  -DSQLITE_TEMP_STORE=3  
  -DSQLITE_POWERSAFE_OVERWRITE=1  
  -DSQLITE_DEFAULT_FILE_FORMAT=4  
  -DSQLITE_DEFAULT_AUTOVACUUM=1  
  -DSQLITE_ENABLE_MEMORY_MANAGEMENT=1  
  -DSQLITE_ENABLE_FTS3  
  -DSQLITE_ENABLE_FTS3_BACKWARDS  
  -DSQLITE_ENABLE_FTS4  
  -DSQLITE_OMIT_BUILTIN_TEST  
  -DSQLITE_OMIT_COMPILEOPTION_DIAGS  
  -DSQLITE_OMIT_LOAD_EXTENSION  
  -DSQLITE_DEFAULT_FILE_PERMISSIONS=0600  
  -DSQLITE_SECURE_DELETE  
  -DSQLITE_ENABLE_BATCH_ATOMIC_WRITE  
  -DBIONIC_IOCTL_NO_SIGNEDNESS_OVERLOAD  
)


set(CMAKE_C_FLAGS "${CMAKE_C_FLAGS} -Wall -Wno-unused-function -Wno-unused-variable")

set(SRC
  ${LIB_PATH}/android/PhoneNumberUtils.cpp
  ${LIB_PATH}/android/OldPhoneNumberUtils.cpp
  ${LIB_PATH}/android/sqlite3_android.cpp
  ${LIB_PATH}/dist/sqlite3.c
)

add_library(android-external-sqlite OBJECT ${SRC})
set(EXTERNAL_SQLITE_OBJECTS $<TARGET_OBJECTS:android-external-sqlite> PARENT_SCOPE)