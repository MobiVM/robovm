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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ICDeviceBrowser/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ICDeviceBrowserPtr extends Ptr<ICDeviceBrowser, ICDeviceBrowserPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ICDeviceBrowser.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ICDeviceBrowser() {}
    protected ICDeviceBrowser(Handle h, long handle) { super(h, handle); }
    protected ICDeviceBrowser(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native ICDeviceBrowserDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(ICDeviceBrowserDelegate v);
    @Property(selector = "isBrowsing")
    public native boolean isBrowsing();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "isSuspended")
    public native boolean isSuspended();
    /**
     * @since Available in iOS 15.2 and later.
     */
    @Property(selector = "browsedDeviceTypeMask")
    public native ICDeviceTypeMask getBrowsedDeviceTypeMask();
    /**
     * @since Available in iOS 15.2 and later.
     */
    @Property(selector = "setBrowsedDeviceTypeMask:")
    public native void setBrowsedDeviceTypeMask(ICDeviceTypeMask v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "devices")
    public native NSArray<ICDevice> getDevices();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "start")
    public native void start();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "stop")
    public native void stop();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "contentsAuthorizationStatus")
    public native ICAuthorizationStatus contentsAuthorizationStatus();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "requestContentsAuthorizationWithCompletion:")
    public native void requestContentsAuthorization(@Block VoidBlock1<ICAuthorizationStatus> completion);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "controlAuthorizationStatus")
    public native ICAuthorizationStatus controlAuthorizationStatus();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "requestControlAuthorizationWithCompletion:")
    public native void requestControlAuthorization(@Block VoidBlock1<ICAuthorizationStatus> completion);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "resetContentsAuthorizationWithCompletion:")
    public native void resetContentsAuthorization(@Block VoidBlock1<ICAuthorizationStatus> completion);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "resetControlAuthorizationWithCompletion:")
    public native void resetControlAuthorization(@Block VoidBlock1<ICAuthorizationStatus> completion);
    /*</methods>*/
}
