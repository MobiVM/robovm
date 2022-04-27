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
package org.robovm.apple.metal;

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
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("Metal") @NativeProtocolProxy/*</annotations>*/
/*<visibility>*/public final/*</visibility>*/ class /*<name>*/MTLDevice/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/public static class MTLDevicePtr extends Ptr<MTLDevice, MTLDevicePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTLDevice.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "name")
    public native String getName();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "registryID")
    public native long getRegistryID();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "maxThreadsPerThreadgroup")
    public native @ByVal MTLSize getMaxThreadsPerThreadgroup();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "hasUnifiedMemory")
    public native boolean hasUnifiedMemory();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "readWriteTextureSupport")
    public native MTLReadWriteTextureTier getReadWriteTextureSupport();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "argumentBuffersSupport")
    public native MTLArgumentBuffersTier getArgumentBuffersSupport();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "areRasterOrderGroupsSupported")
    public native boolean isRasterOrderGroupsSupported();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "supports32BitFloatFiltering")
    public native boolean supports32BitFloatFiltering();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "supports32BitMSAA")
    public native boolean supports32BitMSAA();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "supportsQueryTextureLOD")
    public native boolean supportsQueryTextureLOD();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "supportsPullModelInterpolation")
    public native boolean supportsPullModelInterpolation();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "areBarycentricCoordsSupported")
    public native boolean isBarycentricCoordsSupported();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "supportsShaderBarycentricCoordinates")
    public native boolean supportsShaderBarycentricCoordinates();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "currentAllocatedSize")
    public native @MachineSizedUInt long getCurrentAllocatedSize();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "maxThreadgroupMemoryLength")
    public native @MachineSizedUInt long getMaxThreadgroupMemoryLength();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "maxArgumentBufferSamplerCount")
    public native @MachineSizedUInt long getMaxArgumentBufferSamplerCount();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "areProgrammableSamplePositionsSupported")
    public native boolean isProgrammableSamplePositionsSupported();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "sparseTileSizeInBytes")
    public native @MachineSizedUInt long getSparseTileSizeInBytes();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "maxBufferLength")
    public native @MachineSizedUInt long getMaxBufferLength();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "counterSets")
    public native NSArray<?> getCounterSets();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "supportsDynamicLibraries")
    public native boolean supportsDynamicLibraries();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "supportsRenderDynamicLibraries")
    public native boolean supportsRenderDynamicLibraries();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "supportsRaytracing")
    public native boolean supportsRaytracing();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "supportsFunctionPointers")
    public native boolean supportsFunctionPointers();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "supportsFunctionPointersFromRender")
    public native boolean supportsFunctionPointersFromRender();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "supportsRaytracingFromRender")
    public native boolean supportsRaytracingFromRender();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "supportsPrimitiveMotionBlur")
    public native boolean supportsPrimitiveMotionBlur();
    /*</properties>*/
    /*<members>*//*</members>*/
    public MTLBuffer newBuffer(byte[] bytes, MTLResourceOptions options) {
        return newBuffer(VM.getArrayValuesAddress(bytes), bytes.length, options);
    }
    public MTLBuffer newBuffer(byte[] bytes, MTLResourceOptions options, final VoidBlock1<byte[]> deallocator) {
        return newBuffer(VM.getArrayValuesAddress(bytes), bytes.length, options, new VoidBlock2<Long, Long>() {
            @Override
            public void invoke(Long a, Long b) {
                byte[] bytes = VM.newByteArray(a, b.intValue());
                deallocator.invoke(bytes);
            }
        });
    }
    public MTLRenderPipelineState newRenderPipelineState(MTLRenderPipelineDescriptor descriptor, MTLPipelineOption options) throws NSErrorException {
        return newRenderPipelineState(descriptor, options, (MTLRenderPipelineReflection.MTLRenderPipelineReflectionPtr)null);
    }
    public MTLComputePipelineState newComputePipelineState(MTLFunction computeFunction, MTLPipelineOption options) throws NSErrorException {
        return newComputePipelineState(computeFunction, options, (MTLComputePipelineReflection.MTLComputePipelineReflectionPtr)null);
    }
    /*<methods>*/
    @Bridge(symbol="MTLCreateSystemDefaultDevice", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(NSObject.NoRetainMarshaler.class) MTLDevice getSystemDefaultDevice();
    
    @Method(selector = "newCommandQueue")
    public native MTLCommandQueue newCommandQueue();
    @Method(selector = "newCommandQueueWithMaxCommandBufferCount:")
    public native MTLCommandQueue newCommandQueue(@MachineSizedUInt long maxCommandBufferCount);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "heapTextureSizeAndAlignWithDescriptor:")
    public native @ByVal MTLSizeAndAlign heapTextureSizeAndAlign(MTLTextureDescriptor desc);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "heapBufferSizeAndAlignWithLength:options:")
    public native @ByVal MTLSizeAndAlign heapBufferSizeAndAlignWithLength(@MachineSizedUInt long length, MTLResourceOptions options);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "newHeapWithDescriptor:")
    public native MTLHeap newHeap(MTLHeapDescriptor descriptor);
    @Method(selector = "newBufferWithLength:options:")
    public native MTLBuffer newBuffer(@MachineSizedUInt long length, MTLResourceOptions options);
    @Method(selector = "newBufferWithBytes:length:options:")
    protected native MTLBuffer newBuffer(@Pointer long pointer, @MachineSizedUInt long length, MTLResourceOptions options);
    @Method(selector = "newBufferWithBytesNoCopy:length:options:deallocator:")
    protected native MTLBuffer newBuffer(@Pointer long pointer, @MachineSizedUInt long length, MTLResourceOptions options, @Block("(@Pointer,@MachineSizedUInt)") VoidBlock2<Long, Long> deallocator);
    @Method(selector = "newDepthStencilStateWithDescriptor:")
    public native MTLDepthStencilState newDepthStencilState(MTLDepthStencilDescriptor descriptor);
    @Method(selector = "newTextureWithDescriptor:")
    public native MTLTexture newTexture(MTLTextureDescriptor descriptor);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "newTextureWithDescriptor:iosurface:plane:")
    public native MTLTexture newTexture(MTLTextureDescriptor descriptor, org.robovm.apple.iosurface.IOSurface iosurface, @MachineSizedUInt long plane);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "newSharedTextureWithDescriptor:")
    public native MTLTexture newSharedTexture(MTLTextureDescriptor descriptor);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "newSharedTextureWithHandle:")
    public native MTLTexture newSharedTexture(MTLSharedTextureHandle sharedHandle);
    @Method(selector = "newSamplerStateWithDescriptor:")
    public native MTLSamplerState newSamplerState(MTLSamplerDescriptor descriptor);
    @Method(selector = "newDefaultLibrary")
    public native MTLLibrary newDefaultLibrary();
    /**
     * @since Available in iOS 10.0 and later.
     */
    public MTLLibrary newDefaultLibrary(NSBundle bundle) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       MTLLibrary result = newDefaultLibrary(bundle, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "newDefaultLibraryWithBundle:error:")
    private native MTLLibrary newDefaultLibrary(NSBundle bundle, NSError.NSErrorPtr error);
    public MTLLibrary newLibraryWithFile(String filepath) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       MTLLibrary result = newLibraryWithFile(filepath, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "newLibraryWithFile:error:")
    private native MTLLibrary newLibraryWithFile(String filepath, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 11.0 and later.
     */
    public MTLLibrary newLibrary(NSURL url) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       MTLLibrary result = newLibrary(url, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "newLibraryWithURL:error:")
    private native MTLLibrary newLibrary(NSURL url, NSError.NSErrorPtr error);
    @WeaklyLinked
    public MTLLibrary newLibraryWithData(DispatchData data) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       MTLLibrary result = newLibraryWithData(data, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @WeaklyLinked
    @Method(selector = "newLibraryWithData:error:")
    private native MTLLibrary newLibraryWithData(DispatchData data, NSError.NSErrorPtr error);
    public MTLLibrary newLibraryWithSource(String source, MTLCompileOptions options) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       MTLLibrary result = newLibraryWithSource(source, options, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "newLibraryWithSource:options:error:")
    private native MTLLibrary newLibraryWithSource(String source, MTLCompileOptions options, NSError.NSErrorPtr error);
    @Method(selector = "newLibraryWithSource:options:completionHandler:")
    public native void newLibraryWithSource(String source, MTLCompileOptions options, @Block VoidBlock2<MTLLibrary, NSError> completionHandler);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "newLibraryWithStitchedDescriptor:error:")
    public native MTLLibrary newLibrary(MTLStitchedLibraryDescriptor descriptor, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "newLibraryWithStitchedDescriptor:completionHandler:")
    public native void newLibrary(MTLStitchedLibraryDescriptor descriptor, @Block VoidBlock2<MTLLibrary, NSError> completionHandler);
    public MTLRenderPipelineState newRenderPipelineState(MTLRenderPipelineDescriptor descriptor) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       MTLRenderPipelineState result = newRenderPipelineState(descriptor, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "newRenderPipelineStateWithDescriptor:error:")
    private native MTLRenderPipelineState newRenderPipelineState(MTLRenderPipelineDescriptor descriptor, NSError.NSErrorPtr error);
    public MTLRenderPipelineState newRenderPipelineState(MTLRenderPipelineDescriptor descriptor, MTLPipelineOption options, MTLRenderPipelineReflection.MTLRenderPipelineReflectionPtr reflection) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       MTLRenderPipelineState result = newRenderPipelineState(descriptor, options, reflection, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "newRenderPipelineStateWithDescriptor:options:reflection:error:")
    private native MTLRenderPipelineState newRenderPipelineState(MTLRenderPipelineDescriptor descriptor, MTLPipelineOption options, MTLRenderPipelineReflection.MTLRenderPipelineReflectionPtr reflection, NSError.NSErrorPtr error);
    @Method(selector = "newRenderPipelineStateWithDescriptor:completionHandler:")
    public native void newRenderPipelineState(MTLRenderPipelineDescriptor descriptor, @Block VoidBlock2<MTLRenderPipelineState, NSError> completionHandler);
    @Method(selector = "newRenderPipelineStateWithDescriptor:options:completionHandler:")
    public native void newRenderPipelineState(MTLRenderPipelineDescriptor descriptor, MTLPipelineOption options, @Block VoidBlock3<MTLRenderPipelineState, MTLRenderPipelineReflection, NSError> completionHandler);
    public MTLComputePipelineState newComputePipelineState(MTLFunction computeFunction) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       MTLComputePipelineState result = newComputePipelineState(computeFunction, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "newComputePipelineStateWithFunction:error:")
    private native MTLComputePipelineState newComputePipelineState(MTLFunction computeFunction, NSError.NSErrorPtr error);
    public MTLComputePipelineState newComputePipelineState(MTLFunction computeFunction, MTLPipelineOption options, MTLComputePipelineReflection.MTLComputePipelineReflectionPtr reflection) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       MTLComputePipelineState result = newComputePipelineState(computeFunction, options, reflection, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "newComputePipelineStateWithFunction:options:reflection:error:")
    private native MTLComputePipelineState newComputePipelineState(MTLFunction computeFunction, MTLPipelineOption options, MTLComputePipelineReflection.MTLComputePipelineReflectionPtr reflection, NSError.NSErrorPtr error);
    @Method(selector = "newComputePipelineStateWithFunction:completionHandler:")
    public native void newComputePipelineState(MTLFunction computeFunction, @Block VoidBlock2<MTLComputePipelineState, NSError> completionHandler);
    @Method(selector = "newComputePipelineStateWithFunction:options:completionHandler:")
    public native void newComputePipelineState(MTLFunction computeFunction, MTLPipelineOption options, @Block VoidBlock3<MTLComputePipelineState, MTLComputePipelineReflection, NSError> completionHandler);
    /**
     * @since Available in iOS 9.0 and later.
     */
    public MTLComputePipelineState newComputePipelineState(MTLComputePipelineDescriptor descriptor, MTLPipelineOption options, MTLComputePipelineReflection.MTLComputePipelineReflectionPtr reflection) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       MTLComputePipelineState result = newComputePipelineState(descriptor, options, reflection, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "newComputePipelineStateWithDescriptor:options:reflection:error:")
    private native MTLComputePipelineState newComputePipelineState(MTLComputePipelineDescriptor descriptor, MTLPipelineOption options, MTLComputePipelineReflection.MTLComputePipelineReflectionPtr reflection, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "newComputePipelineStateWithDescriptor:options:completionHandler:")
    public native void newComputePipelineState(MTLComputePipelineDescriptor descriptor, MTLPipelineOption options, @Block VoidBlock3<MTLComputePipelineState, MTLComputePipelineReflection, NSError> completionHandler);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "newFence")
    public native MTLFence newFence();
    @Method(selector = "supportsFeatureSet:")
    public native boolean supportsFeatureSet(MTLFeatureSet featureSet);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "supportsFamily:")
    public native boolean supportsFamily(MTLGPUFamily gpuFamily);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "supportsTextureSampleCount:")
    public native boolean supportsTextureSampleCount(@MachineSizedUInt long sampleCount);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "minimumLinearTextureAlignmentForPixelFormat:")
    public native @MachineSizedUInt long minimumLinearTextureAlignmentForPixelFormat(MTLPixelFormat format);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "minimumTextureBufferAlignmentForPixelFormat:")
    public native @MachineSizedUInt long minimumTextureBufferAlignmentForPixelFormat(MTLPixelFormat format);
    /**
     * @since Available in iOS 11.0 and later.
     */
    public MTLRenderPipelineState newRenderPipelineState(MTLTileRenderPipelineDescriptor descriptor, MTLPipelineOption options, MTLRenderPipelineReflection.MTLRenderPipelineReflectionPtr reflection) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       MTLRenderPipelineState result = newRenderPipelineState(descriptor, options, reflection, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "newRenderPipelineStateWithTileDescriptor:options:reflection:error:")
    private native MTLRenderPipelineState newRenderPipelineState(MTLTileRenderPipelineDescriptor descriptor, MTLPipelineOption options, MTLRenderPipelineReflection.MTLRenderPipelineReflectionPtr reflection, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "newRenderPipelineStateWithTileDescriptor:options:completionHandler:")
    public native void newRenderPipelineState(MTLTileRenderPipelineDescriptor descriptor, MTLPipelineOption options, @Block VoidBlock3<MTLRenderPipelineState, MTLRenderPipelineReflection, NSError> completionHandler);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "getDefaultSamplePositions:count:")
    public native void getDefaultSamplePositions(MTLSamplePosition positions, @MachineSizedUInt long count);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "newArgumentEncoderWithArguments:")
    public native MTLArgumentEncoder newArgumentEncoder(NSArray<MTLArgumentDescriptor> arguments);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "supportsRasterizationRateMapWithLayerCount:")
    public native boolean supportsRasterizationRateMap(@MachineSizedUInt long layerCount);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "newRasterizationRateMapWithDescriptor:")
    public native MTLRasterizationRateMap newRasterizationRateMap(MTLRasterizationRateMapDescriptor descriptor);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "newIndirectCommandBufferWithDescriptor:maxCommandCount:options:")
    public native MTLIndirectCommandBuffer newIndirectCommand(MTLIndirectCommandBufferDescriptor descriptor, @MachineSizedUInt long maxCount, MTLResourceOptions options);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "newEvent")
    public native MTLEvent newEvent();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "newSharedEvent")
    public native MTLSharedEvent newSharedEvent();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "newSharedEventWithHandle:")
    public native MTLSharedEvent newSharedEvent(MTLSharedEventHandle sharedEventHandle);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "sparseTileSizeWithTextureType:pixelFormat:sampleCount:")
    public native @ByVal MTLSize sparseTileSizeWithTextureType(MTLTextureType textureType, MTLPixelFormat pixelFormat, @MachineSizedUInt long sampleCount);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "convertSparsePixelRegions:toTileRegions:withTileSize:alignmentMode:numRegions:")
    public native void convertSparsePixelRegions(MTLRegion pixelRegions, MTLRegion tileRegions, @ByVal MTLSize tileSize, MTLSparseTextureRegionAlignmentMode mode, @MachineSizedUInt long numRegions);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "convertSparseTileRegions:toPixelRegions:withTileSize:numRegions:")
    public native void convertSparseTileRegions(MTLRegion tileRegions, MTLRegion pixelRegions, @ByVal MTLSize tileSize, @MachineSizedUInt long numRegions);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "newCounterSampleBufferWithDescriptor:error:")
    public native MTLCounterSampleBuffer newCounterSampleBuffer(MTLCounterSampleBufferDescriptor descriptor, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "sampleTimestamps:gpuTimestamp:")
    public native void sampleTimestamps(LongPtr cpuTimestamp, LongPtr gpuTimestamp);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "supportsCounterSampling:")
    public native boolean supportsCounterSampling(MTLCounterSamplingPoint samplingPoint);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "supportsVertexAmplificationCount:")
    public native boolean supportsVertexAmplificationCount(@MachineSizedUInt long count);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "newDynamicLibrary:error:")
    public native MTLDynamicLibrary newDynamicLibrary(MTLLibrary library, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "newDynamicLibraryWithURL:error:")
    public native MTLDynamicLibrary newDynamicLibrary(NSURL url, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "newBinaryArchiveWithDescriptor:error:")
    public native MTLBinaryArchive newBinaryArchive(MTLBinaryArchiveDescriptor descriptor, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "accelerationStructureSizesWithDescriptor:")
    public native @ByVal MTLAccelerationStructureSizes accelerationStructureSizes(MTLAccelerationStructureDescriptor descriptor);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "newAccelerationStructureWithSize:")
    public native MTLAccelerationStructure newAccelerationStructure(@MachineSizedUInt long size);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "newAccelerationStructureWithDescriptor:")
    public native MTLAccelerationStructure newAccelerationStructure(MTLAccelerationStructureDescriptor descriptor);
    /*</methods>*/
}
