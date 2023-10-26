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
@Marshaler(/*<name>*/NSURLFileProtection/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSURLFileProtection/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/NSURLFileProtection/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static NSURLFileProtection toObject(Class<NSURLFileProtection> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return NSURLFileProtection.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(NSURLFileProtection o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<NSURLFileProtection> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<NSURLFileProtection> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(NSURLFileProtection.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<NSURLFileProtection> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (NSURLFileProtection o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final NSURLFileProtection None = new NSURLFileProtection("None");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final NSURLFileProtection Complete = new NSURLFileProtection("Complete");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final NSURLFileProtection CompleteUnlessOpen = new NSURLFileProtection("CompleteUnlessOpen");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final NSURLFileProtection CompleteUntilFirstUserAuthentication = new NSURLFileProtection("CompleteUntilFirstUserAuthentication");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final NSURLFileProtection CompleteWhenUserInactive = new NSURLFileProtection("CompleteWhenUserInactive");
    /*</constants>*/
    
    private static /*<name>*/NSURLFileProtection/*</name>*/[] values = new /*<name>*/NSURLFileProtection/*</name>*/[] {/*<value_list>*/None, Complete, CompleteUnlessOpen, CompleteUntilFirstUserAuthentication, CompleteWhenUserInactive/*</value_list>*/};
    
    /*<name>*/NSURLFileProtection/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/NSURLFileProtection/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/NSURLFileProtection/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/NSURLFileProtection/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("Foundation") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="NSURLFileProtectionNone", optional=true)
        public static native NSString None();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="NSURLFileProtectionComplete", optional=true)
        public static native NSString Complete();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="NSURLFileProtectionCompleteUnlessOpen", optional=true)
        public static native NSString CompleteUnlessOpen();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="NSURLFileProtectionCompleteUntilFirstUserAuthentication", optional=true)
        public static native NSString CompleteUntilFirstUserAuthentication();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="NSURLFileProtectionCompleteWhenUserInactive", optional=true)
        public static native NSString CompleteWhenUserInactive();
        /*</values>*/
    }
}
