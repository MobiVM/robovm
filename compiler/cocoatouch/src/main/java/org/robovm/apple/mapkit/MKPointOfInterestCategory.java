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
package org.robovm.apple.mapkit;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("MapKit") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/MKPointOfInterestCategory/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MKPointOfInterestCategory/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/MKPointOfInterestCategory/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static MKPointOfInterestCategory toObject(Class<MKPointOfInterestCategory> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return MKPointOfInterestCategory.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(MKPointOfInterestCategory o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<MKPointOfInterestCategory> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<MKPointOfInterestCategory> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(MKPointOfInterestCategory.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<MKPointOfInterestCategory> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (MKPointOfInterestCategory o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final MKPointOfInterestCategory AnimalService = new MKPointOfInterestCategory("AnimalService");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final MKPointOfInterestCategory Airport = new MKPointOfInterestCategory("Airport");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final MKPointOfInterestCategory AmusementPark = new MKPointOfInterestCategory("AmusementPark");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final MKPointOfInterestCategory Aquarium = new MKPointOfInterestCategory("Aquarium");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final MKPointOfInterestCategory ATM = new MKPointOfInterestCategory("ATM");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final MKPointOfInterestCategory AutomotiveRepair = new MKPointOfInterestCategory("AutomotiveRepair");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final MKPointOfInterestCategory Bakery = new MKPointOfInterestCategory("Bakery");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final MKPointOfInterestCategory Bank = new MKPointOfInterestCategory("Bank");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final MKPointOfInterestCategory Baseball = new MKPointOfInterestCategory("Baseball");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final MKPointOfInterestCategory Basketball = new MKPointOfInterestCategory("Basketball");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final MKPointOfInterestCategory Beach = new MKPointOfInterestCategory("Beach");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final MKPointOfInterestCategory Beauty = new MKPointOfInterestCategory("Beauty");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final MKPointOfInterestCategory Bowling = new MKPointOfInterestCategory("Bowling");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final MKPointOfInterestCategory Brewery = new MKPointOfInterestCategory("Brewery");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final MKPointOfInterestCategory Cafe = new MKPointOfInterestCategory("Cafe");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final MKPointOfInterestCategory Campground = new MKPointOfInterestCategory("Campground");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final MKPointOfInterestCategory CarRental = new MKPointOfInterestCategory("CarRental");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final MKPointOfInterestCategory Castle = new MKPointOfInterestCategory("Castle");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final MKPointOfInterestCategory ConventionCenter = new MKPointOfInterestCategory("ConventionCenter");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final MKPointOfInterestCategory Distillery = new MKPointOfInterestCategory("Distillery");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final MKPointOfInterestCategory EVCharger = new MKPointOfInterestCategory("EVCharger");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final MKPointOfInterestCategory Fairground = new MKPointOfInterestCategory("Fairground");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final MKPointOfInterestCategory FireStation = new MKPointOfInterestCategory("FireStation");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final MKPointOfInterestCategory Fishing = new MKPointOfInterestCategory("Fishing");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final MKPointOfInterestCategory FitnessCenter = new MKPointOfInterestCategory("FitnessCenter");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final MKPointOfInterestCategory FoodMarket = new MKPointOfInterestCategory("FoodMarket");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final MKPointOfInterestCategory Fortress = new MKPointOfInterestCategory("Fortress");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final MKPointOfInterestCategory GasStation = new MKPointOfInterestCategory("GasStation");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final MKPointOfInterestCategory Golf = new MKPointOfInterestCategory("Golf");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final MKPointOfInterestCategory GoKart = new MKPointOfInterestCategory("GoKart");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final MKPointOfInterestCategory Hiking = new MKPointOfInterestCategory("Hiking");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final MKPointOfInterestCategory Hospital = new MKPointOfInterestCategory("Hospital");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final MKPointOfInterestCategory Hotel = new MKPointOfInterestCategory("Hotel");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final MKPointOfInterestCategory Kayaking = new MKPointOfInterestCategory("Kayaking");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final MKPointOfInterestCategory Landmark = new MKPointOfInterestCategory("Landmark");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final MKPointOfInterestCategory Laundry = new MKPointOfInterestCategory("Laundry");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final MKPointOfInterestCategory Library = new MKPointOfInterestCategory("Library");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final MKPointOfInterestCategory Mailbox = new MKPointOfInterestCategory("Mailbox");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final MKPointOfInterestCategory Marina = new MKPointOfInterestCategory("Marina");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final MKPointOfInterestCategory MiniGolf = new MKPointOfInterestCategory("MiniGolf");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final MKPointOfInterestCategory MovieTheater = new MKPointOfInterestCategory("MovieTheater");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final MKPointOfInterestCategory Museum = new MKPointOfInterestCategory("Museum");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final MKPointOfInterestCategory MusicVenue = new MKPointOfInterestCategory("MusicVenue");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final MKPointOfInterestCategory NationalMonument = new MKPointOfInterestCategory("NationalMonument");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final MKPointOfInterestCategory NationalPark = new MKPointOfInterestCategory("NationalPark");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final MKPointOfInterestCategory Nightlife = new MKPointOfInterestCategory("Nightlife");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final MKPointOfInterestCategory Park = new MKPointOfInterestCategory("Park");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final MKPointOfInterestCategory Parking = new MKPointOfInterestCategory("Parking");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final MKPointOfInterestCategory Pharmacy = new MKPointOfInterestCategory("Pharmacy");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final MKPointOfInterestCategory Planetarium = new MKPointOfInterestCategory("Planetarium");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final MKPointOfInterestCategory Police = new MKPointOfInterestCategory("Police");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final MKPointOfInterestCategory PostOffice = new MKPointOfInterestCategory("PostOffice");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final MKPointOfInterestCategory PublicTransport = new MKPointOfInterestCategory("PublicTransport");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final MKPointOfInterestCategory Restaurant = new MKPointOfInterestCategory("Restaurant");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final MKPointOfInterestCategory Restroom = new MKPointOfInterestCategory("Restroom");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final MKPointOfInterestCategory RockClimbing = new MKPointOfInterestCategory("RockClimbing");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final MKPointOfInterestCategory RVPark = new MKPointOfInterestCategory("RVPark");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final MKPointOfInterestCategory School = new MKPointOfInterestCategory("School");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final MKPointOfInterestCategory SkatePark = new MKPointOfInterestCategory("SkatePark");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final MKPointOfInterestCategory Skating = new MKPointOfInterestCategory("Skating");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final MKPointOfInterestCategory Skiing = new MKPointOfInterestCategory("Skiing");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final MKPointOfInterestCategory Soccer = new MKPointOfInterestCategory("Soccer");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final MKPointOfInterestCategory Spa = new MKPointOfInterestCategory("Spa");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final MKPointOfInterestCategory Stadium = new MKPointOfInterestCategory("Stadium");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final MKPointOfInterestCategory Store = new MKPointOfInterestCategory("Store");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final MKPointOfInterestCategory Surfing = new MKPointOfInterestCategory("Surfing");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final MKPointOfInterestCategory Swimming = new MKPointOfInterestCategory("Swimming");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final MKPointOfInterestCategory Tennis = new MKPointOfInterestCategory("Tennis");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final MKPointOfInterestCategory Theater = new MKPointOfInterestCategory("Theater");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final MKPointOfInterestCategory University = new MKPointOfInterestCategory("University");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final MKPointOfInterestCategory Winery = new MKPointOfInterestCategory("Winery");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final MKPointOfInterestCategory Volleyball = new MKPointOfInterestCategory("Volleyball");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final MKPointOfInterestCategory Zoo = new MKPointOfInterestCategory("Zoo");
    /*</constants>*/
    
    private static /*<name>*/MKPointOfInterestCategory/*</name>*/[] values = new /*<name>*/MKPointOfInterestCategory/*</name>*/[] {/*<value_list>*/AnimalService, Airport, AmusementPark, Aquarium, ATM, AutomotiveRepair, Bakery, Bank, Baseball, Basketball, Beach, Beauty, Bowling, Brewery, Cafe, Campground, CarRental, Castle, ConventionCenter, Distillery, EVCharger, Fairground, FireStation, Fishing, FitnessCenter, FoodMarket, Fortress, GasStation, Golf, GoKart, Hiking, Hospital, Hotel, Kayaking, Landmark, Laundry, Library, Mailbox, Marina, MiniGolf, MovieTheater, Museum, MusicVenue, NationalMonument, NationalPark, Nightlife, Park, Parking, Pharmacy, Planetarium, Police, PostOffice, PublicTransport, Restaurant, Restroom, RockClimbing, RVPark, School, SkatePark, Skating, Skiing, Soccer, Spa, Stadium, Store, Surfing, Swimming, Tennis, Theater, University, Winery, Volleyball, Zoo/*</value_list>*/};
    
    /*<name>*/MKPointOfInterestCategory/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/MKPointOfInterestCategory/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/MKPointOfInterestCategory/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/MKPointOfInterestCategory/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("MapKit") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryAnimalService", optional=true)
        public static native NSString AnimalService();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryAirport", optional=true)
        public static native NSString Airport();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryAmusementPark", optional=true)
        public static native NSString AmusementPark();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryAquarium", optional=true)
        public static native NSString Aquarium();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryATM", optional=true)
        public static native NSString ATM();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryAutomotiveRepair", optional=true)
        public static native NSString AutomotiveRepair();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryBakery", optional=true)
        public static native NSString Bakery();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryBank", optional=true)
        public static native NSString Bank();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryBaseball", optional=true)
        public static native NSString Baseball();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryBasketball", optional=true)
        public static native NSString Basketball();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryBeach", optional=true)
        public static native NSString Beach();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryBeauty", optional=true)
        public static native NSString Beauty();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryBowling", optional=true)
        public static native NSString Bowling();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryBrewery", optional=true)
        public static native NSString Brewery();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryCafe", optional=true)
        public static native NSString Cafe();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryCampground", optional=true)
        public static native NSString Campground();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryCarRental", optional=true)
        public static native NSString CarRental();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryCastle", optional=true)
        public static native NSString Castle();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryConventionCenter", optional=true)
        public static native NSString ConventionCenter();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryDistillery", optional=true)
        public static native NSString Distillery();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryEVCharger", optional=true)
        public static native NSString EVCharger();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryFairground", optional=true)
        public static native NSString Fairground();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryFireStation", optional=true)
        public static native NSString FireStation();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryFishing", optional=true)
        public static native NSString Fishing();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryFitnessCenter", optional=true)
        public static native NSString FitnessCenter();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryFoodMarket", optional=true)
        public static native NSString FoodMarket();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryFortress", optional=true)
        public static native NSString Fortress();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryGasStation", optional=true)
        public static native NSString GasStation();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryGolf", optional=true)
        public static native NSString Golf();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryGoKart", optional=true)
        public static native NSString GoKart();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryHiking", optional=true)
        public static native NSString Hiking();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryHospital", optional=true)
        public static native NSString Hospital();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryHotel", optional=true)
        public static native NSString Hotel();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryKayaking", optional=true)
        public static native NSString Kayaking();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryLandmark", optional=true)
        public static native NSString Landmark();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryLaundry", optional=true)
        public static native NSString Laundry();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryLibrary", optional=true)
        public static native NSString Library();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryMailbox", optional=true)
        public static native NSString Mailbox();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryMarina", optional=true)
        public static native NSString Marina();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryMiniGolf", optional=true)
        public static native NSString MiniGolf();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryMovieTheater", optional=true)
        public static native NSString MovieTheater();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryMuseum", optional=true)
        public static native NSString Museum();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryMusicVenue", optional=true)
        public static native NSString MusicVenue();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryNationalMonument", optional=true)
        public static native NSString NationalMonument();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryNationalPark", optional=true)
        public static native NSString NationalPark();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryNightlife", optional=true)
        public static native NSString Nightlife();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryPark", optional=true)
        public static native NSString Park();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryParking", optional=true)
        public static native NSString Parking();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryPharmacy", optional=true)
        public static native NSString Pharmacy();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryPlanetarium", optional=true)
        public static native NSString Planetarium();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryPolice", optional=true)
        public static native NSString Police();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryPostOffice", optional=true)
        public static native NSString PostOffice();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryPublicTransport", optional=true)
        public static native NSString PublicTransport();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryRestaurant", optional=true)
        public static native NSString Restaurant();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryRestroom", optional=true)
        public static native NSString Restroom();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryRockClimbing", optional=true)
        public static native NSString RockClimbing();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryRVPark", optional=true)
        public static native NSString RVPark();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategorySchool", optional=true)
        public static native NSString School();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategorySkatePark", optional=true)
        public static native NSString SkatePark();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategorySkating", optional=true)
        public static native NSString Skating();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategorySkiing", optional=true)
        public static native NSString Skiing();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategorySoccer", optional=true)
        public static native NSString Soccer();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategorySpa", optional=true)
        public static native NSString Spa();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryStadium", optional=true)
        public static native NSString Stadium();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryStore", optional=true)
        public static native NSString Store();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategorySurfing", optional=true)
        public static native NSString Surfing();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategorySwimming", optional=true)
        public static native NSString Swimming();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryTennis", optional=true)
        public static native NSString Tennis();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryTheater", optional=true)
        public static native NSString Theater();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryUniversity", optional=true)
        public static native NSString University();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryWinery", optional=true)
        public static native NSString Winery();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryVolleyball", optional=true)
        public static native NSString Volleyball();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="MKPointOfInterestCategoryZoo", optional=true)
        public static native NSString Zoo();
        /*</values>*/
    }
}
