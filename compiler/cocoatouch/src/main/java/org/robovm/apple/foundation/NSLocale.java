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

/*</javadoc>*/
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSLocale/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    public static class Notifications {
        /**
         * @since Available in iOS 2.0 and later.
         */
        public static NSObject observeCurrentLocaleDidChange(final Runnable block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(CurrentLocaleDidChangeNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.run();
                }
            });
        }
    }
    
    /*<ptr>*/public static class NSLocalePtr extends Ptr<NSLocale, NSLocalePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSLocale.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NSLocale(Handle h, long handle) { super(h, handle); }
    protected NSLocale(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithLocaleIdentifier:")
    public NSLocale(String string) { super((SkipInit) null); initObject(init(string)); }
    @Method(selector = "initWithCoder:")
    public NSLocale(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    
    public NSLocale(Locale locale) {
        super((SkipInit) null);
        initObject(init(locale.toString()));
    }
    
    /*<properties>*/
    @Property(selector = "localeIdentifier")
    private native String getLocaleIdentifier0();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "languageCode")
    private native String getLanguageCode0();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "countryCode")
    private native String getCountryCode0();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "scriptCode")
    private native String getScriptCode0();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "variantCode")
    private native String getVariantCode0();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "exemplarCharacterSet")
    private native NSCharacterSet getExemplarCharacterSet0();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "calendarIdentifier")
    public native String getCalendarIdentifier();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "collationIdentifier")
    private native String getCollationIdentifier0();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "usesMetricSystem")
    private native boolean usesMetricSystem0();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "decimalSeparator")
    private native String getDecimalSeparator0();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "groupingSeparator")
    private native String getGroupingSeparator0();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "currencySymbol")
    private native String getCurrencySymbol0();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "currencyCode")
    private native String getCurrencyCode0();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "collatorIdentifier")
    private native String getCollatorIdentifier0();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "quotationBeginDelimiter")
    private native String getQuotationBeginDelimiter0();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "quotationEndDelimiter")
    private native String getQuotationEndDelimiter0();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "alternateQuotationBeginDelimiter")
    private native String getAlternateQuotationBeginDelimiter0();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "alternateQuotationEndDelimiter")
    private native String getAlternateQuotationEndDelimiter0();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Property(selector = "autoupdatingCurrentLocale")
    public static native NSLocale getAutoupdatingCurrentLocale();
    @Property(selector = "currentLocale")
    public static native NSLocale getCurrentLocale();
    @Property(selector = "systemLocale")
    public static native NSLocale getSystemLocale();
    @Property(selector = "availableLocaleIdentifiers")
    public static native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getAvailableLocaleIdentifiers();
    @Property(selector = "ISOLanguageCodes")
    public static native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getISOLanguageCodes();
    @Property(selector = "ISOCountryCodes")
    public static native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getISOCountryCodes();
    @Property(selector = "ISOCurrencyCodes")
    public static native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getISOCurrencyCodes();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Property(selector = "commonISOCurrencyCodes")
    public static native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getCommonISOCurrencyCodes();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Property(selector = "preferredLanguages")
    public static native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getPreferredLanguages();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    
    public Locale toLocale() {
        String language = getLanguageCode();
        String country = getCountryCode();
        String variant = getVariantCode();
        if (language != null && country != null && variant != null) {
            return new Locale(language, country, variant);
        }
        if (language != null && country != null) {
            return new Locale(language, country);
        }
        if (language != null) {
            return new Locale(language);
        }
        throw new IllegalArgumentException("Failed to convert NSLocale " + toString() + " to Java Locale");
    }
    
    /* Convenience methods */
    public String getLocaleIdentifier() {
        if (Foundation.getMajorSystemVersion() >= 10) {
            return getLocaleIdentifier0();
        } else {
            NSString val = (NSString)getComponent(NSLocaleComponent.Identifier);
            return val.toString();
        }
    }
    
    public String getLanguageCode() {
        if (Foundation.getMajorSystemVersion() >= 10) {
            return getLanguageCode0();
        } else {
            NSString val = (NSString)getComponent(NSLocaleComponent.LanguageCode);
            return val.toString();
        }
    }
    public String getCountryCode() {
        if (Foundation.getMajorSystemVersion() >= 10) {
            return getCountryCode0();
        } else {
            NSString val = (NSString)getComponent(NSLocaleComponent.CountryCode);
            return val.toString();
        }
    }
    public String getScriptCode() {
        if (Foundation.getMajorSystemVersion() >= 10) {
            return getScriptCode0();
        } else {
            NSString val = (NSString)getComponent(NSLocaleComponent.ScriptCode);
            return val.toString();
        }
    }
    public String getVariantCode() {
        if (Foundation.getMajorSystemVersion() >= 10) {
            return getVariantCode0();
        } else {
            NSString val = (NSString)getComponent(NSLocaleComponent.VariantCode);
            return val.toString();
        }
    }
    public NSCharacterSet getExemplarCharacterSet() {
        if (Foundation.getMajorSystemVersion() >= 10) {
            return getExemplarCharacterSet0();
        } else {
            NSCharacterSet val = (NSCharacterSet)getComponent(NSLocaleComponent.ExemplarCharacterSet);
            return val;
        }
    }
    public String getCollationIdentifier() {
        if (Foundation.getMajorSystemVersion() >= 10) {
            return getCollationIdentifier0();
        } else {
            NSString val = (NSString)getComponent(NSLocaleComponent.CollationIdentifier);
            return val.toString();
        }
    }
    public boolean usesMetricSystem() {
        if (Foundation.getMajorSystemVersion() >= 10) {
            return usesMetricSystem0();
        } else {
            NSNumber val = (NSNumber)getComponent(NSLocaleComponent.UsesMetricSystem);
            return val.booleanValue();
        }
    }
    public String getMeasurementSystem() {
        NSString val = (NSString)getComponent(NSLocaleComponent.MeasurementSystem);
        return val.toString();
    }
    public String getDecimalSeparator() {
        if (Foundation.getMajorSystemVersion() >= 10) {
            return getDecimalSeparator0();
        } else {
            NSString val = (NSString)getComponent(NSLocaleComponent.DecimalSeparator);
            return val.toString();
        }
    }
    public String getGroupingSeparator() {
        if (Foundation.getMajorSystemVersion() >= 10) {
            return getGroupingSeparator0();
        } else {
            NSString val = (NSString)getComponent(NSLocaleComponent.GroupingSeparator);
            return val.toString();
        }
    }
    public String getCurrencySymbol() {
        if (Foundation.getMajorSystemVersion() >= 10) {
            return getCurrencySymbol0();
        } else {
            NSString val = (NSString)getComponent(NSLocaleComponent.CurrencySymbol);
            return val.toString();
        }
    }
    public String getCurrencyCode() {
        if (Foundation.getMajorSystemVersion() >= 10) {
            return getCurrencyCode0();
        } else {
            NSString val = (NSString)getComponent(NSLocaleComponent.CurrencyCode);
            return val.toString();
        }
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public String getCollatorIdentifier() {
        if (Foundation.getMajorSystemVersion() >= 10) {
            return getCollatorIdentifier0();
        } else {
            NSString val = (NSString)getComponent(NSLocaleComponent.CollatorIdentifier);
            return val.toString();
        }
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public String getQuotationBeginDelimiter() {
        if (Foundation.getMajorSystemVersion() >= 10) {
            return getQuotationBeginDelimiter0();
        } else {
            NSString val = (NSString)getComponent(NSLocaleComponent.QuotationBeginDelimiterKey);
            return val.toString();
        }
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public String getQuotationEndDelimiter() {
        if (Foundation.getMajorSystemVersion() >= 10) {
            return getQuotationEndDelimiter0();
        } else {
            NSString val = (NSString)getComponent(NSLocaleComponent.QuotationEndDelimiterKey);
            return val.toString();
        }
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public String getAlternateQuotationBeginDelimiter() {
        if (Foundation.getMajorSystemVersion() >= 10) {
            return getAlternateQuotationBeginDelimiter0();
        } else {
            NSString val = (NSString)getComponent(NSLocaleComponent.AlternateQuotationBeginDelimiterKey);
            return val.toString();
        }
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public String getAlternateQuotationEndDelimiter() {
        if (Foundation.getMajorSystemVersion() >= 10) {
            return getAlternateQuotationEndDelimiter0();
        } else {
            NSString val = (NSString)getComponent(NSLocaleComponent.AlternateQuotationEndDelimiterKey);
            return val.toString();
        }
    }
    /*<methods>*/
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalValue(symbol="NSCurrentLocaleDidChangeNotification", optional=true)
    public static native NSString CurrentLocaleDidChangeNotification();
    
    @Method(selector = "objectForKey:")
    public native NSObject getComponent(NSLocaleComponent key);
    @Method(selector = "displayNameForKey:value:")
    public native String getComponentDisplayName(NSLocaleComponent key, NSObject value);
    @Method(selector = "initWithLocaleIdentifier:")
    protected native @Pointer long init(String string);
    @Method(selector = "componentsFromLocaleIdentifier:")
    public static native NSLocaleComponents getComponentsFromLocaleIdentifier(String string);
    @Method(selector = "localeIdentifierFromComponents:")
    public static native String getLocaleIdentifierFromComponents(NSLocaleComponents dict);
    @Method(selector = "canonicalLocaleIdentifierFromString:")
    public static native String getCanonicalLocaleIdentifier(String string);
    @Method(selector = "canonicalLanguageIdentifierFromString:")
    public static native String getCanonicalLanguageIdentifier(String string);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Method(selector = "localeIdentifierFromWindowsLocaleCode:")
    public static native String getLocaleIdentifierFromWindowsLocaleCode(int lcid);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Method(selector = "windowsLocaleCodeFromLocaleIdentifier:")
    public static native int getWindowsLocaleCodeFromLocaleIdentifier(String localeIdentifier);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Method(selector = "characterDirectionForLanguage:")
    public static native NSLocaleLanguageDirection getCharacterDirection(String isoLangCode);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Method(selector = "lineDirectionForLanguage:")
    public static native NSLocaleLanguageDirection getLineDirection(String isoLangCode);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
