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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSCNNNeuronGradientNode/*</name>*/ 
    extends /*<extends>*/MPSNNGradientFilterNode/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSCNNNeuronGradientNodePtr extends Ptr<MPSCNNNeuronGradientNode, MPSCNNNeuronGradientNodePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSCNNNeuronGradientNode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPSCNNNeuronGradientNode() {}
    protected MPSCNNNeuronGradientNode(Handle h, long handle) { super(h, handle); }
    protected MPSCNNNeuronGradientNode(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSourceGradient:sourceImage:gradientState:descriptor:")
    public MPSCNNNeuronGradientNode(MPSNNImageNode sourceGradient, MPSNNImageNode sourceImage, MPSNNGradientStateNode gradientState, MPSNNNeuronDescriptor descriptor) { super((SkipInit) null); initObject(init(sourceGradient, sourceImage, gradientState, descriptor)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "descriptor")
    public native MPSNNNeuronDescriptor getDescriptor();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSourceGradient:sourceImage:gradientState:descriptor:")
    protected native @Pointer long init(MPSNNImageNode sourceGradient, MPSNNImageNode sourceImage, MPSNNGradientStateNode gradientState, MPSNNNeuronDescriptor descriptor);
    /*</methods>*/
}
