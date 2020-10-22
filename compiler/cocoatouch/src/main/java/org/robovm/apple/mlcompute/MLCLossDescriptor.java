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
package org.robovm.apple.mlcompute;

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
import org.robovm.apple.metal.*;
import org.robovm.apple.metalps.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MLCompute") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MLCLossDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MLCLossDescriptorPtr extends Ptr<MLCLossDescriptor, MLCLossDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MLCLossDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MLCLossDescriptor() {}
    protected MLCLossDescriptor(Handle h, long handle) { super(h, handle); }
    protected MLCLossDescriptor(SkipInit skipInit) { super(skipInit); }
    public MLCLossDescriptor(MLCLossType lossType, MLCReductionType reductionType) { super((Handle) null, create(lossType, reductionType)); retain(getHandle()); }
    public MLCLossDescriptor(MLCLossType lossType, MLCReductionType reductionType, float weight) { super((Handle) null, create(lossType, reductionType, weight)); retain(getHandle()); }
    public MLCLossDescriptor(MLCLossType lossType, MLCReductionType reductionType, float weight, float labelSmoothing, @MachineSizedUInt long classCount) { super((Handle) null, create(lossType, reductionType, weight, labelSmoothing, classCount)); retain(getHandle()); }
    public MLCLossDescriptor(MLCLossType lossType, MLCReductionType reductionType, float weight, float labelSmoothing, @MachineSizedUInt long classCount, float epsilon, float delta) { super((Handle) null, create(lossType, reductionType, weight, labelSmoothing, classCount, epsilon, delta)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "lossType")
    public native MLCLossType getLossType();
    @Property(selector = "reductionType")
    public native MLCReductionType getReductionType();
    @Property(selector = "weight")
    public native float getWeight();
    @Property(selector = "labelSmoothing")
    public native float getLabelSmoothing();
    @Property(selector = "classCount")
    public native @MachineSizedUInt long getClassCount();
    @Property(selector = "epsilon")
    public native float getEpsilon();
    @Property(selector = "delta")
    public native float getDelta();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "descriptorWithType:reductionType:")
    protected static native @Pointer long create(MLCLossType lossType, MLCReductionType reductionType);
    @Method(selector = "descriptorWithType:reductionType:weight:")
    protected static native @Pointer long create(MLCLossType lossType, MLCReductionType reductionType, float weight);
    @Method(selector = "descriptorWithType:reductionType:weight:labelSmoothing:classCount:")
    protected static native @Pointer long create(MLCLossType lossType, MLCReductionType reductionType, float weight, float labelSmoothing, @MachineSizedUInt long classCount);
    @Method(selector = "descriptorWithType:reductionType:weight:labelSmoothing:classCount:epsilon:delta:")
    protected static native @Pointer long create(MLCLossType lossType, MLCReductionType reductionType, float weight, float labelSmoothing, @MachineSizedUInt long classCount, float epsilon, float delta);
    /*</methods>*/
}
