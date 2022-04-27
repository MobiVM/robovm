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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSInstanceAccelerationStructure/*</name>*/ 
    extends /*<extends>*/MPSAccelerationStructure/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSInstanceAccelerationStructurePtr extends Ptr<MPSInstanceAccelerationStructure, MPSInstanceAccelerationStructurePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSInstanceAccelerationStructure.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPSInstanceAccelerationStructure() {}
    protected MPSInstanceAccelerationStructure(Handle h, long handle) { super(h, handle); }
    protected MPSInstanceAccelerationStructure(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:")
    public MPSInstanceAccelerationStructure(MTLDevice device) { super(device); }
    @Method(selector = "initWithCoder:device:")
    public MPSInstanceAccelerationStructure(NSCoder decoder, MTLDevice device) { super(decoder, device); }
    @Method(selector = "initWithGroup:")
    public MPSInstanceAccelerationStructure(MPSAccelerationStructureGroup group) { super(group); }
    @Method(selector = "initWithCoder:group:")
    public MPSInstanceAccelerationStructure(NSCoder aDecoder, MPSAccelerationStructureGroup group) { super(aDecoder, group); }
    @Method(selector = "initWithCoder:")
    public MPSInstanceAccelerationStructure(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "accelerationStructures")
    public native NSArray<MPSPolygonAccelerationStructure> getAccelerationStructures();
    @Property(selector = "setAccelerationStructures:")
    public native void setAccelerationStructures(NSArray<MPSPolygonAccelerationStructure> v);
    @Property(selector = "instanceBuffer")
    public native MTLBuffer getInstanceBuffer();
    @Property(selector = "setInstanceBuffer:")
    public native void setInstanceBuffer(MTLBuffer v);
    @Property(selector = "instanceBufferOffset")
    public native @MachineSizedUInt long getInstanceBufferOffset();
    @Property(selector = "setInstanceBufferOffset:")
    public native void setInstanceBufferOffset(@MachineSizedUInt long v);
    @Property(selector = "transformBuffer")
    public native MTLBuffer getTransformBuffer();
    @Property(selector = "setTransformBuffer:")
    public native void setTransformBuffer(MTLBuffer v);
    @Property(selector = "transformBufferOffset")
    public native @MachineSizedUInt long getTransformBufferOffset();
    @Property(selector = "setTransformBufferOffset:")
    public native void setTransformBufferOffset(@MachineSizedUInt long v);
    @Property(selector = "transformType")
    public native MPSTransformType getTransformType();
    @Property(selector = "setTransformType:")
    public native void setTransformType(MPSTransformType v);
    @Property(selector = "maskBuffer")
    public native MTLBuffer getMaskBuffer();
    @Property(selector = "setMaskBuffer:")
    public native void setMaskBuffer(MTLBuffer v);
    @Property(selector = "maskBufferOffset")
    public native @MachineSizedUInt long getMaskBufferOffset();
    @Property(selector = "setMaskBufferOffset:")
    public native void setMaskBufferOffset(@MachineSizedUInt long v);
    @Property(selector = "instanceCount")
    public native @MachineSizedUInt long getInstanceCount();
    @Property(selector = "setInstanceCount:")
    public native void setInstanceCount(@MachineSizedUInt long v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
