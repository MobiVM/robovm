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
package org.robovm.apple.avfoundation;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.mediatoolbox.*;
import org.robovm.apple.audiotoolbox.*;
import org.robovm.apple.coremidi.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/AVCaptureReactionType/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVCaptureReactionType/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/AVCaptureReactionType/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static AVCaptureReactionType toObject(Class<AVCaptureReactionType> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return AVCaptureReactionType.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(AVCaptureReactionType o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<AVCaptureReactionType> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<AVCaptureReactionType> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(AVCaptureReactionType.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<AVCaptureReactionType> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (AVCaptureReactionType o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final AVCaptureReactionType ThumbsUp = new AVCaptureReactionType("ThumbsUp");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final AVCaptureReactionType ThumbsDown = new AVCaptureReactionType("ThumbsDown");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final AVCaptureReactionType Balloons = new AVCaptureReactionType("Balloons");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final AVCaptureReactionType Heart = new AVCaptureReactionType("Heart");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final AVCaptureReactionType Fireworks = new AVCaptureReactionType("Fireworks");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final AVCaptureReactionType Rain = new AVCaptureReactionType("Rain");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final AVCaptureReactionType Confetti = new AVCaptureReactionType("Confetti");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final AVCaptureReactionType Lasers = new AVCaptureReactionType("Lasers");
    /*</constants>*/
    
    private static /*<name>*/AVCaptureReactionType/*</name>*/[] values = new /*<name>*/AVCaptureReactionType/*</name>*/[] {/*<value_list>*/ThumbsUp, ThumbsDown, Balloons, Heart, Fireworks, Rain, Confetti, Lasers/*</value_list>*/};
    
    /*<name>*/AVCaptureReactionType/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/AVCaptureReactionType/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/AVCaptureReactionType/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/AVCaptureReactionType/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("AVFoundation") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="AVCaptureReactionTypeThumbsUp", optional=true)
        public static native NSString ThumbsUp();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="AVCaptureReactionTypeThumbsDown", optional=true)
        public static native NSString ThumbsDown();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="AVCaptureReactionTypeBalloons", optional=true)
        public static native NSString Balloons();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="AVCaptureReactionTypeHeart", optional=true)
        public static native NSString Heart();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="AVCaptureReactionTypeFireworks", optional=true)
        public static native NSString Fireworks();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="AVCaptureReactionTypeRain", optional=true)
        public static native NSString Rain();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="AVCaptureReactionTypeConfetti", optional=true)
        public static native NSString Confetti();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="AVCaptureReactionTypeLasers", optional=true)
        public static native NSString Lasers();
        /*</values>*/
    }
}
