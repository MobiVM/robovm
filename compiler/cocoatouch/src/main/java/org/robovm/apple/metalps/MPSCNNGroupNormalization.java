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
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShaders") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSCNNGroupNormalization/*</name>*/ 
    extends /*<extends>*/MPSCNNKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSCNNGroupNormalizationPtr extends Ptr<MPSCNNGroupNormalization, MPSCNNGroupNormalizationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSCNNGroupNormalization.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSCNNGroupNormalization() {}
    protected MPSCNNGroupNormalization(Handle h, long handle) { super(h, handle); }
    protected MPSCNNGroupNormalization(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:dataSource:")
    public MPSCNNGroupNormalization(MTLDevice device, MPSCNNGroupNormalizationDataSource dataSource) { super((SkipInit) null); initObject(init(device, dataSource)); }
    @Method(selector = "initWithCoder:device:")
    public MPSCNNGroupNormalization(NSCoder decoder, MTLDevice device) { super((SkipInit) null); initObject(init(decoder, device)); }
    @Method(selector = "initWithCoder:")
    public MPSCNNGroupNormalization(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "epsilon")
    public native float getEpsilon();
    @Property(selector = "setEpsilon:")
    public native void setEpsilon(float v);
    @Property(selector = "dataSource")
    public native MPSCNNGroupNormalizationDataSource getDataSource();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:dataSource:")
    protected native @Pointer long init(MTLDevice device, MPSCNNGroupNormalizationDataSource dataSource);
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder decoder, MTLDevice device);
    @Method(selector = "reloadGammaAndBetaFromDataSource")
    public native void reloadGammaAndBetaFromDataSource();
    @Method(selector = "reloadGammaAndBetaWithCommandBuffer:gammaAndBetaState:")
    public native void reloadGammaAndBeta(MTLCommandBuffer commandBuffer, MPSCNNNormalizationGammaAndBetaState gammaAndBetaState);
    @Method(selector = "resultStateForSourceImage:sourceStates:destinationImage:")
    public native MPSCNNGroupNormalizationGradientState getResultState(MPSImage sourceImage, NSArray<MPSState> sourceStates, MPSImage destinationImage);
    @Method(selector = "temporaryResultStateForCommandBuffer:sourceImage:sourceStates:destinationImage:")
    public native MPSCNNGroupNormalizationGradientState getTemporaryResult(MTLCommandBuffer commandBuffer, MPSImage sourceImage, NSArray<MPSState> sourceStates, MPSImage destinationImage);
    /*</methods>*/
}
