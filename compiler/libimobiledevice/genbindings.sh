#!/bin/bash

BASE=$(cd $(dirname $0); pwd -P)
PACKAGE=org.robovm.libimobiledevice.binding
JAVAOUT="$BASE/src/main/java/${PACKAGE//.//}"
COUT="$BASE/src/main/native"

function rename {
    from=$1
    to=$2
    if [ $(uname) == 'Darwin' ]; then
    	sed -i '' -e "s/[[:<:]]$from[[:>:]]/$to/g" "$JAVAOUT"/*.java
    else
    	sed -i -e "s/\b$from\b/$to/g" "$JAVAOUT"/*.java
    fi
    mv "$JAVAOUT/$from.java" "$JAVAOUT/$to.java" 
}

mkdir -p "$JAVAOUT"
mkdir -p "$COUT"
swig -includeall -I"$BASE/src/main/swig/include-stub" -I"$BASE/src/main/swig/include" \
     -outdir "$JAVAOUT" -o "$COUT"/libimobiledevice_wrap.c \
     -java -package $PACKAGE -fakeversion 2.0.4 \
     "$BASE/src/main/swig/libimobiledevice.i"

# fix permission
chmod -R 644 "$JAVAOUT/"
chmod 744 "$JAVAOUT"
chmod 644 "$COUT"/libimobiledevice_wrap.c