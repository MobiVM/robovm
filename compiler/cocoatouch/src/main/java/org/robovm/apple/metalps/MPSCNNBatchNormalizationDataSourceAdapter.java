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
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSCNNBatchNormalizationDataSourceAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MPSCNNBatchNormalizationDataSource/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("numberOfFeatureChannels")
    public @MachineSizedUInt long numberOfFeatureChannels() { return 0; }
    @NotImplemented("gamma")
    public FloatPtr gamma() { return null; }
    @NotImplemented("beta")
    public FloatPtr beta() { return null; }
    @NotImplemented("mean")
    public FloatPtr mean() { return null; }
    @NotImplemented("variance")
    public FloatPtr variance() { return null; }
    @NotImplemented("load")
    public boolean load() { return false; }
    @NotImplemented("purge")
    public void purge() {}
    @NotImplemented("label")
    public String label() { return null; }
    @NotImplemented("updateGammaAndBetaWithCommandBuffer:batchNormalizationState:")
    public MPSCNNNormalizationGammaAndBetaState updateGammaAndBeta(MTLCommandBuffer commandBuffer, MPSCNNBatchNormalizationState batchNormalizationState) { return null; }
    /**
     * @since Available in iOS 12.0 and later.
     */
    @NotImplemented("updateMeanAndVarianceWithCommandBuffer:batchNormalizationState:")
    public MPSCNNNormalizationMeanAndVarianceState updateMeanAndVariance(MTLCommandBuffer commandBuffer, MPSCNNBatchNormalizationState batchNormalizationState) { return null; }
    @NotImplemented("updateGammaAndBetaWithBatchNormalizationState:")
    public boolean updateGammaAndBeta(MPSCNNBatchNormalizationState batchNormalizationState) { return false; }
    /**
     * @since Available in iOS 12.0 and later.
     */
    @NotImplemented("updateMeanAndVarianceWithBatchNormalizationState:")
    public boolean updateMeanAndVariance(MPSCNNBatchNormalizationState batchNormalizationState) { return false; }
    @NotImplemented("epsilon")
    public float epsilon() { return 0; }
    @NotImplemented("encodeWithCoder:")
    public void encode(NSCoder aCoder) {}
    /**
     * @since Available in iOS 12.0 and later.
     */
    @NotImplemented("copyWithZone:device:")
    public MPSCNNBatchNormalizationDataSource copy(NSZone zone, MTLDevice device) { return null; }
    /*</methods>*/
}
