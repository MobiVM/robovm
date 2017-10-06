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
/**
 * @since Available in iOS 6.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVPlayerItemVideoOutput/*</name>*/ 
    extends /*<extends>*/AVPlayerItemOutput/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVPlayerItemVideoOutputPtr extends Ptr<AVPlayerItemVideoOutput, AVPlayerItemVideoOutputPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVPlayerItemVideoOutput.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVPlayerItemVideoOutput() {}
    protected AVPlayerItemVideoOutput(Handle h, long handle) { super(h, handle); }
    protected AVPlayerItemVideoOutput(SkipInit skipInit) { super(skipInit); }
    @WeaklyLinked
    @Method(selector = "initWithPixelBufferAttributes:")
    public AVPlayerItemVideoOutput(CVPixelBufferAttributes pixelBufferAttributes) { super((SkipInit) null); initObject(init(pixelBufferAttributes)); }
    /**
     * @since Available in iOS 10.0 and later.
     */
    @WeaklyLinked
    @Method(selector = "initWithOutputSettings:")
    public AVPlayerItemVideoOutput(NSDictionary<NSString, ?> outputSettings) { super((SkipInit) null); initObject(init(outputSettings)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native AVPlayerItemOutputPullDelegate getDelegate();
    @WeaklyLinked
    @Property(selector = "delegateQueue")
    public native DispatchQueue getDelegateQueue();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @WeaklyLinked
    @Method(selector = "initWithPixelBufferAttributes:")
    protected native @Pointer long init(CVPixelBufferAttributes pixelBufferAttributes);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @WeaklyLinked
    @Method(selector = "initWithOutputSettings:")
    protected native @Pointer long init(NSDictionary<NSString, ?> outputSettings);
    @Method(selector = "hasNewPixelBufferForItemTime:")
    public native boolean hasNewPixelBufferForItemTime(@ByVal CMTime itemTime);
    @WeaklyLinked
    @Method(selector = "copyPixelBufferForItemTime:itemTimeForDisplay:")
    public native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CVPixelBuffer getPixelBufferForItemTime(@ByVal CMTime itemTime, CMTime outItemTimeForDisplay);
    @WeaklyLinked
    @Method(selector = "setDelegate:queue:")
    public native void setDelegate(AVPlayerItemOutputPullDelegate delegate, DispatchQueue delegateQueue);
    @Method(selector = "requestNotificationOfMediaDataChangeWithAdvanceInterval:")
    public native void requestNotificationOfMediaDataChange(double interval);
    /*</methods>*/
}
