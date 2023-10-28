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
@Marshaler(/*<name>*/UIFontTextStyle/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIFontTextStyle/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/UIFontTextStyle/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static UIFontTextStyle toObject(Class<UIFontTextStyle> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return UIFontTextStyle.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(UIFontTextStyle o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<UIFontTextStyle> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<UIFontTextStyle> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(UIFontTextStyle.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<UIFontTextStyle> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (UIFontTextStyle o : l) {
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
    public static final UIFontTextStyle LargeTitle = new UIFontTextStyle("LargeTitle");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final UIFontTextStyle ExtraLargeTitle = new UIFontTextStyle("ExtraLargeTitle");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final UIFontTextStyle ExtraLargeTitle2 = new UIFontTextStyle("ExtraLargeTitle2");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final UIFontTextStyle Title1 = new UIFontTextStyle("Title1");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final UIFontTextStyle Title2 = new UIFontTextStyle("Title2");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final UIFontTextStyle Title3 = new UIFontTextStyle("Title3");
    public static final UIFontTextStyle Headline = new UIFontTextStyle("Headline");
    public static final UIFontTextStyle Subheadline = new UIFontTextStyle("Subheadline");
    public static final UIFontTextStyle Body = new UIFontTextStyle("Body");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final UIFontTextStyle Callout = new UIFontTextStyle("Callout");
    public static final UIFontTextStyle Footnote = new UIFontTextStyle("Footnote");
    public static final UIFontTextStyle Caption1 = new UIFontTextStyle("Caption1");
    public static final UIFontTextStyle Caption2 = new UIFontTextStyle("Caption2");
    /*</constants>*/
    
    private static /*<name>*/UIFontTextStyle/*</name>*/[] values = new /*<name>*/UIFontTextStyle/*</name>*/[] {/*<value_list>*/LargeTitle, ExtraLargeTitle, ExtraLargeTitle2, Title1, Title2, Title3, Headline, Subheadline, Body, Callout, Footnote, Caption1, Caption2/*</value_list>*/};
    
    /*<name>*/UIFontTextStyle/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/UIFontTextStyle/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/UIFontTextStyle/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/UIFontTextStyle/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("UIKit") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="UIFontTextStyleLargeTitle", optional=true)
        public static native NSString LargeTitle();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="UIFontTextStyleExtraLargeTitle", optional=true)
        public static native NSString ExtraLargeTitle();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="UIFontTextStyleExtraLargeTitle2", optional=true)
        public static native NSString ExtraLargeTitle2();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="UIFontTextStyleTitle1", optional=true)
        public static native NSString Title1();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="UIFontTextStyleTitle2", optional=true)
        public static native NSString Title2();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="UIFontTextStyleTitle3", optional=true)
        public static native NSString Title3();
        @GlobalValue(symbol="UIFontTextStyleHeadline", optional=true)
        public static native NSString Headline();
        @GlobalValue(symbol="UIFontTextStyleSubheadline", optional=true)
        public static native NSString Subheadline();
        @GlobalValue(symbol="UIFontTextStyleBody", optional=true)
        public static native NSString Body();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="UIFontTextStyleCallout", optional=true)
        public static native NSString Callout();
        @GlobalValue(symbol="UIFontTextStyleFootnote", optional=true)
        public static native NSString Footnote();
        @GlobalValue(symbol="UIFontTextStyleCaption1", optional=true)
        public static native NSString Caption1();
        @GlobalValue(symbol="UIFontTextStyleCaption2", optional=true)
        public static native NSString Caption2();
        /*</values>*/
    }
}
