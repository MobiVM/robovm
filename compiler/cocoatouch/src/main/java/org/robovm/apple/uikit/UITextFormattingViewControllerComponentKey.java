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
@Marshaler(/*<name>*/UITextFormattingViewControllerComponentKey/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UITextFormattingViewControllerComponentKey/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/UITextFormattingViewControllerComponentKey/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static UITextFormattingViewControllerComponentKey toObject(Class<UITextFormattingViewControllerComponentKey> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return UITextFormattingViewControllerComponentKey.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(UITextFormattingViewControllerComponentKey o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<UITextFormattingViewControllerComponentKey> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<UITextFormattingViewControllerComponentKey> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(UITextFormattingViewControllerComponentKey.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<UITextFormattingViewControllerComponentKey> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (UITextFormattingViewControllerComponentKey o : l) {
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
    public static final UITextFormattingViewControllerComponentKey FormattingStyles = new UITextFormattingViewControllerComponentKey("FormattingStyles");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final UITextFormattingViewControllerComponentKey FontAttributes = new UITextFormattingViewControllerComponentKey("FontAttributes");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final UITextFormattingViewControllerComponentKey FontPicker = new UITextFormattingViewControllerComponentKey("FontPicker");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final UITextFormattingViewControllerComponentKey FontSize = new UITextFormattingViewControllerComponentKey("FontSize");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final UITextFormattingViewControllerComponentKey FontPointSize = new UITextFormattingViewControllerComponentKey("FontPointSize");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final UITextFormattingViewControllerComponentKey TextAlignment = new UITextFormattingViewControllerComponentKey("TextAlignment");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final UITextFormattingViewControllerComponentKey TextAlignmentAndJustification = new UITextFormattingViewControllerComponentKey("TextAlignmentAndJustification");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final UITextFormattingViewControllerComponentKey TextIndentation = new UITextFormattingViewControllerComponentKey("TextIndentation");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final UITextFormattingViewControllerComponentKey LineHeight = new UITextFormattingViewControllerComponentKey("LineHeight");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final UITextFormattingViewControllerComponentKey ListStyles = new UITextFormattingViewControllerComponentKey("ListStyles");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final UITextFormattingViewControllerComponentKey TextColor = new UITextFormattingViewControllerComponentKey("TextColor");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final UITextFormattingViewControllerComponentKey Highlight = new UITextFormattingViewControllerComponentKey("Highlight");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final UITextFormattingViewControllerComponentKey HighlightPicker = new UITextFormattingViewControllerComponentKey("HighlightPicker");
    /*</constants>*/
    
    private static /*<name>*/UITextFormattingViewControllerComponentKey/*</name>*/[] values = new /*<name>*/UITextFormattingViewControllerComponentKey/*</name>*/[] {/*<value_list>*/FormattingStyles, FontAttributes, FontPicker, FontSize, FontPointSize, TextAlignment, TextAlignmentAndJustification, TextIndentation, LineHeight, ListStyles, TextColor, Highlight, HighlightPicker/*</value_list>*/};
    
    /*<name>*/UITextFormattingViewControllerComponentKey/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/UITextFormattingViewControllerComponentKey/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/UITextFormattingViewControllerComponentKey/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/UITextFormattingViewControllerComponentKey/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("UIKit") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="UITextFormattingViewControllerFormattingStylesComponentKey", optional=true)
        public static native NSString FormattingStyles();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="UITextFormattingViewControllerFontAttributesComponentKey", optional=true)
        public static native NSString FontAttributes();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="UITextFormattingViewControllerFontPickerComponentKey", optional=true)
        public static native NSString FontPicker();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="UITextFormattingViewControllerFontSizeComponentKey", optional=true)
        public static native NSString FontSize();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="UITextFormattingViewControllerFontPointSizeComponentKey", optional=true)
        public static native NSString FontPointSize();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="UITextFormattingViewControllerTextAlignmentComponentKey", optional=true)
        public static native NSString TextAlignment();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="UITextFormattingViewControllerTextAlignmentAndJustificationComponentKey", optional=true)
        public static native NSString TextAlignmentAndJustification();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="UITextFormattingViewControllerTextIndentationComponentKey", optional=true)
        public static native NSString TextIndentation();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="UITextFormattingViewControllerLineHeightComponentKey", optional=true)
        public static native NSString LineHeight();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="UITextFormattingViewControllerListStylesComponentKey", optional=true)
        public static native NSString ListStyles();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="UITextFormattingViewControllerTextColorComponentKey", optional=true)
        public static native NSString TextColor();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="UITextFormattingViewControllerHighlightComponentKey", optional=true)
        public static native NSString Highlight();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="UITextFormattingViewControllerHighlightPickerComponentKey", optional=true)
        public static native NSString HighlightPicker();
        /*</values>*/
    }
}
