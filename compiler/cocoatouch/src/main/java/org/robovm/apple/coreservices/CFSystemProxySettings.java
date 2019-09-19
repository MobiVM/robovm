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
@Marshaler(/*<name>*/CFSystemProxySettings/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CFSystemProxySettings/*</name>*/ 
    extends /*<extends>*/CFDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CFSystemProxySettings toObject(Class<CFSystemProxySettings> cls, long handle, long flags) {
            CFDictionary o = (CFDictionary) CFType.Marshaler.toObject(CFDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new CFSystemProxySettings(o);
        }
        @MarshalsPointer
        public static long toNative(CFSystemProxySettings o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CFSystemProxySettings> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(CFArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CFSystemProxySettings> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new CFSystemProxySettings(o.get(i, CFDictionary.class)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CFSystemProxySettings> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray array = CFMutableArray.create();
            for (CFSystemProxySettings i : l) {
                array.add(i.getDictionary());
            }
            return CFType.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    CFSystemProxySettings(CFDictionary data) {
        super(data);
    }
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
    

    public boolean isHTTPProxyEnabled() {
        if (has(Keys.HTTPEnable())) {
            CFBoolean val = get(Keys.HTTPEnable(), CFBoolean.class);
            return val.booleanValue();
        }
        return false;
    }
    public int getHTTPProxyPort() {
        if (has(Keys.HTTPPort())) {
            CFNumber val = get(Keys.HTTPPort(), CFNumber.class);
            return val.intValue();
        }
        return 0;
    }
    public String getHTTPProxyHost() {
        if (has(Keys.HTTPProxy())) {
            CFString val = get(Keys.HTTPProxy(), CFString.class);
            return val.toString();
        }
        return null;
    }
    public boolean isAutoConfigurationEnabled() {
        if (has(Keys.ProxyAutoConfigEnable())) {
            CFBoolean val = get(Keys.ProxyAutoConfigEnable(), CFBoolean.class);
            return val.booleanValue();
        }
        return false;
    }
    public String getAutoConfigurationURL() {
        if (has(Keys.ProxyAutoConfigURLString())) {
            CFString val = get(Keys.ProxyAutoConfigURLString(), CFString.class);
            return val.toString();
        }
        return null;
    }
    public String getAutoConfigurationJavaScript() {
        if (has(Keys.ProxyAutoConfigJavaScript())) {
            CFString val = get(Keys.ProxyAutoConfigJavaScript(), CFString.class);
            return val.toString();
        }
        return null;
    }
    /*</methods>*/
    
    /*<keys>*/
    @Library("CFNetwork")
    public static class Keys {
        static { Bro.bind(Keys.class); }
        @GlobalValue(symbol="kCFNetworkProxiesHTTPEnable", optional=true)
        public static native CFString HTTPEnable();
        @GlobalValue(symbol="kCFNetworkProxiesHTTPPort", optional=true)
        public static native CFString HTTPPort();
        @GlobalValue(symbol="kCFNetworkProxiesHTTPProxy", optional=true)
        public static native CFString HTTPProxy();
        @GlobalValue(symbol="kCFNetworkProxiesProxyAutoConfigEnable", optional=true)
        public static native CFString ProxyAutoConfigEnable();
        @GlobalValue(symbol="kCFNetworkProxiesProxyAutoConfigURLString", optional=true)
        public static native CFString ProxyAutoConfigURLString();
        @GlobalValue(symbol="kCFNetworkProxiesProxyAutoConfigJavaScript", optional=true)
        public static native CFString ProxyAutoConfigJavaScript();
    }
    /*</keys>*/
}
