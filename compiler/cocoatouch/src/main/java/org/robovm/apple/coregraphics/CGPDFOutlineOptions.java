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
@Marshaler(/*<name>*/CGPDFOutlineOptions/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CGPDFOutlineOptions/*</name>*/ 
    extends /*<extends>*/CFDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CGPDFOutlineOptions toObject(Class<CGPDFOutlineOptions> cls, long handle, long flags) {
            CFDictionary o = (CFDictionary) CFType.Marshaler.toObject(CFDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new CGPDFOutlineOptions(o);
        }
        @MarshalsPointer
        public static long toNative(CGPDFOutlineOptions o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CGPDFOutlineOptions> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(CFArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CGPDFOutlineOptions> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new CGPDFOutlineOptions(o.get(i, CFDictionary.class)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CGPDFOutlineOptions> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray array = CFMutableArray.create();
            for (CGPDFOutlineOptions i : l) {
                array.add(i.getDictionary());
            }
            return CFType.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    CGPDFOutlineOptions(CFDictionary data) {
        super(data);
    }
    public CGPDFOutlineOptions() {}
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
    public CGPDFOutlineOptions set(CFString key, NativeObject value) {
        data.put(key, value);
        return this;
    }
    

    /**
     * @since Available in iOS 11.0 and later.
     */
    public String getTitle() {
        if (has(Keys.Title())) {
            CFString val = get(Keys.Title(), CFString.class);
            return val.toString();
        }
        return null;
    }
    /**
     * @since Available in iOS 11.0 and later.
     */
    public CGPDFOutlineOptions setTitle(String title) {
        set(Keys.Title(), new CFString(title));
        return this;
    }
    /**
     * @since Available in iOS 11.0 and later.
     */
    public NSArray getChildren() {
        if (has(Keys.Children())) {
            NSArray val = get(Keys.Children(), NSArray.class);
            return val;
        }
        return null;
    }
    /**
     * @since Available in iOS 11.0 and later.
     */
    public CGPDFOutlineOptions setChildren(NSArray children) {
        set(Keys.Children(), children);
        return this;
    }
    /**
     * @since Available in iOS 11.0 and later.
     */
    public NSObject getDestination() {
        if (has(Keys.Destination())) {
            NSObject val = get(Keys.Destination(), NSObject.class);
            return val;
        }
        return null;
    }
    /**
     * @since Available in iOS 11.0 and later.
     */
    public CGPDFOutlineOptions setDestination(NSObject destination) {
        set(Keys.Destination(), destination);
        return this;
    }
    /**
     * @since Available in iOS 11.0 and later.
     */
    public NSDictionary getDestinationRect() {
        if (has(Keys.DestinationRect())) {
            NSDictionary val = get(Keys.DestinationRect(), NSDictionary.class);
            return val;
        }
        return null;
    }
    /**
     * @since Available in iOS 11.0 and later.
     */
    public CGPDFOutlineOptions setDestinationRect(NSDictionary destinationRect) {
        set(Keys.DestinationRect(), destinationRect);
        return this;
    }
    /*</methods>*/
    
    /*<keys>*/
    @Library("CoreGraphics")
    public static class Keys {
        static { Bro.bind(Keys.class); }
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kCGPDFOutlineTitle", optional=true)
        public static native CFString Title();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kCGPDFOutlineChildren", optional=true)
        public static native CFString Children();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kCGPDFOutlineDestination", optional=true)
        public static native CFString Destination();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kCGPDFOutlineDestinationRect", optional=true)
        public static native CFString DestinationRect();
    }
    /*</keys>*/
}
