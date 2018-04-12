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
package org.robovm.apple.arkit;

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
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.scenekit.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.spritekit.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.imageio.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("ARKit") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/ARBlendShapeLocation/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ARBlendShapeLocation/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/ARBlendShapeLocation/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static ARBlendShapeLocation toObject(Class<ARBlendShapeLocation> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return ARBlendShapeLocation.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(ARBlendShapeLocation o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<ARBlendShapeLocation> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<ARBlendShapeLocation> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(ARBlendShapeLocation.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<ARBlendShapeLocation> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (ARBlendShapeLocation o : l) {
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
    public static final ARBlendShapeLocation BrowDownLeft = new ARBlendShapeLocation("BrowDownLeft");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final ARBlendShapeLocation BrowDownRight = new ARBlendShapeLocation("BrowDownRight");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final ARBlendShapeLocation BrowInnerUp = new ARBlendShapeLocation("BrowInnerUp");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final ARBlendShapeLocation BrowOuterUpLeft = new ARBlendShapeLocation("BrowOuterUpLeft");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final ARBlendShapeLocation BrowOuterUpRight = new ARBlendShapeLocation("BrowOuterUpRight");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final ARBlendShapeLocation CheekPuff = new ARBlendShapeLocation("CheekPuff");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final ARBlendShapeLocation CheekSquintLeft = new ARBlendShapeLocation("CheekSquintLeft");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final ARBlendShapeLocation CheekSquintRight = new ARBlendShapeLocation("CheekSquintRight");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final ARBlendShapeLocation EyeBlinkLeft = new ARBlendShapeLocation("EyeBlinkLeft");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final ARBlendShapeLocation EyeBlinkRight = new ARBlendShapeLocation("EyeBlinkRight");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final ARBlendShapeLocation EyeLookDownLeft = new ARBlendShapeLocation("EyeLookDownLeft");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final ARBlendShapeLocation EyeLookDownRight = new ARBlendShapeLocation("EyeLookDownRight");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final ARBlendShapeLocation EyeLookInLeft = new ARBlendShapeLocation("EyeLookInLeft");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final ARBlendShapeLocation EyeLookInRight = new ARBlendShapeLocation("EyeLookInRight");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final ARBlendShapeLocation EyeLookOutLeft = new ARBlendShapeLocation("EyeLookOutLeft");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final ARBlendShapeLocation EyeLookOutRight = new ARBlendShapeLocation("EyeLookOutRight");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final ARBlendShapeLocation EyeLookUpLeft = new ARBlendShapeLocation("EyeLookUpLeft");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final ARBlendShapeLocation EyeLookUpRight = new ARBlendShapeLocation("EyeLookUpRight");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final ARBlendShapeLocation EyeSquintLeft = new ARBlendShapeLocation("EyeSquintLeft");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final ARBlendShapeLocation EyeSquintRight = new ARBlendShapeLocation("EyeSquintRight");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final ARBlendShapeLocation EyeWideLeft = new ARBlendShapeLocation("EyeWideLeft");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final ARBlendShapeLocation EyeWideRight = new ARBlendShapeLocation("EyeWideRight");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final ARBlendShapeLocation JawForward = new ARBlendShapeLocation("JawForward");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final ARBlendShapeLocation JawLeft = new ARBlendShapeLocation("JawLeft");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final ARBlendShapeLocation JawOpen = new ARBlendShapeLocation("JawOpen");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final ARBlendShapeLocation JawRight = new ARBlendShapeLocation("JawRight");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final ARBlendShapeLocation MouthClose = new ARBlendShapeLocation("MouthClose");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final ARBlendShapeLocation MouthDimpleLeft = new ARBlendShapeLocation("MouthDimpleLeft");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final ARBlendShapeLocation MouthDimpleRight = new ARBlendShapeLocation("MouthDimpleRight");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final ARBlendShapeLocation MouthFrownLeft = new ARBlendShapeLocation("MouthFrownLeft");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final ARBlendShapeLocation MouthFrownRight = new ARBlendShapeLocation("MouthFrownRight");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final ARBlendShapeLocation MouthFunnel = new ARBlendShapeLocation("MouthFunnel");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final ARBlendShapeLocation MouthLeft = new ARBlendShapeLocation("MouthLeft");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final ARBlendShapeLocation MouthLowerDownLeft = new ARBlendShapeLocation("MouthLowerDownLeft");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final ARBlendShapeLocation MouthLowerDownRight = new ARBlendShapeLocation("MouthLowerDownRight");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final ARBlendShapeLocation MouthPressLeft = new ARBlendShapeLocation("MouthPressLeft");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final ARBlendShapeLocation MouthPressRight = new ARBlendShapeLocation("MouthPressRight");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final ARBlendShapeLocation MouthPucker = new ARBlendShapeLocation("MouthPucker");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final ARBlendShapeLocation MouthRight = new ARBlendShapeLocation("MouthRight");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final ARBlendShapeLocation MouthRollLower = new ARBlendShapeLocation("MouthRollLower");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final ARBlendShapeLocation MouthRollUpper = new ARBlendShapeLocation("MouthRollUpper");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final ARBlendShapeLocation MouthShrugLower = new ARBlendShapeLocation("MouthShrugLower");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final ARBlendShapeLocation MouthShrugUpper = new ARBlendShapeLocation("MouthShrugUpper");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final ARBlendShapeLocation MouthSmileLeft = new ARBlendShapeLocation("MouthSmileLeft");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final ARBlendShapeLocation MouthSmileRight = new ARBlendShapeLocation("MouthSmileRight");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final ARBlendShapeLocation MouthStretchLeft = new ARBlendShapeLocation("MouthStretchLeft");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final ARBlendShapeLocation MouthStretchRight = new ARBlendShapeLocation("MouthStretchRight");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final ARBlendShapeLocation MouthUpperUpLeft = new ARBlendShapeLocation("MouthUpperUpLeft");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final ARBlendShapeLocation MouthUpperUpRight = new ARBlendShapeLocation("MouthUpperUpRight");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final ARBlendShapeLocation NoseSneerLeft = new ARBlendShapeLocation("NoseSneerLeft");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final ARBlendShapeLocation NoseSneerRight = new ARBlendShapeLocation("NoseSneerRight");
    /*</constants>*/
    
    private static /*<name>*/ARBlendShapeLocation/*</name>*/[] values = new /*<name>*/ARBlendShapeLocation/*</name>*/[] {/*<value_list>*/BrowDownLeft, BrowDownRight, BrowInnerUp, BrowOuterUpLeft, BrowOuterUpRight, CheekPuff, CheekSquintLeft, CheekSquintRight, EyeBlinkLeft, EyeBlinkRight, EyeLookDownLeft, EyeLookDownRight, EyeLookInLeft, EyeLookInRight, EyeLookOutLeft, EyeLookOutRight, EyeLookUpLeft, EyeLookUpRight, EyeSquintLeft, EyeSquintRight, EyeWideLeft, EyeWideRight, JawForward, JawLeft, JawOpen, JawRight, MouthClose, MouthDimpleLeft, MouthDimpleRight, MouthFrownLeft, MouthFrownRight, MouthFunnel, MouthLeft, MouthLowerDownLeft, MouthLowerDownRight, MouthPressLeft, MouthPressRight, MouthPucker, MouthRight, MouthRollLower, MouthRollUpper, MouthShrugLower, MouthShrugUpper, MouthSmileLeft, MouthSmileRight, MouthStretchLeft, MouthStretchRight, MouthUpperUpLeft, MouthUpperUpRight, NoseSneerLeft, NoseSneerRight/*</value_list>*/};
    
    /*<name>*/ARBlendShapeLocation/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/ARBlendShapeLocation/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/ARBlendShapeLocation/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/ARBlendShapeLocation/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("ARKit") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationBrowDownLeft", optional=true)
        public static native NSString BrowDownLeft();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationBrowDownRight", optional=true)
        public static native NSString BrowDownRight();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationBrowInnerUp", optional=true)
        public static native NSString BrowInnerUp();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationBrowOuterUpLeft", optional=true)
        public static native NSString BrowOuterUpLeft();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationBrowOuterUpRight", optional=true)
        public static native NSString BrowOuterUpRight();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationCheekPuff", optional=true)
        public static native NSString CheekPuff();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationCheekSquintLeft", optional=true)
        public static native NSString CheekSquintLeft();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationCheekSquintRight", optional=true)
        public static native NSString CheekSquintRight();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationEyeBlinkLeft", optional=true)
        public static native NSString EyeBlinkLeft();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationEyeBlinkRight", optional=true)
        public static native NSString EyeBlinkRight();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationEyeLookDownLeft", optional=true)
        public static native NSString EyeLookDownLeft();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationEyeLookDownRight", optional=true)
        public static native NSString EyeLookDownRight();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationEyeLookInLeft", optional=true)
        public static native NSString EyeLookInLeft();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationEyeLookInRight", optional=true)
        public static native NSString EyeLookInRight();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationEyeLookOutLeft", optional=true)
        public static native NSString EyeLookOutLeft();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationEyeLookOutRight", optional=true)
        public static native NSString EyeLookOutRight();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationEyeLookUpLeft", optional=true)
        public static native NSString EyeLookUpLeft();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationEyeLookUpRight", optional=true)
        public static native NSString EyeLookUpRight();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationEyeSquintLeft", optional=true)
        public static native NSString EyeSquintLeft();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationEyeSquintRight", optional=true)
        public static native NSString EyeSquintRight();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationEyeWideLeft", optional=true)
        public static native NSString EyeWideLeft();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationEyeWideRight", optional=true)
        public static native NSString EyeWideRight();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationJawForward", optional=true)
        public static native NSString JawForward();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationJawLeft", optional=true)
        public static native NSString JawLeft();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationJawOpen", optional=true)
        public static native NSString JawOpen();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationJawRight", optional=true)
        public static native NSString JawRight();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationMouthClose", optional=true)
        public static native NSString MouthClose();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationMouthDimpleLeft", optional=true)
        public static native NSString MouthDimpleLeft();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationMouthDimpleRight", optional=true)
        public static native NSString MouthDimpleRight();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationMouthFrownLeft", optional=true)
        public static native NSString MouthFrownLeft();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationMouthFrownRight", optional=true)
        public static native NSString MouthFrownRight();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationMouthFunnel", optional=true)
        public static native NSString MouthFunnel();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationMouthLeft", optional=true)
        public static native NSString MouthLeft();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationMouthLowerDownLeft", optional=true)
        public static native NSString MouthLowerDownLeft();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationMouthLowerDownRight", optional=true)
        public static native NSString MouthLowerDownRight();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationMouthPressLeft", optional=true)
        public static native NSString MouthPressLeft();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationMouthPressRight", optional=true)
        public static native NSString MouthPressRight();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationMouthPucker", optional=true)
        public static native NSString MouthPucker();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationMouthRight", optional=true)
        public static native NSString MouthRight();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationMouthRollLower", optional=true)
        public static native NSString MouthRollLower();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationMouthRollUpper", optional=true)
        public static native NSString MouthRollUpper();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationMouthShrugLower", optional=true)
        public static native NSString MouthShrugLower();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationMouthShrugUpper", optional=true)
        public static native NSString MouthShrugUpper();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationMouthSmileLeft", optional=true)
        public static native NSString MouthSmileLeft();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationMouthSmileRight", optional=true)
        public static native NSString MouthSmileRight();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationMouthStretchLeft", optional=true)
        public static native NSString MouthStretchLeft();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationMouthStretchRight", optional=true)
        public static native NSString MouthStretchRight();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationMouthUpperUpLeft", optional=true)
        public static native NSString MouthUpperUpLeft();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationMouthUpperUpRight", optional=true)
        public static native NSString MouthUpperUpRight();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationNoseSneerLeft", optional=true)
        public static native NSString NoseSneerLeft();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="ARBlendShapeLocationNoseSneerRight", optional=true)
        public static native NSString NoseSneerRight();
        /*</values>*/
    }
}
