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
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Vision") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VNFaceLandmarks2D/*</name>*/ 
    extends /*<extends>*/VNFaceLandmarks/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VNFaceLandmarks2DPtr extends Ptr<VNFaceLandmarks2D, VNFaceLandmarks2DPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VNFaceLandmarks2D.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected VNFaceLandmarks2D() {}
    protected VNFaceLandmarks2D(Handle h, long handle) { super(h, handle); }
    protected VNFaceLandmarks2D(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "allPoints")
    public native VNFaceLandmarkRegion2D getAllPoints();
    @Property(selector = "faceContour")
    public native VNFaceLandmarkRegion2D getFaceContour();
    @Property(selector = "leftEye")
    public native VNFaceLandmarkRegion2D getLeftEye();
    @Property(selector = "rightEye")
    public native VNFaceLandmarkRegion2D getRightEye();
    @Property(selector = "leftEyebrow")
    public native VNFaceLandmarkRegion2D getLeftEyebrow();
    @Property(selector = "rightEyebrow")
    public native VNFaceLandmarkRegion2D getRightEyebrow();
    @Property(selector = "nose")
    public native VNFaceLandmarkRegion2D getNose();
    @Property(selector = "noseCrest")
    public native VNFaceLandmarkRegion2D getNoseCrest();
    @Property(selector = "medianLine")
    public native VNFaceLandmarkRegion2D getMedianLine();
    @Property(selector = "outerLips")
    public native VNFaceLandmarkRegion2D getOuterLips();
    @Property(selector = "innerLips")
    public native VNFaceLandmarkRegion2D getInnerLips();
    @Property(selector = "leftPupil")
    public native VNFaceLandmarkRegion2D getLeftPupil();
    @Property(selector = "rightPupil")
    public native VNFaceLandmarkRegion2D getRightPupil();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
