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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSUnitElectricPotentialDifference/*</name>*/ 
    extends /*<extends>*/NSDimension/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class NSUnitElectricPotentialDifferencePtr extends Ptr<NSUnitElectricPotentialDifference, NSUnitElectricPotentialDifferencePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSUnitElectricPotentialDifference.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NSUnitElectricPotentialDifference() {}
    protected NSUnitElectricPotentialDifference(Handle h, long handle) { super(h, handle); }
    protected NSUnitElectricPotentialDifference(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSymbol:converter:")
    public NSUnitElectricPotentialDifference(String symbol, NSUnitConverter converter) { super(symbol, converter); }
    @Method(selector = "initWithSymbol:")
    public NSUnitElectricPotentialDifference(String symbol) { super(symbol); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "megavolts")
    public static native NSUnitElectricPotentialDifference getMegavolts();
    @Property(selector = "kilovolts")
    public static native NSUnitElectricPotentialDifference getKilovolts();
    @Property(selector = "volts")
    public static native NSUnitElectricPotentialDifference getVolts();
    @Property(selector = "millivolts")
    public static native NSUnitElectricPotentialDifference getMillivolts();
    @Property(selector = "microvolts")
    public static native NSUnitElectricPotentialDifference getMicrovolts();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "baseUnit")
    public static native NSUnitElectricPotentialDifference getBaseUnit();
    /*</methods>*/
}
