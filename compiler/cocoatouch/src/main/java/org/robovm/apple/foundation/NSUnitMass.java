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
package org.robovm.apple.foundation;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.security.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSUnitMass/*</name>*/ 
    extends /*<extends>*/NSDimension/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSUnitMassPtr extends Ptr<NSUnitMass, NSUnitMassPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSUnitMass.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSUnitMass() {}
    protected NSUnitMass(Handle h, long handle) { super(h, handle); }
    protected NSUnitMass(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "kilograms")
    public static native NSUnitMass getKilograms();
    @Property(selector = "grams")
    public static native NSUnitMass getGrams();
    @Property(selector = "decigrams")
    public static native NSUnitMass getDecigrams();
    @Property(selector = "centigrams")
    public static native NSUnitMass getCentigrams();
    @Property(selector = "milligrams")
    public static native NSUnitMass getMilligrams();
    @Property(selector = "micrograms")
    public static native NSUnitMass getMicrograms();
    @Property(selector = "nanograms")
    public static native NSUnitMass getNanograms();
    @Property(selector = "picograms")
    public static native NSUnitMass getPicograms();
    @Property(selector = "ounces")
    public static native NSUnitMass getOunces();
    @Property(selector = "poundsMass")
    public static native NSUnitMass getPoundsMass();
    @Property(selector = "stones")
    public static native NSUnitMass getStones();
    @Property(selector = "metricTons")
    public static native NSUnitMass getMetricTons();
    @Property(selector = "shortTons")
    public static native NSUnitMass getShortTons();
    @Property(selector = "carats")
    public static native NSUnitMass getCarats();
    @Property(selector = "ouncesTroy")
    public static native NSUnitMass getOuncesTroy();
    @Property(selector = "slugs")
    public static native NSUnitMass getSlugs();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
