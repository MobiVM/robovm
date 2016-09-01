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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSUnitLength/*</name>*/ 
    extends /*<extends>*/NSDimension/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSUnitLengthPtr extends Ptr<NSUnitLength, NSUnitLengthPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSUnitLength.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSUnitLength() {}
    protected NSUnitLength(Handle h, long handle) { super(h, handle); }
    protected NSUnitLength(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "megameters")
    public static native NSUnitLength getMegameters();
    @Property(selector = "kilometers")
    public static native NSUnitLength getKilometers();
    @Property(selector = "hectometers")
    public static native NSUnitLength getHectometers();
    @Property(selector = "decameters")
    public static native NSUnitLength getDecameters();
    @Property(selector = "meters")
    public static native NSUnitLength getMeters();
    @Property(selector = "decimeters")
    public static native NSUnitLength getDecimeters();
    @Property(selector = "centimeters")
    public static native NSUnitLength getCentimeters();
    @Property(selector = "millimeters")
    public static native NSUnitLength getMillimeters();
    @Property(selector = "micrometers")
    public static native NSUnitLength getMicrometers();
    @Property(selector = "nanometers")
    public static native NSUnitLength getNanometers();
    @Property(selector = "picometers")
    public static native NSUnitLength getPicometers();
    @Property(selector = "inches")
    public static native NSUnitLength getInches();
    @Property(selector = "feet")
    public static native NSUnitLength getFeet();
    @Property(selector = "yards")
    public static native NSUnitLength getYards();
    @Property(selector = "miles")
    public static native NSUnitLength getMiles();
    @Property(selector = "scandinavianMiles")
    public static native NSUnitLength getScandinavianMiles();
    @Property(selector = "lightyears")
    public static native NSUnitLength getLightyears();
    @Property(selector = "nauticalMiles")
    public static native NSUnitLength getNauticalMiles();
    @Property(selector = "fathoms")
    public static native NSUnitLength getFathoms();
    @Property(selector = "furlongs")
    public static native NSUnitLength getFurlongs();
    @Property(selector = "astronomicalUnits")
    public static native NSUnitLength getAstronomicalUnits();
    @Property(selector = "parsecs")
    public static native NSUnitLength getParsecs();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
