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
package org.robovm.apple.imagecapturecore;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ImageCaptureCore") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ICDevice/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ICDevicePtr extends Ptr<ICDevice, ICDevicePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ICDevice.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ICDevice() {}
    protected ICDevice(Handle h, long handle) { super(h, handle); }
    protected ICDevice(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "delegate")
    public native ICDeviceDelegate getDelegate();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(ICDeviceDelegate v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "type")
    public native ICDeviceType getType();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "capabilities")
    public native NSArray<NSString> getCapabilities();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "name")
    public native String getName();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "productKind")
    public native String getProductKind();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "icon")
    public native CGImage getIcon();
    /**
     * @since Available in iOS 15.2 and later.
     */
    @Property(selector = "systemSymbolName")
    public native String getSystemSymbolName();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "transportType")
    public native String getTransportType();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "UUIDString")
    public native String getUUIDString();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "hasOpenSession")
    public native boolean hasOpenSession();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "userData")
    public native NSMutableDictionary<?, ?> getUserData();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "usbLocationID")
    public native int getUsbLocationID();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "usbProductID")
    public native int getUsbProductID();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "usbVendorID")
    public native int getUsbVendorID();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "requestOpenSession")
    public native void requestOpenSession();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "requestCloseSession")
    public native void requestCloseSession();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "requestEject")
    public native void requestEject();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "requestOpenSessionWithOptions:completion:")
    public native void requestOpenSession(NSDictionary<NSString, ?> options, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "requestCloseSessionWithOptions:completion:")
    public native void requestCloseSession(NSDictionary<NSString, ?> options, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "requestEjectWithCompletion:")
    public native void requestEject(@Block VoidBlock1<NSError> completion);
    /*</methods>*/
}
