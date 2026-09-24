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
@Marshaler(/*<name>*/UITextFormattingViewControllerTextAlignment/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UITextFormattingViewControllerTextAlignment/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/UITextFormattingViewControllerTextAlignment/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static UITextFormattingViewControllerTextAlignment toObject(Class<UITextFormattingViewControllerTextAlignment> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return UITextFormattingViewControllerTextAlignment.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(UITextFormattingViewControllerTextAlignment o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<UITextFormattingViewControllerTextAlignment> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<UITextFormattingViewControllerTextAlignment> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(UITextFormattingViewControllerTextAlignment.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<UITextFormattingViewControllerTextAlignment> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (UITextFormattingViewControllerTextAlignment o : l) {
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
    public static final UITextFormattingViewControllerTextAlignment Left = new UITextFormattingViewControllerTextAlignment("Left");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final UITextFormattingViewControllerTextAlignment Center = new UITextFormattingViewControllerTextAlignment("Center");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final UITextFormattingViewControllerTextAlignment Right = new UITextFormattingViewControllerTextAlignment("Right");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final UITextFormattingViewControllerTextAlignment Justified = new UITextFormattingViewControllerTextAlignment("Justified");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final UITextFormattingViewControllerTextAlignment Natural = new UITextFormattingViewControllerTextAlignment("Natural");
    /*</constants>*/
    
    private static /*<name>*/UITextFormattingViewControllerTextAlignment/*</name>*/[] values = new /*<name>*/UITextFormattingViewControllerTextAlignment/*</name>*/[] {/*<value_list>*/Left, Center, Right, Justified, Natural/*</value_list>*/};
    
    /*<name>*/UITextFormattingViewControllerTextAlignment/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/UITextFormattingViewControllerTextAlignment/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/UITextFormattingViewControllerTextAlignment/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/UITextFormattingViewControllerTextAlignment/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("UIKit") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="UITextFormattingViewControllerTextAlignmentLeft", optional=true)
        public static native NSString Left();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="UITextFormattingViewControllerTextAlignmentCenter", optional=true)
        public static native NSString Center();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="UITextFormattingViewControllerTextAlignmentRight", optional=true)
        public static native NSString Right();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="UITextFormattingViewControllerTextAlignmentJustified", optional=true)
        public static native NSString Justified();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="UITextFormattingViewControllerTextAlignmentNatural", optional=true)
        public static native NSString Natural();
        /*</values>*/
    }
}
