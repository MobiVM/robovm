/*
 * Copyright (C) 2013-2015 RoboVM AB
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
package org.robovm.apple.coregraphics;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreGraphics")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CGBitmapContext/*</name>*/ 
    extends /*<extends>*/CGContext/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    public interface ReleaseDataCallback {
        void release(@Pointer long data);
    }
    
    private static java.util.concurrent.atomic.AtomicLong releaseInfoGen = new java.util.concurrent.atomic.AtomicLong(1);
    private static final LongMap<ReleaseDataCallback> callbacks = new LongMap<>();
    private static final java.lang.reflect.Method cbReleaseData;

    /** identifier of release callback that was acreate for this context instance */
    private long releaseInfo;

    static {
        try {
            cbReleaseData = CGBitmapContext.class.getDeclaredMethod("cbReleaseData", long.class, long.class);
        } catch (Throwable e) {
            throw new Error(e);
        }
    }
    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(CGBitmapContext.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    @Callback
    private static void cbReleaseData(@Pointer long refcon, @Pointer long data) {
        ReleaseDataCallback callback;
        synchronized (callbacks) {
            callback = callbacks.remove(refcon);
        }
        if (callback != null)
            callback.release(data);
    }
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    public static CGBitmapContext create(long width, long height, long bitsPerComponent, long bytesPerRow, CGColorSpace space, CGBitmapInfo bitmapInfo) {
        return create((byte[])null, width, height, bitsPerComponent, bytesPerRow, space, bitmapInfo);
    }
    /**
     * @since Available in iOS 2.0 and later.
     */
    public static CGBitmapContext create(long width, long height, long bitsPerComponent, long bytesPerRow, CGColorSpace space, CGImageAlphaInfo alphaInfo) {
        return create((byte[])null, width, height, bitsPerComponent, bytesPerRow, space, alphaInfo);
    }
    /**
     * @since Available in iOS 2.0 and later.
     */
    public static CGBitmapContext create(byte[] data, long width, long height, long bitsPerComponent, long bytesPerRow, CGColorSpace space, CGImageAlphaInfo alphaInfo) {
        return create(data, width, height, bitsPerComponent, bytesPerRow, space, new CGBitmapInfo(alphaInfo.value()));
    }
    /**
     * @since Available in iOS 2.0 and later.
     */
    public static CGBitmapContext create(byte[] data, long width, long height, long bitsPerComponent, long bytesPerRow, CGColorSpace space, CGBitmapInfo bitmapInfo) {
        long ptr = data != null ? VM.getArrayValuesAddress(data) : 0;
        return internalCreate(data, ptr, width, height, bitsPerComponent, bytesPerRow, space, bitmapInfo);
    }
    /**
     * @since Available in iOS 2.0 and later.
     */
    public static CGBitmapContext create(short[] data, long width, long height, long bitsPerComponent, long bytesPerRow, CGColorSpace space, CGBitmapInfo bitmapInfo) {
        long ptr = data != null ? VM.getArrayValuesAddress(data) : 0;
        return internalCreate(data, ptr, width, height, bitsPerComponent, bytesPerRow, space, bitmapInfo);
    }
    /**
     * @since Available in iOS 2.0 and later.
     */
    public static CGBitmapContext create(int[] data, long width, long height, long bitsPerComponent, long bytesPerRow, CGColorSpace space, CGBitmapInfo bitmapInfo) {
        long ptr = data != null ? VM.getArrayValuesAddress(data) : 0;
        return internalCreate(data, ptr, width, height, bitsPerComponent, bytesPerRow, space, bitmapInfo);
    }
    /**
     * @deprecated kept for compatibility only, use ones that accept arrays
     * @since Available in iOS 4.0 and later.
     */
    @Deprecated
    public static CGBitmapContext create(IntPtr data, long width, long height, long bitsPerComponent, long bytesPerRow, CGColorSpace space, CGBitmapInfo bitmapInfo) {
        long ptr = data != null ? data.getHandle() : 0;
        return internalCreate(data, ptr, width, height, bitsPerComponent, bytesPerRow, space, bitmapInfo);
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static CGBitmapContext create(long width, long height, long bitsPerComponent, long bytesPerRow, CGColorSpace space, CGBitmapInfo bitmapInfo, ReleaseDataCallback releaseCallback) {
        return create((byte[])null, width, height, bitsPerComponent, bytesPerRow, space, bitmapInfo, releaseCallback);
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static CGBitmapContext create(byte[] data, long width, long height, long bitsPerComponent, long bytesPerRow, CGColorSpace space, CGBitmapInfo bitmapInfo, ReleaseDataCallback releaseCallback) {
        long ptr = data != null ? VM.getArrayValuesAddress(data) : 0;
        return internalCreate(ptr, width, height, bitsPerComponent, bytesPerRow, space, bitmapInfo, releaseCallback);
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static CGBitmapContext create(short[] data, long width, long height, long bitsPerComponent, long bytesPerRow, CGColorSpace space, CGBitmapInfo bitmapInfo, ReleaseDataCallback releaseCallback) {
        long ptr = data != null ? VM.getArrayValuesAddress(data) : 0;
        return internalCreate(ptr, width, height, bitsPerComponent, bytesPerRow, space, bitmapInfo, releaseCallback);
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static CGBitmapContext create(int[] data, long width, long height, long bitsPerComponent, long bytesPerRow, CGColorSpace space, CGBitmapInfo bitmapInfo, ReleaseDataCallback releaseCallback) {
        long ptr = data != null ? VM.getArrayValuesAddress(data) : 0;
        return internalCreate(ptr, width, height, bitsPerComponent, bytesPerRow, space, bitmapInfo, releaseCallback);
    }
    /**
     * @deprecated kept for compatibility only, use ones that accept arrays
     * @since Available in iOS 4.0 and later.
     */
    @Deprecated
    public static CGBitmapContext create(IntPtr data, long width, long height, long bitsPerComponent, long bytesPerRow, CGColorSpace space, CGBitmapInfo bitmapInfo, ReleaseDataCallback releaseCallback) {
        return internalCreate(data.getHandle(), width, height, bitsPerComponent, bytesPerRow, space, bitmapInfo, releaseCallback);
    }

    /**
     * if data is specified this method also will allocate callback to keep reference to data in it
     */
    private static CGBitmapContext internalCreate(Object data, @Pointer long ptr, long width, long height, long bitsPerComponent, long bytesPerRow, CGColorSpace space, CGBitmapInfo bitmapInfo) {
        ReleaseDataCallback releaseCallback = null;
        if (data != null && ptr != 0) {
            // register callback. it will be keeping data till it is not notified to be removed
            releaseCallback = new DataHolderReleaseCallback(data);
        }

        return internalCreate(ptr, width, height, bitsPerComponent, bytesPerRow, space, bitmapInfo, releaseCallback);
    }

    private static CGBitmapContext internalCreate(@Pointer long data, long width, long height, long bitsPerComponent, long bytesPerRow, CGColorSpace space, CGBitmapInfo bitmapInfo, ReleaseDataCallback releaseCallback) {
        CGBitmapContext result;
        if (releaseCallback != null) {
            long releaseInfo = CGBitmapContext.releaseInfoGen.getAndIncrement();
            result = create(data, width, height, bitsPerComponent, bytesPerRow, space, bitmapInfo, new FunctionPtr(cbReleaseData), releaseInfo);
            if (result != null) {
                synchronized (callbacks) {
                    result.releaseInfo = releaseInfo;
                    callbacks.put(releaseInfo, releaseCallback);
                }
            }
        } else {
            result = create(data, width, height, bitsPerComponent, bytesPerRow, space, bitmapInfo);
        }

        return result;
    }

    @Override
    protected void dispose(boolean finalizing) {
        super.dispose(finalizing);

        // remove registered callback otherwise it might stuck in callbacks
        if (releaseInfo > 0) {
            synchronized (callbacks) {
                callbacks.remove(releaseInfo);
                releaseInfo = 0;
            }
        }
    }

    /**
     * release callback responsible for keeping data which was assigned to CGBitmapContext
     */
    private static class DataHolderReleaseCallback implements ReleaseDataCallback {
        private Object data;

        public DataHolderReleaseCallback(Object data) {
            this.data = data;
        }

        @Override
        public void release(long ptr) {
            this.data = null;
        }
    }

    /*<methods>*/
    @Bridge(symbol="CGBitmapContextCreateWithData", optional=true)
    private static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGBitmapContext create(@Pointer long data, @MachineSizedUInt long width, @MachineSizedUInt long height, @MachineSizedUInt long bitsPerComponent, @MachineSizedUInt long bytesPerRow, CGColorSpace space, CGBitmapInfo bitmapInfo, FunctionPtr releaseCallback, @Pointer long releaseInfo);
    @Bridge(symbol="CGBitmapContextCreate", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGBitmapContext create(@Pointer long data, @MachineSizedUInt long width, @MachineSizedUInt long height, @MachineSizedUInt long bitsPerComponent, @MachineSizedUInt long bytesPerRow, CGColorSpace space, CGBitmapInfo bitmapInfo);
    @Bridge(symbol="CGBitmapContextGetData", optional=true)
    public native @Pointer long getData();
    @Bridge(symbol="CGBitmapContextGetWidth", optional=true)
    public native @MachineSizedUInt long getWidth();
    @Bridge(symbol="CGBitmapContextGetHeight", optional=true)
    public native @MachineSizedUInt long getHeight();
    @Bridge(symbol="CGBitmapContextGetBitsPerComponent", optional=true)
    public native @MachineSizedUInt long getBitsPerComponent();
    @Bridge(symbol="CGBitmapContextGetBitsPerPixel", optional=true)
    public native @MachineSizedUInt long getBitsPerPixel();
    @Bridge(symbol="CGBitmapContextGetBytesPerRow", optional=true)
    public native @MachineSizedUInt long getBytesPerRow();
    @Bridge(symbol="CGBitmapContextGetColorSpace", optional=true)
    public native CGColorSpace getColorSpace();
    @Bridge(symbol="CGBitmapContextGetAlphaInfo", optional=true)
    public native CGImageAlphaInfo getAlphaInfo();
    @Bridge(symbol="CGBitmapContextGetBitmapInfo", optional=true)
    public native CGBitmapInfo getBitmapInfo();
    @Bridge(symbol="CGBitmapContextCreateImage", optional=true)
    public native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGImage toImage();
    /*</methods>*/
}
