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
package org.robovm.apple.avfoundation;

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
import org.robovm.apple.foundation.*;
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.mediatoolbox.*;
import org.robovm.apple.audiotoolbox.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVCaptureSession/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    public static class Notifications {
        /**
         * @since Available in iOS 4.0 and later.
         */
        public static NSObjectProtocol observeRuntimeError(AVCaptureSession object, final VoidBlock2<AVCaptureSession, NSError> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(RuntimeErrorNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    NSDictionary<?, ?> data = a.getUserInfo();
                    NSError error = null;
                    if (data.containsKey(NotificationErrorKey())) {
                        error = (NSError) data.get(NotificationErrorKey());
                    }
                    block.invoke((AVCaptureSession)a.getObject(), error);
                }
            });
        }
        /**
         * @since Available in iOS 4.0 and later.
         */
        public static NSObjectProtocol observeDidStartRunning(AVCaptureSession object, final VoidBlock1<AVCaptureSession> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(DidStartRunningNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke((AVCaptureSession)a.getObject());
                }
            });
        }
        /**
         * @since Available in iOS 4.0 and later.
         */
        public static NSObjectProtocol observeDidStopRunning(AVCaptureSession object, final VoidBlock1<AVCaptureSession> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(DidStopRunningNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke((AVCaptureSession)a.getObject());
                }
            });
        }
        /**
         * @since Available in iOS 4.0 and later.
         */
        public static NSObjectProtocol observeWasInterrupted(AVCaptureSession object, final VoidBlock2<AVCaptureSession, AVCaptureSessionInterruptionReason> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(WasInterruptedNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification notification) {
                    AVCaptureSessionInterruptionReason reason = AVCaptureSessionInterruptionReason.Unavailable;
                    if (Foundation.getMajorSystemVersion() >= 9) {
                        NSDictionary<?, ?> data = notification.getUserInfo();
                        int value = data.getInt(NotificationInterruptionReasonKey(), 0);
                        if (value != 0) {
                            reason = AVCaptureSessionInterruptionReason.valueOf(value);
                        }
                    }
                    block.invoke((AVCaptureSession)notification.getObject(), reason);
                }
            });
        }
        /**
         * @since Available in iOS 4.0 and later.
         */
        public static NSObjectProtocol observeInterruptionEnded(AVCaptureSession object, final VoidBlock1<AVCaptureSession> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(InterruptionEndedNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke((AVCaptureSession)a.getObject());
                }
            });
        }
    }
    
    /*<ptr>*/public static class AVCaptureSessionPtr extends Ptr<AVCaptureSession, AVCaptureSessionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVCaptureSession.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVCaptureSession() {}
    protected AVCaptureSession(Handle h, long handle) { super(h, handle); }
    protected AVCaptureSession(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sessionPreset")
    public native AVCaptureSessionPreset getSessionPreset();
    @Property(selector = "setSessionPreset:")
    public native void setSessionPreset(AVCaptureSessionPreset v);
    @Property(selector = "inputs")
    public native NSArray<AVCaptureInput> getInputs();
    @Property(selector = "outputs")
    public native NSArray<AVCaptureOutput> getOutputs();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "connections")
    public native NSArray<AVCaptureConnection> getConnections();
    @Property(selector = "isRunning")
    public native boolean isRunning();
    @Property(selector = "isInterrupted")
    public native boolean isInterrupted();
    @Property(selector = "usesApplicationAudioSession")
    public native boolean usesApplicationAudioSession();
    @Property(selector = "setUsesApplicationAudioSession:")
    public native void setUsesApplicationAudioSession(boolean v);
    @Property(selector = "automaticallyConfiguresApplicationAudioSession")
    public native boolean automaticallyConfiguresApplicationAudioSession();
    @Property(selector = "setAutomaticallyConfiguresApplicationAudioSession:")
    public native void setAutomaticallyConfiguresApplicationAudioSession(boolean v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "automaticallyConfiguresCaptureDeviceForWideColor")
    public native boolean automaticallyConfiguresCaptureDeviceForWideColor();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setAutomaticallyConfiguresCaptureDeviceForWideColor:")
    public native void setAutomaticallyConfiguresCaptureDeviceForWideColor(boolean v);
    /**
     * @since Available in iOS 15.4 and later.
     */
    @Property(selector = "synchronizationClock")
    public native CMClock getSynchronizationClock();
    /**
     * @deprecated Deprecated in iOS 15.4. Use synchronizationClock
     */
    @Deprecated
    @Property(selector = "masterClock")
    public native CMClock getMasterClock();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="AVCaptureSessionRuntimeErrorNotification", optional=true)
    public static native NSString RuntimeErrorNotification();
    @GlobalValue(symbol="AVCaptureSessionErrorKey", optional=true)
    protected static native NSString NotificationErrorKey();
    @GlobalValue(symbol="AVCaptureSessionDidStartRunningNotification", optional=true)
    public static native NSString DidStartRunningNotification();
    @GlobalValue(symbol="AVCaptureSessionDidStopRunningNotification", optional=true)
    public static native NSString DidStopRunningNotification();
    @GlobalValue(symbol="AVCaptureSessionWasInterruptedNotification", optional=true)
    public static native NSString WasInterruptedNotification();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="AVCaptureSessionInterruptionReasonKey", optional=true)
    protected static native NSString NotificationInterruptionReasonKey();
    /**
     * @since Available in iOS 11.1 and later.
     */
    @GlobalValue(symbol="AVCaptureSessionInterruptionSystemPressureStateKey", optional=true)
    public static native String InterruptionSystemPressureStateKey();
    @GlobalValue(symbol="AVCaptureSessionInterruptionEndedNotification", optional=true)
    public static native NSString InterruptionEndedNotification();
    
    @Method(selector = "canSetSessionPreset:")
    public native boolean canSetSessionPreset(AVCaptureSessionPreset preset);
    @Method(selector = "canAddInput:")
    public native boolean canAddInput(AVCaptureInput input);
    @Method(selector = "addInput:")
    public native void addInput(AVCaptureInput input);
    @Method(selector = "removeInput:")
    public native void removeInput(AVCaptureInput input);
    @Method(selector = "canAddOutput:")
    public native boolean canAddOutput(AVCaptureOutput output);
    @Method(selector = "addOutput:")
    public native void addOutput(AVCaptureOutput output);
    @Method(selector = "removeOutput:")
    public native void removeOutput(AVCaptureOutput output);
    @Method(selector = "addInputWithNoConnections:")
    public native void addInputWithNoConnections(AVCaptureInput input);
    @Method(selector = "addOutputWithNoConnections:")
    public native void addOutputWithNoConnections(AVCaptureOutput output);
    @Method(selector = "canAddConnection:")
    public native boolean canAddConnection(AVCaptureConnection connection);
    @Method(selector = "addConnection:")
    public native void addConnection(AVCaptureConnection connection);
    @Method(selector = "removeConnection:")
    public native void removeConnection(AVCaptureConnection connection);
    @Method(selector = "beginConfiguration")
    public native void beginConfiguration();
    @Method(selector = "commitConfiguration")
    public native void commitConfiguration();
    @Method(selector = "startRunning")
    public native void startRunning();
    @Method(selector = "stopRunning")
    public native void stopRunning();
    /*</methods>*/
}
