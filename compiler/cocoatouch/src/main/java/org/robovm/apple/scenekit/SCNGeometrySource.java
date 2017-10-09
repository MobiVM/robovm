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
package org.robovm.apple.scenekit;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.glkit.*;
import org.robovm.apple.spritekit.*;
import org.robovm.apple.opengles.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("SceneKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SCNGeometrySource/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class SCNGeometrySourcePtr extends Ptr<SCNGeometrySource, SCNGeometrySourcePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SCNGeometrySource.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SCNGeometrySource() {}
    protected SCNGeometrySource(Handle h, long handle) { super(h, handle); }
    protected SCNGeometrySource(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public SCNGeometrySource(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "data")
    public native NSData getData();
    @Property(selector = "semantic")
    public native SCNGeometrySourceSemantic getSemantic();
    @Property(selector = "vectorCount")
    public native @MachineSizedSInt long getVectorCount();
    @Property(selector = "floatComponents")
    public native boolean usesFloatComponents();
    @Property(selector = "componentsPerVector")
    public native @MachineSizedSInt long getComponentsPerVector();
    @Property(selector = "bytesPerComponent")
    public native @MachineSizedSInt long getBytesPerComponent();
    @Property(selector = "dataOffset")
    public native @MachineSizedSInt long getDataOffset();
    @Property(selector = "dataStride")
    public native @MachineSizedSInt long getDataStride();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "geometrySourceWithData:semantic:vectorCount:floatComponents:componentsPerVector:bytesPerComponent:dataOffset:dataStride:")
    public static native SCNGeometrySource createWithData(NSData data, SCNGeometrySourceSemantic semantic, @MachineSizedSInt long vectorCount, boolean floatComponents, @MachineSizedSInt long componentsPerVector, @MachineSizedSInt long bytesPerComponent, @MachineSizedSInt long offset, @MachineSizedSInt long stride);
    @Method(selector = "geometrySourceWithVertices:count:")
    public static native SCNGeometrySource createWithVertices(SCNVector3 vertices, @MachineSizedSInt long count);
    @Method(selector = "geometrySourceWithNormals:count:")
    public static native SCNGeometrySource createWithNormals(SCNVector3 normals, @MachineSizedSInt long count);
    @Method(selector = "geometrySourceWithTextureCoordinates:count:")
    public static native SCNGeometrySource createWithTextureCoordinates(CGPoint texcoord, @MachineSizedSInt long count);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "geometrySourceWithBuffer:vertexFormat:semantic:vertexCount:dataOffset:dataStride:")
    public static native SCNGeometrySource createWithBuffer(MTLBuffer mtlBuffer, MTLVertexFormat vertexFormat, String semantic, @MachineSizedSInt long vertexCount, @MachineSizedSInt long offset, @MachineSizedSInt long stride);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
