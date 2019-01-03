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
package org.robovm.apple.arkit;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.scenekit.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.spritekit.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.imageio.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ARKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ARFrame/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ARFramePtr extends Ptr<ARFrame, ARFramePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ARFrame.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ARFrame() {}
    protected ARFrame(Handle h, long handle) { super(h, handle); }
    protected ARFrame(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "timestamp")
    public native double getTimestamp();
    @Property(selector = "capturedImage")
    public native CVPixelBuffer getCapturedImage();
    @Property(selector = "capturedDepthData")
    public native AVDepthData getCapturedDepthData();
    @Property(selector = "capturedDepthDataTimestamp")
    public native double getCapturedDepthDataTimestamp();
    @Property(selector = "camera")
    public native ARCamera getCamera();
    @Property(selector = "anchors")
    public native NSArray<ARAnchor> getAnchors();
    @Property(selector = "lightEstimate")
    public native ARLightEstimate getLightEstimate();
    @Property(selector = "rawFeaturePoints")
    public native ARPointCloud getRawFeaturePoints();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "worldMappingStatus")
    public native ARWorldMappingStatus getWorldMappingStatus();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "hitTest:types:")
    public native NSArray<ARHitTestResult> hitTest(@ByVal CGPoint point, ARHitTestResultType types);
    @Method(selector = "displayTransformForOrientation:viewportSize:")
    public native @ByVal CGAffineTransform displayTransform(UIInterfaceOrientation orientation, @ByVal CGSize viewportSize);
    /*</methods>*/
}
