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
package org.robovm.apple.intents;

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
import org.robovm.apple.eventkit.*;
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("Intents")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INWorkoutNameIdentifier/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(INWorkoutNameIdentifier.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 10.2 and later.
     */
    @GlobalValue(symbol="INWorkoutNameIdentifierRun", optional=true)
    public static native NSString Run();
    /**
     * @since Available in iOS 10.2 and later.
     */
    @GlobalValue(symbol="INWorkoutNameIdentifierSit", optional=true)
    public static native NSString Sit();
    /**
     * @since Available in iOS 10.2 and later.
     */
    @GlobalValue(symbol="INWorkoutNameIdentifierSteps", optional=true)
    public static native NSString Steps();
    /**
     * @since Available in iOS 10.2 and later.
     */
    @GlobalValue(symbol="INWorkoutNameIdentifierStand", optional=true)
    public static native NSString Stand();
    /**
     * @since Available in iOS 10.2 and later.
     */
    @GlobalValue(symbol="INWorkoutNameIdentifierMove", optional=true)
    public static native NSString Move();
    /**
     * @since Available in iOS 10.2 and later.
     */
    @GlobalValue(symbol="INWorkoutNameIdentifierWalk", optional=true)
    public static native NSString Walk();
    /**
     * @since Available in iOS 10.2 and later.
     */
    @GlobalValue(symbol="INWorkoutNameIdentifierYoga", optional=true)
    public static native NSString Yoga();
    /**
     * @since Available in iOS 10.2 and later.
     */
    @GlobalValue(symbol="INWorkoutNameIdentifierDance", optional=true)
    public static native NSString Dance();
    /**
     * @since Available in iOS 10.2 and later.
     */
    @GlobalValue(symbol="INWorkoutNameIdentifierCrosstraining", optional=true)
    public static native NSString Crosstraining();
    /**
     * @since Available in iOS 10.2 and later.
     */
    @GlobalValue(symbol="INWorkoutNameIdentifierElliptical", optional=true)
    public static native NSString Elliptical();
    /**
     * @since Available in iOS 10.2 and later.
     */
    @GlobalValue(symbol="INWorkoutNameIdentifierRower", optional=true)
    public static native NSString Rower();
    /**
     * @since Available in iOS 10.2 and later.
     */
    @GlobalValue(symbol="INWorkoutNameIdentifierCycle", optional=true)
    public static native NSString Cycle();
    /**
     * @since Available in iOS 10.2 and later.
     */
    @GlobalValue(symbol="INWorkoutNameIdentifierStairs", optional=true)
    public static native NSString Stairs();
    /**
     * @since Available in iOS 10.2 and later.
     */
    @GlobalValue(symbol="INWorkoutNameIdentifierOther", optional=true)
    public static native NSString Other();
    /**
     * @since Available in iOS 10.2 and later.
     */
    @GlobalValue(symbol="INWorkoutNameIdentifierIndoorrun", optional=true)
    public static native NSString Indoorrun();
    /**
     * @since Available in iOS 10.2 and later.
     */
    @GlobalValue(symbol="INWorkoutNameIdentifierIndoorcycle", optional=true)
    public static native NSString Indoorcycle();
    /**
     * @since Available in iOS 10.2 and later.
     */
    @GlobalValue(symbol="INWorkoutNameIdentifierIndoorwalk", optional=true)
    public static native NSString Indoorwalk();
    /**
     * @since Available in iOS 10.2 and later.
     */
    @GlobalValue(symbol="INWorkoutNameIdentifierExercise", optional=true)
    public static native NSString Exercise();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @GlobalValue(symbol="INWorkoutNameIdentifierHike", optional=true)
    public static native NSString Hike();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @GlobalValue(symbol="INWorkoutNameIdentifierHighIntensityIntervalTraining", optional=true)
    public static native NSString HighIntensityIntervalTraining();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @GlobalValue(symbol="INWorkoutNameIdentifierSwim", optional=true)
    public static native NSString Swim();
    /*</methods>*/
}
