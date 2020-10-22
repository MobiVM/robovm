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
package org.robovm.apple.coregraphics;

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
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreGraphics")/*</annotations>*/
@Marshaler(/*<name>*/CGPDFContextOutputIntent/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CGPDFContextOutputIntent/*</name>*/ 
    extends /*<extends>*/CFDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CGPDFContextOutputIntent toObject(Class<CGPDFContextOutputIntent> cls, long handle, long flags) {
            CFDictionary o = (CFDictionary) CFType.Marshaler.toObject(CFDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new CGPDFContextOutputIntent(o);
        }
        @MarshalsPointer
        public static long toNative(CGPDFContextOutputIntent o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CGPDFContextOutputIntent> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(CFArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CGPDFContextOutputIntent> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new CGPDFContextOutputIntent(o.get(i, CFDictionary.class)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CGPDFContextOutputIntent> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray array = CFMutableArray.create();
            for (CGPDFContextOutputIntent i : l) {
                array.add(i.getDictionary());
            }
            return CFType.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    CGPDFContextOutputIntent(CFDictionary data) {
        super(data);
    }
    public CGPDFContextOutputIntent() {}
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
    public CGPDFContextOutputIntent set(CFString key, NativeObject value) {
        data.put(key, value);
        return this;
    }
    

    /**
     * @since Available in iOS 14.0 and later.
     */
    public String getOutputIntentSubtype() {
        if (has(Keys.OutputIntentSubtype())) {
            CFString val = get(Keys.OutputIntentSubtype(), CFString.class);
            return val.toString();
        }
        return null;
    }
    /**
     * @since Available in iOS 14.0 and later.
     */
    public CGPDFContextOutputIntent setOutputIntentSubtype(String outputIntentSubtype) {
        set(Keys.OutputIntentSubtype(), new CFString(outputIntentSubtype));
        return this;
    }
    /**
     * @since Available in iOS 14.0 and later.
     */
    public String getOutputConditionIdentifier() {
        if (has(Keys.OutputConditionIdentifier())) {
            CFString val = get(Keys.OutputConditionIdentifier(), CFString.class);
            return val.toString();
        }
        return null;
    }
    /**
     * @since Available in iOS 14.0 and later.
     */
    public CGPDFContextOutputIntent setOutputConditionIdentifier(String outputConditionIdentifier) {
        set(Keys.OutputConditionIdentifier(), new CFString(outputConditionIdentifier));
        return this;
    }
    /**
     * @since Available in iOS 14.0 and later.
     */
    public String getOutputCondition() {
        if (has(Keys.OutputCondition())) {
            CFString val = get(Keys.OutputCondition(), CFString.class);
            return val.toString();
        }
        return null;
    }
    /**
     * @since Available in iOS 14.0 and later.
     */
    public CGPDFContextOutputIntent setOutputCondition(String outputCondition) {
        set(Keys.OutputCondition(), new CFString(outputCondition));
        return this;
    }
    /**
     * @since Available in iOS 14.0 and later.
     */
    public String getRegistryName() {
        if (has(Keys.RegistryName())) {
            CFString val = get(Keys.RegistryName(), CFString.class);
            return val.toString();
        }
        return null;
    }
    /**
     * @since Available in iOS 14.0 and later.
     */
    public CGPDFContextOutputIntent setRegistryName(String registryName) {
        set(Keys.RegistryName(), new CFString(registryName));
        return this;
    }
    /**
     * @since Available in iOS 14.0 and later.
     */
    public String getInfo() {
        if (has(Keys.Info())) {
            CFString val = get(Keys.Info(), CFString.class);
            return val.toString();
        }
        return null;
    }
    /**
     * @since Available in iOS 14.0 and later.
     */
    public CGPDFContextOutputIntent setInfo(String info) {
        set(Keys.Info(), new CFString(info));
        return this;
    }
    /**
     * @since Available in iOS 14.0 and later.
     */
    public CGColorSpace getDestinationOutputProfile() {
        if (has(Keys.DestinationOutputProfile())) {
            CGColorSpace val = get(Keys.DestinationOutputProfile(), CGColorSpace.class);
            return val;
        }
        return null;
    }
    /**
     * @since Available in iOS 14.0 and later.
     */
    public CGPDFContextOutputIntent setDestinationOutputProfile(CGColorSpace destinationOutputProfile) {
        set(Keys.DestinationOutputProfile(), destinationOutputProfile);
        return this;
    }
    /*</methods>*/
    
    /*<keys>*/
    @Library("CoreGraphics")
    public static class Keys {
        static { Bro.bind(Keys.class); }
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="kCGPDFXOutputIntentSubtype", optional=true)
        public static native CFString OutputIntentSubtype();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="kCGPDFXOutputConditionIdentifier", optional=true)
        public static native CFString OutputConditionIdentifier();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="kCGPDFXOutputCondition", optional=true)
        public static native CFString OutputCondition();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="kCGPDFXRegistryName", optional=true)
        public static native CFString RegistryName();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="kCGPDFXInfo", optional=true)
        public static native CFString Info();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="kCGPDFXDestinationOutputProfile", optional=true)
        public static native CFString DestinationOutputProfile();
    }
    /*</keys>*/
}
