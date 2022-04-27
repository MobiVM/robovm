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
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation")/*</annotations>*/
@Marshaler(/*<name>*/AVAudioSessionInterruptionNotification/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVAudioSessionInterruptionNotification/*</name>*/ 
    extends /*<extends>*/NSDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static AVAudioSessionInterruptionNotification toObject(Class<AVAudioSessionInterruptionNotification> cls, long handle, long flags) {
            NSDictionary o = (NSDictionary) NSObject.Marshaler.toObject(NSDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new AVAudioSessionInterruptionNotification(o);
        }
        @MarshalsPointer
        public static long toNative(AVAudioSessionInterruptionNotification o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<AVAudioSessionInterruptionNotification> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSDictionary> o = (NSArray<NSDictionary>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<AVAudioSessionInterruptionNotification> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new AVAudioSessionInterruptionNotification(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<AVAudioSessionInterruptionNotification> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSDictionary> array = new NSMutableArray<>();
            for (AVAudioSessionInterruptionNotification i : l) {
                array.add(i.getDictionary());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    AVAudioSessionInterruptionNotification(NSDictionary data) {
        super(data);
    }
    public AVAudioSessionInterruptionNotification() {}
    /*</constructors>*/

    /*<methods>*/
    public boolean has(NSString key) {
        return data.containsKey(key);
    }
    public NSObject get(NSString key) {
        if (has(key)) {
            return data.get(key);
        }
        return null;
    }
    public AVAudioSessionInterruptionNotification set(NSString key, NSObject value) {
        data.put(key, value);
        return this;
    }
    

    public AVAudioSessionInterruptionType getType() {
        if (has(Keys.Type())) {
            NSNumber val = (NSNumber) get(Keys.Type());
            return AVAudioSessionInterruptionType.valueOf(val.longValue());
        }
        return null;
    }
    public AVAudioSessionInterruptionNotification setType(AVAudioSessionInterruptionType type) {
        set(Keys.Type(), NSNumber.valueOf(type.value()));
        return this;
    }
    public AVAudioSessionInterruptionOptions getOptions() {
        if (has(Keys.Option())) {
            NSNumber val = (NSNumber) get(Keys.Option());
            return new AVAudioSessionInterruptionOptions(val.longValue());
        }
        return null;
    }
    public AVAudioSessionInterruptionNotification setOptions(AVAudioSessionInterruptionOptions options) {
        set(Keys.Option(), NSNumber.valueOf(options.value()));
        return this;
    }
    /*</methods>*/
    
    /*<keys>*/
    @Library("AVFoundation")
    public static class Keys {
        static { Bro.bind(Keys.class); }
        @GlobalValue(symbol="AVAudioSessionInterruptionTypeKey", optional=true)
        public static native NSString Type();
        @GlobalValue(symbol="AVAudioSessionInterruptionOptionKey", optional=true)
        public static native NSString Option();
        /**
         * @since Available in iOS 14.5 and later.
         */
        @GlobalValue(symbol="AVAudioSessionInterruptionReasonKey", optional=true)
        public static native NSString Reason();
        /**
         * @since Available in iOS 10.3 and later.
         * @deprecated Deprecated in iOS 14.5. No longer supported - see AVAudioSessionInterruptionReasonKey
         */
        @Deprecated
        @GlobalValue(symbol="AVAudioSessionInterruptionWasSuspendedKey", optional=true)
        public static native NSString WasSuspended();
    }
    /*</keys>*/
}
