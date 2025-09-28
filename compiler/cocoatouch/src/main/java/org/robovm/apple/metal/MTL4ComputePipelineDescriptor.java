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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTL4ComputePipelineDescriptor/*</name>*/ 
    extends /*<extends>*/MTL4PipelineDescriptor/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTL4ComputePipelineDescriptorPtr extends Ptr<MTL4ComputePipelineDescriptor, MTL4ComputePipelineDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTL4ComputePipelineDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTL4ComputePipelineDescriptor() {}
    protected MTL4ComputePipelineDescriptor(Handle h, long handle) { super(h, handle); }
    protected MTL4ComputePipelineDescriptor(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "computeFunctionDescriptor")
    public native MTL4FunctionDescriptor getComputeFunctionDescriptor();
    @Property(selector = "setComputeFunctionDescriptor:")
    public native void setComputeFunctionDescriptor(MTL4FunctionDescriptor v);
    @Property(selector = "threadGroupSizeIsMultipleOfThreadExecutionWidth")
    public native boolean isThreadGroupSizeIsMultipleOfThreadExecutionWidth();
    @Property(selector = "setThreadGroupSizeIsMultipleOfThreadExecutionWidth:")
    public native void setThreadGroupSizeIsMultipleOfThreadExecutionWidth(boolean v);
    @Property(selector = "maxTotalThreadsPerThreadgroup")
    public native @MachineSizedUInt long getMaxTotalThreadsPerThreadgroup();
    @Property(selector = "setMaxTotalThreadsPerThreadgroup:")
    public native void setMaxTotalThreadsPerThreadgroup(@MachineSizedUInt long v);
    @Property(selector = "requiredThreadsPerThreadgroup")
    public native @ByVal MTLSize getRequiredThreadsPerThreadgroup();
    @Property(selector = "setRequiredThreadsPerThreadgroup:")
    public native void setRequiredThreadsPerThreadgroup(@ByVal MTLSize v);
    @Property(selector = "supportBinaryLinking")
    public native boolean isSupportBinaryLinking();
    @Property(selector = "setSupportBinaryLinking:")
    public native void setSupportBinaryLinking(boolean v);
    @Property(selector = "staticLinkingDescriptor")
    public native MTL4StaticLinkingDescriptor getStaticLinkingDescriptor();
    @Property(selector = "setStaticLinkingDescriptor:")
    public native void setStaticLinkingDescriptor(MTL4StaticLinkingDescriptor v);
    @Property(selector = "supportIndirectCommandBuffers")
    public native MTL4IndirectCommandBufferSupportState getSupportIndirectCommandBuffers();
    @Property(selector = "setSupportIndirectCommandBuffers:")
    public native void setSupportIndirectCommandBuffers(MTL4IndirectCommandBufferSupportState v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "reset")
    public native void reset();
    /*</methods>*/
}
