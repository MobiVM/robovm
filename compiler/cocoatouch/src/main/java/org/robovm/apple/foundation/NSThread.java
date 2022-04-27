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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSThread/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    public static class Notifications {
        public static NSObjectProtocol observeWillBecomeMultiThreaded(final Runnable block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(WillBecomeMultiThreadedNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.run();
                }
            });
        }
        public static NSObjectProtocol observeDidBecomeSingleThreaded(final Runnable block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(DidBecomeSingleThreadedNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.run();
                }
            });
        }
        public static NSObjectProtocol observeWillExit(NSThread object, final VoidBlock1<NSThread> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(WillExitNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke((NSThread) a.getObject());
                }
            });
        }
    }
    
    /*<ptr>*/public static class NSThreadPtr extends Ptr<NSThread, NSThreadPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSThread.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NSThread() {}
    protected NSThread(Handle h, long handle) { super(h, handle); }
    protected NSThread(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTarget:selector:object:")
    public NSThread(NSObject target, Selector selector, NSObject argument) { super((SkipInit) null); initObject(init(target, selector, argument)); }
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "initWithBlock:")
    public NSThread(@Block Runnable block) { super((SkipInit) null); initObject(init(block)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "currentThread")
    public static native NSThread getCurrentThread();
    @Property(selector = "threadDictionary")
    public native NSMutableDictionary<?, ?> getThreadDictionary();
    @Property(selector = "qualityOfService")
    public native NSQualityOfService getQualityOfService();
    @Property(selector = "setQualityOfService:")
    public native void setQualityOfService(NSQualityOfService v);
    @Property(selector = "callStackReturnAddresses")
    public static native NSArray<NSNumber> getCallStackReturnAddresses();
    @Property(selector = "callStackSymbols")
    public static native NSArray<NSString> getCallStackSymbols();
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "setName:")
    public native void setName(String v);
    @Property(selector = "stackSize")
    public native @MachineSizedUInt long getStackSize();
    @Property(selector = "setStackSize:")
    public native void setStackSize(@MachineSizedUInt long v);
    @Property(selector = "isMainThread")
    public native boolean isMainThread();
    @Property(selector = "isMainThread")
    public static native boolean isCurrentThreadMainThread();
    @Property(selector = "mainThread")
    public static native NSThread getMainThread();
    @Property(selector = "isExecuting")
    public native boolean isExecuting();
    @Property(selector = "isFinished")
    public native boolean isFinished();
    @Property(selector = "isCancelled")
    public native boolean isCancelled();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="NSWillBecomeMultiThreadedNotification", optional=true)
    public static native NSString WillBecomeMultiThreadedNotification();
    @GlobalValue(symbol="NSDidBecomeSingleThreadedNotification", optional=true)
    public static native NSString DidBecomeSingleThreadedNotification();
    @GlobalValue(symbol="NSThreadWillExitNotification", optional=true)
    public static native NSString WillExitNotification();
    
    @Method(selector = "initWithTarget:selector:object:")
    protected native @Pointer long init(NSObject target, Selector selector, NSObject argument);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "initWithBlock:")
    protected native @Pointer long init(@Block Runnable block);
    @Method(selector = "cancel")
    public native void cancel();
    @Method(selector = "start")
    public native void start();
    @Method(selector = "main")
    public native void main();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "detachNewThreadWithBlock:")
    public static native void detachNewThread(@Block Runnable block);
    @Method(selector = "detachNewThreadSelector:toTarget:withObject:")
    public static native void detachNewThread(Selector selector, NSObject target, NSObject argument);
    @Method(selector = "isMultiThreaded")
    public static native boolean isMultiThreaded();
    @Method(selector = "sleepUntilDate:")
    public static native void sleep(NSDate date);
    @Method(selector = "sleepForTimeInterval:")
    public static native void sleep(double ti);
    @Method(selector = "exit")
    public static native void exit();
    @Method(selector = "threadPriority")
    public static native double getThreadPriority();
    @Method(selector = "setThreadPriority:")
    public static native boolean setThreadPriority(double p);
    /*</methods>*/
}
