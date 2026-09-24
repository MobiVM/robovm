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
package org.robovm.apple.authservices;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("AuthenticationServices") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/ASAuthorizationOpenIDOperation/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ASAuthorizationOpenIDOperation/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/ASAuthorizationOpenIDOperation/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static ASAuthorizationOpenIDOperation toObject(Class<ASAuthorizationOpenIDOperation> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return ASAuthorizationOpenIDOperation.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(ASAuthorizationOpenIDOperation o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<ASAuthorizationOpenIDOperation> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<ASAuthorizationOpenIDOperation> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(ASAuthorizationOpenIDOperation.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<ASAuthorizationOpenIDOperation> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (ASAuthorizationOpenIDOperation o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final ASAuthorizationOpenIDOperation Implicit = new ASAuthorizationOpenIDOperation("Implicit");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final ASAuthorizationOpenIDOperation Login = new ASAuthorizationOpenIDOperation("Login");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final ASAuthorizationOpenIDOperation Refresh = new ASAuthorizationOpenIDOperation("Refresh");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final ASAuthorizationOpenIDOperation Logout = new ASAuthorizationOpenIDOperation("Logout");
    /*</constants>*/
    
    private static /*<name>*/ASAuthorizationOpenIDOperation/*</name>*/[] values = new /*<name>*/ASAuthorizationOpenIDOperation/*</name>*/[] {/*<value_list>*/Implicit, Login, Refresh, Logout/*</value_list>*/};
    
    /*<name>*/ASAuthorizationOpenIDOperation/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/ASAuthorizationOpenIDOperation/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/ASAuthorizationOpenIDOperation/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/ASAuthorizationOpenIDOperation/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("AuthenticationServices") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="ASAuthorizationOperationImplicit", optional=true)
        public static native NSString Implicit();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="ASAuthorizationOperationLogin", optional=true)
        public static native NSString Login();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="ASAuthorizationOperationRefresh", optional=true)
        public static native NSString Refresh();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="ASAuthorizationOperationLogout", optional=true)
        public static native NSString Logout();
        /*</values>*/
    }
}
