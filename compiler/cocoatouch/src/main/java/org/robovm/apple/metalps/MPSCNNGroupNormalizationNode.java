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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSCNNGroupNormalizationNode/*</name>*/ 
    extends /*<extends>*/MPSNNFilterNode/*</extends>*/ 
    /*<implements>*/implements MPSNNTrainableNode/*</implements>*/ {

    /*<ptr>*/public static class MPSCNNGroupNormalizationNodePtr extends Ptr<MPSCNNGroupNormalizationNode, MPSCNNGroupNormalizationNodePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSCNNGroupNormalizationNode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPSCNNGroupNormalizationNode() {}
    protected MPSCNNGroupNormalizationNode(Handle h, long handle) { super(h, handle); }
    protected MPSCNNGroupNormalizationNode(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSource:dataSource:")
    public MPSCNNGroupNormalizationNode(MPSNNImageNode source, MPSCNNGroupNormalizationDataSource dataSource) { super((SkipInit) null); initObject(init(source, dataSource)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "trainingStyle")
    public native MPSNNTrainingStyle getTrainingStyle();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setTrainingStyle:")
    public native void setTrainingStyle(MPSNNTrainingStyle v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSource:dataSource:")
    protected native @Pointer long init(MPSNNImageNode source, MPSCNNGroupNormalizationDataSource dataSource);
    /*</methods>*/
}
