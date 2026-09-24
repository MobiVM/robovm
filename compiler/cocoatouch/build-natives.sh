#!/bin/bash

rm -rf build
rm -rf src/main/robopods/META-INF/robovm/ios/libs/RvmCocoaTouch.xcframework

# ios device
cmake -S src/main/native -B build/ios-arm64 \
  -DCMAKE_SYSTEM_NAME=iOS \
  -DCMAKE_OSX_ARCHITECTURES=arm64 \
  -DCMAKE_OSX_SYSROOT=iphoneos \
  -DCMAKE_OSX_DEPLOYMENT_TARGET=8.0
cmake --build build/ios-arm64 --config Release

# ios simulator
cmake -S src/main/native -B build/ios-sim \
  -DCMAKE_SYSTEM_NAME=iOS \
  -DCMAKE_OSX_ARCHITECTURES="x86_64;arm64" \
  -DCMAKE_OSX_SYSROOT=iphonesimulator \
  -DCMAKE_OSX_DEPLOYMENT_TARGET=8.0
cmake --build build/ios-sim --config Release


# macos 
cmake -S src/main/native -B build/macos \
  -DCMAKE_SYSTEM_NAME=Darwin \
  -DCMAKE_OSX_ARCHITECTURES="x86_64;arm64" \
  -DCMAKE_OSX_SYSROOT=macosx \
  -DCMAKE_OSX_DEPLOYMENT_TARGET=10.12
cmake --build build/macos --config Release


# pack to xcframework
xcodebuild -create-xcframework \
  -library build/ios-arm64/librvmcocoatouch.a \
  -library build/ios-sim/librvmcocoatouch.a \
  -library build/macos/librvmcocoatouch.a \
  -output src/main/robopods/META-INF/robovm/ios/libs/RvmCocoaTouch.xcframework
