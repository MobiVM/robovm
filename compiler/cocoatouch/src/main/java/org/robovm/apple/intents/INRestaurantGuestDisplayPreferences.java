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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INRestaurantGuestDisplayPreferences/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class INRestaurantGuestDisplayPreferencesPtr extends Ptr<INRestaurantGuestDisplayPreferences, INRestaurantGuestDisplayPreferencesPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INRestaurantGuestDisplayPreferences.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public INRestaurantGuestDisplayPreferences() {}
    protected INRestaurantGuestDisplayPreferences(Handle h, long handle) { super(h, handle); }
    protected INRestaurantGuestDisplayPreferences(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public INRestaurantGuestDisplayPreferences(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "nameFieldFirstNameOptional")
    public native boolean isNameFieldFirstNameOptional();
    @Property(selector = "setNameFieldFirstNameOptional:")
    public native void setNameFieldFirstNameOptional(boolean v);
    @Property(selector = "nameFieldLastNameOptional")
    public native boolean isNameFieldLastNameOptional();
    @Property(selector = "setNameFieldLastNameOptional:")
    public native void setNameFieldLastNameOptional(boolean v);
    @Property(selector = "nameFieldShouldBeDisplayed")
    public native boolean isNameFieldShouldBeDisplayed();
    @Property(selector = "setNameFieldShouldBeDisplayed:")
    public native void setNameFieldShouldBeDisplayed(boolean v);
    @Property(selector = "emailAddressFieldShouldBeDisplayed")
    public native boolean isEmailAddressFieldShouldBeDisplayed();
    @Property(selector = "setEmailAddressFieldShouldBeDisplayed:")
    public native void setEmailAddressFieldShouldBeDisplayed(boolean v);
    @Property(selector = "phoneNumberFieldShouldBeDisplayed")
    public native boolean isPhoneNumberFieldShouldBeDisplayed();
    @Property(selector = "setPhoneNumberFieldShouldBeDisplayed:")
    public native void setPhoneNumberFieldShouldBeDisplayed(boolean v);
    @Property(selector = "nameEditable")
    public native boolean isNameEditable();
    @Property(selector = "setNameEditable:")
    public native void setNameEditable(boolean v);
    @Property(selector = "emailAddressEditable")
    public native boolean isEmailAddressEditable();
    @Property(selector = "setEmailAddressEditable:")
    public native void setEmailAddressEditable(boolean v);
    @Property(selector = "phoneNumberEditable")
    public native boolean isPhoneNumberEditable();
    @Property(selector = "setPhoneNumberEditable:")
    public native void setPhoneNumberEditable(boolean v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
