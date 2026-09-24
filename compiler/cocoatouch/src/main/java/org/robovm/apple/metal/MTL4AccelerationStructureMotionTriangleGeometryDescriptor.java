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
 * @since Available in iOS 26.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Metal") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTL4AccelerationStructureMotionTriangleGeometryDescriptor/*</name>*/ 
    extends /*<extends>*/MTL4AccelerationStructureGeometryDescriptor/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTL4AccelerationStructureMotionTriangleGeometryDescriptorPtr extends Ptr<MTL4AccelerationStructureMotionTriangleGeometryDescriptor, MTL4AccelerationStructureMotionTriangleGeometryDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTL4AccelerationStructureMotionTriangleGeometryDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTL4AccelerationStructureMotionTriangleGeometryDescriptor() {}
    protected MTL4AccelerationStructureMotionTriangleGeometryDescriptor(Handle h, long handle) { super(h, handle); }
    protected MTL4AccelerationStructureMotionTriangleGeometryDescriptor(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "vertexBuffers")
    public native @ByVal MTL4BufferRange getVertexBuffers();
    @Property(selector = "setVertexBuffers:")
    public native void setVertexBuffers(@ByVal MTL4BufferRange v);
    @Property(selector = "vertexFormat")
    public native MTLAttributeFormat getVertexFormat();
    @Property(selector = "setVertexFormat:")
    public native void setVertexFormat(MTLAttributeFormat v);
    @Property(selector = "vertexStride")
    public native @MachineSizedUInt long getVertexStride();
    @Property(selector = "setVertexStride:")
    public native void setVertexStride(@MachineSizedUInt long v);
    @Property(selector = "indexBuffer")
    public native @ByVal MTL4BufferRange getIndexBuffer();
    @Property(selector = "setIndexBuffer:")
    public native void setIndexBuffer(@ByVal MTL4BufferRange v);
    @Property(selector = "indexType")
    public native MTLIndexType getIndexType();
    @Property(selector = "setIndexType:")
    public native void setIndexType(MTLIndexType v);
    @Property(selector = "triangleCount")
    public native @MachineSizedUInt long getTriangleCount();
    @Property(selector = "setTriangleCount:")
    public native void setTriangleCount(@MachineSizedUInt long v);
    @Property(selector = "transformationMatrixBuffer")
    public native @ByVal MTL4BufferRange getTransformationMatrixBuffer();
    @Property(selector = "setTransformationMatrixBuffer:")
    public native void setTransformationMatrixBuffer(@ByVal MTL4BufferRange v);
    @Property(selector = "transformationMatrixLayout")
    public native MTLMatrixLayout getTransformationMatrixLayout();
    @Property(selector = "setTransformationMatrixLayout:")
    public native void setTransformationMatrixLayout(MTLMatrixLayout v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
