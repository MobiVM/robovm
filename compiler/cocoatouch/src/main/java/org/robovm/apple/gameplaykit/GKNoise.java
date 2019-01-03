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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GKNoise/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GKNoisePtr extends Ptr<GKNoise, GKNoisePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GKNoise.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GKNoise() {}
    protected GKNoise(Handle h, long handle) { super(h, handle); }
    protected GKNoise(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithNoiseSource:")
    public GKNoise(GKNoiseSource noiseSource) { super((SkipInit) null); initObject(init(noiseSource)); }
    @Method(selector = "initWithNoiseSource:gradientColors:")
    public GKNoise(GKNoiseSource noiseSource, NSDictionary<NSNumber, UIColor> gradientColors) { super((SkipInit) null); initObject(init(noiseSource, gradientColors)); }
    public GKNoise(NSArray<GKNoise> noises, GKNoise selectionNoise) { super((Handle) null, create(noises, selectionNoise)); retain(getHandle()); }
    public GKNoise(NSArray<GKNoise> noises, GKNoise selectionNoise, NSArray<NSNumber> componentBoundaries, NSArray<NSNumber> blendDistances) { super((Handle) null, create(noises, selectionNoise, componentBoundaries, blendDistances)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "gradientColors")
    public native NSDictionary<NSNumber, UIColor> getGradientColors();
    @Property(selector = "setGradientColors:")
    public native void setGradientColors(NSDictionary<NSNumber, UIColor> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithNoiseSource:")
    protected native @Pointer long init(GKNoiseSource noiseSource);
    @Method(selector = "initWithNoiseSource:gradientColors:")
    protected native @Pointer long init(GKNoiseSource noiseSource, NSDictionary<NSNumber, UIColor> gradientColors);
    @Method(selector = "valueAtPosition:")
    public native float valueAtPosition(@ByVal VectorFloat2 position);
    @Method(selector = "applyAbsoluteValue")
    public native void applyAbsoluteValue();
    @Method(selector = "clampWithLowerBound:upperBound:")
    public native void clamp(double lowerBound, double upperBound);
    @Method(selector = "raiseToPower:")
    public native void raiseToPower(double power);
    @Method(selector = "invert")
    public native void invert();
    @Method(selector = "applyTurbulenceWithFrequency:power:roughness:seed:")
    public native void applyTurbulence(double frequency, double power, int roughness, int seed);
    @Method(selector = "remapValuesToCurveWithControlPoints:")
    public native void remapValuesToCurve(NSDictionary<NSNumber, NSNumber> controlPoints);
    @Method(selector = "remapValuesToTerracesWithPeaks:terracesInverted:")
    public native void remapValuesToTerraces(NSArray<NSNumber> peakInputValues, boolean inverted);
    @Method(selector = "moveBy:")
    public native void moveBy(FunctionPtr delta);
    @Method(selector = "scaleBy:")
    public native void scaleBy(FunctionPtr factor);
    @Method(selector = "rotateBy:")
    public native void rotateBy(FunctionPtr radians);
    @Method(selector = "addWithNoise:")
    public native void add(GKNoise noise);
    @Method(selector = "multiplyWithNoise:")
    public native void multiply(GKNoise noise);
    @Method(selector = "minimumWithNoise:")
    public native void minimum(GKNoise noise);
    @Method(selector = "maximumWithNoise:")
    public native void maximum(GKNoise noise);
    @Method(selector = "raiseToPowerWithNoise:")
    public native void raiseToPower(GKNoise noise);
    @Method(selector = "displaceXWithNoise:yWithNoise:zWithNoise:")
    public native void displaceX(GKNoise xDisplacementNoise, GKNoise yDisplacementNoise, GKNoise zDisplacementNoise);
    @Method(selector = "noiseWithComponentNoises:selectionNoise:")
    protected static native @Pointer long create(NSArray<GKNoise> noises, GKNoise selectionNoise);
    @Method(selector = "noiseWithComponentNoises:selectionNoise:componentBoundaries:boundaryBlendDistances:")
    protected static native @Pointer long create(NSArray<GKNoise> noises, GKNoise selectionNoise, NSArray<NSNumber> componentBoundaries, NSArray<NSNumber> blendDistances);
    /*</methods>*/
}
