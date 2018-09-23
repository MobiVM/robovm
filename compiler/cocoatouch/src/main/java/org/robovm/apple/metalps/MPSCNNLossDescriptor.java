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
package org.robovm.apple.metalps;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.3 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShaders") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSCNNLossDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSCNNLossDescriptorPtr extends Ptr<MPSCNNLossDescriptor, MPSCNNLossDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSCNNLossDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPSCNNLossDescriptor() {}
    protected MPSCNNLossDescriptor(Handle h, long handle) { super(h, handle); }
    protected MPSCNNLossDescriptor(SkipInit skipInit) { super(skipInit); }
    public MPSCNNLossDescriptor(MPSCNNLossType lossType, MPSCNNReductionType reductionType) { super((Handle) null, create(lossType, reductionType)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "lossType")
    public native MPSCNNLossType getLossType();
    @Property(selector = "setLossType:")
    public native void setLossType(MPSCNNLossType v);
    @Property(selector = "reductionType")
    public native MPSCNNReductionType getReductionType();
    @Property(selector = "setReductionType:")
    public native void setReductionType(MPSCNNReductionType v);
    @Property(selector = "weight")
    public native float getWeight();
    @Property(selector = "setWeight:")
    public native void setWeight(float v);
    @Property(selector = "labelSmoothing")
    public native float getLabelSmoothing();
    @Property(selector = "setLabelSmoothing:")
    public native void setLabelSmoothing(float v);
    @Property(selector = "numberOfClasses")
    public native @MachineSizedUInt long getNumberOfClasses();
    @Property(selector = "setNumberOfClasses:")
    public native void setNumberOfClasses(@MachineSizedUInt long v);
    @Property(selector = "epsilon")
    public native float getEpsilon();
    @Property(selector = "setEpsilon:")
    public native void setEpsilon(float v);
    @Property(selector = "delta")
    public native float getDelta();
    @Property(selector = "setDelta:")
    public native void setDelta(float v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "cnnLossDescriptorWithType:reductionType:")
    protected static native @Pointer long create(MPSCNNLossType lossType, MPSCNNReductionType reductionType);
    /*</methods>*/
}
