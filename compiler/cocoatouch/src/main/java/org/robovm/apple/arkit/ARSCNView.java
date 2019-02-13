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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ARSCNView/*</name>*/ 
    extends /*<extends>*/SCNView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ARSCNViewPtr extends Ptr<ARSCNView, ARSCNViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ARSCNView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ARSCNView() {}
    protected ARSCNView(Handle h, long handle) { super(h, handle); }
    protected ARSCNView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:options:")
    public ARSCNView(@ByVal CGRect frame, NSDictionary<NSString, ?> options) { super(frame, options); }
    @Method(selector = "initWithFrame:")
    public ARSCNView(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public ARSCNView(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native ARSCNViewDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(ARSCNViewDelegate v);
    @Property(selector = "session")
    public native ARSession getSession();
    @Property(selector = "setSession:")
    public native void setSession(ARSession v);
    @Property(selector = "scene")
    public native SCNScene getScene();
    @Property(selector = "setScene:")
    public native void setScene(SCNScene v);
    @Property(selector = "automaticallyUpdatesLighting")
    public native boolean automaticallyUpdatesLighting();
    @Property(selector = "setAutomaticallyUpdatesLighting:")
    public native void setAutomaticallyUpdatesLighting(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="ARSCNDebugOptionShowWorldOrigin", optional=true)
    public static native SCNDebugOptions DebugOptionShowWorldOrigin();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="ARSCNDebugOptionShowFeaturePoints", optional=true)
    public static native SCNDebugOptions DebugOptionShowFeaturePoints();
    
    @Method(selector = "anchorForNode:")
    public native ARAnchor anchorForNode(SCNNode node);
    @Method(selector = "nodeForAnchor:")
    public native SCNNode nodeForAnchor(ARAnchor anchor);
    @Method(selector = "hitTest:types:")
    public native NSArray<ARHitTestResult> hitTest(@ByVal CGPoint point, ARHitTestResultType types);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "unprojectPoint:ontoPlaneWithTransform:")
    public native @ByVal VectorFloat3 unprojectPoint(@ByVal CGPoint point, @ByVal MatrixFloat4x4 planeTransform);
    /*</methods>*/
}
