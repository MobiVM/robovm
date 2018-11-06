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
package org.robovm.apple.gameplaykit;

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
import org.robovm.apple.spritekit.*;
import org.robovm.apple.scenekit.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("GameplayKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GKDecisionTree/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class GKDecisionTreePtr extends Ptr<GKDecisionTree, GKDecisionTreePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GKDecisionTree.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GKDecisionTree() {}
    protected GKDecisionTree(Handle h, long handle) { super(h, handle); }
    protected GKDecisionTree(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAttribute:")
    public GKDecisionTree(NSObject attribute) { super((SkipInit) null); initObject(init(attribute)); }
    @Method(selector = "initWithExamples:actions:attributes:")
    public GKDecisionTree(NSArray<?> examples, NSArray<?> actions, NSArray<?> attributes) { super((SkipInit) null); initObject(init(examples, actions, attributes)); }
    @Method(selector = "initWithURL:error:")
    public GKDecisionTree(NSURL url, NSError error) { super((SkipInit) null); initObject(init(url, error)); }
    @Method(selector = "initWithCoder:")
    public GKDecisionTree(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "rootNode")
    public native GKDecisionNode getRootNode();
    @Property(selector = "randomSource")
    public native GKRandomSource getRandomSource();
    @Property(selector = "setRandomSource:")
    public native void setRandomSource(GKRandomSource v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAttribute:")
    protected native @Pointer long init(NSObject attribute);
    @Method(selector = "initWithExamples:actions:attributes:")
    protected native @Pointer long init(NSArray<?> examples, NSArray<?> actions, NSArray<?> attributes);
    @Method(selector = "initWithURL:error:")
    protected native @Pointer long init(NSURL url, NSError error);
    @Method(selector = "exportToURL:error:")
    public native boolean exportToURL(NSURL url, NSError error);
    @Method(selector = "findActionForAnswers:")
    public native NSObject findActionForAnswers(NSDictionary<?, ?> answers);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
