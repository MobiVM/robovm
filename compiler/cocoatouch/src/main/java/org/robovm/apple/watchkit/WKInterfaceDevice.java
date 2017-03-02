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
package org.robovm.apple.watchkit;

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
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("WatchKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/WKInterfaceDevice/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class WKInterfaceDevicePtr extends Ptr<WKInterfaceDevice, WKInterfaceDevicePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(WKInterfaceDevice.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public WKInterfaceDevice() {}
    protected WKInterfaceDevice(Handle h, long handle) { super(h, handle); }
    protected WKInterfaceDevice(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 8.2 and later.
     */
    @Property(selector = "cachedImages")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSDictionary.AsStringMapMarshaler.class) Map<String, NSNumber> getCachedImages();
    @Property(selector = "screenBounds")
    public native @ByVal CGRect getScreenBounds();
    @Property(selector = "screenScale")
    public native @MachineSizedFloat double getScreenScale();
    @Property(selector = "preferredContentSizeCategory")
    public native UIContentSizeCategory getPreferredContentSizeCategory();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "systemVersion")
    public native String getSystemVersion();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "name")
    public native String getName();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "model")
    public native String getModel();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "localizedModel")
    public native String getLocalizedModel();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "systemName")
    public native String getSystemName();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 8.2 and later.
     */
    @Method(selector = "addCachedImage:name:")
    public native boolean addCachedImage(UIImage image, String name);
    /**
     * @since Available in iOS 8.2 and later.
     */
    @Method(selector = "addCachedImageWithData:name:")
    public native boolean addCachedImage(NSData imageData, String name);
    /**
     * @since Available in iOS 8.2 and later.
     */
    @Method(selector = "removeCachedImageWithName:")
    public native void removeCachedImage(String name);
    /**
     * @since Available in iOS 8.2 and later.
     */
    @Method(selector = "removeAllCachedImages")
    public native void removeAllCachedImages();
    @Method(selector = "currentDevice")
    public static native WKInterfaceDevice getCurrentDevice();
    /*</methods>*/
}
