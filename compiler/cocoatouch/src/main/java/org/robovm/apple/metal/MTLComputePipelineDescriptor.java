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
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Metal") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLComputePipelineDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTLComputePipelineDescriptorPtr extends Ptr<MTLComputePipelineDescriptor, MTLComputePipelineDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTLComputePipelineDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTLComputePipelineDescriptor() {}
    protected MTLComputePipelineDescriptor(Handle h, long handle) { super(h, handle); }
    protected MTLComputePipelineDescriptor(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "label")
    public native String getLabel();
    @Property(selector = "setLabel:")
    public native void setLabel(String v);
    @Property(selector = "computeFunction")
    public native MTLFunction getComputeFunction();
    @Property(selector = "setComputeFunction:")
    public native void setComputeFunction(MTLFunction v);
    @Property(selector = "threadGroupSizeIsMultipleOfThreadExecutionWidth")
    public native boolean isThreadGroupSizeMultipleOfThreadExecutionWidth();
    @Property(selector = "setThreadGroupSizeIsMultipleOfThreadExecutionWidth:")
    public native void setThreadGroupSizeMultipleOfThreadExecutionWidth(boolean v);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "maxTotalThreadsPerThreadgroup")
    public native @MachineSizedUInt long getMaxTotalThreadsPerThreadgroup();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "setMaxTotalThreadsPerThreadgroup:")
    public native void setMaxTotalThreadsPerThreadgroup(@MachineSizedUInt long v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "stageInputDescriptor")
    public native MTLStageInputOutputDescriptor getStageInputDescriptor();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setStageInputDescriptor:")
    public native void setStageInputDescriptor(MTLStageInputOutputDescriptor v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "buffers")
    public native MTLPipelineBufferDescriptorArray getBuffers();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "supportIndirectCommandBuffers")
    public native boolean isSupportIndirectCommandBuffers();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setSupportIndirectCommandBuffers:")
    public native void setSupportIndirectCommandBuffers(boolean v);
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 15.0. Use preloadedLibraries instead.
     */
    @Deprecated
    @Property(selector = "insertLibraries")
    public native NSArray<?> getInsertLibraries();
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 15.0. Use preloadedLibraries instead.
     */
    @Deprecated
    @Property(selector = "setInsertLibraries:")
    public native void setInsertLibraries(NSArray<?> v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "preloadedLibraries")
    public native NSArray<?> getPreloadedLibraries();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setPreloadedLibraries:")
    public native void setPreloadedLibraries(NSArray<?> v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "binaryArchives")
    public native NSArray<?> getBinaryArchives();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setBinaryArchives:")
    public native void setBinaryArchives(NSArray<?> v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "linkedFunctions")
    public native MTLLinkedFunctions getLinkedFunctions();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setLinkedFunctions:")
    public native void setLinkedFunctions(MTLLinkedFunctions v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "supportAddingBinaryFunctions")
    public native boolean isSupportAddingBinaryFunctions();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setSupportAddingBinaryFunctions:")
    public native void setSupportAddingBinaryFunctions(boolean v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "maxCallStackDepth")
    public native @MachineSizedUInt long getMaxCallStackDepth();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setMaxCallStackDepth:")
    public native void setMaxCallStackDepth(@MachineSizedUInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "reset")
    public native void reset();
    /*</methods>*/
}
