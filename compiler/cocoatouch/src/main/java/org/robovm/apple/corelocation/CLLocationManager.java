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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CLLocationManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CLLocationManagerPtr extends Ptr<CLLocationManager, CLLocationManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CLLocationManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CLLocationManager() {}
    protected CLLocationManager(Handle h, long handle) { super(h, handle); }
    protected CLLocationManager(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native CLLocationManagerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(CLLocationManagerDelegate v);
    @Property(selector = "activityType")
    public native CLActivityType getActivityType();
    @Property(selector = "setActivityType:")
    public native void setActivityType(CLActivityType v);
    @Property(selector = "distanceFilter")
    public native double getDistanceFilter();
    @Property(selector = "setDistanceFilter:")
    public native void setDistanceFilter(double v);
    @Property(selector = "desiredAccuracy")
    public native double getDesiredAccuracy();
    @Property(selector = "setDesiredAccuracy:")
    public native void setDesiredAccuracy(double v);
    @Property(selector = "pausesLocationUpdatesAutomatically")
    public native boolean pausesLocationUpdatesAutomatically();
    @Property(selector = "setPausesLocationUpdatesAutomatically:")
    public native void setPausesLocationUpdatesAutomatically(boolean v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "allowsBackgroundLocationUpdates")
    public native boolean allowsBackgroundLocationUpdates();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setAllowsBackgroundLocationUpdates:")
    public native void setAllowsBackgroundLocationUpdates(boolean v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "showsBackgroundLocationIndicator")
    public native boolean showsBackgroundLocationIndicator();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setShowsBackgroundLocationIndicator:")
    public native void setShowsBackgroundLocationIndicator(boolean v);
    @Property(selector = "location")
    public native CLLocation getLocation();
    @Property(selector = "headingFilter")
    public native double getHeadingFilter();
    @Property(selector = "setHeadingFilter:")
    public native void setHeadingFilter(double v);
    @Property(selector = "headingOrientation")
    public native CLDeviceOrientation getHeadingOrientation();
    @Property(selector = "setHeadingOrientation:")
    public native void setHeadingOrientation(CLDeviceOrientation v);
    @Property(selector = "heading")
    public native CLHeading getHeading();
    @Property(selector = "maximumRegionMonitoringDistance")
    public native double getMaximumRegionMonitoringDistance();
    @Property(selector = "monitoredRegions")
    public native NSSet<CLRegion> getMonitoredRegions();
    /**
     * @deprecated Deprecated in iOS 13.0. Use -rangedBeaconConstraints
     */
    @Deprecated
    @Property(selector = "rangedRegions")
    public native NSSet<CLBeaconRegion> getRangedRegions();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "rangedBeaconConstraints")
    public native NSSet<CLBeaconIdentityConstraint> getRangedBeaconConstraints();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="kCLDistanceFilterNone", optional=true)
    public static native double getDistanceFilterNone();
    @GlobalValue(symbol="CLTimeIntervalMax", optional=true)
    public static native double getTimeIntervalMax();
    @GlobalValue(symbol="kCLHeadingFilterNone", optional=true)
    public static native double getHeadingFilterNone();
    
    @Method(selector = "requestWhenInUseAuthorization")
    public native void requestWhenInUseAuthorization();
    @Method(selector = "requestAlwaysAuthorization")
    public native void requestAlwaysAuthorization();
    @Method(selector = "startUpdatingLocation")
    public native void startUpdatingLocation();
    @Method(selector = "stopUpdatingLocation")
    public native void stopUpdatingLocation();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "requestLocation")
    public native void requestLocation();
    @Method(selector = "startUpdatingHeading")
    public native void startUpdatingHeading();
    @Method(selector = "stopUpdatingHeading")
    public native void stopUpdatingHeading();
    @Method(selector = "dismissHeadingCalibrationDisplay")
    public native void dismissHeadingCalibrationDisplay();
    @Method(selector = "startMonitoringSignificantLocationChanges")
    public native void startMonitoringSignificantLocationChanges();
    @Method(selector = "stopMonitoringSignificantLocationChanges")
    public native void stopMonitoringSignificantLocationChanges();
    @Method(selector = "stopMonitoringForRegion:")
    public native void stopMonitoring(CLRegion region);
    @Method(selector = "startMonitoringForRegion:")
    public native void startMonitoring(CLRegion region);
    @Method(selector = "requestStateForRegion:")
    public native void requestState(CLRegion region);
    /**
     * @deprecated Deprecated in iOS 13.0. Use -startRangingBeaconsSatisfyingConstraint:
     */
    @Deprecated
    @Method(selector = "startRangingBeaconsInRegion:")
    public native void startRangingBeacons(CLBeaconRegion region);
    /**
     * @deprecated Deprecated in iOS 13.0. Use -stopRangingBeaconsSatisfyingConstraint:
     */
    @Deprecated
    @Method(selector = "stopRangingBeaconsInRegion:")
    public native void stopRangingBeacons(CLBeaconRegion region);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "startRangingBeaconsSatisfyingConstraint:")
    public native void startRangingBeaconsSatisfyingConstraint(CLBeaconIdentityConstraint constraint);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "stopRangingBeaconsSatisfyingConstraint:")
    public native void stopRangingBeaconsSatisfyingConstraint(CLBeaconIdentityConstraint constraint);
    /**
     * @deprecated Deprecated in iOS 13.0. You can remove calls to this method
     */
    @Deprecated
    @Method(selector = "allowDeferredLocationUpdatesUntilTraveled:timeout:")
    public native void allowDeferredLocationUpdatesUntil(double distance, double timeout);
    /**
     * @deprecated Deprecated in iOS 13.0. You can remove calls to this method
     */
    @Deprecated
    @Method(selector = "disallowDeferredLocationUpdates")
    public native void disallowDeferredLocationUpdates();
    @Method(selector = "locationServicesEnabled")
    public static native boolean isLocationServicesEnabled();
    @Method(selector = "headingAvailable")
    public static native boolean isHeadingAvailable();
    @Method(selector = "significantLocationChangeMonitoringAvailable")
    public static native boolean isSignificantLocationChangeMonitoringAvailable();
    @Method(selector = "isMonitoringAvailableForClass:")
    public static native boolean isMonitoringAvailable(Class<? extends CLRegion> regionClass);
    /**
     * @deprecated Deprecated in iOS 7.0. Use +isMonitoringAvailableForClass:
     */
    @Deprecated
    @Method(selector = "regionMonitoringAvailable")
    public static native boolean isRegionMonitoringAvailable();
    @Method(selector = "isRangingAvailable")
    public static native boolean isRangingAvailable();
    @Method(selector = "authorizationStatus")
    public static native CLAuthorizationStatus getAuthorizationStatus();
    /**
     * @deprecated Deprecated in iOS 13.0. You can remove calls to this method
     */
    @Deprecated
    @Method(selector = "deferredLocationUpdatesAvailable")
    public static native boolean isDeferredLocationUpdatesAvailable();
    @Method(selector = "startMonitoringVisits")
    public native void startMonitoringVisits();
    @Method(selector = "stopMonitoringVisits")
    public native void stopMonitoringVisits();
    /*</methods>*/
}
