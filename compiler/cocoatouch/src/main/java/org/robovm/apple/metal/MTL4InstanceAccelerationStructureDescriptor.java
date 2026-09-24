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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTL4InstanceAccelerationStructureDescriptor/*</name>*/ 
    extends /*<extends>*/MTL4AccelerationStructureDescriptor/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTL4InstanceAccelerationStructureDescriptorPtr extends Ptr<MTL4InstanceAccelerationStructureDescriptor, MTL4InstanceAccelerationStructureDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTL4InstanceAccelerationStructureDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTL4InstanceAccelerationStructureDescriptor() {}
    protected MTL4InstanceAccelerationStructureDescriptor(Handle h, long handle) { super(h, handle); }
    protected MTL4InstanceAccelerationStructureDescriptor(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "instanceDescriptorBuffer")
    public native @ByVal MTL4BufferRange getInstanceDescriptorBuffer();
    @Property(selector = "setInstanceDescriptorBuffer:")
    public native void setInstanceDescriptorBuffer(@ByVal MTL4BufferRange v);
    @Property(selector = "instanceDescriptorStride")
    public native @MachineSizedUInt long getInstanceDescriptorStride();
    @Property(selector = "setInstanceDescriptorStride:")
    public native void setInstanceDescriptorStride(@MachineSizedUInt long v);
    @Property(selector = "instanceCount")
    public native @MachineSizedUInt long getInstanceCount();
    @Property(selector = "setInstanceCount:")
    public native void setInstanceCount(@MachineSizedUInt long v);
    @Property(selector = "instanceDescriptorType")
    public native MTLAccelerationStructureInstanceDescriptorType getInstanceDescriptorType();
    @Property(selector = "setInstanceDescriptorType:")
    public native void setInstanceDescriptorType(MTLAccelerationStructureInstanceDescriptorType v);
    @Property(selector = "motionTransformBuffer")
    public native @ByVal MTL4BufferRange getMotionTransformBuffer();
    @Property(selector = "setMotionTransformBuffer:")
    public native void setMotionTransformBuffer(@ByVal MTL4BufferRange v);
    @Property(selector = "motionTransformCount")
    public native @MachineSizedUInt long getMotionTransformCount();
    @Property(selector = "setMotionTransformCount:")
    public native void setMotionTransformCount(@MachineSizedUInt long v);
    @Property(selector = "instanceTransformationMatrixLayout")
    public native MTLMatrixLayout getInstanceTransformationMatrixLayout();
    @Property(selector = "setInstanceTransformationMatrixLayout:")
    public native void setInstanceTransformationMatrixLayout(MTLMatrixLayout v);
    @Property(selector = "motionTransformType")
    public native MTLTransformType getMotionTransformType();
    @Property(selector = "setMotionTransformType:")
    public native void setMotionTransformType(MTLTransformType v);
    @Property(selector = "motionTransformStride")
    public native @MachineSizedUInt long getMotionTransformStride();
    @Property(selector = "setMotionTransformStride:")
    public native void setMotionTransformStride(@MachineSizedUInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
