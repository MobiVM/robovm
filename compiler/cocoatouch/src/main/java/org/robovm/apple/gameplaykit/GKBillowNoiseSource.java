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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GKBillowNoiseSource/*</name>*/ 
    extends /*<extends>*/GKCoherentNoiseSource/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GKBillowNoiseSourcePtr extends Ptr<GKBillowNoiseSource, GKBillowNoiseSourcePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GKBillowNoiseSource.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GKBillowNoiseSource() {}
    protected GKBillowNoiseSource(Handle h, long handle) { super(h, handle); }
    protected GKBillowNoiseSource(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrequency:octaveCount:persistence:lacunarity:seed:")
    public GKBillowNoiseSource(double frequency, @MachineSizedSInt long octaveCount, double persistence, double lacunarity, int seed) { super((SkipInit) null); initObject(init(frequency, octaveCount, persistence, lacunarity, seed)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "persistence")
    public native double getPersistence();
    @Property(selector = "setPersistence:")
    public native void setPersistence(double v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithFrequency:octaveCount:persistence:lacunarity:seed:")
    protected native @Pointer long init(double frequency, @MachineSizedSInt long octaveCount, double persistence, double lacunarity, int seed);
    /*</methods>*/
}
