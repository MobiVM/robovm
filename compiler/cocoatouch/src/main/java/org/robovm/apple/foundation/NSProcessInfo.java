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
package org.robovm.apple.foundation;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.security.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSProcessInfo/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    public static class Notifications {
        /**
         * @since Available in iOS 9.0 and later.
         */
        public static NSObject observePowerStateDidChange(final Runnable block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(PowerStateDidChangeNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.run();
                }
            });
        }
    }
    
    /*<ptr>*/public static class NSProcessInfoPtr extends Ptr<NSProcessInfo, NSProcessInfoPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSProcessInfo.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NSProcessInfo(Handle h, long handle) { super(h, handle); }
    protected NSProcessInfo(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "processInfo")
    public static native NSProcessInfo getSharedProcessInfo();
    @Property(selector = "environment")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSDictionary.AsStringMapMarshaler.class) Map<String, NSObject> getEnvironment();
    @Property(selector = "arguments")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getArguments();
    @Property(selector = "hostName")
    public native String getHostName();
    @Property(selector = "processName")
    public native String getProcessName();
    @Property(selector = "setProcessName:")
    public native void setProcessName(String v);
    @Property(selector = "processIdentifier")
    public native int getProcessIdentifier();
    @Property(selector = "globallyUniqueString")
    public native String getGloballyUniqueString();
    @Property(selector = "operatingSystemVersionString")
    public native String getOperatingSystemVersionString();
    @Property(selector = "operatingSystemVersion")
    public native @ByVal NSOperatingSystemVersion getOperatingSystemVersion();
    @Property(selector = "processorCount")
    public native @MachineSizedUInt long getProcessorCount();
    @Property(selector = "activeProcessorCount")
    public native @MachineSizedUInt long getActiveProcessorCount();
    @Property(selector = "physicalMemory")
    public native long getPhysicalMemory();
    @Property(selector = "systemUptime")
    public native double getSystemUptime();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "thermalState")
    public native NSProcessInfoThermalState getThermalState();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "isLowPowerModeEnabled")
    public native boolean isLowPowerModeEnabled();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "isMacCatalystApp")
    public native boolean isMacCatalystApp();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="NSProcessInfoThermalStateDidChangeNotification", optional=true)
    public static native NSString ThermalStateDidChangeNotification();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="NSProcessInfoPowerStateDidChangeNotification", optional=true)
    public static native NSString PowerStateDidChangeNotification();
    
    /**
     * @deprecated Deprecated in iOS 8.0. -operatingSystem always returns NSMACHOperatingSystem, use -operatingSystemVersion or -isOperatingSystemAtLeastVersion: instead
     */
    @Deprecated
    @Method(selector = "operatingSystem")
    public native NSOperatingSystem getOperatingSystem();
    /**
     * @deprecated Deprecated in iOS 8.0. -operatingSystemName always returns NSMACHOperatingSystem, use -operatingSystemVersionString instead
     */
    @Deprecated
    @Method(selector = "operatingSystemName")
    public native String getOperatingSystemName();
    @Method(selector = "isOperatingSystemAtLeastVersion:")
    public native boolean isOperatingSystemAtLeastVersion(@ByVal NSOperatingSystemVersion version);
    @Method(selector = "beginActivityWithOptions:reason:")
    public native NSObject beginActivity(NSActivityOptions options, String reason);
    @Method(selector = "endActivity:")
    public native void endActivity(NSObject activity);
    @Method(selector = "performActivityWithOptions:reason:usingBlock:")
    public native void performActivity(NSActivityOptions options, String reason, @Block Runnable block);
    /**
     * @since Available in iOS 8.2 and later.
     */
    @Method(selector = "performExpiringActivityWithReason:usingBlock:")
    public native void performExpiringActivity(String reason, @Block VoidBooleanBlock block);
    /*</methods>*/
}
