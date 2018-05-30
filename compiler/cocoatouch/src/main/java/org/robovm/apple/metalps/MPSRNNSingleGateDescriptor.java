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
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Metal") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSRNNSingleGateDescriptor/*</name>*/ 
    extends /*<extends>*/MPSRNNDescriptor/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSRNNSingleGateDescriptorPtr extends Ptr<MPSRNNSingleGateDescriptor, MPSRNNSingleGateDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSRNNSingleGateDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSRNNSingleGateDescriptor() {}
    protected MPSRNNSingleGateDescriptor(Handle h, long handle) { super(h, handle); }
    protected MPSRNNSingleGateDescriptor(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    public MPSRNNSingleGateDescriptor(@MachineSizedUInt long inputFeatureChannels, @MachineSizedUInt long outputFeatureChannels) { super((Handle) null, create(inputFeatureChannels, outputFeatureChannels)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "inputWeights")
    public native MPSCNNConvolutionDataSource getInputWeights();
    @Property(selector = "setInputWeights:")
    public native void setInputWeights(MPSCNNConvolutionDataSource v);
    @Property(selector = "recurrentWeights")
    public native MPSCNNConvolutionDataSource getRecurrentWeights();
    @Property(selector = "setRecurrentWeights:")
    public native void setRecurrentWeights(MPSCNNConvolutionDataSource v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "createRNNSingleGateDescriptorWithInputFeatureChannels:outputFeatureChannels:")
    protected static native @Pointer long create(@MachineSizedUInt long inputFeatureChannels, @MachineSizedUInt long outputFeatureChannels);
    /*</methods>*/
}
