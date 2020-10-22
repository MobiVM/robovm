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
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Metal") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLInstanceAccelerationStructureDescriptor/*</name>*/ 
    extends /*<extends>*/MTLAccelerationStructureDescriptor/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTLInstanceAccelerationStructureDescriptorPtr extends Ptr<MTLInstanceAccelerationStructureDescriptor, MTLInstanceAccelerationStructureDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTLInstanceAccelerationStructureDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTLInstanceAccelerationStructureDescriptor() {}
    protected MTLInstanceAccelerationStructureDescriptor(Handle h, long handle) { super(h, handle); }
    protected MTLInstanceAccelerationStructureDescriptor(SkipInit skipInit) { super(skipInit); }
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
    @Property(selector = "instanceCount")
    public native @MachineSizedUInt long getInstanceCount();
    @Property(selector = "setInstanceCount:")
    public native void setInstanceCount(@MachineSizedUInt long v);
    @Property(selector = "instancedAccelerationStructures")
    public native NSArray<?> getInstancedAccelerationStructures();
    @Property(selector = "setInstancedAccelerationStructures:")
    public native void setInstancedAccelerationStructures(NSArray<?> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "descriptor")
    public static native MTLInstanceAccelerationStructureDescriptor descriptor();
    /*</methods>*/
}
