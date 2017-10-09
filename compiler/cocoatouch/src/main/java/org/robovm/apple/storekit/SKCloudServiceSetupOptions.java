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
package org.robovm.apple.storekit;

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
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("StoreKit")/*</annotations>*/
@Marshaler(/*<name>*/SKCloudServiceSetupOptions/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SKCloudServiceSetupOptions/*</name>*/ 
    extends /*<extends>*/NSDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static SKCloudServiceSetupOptions toObject(Class<SKCloudServiceSetupOptions> cls, long handle, long flags) {
            NSDictionary o = (NSDictionary) NSObject.Marshaler.toObject(NSDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new SKCloudServiceSetupOptions(o);
        }
        @MarshalsPointer
        public static long toNative(SKCloudServiceSetupOptions o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<SKCloudServiceSetupOptions> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSDictionary> o = (NSArray<NSDictionary>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<SKCloudServiceSetupOptions> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new SKCloudServiceSetupOptions(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<SKCloudServiceSetupOptions> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSDictionary> array = new NSMutableArray<>();
            for (SKCloudServiceSetupOptions i : l) {
                array.add(i.getDictionary());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    SKCloudServiceSetupOptions(NSDictionary data) {
        super(data);
    }
    public SKCloudServiceSetupOptions() {}
    /*</constructors>*/

    /*<methods>*/
    public boolean has(NSString key) {
        return data.containsKey(key);
    }
    public NSObject get(NSString key) {
        if (has(key)) {
            return data.get(key);
        }
        return null;
    }
    public SKCloudServiceSetupOptions set(NSString key, NSObject value) {
        data.put(key, value);
        return this;
    }
    /*</methods>*/
    
    /*<keys>*/
    @Library("StoreKit")
    public static class Keys {
        static { Bro.bind(Keys.class); }
        /**
         * @since Available in iOS 10.1 and later.
         */
        @GlobalValue(symbol="SKCloudServiceSetupOptionsActionKey", optional=true)
        public static native NSString OptionsActionKey();
        /**
         * @since Available in iOS 10.1 and later.
         */
        @GlobalValue(symbol="SKCloudServiceSetupOptionsITunesItemIdentifierKey", optional=true)
        public static native NSString OptionsITunesItemIdentifierKey();
        /**
         * @since Available in iOS 10.3 and later.
         */
        @GlobalValue(symbol="SKCloudServiceSetupOptionsAffiliateTokenKey", optional=true)
        public static native NSString OptionsAffiliateTokenKey();
        /**
         * @since Available in iOS 10.3 and later.
         */
        @GlobalValue(symbol="SKCloudServiceSetupOptionsCampaignTokenKey", optional=true)
        public static native NSString OptionsCampaignTokenKey();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="SKCloudServiceSetupOptionsMessageIdentifierKey", optional=true)
        public static native NSString OptionsMessageIdentifierKey();
        /**
         * @since Available in iOS 10.1 and later.
         */
        @GlobalValue(symbol="SKCloudServiceSetupActionSubscribe", optional=true)
        public static native NSString ActionSubscribe();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="SKCloudServiceSetupMessageIdentifierJoin", optional=true)
        public static native NSString MessageIdentifierJoin();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="SKCloudServiceSetupMessageIdentifierConnect", optional=true)
        public static native NSString MessageIdentifierConnect();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="SKCloudServiceSetupMessageIdentifierAddMusic", optional=true)
        public static native NSString MessageIdentifierAddMusic();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="SKCloudServiceSetupMessageIdentifierPlayMusic", optional=true)
        public static native NSString MessageIdentifierPlayMusic();
    }
    /*</keys>*/
}
