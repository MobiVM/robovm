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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ARAnchor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements ARAnchorCopying, NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class ARAnchorPtr extends Ptr<ARAnchor, ARAnchorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ARAnchor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ARAnchor() {}
    protected ARAnchor(Handle h, long handle) { super(h, handle); }
    protected ARAnchor(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTransform:")
    public ARAnchor(@ByVal MatrixFloat4x4 transform) { super((SkipInit) null); initObject(init(transform)); }
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "initWithName:transform:")
    public ARAnchor(String name, @ByVal MatrixFloat4x4 transform) { super((SkipInit) null); initObject(init(name, transform)); }
    @Method(selector = "initWithAnchor:")
    public ARAnchor(ARAnchor anchor) { super((SkipInit) null); initObject(initWithAnchor(anchor)); }
    @Method(selector = "initWithCoder:")
    public ARAnchor(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "identifier")
    public native NSUUID getIdentifier();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "transform")
    public native @ByVal MatrixFloat4x4 getTransform();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTransform:")
    protected native @Pointer long init(@ByVal MatrixFloat4x4 transform);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "initWithName:transform:")
    protected native @Pointer long init(String name, @ByVal MatrixFloat4x4 transform);
    @Method(selector = "initWithAnchor:")
    protected native @Pointer long initWithAnchor(ARAnchor anchor);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
