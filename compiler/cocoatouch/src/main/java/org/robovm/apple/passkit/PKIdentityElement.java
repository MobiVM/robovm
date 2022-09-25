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
package org.robovm.apple.passkit;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.addressbook.*;
import org.robovm.apple.contacts.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("PassKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PKIdentityElement/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PKIdentityElementPtr extends Ptr<PKIdentityElement, PKIdentityElementPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PKIdentityElement.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected PKIdentityElement() {}
    protected PKIdentityElement(Handle h, long handle) { super(h, handle); }
    protected PKIdentityElement(SkipInit skipInit) { super(skipInit); }
    public PKIdentityElement(@MachineSizedSInt long age) { super((Handle) null, create(age)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "givenNameElement")
    public static native PKIdentityElement getGivenNameElement();
    @Property(selector = "familyNameElement")
    public static native PKIdentityElement getFamilyNameElement();
    @Property(selector = "portraitElement")
    public static native PKIdentityElement getPortraitElement();
    @Property(selector = "addressElement")
    public static native PKIdentityElement getAddressElement();
    @Property(selector = "issuingAuthorityElement")
    public static native PKIdentityElement getIssuingAuthorityElement();
    @Property(selector = "documentIssueDateElement")
    public static native PKIdentityElement getDocumentIssueDateElement();
    @Property(selector = "documentExpirationDateElement")
    public static native PKIdentityElement getDocumentExpirationDateElement();
    @Property(selector = "documentNumberElement")
    public static native PKIdentityElement getDocumentNumberElement();
    @Property(selector = "drivingPrivilegesElement")
    public static native PKIdentityElement getDrivingPrivilegesElement();
    @Property(selector = "ageElement")
    public static native PKIdentityElement getAgeElement();
    @Property(selector = "dateOfBirthElement")
    public static native PKIdentityElement getDateOfBirthElement();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "ageThresholdElementWithAge:")
    protected static native @Pointer long create(@MachineSizedSInt long age);
    /*</methods>*/
}
