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
package org.robovm.apple.uikit;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.cloudkit.*;
import org.robovm.apple.fileprovider.*;
import org.robovm.apple.intents.*;
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.linkpresentation.*;
import org.robovm.apple.symbols.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/UIFontWidth/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIFontWidth/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<Double>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/UIFontWidth/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static UIFontWidth toObject(Class<UIFontWidth> cls, long handle, long flags) {
            NSNumber o = (NSNumber) NSObject.Marshaler.toObject(NSNumber.class, handle, flags);
            if (o == null) {
                return null;
            }
            return UIFontWidth.valueOf(o.doubleValue());
        }
        @MarshalsPointer
        public static long toNative(UIFontWidth o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(NSNumber.valueOf(o.value()), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<UIFontWidth> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSNumber> o = (NSArray<NSNumber>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<UIFontWidth> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(UIFontWidth.valueOf(o.get(i).doubleValue()));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<UIFontWidth> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSNumber> array = new NSMutableArray<>();
            for (UIFontWidth o : l) {
                array.add(NSNumber.valueOf(o.value()));
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final UIFontWidth Condensed = new UIFontWidth("Condensed");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final UIFontWidth Standard = new UIFontWidth("Standard");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final UIFontWidth Expanded = new UIFontWidth("Expanded");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final UIFontWidth Compressed = new UIFontWidth("Compressed");
    /*</constants>*/
    
    private static /*<name>*/UIFontWidth/*</name>*/[] values = new /*<name>*/UIFontWidth/*</name>*/[] {/*<value_list>*/Condensed, Standard, Expanded, Compressed/*</value_list>*/};
    
    /*<name>*/UIFontWidth/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/UIFontWidth/*</name>*/ valueOf(/*<type>*/@MachineSizedFloat double/*</type>*/ value) {
        for (/*<name>*/UIFontWidth/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/UIFontWidth/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("UIKit") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="UIFontWidthCondensed", optional=true)
        public static native @MachineSizedFloat double Condensed();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="UIFontWidthStandard", optional=true)
        public static native @MachineSizedFloat double Standard();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="UIFontWidthExpanded", optional=true)
        public static native @MachineSizedFloat double Expanded();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="UIFontWidthCompressed", optional=true)
        public static native @MachineSizedFloat double Compressed();
        /*</values>*/
    }
}
