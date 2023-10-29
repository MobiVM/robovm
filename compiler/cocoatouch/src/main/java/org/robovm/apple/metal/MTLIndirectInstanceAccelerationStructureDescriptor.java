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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLIndirectInstanceAccelerationStructureDescriptor/*</name>*/ 
    extends /*<extends>*/MTLAccelerationStructureDescriptor/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTLIndirectInstanceAccelerationStructureDescriptorPtr extends Ptr<MTLIndirectInstanceAccelerationStructureDescriptor, MTLIndirectInstanceAccelerationStructureDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTLIndirectInstanceAccelerationStructureDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTLIndirectInstanceAccelerationStructureDescriptor() {}
    protected MTLIndirectInstanceAccelerationStructureDescriptor(Handle h, long handle) { super(h, handle); }
    protected MTLIndirectInstanceAccelerationStructureDescriptor(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "instanceDescriptorBuffer")
    public native MTLBuffer getInstanceDescriptorBuffer();
    @Property(selector = "setInstanceDescriptorBuffer:")
    public native void setInstanceDescriptorBuffer(MTLBuffer v);
    @Property(selector = "instanceDescriptorBufferOffset")
    public native @MachineSizedUInt long getInstanceDescriptorBufferOffset();
    @Property(selector = "setInstanceDescriptorBufferOffset:")
    public native void setInstanceDescriptorBufferOffset(@MachineSizedUInt long v);
    @Property(selector = "instanceDescriptorStride")
    public native @MachineSizedUInt long getInstanceDescriptorStride();
    @Property(selector = "setInstanceDescriptorStride:")
    public native void setInstanceDescriptorStride(@MachineSizedUInt long v);
    @Property(selector = "maxInstanceCount")
    public native @MachineSizedUInt long getMaxInstanceCount();
    @Property(selector = "setMaxInstanceCount:")
    public native void setMaxInstanceCount(@MachineSizedUInt long v);
    @Property(selector = "instanceCountBuffer")
    public native MTLBuffer getInstanceCountBuffer();
    @Property(selector = "setInstanceCountBuffer:")
    public native void setInstanceCountBuffer(MTLBuffer v);
    @Property(selector = "instanceCountBufferOffset")
    public native @MachineSizedUInt long getInstanceCountBufferOffset();
    @Property(selector = "setInstanceCountBufferOffset:")
    public native void setInstanceCountBufferOffset(@MachineSizedUInt long v);
    @Property(selector = "instanceDescriptorType")
    public native MTLAccelerationStructureInstanceDescriptorType getInstanceDescriptorType();
    @Property(selector = "setInstanceDescriptorType:")
    public native void setInstanceDescriptorType(MTLAccelerationStructureInstanceDescriptorType v);
    @Property(selector = "motionTransformBuffer")
    public native MTLBuffer getMotionTransformBuffer();
    @Property(selector = "setMotionTransformBuffer:")
    public native void setMotionTransformBuffer(MTLBuffer v);
    @Property(selector = "motionTransformBufferOffset")
    public native @MachineSizedUInt long getMotionTransformBufferOffset();
    @Property(selector = "setMotionTransformBufferOffset:")
    public native void setMotionTransformBufferOffset(@MachineSizedUInt long v);
    @Property(selector = "maxMotionTransformCount")
    public native @MachineSizedUInt long getMaxMotionTransformCount();
    @Property(selector = "setMaxMotionTransformCount:")
    public native void setMaxMotionTransformCount(@MachineSizedUInt long v);
    @Property(selector = "motionTransformCountBuffer")
    public native MTLBuffer getMotionTransformCountBuffer();
    @Property(selector = "setMotionTransformCountBuffer:")
    public native void setMotionTransformCountBuffer(MTLBuffer v);
    @Property(selector = "motionTransformCountBufferOffset")
    public native @MachineSizedUInt long getMotionTransformCountBufferOffset();
    @Property(selector = "setMotionTransformCountBufferOffset:")
    public native void setMotionTransformCountBufferOffset(@MachineSizedUInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "descriptor")
    public static native MTLIndirectInstanceAccelerationStructureDescriptor descriptor();
    /*</methods>*/
}
