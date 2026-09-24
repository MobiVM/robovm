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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTL4IndirectInstanceAccelerationStructureDescriptor/*</name>*/ 
    extends /*<extends>*/MTL4AccelerationStructureDescriptor/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTL4IndirectInstanceAccelerationStructureDescriptorPtr extends Ptr<MTL4IndirectInstanceAccelerationStructureDescriptor, MTL4IndirectInstanceAccelerationStructureDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTL4IndirectInstanceAccelerationStructureDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTL4IndirectInstanceAccelerationStructureDescriptor() {}
    protected MTL4IndirectInstanceAccelerationStructureDescriptor(Handle h, long handle) { super(h, handle); }
    protected MTL4IndirectInstanceAccelerationStructureDescriptor(SkipInit skipInit) { super(skipInit); }
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
    @Property(selector = "maxInstanceCount")
    public native @MachineSizedUInt long getMaxInstanceCount();
    @Property(selector = "setMaxInstanceCount:")
    public native void setMaxInstanceCount(@MachineSizedUInt long v);
    @Property(selector = "instanceCountBuffer")
    public native @ByVal MTL4BufferRange getInstanceCountBuffer();
    @Property(selector = "setInstanceCountBuffer:")
    public native void setInstanceCountBuffer(@ByVal MTL4BufferRange v);
    @Property(selector = "instanceDescriptorType")
    public native MTLAccelerationStructureInstanceDescriptorType getInstanceDescriptorType();
    @Property(selector = "setInstanceDescriptorType:")
    public native void setInstanceDescriptorType(MTLAccelerationStructureInstanceDescriptorType v);
    @Property(selector = "motionTransformBuffer")
    public native @ByVal MTL4BufferRange getMotionTransformBuffer();
    @Property(selector = "setMotionTransformBuffer:")
    public native void setMotionTransformBuffer(@ByVal MTL4BufferRange v);
    @Property(selector = "maxMotionTransformCount")
    public native @MachineSizedUInt long getMaxMotionTransformCount();
    @Property(selector = "setMaxMotionTransformCount:")
    public native void setMaxMotionTransformCount(@MachineSizedUInt long v);
    @Property(selector = "motionTransformCountBuffer")
    public native @ByVal MTL4BufferRange getMotionTransformCountBuffer();
    @Property(selector = "setMotionTransformCountBuffer:")
    public native void setMotionTransformCountBuffer(@ByVal MTL4BufferRange v);
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
