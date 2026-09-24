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
/**
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreLocation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CLMonitorConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CLMonitorConfigurationPtr extends Ptr<CLMonitorConfiguration, CLMonitorConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CLMonitorConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CLMonitorConfiguration() {}
    protected CLMonitorConfiguration(Handle h, long handle) { super(h, handle); }
    protected CLMonitorConfiguration(SkipInit skipInit) { super(skipInit); }
    public CLMonitorConfiguration(String name, org.robovm.apple.dispatch.DispatchQueue queue, @Block VoidBlock2<CLMonitor, CLMonitoringEvent> eventHandler) { super((Handle) null, create(name, queue, eventHandler)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "queue")
    public native org.robovm.apple.dispatch.DispatchQueue getQueue();
    @Property(selector = "eventHandler")
    public native @Block VoidBlock2<CLMonitor, CLMonitoringEvent> getEventHandler();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "configWithMonitorName:queue:eventHandler:")
    protected static native @Pointer long create(String name, org.robovm.apple.dispatch.DispatchQueue queue, @Block VoidBlock2<CLMonitor, CLMonitoringEvent> eventHandler);
    /*</methods>*/
}
