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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSUnitFrequency/*</name>*/ 
    extends /*<extends>*/NSDimension/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class NSUnitFrequencyPtr extends Ptr<NSUnitFrequency, NSUnitFrequencyPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSUnitFrequency.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NSUnitFrequency() {}
    protected NSUnitFrequency(Handle h, long handle) { super(h, handle); }
    protected NSUnitFrequency(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSymbol:converter:")
    public NSUnitFrequency(String symbol, NSUnitConverter converter) { super(symbol, converter); }
    @Method(selector = "initWithSymbol:")
    public NSUnitFrequency(String symbol) { super(symbol); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "terahertz")
    public static native NSUnitFrequency getTerahertz();
    @Property(selector = "gigahertz")
    public static native NSUnitFrequency getGigahertz();
    @Property(selector = "megahertz")
    public static native NSUnitFrequency getMegahertz();
    @Property(selector = "kilohertz")
    public static native NSUnitFrequency getKilohertz();
    @Property(selector = "hertz")
    public static native NSUnitFrequency getHertz();
    @Property(selector = "millihertz")
    public static native NSUnitFrequency getMillihertz();
    @Property(selector = "microhertz")
    public static native NSUnitFrequency getMicrohertz();
    @Property(selector = "nanohertz")
    public static native NSUnitFrequency getNanohertz();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "framesPerSecond")
    public static native NSUnitFrequency getFramesPerSecond();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "baseUnit")
    public static native NSUnitFrequency getBaseUnit();
    /*</methods>*/
}
