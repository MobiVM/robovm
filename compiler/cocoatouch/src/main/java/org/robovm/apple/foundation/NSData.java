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
package org.robovm.apple.foundation;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.security.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSData/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSPropertyList/*</implements>*/ {

    /*<ptr>*/public static class NSDataPtr extends Ptr<NSData, NSDataPtr> {}/*</ptr>*/
    
    /*<bind>*/static { ObjCRuntime.bind(NSData.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSData() {}
    protected NSData(Handle h, long handle) { super(h, handle); }
    protected NSData(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithData:")
    public NSData(NSData data) { super((SkipInit) null); initObject(init(data)); }
    /*</constructors>*/
    
    public NSData(byte[] bytes) {
        super((SkipInit) null);
        if (bytes == null) {
            throw new NullPointerException("bytes");
        }
        initObject(init(VM.getArrayValuesAddress(bytes), bytes.length));
    }

    public NSData(ByteBuffer bytes) {
        super((SkipInit) null);
        if (bytes == null) {
            throw new NullPointerException("bytes");
        }
        long handle = BufferMarshalers.BufferMarshaler.getBufferAddress(bytes) + bytes.position();
        initObject(init(handle, bytes.remaining(), false));
        addStrongRef(bytes);
    }

    public NSData(BytePtr bytes, int length, boolean freeWhenDone) {
        super((SkipInit) null);
        if (bytes == null) {
            throw new NullPointerException("bytes");
        }
        initObject(init(bytes.getHandle(), length, freeWhenDone));
    }
    
    public <T extends Struct<T>> NSData(T structData) {
        super((SkipInit) null);
        if (structData == null) {
            throw new NullPointerException("structData");
        }
        initObject(init(structData.getHandle(), Struct.sizeOf(structData)));
    }
    
    /*<properties>*/
    @Property(selector = "length")
    public native @MachineSizedUInt long getLength();
    @Property(selector = "bytes")
    protected native @Pointer long getBytes0();
    /*</properties>*/
    /*<members>*//*</members>*/
    
    public ByteBuffer asByteBuffer() {
        return VM.newDirectByteBuffer(getBytes0(), getLength());
    }

    public byte[] getBytes() {
        int length = (int) getLength();
        byte[] bytes = new byte[length];
        getBytes(VM.getArrayValuesAddress(bytes), length);
        return bytes;
    }
    
    public int copy(ByteBuffer buffer, int dataOffset, int count) {
        if (buffer == null) {
            throw new NullPointerException("buffer");
        } else if (dataOffset < 0 || count < 0) {
            throw new IndexOutOfBoundsException();
        } else if (dataOffset >= getLength() || !buffer.hasRemaining()) {
            return -1;
        } else if (count == 0) {
            return 0;
        } else {
            int n = Math.min(count, Math.min(buffer.remaining(), (int) getLength() - dataOffset));
            VM.memcpy(BufferMarshalers.BufferMarshaler.getBufferAddress(buffer) + buffer.position(), getBytes0() + dataOffset, n);
            return n;
        }
    }
    
    public int copy(byte[] buffer, int bufferOffset, int dataOffset, int count) {
        if (buffer == null) {
            throw new NullPointerException("buffer");
        } else if (bufferOffset < 0 || dataOffset < 0 || count < 0) {
            throw new IndexOutOfBoundsException();
        } else if (dataOffset >= getLength() || bufferOffset > buffer.length) {
            return -1;
        } else if (count == 0) {
            return 0;
        } else {
            int n = Math.min(count, Math.min(buffer.length - bufferOffset, (int) getLength() - dataOffset));
            VM.memcpy(VM.getArrayValuesAddress(buffer) + bufferOffset, getBytes0() + dataOffset, n);
            return n;
        }
    }
    
    public <T extends Struct<T>> T getStructData(Class<T> type) {
        int length = (int) getLength();
        T struct = Struct.allocate(type);
        getBytes(struct.getHandle(), length);
        return struct;
    }
    
    public static NSData fromBaseEncodedData(NSData base64Data, NSDataBase64DecodingOptions options) {
        NSData data = new NSData((SkipInit) null);
        long handle = data.init(base64Data, options);
        if (handle == 0) {
            return null;
        }
        data.initObject(handle);
        return data;
    }

    public static NSData fromBaseEncodedString(String base64String, NSDataBase64DecodingOptions options) {
        NSData data = new NSData((SkipInit) null);
        long handle = data.init(base64String, options);
        if (handle == 0) {
            return null;
        }
        data.initObject(handle);
        return data;
    }

    public static NSData read(java.io.File file, NSDataReadingOptions readOptionsMask) throws NSErrorException {
        return readFile(file.getAbsolutePath(), readOptionsMask);
    }
    public static NSData read(java.io.File file) {
        return readFile(file.getAbsolutePath());
    }
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    public static NSData readMapped(java.io.File file) {
        return (NSData) readMappedFile(file.getAbsolutePath());
    }
    
    public void write(java.io.File file, boolean useAuxiliaryFile) {
        writeFile(file.getAbsolutePath(), useAuxiliaryFile);
    }
    public void write(java.io.File file, NSDataWritingOptions writeOptionsMask) throws NSErrorException {
        writeFile(file.getAbsolutePath(), writeOptionsMask);
    }
    /*<methods>*/
    @Method(selector = "getBytes:length:")
    protected native void getBytes(@Pointer long buffer, @MachineSizedUInt long length);
    @Method(selector = "subdataWithRange:")
    public native NSData getSubdata(@ByVal NSRange range);
    @Method(selector = "writeToFile:atomically:")
    protected native boolean writeFile(String path, boolean atomically);
    @Method(selector = "writeToURL:atomically:")
    public native boolean write(NSURL url, boolean atomically);
    protected boolean writeFile(String path, NSDataWritingOptions writeOptionsMask) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = writeFile(path, writeOptionsMask, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "writeToFile:options:error:")
    private native boolean writeFile(String path, NSDataWritingOptions writeOptionsMask, NSError.NSErrorPtr errorPtr);
    public boolean write(NSURL url, NSDataWritingOptions writeOptionsMask) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = write(url, writeOptionsMask, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "writeToURL:options:error:")
    private native boolean write(NSURL url, NSDataWritingOptions writeOptionsMask, NSError.NSErrorPtr errorPtr);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Method(selector = "rangeOfData:options:range:")
    public native @ByVal NSRange find(NSData dataToFind, NSDataSearchOptions mask, @ByVal NSRange searchRange);
    @Method(selector = "initWithBytes:length:")
    protected native @Pointer long init(@Pointer long bytes, @MachineSizedUInt long length);
    @Method(selector = "initWithBytesNoCopy:length:freeWhenDone:")
    protected native @Pointer long init(@Pointer long bytes, @MachineSizedUInt long length, boolean b);
    @Method(selector = "initWithData:")
    protected native @Pointer long init(NSData data);
    protected static NSData readFile(String path, NSDataReadingOptions readOptionsMask) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSData result = readFile(path, readOptionsMask, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "dataWithContentsOfFile:options:error:")
    private static native NSData readFile(String path, NSDataReadingOptions readOptionsMask, NSError.NSErrorPtr errorPtr);
    public static NSData read(NSURL url, NSDataReadingOptions readOptionsMask) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSData result = read(url, readOptionsMask, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "dataWithContentsOfURL:options:error:")
    private static native NSData read(NSURL url, NSDataReadingOptions readOptionsMask, NSError.NSErrorPtr errorPtr);
    @Method(selector = "dataWithContentsOfFile:")
    protected static native NSData readFile(String path);
    @Method(selector = "dataWithContentsOfURL:")
    public static native NSData read(NSURL url);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Method(selector = "initWithBase64EncodedString:options:")
    protected native @Pointer long init(String base64String, NSDataBase64DecodingOptions options);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Method(selector = "base64EncodedStringWithOptions:")
    public native String toBase64EncodedString(NSDataBase64EncodingOptions options);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Method(selector = "initWithBase64EncodedData:options:")
    protected native @Pointer long init(NSData base64Data, NSDataBase64DecodingOptions options);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Method(selector = "base64EncodedDataWithOptions:")
    public native NSData toBase64EncodedData(NSDataBase64EncodingOptions options);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 8.0. Use +dataWithContentsOfURL:options:error: and NSDataReadingMappedIfSafe or NSDataReadingMappedAlways instead.
     */
    @Deprecated
    @Method(selector = "dataWithContentsOfMappedFile:")
    protected static native NSObject readMappedFile(String path);
    /*</methods>*/
}
