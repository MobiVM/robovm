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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CLLocationManagerDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements CLLocationManagerDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("locationManager:didUpdateLocations:")
    public void didUpdateLocations(CLLocationManager manager, NSArray<CLLocation> locations) {}
    @NotImplemented("locationManager:didUpdateHeading:")
    public void didUpdateHeading(CLLocationManager manager, CLHeading newHeading) {}
    @NotImplemented("locationManagerShouldDisplayHeadingCalibration:")
    public boolean shouldDisplayHeadingCalibration(CLLocationManager manager) { return false; }
    @NotImplemented("locationManager:didDetermineState:forRegion:")
    public void didDetermineState(CLLocationManager manager, CLRegionState state, CLRegion region) {}
    /**
     * @deprecated Deprecated in iOS 13.0. Use locationManager:didRangeBeacons:satisfyingConstraint:
     */
    @Deprecated
    @NotImplemented("locationManager:didRangeBeacons:inRegion:")
    public void didRangeBeacons(CLLocationManager manager, NSArray<CLBeacon> beacons, CLBeaconRegion region) {}
    /**
     * @deprecated Deprecated in iOS 13.0. Use locationManager:didFailRangingBeaconsForConstraint:error:
     */
    @Deprecated
    @NotImplemented("locationManager:rangingBeaconsDidFailForRegion:withError:")
    public void rangingBeaconsDidFail(CLLocationManager manager, CLBeaconRegion region, NSError error) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("locationManager:didRangeBeacons:satisfyingConstraint:")
    public void didRangeBeacons(CLLocationManager manager, NSArray<CLBeacon> beacons, CLBeaconIdentityConstraint beaconConstraint) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("locationManager:didFailRangingBeaconsForConstraint:error:")
    public void didFailRangingBeacons(CLLocationManager manager, CLBeaconIdentityConstraint beaconConstraint, NSError error) {}
    @NotImplemented("locationManager:didEnterRegion:")
    public void didEnterRegion(CLLocationManager manager, CLRegion region) {}
    @NotImplemented("locationManager:didExitRegion:")
    public void didExitRegion(CLLocationManager manager, CLRegion region) {}
    @NotImplemented("locationManager:didFailWithError:")
    public void didFail(CLLocationManager manager, NSError error) {}
    @NotImplemented("locationManager:monitoringDidFailForRegion:withError:")
    public void monitoringDidFail(CLLocationManager manager, CLRegion region, NSError error) {}
    /**
     * @deprecated Deprecated in iOS 14.0. Use -locationManagerDidChangeAuthorization:
     */
    @Deprecated
    @NotImplemented("locationManager:didChangeAuthorizationStatus:")
    public void didChangeAuthorizationStatus(CLLocationManager manager, CLAuthorizationStatus status) {}
    /**
     * @since Available in iOS 14.0 and later.
     */
    @NotImplemented("locationManagerDidChangeAuthorization:")
    public void locationManagerDidChangeAuthorization(CLLocationManager manager) {}
    @NotImplemented("locationManager:didStartMonitoringForRegion:")
    public void didStartMonitoring(CLLocationManager manager, CLRegion region) {}
    @NotImplemented("locationManagerDidPauseLocationUpdates:")
    public void didPauseLocationUpdates(CLLocationManager manager) {}
    @NotImplemented("locationManagerDidResumeLocationUpdates:")
    public void didResumeLocationUpdates(CLLocationManager manager) {}
    @NotImplemented("locationManager:didFinishDeferredUpdatesWithError:")
    public void didFinishDeferredUpdates(CLLocationManager manager, NSError error) {}
    @NotImplemented("locationManager:didVisit:")
    public void didVisit(CLLocationManager manager, CLVisit visit) {}
    /*</methods>*/
}
