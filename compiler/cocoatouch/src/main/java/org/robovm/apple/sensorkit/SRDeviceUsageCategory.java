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
package org.robovm.apple.sensorkit;

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
import org.robovm.apple.coremedia.*;
import org.robovm.apple.arkit.*;
import org.robovm.apple.speech.*;
import org.robovm.apple.soundanalysis.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("SensorKit") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/SRDeviceUsageCategory/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SRDeviceUsageCategory/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/SRDeviceUsageCategory/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static SRDeviceUsageCategory toObject(Class<SRDeviceUsageCategory> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return SRDeviceUsageCategory.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(SRDeviceUsageCategory o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<SRDeviceUsageCategory> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<SRDeviceUsageCategory> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(SRDeviceUsageCategory.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<SRDeviceUsageCategory> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (SRDeviceUsageCategory o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final SRDeviceUsageCategory Games = new SRDeviceUsageCategory("Games");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final SRDeviceUsageCategory Business = new SRDeviceUsageCategory("Business");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final SRDeviceUsageCategory Weather = new SRDeviceUsageCategory("Weather");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final SRDeviceUsageCategory Utilities = new SRDeviceUsageCategory("Utilities");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final SRDeviceUsageCategory Travel = new SRDeviceUsageCategory("Travel");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final SRDeviceUsageCategory Sports = new SRDeviceUsageCategory("Sports");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final SRDeviceUsageCategory SocialNetworking = new SRDeviceUsageCategory("SocialNetworking");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final SRDeviceUsageCategory Reference = new SRDeviceUsageCategory("Reference");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final SRDeviceUsageCategory Productivity = new SRDeviceUsageCategory("Productivity");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final SRDeviceUsageCategory PhotoAndVideo = new SRDeviceUsageCategory("PhotoAndVideo");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final SRDeviceUsageCategory News = new SRDeviceUsageCategory("News");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final SRDeviceUsageCategory Navigation = new SRDeviceUsageCategory("Navigation");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final SRDeviceUsageCategory Music = new SRDeviceUsageCategory("Music");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final SRDeviceUsageCategory Lifestyle = new SRDeviceUsageCategory("Lifestyle");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final SRDeviceUsageCategory HealthAndFitness = new SRDeviceUsageCategory("HealthAndFitness");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final SRDeviceUsageCategory Finance = new SRDeviceUsageCategory("Finance");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final SRDeviceUsageCategory Entertainment = new SRDeviceUsageCategory("Entertainment");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final SRDeviceUsageCategory Education = new SRDeviceUsageCategory("Education");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final SRDeviceUsageCategory Books = new SRDeviceUsageCategory("Books");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final SRDeviceUsageCategory Medical = new SRDeviceUsageCategory("Medical");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final SRDeviceUsageCategory Newsstand = new SRDeviceUsageCategory("Newsstand");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final SRDeviceUsageCategory Catalogs = new SRDeviceUsageCategory("Catalogs");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final SRDeviceUsageCategory Kids = new SRDeviceUsageCategory("Kids");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final SRDeviceUsageCategory Miscellaneous = new SRDeviceUsageCategory("Miscellaneous");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final SRDeviceUsageCategory FoodAndDrink = new SRDeviceUsageCategory("FoodAndDrink");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final SRDeviceUsageCategory DeveloperTools = new SRDeviceUsageCategory("DeveloperTools");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final SRDeviceUsageCategory GraphicsAndDesign = new SRDeviceUsageCategory("GraphicsAndDesign");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final SRDeviceUsageCategory Shopping = new SRDeviceUsageCategory("Shopping");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final SRDeviceUsageCategory Stickers = new SRDeviceUsageCategory("Stickers");
    /*</constants>*/
    
    private static /*<name>*/SRDeviceUsageCategory/*</name>*/[] values = new /*<name>*/SRDeviceUsageCategory/*</name>*/[] {/*<value_list>*/Games, Business, Weather, Utilities, Travel, Sports, SocialNetworking, Reference, Productivity, PhotoAndVideo, News, Navigation, Music, Lifestyle, HealthAndFitness, Finance, Entertainment, Education, Books, Medical, Newsstand, Catalogs, Kids, Miscellaneous, FoodAndDrink, DeveloperTools, GraphicsAndDesign, Shopping, Stickers/*</value_list>*/};
    
    /*<name>*/SRDeviceUsageCategory/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/SRDeviceUsageCategory/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/SRDeviceUsageCategory/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/SRDeviceUsageCategory/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("SensorKit") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="SRDeviceUsageCategoryGames", optional=true)
        public static native NSString Games();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="SRDeviceUsageCategoryBusiness", optional=true)
        public static native NSString Business();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="SRDeviceUsageCategoryWeather", optional=true)
        public static native NSString Weather();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="SRDeviceUsageCategoryUtilities", optional=true)
        public static native NSString Utilities();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="SRDeviceUsageCategoryTravel", optional=true)
        public static native NSString Travel();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="SRDeviceUsageCategorySports", optional=true)
        public static native NSString Sports();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="SRDeviceUsageCategorySocialNetworking", optional=true)
        public static native NSString SocialNetworking();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="SRDeviceUsageCategoryReference", optional=true)
        public static native NSString Reference();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="SRDeviceUsageCategoryProductivity", optional=true)
        public static native NSString Productivity();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="SRDeviceUsageCategoryPhotoAndVideo", optional=true)
        public static native NSString PhotoAndVideo();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="SRDeviceUsageCategoryNews", optional=true)
        public static native NSString News();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="SRDeviceUsageCategoryNavigation", optional=true)
        public static native NSString Navigation();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="SRDeviceUsageCategoryMusic", optional=true)
        public static native NSString Music();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="SRDeviceUsageCategoryLifestyle", optional=true)
        public static native NSString Lifestyle();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="SRDeviceUsageCategoryHealthAndFitness", optional=true)
        public static native NSString HealthAndFitness();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="SRDeviceUsageCategoryFinance", optional=true)
        public static native NSString Finance();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="SRDeviceUsageCategoryEntertainment", optional=true)
        public static native NSString Entertainment();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="SRDeviceUsageCategoryEducation", optional=true)
        public static native NSString Education();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="SRDeviceUsageCategoryBooks", optional=true)
        public static native NSString Books();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="SRDeviceUsageCategoryMedical", optional=true)
        public static native NSString Medical();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="SRDeviceUsageCategoryNewsstand", optional=true)
        public static native NSString Newsstand();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="SRDeviceUsageCategoryCatalogs", optional=true)
        public static native NSString Catalogs();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="SRDeviceUsageCategoryKids", optional=true)
        public static native NSString Kids();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="SRDeviceUsageCategoryMiscellaneous", optional=true)
        public static native NSString Miscellaneous();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="SRDeviceUsageCategoryFoodAndDrink", optional=true)
        public static native NSString FoodAndDrink();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="SRDeviceUsageCategoryDeveloperTools", optional=true)
        public static native NSString DeveloperTools();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="SRDeviceUsageCategoryGraphicsAndDesign", optional=true)
        public static native NSString GraphicsAndDesign();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="SRDeviceUsageCategoryShopping", optional=true)
        public static native NSString Shopping();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="SRDeviceUsageCategoryStickers", optional=true)
        public static native NSString Stickers();
        /*</values>*/
    }
}
