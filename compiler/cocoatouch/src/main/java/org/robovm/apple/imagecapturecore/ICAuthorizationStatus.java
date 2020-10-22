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
package org.robovm.apple.imagecapturecore;

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
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("ImageCaptureCore") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/ICAuthorizationStatus/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ICAuthorizationStatus/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/ICAuthorizationStatus/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static ICAuthorizationStatus toObject(Class<ICAuthorizationStatus> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return ICAuthorizationStatus.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(ICAuthorizationStatus o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<ICAuthorizationStatus> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<ICAuthorizationStatus> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(ICAuthorizationStatus.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<ICAuthorizationStatus> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (ICAuthorizationStatus o : l) {
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
    public static final ICAuthorizationStatus NotDetermined = new ICAuthorizationStatus("NotDetermined");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final ICAuthorizationStatus Restricted = new ICAuthorizationStatus("Restricted");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final ICAuthorizationStatus Denied = new ICAuthorizationStatus("Denied");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final ICAuthorizationStatus Authorized = new ICAuthorizationStatus("Authorized");
    /*</constants>*/
    
    private static /*<name>*/ICAuthorizationStatus/*</name>*/[] values = new /*<name>*/ICAuthorizationStatus/*</name>*/[] {/*<value_list>*/NotDetermined, Restricted, Denied, Authorized/*</value_list>*/};
    
    /*<name>*/ICAuthorizationStatus/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/ICAuthorizationStatus/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/ICAuthorizationStatus/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/ICAuthorizationStatus/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("ImageCaptureCore") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="ICAuthorizationStatusNotDetermined", optional=true)
        public static native NSString NotDetermined();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="ICAuthorizationStatusRestricted", optional=true)
        public static native NSString Restricted();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="ICAuthorizationStatusDenied", optional=true)
        public static native NSString Denied();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="ICAuthorizationStatusAuthorized", optional=true)
        public static native NSString Authorized();
        /*</values>*/
    }
}
