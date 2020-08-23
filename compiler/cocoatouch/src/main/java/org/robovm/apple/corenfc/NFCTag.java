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
package org.robovm.apple.corenfc;

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
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/NFCTag/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol, NSSecureCoding/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "type")
    NFCTagType getType();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "session")
    NFCReaderSession getSession();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "isAvailable")
    boolean isAvailable();
    /*</properties>*/
    /*<methods>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "asNFCISO15693Tag")
    NFCISO15693Tag asNFCISO15693Tag();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "asNFCISO7816Tag")
    NFCISO7816Tag asNFCISO7816Tag();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "asNFCFeliCaTag")
    NFCFeliCaTag asNFCFeliCaTag();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "asNFCMiFareTag")
    NFCMiFareTag asNFCMiFareTag();
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/

    // manually added code!
    class AsListMarshaller {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<NFCTag> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSObject> o = (NSArray<NSObject>) NSObject.Marshaler.toObject(cls, handle, flags);
            if (o == null) {
                return null;
            }
            List<NFCTag> list = new ArrayList<>();
            for (NSObject t : o) {
                NFCTag tag = (NFCTag) ObjCObject.Marshaler.protocolToObject(NFCTag.class, t.getHandle(), 0);
                list.add(tag);
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<NFCTag> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<?> array = new NSArray(l);
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
}
