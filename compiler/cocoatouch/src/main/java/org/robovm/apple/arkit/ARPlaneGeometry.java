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
 * @since Available in iOS 11.3 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ARKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ARPlaneGeometry/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class ARPlaneGeometryPtr extends Ptr<ARPlaneGeometry, ARPlaneGeometryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ARPlaneGeometry.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ARPlaneGeometry() {}
    protected ARPlaneGeometry(Handle h, long handle) { super(h, handle); }
    protected ARPlaneGeometry(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public ARPlaneGeometry(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "vertexCount")
    public native @MachineSizedUInt long getVertexCount();
    @Property(selector = "vertices")
    public native VectorFloat3.VectorFloat3Ptr getVertices();
    @Property(selector = "textureCoordinateCount")
    public native @MachineSizedUInt long getTextureCoordinateCount();
    @Property(selector = "textureCoordinates")
    public native VectorFloat2.VectorFloat2Ptr getTextureCoordinates();
    @Property(selector = "triangleCount")
    public native @MachineSizedUInt long getTriangleCount();
    @Property(selector = "triangleIndices")
    public native ShortPtr getTriangleIndices();
    @Property(selector = "boundaryVertexCount")
    public native @MachineSizedUInt long getBoundaryVertexCount();
    @Property(selector = "boundaryVertices")
    public native VectorFloat3.VectorFloat3Ptr getBoundaryVertices();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
