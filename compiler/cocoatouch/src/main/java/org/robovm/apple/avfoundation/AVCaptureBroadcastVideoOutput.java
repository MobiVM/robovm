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
import org.robovm.apple.videotoolbox.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 27.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVCaptureBroadcastVideoOutput/*</name>*/ 
    extends /*<extends>*/AVCaptureOutput/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVCaptureBroadcastVideoOutputPtr extends Ptr<AVCaptureBroadcastVideoOutput, AVCaptureBroadcastVideoOutputPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVCaptureBroadcastVideoOutput.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVCaptureBroadcastVideoOutput() {}
    protected AVCaptureBroadcastVideoOutput(Handle h, long handle) { super(h, handle); }
    protected AVCaptureBroadcastVideoOutput(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native AVCaptureBroadcastVideoOutputDelegate getDelegate();
    @Property(selector = "delegateCallbackQueue")
    public native DispatchQueue getDelegateCallbackQueue();
    @Property(selector = "videoSettings")
    public native NSDictionary<NSString, ?> getVideoSettings();
    @Property(selector = "maxBufferedFrameCount")
    public native @MachineSizedSInt long getMaxBufferedFrameCount();
    @Property(selector = "setMaxBufferedFrameCount:")
    public native void setMaxBufferedFrameCount(@MachineSizedSInt long v);
    @Property(selector = "maxSupportedBufferedFrameCount")
    public static native @MachineSizedSInt long getMaxSupportedBufferedFrameCount();
    @Property(selector = "ancillaryDataEncoder")
    public native AVCaptureAncillaryDataEncoder getAncillaryDataEncoder();
    @Property(selector = "droppedFrameReplacementPolicy")
    public native AVCaptureBroadcastVideoOutputDroppedFrameReplacementPolicy getDroppedFrameReplacementPolicy();
    @Property(selector = "setDroppedFrameReplacementPolicy:")
    public native void setDroppedFrameReplacementPolicy(AVCaptureBroadcastVideoOutputDroppedFrameReplacementPolicy v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setDelegate:queue:")
    public native void setDelegate(AVCaptureBroadcastVideoOutputDelegate delegate, DispatchQueue delegateCallbackQueue);
    @Method(selector = "resetFrameBuffer")
    public native void resetFrameBuffer();
    /*</methods>*/
}
