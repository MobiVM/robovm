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
@Marshaler(/*<name>*/ASAuthorizationProviderAuthorizationOperation/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ASAuthorizationProviderAuthorizationOperation/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/ASAuthorizationProviderAuthorizationOperation/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static ASAuthorizationProviderAuthorizationOperation toObject(Class<ASAuthorizationProviderAuthorizationOperation> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return ASAuthorizationProviderAuthorizationOperation.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(ASAuthorizationProviderAuthorizationOperation o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<ASAuthorizationProviderAuthorizationOperation> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<ASAuthorizationProviderAuthorizationOperation> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(ASAuthorizationProviderAuthorizationOperation.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<ASAuthorizationProviderAuthorizationOperation> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (ASAuthorizationProviderAuthorizationOperation o : l) {
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
    public static final ASAuthorizationProviderAuthorizationOperation ConfigurationRemoved = new ASAuthorizationProviderAuthorizationOperation("ConfigurationRemoved");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final ASAuthorizationProviderAuthorizationOperation DirectRequest = new ASAuthorizationProviderAuthorizationOperation("DirectRequest");
    /*</constants>*/
    
    private static /*<name>*/ASAuthorizationProviderAuthorizationOperation/*</name>*/[] values = new /*<name>*/ASAuthorizationProviderAuthorizationOperation/*</name>*/[] {/*<value_list>*/ConfigurationRemoved, DirectRequest/*</value_list>*/};
    
    /*<name>*/ASAuthorizationProviderAuthorizationOperation/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/ASAuthorizationProviderAuthorizationOperation/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/ASAuthorizationProviderAuthorizationOperation/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/ASAuthorizationProviderAuthorizationOperation/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("AuthenticationServices") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="ASAuthorizationProviderAuthorizationOperationConfigurationRemoved", optional=true)
        public static native NSString ConfigurationRemoved();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="ASAuthorizationProviderAuthorizationOperationDirectRequest", optional=true)
        public static native NSString DirectRequest();
        /*</values>*/
    }
}
