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
package org.robovm.apple.uikit;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.cloudkit.*;
import org.robovm.apple.fileprovider.*;
import org.robovm.apple.intents.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/UITextContentType/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UITextContentType/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/UITextContentType/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static UITextContentType toObject(Class<UITextContentType> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return UITextContentType.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(UITextContentType o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<UITextContentType> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<UITextContentType> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(UITextContentType.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<UITextContentType> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (UITextContentType o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final UITextContentType Name = new UITextContentType("Name");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final UITextContentType NamePrefix = new UITextContentType("NamePrefix");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final UITextContentType GivenName = new UITextContentType("GivenName");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final UITextContentType MiddleName = new UITextContentType("MiddleName");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final UITextContentType FamilyName = new UITextContentType("FamilyName");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final UITextContentType NameSuffix = new UITextContentType("NameSuffix");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final UITextContentType Nickname = new UITextContentType("Nickname");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final UITextContentType JobTitle = new UITextContentType("JobTitle");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final UITextContentType OrganizationName = new UITextContentType("OrganizationName");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final UITextContentType Location = new UITextContentType("Location");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final UITextContentType FullStreetAddress = new UITextContentType("FullStreetAddress");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final UITextContentType StreetAddressLine1 = new UITextContentType("StreetAddressLine1");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final UITextContentType StreetAddressLine2 = new UITextContentType("StreetAddressLine2");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final UITextContentType AddressCity = new UITextContentType("AddressCity");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final UITextContentType AddressState = new UITextContentType("AddressState");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final UITextContentType AddressCityAndState = new UITextContentType("AddressCityAndState");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final UITextContentType Sublocality = new UITextContentType("Sublocality");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final UITextContentType CountryName = new UITextContentType("CountryName");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final UITextContentType PostalCode = new UITextContentType("PostalCode");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final UITextContentType TelephoneNumber = new UITextContentType("TelephoneNumber");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final UITextContentType EmailAddress = new UITextContentType("EmailAddress");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final UITextContentType URL = new UITextContentType("URL");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final UITextContentType CreditCardNumber = new UITextContentType("CreditCardNumber");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final UITextContentType Username = new UITextContentType("Username");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final UITextContentType Password = new UITextContentType("Password");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final UITextContentType NewPassword = new UITextContentType("NewPassword");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final UITextContentType OneTimeCode = new UITextContentType("OneTimeCode");
    /*</constants>*/
    
    private static /*<name>*/UITextContentType/*</name>*/[] values = new /*<name>*/UITextContentType/*</name>*/[] {/*<value_list>*/Name, NamePrefix, GivenName, MiddleName, FamilyName, NameSuffix, Nickname, JobTitle, OrganizationName, Location, FullStreetAddress, StreetAddressLine1, StreetAddressLine2, AddressCity, AddressState, AddressCityAndState, Sublocality, CountryName, PostalCode, TelephoneNumber, EmailAddress, URL, CreditCardNumber, Username, Password, NewPassword, OneTimeCode/*</value_list>*/};
    
    /*<name>*/UITextContentType/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/UITextContentType/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/UITextContentType/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/UITextContentType/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("UIKit") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="UITextContentTypeName", optional=true)
        public static native NSString Name();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="UITextContentTypeNamePrefix", optional=true)
        public static native NSString NamePrefix();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="UITextContentTypeGivenName", optional=true)
        public static native NSString GivenName();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="UITextContentTypeMiddleName", optional=true)
        public static native NSString MiddleName();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="UITextContentTypeFamilyName", optional=true)
        public static native NSString FamilyName();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="UITextContentTypeNameSuffix", optional=true)
        public static native NSString NameSuffix();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="UITextContentTypeNickname", optional=true)
        public static native NSString Nickname();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="UITextContentTypeJobTitle", optional=true)
        public static native NSString JobTitle();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="UITextContentTypeOrganizationName", optional=true)
        public static native NSString OrganizationName();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="UITextContentTypeLocation", optional=true)
        public static native NSString Location();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="UITextContentTypeFullStreetAddress", optional=true)
        public static native NSString FullStreetAddress();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="UITextContentTypeStreetAddressLine1", optional=true)
        public static native NSString StreetAddressLine1();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="UITextContentTypeStreetAddressLine2", optional=true)
        public static native NSString StreetAddressLine2();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="UITextContentTypeAddressCity", optional=true)
        public static native NSString AddressCity();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="UITextContentTypeAddressState", optional=true)
        public static native NSString AddressState();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="UITextContentTypeAddressCityAndState", optional=true)
        public static native NSString AddressCityAndState();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="UITextContentTypeSublocality", optional=true)
        public static native NSString Sublocality();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="UITextContentTypeCountryName", optional=true)
        public static native NSString CountryName();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="UITextContentTypePostalCode", optional=true)
        public static native NSString PostalCode();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="UITextContentTypeTelephoneNumber", optional=true)
        public static native NSString TelephoneNumber();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="UITextContentTypeEmailAddress", optional=true)
        public static native NSString EmailAddress();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="UITextContentTypeURL", optional=true)
        public static native NSString URL();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="UITextContentTypeCreditCardNumber", optional=true)
        public static native NSString CreditCardNumber();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="UITextContentTypeUsername", optional=true)
        public static native NSString Username();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="UITextContentTypePassword", optional=true)
        public static native NSString Password();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="UITextContentTypeNewPassword", optional=true)
        public static native NSString NewPassword();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="UITextContentTypeOneTimeCode", optional=true)
        public static native NSString OneTimeCode();
        /*</values>*/
    }
}
