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
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSUnitInformationStorage/*</name>*/ 
    extends /*<extends>*/NSDimension/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class NSUnitInformationStoragePtr extends Ptr<NSUnitInformationStorage, NSUnitInformationStoragePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSUnitInformationStorage.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NSUnitInformationStorage() {}
    protected NSUnitInformationStorage(Handle h, long handle) { super(h, handle); }
    protected NSUnitInformationStorage(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSymbol:converter:")
    public NSUnitInformationStorage(String symbol, NSUnitConverter converter) { super(symbol, converter); }
    @Method(selector = "initWithSymbol:")
    public NSUnitInformationStorage(String symbol) { super(symbol); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "bytes")
    public static native NSUnitInformationStorage getBytes();
    @Property(selector = "bits")
    public static native NSUnitInformationStorage getBits();
    @Property(selector = "nibbles")
    public static native NSUnitInformationStorage getNibbles();
    @Property(selector = "yottabytes")
    public static native NSUnitInformationStorage getYottabytes();
    @Property(selector = "zettabytes")
    public static native NSUnitInformationStorage getZettabytes();
    @Property(selector = "exabytes")
    public static native NSUnitInformationStorage getExabytes();
    @Property(selector = "petabytes")
    public static native NSUnitInformationStorage getPetabytes();
    @Property(selector = "terabytes")
    public static native NSUnitInformationStorage getTerabytes();
    @Property(selector = "gigabytes")
    public static native NSUnitInformationStorage getGigabytes();
    @Property(selector = "megabytes")
    public static native NSUnitInformationStorage getMegabytes();
    @Property(selector = "kilobytes")
    public static native NSUnitInformationStorage getKilobytes();
    @Property(selector = "yottabits")
    public static native NSUnitInformationStorage getYottabits();
    @Property(selector = "zettabits")
    public static native NSUnitInformationStorage getZettabits();
    @Property(selector = "exabits")
    public static native NSUnitInformationStorage getExabits();
    @Property(selector = "petabits")
    public static native NSUnitInformationStorage getPetabits();
    @Property(selector = "terabits")
    public static native NSUnitInformationStorage getTerabits();
    @Property(selector = "gigabits")
    public static native NSUnitInformationStorage getGigabits();
    @Property(selector = "megabits")
    public static native NSUnitInformationStorage getMegabits();
    @Property(selector = "kilobits")
    public static native NSUnitInformationStorage getKilobits();
    @Property(selector = "yobibytes")
    public static native NSUnitInformationStorage getYobibytes();
    @Property(selector = "zebibytes")
    public static native NSUnitInformationStorage getZebibytes();
    @Property(selector = "exbibytes")
    public static native NSUnitInformationStorage getExbibytes();
    @Property(selector = "pebibytes")
    public static native NSUnitInformationStorage getPebibytes();
    @Property(selector = "tebibytes")
    public static native NSUnitInformationStorage getTebibytes();
    @Property(selector = "gibibytes")
    public static native NSUnitInformationStorage getGibibytes();
    @Property(selector = "mebibytes")
    public static native NSUnitInformationStorage getMebibytes();
    @Property(selector = "kibibytes")
    public static native NSUnitInformationStorage getKibibytes();
    @Property(selector = "yobibits")
    public static native NSUnitInformationStorage getYobibits();
    @Property(selector = "zebibits")
    public static native NSUnitInformationStorage getZebibits();
    @Property(selector = "exbibits")
    public static native NSUnitInformationStorage getExbibits();
    @Property(selector = "pebibits")
    public static native NSUnitInformationStorage getPebibits();
    @Property(selector = "tebibits")
    public static native NSUnitInformationStorage getTebibits();
    @Property(selector = "gibibits")
    public static native NSUnitInformationStorage getGibibits();
    @Property(selector = "mebibits")
    public static native NSUnitInformationStorage getMebibits();
    @Property(selector = "kibibits")
    public static native NSUnitInformationStorage getKibibits();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "baseUnit")
    public static native NSUnitInformationStorage getBaseUnit();
    /*</methods>*/
}
