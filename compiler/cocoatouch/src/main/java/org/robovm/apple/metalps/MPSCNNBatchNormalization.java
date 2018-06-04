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
/*<annotations>*/@Library("Metal") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSCNNBatchNormalization/*</name>*/ 
    extends /*<extends>*/MPSCNNKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSCNNBatchNormalizationPtr extends Ptr<MPSCNNBatchNormalization, MPSCNNBatchNormalizationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSCNNBatchNormalization.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPSCNNBatchNormalization() {}
    protected MPSCNNBatchNormalization(Handle h, long handle) { super(h, handle); }
    protected MPSCNNBatchNormalization(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:dataSource:")
    public MPSCNNBatchNormalization(MTLDevice device, MPSCNNBatchNormalizationDataSource dataSource) { super((SkipInit) null); initObject(init(device, dataSource)); }
    @Method(selector = "initWithCoder:device:")
    public MPSCNNBatchNormalization(NSCoder aDecoder, MTLDevice device) { super((SkipInit) null); initObject(init(aDecoder, device)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "numberOfFeatureChannels")
    public native @MachineSizedUInt long getNumberOfFeatureChannels();
    @Property(selector = "epsilon")
    public native float getEpsilon();
    @Property(selector = "setEpsilon:")
    public native void setEpsilon(float v);
    @Property(selector = "dataSource")
    public native MPSCNNBatchNormalizationDataSource getDataSource();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:dataSource:")
    protected native @Pointer long init(MTLDevice device, MPSCNNBatchNormalizationDataSource dataSource);
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder aDecoder, MTLDevice device);
    @Method(selector = "encodeToCommandBuffer:sourceImage:batchNormalizationState:destinationImage:")
    public native void encode(MTLCommandBuffer commandBuffer, MPSImage sourceImage, MPSCNNBatchNormalizationState batchNormalizationState, MPSImage destinationImage);
    @Method(selector = "encodeBatchToCommandBuffer:sourceImages:batchNormalizationState:destinationImages:")
    public native void encodeBatch(MTLCommandBuffer commandBuffer, NSArray<MPSImage> sourceImages, MPSCNNBatchNormalizationState batchNormalizationState, NSArray<MPSImage> destinationImages);
    @Method(selector = "resultStateForSourceImage:sourceStates:destinationImage:")
    public native MPSCNNBatchNormalizationState getResultState(MPSImage sourceImage, NSArray<MPSState> sourceStates, MPSImage destinationImage);
    @Method(selector = "temporaryResultStateForCommandBuffer:sourceImage:sourceStates:destinationImage:")
    public native MPSCNNBatchNormalizationState getTemporaryResult(MTLCommandBuffer commandBuffer, MPSImage sourceImage, NSArray<MPSState> sourceStates, MPSImage destinationImage);
    @Method(selector = "reloadDataSource:")
    public native void reloadDataSource(MPSCNNBatchNormalizationDataSource dataSource);
    @Method(selector = "reloadGammaAndBetaWithCommandBuffer:gammaAndBetaState:")
    public native void reloadGammaAndBeta(MTLCommandBuffer commandBuffer, MPSCNNNormalizationGammaAndBetaState gammaAndBetaState);
    /*</methods>*/
}
