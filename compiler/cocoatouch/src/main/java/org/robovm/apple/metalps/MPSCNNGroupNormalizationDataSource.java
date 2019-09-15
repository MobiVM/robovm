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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/MPSCNNGroupNormalizationDataSource/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "numberOfFeatureChannels")
    @MachineSizedUInt long getNumberOfFeatureChannels();
    @Property(selector = "numberOfGroups")
    @MachineSizedUInt long getNumberOfGroups();
    @Property(selector = "setNumberOfGroups:")
    void setNumberOfGroups(@MachineSizedUInt long v);
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "gamma")
    FloatPtr gamma();
    @Method(selector = "beta")
    FloatPtr beta();
    @Method(selector = "label")
    String label();
    @Method(selector = "updateGammaAndBetaWithCommandBuffer:groupNormalizationStateBatch:")
    MPSCNNNormalizationGammaAndBetaState updateGammaAndBeta(MTLCommandBuffer commandBuffer, NSArray<MPSCNNGroupNormalizationGradientState> groupNormalizationStateBatch);
    @Method(selector = "updateGammaAndBetaWithGroupNormalizationStateBatch:")
    boolean updateGammaAndBeta(NSArray<MPSCNNGroupNormalizationGradientState> groupNormalizationStateBatch);
    @Method(selector = "epsilon")
    float epsilon();
    @Method(selector = "encodeWithCoder:")
    void encode(NSCoder aCoder);
    @Method(selector = "copyWithZone:device:")
    MPSCNNGroupNormalizationDataSource copy(NSZone zone, MTLDevice device);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
