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
@Marshaler(/*<name>*/NSTextListMarkerFormat/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSTextListMarkerFormat/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/NSTextListMarkerFormat/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static NSTextListMarkerFormat toObject(Class<NSTextListMarkerFormat> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return NSTextListMarkerFormat.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(NSTextListMarkerFormat o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<NSTextListMarkerFormat> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<NSTextListMarkerFormat> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(NSTextListMarkerFormat.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<NSTextListMarkerFormat> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (NSTextListMarkerFormat o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final NSTextListMarkerFormat MarkerBox = new NSTextListMarkerFormat("MarkerBox");
    public static final NSTextListMarkerFormat MarkerCheck = new NSTextListMarkerFormat("MarkerCheck");
    public static final NSTextListMarkerFormat MarkerCircle = new NSTextListMarkerFormat("MarkerCircle");
    public static final NSTextListMarkerFormat MarkerDiamond = new NSTextListMarkerFormat("MarkerDiamond");
    public static final NSTextListMarkerFormat MarkerDisc = new NSTextListMarkerFormat("MarkerDisc");
    public static final NSTextListMarkerFormat MarkerHyphen = new NSTextListMarkerFormat("MarkerHyphen");
    public static final NSTextListMarkerFormat MarkerSquare = new NSTextListMarkerFormat("MarkerSquare");
    public static final NSTextListMarkerFormat MarkerLowercaseHexadecimal = new NSTextListMarkerFormat("MarkerLowercaseHexadecimal");
    public static final NSTextListMarkerFormat MarkerUppercaseHexadecimal = new NSTextListMarkerFormat("MarkerUppercaseHexadecimal");
    public static final NSTextListMarkerFormat MarkerOctal = new NSTextListMarkerFormat("MarkerOctal");
    public static final NSTextListMarkerFormat MarkerLowercaseAlpha = new NSTextListMarkerFormat("MarkerLowercaseAlpha");
    public static final NSTextListMarkerFormat MarkerUppercaseAlpha = new NSTextListMarkerFormat("MarkerUppercaseAlpha");
    public static final NSTextListMarkerFormat MarkerLowercaseLatin = new NSTextListMarkerFormat("MarkerLowercaseLatin");
    public static final NSTextListMarkerFormat MarkerUppercaseLatin = new NSTextListMarkerFormat("MarkerUppercaseLatin");
    public static final NSTextListMarkerFormat MarkerLowercaseRoman = new NSTextListMarkerFormat("MarkerLowercaseRoman");
    public static final NSTextListMarkerFormat MarkerUppercaseRoman = new NSTextListMarkerFormat("MarkerUppercaseRoman");
    public static final NSTextListMarkerFormat MarkerDecimal = new NSTextListMarkerFormat("MarkerDecimal");
    /*</constants>*/
    
    private static /*<name>*/NSTextListMarkerFormat/*</name>*/[] values = new /*<name>*/NSTextListMarkerFormat/*</name>*/[] {/*<value_list>*/MarkerBox, MarkerCheck, MarkerCircle, MarkerDiamond, MarkerDisc, MarkerHyphen, MarkerSquare, MarkerLowercaseHexadecimal, MarkerUppercaseHexadecimal, MarkerOctal, MarkerLowercaseAlpha, MarkerUppercaseAlpha, MarkerLowercaseLatin, MarkerUppercaseLatin, MarkerLowercaseRoman, MarkerUppercaseRoman, MarkerDecimal/*</value_list>*/};
    
    /*<name>*/NSTextListMarkerFormat/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/NSTextListMarkerFormat/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/NSTextListMarkerFormat/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/NSTextListMarkerFormat/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("UIKit") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="NSTextListMarkerBox", optional=true)
        public static native NSString MarkerBox();
        @GlobalValue(symbol="NSTextListMarkerCheck", optional=true)
        public static native NSString MarkerCheck();
        @GlobalValue(symbol="NSTextListMarkerCircle", optional=true)
        public static native NSString MarkerCircle();
        @GlobalValue(symbol="NSTextListMarkerDiamond", optional=true)
        public static native NSString MarkerDiamond();
        @GlobalValue(symbol="NSTextListMarkerDisc", optional=true)
        public static native NSString MarkerDisc();
        @GlobalValue(symbol="NSTextListMarkerHyphen", optional=true)
        public static native NSString MarkerHyphen();
        @GlobalValue(symbol="NSTextListMarkerSquare", optional=true)
        public static native NSString MarkerSquare();
        @GlobalValue(symbol="NSTextListMarkerLowercaseHexadecimal", optional=true)
        public static native NSString MarkerLowercaseHexadecimal();
        @GlobalValue(symbol="NSTextListMarkerUppercaseHexadecimal", optional=true)
        public static native NSString MarkerUppercaseHexadecimal();
        @GlobalValue(symbol="NSTextListMarkerOctal", optional=true)
        public static native NSString MarkerOctal();
        @GlobalValue(symbol="NSTextListMarkerLowercaseAlpha", optional=true)
        public static native NSString MarkerLowercaseAlpha();
        @GlobalValue(symbol="NSTextListMarkerUppercaseAlpha", optional=true)
        public static native NSString MarkerUppercaseAlpha();
        @GlobalValue(symbol="NSTextListMarkerLowercaseLatin", optional=true)
        public static native NSString MarkerLowercaseLatin();
        @GlobalValue(symbol="NSTextListMarkerUppercaseLatin", optional=true)
        public static native NSString MarkerUppercaseLatin();
        @GlobalValue(symbol="NSTextListMarkerLowercaseRoman", optional=true)
        public static native NSString MarkerLowercaseRoman();
        @GlobalValue(symbol="NSTextListMarkerUppercaseRoman", optional=true)
        public static native NSString MarkerUppercaseRoman();
        @GlobalValue(symbol="NSTextListMarkerDecimal", optional=true)
        public static native NSString MarkerDecimal();
        /*</values>*/
    }
}
