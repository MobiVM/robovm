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
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShaders") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSPolygonAccelerationStructure/*</name>*/ 
    extends /*<extends>*/MPSAccelerationStructure/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSPolygonAccelerationStructurePtr extends Ptr<MPSPolygonAccelerationStructure, MPSPolygonAccelerationStructurePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSPolygonAccelerationStructure.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPSPolygonAccelerationStructure() {}
    protected MPSPolygonAccelerationStructure(Handle h, long handle) { super(h, handle); }
    protected MPSPolygonAccelerationStructure(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:")
    public MPSPolygonAccelerationStructure(MTLDevice device) { super(device); }
    @Method(selector = "initWithCoder:device:")
    public MPSPolygonAccelerationStructure(NSCoder decoder, MTLDevice device) { super(decoder, device); }
    @Method(selector = "initWithGroup:")
    public MPSPolygonAccelerationStructure(MPSAccelerationStructureGroup group) { super(group); }
    @Method(selector = "initWithCoder:group:")
    public MPSPolygonAccelerationStructure(NSCoder aDecoder, MPSAccelerationStructureGroup group) { super(aDecoder, group); }
    @Method(selector = "initWithCoder:")
    public MPSPolygonAccelerationStructure(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "polygonType")
    public native MPSPolygonType getPolygonType();
    @Property(selector = "setPolygonType:")
    public native void setPolygonType(MPSPolygonType v);
    @Property(selector = "vertexStride")
    public native @MachineSizedUInt long getVertexStride();
    @Property(selector = "setVertexStride:")
    public native void setVertexStride(@MachineSizedUInt long v);
    @Property(selector = "indexType")
    public native MPSDataType getIndexType();
    @Property(selector = "setIndexType:")
    public native void setIndexType(MPSDataType v);
    @Property(selector = "vertexBuffer")
    public native MTLBuffer getVertexBuffer();
    @Property(selector = "setVertexBuffer:")
    public native void setVertexBuffer(MTLBuffer v);
    @Property(selector = "vertexBufferOffset")
    public native @MachineSizedUInt long getVertexBufferOffset();
    @Property(selector = "setVertexBufferOffset:")
    public native void setVertexBufferOffset(@MachineSizedUInt long v);
    @Property(selector = "indexBuffer")
    public native MTLBuffer getIndexBuffer();
    @Property(selector = "setIndexBuffer:")
    public native void setIndexBuffer(MTLBuffer v);
    @Property(selector = "indexBufferOffset")
    public native @MachineSizedUInt long getIndexBufferOffset();
    @Property(selector = "setIndexBufferOffset:")
    public native void setIndexBufferOffset(@MachineSizedUInt long v);
    @Property(selector = "maskBuffer")
    public native MTLBuffer getMaskBuffer();
    @Property(selector = "setMaskBuffer:")
    public native void setMaskBuffer(MTLBuffer v);
    @Property(selector = "maskBufferOffset")
    public native @MachineSizedUInt long getMaskBufferOffset();
    @Property(selector = "setMaskBufferOffset:")
    public native void setMaskBufferOffset(@MachineSizedUInt long v);
    @Property(selector = "polygonCount")
    public native @MachineSizedUInt long getPolygonCount();
    @Property(selector = "setPolygonCount:")
    public native void setPolygonCount(@MachineSizedUInt long v);
    @Property(selector = "polygonBuffers")
    public native NSArray<MPSPolygonBuffer> getPolygonBuffers();
    @Property(selector = "setPolygonBuffers:")
    public native void setPolygonBuffers(NSArray<MPSPolygonBuffer> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
