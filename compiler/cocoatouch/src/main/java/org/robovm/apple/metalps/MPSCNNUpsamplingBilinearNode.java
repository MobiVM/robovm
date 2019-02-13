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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSCNNUpsamplingBilinearNode/*</name>*/ 
    extends /*<extends>*/MPSNNFilterNode/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSCNNUpsamplingBilinearNodePtr extends Ptr<MPSCNNUpsamplingBilinearNode, MPSCNNUpsamplingBilinearNodePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSCNNUpsamplingBilinearNode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPSCNNUpsamplingBilinearNode() {}
    protected MPSCNNUpsamplingBilinearNode(Handle h, long handle) { super(h, handle); }
    protected MPSCNNUpsamplingBilinearNode(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSource:integerScaleFactorX:integerScaleFactorY:")
    public MPSCNNUpsamplingBilinearNode(MPSNNImageNode sourceNode, @MachineSizedUInt long integerScaleFactorX, @MachineSizedUInt long integerScaleFactorY) { super((SkipInit) null); initObject(init(sourceNode, integerScaleFactorX, integerScaleFactorY)); }
    @Method(selector = "initWithSource:integerScaleFactorX:integerScaleFactorY:alignCorners:")
    public MPSCNNUpsamplingBilinearNode(MPSNNImageNode sourceNode, @MachineSizedUInt long integerScaleFactorX, @MachineSizedUInt long integerScaleFactorY, boolean alignCorners) { super((SkipInit) null); initObject(init(sourceNode, integerScaleFactorX, integerScaleFactorY, alignCorners)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "scaleFactorX")
    public native double getScaleFactorX();
    @Property(selector = "scaleFactorY")
    public native double getScaleFactorY();
    @Property(selector = "alignCorners")
    public native boolean isAlignCorners();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSource:integerScaleFactorX:integerScaleFactorY:")
    protected native @Pointer long init(MPSNNImageNode sourceNode, @MachineSizedUInt long integerScaleFactorX, @MachineSizedUInt long integerScaleFactorY);
    @Method(selector = "initWithSource:integerScaleFactorX:integerScaleFactorY:alignCorners:")
    protected native @Pointer long init(MPSNNImageNode sourceNode, @MachineSizedUInt long integerScaleFactorX, @MachineSizedUInt long integerScaleFactorY, boolean alignCorners);
    /*</methods>*/
}
