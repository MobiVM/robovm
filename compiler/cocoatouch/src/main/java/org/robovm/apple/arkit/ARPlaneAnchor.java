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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ARPlaneAnchor/*</name>*/ 
    extends /*<extends>*/ARAnchor/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ARPlaneAnchorPtr extends Ptr<ARPlaneAnchor, ARPlaneAnchorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ARPlaneAnchor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ARPlaneAnchor() {}
    protected ARPlaneAnchor(Handle h, long handle) { super(h, handle); }
    protected ARPlaneAnchor(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "isClassificationSupported")
    public static native boolean isClassificationSupported();
    @Property(selector = "alignment")
    public native ARPlaneAnchorAlignment getAlignment();
    @Property(selector = "center")
    public native @ByVal VectorFloat3 getCenter();
    @Property(selector = "extent")
    public native @ByVal VectorFloat3 getExtent();
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Property(selector = "geometry")
    public native ARPlaneGeometry getGeometry();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "classificationStatus")
    public native ARPlaneClassificationStatus getClassificationStatus();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "classification")
    public native ARPlaneClassification getClassification();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
