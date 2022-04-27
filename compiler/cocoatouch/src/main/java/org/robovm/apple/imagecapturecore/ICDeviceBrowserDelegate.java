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

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/ICDeviceBrowserDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "deviceBrowser:didAddDevice:moreComing:")
    void didAddDevice(ICDeviceBrowser browser, ICDevice device, boolean moreComing);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "deviceBrowser:didRemoveDevice:moreGoing:")
    void didRemoveDevice(ICDeviceBrowser browser, ICDevice device, boolean moreGoing);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "deviceBrowser:deviceDidChangeName:")
    void deviceDidChangeName(ICDeviceBrowser browser, ICDevice device);
    @Method(selector = "deviceBrowser:deviceDidChangeSharingState:")
    void deviceDidChangeSharingState(ICDeviceBrowser browser, ICDevice device);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "deviceBrowserWillSuspendOperations:")
    void deviceBrowserWillSuspendOperations(ICDeviceBrowser browser);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "deviceBrowserDidSuspendOperations:")
    void deviceBrowserDidSuspendOperations(ICDeviceBrowser browser);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "deviceBrowserDidCancelSuspendOperations:")
    void deviceBrowserDidCancelSuspendOperations(ICDeviceBrowser browser);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "deviceBrowserDidResumeOperations:")
    void deviceBrowserDidResumeOperations(ICDeviceBrowser browser);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
