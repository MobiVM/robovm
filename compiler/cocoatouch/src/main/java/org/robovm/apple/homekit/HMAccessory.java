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
package org.robovm.apple.homekit;

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
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 8.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("HomeKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HMAccessory/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HMAccessoryPtr extends Ptr<HMAccessory, HMAccessoryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HMAccessory.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public HMAccessory() {}
    protected HMAccessory(Handle h, long handle) { super(h, handle); }
    protected HMAccessory(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "name")
    public native String getName();
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 9.0. No longer supported.
     */
    @Deprecated
    @Property(selector = "identifier")
    public native NSUUID getIdentifier();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "uniqueIdentifier")
    public native NSUUID getUniqueIdentifier();
    @Property(selector = "delegate")
    public native HMAccessoryDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(HMAccessoryDelegate v);
    @Property(selector = "isReachable")
    public native boolean isReachable();
    @Property(selector = "isBridged")
    public native boolean isBridged();
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 9.0. No longer supported.
     */
    @Deprecated
    @Property(selector = "identifiersForBridgedAccessories")
    public native NSArray<NSUUID> getIdentifiersForBridgedAccessories();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "uniqueIdentifiersForBridgedAccessories")
    public native NSArray<NSUUID> getUniqueIdentifiersForBridgedAccessories();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "category")
    public native HMAccessoryCategory getCategory();
    @Property(selector = "room")
    public native HMRoom getRoom();
    @Property(selector = "services")
    public native NSArray<HMService> getServices();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "profiles")
    public native NSArray<HMAccessoryProfile> getProfiles();
    @Property(selector = "isBlocked")
    public native boolean isBlocked();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "model")
    public native String getModel();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "manufacturer")
    public native String getManufacturer();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "firmwareVersion")
    public native String getFirmwareVersion();
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Property(selector = "supportsIdentify")
    public native boolean supportsIdentify();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "cameraProfiles")
    public native NSArray<HMCameraProfile> getCameraProfiles();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "updateName:completionHandler:")
    public native void updateName(String name, @Block VoidBlock1<NSError> completion);
    @Method(selector = "identifyWithCompletionHandler:")
    public native void identify(@Block VoidBlock1<NSError> completion);
    /*</methods>*/
}
