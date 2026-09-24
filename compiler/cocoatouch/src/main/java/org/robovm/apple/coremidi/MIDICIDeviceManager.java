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
package org.robovm.apple.coremidi;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 18.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreMIDI") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MIDICIDeviceManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MIDICIDeviceManagerPtr extends Ptr<MIDICIDeviceManager, MIDICIDeviceManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MIDICIDeviceManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MIDICIDeviceManager() {}
    protected MIDICIDeviceManager(Handle h, long handle) { super(h, handle); }
    protected MIDICIDeviceManager(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sharedInstance")
    public static native MIDICIDeviceManager getSharedInstance();
    @Property(selector = "discoveredCIDevices")
    public native NSArray<MIDICIDevice> getDiscoveredCIDevices();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Library("CoreMIDI")
    public static class Keys {
        static { Bro.bind(Keys.class); }

        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="MIDICIDeviceObjectKey", optional=true)
        public static native NSString DeviceObject();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="MIDICIProfileObjectKey", optional=true)
        public static native NSString ProfileObject();
    }

    @Library("CoreMIDI")
    public static class Notifications {
        static { Bro.bind(Notifications.class); }

        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="MIDICIDeviceWasAddedNotification", optional=true)
        public static native NSString DeviceWasAdded();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="MIDICIDeviceWasRemovedNotification", optional=true)
        public static native NSString DeviceWasRemoved();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="MIDICIProfileWasUpdatedNotification", optional=true)
        public static native NSString ProfileWasUpdated();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="MIDICIProfileWasRemovedNotification", optional=true)
        public static native NSString ProfileWasRemoved();
    }
    
    
    /*</methods>*/
}
