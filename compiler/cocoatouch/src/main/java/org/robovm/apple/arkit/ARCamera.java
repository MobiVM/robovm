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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ARCamera/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ARCameraPtr extends Ptr<ARCamera, ARCameraPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ARCamera.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ARCamera() {}
    protected ARCamera(Handle h, long handle) { super(h, handle); }
    protected ARCamera(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "transform")
    public native @ByVal MatrixFloat4x4 getTransform();
    @Property(selector = "eulerAngles")
    public native @ByVal VectorFloat3 getEulerAngles();
    @Property(selector = "trackingState")
    public native ARTrackingState getTrackingState();
    @Property(selector = "trackingStateReason")
    public native ARTrackingStateReason getTrackingStateReason();
    @Property(selector = "intrinsics")
    public native @ByVal MatrixFloat3x4 getIntrinsics();
    @Property(selector = "imageResolution")
    public native @ByVal CGSize getImageResolution();
    @Property(selector = "projectionMatrix")
    public native @ByVal MatrixFloat4x4 getProjectionMatrix();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "projectPoint:orientation:viewportSize:")
    public native @ByVal CGPoint projectPoint(@ByVal VectorFloat3 point, UIInterfaceOrientation orientation, @ByVal CGSize viewportSize);
    @Method(selector = "projectionMatrixForOrientation:viewportSize:zNear:zFar:")
    public native @ByVal MatrixFloat4x4 getProjectionMatrix(UIInterfaceOrientation orientation, @ByVal CGSize viewportSize, @MachineSizedFloat double zNear, @MachineSizedFloat double zFar);
    @Method(selector = "viewMatrixForOrientation:")
    public native @ByVal MatrixFloat4x4 viewMatrixForOrientation(UIInterfaceOrientation orientation);
    /*</methods>*/
}
