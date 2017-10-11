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
/*<annotations>*/@Library("UIKit")/*</annotations>*/
@Marshaler(/*<name>*/UIPasteboardOptions/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIPasteboardOptions/*</name>*/ 
    extends /*<extends>*/NSDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static UIPasteboardOptions toObject(Class<UIPasteboardOptions> cls, long handle, long flags) {
            NSDictionary o = (NSDictionary) NSObject.Marshaler.toObject(NSDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new UIPasteboardOptions(o);
        }
        @MarshalsPointer
        public static long toNative(UIPasteboardOptions o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<UIPasteboardOptions> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSDictionary> o = (NSArray<NSDictionary>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<UIPasteboardOptions> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new UIPasteboardOptions(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<UIPasteboardOptions> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSDictionary> array = new NSMutableArray<>();
            for (UIPasteboardOptions i : l) {
                array.add(i.getDictionary());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    UIPasteboardOptions(NSDictionary data) {
        super(data);
    }
    public UIPasteboardOptions() {}
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
    public UIPasteboardOptions set(NSString key, NSObject value) {
        data.put(key, value);
        return this;
    }
    

    /**
     * @since Available in iOS 10.0 and later.
     */
    public NSDate getExpirationDate() {
        if (has(Keys.ExpirationDate())) {
            NSDate val = (NSDate) get(Keys.ExpirationDate());
            return val;
        }
        return null;
    }
    /**
     * @since Available in iOS 10.0 and later.
     */
    public UIPasteboardOptions setExpirationDate(NSDate expirationDate) {
        set(Keys.ExpirationDate(), expirationDate);
        return this;
    }
    /**
     * @since Available in iOS 10.0 and later.
     */
    public boolean isLocalOnly() {
        if (has(Keys.LocalOnly())) {
            NSNumber val = (NSNumber) get(Keys.LocalOnly());
            return val.booleanValue();
        }
        return false;
    }
    /**
     * @since Available in iOS 10.0 and later.
     */
    public UIPasteboardOptions setLocalOnly(boolean localOnly) {
        set(Keys.LocalOnly(), NSNumber.valueOf(localOnly));
        return this;
    }
    /*</methods>*/
    
    /*<keys>*/
    @Library("UIKit")
    public static class Keys {
        static { Bro.bind(Keys.class); }
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="UIPasteboardOptionExpirationDate", optional=true)
        public static native NSString ExpirationDate();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="UIPasteboardOptionLocalOnly", optional=true)
        public static native NSString LocalOnly();
    }
    /*</keys>*/
}
