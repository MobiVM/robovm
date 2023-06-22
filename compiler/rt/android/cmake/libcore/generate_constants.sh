#!/bin/bash

# Generates MacOSX SocketOptionRegistry.java from template 
# FIXME: its going to be working only on Darwin OS (probably might have issues between macosx and ios)
# FIXME: it will produce output that requres a bit of 

set -e
cp ../../libcore/ojluni/src/main/java/sun/nio/ch/SocketOptionRegistry.java.template SocketOptionRegistry.java.template.h
clang -E  SocketOptionRegistry.java.template.h | grep -o "package sun\.nio\.ch.*" -A 10000 | sed 's/PREFIX_//' >  ../../libcore/ojluni/src/main/java/sun/nio/ch/SocketOptionRegistry.java
rm SocketOptionRegistry.java.template.h
