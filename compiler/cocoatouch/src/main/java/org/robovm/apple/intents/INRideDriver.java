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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INRideDriver/*</name>*/ 
    extends /*<extends>*/INPerson/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class INRideDriverPtr extends Ptr<INRideDriver, INRideDriverPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INRideDriver.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INRideDriver() {}
    protected INRideDriver(Handle h, long handle) { super(h, handle); }
    protected INRideDriver(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 10.2 and later.
     */
    @Method(selector = "initWithPhoneNumber:nameComponents:displayName:image:rating:")
    public INRideDriver(String phoneNumber, NSPersonNameComponents nameComponents, String displayName, INImage image, String rating) { super((SkipInit) null); initObject(init(phoneNumber, nameComponents, displayName, image, rating)); }
    @Method(selector = "initWithPersonHandle:nameComponents:displayName:image:contactIdentifier:customIdentifier:")
    public INRideDriver(INPersonHandle personHandle, NSPersonNameComponents nameComponents, String displayName, INImage image, String contactIdentifier, String customIdentifier) { super(personHandle, nameComponents, displayName, image, contactIdentifier, customIdentifier); }
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "initWithPersonHandle:nameComponents:displayName:image:contactIdentifier:customIdentifier:isMe:")
    public INRideDriver(INPersonHandle personHandle, NSPersonNameComponents nameComponents, String displayName, INImage image, String contactIdentifier, String customIdentifier, boolean isMe) { super(personHandle, nameComponents, displayName, image, contactIdentifier, customIdentifier, isMe); }
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 10.2. Use the designated initializer instead
     */
    @Deprecated
    @Method(selector = "initWithPersonHandle:nameComponents:displayName:image:rating:phoneNumber:")
    public static  INRideDriver create(INPersonHandle personHandle, NSPersonNameComponents nameComponents, String displayName, INImage image, String rating, String phoneNumber) {
       INRideDriver res = new INRideDriver((SkipInit) null);
       res.initObject(res.initWithPersonHandleNameComponentsDisplayNameImageRatingPhoneNumber(personHandle, nameComponents, displayName, image, rating, phoneNumber));
       return res;
    }
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 10.0. Use the designated initializer instead
     */
    @Deprecated
    @Method(selector = "initWithHandle:displayName:image:rating:phoneNumber:")
    public INRideDriver(String handle, String displayName, INImage image, String rating, String phoneNumber) { super((SkipInit) null); initObject(init(handle, displayName, image, rating, phoneNumber)); }
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 10.0. Use the designated initializer instead
     */
    @Deprecated
    @Method(selector = "initWithHandle:nameComponents:image:rating:phoneNumber:")
    public INRideDriver(String handle, NSPersonNameComponents nameComponents, INImage image, String rating, String phoneNumber) { super((SkipInit) null); initObject(init(handle, nameComponents, image, rating, phoneNumber)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "rating")
    public native String getRating();
    @Property(selector = "phoneNumber")
    public native String getPhoneNumber();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 10.2 and later.
     */
    @Method(selector = "initWithPhoneNumber:nameComponents:displayName:image:rating:")
    protected native @Pointer long init(String phoneNumber, NSPersonNameComponents nameComponents, String displayName, INImage image, String rating);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 10.2. Use the designated initializer instead
     */
    @Deprecated
    @Method(selector = "initWithPersonHandle:nameComponents:displayName:image:rating:phoneNumber:")
    protected native @Pointer long initWithPersonHandleNameComponentsDisplayNameImageRatingPhoneNumber(INPersonHandle personHandle, NSPersonNameComponents nameComponents, String displayName, INImage image, String rating, String phoneNumber);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 10.0. Use the designated initializer instead
     */
    @Deprecated
    @Method(selector = "initWithHandle:displayName:image:rating:phoneNumber:")
    protected native @Pointer long init(String handle, String displayName, INImage image, String rating, String phoneNumber);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 10.0. Use the designated initializer instead
     */
    @Deprecated
    @Method(selector = "initWithHandle:nameComponents:image:rating:phoneNumber:")
    protected native @Pointer long init(String handle, NSPersonNameComponents nameComponents, INImage image, String rating, String phoneNumber);
    /*</methods>*/
}
