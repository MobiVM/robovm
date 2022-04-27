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

/*</javadoc>*/
/*<annotations>*/@Library("Metal") @NativeProtocolProxy/*</annotations>*/
/*<visibility>*/public final/*</visibility>*/ class /*<name>*/MTLRenderPipelineState/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/public static class MTLRenderPipelineStatePtr extends Ptr<MTLRenderPipelineState, MTLRenderPipelineStatePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTLRenderPipelineState.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "label")
    public native String getLabel();
    @Property(selector = "device")
    public native MTLDevice getDevice();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "maxTotalThreadsPerThreadgroup")
    public native @MachineSizedUInt long getMaxTotalThreadsPerThreadgroup();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "threadgroupSizeMatchesTileSize")
    public native boolean isThreadgroupSizeMatchesTileSize();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "imageblockSampleLength")
    public native @MachineSizedUInt long getImageblockSampleLength();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "supportIndirectCommandBuffers")
    public native boolean isSupportIndirectCommandBuffers();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "imageblockMemoryLengthForDimensions:")
    public native @MachineSizedUInt long imageblockMemoryLengthForDimensions(@ByVal MTLSize imageblockDimensions);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "functionHandleWithFunction:stage:")
    public native MTLFunctionHandle functionHandle(MTLFunction function, MTLRenderStages stage);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "newVisibleFunctionTableWithDescriptor:stage:")
    public native MTLVisibleFunctionTable newVisibleFunctionTable(MTLVisibleFunctionTableDescriptor descriptor, MTLRenderStages stage);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "newIntersectionFunctionTableWithDescriptor:stage:")
    public native MTLIntersectionFunctionTable newIntersectionFunctionTable(MTLIntersectionFunctionTableDescriptor descriptor, MTLRenderStages stage);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "newRenderPipelineStateWithAdditionalBinaryFunctions:error:")
    public native MTLRenderPipelineState newRenderPipelineState(MTLRenderPipelineFunctionsDescriptor additionalBinaryFunctions, NSError.NSErrorPtr error);
    /*</methods>*/
}
