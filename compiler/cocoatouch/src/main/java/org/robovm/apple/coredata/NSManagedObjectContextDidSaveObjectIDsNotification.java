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
package org.robovm.apple.coredata;

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
import org.robovm.apple.corespotlight.*;
import org.robovm.apple.cloudkit.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreData")/*</annotations>*/
@Marshaler(/*<name>*/NSManagedObjectContextDidSaveObjectIDsNotification/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSManagedObjectContextDidSaveObjectIDsNotification/*</name>*/ 
    extends /*<extends>*/NSDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static NSManagedObjectContextDidSaveObjectIDsNotification toObject(Class<NSManagedObjectContextDidSaveObjectIDsNotification> cls, long handle, long flags) {
            NSDictionary o = (NSDictionary) NSObject.Marshaler.toObject(NSDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new NSManagedObjectContextDidSaveObjectIDsNotification(o);
        }
        @MarshalsPointer
        public static long toNative(NSManagedObjectContextDidSaveObjectIDsNotification o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<NSManagedObjectContextDidSaveObjectIDsNotification> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSDictionary> o = (NSArray<NSDictionary>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<NSManagedObjectContextDidSaveObjectIDsNotification> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new NSManagedObjectContextDidSaveObjectIDsNotification(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<NSManagedObjectContextDidSaveObjectIDsNotification> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSDictionary> array = new NSMutableArray<>();
            for (NSManagedObjectContextDidSaveObjectIDsNotification i : l) {
                array.add(i.getDictionary());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    NSManagedObjectContextDidSaveObjectIDsNotification(NSDictionary data) {
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
    

    /**
     * @since Available in iOS 10.3 and later.
     */
    public NSSet<NSManagedObjectID> getInsertedObjectIDs() {
        if (has(Keys.InsertedObjectIDs())) {
            NSSet<NSManagedObjectID> val = (NSSet<NSManagedObjectID>) get(Keys.InsertedObjectIDs());
            return val;
        }
        return null;
    }
    /**
     * @since Available in iOS 10.3 and later.
     */
    public NSSet<NSManagedObjectID> getUpdatedObjectIDs() {
        if (has(Keys.UpdatedObjectIDs())) {
            NSSet<NSManagedObjectID> val = (NSSet<NSManagedObjectID>) get(Keys.UpdatedObjectIDs());
            return val;
        }
        return null;
    }
    /**
     * @since Available in iOS 10.3 and later.
     */
    public NSSet<NSManagedObjectID> getDeletedObjectIDs() {
        if (has(Keys.DeletedObjectIDs())) {
            NSSet<NSManagedObjectID> val = (NSSet<NSManagedObjectID>) get(Keys.DeletedObjectIDs());
            return val;
        }
        return null;
    }
    /**
     * @since Available in iOS 10.3 and later.
     */
    public NSSet<NSManagedObjectID> getRefreshedObjectIDs() {
        if (has(Keys.RefreshedObjectIDs())) {
            NSSet<NSManagedObjectID> val = (NSSet<NSManagedObjectID>) get(Keys.RefreshedObjectIDs());
            return val;
        }
        return null;
    }
    /**
     * @since Available in iOS 10.3 and later.
     */
    public NSSet<NSManagedObjectID> getInvalidatedObjectIDs() {
        if (has(Keys.InvalidatedObjectIDs())) {
            NSSet<NSManagedObjectID> val = (NSSet<NSManagedObjectID>) get(Keys.InvalidatedObjectIDs());
            return val;
        }
        return null;
    }
    /*</methods>*/
    
    /*<keys>*/
    @Library("CoreData")
    public static class Keys {
        static { Bro.bind(Keys.class); }
        /**
         * @since Available in iOS 10.3 and later.
         */
        @GlobalValue(symbol="NSInsertedObjectIDsKey", optional=true)
        public static native NSString InsertedObjectIDs();
        /**
         * @since Available in iOS 10.3 and later.
         */
        @GlobalValue(symbol="NSUpdatedObjectIDsKey", optional=true)
        public static native NSString UpdatedObjectIDs();
        /**
         * @since Available in iOS 10.3 and later.
         */
        @GlobalValue(symbol="NSDeletedObjectIDsKey", optional=true)
        public static native NSString DeletedObjectIDs();
        /**
         * @since Available in iOS 10.3 and later.
         */
        @GlobalValue(symbol="NSRefreshedObjectIDsKey", optional=true)
        public static native NSString RefreshedObjectIDs();
        /**
         * @since Available in iOS 10.3 and later.
         */
        @GlobalValue(symbol="NSInvalidatedObjectIDsKey", optional=true)
        public static native NSString InvalidatedObjectIDs();
    }
    /*</keys>*/
}
