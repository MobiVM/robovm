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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.imageio.*;
import org.robovm.apple.vision.*;
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreML") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MLParameterKey/*</name>*/ 
    extends /*<extends>*/MLKey/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MLParameterKeyPtr extends Ptr<MLParameterKey, MLParameterKeyPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MLParameterKey.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MLParameterKey() {}
    protected MLParameterKey(Handle h, long handle) { super(h, handle); }
    protected MLParameterKey(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "learningRate")
    public static native MLParameterKey getLearningRate();
    @Property(selector = "momentum")
    public static native MLParameterKey getMomentum();
    @Property(selector = "miniBatchSize")
    public static native MLParameterKey getMiniBatchSize();
    @Property(selector = "beta1")
    public static native MLParameterKey getBeta1();
    @Property(selector = "beta2")
    public static native MLParameterKey getBeta2();
    @Property(selector = "eps")
    public static native MLParameterKey getEps();
    @Property(selector = "epochs")
    public static native MLParameterKey getEpochs();
    @Property(selector = "shuffle")
    public static native MLParameterKey getShuffle();
    @Property(selector = "seed")
    public static native MLParameterKey getSeed();
    @Property(selector = "numberOfNeighbors")
    public static native MLParameterKey getNumberOfNeighbors();
    @Property(selector = "linkedModelFileName")
    public static native MLParameterKey getLinkedModelFileName();
    @Property(selector = "linkedModelSearchPath")
    public static native MLParameterKey getLinkedModelSearchPath();
    @Property(selector = "weights")
    public static native MLParameterKey getWeights();
    @Property(selector = "biases")
    public static native MLParameterKey getBiases();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "scopedTo:")
    public native MLParameterKey scopedTo(String scope);
    /*</methods>*/
}
