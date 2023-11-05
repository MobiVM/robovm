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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CNDetection/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CNDetectionPtr extends Ptr<CNDetection, CNDetectionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CNDetection.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CNDetection() {}
    protected CNDetection(Handle h, long handle) { super(h, handle); }
    protected CNDetection(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTime:detectionType:normalizedRect:focusDisparity:")
    public CNDetection(@ByVal CMTime time, CNDetectionType detectionType, @ByVal CGRect normalizedRect, float focusDisparity) { super((SkipInit) null); initObject(init(time, detectionType, normalizedRect, focusDisparity)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "time")
    public native @ByVal CMTime getTime();
    @Property(selector = "detectionType")
    public native CNDetectionType getDetectionType();
    @Property(selector = "normalizedRect")
    public native @ByVal CGRect getNormalizedRect();
    @Property(selector = "focusDisparity")
    public native float getFocusDisparity();
    @Property(selector = "detectionID")
    public native long getDetectionID();
    @Property(selector = "detectionGroupID")
    public native long getDetectionGroupID();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTime:detectionType:normalizedRect:focusDisparity:")
    protected native @Pointer long init(@ByVal CMTime time, CNDetectionType detectionType, @ByVal CGRect normalizedRect, float focusDisparity);
    @Method(selector = "isValidDetectionID:")
    public static native boolean isValidDetectionID(long detectionID);
    @Method(selector = "isValidDetectionGroupID:")
    public static native boolean isValidDetectionGroupID(long detectionGroupID);
    @Method(selector = "accessibilityLabelForDetectionType:")
    public static native String accessibilityLabelForDetectionType(CNDetectionType detectionType);
    @Method(selector = "disparityInNormalizedRect:sourceDisparity:detectionType:priorDisparity:")
    public static native float disparity(@ByVal CGRect normalizedRect, CVPixelBuffer sourceDisparity, CNDetectionType detectionType, float priorDisparity);
    /*</methods>*/
}
