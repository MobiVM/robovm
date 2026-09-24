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
@Marshaler(/*<name>*/AVCoordinatedPlaybackSuspensionReason/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVCoordinatedPlaybackSuspensionReason/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/AVCoordinatedPlaybackSuspensionReason/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static AVCoordinatedPlaybackSuspensionReason toObject(Class<AVCoordinatedPlaybackSuspensionReason> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return AVCoordinatedPlaybackSuspensionReason.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(AVCoordinatedPlaybackSuspensionReason o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<AVCoordinatedPlaybackSuspensionReason> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<AVCoordinatedPlaybackSuspensionReason> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(AVCoordinatedPlaybackSuspensionReason.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<AVCoordinatedPlaybackSuspensionReason> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (AVCoordinatedPlaybackSuspensionReason o : l) {
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
    public static final AVCoordinatedPlaybackSuspensionReason AudioSessionInterrupted = new AVCoordinatedPlaybackSuspensionReason("AudioSessionInterrupted");
    /**
     * @since Available in iOS 15.0 and later.
     */
    public static final AVCoordinatedPlaybackSuspensionReason StallRecovery = new AVCoordinatedPlaybackSuspensionReason("StallRecovery");
    /**
     * @since Available in iOS 15.0 and later.
     */
    public static final AVCoordinatedPlaybackSuspensionReason PlayingInterstitial = new AVCoordinatedPlaybackSuspensionReason("PlayingInterstitial");
    /**
     * @since Available in iOS 15.0 and later.
     */
    public static final AVCoordinatedPlaybackSuspensionReason CoordinatedPlaybackNotPossible = new AVCoordinatedPlaybackSuspensionReason("CoordinatedPlaybackNotPossible");
    /**
     * @since Available in iOS 15.0 and later.
     */
    public static final AVCoordinatedPlaybackSuspensionReason UserActionRequired = new AVCoordinatedPlaybackSuspensionReason("UserActionRequired");
    /**
     * @since Available in iOS 15.0 and later.
     */
    public static final AVCoordinatedPlaybackSuspensionReason UserIsChangingCurrentTime = new AVCoordinatedPlaybackSuspensionReason("UserIsChangingCurrentTime");
    /*</constants>*/
    
    private static /*<name>*/AVCoordinatedPlaybackSuspensionReason/*</name>*/[] values = new /*<name>*/AVCoordinatedPlaybackSuspensionReason/*</name>*/[] {/*<value_list>*/AudioSessionInterrupted, StallRecovery, PlayingInterstitial, CoordinatedPlaybackNotPossible, UserActionRequired, UserIsChangingCurrentTime/*</value_list>*/};
    
    /*<name>*/AVCoordinatedPlaybackSuspensionReason/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/AVCoordinatedPlaybackSuspensionReason/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/AVCoordinatedPlaybackSuspensionReason/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/AVCoordinatedPlaybackSuspensionReason/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("AVFoundation") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="AVCoordinatedPlaybackSuspensionReasonAudioSessionInterrupted", optional=true)
        public static native NSString AudioSessionInterrupted();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="AVCoordinatedPlaybackSuspensionReasonStallRecovery", optional=true)
        public static native NSString StallRecovery();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="AVCoordinatedPlaybackSuspensionReasonPlayingInterstitial", optional=true)
        public static native NSString PlayingInterstitial();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="AVCoordinatedPlaybackSuspensionReasonCoordinatedPlaybackNotPossible", optional=true)
        public static native NSString CoordinatedPlaybackNotPossible();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="AVCoordinatedPlaybackSuspensionReasonUserActionRequired", optional=true)
        public static native NSString UserActionRequired();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="AVCoordinatedPlaybackSuspensionReasonUserIsChangingCurrentTime", optional=true)
        public static native NSString UserIsChangingCurrentTime();
        /*</values>*/
    }
}
