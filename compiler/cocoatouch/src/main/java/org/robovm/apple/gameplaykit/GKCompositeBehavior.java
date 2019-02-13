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

/*</javadoc>*/
/*<annotations>*/@Library("GameplayKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GKCompositeBehavior/*</name>*/ 
    extends /*<extends>*/GKBehavior/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GKCompositeBehaviorPtr extends Ptr<GKCompositeBehavior, GKCompositeBehaviorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GKCompositeBehavior.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GKCompositeBehavior() {}
    protected GKCompositeBehavior(Handle h, long handle) { super(h, handle); }
    protected GKCompositeBehavior(SkipInit skipInit) { super(skipInit); }
    public GKCompositeBehavior(NSArray<GKBehavior> behaviors) { super((Handle) null, create0(behaviors)); retain(getHandle()); }
    public GKCompositeBehavior(NSArray<GKBehavior> behaviors, NSArray<NSNumber> weights) { super((Handle) null, create0(behaviors, weights)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "behaviorCount")
    public native @MachineSizedSInt long getBehaviorCount();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setWeight:forBehavior:")
    public native void setWeightforBehavior(float weight, GKBehavior behavior);
    @Method(selector = "weightForBehavior:")
    public native float weightForBehavior(GKBehavior behavior);
    @Method(selector = "removeBehavior:")
    public native void removeBehavior(GKBehavior behavior);
    @Method(selector = "removeAllBehaviors")
    public native void removeAllBehaviors();
    @Method(selector = "objectAtIndexedSubscript:")
    public native GKBehavior getBehaviour(@MachineSizedUInt long idx);
    @Method(selector = "setObject:forKeyedSubscript:")
    public native void setObjectforKeyedSubscript(NSNumber weight, GKBehavior behavior);
    @Method(selector = "objectForKeyedSubscript:")
    public native NSNumber objectForKeyedSubscript(GKBehavior behavior);
    @Method(selector = "behaviorWithBehaviors:")
    protected static native @Pointer long create0(NSArray<GKBehavior> behaviors);
    @Method(selector = "behaviorWithBehaviors:andWeights:")
    protected static native @Pointer long create0(NSArray<GKBehavior> behaviors, NSArray<NSNumber> weights);
    /*</methods>*/
}
