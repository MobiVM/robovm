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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CLGeocoder/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CLGeocoderPtr extends Ptr<CLGeocoder, CLGeocoderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CLGeocoder.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CLGeocoder() {}
    protected CLGeocoder(Handle h, long handle) { super(h, handle); }
    protected CLGeocoder(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isGeocoding")
    public native boolean isGeocoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "reverseGeocodeLocation:completionHandler:")
    public native void reverseGeocodeLocation(CLLocation location, @Block VoidBlock2<NSArray<CLPlacemark>, NSError> completionHandler);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "reverseGeocodeLocation:preferredLocale:completionHandler:")
    public native void reverseGeocodeLocation(CLLocation location, NSLocale locale, @Block VoidBlock2<NSArray<CLPlacemark>, NSError> completionHandler);
    /**
     * @deprecated Deprecated in iOS 11.0. Use -geocodePostalAddress:completionHandler:
     */
    @Deprecated
    @WeaklyLinked
    @Method(selector = "geocodeAddressDictionary:completionHandler:")
    public native void geocodeAddress(ABPersonAddress addressDictionary, @Block VoidBlock2<NSArray<CLPlacemark>, NSError> completionHandler);
    @Method(selector = "geocodeAddressString:inRegion:completionHandler:")
    public native void geocodeAddress(String addressString, CLRegion region, @Block VoidBlock2<NSArray<CLPlacemark>, NSError> completionHandler);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "geocodeAddressString:inRegion:preferredLocale:completionHandler:")
    public native void geocodeAddress(String addressString, CLRegion region, NSLocale locale, @Block VoidBlock2<NSArray<CLPlacemark>, NSError> completionHandler);
    @Method(selector = "geocodeAddressString:completionHandler:")
    public native void geocodeAddress(String addressString, @Block VoidBlock2<NSArray<CLPlacemark>, NSError> completionHandler);
    @Method(selector = "cancelGeocode")
    public native void cancelGeocode();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "geocodePostalAddress:completionHandler:")
    public native void geocodePostalAddress(CNPostalAddress postalAddress, @Block VoidBlock2<NSArray<CLPlacemark>, NSError> completionHandler);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "geocodePostalAddress:preferredLocale:completionHandler:")
    public native void geocodePostalAddress(CNPostalAddress postalAddress, NSLocale locale, @Block VoidBlock2<NSArray<CLPlacemark>, NSError> completionHandler);
    /*</methods>*/
}
