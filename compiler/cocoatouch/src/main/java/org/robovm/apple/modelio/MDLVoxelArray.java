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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MDLVoxelArray/*</name>*/ 
    extends /*<extends>*/MDLObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MDLVoxelArrayPtr extends Ptr<MDLVoxelArray, MDLVoxelArrayPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MDLVoxelArray.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MDLVoxelArray() {}
    protected MDLVoxelArray(Handle h, long handle) { super(h, handle); }
    protected MDLVoxelArray(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAsset:divisions:patchRadius:")
    public MDLVoxelArray(MDLAsset asset, int divisions, float patchRadius) { super((SkipInit) null); initObject(init(asset, divisions, patchRadius)); }
    @Method(selector = "initWithData:boundingBox:voxelExtent:")
    public MDLVoxelArray(NSData voxelData, @ByVal MDLAxisAlignedBoundingBox boundingBox, float voxelExtent) { super((SkipInit) null); initObject(init(voxelData, boundingBox, voxelExtent)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "count")
    public native @MachineSizedUInt long getCount();
    @Property(selector = "voxelIndexExtent")
    public native @ByVal MDLVoxelIndexExtent getVoxelIndexExtent();
    @Property(selector = "boundingBox")
    public native @ByVal MDLAxisAlignedBoundingBox getBoundingBox();
    @Property(selector = "isValidSignedShellField")
    public native boolean isValidSignedShellField();
    @Property(selector = "shellFieldInteriorThickness")
    public native float getShellFieldInteriorThickness();
    @Property(selector = "setShellFieldInteriorThickness:")
    public native void setShellFieldInteriorThickness(float v);
    @Property(selector = "shellFieldExteriorThickness")
    public native float getShellFieldExteriorThickness();
    @Property(selector = "setShellFieldExteriorThickness:")
    public native void setShellFieldExteriorThickness(float v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAsset:divisions:patchRadius:")
    protected native @Pointer long init(MDLAsset asset, int divisions, float patchRadius);
    @Method(selector = "initWithData:boundingBox:voxelExtent:")
    protected native @Pointer long init(NSData voxelData, @ByVal MDLAxisAlignedBoundingBox boundingBox, float voxelExtent);
    @Method(selector = "voxelExistsAtIndex:allowAnyX:allowAnyY:allowAnyZ:allowAnyShell:")
    public native boolean voxelExists(@ByVal VectorInt4 index, boolean allowAnyX, boolean allowAnyY, boolean allowAnyZ, boolean allowAnyShell);
    @Method(selector = "voxelsWithinExtent:")
    public native NSData getVoxelsWithinExtent(@ByVal MDLVoxelIndexExtent extent);
    @Method(selector = "voxelIndices")
    public native NSData getVoxelIndices();
    @Method(selector = "setVoxelAtIndex:")
    public native void setVoxel(@ByVal VectorInt4 index);
    @Method(selector = "setVoxelsForMesh:divisions:patchRadius:")
    public native void setVoxels(MDLMesh mesh, int divisions, float patchRadius);
    @Method(selector = "unionWithVoxels:")
    public native void union(MDLVoxelArray voxels);
    @Method(selector = "intersectWithVoxels:")
    public native void intersect(MDLVoxelArray voxels);
    @Method(selector = "differenceWithVoxels:")
    public native void difference(MDLVoxelArray voxels);
    @Method(selector = "indexOfSpatialLocation:")
    public native @ByVal VectorInt4 indexOfSpatialLocation(@ByVal VectorFloat3 location);
    @Method(selector = "spatialLocationOfIndex:")
    public native @ByVal VectorFloat3 getSpatialLocation(@ByVal VectorInt4 index);
    @Method(selector = "voxelBoundingBoxAtIndex:")
    public native @ByVal MDLAxisAlignedBoundingBox getVoxelBoundingBox(@ByVal VectorInt4 index);
    @Method(selector = "convertToSignedShellField")
    public native void convertToSignedShellField();
    @Method(selector = "coarseMesh")
    public native MDLMesh coarseMesh();
    @Method(selector = "coarseMeshUsingAllocator:")
    public native MDLMesh coarseMeshUsingAllocator(MDLMeshBufferAllocator allocator);
    @Method(selector = "meshUsingAllocator:")
    public native MDLMesh getMesh(MDLMeshBufferAllocator allocator);
    /*</methods>*/
}
