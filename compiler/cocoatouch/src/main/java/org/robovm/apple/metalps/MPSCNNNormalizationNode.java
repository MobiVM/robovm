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
/*<annotations>*/@Library("Metal") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSCNNNormalizationNode/*</name>*/ 
    extends /*<extends>*/MPSNNFilterNode/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSCNNNormalizationNodePtr extends Ptr<MPSCNNNormalizationNode, MPSCNNNormalizationNodePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSCNNNormalizationNode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSCNNNormalizationNode() {}
    protected MPSCNNNormalizationNode(Handle h, long handle) { super(h, handle); }
    protected MPSCNNNormalizationNode(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSource:")
    public MPSCNNNormalizationNode(MPSNNImageNode sourceNode) { super((SkipInit) null); initObject(initWithSource(sourceNode)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Property(selector = "alpha")
    public native float getAlpha();
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Property(selector = "setAlpha:")
    public native void setAlpha(float v);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Property(selector = "beta")
    public native float getBeta();
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Property(selector = "setBeta:")
    public native void setBeta(float v);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Property(selector = "delta")
    public native float getDelta();
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Property(selector = "setDelta:")
    public native void setDelta(float v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSource:")
    protected native @Pointer long initWithSource(MPSNNImageNode sourceNode);
    @Method(selector = "nodeWithSource:")
    public static native MPSCNNNormalizationNode nodeWithSource(MPSNNImageNode sourceNode);
    /*</methods>*/
}
