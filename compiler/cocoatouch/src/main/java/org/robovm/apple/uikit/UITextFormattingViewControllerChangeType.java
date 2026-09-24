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
@Marshaler(/*<name>*/UITextFormattingViewControllerChangeType/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UITextFormattingViewControllerChangeType/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/UITextFormattingViewControllerChangeType/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static UITextFormattingViewControllerChangeType toObject(Class<UITextFormattingViewControllerChangeType> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return UITextFormattingViewControllerChangeType.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(UITextFormattingViewControllerChangeType o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<UITextFormattingViewControllerChangeType> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<UITextFormattingViewControllerChangeType> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(UITextFormattingViewControllerChangeType.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<UITextFormattingViewControllerChangeType> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (UITextFormattingViewControllerChangeType o : l) {
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
    public static final UITextFormattingViewControllerChangeType Undefined = new UITextFormattingViewControllerChangeType("Undefined");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final UITextFormattingViewControllerChangeType SetBold = new UITextFormattingViewControllerChangeType("SetBold");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final UITextFormattingViewControllerChangeType RemoveBold = new UITextFormattingViewControllerChangeType("RemoveBold");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final UITextFormattingViewControllerChangeType SetItalic = new UITextFormattingViewControllerChangeType("SetItalic");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final UITextFormattingViewControllerChangeType RemoveItalic = new UITextFormattingViewControllerChangeType("RemoveItalic");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final UITextFormattingViewControllerChangeType SetUnderline = new UITextFormattingViewControllerChangeType("SetUnderline");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final UITextFormattingViewControllerChangeType RemoveUnderline = new UITextFormattingViewControllerChangeType("RemoveUnderline");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final UITextFormattingViewControllerChangeType SetStrikethrough = new UITextFormattingViewControllerChangeType("SetStrikethrough");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final UITextFormattingViewControllerChangeType RemoveStrikethrough = new UITextFormattingViewControllerChangeType("RemoveStrikethrough");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final UITextFormattingViewControllerChangeType Font = new UITextFormattingViewControllerChangeType("Font");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final UITextFormattingViewControllerChangeType FontSize = new UITextFormattingViewControllerChangeType("FontSize");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final UITextFormattingViewControllerChangeType IncreaseFontSize = new UITextFormattingViewControllerChangeType("IncreaseFontSize");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final UITextFormattingViewControllerChangeType DecreaseFontSize = new UITextFormattingViewControllerChangeType("DecreaseFontSize");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final UITextFormattingViewControllerChangeType TextColor = new UITextFormattingViewControllerChangeType("TextColor");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final UITextFormattingViewControllerChangeType LineHeightPointSize = new UITextFormattingViewControllerChangeType("LineHeightPointSize");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final UITextFormattingViewControllerChangeType IncreaseIndentation = new UITextFormattingViewControllerChangeType("IncreaseIndentation");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final UITextFormattingViewControllerChangeType DecreaseIndentation = new UITextFormattingViewControllerChangeType("DecreaseIndentation");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final UITextFormattingViewControllerChangeType FormattingStyle = new UITextFormattingViewControllerChangeType("FormattingStyle");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final UITextFormattingViewControllerChangeType TextList = new UITextFormattingViewControllerChangeType("TextList");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final UITextFormattingViewControllerChangeType TextAlignment = new UITextFormattingViewControllerChangeType("TextAlignment");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final UITextFormattingViewControllerChangeType Highlight = new UITextFormattingViewControllerChangeType("Highlight");
    /*</constants>*/
    
    private static /*<name>*/UITextFormattingViewControllerChangeType/*</name>*/[] values = new /*<name>*/UITextFormattingViewControllerChangeType/*</name>*/[] {/*<value_list>*/Undefined, SetBold, RemoveBold, SetItalic, RemoveItalic, SetUnderline, RemoveUnderline, SetStrikethrough, RemoveStrikethrough, Font, FontSize, IncreaseFontSize, DecreaseFontSize, TextColor, LineHeightPointSize, IncreaseIndentation, DecreaseIndentation, FormattingStyle, TextList, TextAlignment, Highlight/*</value_list>*/};
    
    /*<name>*/UITextFormattingViewControllerChangeType/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/UITextFormattingViewControllerChangeType/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/UITextFormattingViewControllerChangeType/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/UITextFormattingViewControllerChangeType/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("UIKit") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="UITextFormattingViewControllerUndefinedChangeType", optional=true)
        public static native NSString Undefined();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="UITextFormattingViewControllerSetBoldChangeType", optional=true)
        public static native NSString SetBold();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="UITextFormattingViewControllerRemoveBoldChangeType", optional=true)
        public static native NSString RemoveBold();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="UITextFormattingViewControllerSetItalicChangeType", optional=true)
        public static native NSString SetItalic();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="UITextFormattingViewControllerRemoveItalicChangeType", optional=true)
        public static native NSString RemoveItalic();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="UITextFormattingViewControllerSetUnderlineChangeType", optional=true)
        public static native NSString SetUnderline();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="UITextFormattingViewControllerRemoveUnderlineChangeType", optional=true)
        public static native NSString RemoveUnderline();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="UITextFormattingViewControllerSetStrikethroughChangeType", optional=true)
        public static native NSString SetStrikethrough();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="UITextFormattingViewControllerRemoveStrikethroughChangeType", optional=true)
        public static native NSString RemoveStrikethrough();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="UITextFormattingViewControllerFontChangeType", optional=true)
        public static native NSString Font();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="UITextFormattingViewControllerFontSizeChangeType", optional=true)
        public static native NSString FontSize();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="UITextFormattingViewControllerIncreaseFontSizeChangeType", optional=true)
        public static native NSString IncreaseFontSize();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="UITextFormattingViewControllerDecreaseFontSizeChangeType", optional=true)
        public static native NSString DecreaseFontSize();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="UITextFormattingViewControllerTextColorChangeType", optional=true)
        public static native NSString TextColor();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="UITextFormattingViewControllerLineHeightPointSizeChangeType", optional=true)
        public static native NSString LineHeightPointSize();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="UITextFormattingViewControllerIncreaseIndentationChangeType", optional=true)
        public static native NSString IncreaseIndentation();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="UITextFormattingViewControllerDecreaseIndentationChangeType", optional=true)
        public static native NSString DecreaseIndentation();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="UITextFormattingViewControllerFormattingStyleChangeType", optional=true)
        public static native NSString FormattingStyle();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="UITextFormattingViewControllerTextListChangeType", optional=true)
        public static native NSString TextList();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="UITextFormattingViewControllerTextAlignmentChangeType", optional=true)
        public static native NSString TextAlignment();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="UITextFormattingViewControllerHighlightChangeType", optional=true)
        public static native NSString Highlight();
        /*</values>*/
    }
}
