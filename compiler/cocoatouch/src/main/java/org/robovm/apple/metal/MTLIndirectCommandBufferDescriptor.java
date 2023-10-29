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
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Metal") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLIndirectCommandBufferDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTLIndirectCommandBufferDescriptorPtr extends Ptr<MTLIndirectCommandBufferDescriptor, MTLIndirectCommandBufferDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTLIndirectCommandBufferDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTLIndirectCommandBufferDescriptor() {}
    protected MTLIndirectCommandBufferDescriptor(Handle h, long handle) { super(h, handle); }
    protected MTLIndirectCommandBufferDescriptor(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "commandTypes")
    public native MTLIndirectCommandType getCommandTypes();
    @Property(selector = "setCommandTypes:")
    public native void setCommandTypes(MTLIndirectCommandType v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "inheritPipelineState")
    public native boolean isInheritPipelineState();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setInheritPipelineState:")
    public native void setInheritPipelineState(boolean v);
    @Property(selector = "inheritBuffers")
    public native boolean isInheritBuffers();
    @Property(selector = "setInheritBuffers:")
    public native void setInheritBuffers(boolean v);
    @Property(selector = "maxVertexBufferBindCount")
    public native @MachineSizedUInt long getMaxVertexBufferBindCount();
    @Property(selector = "setMaxVertexBufferBindCount:")
    public native void setMaxVertexBufferBindCount(@MachineSizedUInt long v);
    @Property(selector = "maxFragmentBufferBindCount")
    public native @MachineSizedUInt long getMaxFragmentBufferBindCount();
    @Property(selector = "setMaxFragmentBufferBindCount:")
    public native void setMaxFragmentBufferBindCount(@MachineSizedUInt long v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "maxKernelBufferBindCount")
    public native @MachineSizedUInt long getMaxKernelBufferBindCount();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setMaxKernelBufferBindCount:")
    public native void setMaxKernelBufferBindCount(@MachineSizedUInt long v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "maxKernelThreadgroupMemoryBindCount")
    public native @MachineSizedUInt long getMaxKernelThreadgroupMemoryBindCount();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setMaxKernelThreadgroupMemoryBindCount:")
    public native void setMaxKernelThreadgroupMemoryBindCount(@MachineSizedUInt long v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "maxObjectBufferBindCount")
    public native @MachineSizedUInt long getMaxObjectBufferBindCount();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setMaxObjectBufferBindCount:")
    public native void setMaxObjectBufferBindCount(@MachineSizedUInt long v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "maxMeshBufferBindCount")
    public native @MachineSizedUInt long getMaxMeshBufferBindCount();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setMaxMeshBufferBindCount:")
    public native void setMaxMeshBufferBindCount(@MachineSizedUInt long v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "maxObjectThreadgroupMemoryBindCount")
    public native @MachineSizedUInt long getMaxObjectThreadgroupMemoryBindCount();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setMaxObjectThreadgroupMemoryBindCount:")
    public native void setMaxObjectThreadgroupMemoryBindCount(@MachineSizedUInt long v);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "supportRayTracing")
    public native boolean isSupportRayTracing();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setSupportRayTracing:")
    public native void setSupportRayTracing(boolean v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "supportDynamicAttributeStride")
    public native boolean isSupportDynamicAttributeStride();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setSupportDynamicAttributeStride:")
    public native void setSupportDynamicAttributeStride(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
