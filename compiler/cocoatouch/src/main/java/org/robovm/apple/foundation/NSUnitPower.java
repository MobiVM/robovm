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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSUnitPower/*</name>*/ 
    extends /*<extends>*/NSDimension/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSUnitPowerPtr extends Ptr<NSUnitPower, NSUnitPowerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSUnitPower.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSUnitPower() {}
    protected NSUnitPower(Handle h, long handle) { super(h, handle); }
    protected NSUnitPower(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "terawatts")
    public static native NSUnitPower getTerawatts();
    @Property(selector = "gigawatts")
    public static native NSUnitPower getGigawatts();
    @Property(selector = "megawatts")
    public static native NSUnitPower getMegawatts();
    @Property(selector = "kilowatts")
    public static native NSUnitPower getKilowatts();
    @Property(selector = "watts")
    public static native NSUnitPower getWatts();
    @Property(selector = "milliwatts")
    public static native NSUnitPower getMilliwatts();
    @Property(selector = "microwatts")
    public static native NSUnitPower getMicrowatts();
    @Property(selector = "nanowatts")
    public static native NSUnitPower getNanowatts();
    @Property(selector = "picowatts")
    public static native NSUnitPower getPicowatts();
    @Property(selector = "femtowatts")
    public static native NSUnitPower getFemtowatts();
    @Property(selector = "horsepower")
    public static native NSUnitPower getHorsepower();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
