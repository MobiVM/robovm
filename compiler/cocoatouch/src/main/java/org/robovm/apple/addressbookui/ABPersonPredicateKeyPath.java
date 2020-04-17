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
package org.robovm.apple.addressbookui;

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
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("AddressBookUI") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/ABPersonPredicateKeyPath/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ABPersonPredicateKeyPath/*</name>*/ 
    extends /*<extends>*/NSPredicateKeyPath/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/ABPersonPredicateKeyPath/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static ABPersonPredicateKeyPath toObject(Class<ABPersonPredicateKeyPath> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return ABPersonPredicateKeyPath.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(ABPersonPredicateKeyPath o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<ABPersonPredicateKeyPath> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<ABPersonPredicateKeyPath> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(ABPersonPredicateKeyPath.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<ABPersonPredicateKeyPath> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (ABPersonPredicateKeyPath o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final ABPersonPredicateKeyPath NamePrefix = new ABPersonPredicateKeyPath("NamePrefix");
    public static final ABPersonPredicateKeyPath GivenName = new ABPersonPredicateKeyPath("GivenName");
    public static final ABPersonPredicateKeyPath MiddleName = new ABPersonPredicateKeyPath("MiddleName");
    public static final ABPersonPredicateKeyPath FamilyName = new ABPersonPredicateKeyPath("FamilyName");
    public static final ABPersonPredicateKeyPath NameSuffix = new ABPersonPredicateKeyPath("NameSuffix");
    public static final ABPersonPredicateKeyPath PreviousFamilyName = new ABPersonPredicateKeyPath("PreviousFamilyName");
    public static final ABPersonPredicateKeyPath Nickname = new ABPersonPredicateKeyPath("Nickname");
    public static final ABPersonPredicateKeyPath PhoneticGivenName = new ABPersonPredicateKeyPath("PhoneticGivenName");
    public static final ABPersonPredicateKeyPath PhoneticMiddleName = new ABPersonPredicateKeyPath("PhoneticMiddleName");
    public static final ABPersonPredicateKeyPath PhoneticFamilyName = new ABPersonPredicateKeyPath("PhoneticFamilyName");
    public static final ABPersonPredicateKeyPath OrganizationName = new ABPersonPredicateKeyPath("OrganizationName");
    public static final ABPersonPredicateKeyPath DepartmentName = new ABPersonPredicateKeyPath("DepartmentName");
    public static final ABPersonPredicateKeyPath JobTitle = new ABPersonPredicateKeyPath("JobTitle");
    public static final ABPersonPredicateKeyPath Birthday = new ABPersonPredicateKeyPath("Birthday");
    public static final ABPersonPredicateKeyPath Note = new ABPersonPredicateKeyPath("Note");
    public static final ABPersonPredicateKeyPath PhoneNumbers = new ABPersonPredicateKeyPath("PhoneNumbers");
    public static final ABPersonPredicateKeyPath EmailAddresses = new ABPersonPredicateKeyPath("EmailAddresses");
    public static final ABPersonPredicateKeyPath UrlAddresses = new ABPersonPredicateKeyPath("UrlAddresses");
    public static final ABPersonPredicateKeyPath Dates = new ABPersonPredicateKeyPath("Dates");
    public static final ABPersonPredicateKeyPath InstantMessageAddresses = new ABPersonPredicateKeyPath("InstantMessageAddresses");
    public static final ABPersonPredicateKeyPath RelatedNames = new ABPersonPredicateKeyPath("RelatedNames");
    public static final ABPersonPredicateKeyPath SocialProfiles = new ABPersonPredicateKeyPath("SocialProfiles");
    public static final ABPersonPredicateKeyPath PostalAddresses = new ABPersonPredicateKeyPath("PostalAddresses");
    /*</constants>*/
    
    private static /*<name>*/ABPersonPredicateKeyPath/*</name>*/[] values = new /*<name>*/ABPersonPredicateKeyPath/*</name>*/[] {/*<value_list>*/NamePrefix, GivenName, MiddleName, FamilyName, NameSuffix, PreviousFamilyName, Nickname, PhoneticGivenName, PhoneticMiddleName, PhoneticFamilyName, OrganizationName, DepartmentName, JobTitle, Birthday, Note, PhoneNumbers, EmailAddresses, UrlAddresses, Dates, InstantMessageAddresses, RelatedNames, SocialProfiles, PostalAddresses/*</value_list>*/};
    
    /*<name>*/ABPersonPredicateKeyPath/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/ABPersonPredicateKeyPath/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/ABPersonPredicateKeyPath/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/ABPersonPredicateKeyPath/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("AddressBookUI") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="ABPersonNamePrefixProperty", optional=true)
        public static native NSString NamePrefix();
        @GlobalValue(symbol="ABPersonGivenNameProperty", optional=true)
        public static native NSString GivenName();
        @GlobalValue(symbol="ABPersonMiddleNameProperty", optional=true)
        public static native NSString MiddleName();
        @GlobalValue(symbol="ABPersonFamilyNameProperty", optional=true)
        public static native NSString FamilyName();
        @GlobalValue(symbol="ABPersonNameSuffixProperty", optional=true)
        public static native NSString NameSuffix();
        @GlobalValue(symbol="ABPersonPreviousFamilyNameProperty", optional=true)
        public static native NSString PreviousFamilyName();
        @GlobalValue(symbol="ABPersonNicknameProperty", optional=true)
        public static native NSString Nickname();
        @GlobalValue(symbol="ABPersonPhoneticGivenNameProperty", optional=true)
        public static native NSString PhoneticGivenName();
        @GlobalValue(symbol="ABPersonPhoneticMiddleNameProperty", optional=true)
        public static native NSString PhoneticMiddleName();
        @GlobalValue(symbol="ABPersonPhoneticFamilyNameProperty", optional=true)
        public static native NSString PhoneticFamilyName();
        @GlobalValue(symbol="ABPersonOrganizationNameProperty", optional=true)
        public static native NSString OrganizationName();
        @GlobalValue(symbol="ABPersonDepartmentNameProperty", optional=true)
        public static native NSString DepartmentName();
        @GlobalValue(symbol="ABPersonJobTitleProperty", optional=true)
        public static native NSString JobTitle();
        @GlobalValue(symbol="ABPersonBirthdayProperty", optional=true)
        public static native NSString Birthday();
        @GlobalValue(symbol="ABPersonNoteProperty", optional=true)
        public static native NSString Note();
        @GlobalValue(symbol="ABPersonPhoneNumbersProperty", optional=true)
        public static native NSString PhoneNumbers();
        @GlobalValue(symbol="ABPersonEmailAddressesProperty", optional=true)
        public static native NSString EmailAddresses();
        @GlobalValue(symbol="ABPersonUrlAddressesProperty", optional=true)
        public static native NSString UrlAddresses();
        @GlobalValue(symbol="ABPersonDatesProperty", optional=true)
        public static native NSString Dates();
        @GlobalValue(symbol="ABPersonInstantMessageAddressesProperty", optional=true)
        public static native NSString InstantMessageAddresses();
        @GlobalValue(symbol="ABPersonRelatedNamesProperty", optional=true)
        public static native NSString RelatedNames();
        @GlobalValue(symbol="ABPersonSocialProfilesProperty", optional=true)
        public static native NSString SocialProfiles();
        @GlobalValue(symbol="ABPersonPostalAddressesProperty", optional=true)
        public static native NSString PostalAddresses();
        /*</values>*/
    }
}
