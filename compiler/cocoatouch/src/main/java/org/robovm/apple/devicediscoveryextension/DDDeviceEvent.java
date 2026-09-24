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
package org.robovm.apple.devicediscoveryextension;

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
import org.robovm.apple.uniformtypeid.*;
import org.robovm.apple.network.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("DeviceDiscoveryExtension") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/DDDeviceEvent/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class DDDeviceEventPtr extends Ptr<DDDeviceEvent, DDDeviceEventPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(DDDeviceEvent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public DDDeviceEvent() {}
    protected DDDeviceEvent(Handle h, long handle) { super(h, handle); }
    protected DDDeviceEvent(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithEventType:device:")
    public DDDeviceEvent(DDEventType type, DDDevice device) { super((SkipInit) null); initObject(init(type, device)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "device")
    public native DDDevice getDevice();
    @Property(selector = "eventType")
    public native DDEventType getEventType();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithEventType:device:")
    protected native @Pointer long init(DDEventType type, DDDevice device);
    /*</methods>*/
}
