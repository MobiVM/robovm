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
package org.robovm.apple.coreservices;

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
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CFNetwork")/*</annotations>*/
@Marshaler(/*<name>*/CFStreamSSLSettings/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CFStreamSSLSettings/*</name>*/ 
    extends /*<extends>*/CFDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CFStreamSSLSettings toObject(Class<CFStreamSSLSettings> cls, long handle, long flags) {
            CFDictionary o = (CFDictionary) CFType.Marshaler.toObject(CFDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new CFStreamSSLSettings(o);
        }
        @MarshalsPointer
        public static long toNative(CFStreamSSLSettings o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CFStreamSSLSettings> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(CFArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CFStreamSSLSettings> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new CFStreamSSLSettings(o.get(i, CFDictionary.class)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CFStreamSSLSettings> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray array = CFMutableArray.create();
            for (CFStreamSSLSettings i : l) {
                array.add(i.getDictionary());
            }
            return CFType.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    CFStreamSSLSettings(CFDictionary data) {
        super(data);
    }
    public CFStreamSSLSettings() {}
    /*</constructors>*/

    /*<methods>*/
    public boolean has(CFString key) {
        return data.containsKey(key);
    }
    public <T extends NativeObject> T get(CFString key, Class<T> type) {
        if (has(key)) {
            return data.get(key, type);
        }
        return null;
    }
    public CFStreamSSLSettings set(CFString key, NativeObject value) {
        data.put(key, value);
        return this;
    }
    

    public boolean isValidatesCertificateChain() {
        if (has(Keys.ValidatesCertificateChain())) {
            CFBoolean val = get(Keys.ValidatesCertificateChain(), CFBoolean.class);
            return val.booleanValue();
        }
        return false;
    }
    public CFStreamSSLSettings setValidatesCertificateChain(boolean validatesCertificateChain) {
        set(Keys.ValidatesCertificateChain(), CFBoolean.valueOf(validatesCertificateChain));
        return this;
    }
    public CFStreamSocketSecurityLevel getSecurityLevel() {
        if (has(Keys.Level())) {
            CFString val = get(Keys.Level(), CFString.class);
            return CFStreamSocketSecurityLevel.valueOf(val);
        }
        return null;
    }
    public CFStreamSSLSettings setSecurityLevel(CFStreamSocketSecurityLevel securityLevel) {
        set(Keys.Level(), securityLevel.value());
        return this;
    }
    public String getPeerName() {
        if (has(Keys.PeerName())) {
            CFString val = get(Keys.PeerName(), CFString.class);
            return val.toString();
        }
        return null;
    }
    public CFStreamSSLSettings setPeerName(String peerName) {
        set(Keys.PeerName(), new CFString(peerName));
        return this;
    }
    public NSArray<?> getCertificates() {
        if (has(Keys.Certificates())) {
            NSArray<?> val = get(Keys.Certificates(), NSArray.class);
            return val;
        }
        return null;
    }
    public CFStreamSSLSettings setCertificates(NSArray<?> certificates) {
        set(Keys.Certificates(), certificates);
        return this;
    }
    public boolean isServer() {
        if (has(Keys.IsServer())) {
            CFBoolean val = get(Keys.IsServer(), CFBoolean.class);
            return val.booleanValue();
        }
        return false;
    }
    public CFStreamSSLSettings setIsServer(boolean isServer) {
        set(Keys.IsServer(), CFBoolean.valueOf(isServer));
        return this;
    }
    /*</methods>*/
    
    /*<keys>*/
    @Library("CFNetwork")
    public static class Keys {
        static { Bro.bind(Keys.class); }
        @GlobalValue(symbol="kCFStreamSSLValidatesCertificateChain", optional=true)
        public static native CFString ValidatesCertificateChain();
        @GlobalValue(symbol="kCFStreamSSLLevel", optional=true)
        public static native CFString Level();
        @GlobalValue(symbol="kCFStreamSSLPeerName", optional=true)
        public static native CFString PeerName();
        @GlobalValue(symbol="kCFStreamSSLCertificates", optional=true)
        public static native CFString Certificates();
        @GlobalValue(symbol="kCFStreamSSLIsServer", optional=true)
        public static native CFString IsServer();
    }
    /*</keys>*/
}
