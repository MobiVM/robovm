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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSUnitArea/*</name>*/ 
    extends /*<extends>*/NSDimension/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSUnitAreaPtr extends Ptr<NSUnitArea, NSUnitAreaPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSUnitArea.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSUnitArea() {}
    protected NSUnitArea(Handle h, long handle) { super(h, handle); }
    protected NSUnitArea(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "squareMegameters")
    public static native NSUnitArea getSquareMegameters();
    @Property(selector = "squareKilometers")
    public static native NSUnitArea getSquareKilometers();
    @Property(selector = "squareMeters")
    public static native NSUnitArea getSquareMeters();
    @Property(selector = "squareCentimeters")
    public static native NSUnitArea getSquareCentimeters();
    @Property(selector = "squareMillimeters")
    public static native NSUnitArea getSquareMillimeters();
    @Property(selector = "squareMicrometers")
    public static native NSUnitArea getSquareMicrometers();
    @Property(selector = "squareNanometers")
    public static native NSUnitArea getSquareNanometers();
    @Property(selector = "squareInches")
    public static native NSUnitArea getSquareInches();
    @Property(selector = "squareFeet")
    public static native NSUnitArea getSquareFeet();
    @Property(selector = "squareYards")
    public static native NSUnitArea getSquareYards();
    @Property(selector = "squareMiles")
    public static native NSUnitArea getSquareMiles();
    @Property(selector = "acres")
    public static native NSUnitArea getAcres();
    @Property(selector = "ares")
    public static native NSUnitArea getAres();
    @Property(selector = "hectares")
    public static native NSUnitArea getHectares();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
