#!/bin/bash

# Native Constants generator
# Generates java constant file needed for Conscrypt. Should be called on each boringssl update

set -e
gcc -I../../external/boringssl/src/include/ ../../conscrypt/constants/src/gen/cpp/generate_constants.cc -o generate_constants
./generate_constants com.android.org.conscrypt > ../../conscrypt/repackaged/common/src/main/java/com/android/org/conscrypt/NativeConstants.java