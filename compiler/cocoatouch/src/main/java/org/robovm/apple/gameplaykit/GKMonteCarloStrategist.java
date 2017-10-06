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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GKMonteCarloStrategist/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements GKStrategist/*</implements>*/ {

    /*<ptr>*/public static class GKMonteCarloStrategistPtr extends Ptr<GKMonteCarloStrategist, GKMonteCarloStrategistPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GKMonteCarloStrategist.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GKMonteCarloStrategist() {}
    protected GKMonteCarloStrategist(Handle h, long handle) { super(h, handle); }
    protected GKMonteCarloStrategist(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "budget")
    public native @MachineSizedUInt long getBudget();
    @Property(selector = "setBudget:")
    public native void setBudget(@MachineSizedUInt long v);
    @Property(selector = "explorationParameter")
    public native @MachineSizedUInt long getExplorationParameter();
    @Property(selector = "setExplorationParameter:")
    public native void setExplorationParameter(@MachineSizedUInt long v);
    @Property(selector = "gameModel")
    public native GKGameModel getGameModel();
    @Property(selector = "setGameModel:")
    public native void setGameModel(GKGameModel v);
    @Property(selector = "randomSource")
    public native GKRandom getRandomSource();
    @Property(selector = "setRandomSource:")
    public native void setRandomSource(GKRandom v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "bestMoveForActivePlayer")
    public native GKGameModelUpdate bestMoveForActivePlayer();
    /*</methods>*/
}
