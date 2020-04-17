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
package org.robovm.apple.corebluetooth;

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
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreBluetooth")/*</annotations>*/
@Marshaler(/*<name>*/CBConnectionEventMatchingOptions/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CBConnectionEventMatchingOptions/*</name>*/ 
    extends /*<extends>*/NSDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CBConnectionEventMatchingOptions toObject(Class<CBConnectionEventMatchingOptions> cls, long handle, long flags) {
            NSDictionary o = (NSDictionary) NSObject.Marshaler.toObject(NSDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new CBConnectionEventMatchingOptions(o);
        }
        @MarshalsPointer
        public static long toNative(CBConnectionEventMatchingOptions o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CBConnectionEventMatchingOptions> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSDictionary> o = (NSArray<NSDictionary>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CBConnectionEventMatchingOptions> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new CBConnectionEventMatchingOptions(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CBConnectionEventMatchingOptions> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSDictionary> array = new NSMutableArray<>();
            for (CBConnectionEventMatchingOptions i : l) {
                array.add(i.getDictionary());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    CBConnectionEventMatchingOptions(NSDictionary data) {
        super(data);
    }
    public CBConnectionEventMatchingOptions() {}
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
    public CBConnectionEventMatchingOptions set(NSString key, NSObject value) {
        data.put(key, value);
        return this;
    }
    

    /**
     * @since Available in iOS 13.0 and later.
     */
    public NSArray<CBUUID> getServiceUUIDs() {
        if (has(Keys.ServiceUUIDs())) {
            NSArray<CBUUID> val = (NSArray<CBUUID>) get(Keys.ServiceUUIDs());
            return val;
        }
        return null;
    }
    /**
     * @since Available in iOS 13.0 and later.
     */
    public CBConnectionEventMatchingOptions setServiceUUIDs(NSArray<CBUUID> serviceUUIDs) {
        set(Keys.ServiceUUIDs(), serviceUUIDs);
        return this;
    }
    /**
     * @since Available in iOS 13.0 and later.
     */
    public NSArray<NSUUID> getPeripheralUUIDs() {
        if (has(Keys.PeripheralUUIDs())) {
            NSArray<NSUUID> val = (NSArray<NSUUID>) get(Keys.PeripheralUUIDs());
            return val;
        }
        return null;
    }
    /**
     * @since Available in iOS 13.0 and later.
     */
    public CBConnectionEventMatchingOptions setPeripheralUUIDs(NSArray<NSUUID> peripheralUUIDs) {
        set(Keys.PeripheralUUIDs(), peripheralUUIDs);
        return this;
    }
    /*</methods>*/
    
    /*<keys>*/
    @Library("CoreBluetooth")
    public static class Keys {
        static { Bro.bind(Keys.class); }
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CBConnectionEventMatchingOptionServiceUUIDs", optional=true)
        public static native NSString ServiceUUIDs();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CBConnectionEventMatchingOptionPeripheralUUIDs", optional=true)
        public static native NSString PeripheralUUIDs();
    }
    /*</keys>*/
}
