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
package org.robovm.apple.corefoundation;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreservices.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coretext.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreFoundation") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/CFCalendarIdentifier/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CFCalendarIdentifier/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<CFString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/CFCalendarIdentifier/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CFCalendarIdentifier toObject(Class<CFCalendarIdentifier> cls, long handle, long flags) {
            CFString o = (CFString) CFType.Marshaler.toObject(CFString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return CFCalendarIdentifier.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(CFCalendarIdentifier o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CFCalendarIdentifier> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(CFArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CFCalendarIdentifier> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(CFCalendarIdentifier.valueOf(o.get(i, CFString.class)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CFCalendarIdentifier> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray array = CFMutableArray.create();
            for (CFCalendarIdentifier o : l) {
                array.add(o.value());
            }
            return CFType.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final CFCalendarIdentifier Gregorian = new CFCalendarIdentifier("Gregorian");
    public static final CFCalendarIdentifier Buddhist = new CFCalendarIdentifier("Buddhist");
    public static final CFCalendarIdentifier Chinese = new CFCalendarIdentifier("Chinese");
    public static final CFCalendarIdentifier Hebrew = new CFCalendarIdentifier("Hebrew");
    public static final CFCalendarIdentifier Islamic = new CFCalendarIdentifier("Islamic");
    public static final CFCalendarIdentifier IslamicCivil = new CFCalendarIdentifier("IslamicCivil");
    public static final CFCalendarIdentifier Japanese = new CFCalendarIdentifier("Japanese");
    public static final CFCalendarIdentifier RepublicOfChina = new CFCalendarIdentifier("RepublicOfChina");
    public static final CFCalendarIdentifier Persian = new CFCalendarIdentifier("Persian");
    public static final CFCalendarIdentifier Indian = new CFCalendarIdentifier("Indian");
    public static final CFCalendarIdentifier ISO8601 = new CFCalendarIdentifier("ISO8601");
    public static final CFCalendarIdentifier IslamicTabular = new CFCalendarIdentifier("IslamicTabular");
    public static final CFCalendarIdentifier IslamicUmmAlQura = new CFCalendarIdentifier("IslamicUmmAlQura");
    /**
     * @since Available in iOS 26.0 and later.
     */
    public static final CFCalendarIdentifier Bangla = new CFCalendarIdentifier("Bangla");
    /**
     * @since Available in iOS 26.0 and later.
     */
    public static final CFCalendarIdentifier Gujarati = new CFCalendarIdentifier("Gujarati");
    /**
     * @since Available in iOS 26.0 and later.
     */
    public static final CFCalendarIdentifier Kannada = new CFCalendarIdentifier("Kannada");
    /**
     * @since Available in iOS 26.0 and later.
     */
    public static final CFCalendarIdentifier Malayalam = new CFCalendarIdentifier("Malayalam");
    /**
     * @since Available in iOS 26.0 and later.
     */
    public static final CFCalendarIdentifier Marathi = new CFCalendarIdentifier("Marathi");
    /**
     * @since Available in iOS 26.0 and later.
     */
    public static final CFCalendarIdentifier Odia = new CFCalendarIdentifier("Odia");
    /**
     * @since Available in iOS 26.0 and later.
     */
    public static final CFCalendarIdentifier Tamil = new CFCalendarIdentifier("Tamil");
    /**
     * @since Available in iOS 26.0 and later.
     */
    public static final CFCalendarIdentifier Telugu = new CFCalendarIdentifier("Telugu");
    /**
     * @since Available in iOS 26.0 and later.
     */
    public static final CFCalendarIdentifier Vikram = new CFCalendarIdentifier("Vikram");
    /**
     * @since Available in iOS 26.0 and later.
     */
    public static final CFCalendarIdentifier Dangi = new CFCalendarIdentifier("Dangi");
    /**
     * @since Available in iOS 26.0 and later.
     */
    public static final CFCalendarIdentifier Vietnamese = new CFCalendarIdentifier("Vietnamese");
    /*</constants>*/
    
    private static /*<name>*/CFCalendarIdentifier/*</name>*/[] values = new /*<name>*/CFCalendarIdentifier/*</name>*/[] {/*<value_list>*/Gregorian, Buddhist, Chinese, Hebrew, Islamic, IslamicCivil, Japanese, RepublicOfChina, Persian, Indian, ISO8601, IslamicTabular, IslamicUmmAlQura, Bangla, Gujarati, Kannada, Malayalam, Marathi, Odia, Tamil, Telugu, Vikram, Dangi, Vietnamese/*</value_list>*/};
    
    /*<name>*/CFCalendarIdentifier/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/CFCalendarIdentifier/*</name>*/ valueOf(/*<type>*/CFString/*</type>*/ value) {
        for (/*<name>*/CFCalendarIdentifier/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/CFCalendarIdentifier/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("CoreFoundation") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="kCFGregorianCalendar", optional=true)
        public static native CFString Gregorian();
        @GlobalValue(symbol="kCFBuddhistCalendar", optional=true)
        public static native CFString Buddhist();
        @GlobalValue(symbol="kCFChineseCalendar", optional=true)
        public static native CFString Chinese();
        @GlobalValue(symbol="kCFHebrewCalendar", optional=true)
        public static native CFString Hebrew();
        @GlobalValue(symbol="kCFIslamicCalendar", optional=true)
        public static native CFString Islamic();
        @GlobalValue(symbol="kCFIslamicCivilCalendar", optional=true)
        public static native CFString IslamicCivil();
        @GlobalValue(symbol="kCFJapaneseCalendar", optional=true)
        public static native CFString Japanese();
        @GlobalValue(symbol="kCFRepublicOfChinaCalendar", optional=true)
        public static native CFString RepublicOfChina();
        @GlobalValue(symbol="kCFPersianCalendar", optional=true)
        public static native CFString Persian();
        @GlobalValue(symbol="kCFIndianCalendar", optional=true)
        public static native CFString Indian();
        @GlobalValue(symbol="kCFISO8601Calendar", optional=true)
        public static native CFString ISO8601();
        @GlobalValue(symbol="kCFIslamicTabularCalendar", optional=true)
        public static native CFString IslamicTabular();
        @GlobalValue(symbol="kCFIslamicUmmAlQuraCalendar", optional=true)
        public static native CFString IslamicUmmAlQura();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kCFBanglaCalendar", optional=true)
        public static native CFString Bangla();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kCFGujaratiCalendar", optional=true)
        public static native CFString Gujarati();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kCFKannadaCalendar", optional=true)
        public static native CFString Kannada();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kCFMalayalamCalendar", optional=true)
        public static native CFString Malayalam();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kCFMarathiCalendar", optional=true)
        public static native CFString Marathi();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kCFOdiaCalendar", optional=true)
        public static native CFString Odia();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kCFTamilCalendar", optional=true)
        public static native CFString Tamil();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kCFTeluguCalendar", optional=true)
        public static native CFString Telugu();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kCFVikramCalendar", optional=true)
        public static native CFString Vikram();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kCFDangiCalendar", optional=true)
        public static native CFString Dangi();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kCFVietnameseCalendar", optional=true)
        public static native CFString Vietnamese();
        /*</values>*/
    }
}
