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
package org.robovm.apple.coretext;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreText") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/CTFontAttribute/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CTFontAttribute/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<CFString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/CTFontAttribute/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CTFontAttribute toObject(Class<CTFontAttribute> cls, long handle, long flags) {
            CFString o = (CFString) CFType.Marshaler.toObject(CFString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return CTFontAttribute.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(CTFontAttribute o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CTFontAttribute> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(CFArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CTFontAttribute> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(CTFontAttribute.valueOf(o.get(i, CFString.class)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CTFontAttribute> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray array = CFMutableArray.create();
            for (CTFontAttribute o : l) {
                array.add(o.value());
            }
            return CFType.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final CTFontAttribute URL = new CTFontAttribute("URL");
    public static final CTFontAttribute Name = new CTFontAttribute("Name");
    public static final CTFontAttribute DisplayName = new CTFontAttribute("DisplayName");
    public static final CTFontAttribute FamilyName = new CTFontAttribute("FamilyName");
    public static final CTFontAttribute StyleName = new CTFontAttribute("StyleName");
    public static final CTFontAttribute Traits = new CTFontAttribute("Traits");
    public static final CTFontAttribute Variation = new CTFontAttribute("Variation");
    public static final CTFontAttribute Size = new CTFontAttribute("Size");
    public static final CTFontAttribute Matrix = new CTFontAttribute("Matrix");
    public static final CTFontAttribute CascadeList = new CTFontAttribute("CascadeList");
    public static final CTFontAttribute CharacterSet = new CTFontAttribute("CharacterSet");
    public static final CTFontAttribute Languages = new CTFontAttribute("Languages");
    public static final CTFontAttribute BaselineAdjust = new CTFontAttribute("BaselineAdjust");
    public static final CTFontAttribute MacintoshEncodings = new CTFontAttribute("MacintoshEncodings");
    public static final CTFontAttribute Features = new CTFontAttribute("Features");
    public static final CTFontAttribute FeatureSettings = new CTFontAttribute("FeatureSettings");
    public static final CTFontAttribute FixedAdvance = new CTFontAttribute("FixedAdvance");
    public static final CTFontAttribute Orientation = new CTFontAttribute("Orientation");
    public static final CTFontAttribute Format = new CTFontAttribute("Format");
    public static final CTFontAttribute RegistrationScope = new CTFontAttribute("RegistrationScope");
    public static final CTFontAttribute Priority = new CTFontAttribute("Priority");
    public static final CTFontAttribute Enabled = new CTFontAttribute("Enabled");
    public static final CTFontAttribute Downloadable = new CTFontAttribute("Downloadable");
    public static final CTFontAttribute Downloaded = new CTFontAttribute("Downloaded");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CTFontAttribute RegistrationUserInfo = new CTFontAttribute("RegistrationUserInfo");
    /*</constants>*/
    
    private static /*<name>*/CTFontAttribute/*</name>*/[] values = new /*<name>*/CTFontAttribute/*</name>*/[] {/*<value_list>*/URL, Name, DisplayName, FamilyName, StyleName, Traits, Variation, Size, Matrix, CascadeList, CharacterSet, Languages, BaselineAdjust, MacintoshEncodings, Features, FeatureSettings, FixedAdvance, Orientation, Format, RegistrationScope, Priority, Enabled, Downloadable, Downloaded, RegistrationUserInfo/*</value_list>*/};
    
    /*<name>*/CTFontAttribute/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/CTFontAttribute/*</name>*/ valueOf(/*<type>*/CFString/*</type>*/ value) {
        for (/*<name>*/CTFontAttribute/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/CTFontAttribute/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("CoreText") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="kCTFontURLAttribute", optional=true)
        public static native CFString URL();
        @GlobalValue(symbol="kCTFontNameAttribute", optional=true)
        public static native CFString Name();
        @GlobalValue(symbol="kCTFontDisplayNameAttribute", optional=true)
        public static native CFString DisplayName();
        @GlobalValue(symbol="kCTFontFamilyNameAttribute", optional=true)
        public static native CFString FamilyName();
        @GlobalValue(symbol="kCTFontStyleNameAttribute", optional=true)
        public static native CFString StyleName();
        @GlobalValue(symbol="kCTFontTraitsAttribute", optional=true)
        public static native CFString Traits();
        @GlobalValue(symbol="kCTFontVariationAttribute", optional=true)
        public static native CFString Variation();
        @GlobalValue(symbol="kCTFontSizeAttribute", optional=true)
        public static native CFString Size();
        @GlobalValue(symbol="kCTFontMatrixAttribute", optional=true)
        public static native CFString Matrix();
        @GlobalValue(symbol="kCTFontCascadeListAttribute", optional=true)
        public static native CFString CascadeList();
        @GlobalValue(symbol="kCTFontCharacterSetAttribute", optional=true)
        public static native CFString CharacterSet();
        @GlobalValue(symbol="kCTFontLanguagesAttribute", optional=true)
        public static native CFString Languages();
        @GlobalValue(symbol="kCTFontBaselineAdjustAttribute", optional=true)
        public static native CFString BaselineAdjust();
        @GlobalValue(symbol="kCTFontMacintoshEncodingsAttribute", optional=true)
        public static native CFString MacintoshEncodings();
        @GlobalValue(symbol="kCTFontFeaturesAttribute", optional=true)
        public static native CFString Features();
        @GlobalValue(symbol="kCTFontFeatureSettingsAttribute", optional=true)
        public static native CFString FeatureSettings();
        @GlobalValue(symbol="kCTFontFixedAdvanceAttribute", optional=true)
        public static native CFString FixedAdvance();
        @GlobalValue(symbol="kCTFontOrientationAttribute", optional=true)
        public static native CFString Orientation();
        @GlobalValue(symbol="kCTFontFormatAttribute", optional=true)
        public static native CFString Format();
        @GlobalValue(symbol="kCTFontRegistrationScopeAttribute", optional=true)
        public static native CFString RegistrationScope();
        @GlobalValue(symbol="kCTFontPriorityAttribute", optional=true)
        public static native CFString Priority();
        @GlobalValue(symbol="kCTFontEnabledAttribute", optional=true)
        public static native CFString Enabled();
        @GlobalValue(symbol="kCTFontDownloadableAttribute", optional=true)
        public static native CFString Downloadable();
        @GlobalValue(symbol="kCTFontDownloadedAttribute", optional=true)
        public static native CFString Downloaded();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="kCTFontRegistrationUserInfoAttribute", optional=true)
        public static native CFString RegistrationUserInfo();
        /*</values>*/
    }
}
