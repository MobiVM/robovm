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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTL4MachineLearningPipelineDescriptor/*</name>*/ 
    extends /*<extends>*/MTL4PipelineDescriptor/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTL4MachineLearningPipelineDescriptorPtr extends Ptr<MTL4MachineLearningPipelineDescriptor, MTL4MachineLearningPipelineDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTL4MachineLearningPipelineDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTL4MachineLearningPipelineDescriptor() {}
    protected MTL4MachineLearningPipelineDescriptor(Handle h, long handle) { super(h, handle); }
    protected MTL4MachineLearningPipelineDescriptor(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "label")
    public native String getLabel();
    @Property(selector = "setLabel:")
    public native void setLabel(String v);
    @Property(selector = "machineLearningFunctionDescriptor")
    public native MTL4FunctionDescriptor getMachineLearningFunctionDescriptor();
    @Property(selector = "setMachineLearningFunctionDescriptor:")
    public native void setMachineLearningFunctionDescriptor(MTL4FunctionDescriptor v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setInputDimensions:atBufferIndex:")
    public native void setInputDimensions(MTLTensorExtents dimensions, @MachineSizedSInt long bufferIndex);
    @Method(selector = "setInputDimensions:withRange:")
    public native void setInputDimensions(NSArray<MTLTensorExtents> dimensions, @ByVal NSRange range);
    @Method(selector = "inputDimensionsAtBufferIndex:")
    public native MTLTensorExtents inputDimensionsAtBufferIndex(@MachineSizedSInt long bufferIndex);
    @Method(selector = "reset")
    public native void reset();
    /*</methods>*/
}
