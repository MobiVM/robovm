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
/*<annotations>*/@Library("PassKit") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/PKPaymentNetwork/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PKPaymentNetwork/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/PKPaymentNetwork/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static PKPaymentNetwork toObject(Class<PKPaymentNetwork> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return PKPaymentNetwork.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(PKPaymentNetwork o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<PKPaymentNetwork> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<PKPaymentNetwork> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(PKPaymentNetwork.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<PKPaymentNetwork> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (PKPaymentNetwork o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final PKPaymentNetwork Amex = new PKPaymentNetwork("Amex");
    /**
     * @since Available in iOS 10.3 and later.
     * @deprecated Deprecated in iOS 11.0. Use PKPaymentNetworkCartesBancaires instead.
     */
    @Deprecated
    public static final PKPaymentNetwork CarteBancaire = new PKPaymentNetwork("CarteBancaire");
    /**
     * @since Available in iOS 11.0 and later.
     * @deprecated Deprecated in iOS 11.2. Use PKPaymentNetworkCartesBancaires instead.
     */
    @Deprecated
    public static final PKPaymentNetwork CarteBancaires = new PKPaymentNetwork("CarteBancaires");
    /**
     * @since Available in iOS 11.2 and later.
     */
    public static final PKPaymentNetwork CartesBancaires = new PKPaymentNetwork("CartesBancaires");
    /**
     * @since Available in iOS 9.2 and later.
     */
    public static final PKPaymentNetwork ChinaUnionPay = new PKPaymentNetwork("ChinaUnionPay");
    /**
     * @since Available in iOS 15.1 and later.
     */
    public static final PKPaymentNetwork Dankort = new PKPaymentNetwork("Dankort");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final PKPaymentNetwork Discover = new PKPaymentNetwork("Discover");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final PKPaymentNetwork Eftpos = new PKPaymentNetwork("Eftpos");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final PKPaymentNetwork Electron = new PKPaymentNetwork("Electron");
    public static final PKPaymentNetwork Elo = new PKPaymentNetwork("Elo");
    /**
     * @since Available in iOS 10.3 and later.
     */
    public static final PKPaymentNetwork IDCredit = new PKPaymentNetwork("IDCredit");
    /**
     * @since Available in iOS 9.2 and later.
     */
    public static final PKPaymentNetwork Interac = new PKPaymentNetwork("Interac");
    /**
     * @since Available in iOS 10.1 and later.
     */
    public static final PKPaymentNetwork JCB = new PKPaymentNetwork("JCB");
    public static final PKPaymentNetwork Mada = new PKPaymentNetwork("Mada");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final PKPaymentNetwork Maestro = new PKPaymentNetwork("Maestro");
    public static final PKPaymentNetwork MasterCard = new PKPaymentNetwork("MasterCard");
    /**
     * @since Available in iOS 14.5 and later.
     */
    public static final PKPaymentNetwork Mir = new PKPaymentNetwork("Mir");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final PKPaymentNetwork PrivateLabel = new PKPaymentNetwork("PrivateLabel");
    /**
     * @since Available in iOS 10.3 and later.
     */
    public static final PKPaymentNetwork QuicPay = new PKPaymentNetwork("QuicPay");
    /**
     * @since Available in iOS 10.1 and later.
     */
    public static final PKPaymentNetwork Suica = new PKPaymentNetwork("Suica");
    public static final PKPaymentNetwork Visa = new PKPaymentNetwork("Visa");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final PKPaymentNetwork VPay = new PKPaymentNetwork("VPay");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final PKPaymentNetwork Barcode = new PKPaymentNetwork("Barcode");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final PKPaymentNetwork Girocard = new PKPaymentNetwork("Girocard");
    /**
     * @since Available in iOS 15.0 and later.
     */
    public static final PKPaymentNetwork Waon = new PKPaymentNetwork("Waon");
    /**
     * @since Available in iOS 15.0 and later.
     */
    public static final PKPaymentNetwork Nanaco = new PKPaymentNetwork("Nanaco");
    /*</constants>*/
    
    private static /*<name>*/PKPaymentNetwork/*</name>*/[] values = new /*<name>*/PKPaymentNetwork/*</name>*/[] {/*<value_list>*/Amex, CarteBancaire, CarteBancaires, CartesBancaires, ChinaUnionPay, Dankort, Discover, Eftpos, Electron, Elo, IDCredit, Interac, JCB, Mada, Maestro, MasterCard, Mir, PrivateLabel, QuicPay, Suica, Visa, VPay, Barcode, Girocard, Waon, Nanaco/*</value_list>*/};
    
    /*<name>*/PKPaymentNetwork/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/PKPaymentNetwork/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/PKPaymentNetwork/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/PKPaymentNetwork/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("PassKit") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="PKPaymentNetworkAmex", optional=true)
        public static native NSString Amex();
        /**
         * @since Available in iOS 10.3 and later.
         * @deprecated Deprecated in iOS 11.0. Use PKPaymentNetworkCartesBancaires instead.
         */
        @Deprecated
        @GlobalValue(symbol="PKPaymentNetworkCarteBancaire", optional=true)
        public static native NSString CarteBancaire();
        /**
         * @since Available in iOS 11.0 and later.
         * @deprecated Deprecated in iOS 11.2. Use PKPaymentNetworkCartesBancaires instead.
         */
        @Deprecated
        @GlobalValue(symbol="PKPaymentNetworkCarteBancaires", optional=true)
        public static native NSString CarteBancaires();
        /**
         * @since Available in iOS 11.2 and later.
         */
        @GlobalValue(symbol="PKPaymentNetworkCartesBancaires", optional=true)
        public static native NSString CartesBancaires();
        /**
         * @since Available in iOS 9.2 and later.
         */
        @GlobalValue(symbol="PKPaymentNetworkChinaUnionPay", optional=true)
        public static native NSString ChinaUnionPay();
        /**
         * @since Available in iOS 15.1 and later.
         */
        @GlobalValue(symbol="PKPaymentNetworkDankort", optional=true)
        public static native NSString Dankort();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="PKPaymentNetworkDiscover", optional=true)
        public static native NSString Discover();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="PKPaymentNetworkEftpos", optional=true)
        public static native NSString Eftpos();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="PKPaymentNetworkElectron", optional=true)
        public static native NSString Electron();
        @GlobalValue(symbol="PKPaymentNetworkElo", optional=true)
        public static native NSString Elo();
        /**
         * @since Available in iOS 10.3 and later.
         */
        @GlobalValue(symbol="PKPaymentNetworkIDCredit", optional=true)
        public static native NSString IDCredit();
        /**
         * @since Available in iOS 9.2 and later.
         */
        @GlobalValue(symbol="PKPaymentNetworkInterac", optional=true)
        public static native NSString Interac();
        /**
         * @since Available in iOS 10.1 and later.
         */
        @GlobalValue(symbol="PKPaymentNetworkJCB", optional=true)
        public static native NSString JCB();
        @GlobalValue(symbol="PKPaymentNetworkMada", optional=true)
        public static native NSString Mada();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="PKPaymentNetworkMaestro", optional=true)
        public static native NSString Maestro();
        @GlobalValue(symbol="PKPaymentNetworkMasterCard", optional=true)
        public static native NSString MasterCard();
        /**
         * @since Available in iOS 14.5 and later.
         */
        @GlobalValue(symbol="PKPaymentNetworkMir", optional=true)
        public static native NSString Mir();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="PKPaymentNetworkPrivateLabel", optional=true)
        public static native NSString PrivateLabel();
        /**
         * @since Available in iOS 10.3 and later.
         */
        @GlobalValue(symbol="PKPaymentNetworkQuicPay", optional=true)
        public static native NSString QuicPay();
        /**
         * @since Available in iOS 10.1 and later.
         */
        @GlobalValue(symbol="PKPaymentNetworkSuica", optional=true)
        public static native NSString Suica();
        @GlobalValue(symbol="PKPaymentNetworkVisa", optional=true)
        public static native NSString Visa();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="PKPaymentNetworkVPay", optional=true)
        public static native NSString VPay();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="PKPaymentNetworkBarcode", optional=true)
        public static native NSString Barcode();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="PKPaymentNetworkGirocard", optional=true)
        public static native NSString Girocard();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="PKPaymentNetworkWaon", optional=true)
        public static native NSString Waon();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="PKPaymentNetworkNanaco", optional=true)
        public static native NSString Nanaco();
        /*</values>*/
    }
}
