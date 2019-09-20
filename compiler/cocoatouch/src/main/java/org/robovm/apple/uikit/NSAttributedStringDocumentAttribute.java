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
@Marshaler(/*<name>*/NSAttributedStringDocumentAttribute/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSAttributedStringDocumentAttribute/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/NSAttributedStringDocumentAttribute/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static NSAttributedStringDocumentAttribute toObject(Class<NSAttributedStringDocumentAttribute> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return NSAttributedStringDocumentAttribute.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(NSAttributedStringDocumentAttribute o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<NSAttributedStringDocumentAttribute> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<NSAttributedStringDocumentAttribute> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(NSAttributedStringDocumentAttribute.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<NSAttributedStringDocumentAttribute> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (NSAttributedStringDocumentAttribute o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final NSAttributedStringDocumentAttribute DocumentType = new NSAttributedStringDocumentAttribute("DocumentType");
    public static final NSAttributedStringDocumentAttribute CharacterEncoding = new NSAttributedStringDocumentAttribute("CharacterEncoding");
    public static final NSAttributedStringDocumentAttribute DefaultAttributes = new NSAttributedStringDocumentAttribute("DefaultAttributes");
    public static final NSAttributedStringDocumentAttribute PaperSize = new NSAttributedStringDocumentAttribute("PaperSize");
    public static final NSAttributedStringDocumentAttribute PaperMargin = new NSAttributedStringDocumentAttribute("PaperMargin");
    public static final NSAttributedStringDocumentAttribute ViewSize = new NSAttributedStringDocumentAttribute("ViewSize");
    public static final NSAttributedStringDocumentAttribute ViewZoom = new NSAttributedStringDocumentAttribute("ViewZoom");
    public static final NSAttributedStringDocumentAttribute ViewMode = new NSAttributedStringDocumentAttribute("ViewMode");
    public static final NSAttributedStringDocumentAttribute ReadOnly = new NSAttributedStringDocumentAttribute("ReadOnly");
    public static final NSAttributedStringDocumentAttribute BackgroundColor = new NSAttributedStringDocumentAttribute("BackgroundColor");
    public static final NSAttributedStringDocumentAttribute HyphenationFactor = new NSAttributedStringDocumentAttribute("HyphenationFactor");
    public static final NSAttributedStringDocumentAttribute DefaultTabInterval = new NSAttributedStringDocumentAttribute("DefaultTabInterval");
    public static final NSAttributedStringDocumentAttribute TextLayoutSections = new NSAttributedStringDocumentAttribute("TextLayoutSections");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final NSAttributedStringDocumentAttribute TextScaling = new NSAttributedStringDocumentAttribute("TextScaling");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final NSAttributedStringDocumentAttribute SourceTextScaling = new NSAttributedStringDocumentAttribute("SourceTextScaling");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final NSAttributedStringDocumentAttribute CocoaVersion = new NSAttributedStringDocumentAttribute("CocoaVersion");
    /*</constants>*/
    
    private static /*<name>*/NSAttributedStringDocumentAttribute/*</name>*/[] values = new /*<name>*/NSAttributedStringDocumentAttribute/*</name>*/[] {/*<value_list>*/DocumentType, CharacterEncoding, DefaultAttributes, PaperSize, PaperMargin, ViewSize, ViewZoom, ViewMode, ReadOnly, BackgroundColor, HyphenationFactor, DefaultTabInterval, TextLayoutSections, TextScaling, SourceTextScaling, CocoaVersion/*</value_list>*/};
    
    /*<name>*/NSAttributedStringDocumentAttribute/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/NSAttributedStringDocumentAttribute/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/NSAttributedStringDocumentAttribute/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/NSAttributedStringDocumentAttribute/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("UIKit") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="NSDocumentTypeDocumentAttribute", optional=true)
        public static native NSString DocumentType();
        @GlobalValue(symbol="NSCharacterEncodingDocumentAttribute", optional=true)
        public static native NSString CharacterEncoding();
        @GlobalValue(symbol="NSDefaultAttributesDocumentAttribute", optional=true)
        public static native NSString DefaultAttributes();
        @GlobalValue(symbol="NSPaperSizeDocumentAttribute", optional=true)
        public static native NSString PaperSize();
        @GlobalValue(symbol="NSPaperMarginDocumentAttribute", optional=true)
        public static native NSString PaperMargin();
        @GlobalValue(symbol="NSViewSizeDocumentAttribute", optional=true)
        public static native NSString ViewSize();
        @GlobalValue(symbol="NSViewZoomDocumentAttribute", optional=true)
        public static native NSString ViewZoom();
        @GlobalValue(symbol="NSViewModeDocumentAttribute", optional=true)
        public static native NSString ViewMode();
        @GlobalValue(symbol="NSReadOnlyDocumentAttribute", optional=true)
        public static native NSString ReadOnly();
        @GlobalValue(symbol="NSBackgroundColorDocumentAttribute", optional=true)
        public static native NSString BackgroundColor();
        @GlobalValue(symbol="NSHyphenationFactorDocumentAttribute", optional=true)
        public static native NSString HyphenationFactor();
        @GlobalValue(symbol="NSDefaultTabIntervalDocumentAttribute", optional=true)
        public static native NSString DefaultTabInterval();
        @GlobalValue(symbol="NSTextLayoutSectionsAttribute", optional=true)
        public static native NSString TextLayoutSections();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="NSTextScalingDocumentAttribute", optional=true)
        public static native NSString TextScaling();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="NSSourceTextScalingDocumentAttribute", optional=true)
        public static native NSString SourceTextScaling();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="NSCocoaVersionDocumentAttribute", optional=true)
        public static native NSString CocoaVersion();
        /*</values>*/
    }
}
