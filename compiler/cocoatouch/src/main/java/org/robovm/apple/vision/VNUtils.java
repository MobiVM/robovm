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
package org.robovm.apple.vision;

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
import org.robovm.apple.coreml.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.imageio.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("Vision")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VNUtils/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(VNUtils.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="VNNormalizedIdentityRect", optional=true)
    public static native @ByVal CGRect getNormalizedIdentityRect();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="VNVisionVersionNumber", optional=true)
    public static native double getVisionVerison();
    
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Bridge(symbol="VNNormalizedRectIsIdentityRect", optional=true)
    public static native boolean getNormalizedRectIsIdentityRect(@ByVal CGRect normalizedRect);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Bridge(symbol="VNImagePointForNormalizedPoint", optional=true)
    public static native @ByVal CGPoint getImagePointForNormalizedPoint(@ByVal CGPoint normalizedPoint, @MachineSizedUInt long imageWidth, @MachineSizedUInt long imageHeight);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Bridge(symbol="VNImageRectForNormalizedRect", optional=true)
    public static native @ByVal CGRect getImageRectForNormalizedRect(@ByVal CGRect normalizedRect, @MachineSizedUInt long imageWidth, @MachineSizedUInt long imageHeight);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Bridge(symbol="VNNormalizedRectForImageRect", optional=true)
    public static native @ByVal CGRect getNormalizedRectForImageRect(@ByVal CGRect imageRect, @MachineSizedUInt long imageWidth, @MachineSizedUInt long imageHeight);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Bridge(symbol="VNNormalizedFaceBoundingBoxPointForLandmarkPoint", optional=true)
    public static native @ByVal CGPoint getNormalizedFaceBoundingBoxPointForLandmarkPoint(@ByVal VectorFloat2 faceLandmarkPoint, @ByVal CGRect faceBoundingBox, @MachineSizedUInt long imageWidth, @MachineSizedUInt long imageHeight);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Bridge(symbol="VNImagePointForFaceLandmarkPoint", optional=true)
    public static native @ByVal CGPoint getImagePointForFaceLandmarkPoint(@ByVal VectorFloat2 faceLandmarkPoint, @ByVal CGRect faceBoundingBox, @MachineSizedUInt long imageWidth, @MachineSizedUInt long imageHeight);
    /*</methods>*/
}
