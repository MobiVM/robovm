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
@Marshaler(/*<name>*/CTFontNameKey/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CTFontNameKey/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<CFString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/CTFontNameKey/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CTFontNameKey toObject(Class<CTFontNameKey> cls, long handle, long flags) {
            CFString o = (CFString) CFType.Marshaler.toObject(CFString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return CTFontNameKey.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(CTFontNameKey o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CTFontNameKey> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(CFArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CTFontNameKey> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(CTFontNameKey.valueOf(o.get(i, CFString.class)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CTFontNameKey> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray array = CFMutableArray.create();
            for (CTFontNameKey o : l) {
                array.add(o.value());
            }
            return CFType.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final CTFontNameKey Copyright = new CTFontNameKey("Copyright");
    public static final CTFontNameKey Family = new CTFontNameKey("Family");
    public static final CTFontNameKey SubFamily = new CTFontNameKey("SubFamily");
    public static final CTFontNameKey Style = new CTFontNameKey("Style");
    public static final CTFontNameKey Unique = new CTFontNameKey("Unique");
    public static final CTFontNameKey Full = new CTFontNameKey("Full");
    public static final CTFontNameKey Version = new CTFontNameKey("Version");
    public static final CTFontNameKey PostScript = new CTFontNameKey("PostScript");
    public static final CTFontNameKey Trademark = new CTFontNameKey("Trademark");
    public static final CTFontNameKey Manufacturer = new CTFontNameKey("Manufacturer");
    public static final CTFontNameKey Designer = new CTFontNameKey("Designer");
    public static final CTFontNameKey Description = new CTFontNameKey("Description");
    public static final CTFontNameKey VendorURL = new CTFontNameKey("VendorURL");
    public static final CTFontNameKey DesignerURL = new CTFontNameKey("DesignerURL");
    public static final CTFontNameKey License = new CTFontNameKey("License");
    public static final CTFontNameKey LicenseURL = new CTFontNameKey("LicenseURL");
    public static final CTFontNameKey SampleText = new CTFontNameKey("SampleText");
    public static final CTFontNameKey PostScriptCID = new CTFontNameKey("PostScriptCID");
    public static final CTFontNameKey FeatureType = new CTFontNameKey("FeatureType");
    public static final CTFontNameKey FeatureSelector = new CTFontNameKey("FeatureSelector");
    /*</constants>*/
    
    private static /*<name>*/CTFontNameKey/*</name>*/[] values = new /*<name>*/CTFontNameKey/*</name>*/[] {/*<value_list>*/Copyright, Family, SubFamily, Style, Unique, Full, Version, PostScript, Trademark, Manufacturer, Designer, Description, VendorURL, DesignerURL, License, LicenseURL, SampleText, PostScriptCID, FeatureType, FeatureSelector/*</value_list>*/};
    
    /*<name>*/CTFontNameKey/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/CTFontNameKey/*</name>*/ valueOf(/*<type>*/CFString/*</type>*/ value) {
        for (/*<name>*/CTFontNameKey/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/CTFontNameKey/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("CoreText") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="kCTFontCopyrightNameKey", optional=true)
        public static native CFString Copyright();
        @GlobalValue(symbol="kCTFontFamilyNameKey", optional=true)
        public static native CFString Family();
        @GlobalValue(symbol="kCTFontSubFamilyNameKey", optional=true)
        public static native CFString SubFamily();
        @GlobalValue(symbol="kCTFontStyleNameKey", optional=true)
        public static native CFString Style();
        @GlobalValue(symbol="kCTFontUniqueNameKey", optional=true)
        public static native CFString Unique();
        @GlobalValue(symbol="kCTFontFullNameKey", optional=true)
        public static native CFString Full();
        @GlobalValue(symbol="kCTFontVersionNameKey", optional=true)
        public static native CFString Version();
        @GlobalValue(symbol="kCTFontPostScriptNameKey", optional=true)
        public static native CFString PostScript();
        @GlobalValue(symbol="kCTFontTrademarkNameKey", optional=true)
        public static native CFString Trademark();
        @GlobalValue(symbol="kCTFontManufacturerNameKey", optional=true)
        public static native CFString Manufacturer();
        @GlobalValue(symbol="kCTFontDesignerNameKey", optional=true)
        public static native CFString Designer();
        @GlobalValue(symbol="kCTFontDescriptionNameKey", optional=true)
        public static native CFString Description();
        @GlobalValue(symbol="kCTFontVendorURLNameKey", optional=true)
        public static native CFString VendorURL();
        @GlobalValue(symbol="kCTFontDesignerURLNameKey", optional=true)
        public static native CFString DesignerURL();
        @GlobalValue(symbol="kCTFontLicenseNameKey", optional=true)
        public static native CFString License();
        @GlobalValue(symbol="kCTFontLicenseURLNameKey", optional=true)
        public static native CFString LicenseURL();
        @GlobalValue(symbol="kCTFontSampleTextNameKey", optional=true)
        public static native CFString SampleText();
        @GlobalValue(symbol="kCTFontPostScriptCIDNameKey", optional=true)
        public static native CFString PostScriptCID();
        @GlobalValue(symbol="kCTFontFeatureTypeNameKey", optional=true)
        public static native CFString FeatureType();
        @GlobalValue(symbol="kCTFontFeatureSelectorNameKey", optional=true)
        public static native CFString FeatureSelector();
        /*</values>*/
    }
}
