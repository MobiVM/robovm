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
package org.robovm.apple.intents;

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
import org.robovm.apple.eventkit.*;
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INPriceRange/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class INPriceRangePtr extends Ptr<INPriceRange, INPriceRangePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INPriceRange.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INPriceRange() {}
    protected INPriceRange(Handle h, long handle) { super(h, handle); }
    protected INPriceRange(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithRangeBetweenPrice:andPrice:currencyCode:")
    public INPriceRange(NSDecimalNumber firstPrice, NSDecimalNumber secondPrice, String currencyCode) { super((SkipInit) null); initObject(init(firstPrice, secondPrice, currencyCode)); }
    @Method(selector = "initWithMaximumPrice:currencyCode:")
    public static  INPriceRange createWithMaximumPrice(NSDecimalNumber maximumPrice, String currencyCode) {
       INPriceRange res = new INPriceRange((SkipInit) null);
       res.initObject(res.initWithMaximumPrice(maximumPrice, currencyCode));
       return res;
    }
    @Method(selector = "initWithMinimumPrice:currencyCode:")
    public static  INPriceRange createWithMinimumPrice(NSDecimalNumber minimumPrice, String currencyCode) {
       INPriceRange res = new INPriceRange((SkipInit) null);
       res.initObject(res.initWithMinimumPrice(minimumPrice, currencyCode));
       return res;
    }
    @Method(selector = "initWithPrice:currencyCode:")
    public INPriceRange(NSDecimalNumber price, String currencyCode) { super((SkipInit) null); initObject(init(price, currencyCode)); }
    @Method(selector = "initWithCoder:")
    public INPriceRange(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "minimumPrice")
    public native NSDecimalNumber getMinimumPrice();
    @Property(selector = "maximumPrice")
    public native NSDecimalNumber getMaximumPrice();
    @Property(selector = "currencyCode")
    public native String getCurrencyCode();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithRangeBetweenPrice:andPrice:currencyCode:")
    protected native @Pointer long init(NSDecimalNumber firstPrice, NSDecimalNumber secondPrice, String currencyCode);
    @Method(selector = "initWithMaximumPrice:currencyCode:")
    protected native @Pointer long initWithMaximumPrice(NSDecimalNumber maximumPrice, String currencyCode);
    @Method(selector = "initWithMinimumPrice:currencyCode:")
    protected native @Pointer long initWithMinimumPrice(NSDecimalNumber minimumPrice, String currencyCode);
    @Method(selector = "initWithPrice:currencyCode:")
    protected native @Pointer long init(NSDecimalNumber price, String currencyCode);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
