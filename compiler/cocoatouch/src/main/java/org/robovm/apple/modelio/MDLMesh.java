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
package org.robovm.apple.modelio;

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
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ModelIO") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MDLMesh/*</name>*/ 
    extends /*<extends>*/MDLObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MDLMeshPtr extends Ptr<MDLMesh, MDLMeshPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MDLMesh.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MDLMesh() {}
    protected MDLMesh(Handle h, long handle) { super(h, handle); }
    protected MDLMesh(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithBufferAllocator:")
    public MDLMesh(MDLMeshBufferAllocator bufferAllocator) { super((SkipInit) null); initObject(init(bufferAllocator)); }
    @Method(selector = "initWithVertexBuffer:vertexCount:descriptor:submeshes:")
    public MDLMesh(MDLMeshBuffer vertexBuffer, @MachineSizedUInt long vertexCount, MDLVertexDescriptor descriptor, NSMutableArray<MDLSubmesh> submeshes) { super((SkipInit) null); initObject(init(vertexBuffer, vertexCount, descriptor, submeshes)); }
    @Method(selector = "initWithVertexBuffers:vertexCount:descriptor:submeshes:")
    public MDLMesh(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsListMarshaler.class) List<MDLMeshBuffer> vertexBuffers, @MachineSizedUInt long vertexCount, MDLVertexDescriptor descriptor, NSMutableArray<MDLSubmesh> submeshes) { super((SkipInit) null); initObject(init(vertexBuffers, vertexCount, descriptor, submeshes)); }
    @Method(selector = "initBoxWithExtent:segments:inwardNormals:geometryType:allocator:")
    public MDLMesh(@ByVal VectorFloat3 extent, @ByVal VectorInt3 segments, boolean inwardNormals, MDLGeometryType geometryType, MDLMeshBufferAllocator allocator) { super((SkipInit) null); initObject(init(extent, segments, inwardNormals, geometryType, allocator)); }
    @Method(selector = "initSphereWithExtent:segments:inwardNormals:geometryType:allocator:")
    public MDLMesh(@ByVal VectorFloat3 extent, @ByVal VectorInt2 segments, boolean inwardNormals, MDLGeometryType geometryType, MDLMeshBufferAllocator allocator) { super((SkipInit) null); initObject(init(extent, segments, inwardNormals, geometryType, allocator)); }
    @Method(selector = "initCylinderWithExtent:segments:inwardNormals:topCap:bottomCap:geometryType:allocator:")
    public MDLMesh(@ByVal VectorFloat3 extent, @ByVal VectorInt2 segments, boolean inwardNormals, boolean topCap, boolean bottomCap, MDLGeometryType geometryType, MDLMeshBufferAllocator allocator) { super((SkipInit) null); initObject(init(extent, segments, inwardNormals, topCap, bottomCap, geometryType, allocator)); }
    @Method(selector = "initCapsuleWithExtent:cylinderSegments:hemisphereSegments:inwardNormals:geometryType:allocator:")
    public MDLMesh(@ByVal VectorFloat3 extent, @ByVal VectorInt2 segments, int hemisphereSegments, boolean inwardNormals, MDLGeometryType geometryType, MDLMeshBufferAllocator allocator) { super((SkipInit) null); initObject(init(extent, segments, hemisphereSegments, inwardNormals, geometryType, allocator)); }
    @Method(selector = "initConeWithExtent:segments:inwardNormals:cap:geometryType:allocator:")
    public MDLMesh(@ByVal VectorFloat3 extent, @ByVal VectorInt2 segments, boolean inwardNormals, boolean cap, MDLGeometryType geometryType, MDLMeshBufferAllocator allocator) { super((SkipInit) null); initObject(init(extent, segments, inwardNormals, cap, geometryType, allocator)); }
    @Method(selector = "initPlaneWithExtent:segments:geometryType:allocator:")
    public MDLMesh(@ByVal VectorFloat3 extent, @ByVal VectorInt2 segments, MDLGeometryType geometryType, MDLMeshBufferAllocator allocator) { super((SkipInit) null); initObject(init(extent, segments, geometryType, allocator)); }
    @Method(selector = "initIcosahedronWithExtent:inwardNormals:geometryType:allocator:")
    public MDLMesh(@ByVal VectorFloat3 extent, boolean inwardNormals, MDLGeometryType geometryType, MDLMeshBufferAllocator allocator) { super((SkipInit) null); initObject(init(extent, inwardNormals, geometryType, allocator)); }
    @Method(selector = "initMeshBySubdividingMesh:submeshIndex:subdivisionLevels:allocator:")
    public MDLMesh(MDLMesh mesh, int submeshIndex, int subdivisionLevels, MDLMeshBufferAllocator allocator) { super((SkipInit) null); initObject(init(mesh, submeshIndex, subdivisionLevels, allocator)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "boundingBox")
    public native @ByVal MDLAxisAlignedBoundingBox getBoundingBox();
    @Property(selector = "vertexDescriptor")
    public native MDLVertexDescriptor getVertexDescriptor();
    @Property(selector = "setVertexDescriptor:")
    public native void setVertexDescriptor(MDLVertexDescriptor v);
    @Property(selector = "vertexCount")
    public native @MachineSizedUInt long getVertexCount();
    @Property(selector = "setVertexCount:")
    public native void setVertexCount(@MachineSizedUInt long v);
    @Property(selector = "vertexBuffers")
    public native NSArray<?> getVertexBuffers();
    @Property(selector = "setVertexBuffers:")
    public native void setVertexBuffers(NSArray<?> v);
    @Property(selector = "submeshes")
    public native NSMutableArray<MDLSubmesh> getSubmeshes();
    @Property(selector = "setSubmeshes:")
    public native void setSubmeshes(NSMutableArray<MDLSubmesh> v);
    @Property(selector = "allocator")
    public native MDLMeshBufferAllocator getAllocator();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithBufferAllocator:")
    protected native @Pointer long init(MDLMeshBufferAllocator bufferAllocator);
    @Method(selector = "initWithVertexBuffer:vertexCount:descriptor:submeshes:")
    protected native @Pointer long init(MDLMeshBuffer vertexBuffer, @MachineSizedUInt long vertexCount, MDLVertexDescriptor descriptor, NSMutableArray<MDLSubmesh> submeshes);
    @Method(selector = "initWithVertexBuffers:vertexCount:descriptor:submeshes:")
    protected native @Pointer long init(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsListMarshaler.class) List<MDLMeshBuffer> vertexBuffers, @MachineSizedUInt long vertexCount, MDLVertexDescriptor descriptor, NSMutableArray<MDLSubmesh> submeshes);
    @Method(selector = "vertexAttributeDataForAttributeNamed:")
    public native MDLVertexAttributeData getVertexAttributeData(String name);
    @Method(selector = "vertexAttributeDataForAttributeNamed:asFormat:")
    public native MDLVertexAttributeData getVertexAttributeData(String name, MDLVertexFormat format);
    @Method(selector = "addAttributeWithName:format:")
    public native void addAttribute(String name, MDLVertexFormat format);
    @Method(selector = "addAttributeWithName:format:type:data:stride:")
    public native void addAttribute(String name, MDLVertexFormat format, String type, NSData data, @MachineSizedSInt long stride);
    @Method(selector = "addAttributeWithName:format:type:data:stride:time:")
    public native void addAttribute(String name, MDLVertexFormat format, String type, NSData data, @MachineSizedSInt long stride, double time);
    @Method(selector = "addNormalsWithAttributeNamed:creaseThreshold:")
    public native void addNormals(String attributeName, float creaseThreshold);
    @Method(selector = "addTangentBasisForTextureCoordinateAttributeNamed:tangentAttributeNamed:bitangentAttributeNamed:")
    public native void addTangentBasis(String textureCoordinateAttributeName, String tangentAttributeName, String bitangentAttributeName);
    @Method(selector = "addTangentBasisForTextureCoordinateAttributeNamed:normalAttributeNamed:tangentAttributeNamed:")
    public native void addTangentBasisWithNormals(String textureCoordinateAttributeName, String normalAttributeName, String tangentAttributeName);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "addOrthTanBasisForTextureCoordinateAttributeNamed:normalAttributeNamed:tangentAttributeNamed:")
    public native void addOrthTanBasis(String textureCoordinateAttributeName, String normalAttributeName, String tangentAttributeName);
    @Method(selector = "addUnwrappedTextureCoordinatesForAttributeNamed:")
    public native void addUnwrappedTextureCoordinatesForAttributeNamed(String textureCoordinateAttributeName);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "flipTextureCoordinatesInAttributeNamed:")
    public native void flipTextureCoordinatesInAttributeNamed(String textureCoordinateAttributeName);
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 11.0.
     */
    @Deprecated
    @Method(selector = "makeVerticesUnique")
    public native void makeVerticesUnique();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "makeVerticesUniqueAndReturnError:")
    public native boolean makeVerticesUniqueAndReturnError(NSError.NSErrorPtr error);
    @Method(selector = "replaceAttributeNamed:withData:")
    public native void replaceAttribute(String name, MDLVertexAttributeData newData);
    @Method(selector = "updateAttributeNamed:withData:")
    public native void updateAttribute(String name, MDLVertexAttributeData newData);
    @Method(selector = "removeAttributeNamed:")
    public native void removeAttributeNamed(String name);
    @Method(selector = "initBoxWithExtent:segments:inwardNormals:geometryType:allocator:")
    protected native @Pointer long init(@ByVal VectorFloat3 extent, @ByVal VectorInt3 segments, boolean inwardNormals, MDLGeometryType geometryType, MDLMeshBufferAllocator allocator);
    @Method(selector = "initSphereWithExtent:segments:inwardNormals:geometryType:allocator:")
    protected native @Pointer long init(@ByVal VectorFloat3 extent, @ByVal VectorInt2 segments, boolean inwardNormals, MDLGeometryType geometryType, MDLMeshBufferAllocator allocator);
    @Method(selector = "initHemisphereWithExtent:segments:inwardNormals:cap:geometryType:allocator:")
    protected native @Pointer long initHemisphereWithExtent(@ByVal VectorFloat3 extent, @ByVal VectorInt2 segments, boolean inwardNormals, boolean cap, MDLGeometryType geometryType, MDLMeshBufferAllocator allocator);
    @Method(selector = "initCylinderWithExtent:segments:inwardNormals:topCap:bottomCap:geometryType:allocator:")
    protected native @Pointer long init(@ByVal VectorFloat3 extent, @ByVal VectorInt2 segments, boolean inwardNormals, boolean topCap, boolean bottomCap, MDLGeometryType geometryType, MDLMeshBufferAllocator allocator);
    @Method(selector = "initCapsuleWithExtent:cylinderSegments:hemisphereSegments:inwardNormals:geometryType:allocator:")
    protected native @Pointer long init(@ByVal VectorFloat3 extent, @ByVal VectorInt2 segments, int hemisphereSegments, boolean inwardNormals, MDLGeometryType geometryType, MDLMeshBufferAllocator allocator);
    @Method(selector = "initConeWithExtent:segments:inwardNormals:cap:geometryType:allocator:")
    protected native @Pointer long init(@ByVal VectorFloat3 extent, @ByVal VectorInt2 segments, boolean inwardNormals, boolean cap, MDLGeometryType geometryType, MDLMeshBufferAllocator allocator);
    @Method(selector = "initPlaneWithExtent:segments:geometryType:allocator:")
    protected native @Pointer long init(@ByVal VectorFloat3 extent, @ByVal VectorInt2 segments, MDLGeometryType geometryType, MDLMeshBufferAllocator allocator);
    @Method(selector = "initIcosahedronWithExtent:inwardNormals:geometryType:allocator:")
    protected native @Pointer long init(@ByVal VectorFloat3 extent, boolean inwardNormals, MDLGeometryType geometryType, MDLMeshBufferAllocator allocator);
    @Method(selector = "initMeshBySubdividingMesh:submeshIndex:subdivisionLevels:allocator:")
    protected native @Pointer long init(MDLMesh mesh, int submeshIndex, int subdivisionLevels, MDLMeshBufferAllocator allocator);
    @Method(selector = "newBoxWithDimensions:segments:geometryType:inwardNormals:allocator:")
    public static native MDLMesh newBox(@ByVal VectorFloat3 dimensions, @ByVal VectorInt3 segments, MDLGeometryType geometryType, boolean inwardNormals, MDLMeshBufferAllocator allocator);
    @Method(selector = "newEllipsoidWithRadii:radialSegments:verticalSegments:geometryType:inwardNormals:hemisphere:allocator:")
    public static native MDLMesh newEllipsoid(@ByVal VectorFloat3 radii, @MachineSizedUInt long radialSegments, @MachineSizedUInt long verticalSegments, MDLGeometryType geometryType, boolean inwardNormals, boolean hemisphere, MDLMeshBufferAllocator allocator);
    @Method(selector = "newCylinderWithHeight:radii:radialSegments:verticalSegments:geometryType:inwardNormals:allocator:")
    public static native MDLMesh newCylinder(float height, @ByVal VectorFloat2 radii, @MachineSizedUInt long radialSegments, @MachineSizedUInt long verticalSegments, MDLGeometryType geometryType, boolean inwardNormals, MDLMeshBufferAllocator allocator);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "newCapsuleWithHeight:radii:radialSegments:verticalSegments:hemisphereSegments:geometryType:inwardNormals:allocator:")
    public static native MDLMesh newCapsuleWithHeight(float height, @ByVal VectorFloat2 radii, @MachineSizedUInt long radialSegments, @MachineSizedUInt long verticalSegments, @MachineSizedUInt long hemisphereSegments, MDLGeometryType geometryType, boolean inwardNormals, MDLMeshBufferAllocator allocator);
    @Method(selector = "newEllipticalConeWithHeight:radii:radialSegments:verticalSegments:geometryType:inwardNormals:allocator:")
    public static native MDLMesh newEllipticalCone(float height, @ByVal VectorFloat2 radii, @MachineSizedUInt long radialSegments, @MachineSizedUInt long verticalSegments, MDLGeometryType geometryType, boolean inwardNormals, MDLMeshBufferAllocator allocator);
    @Method(selector = "newPlaneWithDimensions:segments:geometryType:allocator:")
    public static native MDLMesh newPlane(@ByVal VectorFloat2 dimensions, @ByVal VectorInt2 segments, MDLGeometryType geometryType, MDLMeshBufferAllocator allocator);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "newIcosahedronWithRadius:inwardNormals:geometryType:allocator:")
    public static native MDLMesh newIcosahedronWithRadius(float radius, boolean inwardNormals, MDLGeometryType geometryType, MDLMeshBufferAllocator allocator);
    @Method(selector = "newIcosahedronWithRadius:inwardNormals:allocator:")
    public static native MDLMesh newIcosahedron(float radius, boolean inwardNormals, MDLMeshBufferAllocator allocator);
    @Method(selector = "newSubdividedMesh:submeshIndex:subdivisionLevels:")
    public static native MDLMesh newSubdividedMesh(MDLMesh mesh, @MachineSizedUInt long submeshIndex, @MachineSizedUInt long subdivisionLevels);
    @Method(selector = "generateAmbientOcclusionTextureWithSize:raysPerSample:attenuationFactor:objectsToConsider:vertexAttributeNamed:materialPropertyNamed:")
    public native boolean generateAmbientOcclusionTexture(@ByVal VectorInt2 textureSize, @MachineSizedSInt long raysPerSample, float attenuationFactor, NSArray<MDLObject> objectsToConsider, String vertexAttributeName, String materialPropertyName);
    @Method(selector = "generateAmbientOcclusionTextureWithQuality:attenuationFactor:objectsToConsider:vertexAttributeNamed:materialPropertyNamed:")
    public native boolean generateAmbientOcclusionTexture(float bakeQuality, float attenuationFactor, NSArray<MDLObject> objectsToConsider, String vertexAttributeName, String materialPropertyName);
    @Method(selector = "generateAmbientOcclusionVertexColorsWithRaysPerSample:attenuationFactor:objectsToConsider:vertexAttributeNamed:")
    public native boolean generateAmbientOcclusionVertexColors(@MachineSizedSInt long raysPerSample, float attenuationFactor, NSArray<MDLObject> objectsToConsider, String vertexAttributeName);
    @Method(selector = "generateAmbientOcclusionVertexColorsWithQuality:attenuationFactor:objectsToConsider:vertexAttributeNamed:")
    public native boolean generateAmbientOcclusionVertexColors(float bakeQuality, float attenuationFactor, NSArray<MDLObject> objectsToConsider, String vertexAttributeName);
    @Method(selector = "generateLightMapTextureWithTextureSize:lightsToConsider:objectsToConsider:vertexAttributeNamed:materialPropertyNamed:")
    public native boolean generateLightMapTexture(@ByVal VectorInt2 textureSize, NSArray<MDLLight> lightsToConsider, NSArray<MDLObject> objectsToConsider, String vertexAttributeName, String materialPropertyName);
    @Method(selector = "generateLightMapTextureWithQuality:lightsToConsider:objectsToConsider:vertexAttributeNamed:materialPropertyNamed:")
    public native boolean generateLightMapTexture(float bakeQuality, NSArray<MDLLight> lightsToConsider, NSArray<MDLObject> objectsToConsider, String vertexAttributeName, String materialPropertyName);
    @Method(selector = "generateLightMapVertexColorsWithLightsToConsider:objectsToConsider:vertexAttributeNamed:")
    public native boolean generateLightMapVertexColors(NSArray<MDLLight> lightsToConsider, NSArray<MDLObject> objectsToConsider, String vertexAttributeName);
    /*</methods>*/
}
