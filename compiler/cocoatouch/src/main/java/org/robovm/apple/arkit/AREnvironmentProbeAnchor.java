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
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ARKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AREnvironmentProbeAnchor/*</name>*/ 
    extends /*<extends>*/ARAnchor/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AREnvironmentProbeAnchorPtr extends Ptr<AREnvironmentProbeAnchor, AREnvironmentProbeAnchorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AREnvironmentProbeAnchor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AREnvironmentProbeAnchor() {}
    protected AREnvironmentProbeAnchor(Handle h, long handle) { super(h, handle); }
    protected AREnvironmentProbeAnchor(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTransform:extent:")
    public AREnvironmentProbeAnchor(@ByVal MatrixFloat4x4 transform, @ByVal VectorFloat3 extent) { super((SkipInit) null); initObject(init(transform, extent)); }
    @Method(selector = "initWithName:transform:extent:")
    public AREnvironmentProbeAnchor(String name, @ByVal MatrixFloat4x4 transform, @ByVal VectorFloat3 extent) { super((SkipInit) null); initObject(init(name, transform, extent)); }
    @Method(selector = "initWithTransform:")
    public AREnvironmentProbeAnchor(@ByVal MatrixFloat4x4 transform) { super(transform); }
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "initWithName:transform:")
    public AREnvironmentProbeAnchor(String name, @ByVal MatrixFloat4x4 transform) { super(name, transform); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "environmentTexture")
    public native MTLTexture getEnvironmentTexture();
    @Property(selector = "extent")
    public native @ByVal VectorFloat3 getExtent();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTransform:extent:")
    protected native @Pointer long init(@ByVal MatrixFloat4x4 transform, @ByVal VectorFloat3 extent);
    @Method(selector = "initWithName:transform:extent:")
    protected native @Pointer long init(String name, @ByVal MatrixFloat4x4 transform, @ByVal VectorFloat3 extent);
    /*</methods>*/
}
