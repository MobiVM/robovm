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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INRestaurantGuest/*</name>*/ 
    extends /*<extends>*/INPerson/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INRestaurantGuestPtr extends Ptr<INRestaurantGuest, INRestaurantGuestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INRestaurantGuest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INRestaurantGuest() {}
    protected INRestaurantGuest(Handle h, long handle) { super(h, handle); }
    protected INRestaurantGuest(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithNameComponents:phoneNumber:emailAddress:")
    public INRestaurantGuest(NSPersonNameComponents nameComponents, String phoneNumber, String emailAddress) { super((SkipInit) null); initObject(init(nameComponents, phoneNumber, emailAddress)); }
    @Method(selector = "initWithPersonHandle:nameComponents:displayName:image:contactIdentifier:customIdentifier:")
    public INRestaurantGuest(INPersonHandle personHandle, NSPersonNameComponents nameComponents, String displayName, INImage image, String contactIdentifier, String customIdentifier) { super(personHandle, nameComponents, displayName, image, contactIdentifier, customIdentifier); }
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "initWithPersonHandle:nameComponents:displayName:image:contactIdentifier:customIdentifier:isMe:")
    public INRestaurantGuest(INPersonHandle personHandle, NSPersonNameComponents nameComponents, String displayName, INImage image, String contactIdentifier, String customIdentifier, boolean isMe) { super(personHandle, nameComponents, displayName, image, contactIdentifier, customIdentifier, isMe); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "phoneNumber")
    public native String getPhoneNumber();
    @Property(selector = "setPhoneNumber:")
    public native void setPhoneNumber(String v);
    @Property(selector = "emailAddress")
    public native String getEmailAddress();
    @Property(selector = "setEmailAddress:")
    public native void setEmailAddress(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithNameComponents:phoneNumber:emailAddress:")
    protected native @Pointer long init(NSPersonNameComponents nameComponents, String phoneNumber, String emailAddress);
    /*</methods>*/
}
