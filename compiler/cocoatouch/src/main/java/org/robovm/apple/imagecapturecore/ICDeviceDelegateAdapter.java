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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ICDeviceDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements ICDeviceDelegate/*</implements>*/ {

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
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("device:didCloseSessionWithError:")
    public void didCloseSession(ICDevice device, NSError error) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("didRemoveDevice:")
    public void didRemoveDevice(ICDevice device) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("device:didOpenSessionWithError:")
    public void didOpenSession(ICDevice device, NSError error) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("deviceDidBecomeReady:")
    public void deviceDidBecomeReady(ICDevice device) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("device:didReceiveStatusInformation:")
    public void didReceiveStatusInformation(ICDevice device, NSDictionary<NSString, ?> status) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("device:didEncounterError:")
    public void didEncounterError(ICDevice device, NSError error) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("device:didEjectWithError:")
    public void didEject(ICDevice device, NSError error) {}
    /*</methods>*/
}
