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
/**
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVAudioApplication/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVAudioApplicationPtr extends Ptr<AVAudioApplication, AVAudioApplicationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVAudioApplication.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVAudioApplication() {}
    protected AVAudioApplication(Handle h, long handle) { super(h, handle); }
    protected AVAudioApplication(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sharedInstance")
    public static native AVAudioApplication getSharedInstance();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "isInputMuted")
    public native boolean isInputMuted();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "recordPermission")
    public native AVAudioApplicationRecordPermission getRecordPermission();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Library("AVFoundation")
    public static class Keys {
        static { Bro.bind(Keys.class); }

        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="AVAudioApplicationMuteStateKey", optional=true)
        public static native NSString MuteState();
    }

    @Library("AVFoundation")
    public static class Notifications {
        static { Bro.bind(Notifications.class); }

        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="AVAudioApplicationInputMuteStateChangeNotification", optional=true)
        public static native NSString InputMuteStateChange();
    }
    
    /**
     * @since Available in iOS 17.0 and later.
     */
    public boolean setInputMuted(boolean muted) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = setInputMuted(muted, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "setInputMuted:error:")
    private native boolean setInputMuted(boolean muted, NSError.NSErrorPtr outError);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "requestRecordPermissionWithCompletionHandler:")
    public static native void requestRecordPermission(@Block VoidBooleanBlock response);
    /*</methods>*/
}
