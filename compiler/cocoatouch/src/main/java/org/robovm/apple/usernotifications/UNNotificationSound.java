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
package org.robovm.apple.usernotifications;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UserNotifications") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UNNotificationSound/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class UNNotificationSoundPtr extends Ptr<UNNotificationSound, UNNotificationSoundPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UNNotificationSound.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UNNotificationSound() {}
    protected UNNotificationSound(Handle h, long handle) { super(h, handle); }
    protected UNNotificationSound(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public UNNotificationSound(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "defaultSound")
    public static native UNNotificationSound getDefaultSound();
    /**
     * @since Available in iOS 15.2 and later.
     */
    @Property(selector = "defaultRingtoneSound")
    public static native UNNotificationSound getDefaultRingtoneSound();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "defaultCriticalSound")
    public static native UNNotificationSound getDefaultCriticalSound();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "defaultCriticalSoundWithAudioVolume:")
    public static native UNNotificationSound getDefaultCriticalSound(float volume);
    @Method(selector = "soundNamed:")
    public static native UNNotificationSound soundNamed(String name);
    /**
     * @since Available in iOS 15.2 and later.
     */
    @Method(selector = "ringtoneSoundNamed:")
    public static native UNNotificationSound ringtoneSoundNamed(String name);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "criticalSoundNamed:")
    public static native UNNotificationSound getCriticalSound(String name);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "criticalSoundNamed:withAudioVolume:")
    public static native UNNotificationSound getCriticalSound(String name, float volume);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
