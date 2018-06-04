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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSCNNDropoutNode/*</name>*/ 
    extends /*<extends>*/MPSNNFilterNode/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSCNNDropoutNodePtr extends Ptr<MPSCNNDropoutNode, MPSCNNDropoutNodePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSCNNDropoutNode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSCNNDropoutNode() {}
    protected MPSCNNDropoutNode(Handle h, long handle) { super(h, handle); }
    protected MPSCNNDropoutNode(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSource:")
    public MPSCNNDropoutNode(MPSNNImageNode source) { super((SkipInit) null); initObject(init(source)); }
    @Method(selector = "initWithSource:keepProbability:")
    public MPSCNNDropoutNode(MPSNNImageNode source, float keepProbability) { super((SkipInit) null); initObject(init(source, keepProbability)); }
    @Method(selector = "initWithSource:keepProbability:seed:maskStrideInPixels:")
    public MPSCNNDropoutNode(MPSNNImageNode source, float keepProbability, @MachineSizedUInt long seed, @ByVal MTLSize maskStrideInPixels) { super((SkipInit) null); initObject(init(source, keepProbability, seed, maskStrideInPixels)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "keepProbability")
    public native float getKeepProbability();
    @Property(selector = "seed")
    public native @MachineSizedUInt long getSeed();
    @Property(selector = "maskStrideInPixels")
    public native @ByVal MTLSize getMaskStrideInPixels();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSource:")
    protected native @Pointer long init(MPSNNImageNode source);
    @Method(selector = "initWithSource:keepProbability:")
    protected native @Pointer long init(MPSNNImageNode source, float keepProbability);
    @Method(selector = "initWithSource:keepProbability:seed:maskStrideInPixels:")
    protected native @Pointer long init(MPSNNImageNode source, float keepProbability, @MachineSizedUInt long seed, @ByVal MTLSize maskStrideInPixels);
    @Method(selector = "nodeWithSource:")
    public static native MPSCNNDropoutNode nodeWithSource(MPSNNImageNode source);
    /*</methods>*/
}
