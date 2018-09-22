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
package org.robovm.apple.coreml;

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
import org.robovm.apple.corevideo.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MLCustomLayerAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MLCustomLayer/*</implements>*/ {

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
    @NotImplemented("setWeightData:error:")
    public boolean setWeightData(NSArray<NSData> weights, NSError.NSErrorPtr error) { return false; }
    @NotImplemented("outputShapesForInputShapes:error:")
    public NSArray<?> getOutputShapes(NSArray<?> inputShapes, NSError.NSErrorPtr error) { return null; }
    @NotImplemented("evaluateOnCPUWithInputs:outputs:error:")
    public boolean evaluateOnCPU(NSArray<MLMultiArray> inputs, NSArray<MLMultiArray> outputs, NSError.NSErrorPtr error) { return false; }
    @NotImplemented("encodeToCommandBuffer:inputs:outputs:error:")
    public boolean encodeToCommandBuffer(org.robovm.apple.metal.MTLCommandBuffer commandBuffer, NSArray<?> inputs, NSArray<?> outputs, NSError.NSErrorPtr error) { return false; }
    /*</methods>*/
}
