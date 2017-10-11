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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GKVoronoiNoiseSource/*</name>*/ 
    extends /*<extends>*/GKNoiseSource/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GKVoronoiNoiseSourcePtr extends Ptr<GKVoronoiNoiseSource, GKVoronoiNoiseSourcePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GKVoronoiNoiseSource.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GKVoronoiNoiseSource() {}
    protected GKVoronoiNoiseSource(Handle h, long handle) { super(h, handle); }
    protected GKVoronoiNoiseSource(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrequency:displacement:distanceEnabled:seed:")
    public GKVoronoiNoiseSource(double frequency, double displacement, boolean distanceEnabled, int seed) { super((SkipInit) null); initObject(init(frequency, displacement, distanceEnabled, seed)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "frequency")
    public native double getFrequency();
    @Property(selector = "setFrequency:")
    public native void setFrequency(double v);
    @Property(selector = "displacement")
    public native double getDisplacement();
    @Property(selector = "setDisplacement:")
    public native void setDisplacement(double v);
    @Property(selector = "isDistanceEnabled")
    public native boolean isDistanceEnabled();
    @Property(selector = "setDistanceEnabled:")
    public native void setDistanceEnabled(boolean v);
    @Property(selector = "seed")
    public native int getSeed();
    @Property(selector = "setSeed:")
    public native void setSeed(int v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithFrequency:displacement:distanceEnabled:seed:")
    protected native @Pointer long init(double frequency, double displacement, boolean distanceEnabled, int seed);
    /*</methods>*/
}
