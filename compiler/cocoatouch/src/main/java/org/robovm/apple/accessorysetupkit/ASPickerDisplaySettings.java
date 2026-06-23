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
package org.robovm.apple.accessorysetupkit;

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
import org.robovm.apple.corebluetooth.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 26.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AccessorySetupKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ASPickerDisplaySettings/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ASPickerDisplaySettingsPtr extends Ptr<ASPickerDisplaySettings, ASPickerDisplaySettingsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ASPickerDisplaySettings.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ASPickerDisplaySettings() {}
    protected ASPickerDisplaySettings(Handle h, long handle) { super(h, handle); }
    protected ASPickerDisplaySettings(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "defaultSettings")
    public static native ASPickerDisplaySettings getDefaultSettings();
    @Property(selector = "discoveryTimeout")
    public native double getDiscoveryTimeout();
    @Property(selector = "setDiscoveryTimeout:")
    public native void setDiscoveryTimeout(double v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Library("AccessorySetupKit")
    public static class DiscoveryTimeout {
        static { Bro.bind(DiscoveryTimeout.class); }

        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="ASPickerDisplaySettingsDiscoveryTimeoutShort", optional=true)
        public static native double Short();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="ASPickerDisplaySettingsDiscoveryTimeoutMedium", optional=true)
        public static native double Medium();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="ASPickerDisplaySettingsDiscoveryTimeoutLong", optional=true)
        public static native double Long();
    }
    
    
    /*</methods>*/
}
