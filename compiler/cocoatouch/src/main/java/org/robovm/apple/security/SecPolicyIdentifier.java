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
package org.robovm.apple.security;

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
/*<annotations>*/@Library("Security") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/SecPolicyIdentifier/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SecPolicyIdentifier/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<CFType>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/SecPolicyIdentifier/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static SecPolicyIdentifier toObject(Class<SecPolicyIdentifier> cls, long handle, long flags) {
            CFType o = (CFType) CFType.Marshaler.toObject(CFType.class, handle, flags);
            if (o == null) {
                return null;
            }
            return SecPolicyIdentifier.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(SecPolicyIdentifier o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<SecPolicyIdentifier> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(CFArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<SecPolicyIdentifier> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(SecPolicyIdentifier.valueOf(o.get(i, CFType.class)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<SecPolicyIdentifier> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray array = CFMutableArray.create();
            for (SecPolicyIdentifier o : l) {
                array.add(o.value());
            }
            return CFType.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final SecPolicyIdentifier AppleX509Basic = new SecPolicyIdentifier("AppleX509Basic");
    public static final SecPolicyIdentifier AppleSSL = new SecPolicyIdentifier("AppleSSL");
    public static final SecPolicyIdentifier AppleSMIME = new SecPolicyIdentifier("AppleSMIME");
    public static final SecPolicyIdentifier AppleEAP = new SecPolicyIdentifier("AppleEAP");
    public static final SecPolicyIdentifier AppleIPsec = new SecPolicyIdentifier("AppleIPsec");
    public static final SecPolicyIdentifier AppleCodeSigning = new SecPolicyIdentifier("AppleCodeSigning");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final SecPolicyIdentifier MacAppStoreReceipt = new SecPolicyIdentifier("MacAppStoreReceipt");
    public static final SecPolicyIdentifier AppleIDValidation = new SecPolicyIdentifier("AppleIDValidation");
    public static final SecPolicyIdentifier AppleTimeStamping = new SecPolicyIdentifier("AppleTimeStamping");
    public static final SecPolicyIdentifier AppleRevocation = new SecPolicyIdentifier("AppleRevocation");
    public static final SecPolicyIdentifier ApplePassbookSigning = new SecPolicyIdentifier("ApplePassbookSigning");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final SecPolicyIdentifier ApplePayIssuerEncryption = new SecPolicyIdentifier("ApplePayIssuerEncryption");
    public static final SecPolicyIdentifier TeamIdentifier = new SecPolicyIdentifier("TeamIdentifier");
    /*</constants>*/
    
    private static /*<name>*/SecPolicyIdentifier/*</name>*/[] values = new /*<name>*/SecPolicyIdentifier/*</name>*/[] {/*<value_list>*/AppleX509Basic, AppleSSL, AppleSMIME, AppleEAP, AppleIPsec, AppleCodeSigning, MacAppStoreReceipt, AppleIDValidation, AppleTimeStamping, AppleRevocation, ApplePassbookSigning, ApplePayIssuerEncryption, TeamIdentifier/*</value_list>*/};
    
    /*<name>*/SecPolicyIdentifier/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/SecPolicyIdentifier/*</name>*/ valueOf(/*<type>*/CFType/*</type>*/ value) {
        for (/*<name>*/SecPolicyIdentifier/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/SecPolicyIdentifier/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("Security") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="kSecPolicyAppleX509Basic", optional=true)
        public static native CFType AppleX509Basic();
        @GlobalValue(symbol="kSecPolicyAppleSSL", optional=true)
        public static native CFType AppleSSL();
        @GlobalValue(symbol="kSecPolicyAppleSMIME", optional=true)
        public static native CFType AppleSMIME();
        @GlobalValue(symbol="kSecPolicyAppleEAP", optional=true)
        public static native CFType AppleEAP();
        @GlobalValue(symbol="kSecPolicyAppleIPsec", optional=true)
        public static native CFType AppleIPsec();
        @GlobalValue(symbol="kSecPolicyAppleCodeSigning", optional=true)
        public static native CFType AppleCodeSigning();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kSecPolicyMacAppStoreReceipt", optional=true)
        public static native CFType MacAppStoreReceipt();
        @GlobalValue(symbol="kSecPolicyAppleIDValidation", optional=true)
        public static native CFType AppleIDValidation();
        @GlobalValue(symbol="kSecPolicyAppleTimeStamping", optional=true)
        public static native CFType AppleTimeStamping();
        @GlobalValue(symbol="kSecPolicyAppleRevocation", optional=true)
        public static native CFType AppleRevocation();
        @GlobalValue(symbol="kSecPolicyApplePassbookSigning", optional=true)
        public static native CFType ApplePassbookSigning();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kSecPolicyApplePayIssuerEncryption", optional=true)
        public static native CFType ApplePayIssuerEncryption();
        @GlobalValue(symbol="kSecPolicyTeamIdentifier", optional=true)
        public static native CFType TeamIdentifier();
        /*</values>*/
    }
}
