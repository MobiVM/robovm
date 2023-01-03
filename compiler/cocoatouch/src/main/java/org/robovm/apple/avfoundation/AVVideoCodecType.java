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
package org.robovm.apple.avfoundation;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.mediatoolbox.*;
import org.robovm.apple.audiotoolbox.*;
import org.robovm.apple.coremidi.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/AVVideoCodecType/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVVideoCodecType/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/AVVideoCodecType/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static AVVideoCodecType toObject(Class<AVVideoCodecType> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return AVVideoCodecType.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(AVVideoCodecType o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<AVVideoCodecType> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<AVVideoCodecType> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(AVVideoCodecType.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<AVVideoCodecType> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (AVVideoCodecType o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final AVVideoCodecType AVVideoCodecTypeHEVC = new AVVideoCodecType("AVVideoCodecTypeHEVC");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final AVVideoCodecType AVVideoCodecTypeH264 = new AVVideoCodecType("AVVideoCodecTypeH264");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final AVVideoCodecType AVVideoCodecTypeJPEG = new AVVideoCodecType("AVVideoCodecTypeJPEG");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final AVVideoCodecType AVVideoCodecTypeAppleProRes4444 = new AVVideoCodecType("AVVideoCodecTypeAppleProRes4444");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final AVVideoCodecType AVVideoCodecTypeAppleProRes422 = new AVVideoCodecType("AVVideoCodecTypeAppleProRes422");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final AVVideoCodecType AVVideoCodecTypeAppleProRes422HQ = new AVVideoCodecType("AVVideoCodecTypeAppleProRes422HQ");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final AVVideoCodecType AVVideoCodecTypeAppleProRes422LT = new AVVideoCodecType("AVVideoCodecTypeAppleProRes422LT");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final AVVideoCodecType AVVideoCodecTypeAppleProRes422Proxy = new AVVideoCodecType("AVVideoCodecTypeAppleProRes422Proxy");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final AVVideoCodecType AVVideoCodecTypeHEVCWithAlpha = new AVVideoCodecType("AVVideoCodecTypeHEVCWithAlpha");
    /*</constants>*/
    
    private static /*<name>*/AVVideoCodecType/*</name>*/[] values = new /*<name>*/AVVideoCodecType/*</name>*/[] {/*<value_list>*/AVVideoCodecTypeHEVC, AVVideoCodecTypeH264, AVVideoCodecTypeJPEG, AVVideoCodecTypeAppleProRes4444, AVVideoCodecTypeAppleProRes422, AVVideoCodecTypeAppleProRes422HQ, AVVideoCodecTypeAppleProRes422LT, AVVideoCodecTypeAppleProRes422Proxy, AVVideoCodecTypeHEVCWithAlpha/*</value_list>*/};
    
    /*<name>*/AVVideoCodecType/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/AVVideoCodecType/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/AVVideoCodecType/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/AVVideoCodecType/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("AVFoundation") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="AVVideoCodecTypeHEVC", optional=true)
        public static native NSString AVVideoCodecTypeHEVC();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="AVVideoCodecTypeH264", optional=true)
        public static native NSString AVVideoCodecTypeH264();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="AVVideoCodecTypeJPEG", optional=true)
        public static native NSString AVVideoCodecTypeJPEG();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="AVVideoCodecTypeAppleProRes4444", optional=true)
        public static native NSString AVVideoCodecTypeAppleProRes4444();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="AVVideoCodecTypeAppleProRes422", optional=true)
        public static native NSString AVVideoCodecTypeAppleProRes422();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="AVVideoCodecTypeAppleProRes422HQ", optional=true)
        public static native NSString AVVideoCodecTypeAppleProRes422HQ();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="AVVideoCodecTypeAppleProRes422LT", optional=true)
        public static native NSString AVVideoCodecTypeAppleProRes422LT();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="AVVideoCodecTypeAppleProRes422Proxy", optional=true)
        public static native NSString AVVideoCodecTypeAppleProRes422Proxy();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="AVVideoCodecTypeHEVCWithAlpha", optional=true)
        public static native NSString AVVideoCodecTypeHEVCWithAlpha();
        /*</values>*/
    }
}
