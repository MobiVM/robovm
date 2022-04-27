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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSCNNConvolutionGradient/*</name>*/ 
    extends /*<extends>*/MPSCNNGradientKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSCNNConvolutionGradientPtr extends Ptr<MPSCNNConvolutionGradient, MPSCNNConvolutionGradientPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSCNNConvolutionGradient.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSCNNConvolutionGradient() {}
    protected MPSCNNConvolutionGradient(Handle h, long handle) { super(h, handle); }
    protected MPSCNNConvolutionGradient(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:weights:")
    public MPSCNNConvolutionGradient(MTLDevice device, MPSCNNConvolutionDataSource weights) { super((SkipInit) null); initObject(init(device, weights)); }
    @Method(selector = "initWithCoder:device:")
    public MPSCNNConvolutionGradient(NSCoder aDecoder, MTLDevice device) { super((SkipInit) null); initObject(init(aDecoder, device)); }
    @Method(selector = "initWithCoder:")
    public MPSCNNConvolutionGradient(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sourceGradientFeatureChannels")
    public native @MachineSizedUInt long getSourceGradientFeatureChannels();
    @Property(selector = "sourceImageFeatureChannels")
    public native @MachineSizedUInt long getSourceImageFeatureChannels();
    @Property(selector = "groups")
    public native @MachineSizedUInt long getGroups();
    @Property(selector = "channelMultiplier")
    public native @MachineSizedUInt long getChannelMultiplier();
    @Property(selector = "dataSource")
    public native MPSCNNConvolutionDataSource getDataSource();
    @Property(selector = "gradientOption")
    public native MPSCNNConvolutionGradientOption getGradientOption();
    @Property(selector = "setGradientOption:")
    public native void setGradientOption(MPSCNNConvolutionGradientOption v);
    /**
     * @since Available in iOS 11.3 and later.
     * @deprecated Deprecated in iOS 12.0. Use This is deprecated and doesn't do anything. It is here for backward compatibility. MPSCNNConvolutionGradient doesn't serialize weights. It gets weight from state.convolution.dataSource on first use i.e. first encodeToCommandBuffer call
     */
    @Deprecated
    @Property(selector = "serializeWeightsAndBiases")
    public native boolean isSerializeWeightsAndBiases();
    /**
     * @since Available in iOS 11.3 and later.
     * @deprecated Deprecated in iOS 12.0. Use This is deprecated and doesn't do anything. It is here for backward compatibility. MPSCNNConvolutionGradient doesn't serialize weights. It gets weight from state.convolution.dataSource on first use i.e. first encodeToCommandBuffer call
     */
    @Deprecated
    @Property(selector = "setSerializeWeightsAndBiases:")
    public native void setSerializeWeightsAndBiases(boolean v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:weights:")
    protected native @Pointer long init(MTLDevice device, MPSCNNConvolutionDataSource weights);
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder aDecoder, MTLDevice device);
    @Method(selector = "reloadWeightsAndBiasesFromDataSource")
    public native void reloadWeightsAndBiasesFromDataSource();
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "reloadWeightsAndBiasesWithCommandBuffer:state:")
    public native void reloadWeightsAndBiases(MTLCommandBuffer commandBuffer, MPSCNNConvolutionWeightsAndBiasesState state);
    /*</methods>*/
}
