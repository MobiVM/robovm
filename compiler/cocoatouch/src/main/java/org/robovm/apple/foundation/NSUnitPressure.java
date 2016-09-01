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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSUnitPressure/*</name>*/ 
    extends /*<extends>*/NSDimension/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSUnitPressurePtr extends Ptr<NSUnitPressure, NSUnitPressurePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSUnitPressure.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSUnitPressure() {}
    protected NSUnitPressure(Handle h, long handle) { super(h, handle); }
    protected NSUnitPressure(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "newtonsPerMetersSquared")
    public static native NSUnitPressure getNewtonsPerMetersSquared();
    @Property(selector = "gigapascals")
    public static native NSUnitPressure getGigapascals();
    @Property(selector = "megapascals")
    public static native NSUnitPressure getMegapascals();
    @Property(selector = "kilopascals")
    public static native NSUnitPressure getKilopascals();
    @Property(selector = "hectopascals")
    public static native NSUnitPressure getHectopascals();
    @Property(selector = "inchesOfMercury")
    public static native NSUnitPressure getInchesOfMercury();
    @Property(selector = "bars")
    public static native NSUnitPressure getBars();
    @Property(selector = "millibars")
    public static native NSUnitPressure getMillibars();
    @Property(selector = "millimetersOfMercury")
    public static native NSUnitPressure getMillimetersOfMercury();
    @Property(selector = "poundsForcePerSquareInch")
    public static native NSUnitPressure getPoundsForcePerSquareInch();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
