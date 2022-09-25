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
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Metal") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLAccelerationStructureMotionTriangleGeometryDescriptor/*</name>*/ 
    extends /*<extends>*/MTLAccelerationStructureGeometryDescriptor/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTLAccelerationStructureMotionTriangleGeometryDescriptorPtr extends Ptr<MTLAccelerationStructureMotionTriangleGeometryDescriptor, MTLAccelerationStructureMotionTriangleGeometryDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTLAccelerationStructureMotionTriangleGeometryDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTLAccelerationStructureMotionTriangleGeometryDescriptor() {}
    protected MTLAccelerationStructureMotionTriangleGeometryDescriptor(Handle h, long handle) { super(h, handle); }
    protected MTLAccelerationStructureMotionTriangleGeometryDescriptor(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "vertexBuffers")
    public native NSArray<MTLMotionKeyframeData> getVertexBuffers();
    @Property(selector = "setVertexBuffers:")
    public native void setVertexBuffers(NSArray<MTLMotionKeyframeData> v);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "vertexFormat")
    public native MTLAttributeFormat getVertexFormat();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setVertexFormat:")
    public native void setVertexFormat(MTLAttributeFormat v);
    @Property(selector = "vertexStride")
    public native @MachineSizedUInt long getVertexStride();
    @Property(selector = "setVertexStride:")
    public native void setVertexStride(@MachineSizedUInt long v);
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
    @Property(selector = "triangleCount")
    public native @MachineSizedUInt long getTriangleCount();
    @Property(selector = "setTriangleCount:")
    public native void setTriangleCount(@MachineSizedUInt long v);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "transformationMatrixBuffer")
    public native MTLBuffer getTransformationMatrixBuffer();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setTransformationMatrixBuffer:")
    public native void setTransformationMatrixBuffer(MTLBuffer v);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "transformationMatrixBufferOffset")
    public native @MachineSizedUInt long getTransformationMatrixBufferOffset();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setTransformationMatrixBufferOffset:")
    public native void setTransformationMatrixBufferOffset(@MachineSizedUInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "descriptor")
    public static native MTLAccelerationStructureMotionTriangleGeometryDescriptor descriptor();
    /*</methods>*/
}
