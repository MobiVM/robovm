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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSFileHandle/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    public static class Notifications {
        public static NSObject observeReadCompletion(NSFileHandle object, final VoidBlock2<NSFileHandle, NSData> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(ReadCompletionNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    NSData d = null;
                    NSDictionary<?, ?> data = a.getUserInfo();
                    if (data.containsKey(NotificationDataItem())) {
                        d = (NSData)data.get(NotificationDataItem());
                    }
                    block.invoke((NSFileHandle)a.getObject(), d);
                }
            });
        }
        public static NSObject observeReadToEndOfFileCompletion(NSFileHandle object, final VoidBlock2<NSFileHandle, NSData> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(ReadToEndOfFileCompletionNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    NSData d = null;
                    NSDictionary<?, ?> data = a.getUserInfo();
                    if (data.containsKey(NotificationDataItem())) {
                        d = (NSData)data.get(NotificationDataItem());
                    }
                    block.invoke((NSFileHandle)a.getObject(), d);
                }
            });
        }
        public static NSObject observeConnectionAccepted(NSFileHandle object, final VoidBlock2<NSFileHandle, NSFileHandle> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(ConnectionAcceptedNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    NSFileHandle f = null;
                    NSDictionary<?, ?> data = a.getUserInfo();
                    if (data.containsKey(NotificationDataItem())) {
                        f = (NSFileHandle)data.get(NotificationFileHandleItem());
                    }
                    block.invoke((NSFileHandle)a.getObject(), f);
                }
            });
        }
        public static NSObject observeDataAvailable(NSFileHandle object, final VoidBlock1<NSFileHandle> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(DataAvailableNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke((NSFileHandle)a.getObject());
                }
            });
        }
    }
    
    /*<ptr>*/public static class NSFileHandlePtr extends Ptr<NSFileHandle, NSFileHandlePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSFileHandle.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSFileHandle() {}
    protected NSFileHandle(Handle h, long handle) { super(h, handle); }
    protected NSFileHandle(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFileDescriptor:closeOnDealloc:")
    public NSFileHandle(int fd, boolean closeopt) { super((SkipInit) null); initObject(init(fd, closeopt)); }
    @Method(selector = "initWithCoder:")
    public NSFileHandle(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    @Method(selector = "initWithFileDescriptor:")
    public NSFileHandle(int fd) { super((SkipInit) null); initObject(init(fd)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "availableData")
    public native NSData getAvailableData();
    @Property(selector = "fileHandleWithStandardInput")
    public static native NSFileHandle getStandardInput();
    @Property(selector = "fileHandleWithStandardOutput")
    public static native NSFileHandle getStandardOutput();
    @Property(selector = "fileHandleWithStandardError")
    public static native NSFileHandle getStandardError();
    @Property(selector = "fileHandleWithNullDevice")
    public static native NSFileHandle getNullDevice();
    @Property(selector = "readabilityHandler")
    public native @Block VoidBlock1<NSFileHandle> getReadabilityHandler();
    @Property(selector = "setReadabilityHandler:")
    public native void setReadabilityHandler(@Block VoidBlock1<NSFileHandle> v);
    @Property(selector = "writeabilityHandler")
    public native @Block VoidBlock1<NSFileHandle> getWriteabilityHandler();
    @Property(selector = "setWriteabilityHandler:")
    public native void setWriteabilityHandler(@Block VoidBlock1<NSFileHandle> v);
    @Property(selector = "fileDescriptor")
    public native int getFileDescriptor();
    /**
     * @deprecated Use getOffset:error:
     */
    @Deprecated
    @Property(selector = "offsetInFile")
    public native long getOffsetInFile();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    
    public void readInBackgroundAndNotify(NSRunLoopMode...modes) {
        List<String> list = new ArrayList<>();
        for (NSRunLoopMode mode : modes) {
            list.add(mode.value().toString());
        }
        readInBackgroundAndNotify(list);
    }
    public void readToEndOfFileInBackgroundAndNotify(NSRunLoopMode...modes) {
        List<String> list = new ArrayList<>();
        for (NSRunLoopMode mode : modes) {
            list.add(mode.value().toString());
        }
        readToEndOfFileInBackgroundAndNotify(list);
    }
    public void acceptConnectionInBackgroundAndNotify(NSRunLoopMode...modes) {
        List<String> list = new ArrayList<>();
        for (NSRunLoopMode mode : modes) {
            list.add(mode.value().toString());
        }
        acceptConnectionInBackgroundAndNotify(list);
    }
    public void waitForDataInBackgroundAndNotify(NSRunLoopMode...modes) {
        List<String> list = new ArrayList<>();
        for (NSRunLoopMode mode : modes) {
            list.add(mode.value().toString());
        }
        waitForDataInBackgroundAndNotify(list);
    }
    /*<methods>*/
    @GlobalValue(symbol="NSFileHandleReadCompletionNotification", optional=true)
    public static native NSString ReadCompletionNotification();
    @GlobalValue(symbol="NSFileHandleReadToEndOfFileCompletionNotification", optional=true)
    public static native NSString ReadToEndOfFileCompletionNotification();
    @GlobalValue(symbol="NSFileHandleConnectionAcceptedNotification", optional=true)
    public static native NSString ConnectionAcceptedNotification();
    @GlobalValue(symbol="NSFileHandleDataAvailableNotification", optional=true)
    public static native NSString DataAvailableNotification();
    @GlobalValue(symbol="NSFileHandleNotificationDataItem", optional=true)
    protected static native NSString NotificationDataItem();
    @GlobalValue(symbol="NSFileHandleNotificationFileHandleItem", optional=true)
    protected static native NSString NotificationFileHandleItem();
    
    @Method(selector = "initWithFileDescriptor:closeOnDealloc:")
    protected native @Pointer long init(int fd, boolean closeopt);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /**
     * @since Available in iOS 13.0 and later.
     */
    public NSData readDataToEndOfFileEx() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSData result = readDataToEndOfFileEx(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "readDataToEndOfFileAndReturnError:")
    private native NSData readDataToEndOfFileEx(NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 13.0 and later.
     */
    public NSData readDataUpToLengthEx(@MachineSizedUInt long length) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSData result = readDataUpToLengthEx(length, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "readDataUpToLength:error:")
    private native NSData readDataUpToLengthEx(@MachineSizedUInt long length, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 13.0 and later.
     */
    public boolean writeDataEx(NSData data) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = writeDataEx(data, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "writeData:error:")
    private native boolean writeDataEx(NSData data, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 13.0 and later.
     */
    public boolean getOffsetEx(LongPtr offsetInFile) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = getOffsetEx(offsetInFile, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "getOffset:error:")
    private native boolean getOffsetEx(LongPtr offsetInFile, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 13.0 and later.
     */
    public boolean seekToEndReturningOffsetEx(LongPtr offsetInFile) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = seekToEndReturningOffsetEx(offsetInFile, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "seekToEndReturningOffset:error:")
    private native boolean seekToEndReturningOffsetEx(LongPtr offsetInFile, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 13.0 and later.
     */
    public boolean seekToOffsetEx(long offset) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = seekToOffsetEx(offset, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "seekToOffset:error:")
    private native boolean seekToOffsetEx(long offset, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 13.0 and later.
     */
    public boolean truncateAtOffsetEx(long offset) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = truncateAtOffsetEx(offset, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "truncateAtOffset:error:")
    private native boolean truncateAtOffsetEx(long offset, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "synchronizeAndReturnError:")
    public native boolean synchronizeAndReturnError(NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "closeAndReturnError:")
    public native boolean closeAndReturnError(NSError.NSErrorPtr error);
    @Method(selector = "fileHandleForReadingAtPath:")
    public static native NSFileHandle createForReading(String path);
    @Method(selector = "fileHandleForWritingAtPath:")
    public static native NSFileHandle createForWriting(String path);
    @Method(selector = "fileHandleForUpdatingAtPath:")
    public static native NSFileHandle createForUpdating(String path);
    public static NSFileHandle createForReading(NSURL url) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSFileHandle result = createForReading(url, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "fileHandleForReadingFromURL:error:")
    private static native NSFileHandle createForReading(NSURL url, NSError.NSErrorPtr error);
    public static NSFileHandle createForWriting(NSURL url) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSFileHandle result = createForWriting(url, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "fileHandleForWritingToURL:error:")
    private static native NSFileHandle createForWriting(NSURL url, NSError.NSErrorPtr error);
    public static NSFileHandle createForUpdating(NSURL url) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSFileHandle result = createForUpdating(url, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "fileHandleForUpdatingURL:error:")
    private static native NSFileHandle createForUpdating(NSURL url, NSError.NSErrorPtr error);
    @Method(selector = "readInBackgroundAndNotifyForModes:")
    public native void readInBackgroundAndNotify(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> modes);
    @Method(selector = "readInBackgroundAndNotify")
    public native void readInBackgroundAndNotify();
    @Method(selector = "readToEndOfFileInBackgroundAndNotifyForModes:")
    public native void readToEndOfFileInBackgroundAndNotify(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> modes);
    @Method(selector = "readToEndOfFileInBackgroundAndNotify")
    public native void readToEndOfFileInBackgroundAndNotify();
    @Method(selector = "acceptConnectionInBackgroundAndNotifyForModes:")
    public native void acceptConnectionInBackgroundAndNotify(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> modes);
    @Method(selector = "acceptConnectionInBackgroundAndNotify")
    public native void acceptConnectionInBackgroundAndNotify();
    @Method(selector = "waitForDataInBackgroundAndNotifyForModes:")
    public native void waitForDataInBackgroundAndNotify(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> modes);
    @Method(selector = "waitForDataInBackgroundAndNotify")
    public native void waitForDataInBackgroundAndNotify();
    @Method(selector = "initWithFileDescriptor:")
    protected native @Pointer long init(int fd);
    /**
     * @deprecated Use readDataToEndOfFileAndReturnError:
     */
    @Deprecated
    @Method(selector = "readDataToEndOfFile")
    public native NSData readDataToEndOfFile();
    /**
     * @deprecated Use readDataUpToLength:error:
     */
    @Deprecated
    @Method(selector = "readDataOfLength:")
    public native NSData readData(@MachineSizedUInt long length);
    /**
     * @deprecated Use writeData:error:
     */
    @Deprecated
    @Method(selector = "writeData:")
    public native void writeData(NSData data);
    /**
     * @deprecated Use seekToEndReturningOffset:error:
     */
    @Deprecated
    @Method(selector = "seekToEndOfFile")
    public native long seekToEndOfFile();
    /**
     * @deprecated Use seekToOffset:error:
     */
    @Deprecated
    @Method(selector = "seekToFileOffset:")
    public native void seekToFileOffset(long offset);
    /**
     * @deprecated Use truncateAtOffset:error:
     */
    @Deprecated
    @Method(selector = "truncateFileAtOffset:")
    public native void truncateFile(long offset);
    /**
     * @deprecated Use synchronizeAndReturnError:
     */
    @Deprecated
    @Method(selector = "synchronizeFile")
    public native void synchronizeFile();
    /**
     * @deprecated Use closeAndReturnError:
     */
    @Deprecated
    @Method(selector = "closeFile")
    public native void closeFile();
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    /*</methods>*/
}
