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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GKNoiseMap/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GKNoiseMapPtr extends Ptr<GKNoiseMap, GKNoiseMapPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GKNoiseMap.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GKNoiseMap() {}
    protected GKNoiseMap(Handle h, long handle) { super(h, handle); }
    protected GKNoiseMap(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithNoise:")
    public GKNoiseMap(GKNoise noise) { super((SkipInit) null); initObject(init(noise)); }
    @Method(selector = "initWithNoise:size:origin:sampleCount:seamless:")
    public GKNoiseMap(GKNoise noise, FunctionPtr size, FunctionPtr origin, @ByVal VectorInt2 sampleCount, boolean seamless) { super((SkipInit) null); initObject(init(noise, size, origin, sampleCount, seamless)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "size")
    public native FunctionPtr getSize();
    @Property(selector = "origin")
    public native FunctionPtr getOrigin();
    @Property(selector = "sampleCount")
    public native @ByVal VectorInt2 getSampleCount();
    @Property(selector = "isSeamless")
    public native boolean isSeamless();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithNoise:")
    protected native @Pointer long init(GKNoise noise);
    @Method(selector = "initWithNoise:size:origin:sampleCount:seamless:")
    protected native @Pointer long init(GKNoise noise, FunctionPtr size, FunctionPtr origin, @ByVal VectorInt2 sampleCount, boolean seamless);
    @Method(selector = "valueAtPosition:")
    public native float valueAtPosition(@ByVal VectorInt2 position);
    @Method(selector = "interpolatedValueAtPosition:")
    public native float interpolatedValueAtPosition(@ByVal VectorFloat2 position);
    @Method(selector = "setValue:atPosition:")
    public native void setValueAtPosition(float value, @ByVal VectorInt2 position);
    /*</methods>*/
}
