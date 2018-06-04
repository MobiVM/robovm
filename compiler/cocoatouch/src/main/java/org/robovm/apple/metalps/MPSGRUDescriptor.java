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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSGRUDescriptor/*</name>*/ 
    extends /*<extends>*/MPSRNNDescriptor/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSGRUDescriptorPtr extends Ptr<MPSGRUDescriptor, MPSGRUDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSGRUDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSGRUDescriptor() {}
    protected MPSGRUDescriptor(Handle h, long handle) { super(h, handle); }
    protected MPSGRUDescriptor(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    public MPSGRUDescriptor(@MachineSizedUInt long inputFeatureChannels, @MachineSizedUInt long outputFeatureChannels) { super((Handle) null, create(inputFeatureChannels, outputFeatureChannels)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "inputGateInputWeights")
    public native MPSCNNConvolutionDataSource getInputGateInputWeights();
    @Property(selector = "setInputGateInputWeights:")
    public native void setInputGateInputWeights(MPSCNNConvolutionDataSource v);
    @Property(selector = "inputGateRecurrentWeights")
    public native MPSCNNConvolutionDataSource getInputGateRecurrentWeights();
    @Property(selector = "setInputGateRecurrentWeights:")
    public native void setInputGateRecurrentWeights(MPSCNNConvolutionDataSource v);
    @Property(selector = "recurrentGateInputWeights")
    public native MPSCNNConvolutionDataSource getRecurrentGateInputWeights();
    @Property(selector = "setRecurrentGateInputWeights:")
    public native void setRecurrentGateInputWeights(MPSCNNConvolutionDataSource v);
    @Property(selector = "recurrentGateRecurrentWeights")
    public native MPSCNNConvolutionDataSource getRecurrentGateRecurrentWeights();
    @Property(selector = "setRecurrentGateRecurrentWeights:")
    public native void setRecurrentGateRecurrentWeights(MPSCNNConvolutionDataSource v);
    @Property(selector = "outputGateInputWeights")
    public native MPSCNNConvolutionDataSource getOutputGateInputWeights();
    @Property(selector = "setOutputGateInputWeights:")
    public native void setOutputGateInputWeights(MPSCNNConvolutionDataSource v);
    @Property(selector = "outputGateRecurrentWeights")
    public native MPSCNNConvolutionDataSource getOutputGateRecurrentWeights();
    @Property(selector = "setOutputGateRecurrentWeights:")
    public native void setOutputGateRecurrentWeights(MPSCNNConvolutionDataSource v);
    @Property(selector = "outputGateInputGateWeights")
    public native MPSCNNConvolutionDataSource getOutputGateInputGateWeights();
    @Property(selector = "setOutputGateInputGateWeights:")
    public native void setOutputGateInputGateWeights(MPSCNNConvolutionDataSource v);
    @Property(selector = "gatePnormValue")
    public native float getGatePnormValue();
    @Property(selector = "setGatePnormValue:")
    public native void setGatePnormValue(float v);
    @Property(selector = "flipOutputGates")
    public native boolean isFlipOutputGates();
    @Property(selector = "setFlipOutputGates:")
    public native void setFlipOutputGates(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "createGRUDescriptorWithInputFeatureChannels:outputFeatureChannels:")
    protected static native @Pointer long create(@MachineSizedUInt long inputFeatureChannels, @MachineSizedUInt long outputFeatureChannels);
    /*</methods>*/
}
