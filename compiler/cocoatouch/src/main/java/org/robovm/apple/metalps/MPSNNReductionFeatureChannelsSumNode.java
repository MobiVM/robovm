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
 * @since Available in iOS 12.1 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShaders") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSNNReductionFeatureChannelsSumNode/*</name>*/ 
    extends /*<extends>*/MPSNNUnaryReductionNode/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSNNReductionFeatureChannelsSumNodePtr extends Ptr<MPSNNReductionFeatureChannelsSumNode, MPSNNReductionFeatureChannelsSumNodePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSNNReductionFeatureChannelsSumNode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPSNNReductionFeatureChannelsSumNode() {}
    protected MPSNNReductionFeatureChannelsSumNode(Handle h, long handle) { super(h, handle); }
    protected MPSNNReductionFeatureChannelsSumNode(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSource:")
    public MPSNNReductionFeatureChannelsSumNode(MPSNNImageNode sourceNode) { super(sourceNode); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "weight")
    public native float getWeight();
    @Property(selector = "setWeight:")
    public native void setWeight(float v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
