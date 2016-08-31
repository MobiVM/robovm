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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSUnitVolume/*</name>*/ 
    extends /*<extends>*/NSDimension/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSUnitVolumePtr extends Ptr<NSUnitVolume, NSUnitVolumePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSUnitVolume.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSUnitVolume() {}
    protected NSUnitVolume(Handle h, long handle) { super(h, handle); }
    protected NSUnitVolume(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "megaliters")
    public static native NSUnitVolume getMegaliters();
    @Property(selector = "kiloliters")
    public static native NSUnitVolume getKiloliters();
    @Property(selector = "liters")
    public static native NSUnitVolume getLiters();
    @Property(selector = "deciliters")
    public static native NSUnitVolume getDeciliters();
    @Property(selector = "centiliters")
    public static native NSUnitVolume getCentiliters();
    @Property(selector = "milliliters")
    public static native NSUnitVolume getMilliliters();
    @Property(selector = "cubicKilometers")
    public static native NSUnitVolume getCubicKilometers();
    @Property(selector = "cubicMeters")
    public static native NSUnitVolume getCubicMeters();
    @Property(selector = "cubicDecimeters")
    public static native NSUnitVolume getCubicDecimeters();
    @Property(selector = "cubicCentimeters")
    public static native NSUnitVolume getCubicCentimeters();
    @Property(selector = "cubicMillimeters")
    public static native NSUnitVolume getCubicMillimeters();
    @Property(selector = "cubicInches")
    public static native NSUnitVolume getCubicInches();
    @Property(selector = "cubicFeet")
    public static native NSUnitVolume getCubicFeet();
    @Property(selector = "cubicYards")
    public static native NSUnitVolume getCubicYards();
    @Property(selector = "cubicMiles")
    public static native NSUnitVolume getCubicMiles();
    @Property(selector = "acreFeet")
    public static native NSUnitVolume getAcreFeet();
    @Property(selector = "bushels")
    public static native NSUnitVolume getBushels();
    @Property(selector = "teaspoons")
    public static native NSUnitVolume getTeaspoons();
    @Property(selector = "tablespoons")
    public static native NSUnitVolume getTablespoons();
    @Property(selector = "fluidOunces")
    public static native NSUnitVolume getFluidOunces();
    @Property(selector = "cups")
    public static native NSUnitVolume getCups();
    @Property(selector = "pints")
    public static native NSUnitVolume getPints();
    @Property(selector = "quarts")
    public static native NSUnitVolume getQuarts();
    @Property(selector = "gallons")
    public static native NSUnitVolume getGallons();
    @Property(selector = "imperialTeaspoons")
    public static native NSUnitVolume getImperialTeaspoons();
    @Property(selector = "imperialTablespoons")
    public static native NSUnitVolume getImperialTablespoons();
    @Property(selector = "imperialFluidOunces")
    public static native NSUnitVolume getImperialFluidOunces();
    @Property(selector = "imperialPints")
    public static native NSUnitVolume getImperialPints();
    @Property(selector = "imperialQuarts")
    public static native NSUnitVolume getImperialQuarts();
    @Property(selector = "imperialGallons")
    public static native NSUnitVolume getImperialGallons();
    @Property(selector = "metricCups")
    public static native NSUnitVolume getMetricCups();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
