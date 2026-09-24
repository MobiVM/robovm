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
@Marshaler(/*<name>*/UITextFormattingViewControllerHighlight/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UITextFormattingViewControllerHighlight/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/UITextFormattingViewControllerHighlight/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static UITextFormattingViewControllerHighlight toObject(Class<UITextFormattingViewControllerHighlight> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return UITextFormattingViewControllerHighlight.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(UITextFormattingViewControllerHighlight o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<UITextFormattingViewControllerHighlight> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<UITextFormattingViewControllerHighlight> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(UITextFormattingViewControllerHighlight.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<UITextFormattingViewControllerHighlight> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (UITextFormattingViewControllerHighlight o : l) {
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
    public static final UITextFormattingViewControllerHighlight Default = new UITextFormattingViewControllerHighlight("Default");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final UITextFormattingViewControllerHighlight Purple = new UITextFormattingViewControllerHighlight("Purple");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final UITextFormattingViewControllerHighlight Pink = new UITextFormattingViewControllerHighlight("Pink");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final UITextFormattingViewControllerHighlight Orange = new UITextFormattingViewControllerHighlight("Orange");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final UITextFormattingViewControllerHighlight Mint = new UITextFormattingViewControllerHighlight("Mint");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final UITextFormattingViewControllerHighlight Blue = new UITextFormattingViewControllerHighlight("Blue");
    /*</constants>*/
    
    private static /*<name>*/UITextFormattingViewControllerHighlight/*</name>*/[] values = new /*<name>*/UITextFormattingViewControllerHighlight/*</name>*/[] {/*<value_list>*/Default, Purple, Pink, Orange, Mint, Blue/*</value_list>*/};
    
    /*<name>*/UITextFormattingViewControllerHighlight/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/UITextFormattingViewControllerHighlight/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/UITextFormattingViewControllerHighlight/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/UITextFormattingViewControllerHighlight/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("UIKit") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="UITextFormattingViewControllerHighlightDefault", optional=true)
        public static native NSString Default();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="UITextFormattingViewControllerHighlightPurple", optional=true)
        public static native NSString Purple();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="UITextFormattingViewControllerHighlightPink", optional=true)
        public static native NSString Pink();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="UITextFormattingViewControllerHighlightOrange", optional=true)
        public static native NSString Orange();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="UITextFormattingViewControllerHighlightMint", optional=true)
        public static native NSString Mint();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="UITextFormattingViewControllerHighlightBlue", optional=true)
        public static native NSString Blue();
        /*</values>*/
    }
}
