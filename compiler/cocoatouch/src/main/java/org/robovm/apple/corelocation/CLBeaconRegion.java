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
package org.robovm.apple.corelocation;

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
import org.robovm.apple.addressbook.*;
import org.robovm.apple.corebluetooth.*;
import org.robovm.apple.contacts.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("CoreLocation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CLBeaconRegion/*</name>*/ 
    extends /*<extends>*/CLRegion/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CLBeaconRegionPtr extends Ptr<CLBeaconRegion, CLBeaconRegionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CLBeaconRegion.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CLBeaconRegion() {}
    protected CLBeaconRegion(Handle h, long handle) { super(h, handle); }
    protected CLBeaconRegion(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "initWithUUID:identifier:")
    public static  CLBeaconRegion createUsingUUID(NSUUID uuid, String identifier) {
       CLBeaconRegion res = new CLBeaconRegion((SkipInit) null);
       res.initObject(res.createUsingUUID0(uuid, identifier));
       return res;
    }
    /**
     * @deprecated Deprecated in iOS 13.0. Use -initWithUUID:identifier:
     */
    @Deprecated
    @Method(selector = "initWithProximityUUID:identifier:")
    public CLBeaconRegion(NSUUID proximityUUID, String identifier) { super((SkipInit) null); initObject(init(proximityUUID, identifier)); }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "initWithUUID:major:identifier:")
    public static  CLBeaconRegion createUsingUUID(NSUUID uuid, short major, String identifier) {
       CLBeaconRegion res = new CLBeaconRegion((SkipInit) null);
       res.initObject(res.createUsingUUID0(uuid, major, identifier));
       return res;
    }
    /**
     * @deprecated Deprecated in iOS 13.0. Use -initWithUUID:major:identifier:
     */
    @Deprecated
    @Method(selector = "initWithProximityUUID:major:identifier:")
    public CLBeaconRegion(NSUUID proximityUUID, short major, String identifier) { super((SkipInit) null); initObject(init(proximityUUID, major, identifier)); }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "initWithUUID:major:minor:identifier:")
    public static  CLBeaconRegion createUsingUUID(NSUUID uuid, short major, short minor, String identifier) {
       CLBeaconRegion res = new CLBeaconRegion((SkipInit) null);
       res.initObject(res.createUsingUUID0(uuid, major, minor, identifier));
       return res;
    }
    /**
     * @deprecated Deprecated in iOS 13.0. Use -initWithUUID:major:identifier:
     */
    @Deprecated
    @Method(selector = "initWithProximityUUID:major:minor:identifier:")
    public CLBeaconRegion(NSUUID proximityUUID, short major, short minor, String identifier) { super((SkipInit) null); initObject(init(proximityUUID, major, minor, identifier)); }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "initWithBeaconIdentityConstraint:identifier:")
    public CLBeaconRegion(CLBeaconIdentityConstraint beaconIdentityConstraint, String identifier) { super((SkipInit) null); initObject(init(beaconIdentityConstraint, identifier)); }
    /**
     * @deprecated Deprecated in iOS 7.0. Please see CLCircularRegion
     */
    @Deprecated
    @Method(selector = "initCircularRegionWithCenter:radius:identifier:")
    public CLBeaconRegion(@ByVal CLLocationCoordinate2D center, double radius, String identifier) { super(center, radius, identifier); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "beaconIdentityConstraint")
    public native CLBeaconIdentityConstraint getBeaconIdentityConstraint();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "UUID")
    public native NSUUID getUUID();
    /**
     * @deprecated Deprecated in iOS 13.0. Use -UUID
     */
    @Deprecated
    @Property(selector = "proximityUUID")
    public native NSUUID getProximityUUID();
    @Property(selector = "major")
    public native NSNumber getMajor();
    @Property(selector = "minor")
    public native NSNumber getMinor();
    @Property(selector = "notifyEntryStateOnDisplay")
    public native boolean notifiesEntryStateOnDisplay();
    @Property(selector = "setNotifyEntryStateOnDisplay:")
    public native void setNotifiesEntryStateOnDisplay(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "initWithUUID:identifier:")
    protected native @Pointer long createUsingUUID0(NSUUID uuid, String identifier);
    /**
     * @deprecated Deprecated in iOS 13.0. Use -initWithUUID:identifier:
     */
    @Deprecated
    @Method(selector = "initWithProximityUUID:identifier:")
    protected native @Pointer long init(NSUUID proximityUUID, String identifier);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "initWithUUID:major:identifier:")
    protected native @Pointer long createUsingUUID0(NSUUID uuid, short major, String identifier);
    /**
     * @deprecated Deprecated in iOS 13.0. Use -initWithUUID:major:identifier:
     */
    @Deprecated
    @Method(selector = "initWithProximityUUID:major:identifier:")
    protected native @Pointer long init(NSUUID proximityUUID, short major, String identifier);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "initWithUUID:major:minor:identifier:")
    protected native @Pointer long createUsingUUID0(NSUUID uuid, short major, short minor, String identifier);
    /**
     * @deprecated Deprecated in iOS 13.0. Use -initWithUUID:major:identifier:
     */
    @Deprecated
    @Method(selector = "initWithProximityUUID:major:minor:identifier:")
    protected native @Pointer long init(NSUUID proximityUUID, short major, short minor, String identifier);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "initWithBeaconIdentityConstraint:identifier:")
    protected native @Pointer long init(CLBeaconIdentityConstraint beaconIdentityConstraint, String identifier);
    @WeaklyLinked
    @Method(selector = "peripheralDataWithMeasuredPower:")
    public native CBAdvertisementData getPeripheralData(NSNumber measuredPower);
    /*</methods>*/
}
