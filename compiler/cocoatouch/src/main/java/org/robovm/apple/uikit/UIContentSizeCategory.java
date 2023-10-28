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
@Marshaler(/*<name>*/UIContentSizeCategory/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIContentSizeCategory/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/UIContentSizeCategory/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static UIContentSizeCategory toObject(Class<UIContentSizeCategory> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return UIContentSizeCategory.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(UIContentSizeCategory o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<UIContentSizeCategory> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<UIContentSizeCategory> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(UIContentSizeCategory.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<UIContentSizeCategory> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (UIContentSizeCategory o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final UIContentSizeCategory Unspecified = new UIContentSizeCategory("Unspecified");
    public static final UIContentSizeCategory ExtraSmall = new UIContentSizeCategory("ExtraSmall");
    public static final UIContentSizeCategory Small = new UIContentSizeCategory("Small");
    public static final UIContentSizeCategory Medium = new UIContentSizeCategory("Medium");
    public static final UIContentSizeCategory Large = new UIContentSizeCategory("Large");
    public static final UIContentSizeCategory ExtraLarge = new UIContentSizeCategory("ExtraLarge");
    public static final UIContentSizeCategory ExtraExtraLarge = new UIContentSizeCategory("ExtraExtraLarge");
    public static final UIContentSizeCategory ExtraExtraExtraLarge = new UIContentSizeCategory("ExtraExtraExtraLarge");
    public static final UIContentSizeCategory AccessibilityMedium = new UIContentSizeCategory("AccessibilityMedium");
    public static final UIContentSizeCategory AccessibilityLarge = new UIContentSizeCategory("AccessibilityLarge");
    public static final UIContentSizeCategory AccessibilityExtraLarge = new UIContentSizeCategory("AccessibilityExtraLarge");
    public static final UIContentSizeCategory AccessibilityExtraExtraLarge = new UIContentSizeCategory("AccessibilityExtraExtraLarge");
    public static final UIContentSizeCategory AccessibilityExtraExtraExtraLarge = new UIContentSizeCategory("AccessibilityExtraExtraExtraLarge");
    /*</constants>*/
    
    private static /*<name>*/UIContentSizeCategory/*</name>*/[] values = new /*<name>*/UIContentSizeCategory/*</name>*/[] {/*<value_list>*/Unspecified, ExtraSmall, Small, Medium, Large, ExtraLarge, ExtraExtraLarge, ExtraExtraExtraLarge, AccessibilityMedium, AccessibilityLarge, AccessibilityExtraLarge, AccessibilityExtraExtraLarge, AccessibilityExtraExtraExtraLarge/*</value_list>*/};
    
    /*<name>*/UIContentSizeCategory/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/UIContentSizeCategory/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/UIContentSizeCategory/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/UIContentSizeCategory/*</name>*/.class.getName());
    }
    
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Bridge(symbol="UIContentSizeCategoryIsAccessibilityCategory", optional=true)
    public static native boolean isAccessibilityCategory(String category);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Bridge(symbol="UIContentSizeCategoryCompareToCategory", optional=true)
    public static native NSComparisonResult compareToCategory(String lhs, String rhs);
    /*</methods>*/
    
    /*<annotations>*/@Library("UIKit") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="UIContentSizeCategoryUnspecified", optional=true)
        public static native NSString Unspecified();
        @GlobalValue(symbol="UIContentSizeCategoryExtraSmall", optional=true)
        public static native NSString ExtraSmall();
        @GlobalValue(symbol="UIContentSizeCategorySmall", optional=true)
        public static native NSString Small();
        @GlobalValue(symbol="UIContentSizeCategoryMedium", optional=true)
        public static native NSString Medium();
        @GlobalValue(symbol="UIContentSizeCategoryLarge", optional=true)
        public static native NSString Large();
        @GlobalValue(symbol="UIContentSizeCategoryExtraLarge", optional=true)
        public static native NSString ExtraLarge();
        @GlobalValue(symbol="UIContentSizeCategoryExtraExtraLarge", optional=true)
        public static native NSString ExtraExtraLarge();
        @GlobalValue(symbol="UIContentSizeCategoryExtraExtraExtraLarge", optional=true)
        public static native NSString ExtraExtraExtraLarge();
        @GlobalValue(symbol="UIContentSizeCategoryAccessibilityMedium", optional=true)
        public static native NSString AccessibilityMedium();
        @GlobalValue(symbol="UIContentSizeCategoryAccessibilityLarge", optional=true)
        public static native NSString AccessibilityLarge();
        @GlobalValue(symbol="UIContentSizeCategoryAccessibilityExtraLarge", optional=true)
        public static native NSString AccessibilityExtraLarge();
        @GlobalValue(symbol="UIContentSizeCategoryAccessibilityExtraExtraLarge", optional=true)
        public static native NSString AccessibilityExtraExtraLarge();
        @GlobalValue(symbol="UIContentSizeCategoryAccessibilityExtraExtraExtraLarge", optional=true)
        public static native NSString AccessibilityExtraExtraExtraLarge();
        /*</values>*/
    }
}
