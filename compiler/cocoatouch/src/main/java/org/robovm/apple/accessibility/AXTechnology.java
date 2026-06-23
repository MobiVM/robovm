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
package org.robovm.apple.accessibility;

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
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("Accessibility") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/AXTechnology/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AXTechnology/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/AXTechnology/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static AXTechnology toObject(Class<AXTechnology> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return AXTechnology.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(AXTechnology o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<AXTechnology> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<AXTechnology> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(AXTechnology.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<AXTechnology> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (AXTechnology o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final AXTechnology VoiceOver = new AXTechnology("VoiceOver");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final AXTechnology SwitchControl = new AXTechnology("SwitchControl");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final AXTechnology VoiceControl = new AXTechnology("VoiceControl");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final AXTechnology FullKeyboardAccess = new AXTechnology("FullKeyboardAccess");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final AXTechnology SpeakScreen = new AXTechnology("SpeakScreen");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final AXTechnology Automation = new AXTechnology("Automation");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final AXTechnology HoverText = new AXTechnology("HoverText");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final AXTechnology Zoom = new AXTechnology("Zoom");
    /*</constants>*/
    
    private static /*<name>*/AXTechnology/*</name>*/[] values = new /*<name>*/AXTechnology/*</name>*/[] {/*<value_list>*/VoiceOver, SwitchControl, VoiceControl, FullKeyboardAccess, SpeakScreen, Automation, HoverText, Zoom/*</value_list>*/};
    
    /*<name>*/AXTechnology/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/AXTechnology/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/AXTechnology/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/AXTechnology/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("Accessibility") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="AXTechnologyVoiceOver", optional=true)
        public static native NSString VoiceOver();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="AXTechnologySwitchControl", optional=true)
        public static native NSString SwitchControl();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="AXTechnologyVoiceControl", optional=true)
        public static native NSString VoiceControl();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="AXTechnologyFullKeyboardAccess", optional=true)
        public static native NSString FullKeyboardAccess();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="AXTechnologySpeakScreen", optional=true)
        public static native NSString SpeakScreen();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="AXTechnologyAutomation", optional=true)
        public static native NSString Automation();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="AXTechnologyHoverText", optional=true)
        public static native NSString HoverText();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="AXTechnologyZoom", optional=true)
        public static native NSString Zoom();
        /*</values>*/
    }
}
