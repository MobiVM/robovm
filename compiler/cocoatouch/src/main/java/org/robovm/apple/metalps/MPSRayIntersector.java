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
package org.robovm.apple.metalps;

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
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShaders") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSRayIntersector/*</name>*/ 
    extends /*<extends>*/MPSKernel/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class MPSRayIntersectorPtr extends Ptr<MPSRayIntersector, MPSRayIntersectorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSRayIntersector.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPSRayIntersector() {}
    protected MPSRayIntersector(Handle h, long handle) { super(h, handle); }
    protected MPSRayIntersector(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:")
    public MPSRayIntersector(MTLDevice device) { super((SkipInit) null); initObject(init(device)); }
    @Method(selector = "initWithCoder:device:")
    public MPSRayIntersector(NSCoder decoder, MTLDevice device) { super((SkipInit) null); initObject(init(decoder, device)); }
    @Method(selector = "initWithCoder:")
    public MPSRayIntersector(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "cullMode")
    public native MTLCullMode getCullMode();
    @Property(selector = "setCullMode:")
    public native void setCullMode(MTLCullMode v);
    @Property(selector = "frontFacingWinding")
    public native MTLWinding getFrontFacingWinding();
    @Property(selector = "setFrontFacingWinding:")
    public native void setFrontFacingWinding(MTLWinding v);
    @Property(selector = "triangleIntersectionTestType")
    public native MPSTriangleIntersectionTestType getTriangleIntersectionTestType();
    @Property(selector = "setTriangleIntersectionTestType:")
    public native void setTriangleIntersectionTestType(MPSTriangleIntersectionTestType v);
    @Property(selector = "boundingBoxIntersectionTestType")
    public native MPSBoundingBoxIntersectionTestType getBoundingBoxIntersectionTestType();
    @Property(selector = "setBoundingBoxIntersectionTestType:")
    public native void setBoundingBoxIntersectionTestType(MPSBoundingBoxIntersectionTestType v);
    @Property(selector = "rayMaskOptions")
    public native MPSRayMaskOptions getRayMaskOptions();
    @Property(selector = "setRayMaskOptions:")
    public native void setRayMaskOptions(MPSRayMaskOptions v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "rayMaskOperator")
    public native MPSRayMaskOperator getRayMaskOperator();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setRayMaskOperator:")
    public native void setRayMaskOperator(MPSRayMaskOperator v);
    @Property(selector = "rayStride")
    public native @MachineSizedUInt long getRayStride();
    @Property(selector = "setRayStride:")
    public native void setRayStride(@MachineSizedUInt long v);
    @Property(selector = "intersectionStride")
    public native @MachineSizedUInt long getIntersectionStride();
    @Property(selector = "setIntersectionStride:")
    public native void setIntersectionStride(@MachineSizedUInt long v);
    @Property(selector = "rayDataType")
    public native MPSRayDataType getRayDataType();
    @Property(selector = "setRayDataType:")
    public native void setRayDataType(MPSRayDataType v);
    @Property(selector = "intersectionDataType")
    public native MPSIntersectionDataType getIntersectionDataType();
    @Property(selector = "setIntersectionDataType:")
    public native void setIntersectionDataType(MPSIntersectionDataType v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "rayIndexDataType")
    public native MPSDataType getRayIndexDataType();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setRayIndexDataType:")
    public native void setRayIndexDataType(MPSDataType v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "rayMask")
    public native int getRayMask();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setRayMask:")
    public native void setRayMask(int v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:")
    protected native @Pointer long init(MTLDevice device);
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder decoder, MTLDevice device);
    @Method(selector = "copyWithZone:device:")
    public native MPSRayIntersector copy(NSZone zone, MTLDevice device);
    @Method(selector = "recommendedMinimumRayBatchSizeForRayCount:")
    public native @MachineSizedUInt long recommendedMinimumRayBatchSizeForRayCount(@MachineSizedUInt long rayCount);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "encodeIntersectionToCommandBuffer:intersectionType:rayBuffer:rayBufferOffset:intersectionBuffer:intersectionBufferOffset:rayCount:accelerationStructure:")
    public native void encodeIntersection(MTLCommandBuffer commandBuffer, MPSIntersectionType intersectionType, MTLBuffer rayBuffer, @MachineSizedUInt long rayBufferOffset, MTLBuffer intersectionBuffer, @MachineSizedUInt long intersectionBufferOffset, @MachineSizedUInt long rayCount, MPSAccelerationStructure accelerationStructure);
    @Method(selector = "encodeIntersectionToCommandBuffer:intersectionType:rayBuffer:rayBufferOffset:intersectionBuffer:intersectionBufferOffset:rayCountBuffer:rayCountBufferOffset:accelerationStructure:")
    public native void encodeIntersection(MTLCommandBuffer commandBuffer, MPSIntersectionType intersectionType, MTLBuffer rayBuffer, @MachineSizedUInt long rayBufferOffset, MTLBuffer intersectionBuffer, @MachineSizedUInt long intersectionBufferOffset, MTLBuffer rayCountBuffer, @MachineSizedUInt long rayCountBufferOffset, MPSAccelerationStructure accelerationStructure);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "encodeIntersectionToCommandBuffer:intersectionType:rayBuffer:rayBufferOffset:rayIndexBuffer:rayIndexBufferOffset:intersectionBuffer:intersectionBufferOffset:rayIndexCount:accelerationStructure:")
    public native void encodeIntersection(MTLCommandBuffer commandBuffer, MPSIntersectionType intersectionType, MTLBuffer rayBuffer, @MachineSizedUInt long rayBufferOffset, MTLBuffer rayIndexBuffer, @MachineSizedUInt long rayIndexBufferOffset, MTLBuffer intersectionBuffer, @MachineSizedUInt long intersectionBufferOffset, @MachineSizedUInt long rayIndexCount, MPSAccelerationStructure accelerationStructure);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "encodeIntersectionToCommandBuffer:intersectionType:rayBuffer:rayBufferOffset:rayIndexBuffer:rayIndexBufferOffset:intersectionBuffer:intersectionBufferOffset:rayIndexCountBuffer:rayIndexCountBufferOffset:accelerationStructure:")
    public native void encodeIntersection(MTLCommandBuffer commandBuffer, MPSIntersectionType intersectionType, MTLBuffer rayBuffer, @MachineSizedUInt long rayBufferOffset, MTLBuffer rayIndexBuffer, @MachineSizedUInt long rayIndexBufferOffset, MTLBuffer intersectionBuffer, @MachineSizedUInt long intersectionBufferOffset, MTLBuffer rayIndexCountBuffer, @MachineSizedUInt long rayIndexCountBufferOffset, MPSAccelerationStructure accelerationStructure);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "encodeIntersectionToCommandBuffer:intersectionType:rayTexture:intersectionTexture:accelerationStructure:")
    public native void encodeIntersection(MTLCommandBuffer commandBuffer, MPSIntersectionType intersectionType, MTLTexture rayTexture, MTLTexture intersectionTexture, MPSAccelerationStructure accelerationStructure);
    /*</methods>*/
}
