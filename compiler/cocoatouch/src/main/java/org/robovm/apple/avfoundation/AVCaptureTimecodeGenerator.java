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
import org.robovm.apple.coremidi.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 26.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVCaptureTimecodeGenerator/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVCaptureTimecodeGeneratorPtr extends Ptr<AVCaptureTimecodeGenerator, AVCaptureTimecodeGeneratorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVCaptureTimecodeGenerator.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVCaptureTimecodeGenerator() {}
    protected AVCaptureTimecodeGenerator(Handle h, long handle) { super(h, handle); }
    protected AVCaptureTimecodeGenerator(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "availableSources")
    public native NSArray<AVCaptureTimecodeSource> getAvailableSources();
    @Property(selector = "currentSource")
    public native AVCaptureTimecodeSource getCurrentSource();
    @Property(selector = "delegate")
    public native AVCaptureTimecodeGeneratorDelegate getDelegate();
    @Property(selector = "delegateCallbackQueue")
    public native DispatchQueue getDelegateCallbackQueue();
    @Property(selector = "synchronizationTimeout")
    public native double getSynchronizationTimeout();
    @Property(selector = "setSynchronizationTimeout:")
    public native void setSynchronizationTimeout(double v);
    @Property(selector = "timecodeAlignmentOffset")
    public native double getTimecodeAlignmentOffset();
    @Property(selector = "setTimecodeAlignmentOffset:")
    public native void setTimecodeAlignmentOffset(double v);
    @Property(selector = "timecodeFrameDuration")
    public native @ByVal CMTime getTimecodeFrameDuration();
    @Property(selector = "setTimecodeFrameDuration:")
    public native void setTimecodeFrameDuration(@ByVal CMTime v);
    @Property(selector = "frameCountSource")
    public static native AVCaptureTimecodeSource getFrameCountSource();
    @Property(selector = "realTimeClockSource")
    public static native AVCaptureTimecodeSource getRealTimeClockSource();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setDelegate:queue:")
    public native void setDelegate(AVCaptureTimecodeGeneratorDelegate delegate, DispatchQueue callbackQueue);
    @Method(selector = "startSynchronizationWithTimecodeSource:")
    public native void startSynchronization(AVCaptureTimecodeSource source);
    @Method(selector = "generateInitialTimecode")
    public native @ByVal AVCaptureTimecode generateInitialTimecode();
    /*</methods>*/
}
