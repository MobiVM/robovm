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
package org.robovm.apple.passkit;

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
import org.robovm.apple.contacts.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("PassKit")/*</annotations>*/
@Marshaler(/*<name>*/PKRemovedPassInfo/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PKRemovedPassInfo/*</name>*/ 
    extends /*<extends>*/NSDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static PKRemovedPassInfo toObject(Class<PKRemovedPassInfo> cls, long handle, long flags) {
            NSDictionary o = (NSDictionary) NSObject.Marshaler.toObject(NSDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new PKRemovedPassInfo(o);
        }
        @MarshalsPointer
        public static long toNative(PKRemovedPassInfo o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<PKRemovedPassInfo> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSDictionary> o = (NSArray<NSDictionary>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<PKRemovedPassInfo> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new PKRemovedPassInfo(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<PKRemovedPassInfo> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSDictionary> array = new NSMutableArray<>();
            for (PKRemovedPassInfo i : l) {
                array.add(i.getDictionary());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    PKRemovedPassInfo(NSDictionary data) {
        super(data);
    }
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
    

    public String getPassTypeIdentifier() {
        if (has(Keys.PassTypeIdentifier())) {
            NSString val = (NSString) get(Keys.PassTypeIdentifier());
            return val.toString();
        }
        return null;
    }
    public String getSerialNumber() {
        if (has(Keys.SerialNumber())) {
            NSString val = (NSString) get(Keys.SerialNumber());
            return val.toString();
        }
        return null;
    }
    /*</methods>*/
    
    /*<keys>*/
    @Library("PassKit")
    public static class Keys {
        static { Bro.bind(Keys.class); }
        @GlobalValue(symbol="PKPassLibraryPassTypeIdentifierUserInfoKey", optional=true)
        public static native NSString PassTypeIdentifier();
        @GlobalValue(symbol="PKPassLibrarySerialNumberUserInfoKey", optional=true)
        public static native NSString SerialNumber();
    }
    /*</keys>*/
}
