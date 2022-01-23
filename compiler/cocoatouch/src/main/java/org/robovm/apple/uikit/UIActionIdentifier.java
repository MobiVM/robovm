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
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/UIActionIdentifier/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIActionIdentifier/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/UIActionIdentifier/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static UIActionIdentifier toObject(Class<UIActionIdentifier> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return UIActionIdentifier.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(UIActionIdentifier o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<UIActionIdentifier> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<UIActionIdentifier> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(UIActionIdentifier.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<UIActionIdentifier> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (UIActionIdentifier o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 15.0 and later.
     */
    public static final UIActionIdentifier Paste = new UIActionIdentifier("Paste");
    /**
     * @since Available in iOS 15.0 and later.
     */
    public static final UIActionIdentifier PasteAndMatchStyle = new UIActionIdentifier("PasteAndMatchStyle");
    /**
     * @since Available in iOS 15.0 and later.
     */
    public static final UIActionIdentifier PasteAndGo = new UIActionIdentifier("PasteAndGo");
    /**
     * @since Available in iOS 15.0 and later.
     */
    public static final UIActionIdentifier PasteAndSearch = new UIActionIdentifier("PasteAndSearch");
    /*</constants>*/
    
    private static /*<name>*/UIActionIdentifier/*</name>*/[] values = new /*<name>*/UIActionIdentifier/*</name>*/[] {/*<value_list>*/Paste, PasteAndMatchStyle, PasteAndGo, PasteAndSearch/*</value_list>*/};
    
    /*<name>*/UIActionIdentifier/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/UIActionIdentifier/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/UIActionIdentifier/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/UIActionIdentifier/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("UIKit") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="UIActionPaste", optional=true)
        public static native NSString Paste();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="UIActionPasteAndMatchStyle", optional=true)
        public static native NSString PasteAndMatchStyle();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="UIActionPasteAndGo", optional=true)
        public static native NSString PasteAndGo();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="UIActionPasteAndSearch", optional=true)
        public static native NSString PasteAndSearch();
        /*</values>*/
    }
}
