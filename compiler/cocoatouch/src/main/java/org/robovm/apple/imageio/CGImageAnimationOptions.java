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
package org.robovm.apple.imageio;

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
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("ImageIO")/*</annotations>*/
@Marshaler(/*<name>*/CGImageAnimationOptions/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CGImageAnimationOptions/*</name>*/ 
    extends /*<extends>*/CFDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CGImageAnimationOptions toObject(Class<CGImageAnimationOptions> cls, long handle, long flags) {
            CFDictionary o = (CFDictionary) CFType.Marshaler.toObject(CFDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new CGImageAnimationOptions(o);
        }
        @MarshalsPointer
        public static long toNative(CGImageAnimationOptions o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CGImageAnimationOptions> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(CFArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CGImageAnimationOptions> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new CGImageAnimationOptions(o.get(i, CFDictionary.class)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CGImageAnimationOptions> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray array = CFMutableArray.create();
            for (CGImageAnimationOptions i : l) {
                array.add(i.getDictionary());
            }
            return CFType.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    CGImageAnimationOptions(CFDictionary data) {
        super(data);
    }
    public CGImageAnimationOptions() {}
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
    public CGImageAnimationOptions set(CFString key, NativeObject value) {
        data.put(key, value);
        return this;
    }
    

    /**
     * @since Available in iOS 13.0 and later.
     */
    public CFNumber getStartIndex() {
        if (has(Keys.StartIndex())) {
            CFNumber val = get(Keys.StartIndex(), CFNumber.class);
            return val;
        }
        return null;
    }
    /**
     * @since Available in iOS 13.0 and later.
     */
    public CGImageAnimationOptions setStartIndex(CFNumber startIndex) {
        set(Keys.StartIndex(), startIndex);
        return this;
    }
    /**
     * @since Available in iOS 13.0 and later.
     */
    public CFNumber getDelayTime() {
        if (has(Keys.DelayTime())) {
            CFNumber val = get(Keys.DelayTime(), CFNumber.class);
            return val;
        }
        return null;
    }
    /**
     * @since Available in iOS 13.0 and later.
     */
    public CGImageAnimationOptions setDelayTime(CFNumber delayTime) {
        set(Keys.DelayTime(), delayTime);
        return this;
    }
    /**
     * @since Available in iOS 13.0 and later.
     */
    public CFNumber getLoopCount() {
        if (has(Keys.LoopCount())) {
            CFNumber val = get(Keys.LoopCount(), CFNumber.class);
            return val;
        }
        return null;
    }
    /**
     * @since Available in iOS 13.0 and later.
     */
    public CGImageAnimationOptions setLoopCount(CFNumber loopCount) {
        set(Keys.LoopCount(), loopCount);
        return this;
    }
    /*</methods>*/
    
    /*<keys>*/
    @Library("ImageIO")
    public static class Keys {
        static { Bro.bind(Keys.class); }
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="kCGImageAnimationStartIndex", optional=true)
        public static native CFString StartIndex();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="kCGImageAnimationDelayTime", optional=true)
        public static native CFString DelayTime();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="kCGImageAnimationLoopCount", optional=true)
        public static native CFString LoopCount();
    }
    /*</keys>*/
}
