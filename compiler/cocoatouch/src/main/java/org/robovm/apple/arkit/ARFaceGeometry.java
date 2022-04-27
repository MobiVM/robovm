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
import org.robovm.apple.corelocation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.scenekit.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.spritekit.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.imageio.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ARKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ARFaceGeometry/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class ARFaceGeometryPtr extends Ptr<ARFaceGeometry, ARFaceGeometryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ARFaceGeometry.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ARFaceGeometry() {}
    protected ARFaceGeometry(Handle h, long handle) { super(h, handle); }
    protected ARFaceGeometry(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithBlendShapes:")
    public ARFaceGeometry(NSDictionary<NSString, NSNumber> blendShapes) { super((SkipInit) null); initObject(init(blendShapes)); }
    @Method(selector = "initWithCoder:")
    public ARFaceGeometry(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "vertexCount")
    public native @MachineSizedUInt long getVertexCount();
    @Property(selector = "vertices")
    public native VectorFloat3 getVertices();
    @Property(selector = "textureCoordinateCount")
    public native @MachineSizedUInt long getTextureCoordinateCount();
    @Property(selector = "textureCoordinates")
    public native VectorFloat2 getTextureCoordinates();
    @Property(selector = "triangleCount")
    public native @MachineSizedUInt long getTriangleCount();
    @Property(selector = "triangleIndices")
    public native ShortPtr getTriangleIndices();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithBlendShapes:")
    protected native @Pointer long init(NSDictionary<NSString, NSNumber> blendShapes);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
