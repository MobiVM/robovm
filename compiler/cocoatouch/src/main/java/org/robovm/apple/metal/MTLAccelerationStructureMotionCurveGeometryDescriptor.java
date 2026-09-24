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
/**
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Metal") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLAccelerationStructureMotionCurveGeometryDescriptor/*</name>*/ 
    extends /*<extends>*/MTLAccelerationStructureGeometryDescriptor/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTLAccelerationStructureMotionCurveGeometryDescriptorPtr extends Ptr<MTLAccelerationStructureMotionCurveGeometryDescriptor, MTLAccelerationStructureMotionCurveGeometryDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTLAccelerationStructureMotionCurveGeometryDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTLAccelerationStructureMotionCurveGeometryDescriptor() {}
    protected MTLAccelerationStructureMotionCurveGeometryDescriptor(Handle h, long handle) { super(h, handle); }
    protected MTLAccelerationStructureMotionCurveGeometryDescriptor(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "controlPointBuffers")
    public native NSArray<MTLMotionKeyframeData> getControlPointBuffers();
    @Property(selector = "setControlPointBuffers:")
    public native void setControlPointBuffers(NSArray<MTLMotionKeyframeData> v);
    @Property(selector = "controlPointCount")
    public native @MachineSizedUInt long getControlPointCount();
    @Property(selector = "setControlPointCount:")
    public native void setControlPointCount(@MachineSizedUInt long v);
    @Property(selector = "controlPointStride")
    public native @MachineSizedUInt long getControlPointStride();
    @Property(selector = "setControlPointStride:")
    public native void setControlPointStride(@MachineSizedUInt long v);
    @Property(selector = "controlPointFormat")
    public native MTLAttributeFormat getControlPointFormat();
    @Property(selector = "setControlPointFormat:")
    public native void setControlPointFormat(MTLAttributeFormat v);
    @Property(selector = "radiusBuffers")
    public native NSArray<MTLMotionKeyframeData> getRadiusBuffers();
    @Property(selector = "setRadiusBuffers:")
    public native void setRadiusBuffers(NSArray<MTLMotionKeyframeData> v);
    @Property(selector = "radiusFormat")
    public native MTLAttributeFormat getRadiusFormat();
    @Property(selector = "setRadiusFormat:")
    public native void setRadiusFormat(MTLAttributeFormat v);
    @Property(selector = "radiusStride")
    public native @MachineSizedUInt long getRadiusStride();
    @Property(selector = "setRadiusStride:")
    public native void setRadiusStride(@MachineSizedUInt long v);
    @Property(selector = "indexBuffer")
    public native MTLBuffer getIndexBuffer();
    @Property(selector = "setIndexBuffer:")
    public native void setIndexBuffer(MTLBuffer v);
    @Property(selector = "indexBufferOffset")
    public native @MachineSizedUInt long getIndexBufferOffset();
    @Property(selector = "setIndexBufferOffset:")
    public native void setIndexBufferOffset(@MachineSizedUInt long v);
    @Property(selector = "indexType")
    public native MTLIndexType getIndexType();
    @Property(selector = "setIndexType:")
    public native void setIndexType(MTLIndexType v);
    @Property(selector = "segmentCount")
    public native @MachineSizedUInt long getSegmentCount();
    @Property(selector = "setSegmentCount:")
    public native void setSegmentCount(@MachineSizedUInt long v);
    @Property(selector = "segmentControlPointCount")
    public native @MachineSizedUInt long getSegmentControlPointCount();
    @Property(selector = "setSegmentControlPointCount:")
    public native void setSegmentControlPointCount(@MachineSizedUInt long v);
    @Property(selector = "curveType")
    public native MTLCurveType getCurveType();
    @Property(selector = "setCurveType:")
    public native void setCurveType(MTLCurveType v);
    @Property(selector = "curveBasis")
    public native MTLCurveBasis getCurveBasis();
    @Property(selector = "setCurveBasis:")
    public native void setCurveBasis(MTLCurveBasis v);
    @Property(selector = "curveEndCaps")
    public native MTLCurveEndCaps getCurveEndCaps();
    @Property(selector = "setCurveEndCaps:")
    public native void setCurveEndCaps(MTLCurveEndCaps v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "descriptor")
    public static native MTLAccelerationStructureMotionCurveGeometryDescriptor descriptor();
    /*</methods>*/
}
