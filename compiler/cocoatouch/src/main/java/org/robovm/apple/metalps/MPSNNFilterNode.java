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
/*<annotations>*/@Library("MetalPerformanceShaders") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSNNFilterNode/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSNNFilterNodePtr extends Ptr<MPSNNFilterNode, MPSNNFilterNodePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSNNFilterNode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPSNNFilterNode() {}
    protected MPSNNFilterNode(Handle h, long handle) { super(h, handle); }
    protected MPSNNFilterNode(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "resultImage")
    public native MPSNNImageNode getResultImage();
    @Property(selector = "resultState")
    public native MPSNNStateNode getResultState();
    @Property(selector = "resultStates")
    public native NSArray<MPSNNStateNode> getResultStates();
    @Property(selector = "paddingPolicy")
    public native MPSNNPadding getPaddingPolicy();
    @Property(selector = "setPaddingPolicy:")
    public native void setPaddingPolicy(MPSNNPadding v);
    @Property(selector = "label")
    public native String getLabel();
    @Property(selector = "setLabel:")
    public native void setLabel(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "gradientFilterWithSource:")
    public native MPSNNGradientFilterNode gradientFilter(MPSNNImageNode gradientImage);
    @Method(selector = "gradientFilterWithSources:")
    public native MPSNNGradientFilterNode gradientFilter(NSArray<MPSNNImageNode> gradientImages);
    @Method(selector = "gradientFiltersWithSources:")
    public native NSArray<MPSNNGradientFilterNode> gradientFilters(NSArray<MPSNNImageNode> gradientImages);
    @Method(selector = "gradientFiltersWithSource:")
    public native NSArray<MPSNNGradientFilterNode> gradientFilters(MPSNNImageNode gradientImage);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "trainingGraphWithSourceGradient:nodeHandler:")
    public native NSArray<MPSNNFilterNode> trainingGraph(MPSNNImageNode gradientImage, @Block VoidBlock4<MPSNNFilterNode, MPSNNFilterNode, MPSNNImageNode, MPSNNImageNode> nodeHandler);
    /*</methods>*/
}
