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
/*<annotations>*/@Library("Foundation") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/NSURLUbiquitousSharedItem/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSURLUbiquitousSharedItem/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/NSURLUbiquitousSharedItem/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static NSURLUbiquitousSharedItem toObject(Class<NSURLUbiquitousSharedItem> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return NSURLUbiquitousSharedItem.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(NSURLUbiquitousSharedItem o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<NSURLUbiquitousSharedItem> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<NSURLUbiquitousSharedItem> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(NSURLUbiquitousSharedItem.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<NSURLUbiquitousSharedItem> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (NSURLUbiquitousSharedItem o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final NSURLUbiquitousSharedItem CurrentUserRoleKey = new NSURLUbiquitousSharedItem("CurrentUserRoleKey");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final NSURLUbiquitousSharedItem CurrentUserPermissionsKey = new NSURLUbiquitousSharedItem("CurrentUserPermissionsKey");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final NSURLUbiquitousSharedItem OwnerNameComponentsKey = new NSURLUbiquitousSharedItem("OwnerNameComponentsKey");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final NSURLUbiquitousSharedItem MostRecentEditorNameComponentsKey = new NSURLUbiquitousSharedItem("MostRecentEditorNameComponentsKey");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final NSURLUbiquitousSharedItem RoleOwner = new NSURLUbiquitousSharedItem("RoleOwner");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final NSURLUbiquitousSharedItem RoleParticipant = new NSURLUbiquitousSharedItem("RoleParticipant");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final NSURLUbiquitousSharedItem PermissionsReadOnly = new NSURLUbiquitousSharedItem("PermissionsReadOnly");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final NSURLUbiquitousSharedItem PermissionsReadWrite = new NSURLUbiquitousSharedItem("PermissionsReadWrite");
    /*</constants>*/
    
    private static /*<name>*/NSURLUbiquitousSharedItem/*</name>*/[] values = new /*<name>*/NSURLUbiquitousSharedItem/*</name>*/[] {/*<value_list>*/CurrentUserRoleKey, CurrentUserPermissionsKey, OwnerNameComponentsKey, MostRecentEditorNameComponentsKey, RoleOwner, RoleParticipant, PermissionsReadOnly, PermissionsReadWrite/*</value_list>*/};
    
    /*<name>*/NSURLUbiquitousSharedItem/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/NSURLUbiquitousSharedItem/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/NSURLUbiquitousSharedItem/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/NSURLUbiquitousSharedItem/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("Foundation") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="NSURLUbiquitousSharedItemCurrentUserRoleKey", optional=true)
        public static native NSString CurrentUserRoleKey();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="NSURLUbiquitousSharedItemCurrentUserPermissionsKey", optional=true)
        public static native NSString CurrentUserPermissionsKey();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="NSURLUbiquitousSharedItemOwnerNameComponentsKey", optional=true)
        public static native NSString OwnerNameComponentsKey();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="NSURLUbiquitousSharedItemMostRecentEditorNameComponentsKey", optional=true)
        public static native NSString MostRecentEditorNameComponentsKey();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="NSURLUbiquitousSharedItemRoleOwner", optional=true)
        public static native NSString RoleOwner();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="NSURLUbiquitousSharedItemRoleParticipant", optional=true)
        public static native NSString RoleParticipant();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="NSURLUbiquitousSharedItemPermissionsReadOnly", optional=true)
        public static native NSString PermissionsReadOnly();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="NSURLUbiquitousSharedItemPermissionsReadWrite", optional=true)
        public static native NSString PermissionsReadWrite();
        /*</values>*/
    }
}
