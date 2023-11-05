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
package org.robovm.apple.cinematic;

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
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Cinematic") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CNObjectTracker/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CNObjectTrackerPtr extends Ptr<CNObjectTracker, CNObjectTrackerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CNObjectTracker.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CNObjectTracker() {}
    protected CNObjectTracker(Handle h, long handle) { super(h, handle); }
    protected CNObjectTracker(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCommandQueue:")
    public CNObjectTracker(MTLCommandQueue commandQueue) { super((SkipInit) null); initObject(init(commandQueue)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isSupported")
    public static native boolean isSupported();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCommandQueue:")
    protected native @Pointer long init(MTLCommandQueue commandQueue);
    @Method(selector = "findObjectAtPoint:sourceImage:")
    public native CNBoundsPrediction findObject(@ByVal CGPoint point, CVPixelBuffer sourceImage);
    @Method(selector = "startTrackingAt:within:sourceImage:sourceDisparity:")
    public native boolean startTracking(@ByVal CMTime time, @ByVal CGRect normalizedBounds, CVPixelBuffer sourceImage, CVPixelBuffer sourceDisparity);
    @Method(selector = "continueTrackingAt:sourceImage:sourceDisparity:")
    public native CNBoundsPrediction continueTracking(@ByVal CMTime time, CVPixelBuffer sourceImage, CVPixelBuffer sourceDisparity);
    @Method(selector = "finishDetectionTrack")
    public native CNDetectionTrack finishDetectionTrack();
    @Method(selector = "resetDetectionTrack")
    public native void resetDetectionTrack();
    /*</methods>*/
}
