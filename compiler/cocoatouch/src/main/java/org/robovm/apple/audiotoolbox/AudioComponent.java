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
package org.robovm.apple.audiotoolbox;

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
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremidi.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("AudioToolbox")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AudioComponent/*</name>*/ 
    extends /*<extends>*/NativeObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {
    
    public static class Notifications {
        /**
         * @since Available in iOS 7.0 and later.
         */
        public static NSObjectProtocol observeRegistrationsChanged(final Runnable block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(RegistrationsChangedNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.run();
                }
            });
        }
    }

    /*<ptr>*/public static class AudioComponentPtr extends Ptr<AudioComponent, AudioComponentPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(AudioComponent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AudioComponent() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /**
     * @throws OSStatusException 
     * @since Available in iOS 2.0 and later.
     */
    public String getName() throws OSStatusException {
        CFString.CFStringPtr ptr = new CFString.CFStringPtr();
        OSStatus status = getName0(ptr);
        if (OSStatusException.throwIfNecessary(status)) {
            return ptr.get().toString();
        }
        return null;
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 2.0 and later.
     */
    public AudioComponentDescription getDescription() throws OSStatusException {
        AudioComponentDescription.AudioComponentDescriptionPtr ptr = new AudioComponentDescription.AudioComponentDescriptionPtr();
        OSStatus status = getDescription0(ptr);
        OSStatusException.throwIfNecessary(status);
        return ptr.get();
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 2.0 and later.
     */
    public int getVersion() throws OSStatusException {
        IntPtr ptr = new IntPtr();
        OSStatus status = getVersion0(ptr);
        OSStatusException.throwIfNecessary(status);
        return ptr.get();
    }
    /*<methods>*/
    @GlobalValue(symbol="kAudioComponentRegistrationsChangedNotification", optional=true)
    public static native NSString RegistrationsChangedNotification();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kAudioComponentInstanceInvalidationNotification", optional=true)
    public static native NSString InstanceInvalidationNotification();
    
    @Bridge(symbol="AudioComponentFindNext", optional=true)
    public static native AudioComponent findNext(AudioComponent inComponent, AudioComponentDescription inDesc);
    @Bridge(symbol="AudioComponentCount", optional=true)
    public static native int count(AudioComponentDescription inDesc);
    @Bridge(symbol="AudioComponentCopyName", optional=true)
    protected native OSStatus getName0(CFString.CFStringPtr outName);
    @Bridge(symbol="AudioComponentGetDescription", optional=true)
    protected native OSStatus getDescription0(AudioComponentDescription.AudioComponentDescriptionPtr desc);
    @Bridge(symbol="AudioComponentGetVersion", optional=true)
    protected native OSStatus getVersion0(IntPtr outVersion);
    /**
     * @deprecated Deprecated in iOS 14.0. Use AudioComponentCopyIcon
     */
    @Deprecated
    @WeaklyLinked
    @Bridge(symbol="AudioComponentGetIcon", optional=true)
    public native UIImage getIcon(float desiredPointSize);
    /**
     * @deprecated Deprecated in iOS 13.0. Inter-App Audio API is deprecated in favor of Audio Units
     */
    @Deprecated
    @Bridge(symbol="AudioComponentGetLastActiveTime", optional=true)
    public native double getLastActiveTime();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Bridge(symbol="AudioComponentCopyIcon", optional=true)
    public native UIImage copyIcon();
    /*</methods>*/
}
