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
package org.robovm.apple.carplay;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.mapkit.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coremedia.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 26.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CarPlay") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPNavigationWaypoint/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CPNavigationWaypointPtr extends Ptr<CPNavigationWaypoint, CPNavigationWaypointPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CPNavigationWaypoint.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CPNavigationWaypoint() {}
    protected CPNavigationWaypoint(Handle h, long handle) { super(h, handle); }
    protected CPNavigationWaypoint(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCenterPoint:locationThreshold:nameVariants:addressVariants:entryPoints:entryPointsCount:timeZone:")
    public CPNavigationWaypoint(@ByVal CPLocationCoordinate3D centerPoint, NSMeasurement<NSUnitLength> locationThreshold, NSArray<NSString> nameVariants, NSArray<NSString> addressVariants, CPLocationCoordinate3D entryPoints, @MachineSizedUInt long entryPointsCount, NSTimeZone timeZone) { super((SkipInit) null); initObject(init(centerPoint, locationThreshold, nameVariants, addressVariants, entryPoints, entryPointsCount, timeZone)); }
    /**
     * @since Available in iOS 26.4 and later.
     * @deprecated Deprecated in iOS 27.0. Use initWithCenterPoint:locationThreshold:nameVariants:addressVariants:entryPoints:entryPointsCount:timeZone:
     */
    @Deprecated
    @Method(selector = "initWithCenterPoint:locationThreshold:name:address:entryPoints:entryPointsCount:timeZone:")
    public CPNavigationWaypoint(@ByVal CPLocationCoordinate3D centerPoint, NSMeasurement<NSUnitLength> locationThreshold, String name, String address, CPLocationCoordinate3D entryPoints, @MachineSizedUInt long entryPointsCount, NSTimeZone timeZone) { super((SkipInit) null); initObject(init(centerPoint, locationThreshold, name, address, entryPoints, entryPointsCount, timeZone)); }
    @Method(selector = "initWithMapItem:locationThreshold:entryPoints:entryPointsCount:")
    public CPNavigationWaypoint(MKMapItem mapItem, NSMeasurement<NSUnitLength> locationThreshold, CPLocationCoordinate3D entryPoints, @MachineSizedUInt long entryPointsCount) { super((SkipInit) null); initObject(init(mapItem, locationThreshold, entryPoints, entryPointsCount)); }
    @Method(selector = "initWithCoder:")
    public CPNavigationWaypoint(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "centerPoint")
    public native @ByVal CPLocationCoordinate3D getCenterPoint();
    @Property(selector = "locationThreshold")
    public native NSMeasurement<NSUnitLength> getLocationThreshold();
    /**
     * @since Available in iOS 26.4 and later.
     * @deprecated Deprecated in iOS 27.0. Use nameVariants
     */
    @Deprecated
    @Property(selector = "name")
    public native String getName();
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Property(selector = "nameVariants")
    public native NSArray<NSString> getNameVariants();
    /**
     * @since Available in iOS 26.4 and later.
     * @deprecated Deprecated in iOS 27.0. Use addressVariants
     */
    @Deprecated
    @Property(selector = "address")
    public native String getAddress();
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Property(selector = "addressVariants")
    public native NSArray<NSString> getAddressVariants();
    @Property(selector = "entryPoints")
    public native CPLocationCoordinate3D getEntryPoints();
    @Property(selector = "entryPointsCount")
    public native @MachineSizedUInt long getEntryPointsCount();
    @Property(selector = "timeZone")
    public native NSTimeZone getTimeZone();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCenterPoint:locationThreshold:nameVariants:addressVariants:entryPoints:entryPointsCount:timeZone:")
    protected native @Pointer long init(@ByVal CPLocationCoordinate3D centerPoint, NSMeasurement<NSUnitLength> locationThreshold, NSArray<NSString> nameVariants, NSArray<NSString> addressVariants, CPLocationCoordinate3D entryPoints, @MachineSizedUInt long entryPointsCount, NSTimeZone timeZone);
    /**
     * @since Available in iOS 26.4 and later.
     * @deprecated Deprecated in iOS 27.0. Use initWithCenterPoint:locationThreshold:nameVariants:addressVariants:entryPoints:entryPointsCount:timeZone:
     */
    @Deprecated
    @Method(selector = "initWithCenterPoint:locationThreshold:name:address:entryPoints:entryPointsCount:timeZone:")
    protected native @Pointer long init(@ByVal CPLocationCoordinate3D centerPoint, NSMeasurement<NSUnitLength> locationThreshold, String name, String address, CPLocationCoordinate3D entryPoints, @MachineSizedUInt long entryPointsCount, NSTimeZone timeZone);
    @Method(selector = "initWithMapItem:locationThreshold:entryPoints:entryPointsCount:")
    protected native @Pointer long init(MKMapItem mapItem, NSMeasurement<NSUnitLength> locationThreshold, CPLocationCoordinate3D entryPoints, @MachineSizedUInt long entryPointsCount);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
