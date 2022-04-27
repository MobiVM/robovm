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
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("GameplayKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GKShuffledDistribution/*</name>*/ 
    extends /*<extends>*/GKRandomDistribution/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GKShuffledDistributionPtr extends Ptr<GKShuffledDistribution, GKShuffledDistributionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GKShuffledDistribution.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GKShuffledDistribution() {}
    protected GKShuffledDistribution(Handle h, long handle) { super(h, handle); }
    protected GKShuffledDistribution(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithRandomSource:lowestValue:highestValue:")
    public GKShuffledDistribution(GKRandom source, @MachineSizedSInt long lowestInclusive, @MachineSizedSInt long highestInclusive) { super(source, lowestInclusive, highestInclusive); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "distributionForDieWithSideCount:")
    public static native GKShuffledDistribution die(@MachineSizedSInt long sideCount);
    @Method(selector = "d6")
    public static native GKShuffledDistribution d6();
    @Method(selector = "d20")
    public static native GKShuffledDistribution d20();
    /*</methods>*/
}
