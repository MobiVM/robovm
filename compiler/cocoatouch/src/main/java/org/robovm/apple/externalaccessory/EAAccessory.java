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
package org.robovm.apple.externalaccessory;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("ExternalAccessory") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EAAccessory/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EAAccessoryPtr extends Ptr<EAAccessory, EAAccessoryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(EAAccessory.class); }/*</bind>*/
    /*<constants>*/
    public static final int ConnectionIDNone = 0;
    /*</constants>*/
    /*<constructors>*/
    public EAAccessory() {}
    protected EAAccessory(Handle h, long handle) { super(h, handle); }
    protected EAAccessory(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isConnected")
    public native boolean isConnected();
    @Property(selector = "connectionID")
    public native @MachineSizedUInt long getConnectionID();
    @Property(selector = "manufacturer")
    public native String getManufacturer();
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "modelNumber")
    public native String getModelNumber();
    @Property(selector = "serialNumber")
    public native String getSerialNumber();
    @Property(selector = "firmwareRevision")
    public native String getFirmwareRevision();
    @Property(selector = "hardwareRevision")
    public native String getHardwareRevision();
    /**
     * @since Available in iOS 9.3 and later.
     * @deprecated Deprecated in iOS 13.0. Not supported
     */
    @Deprecated
    @Property(selector = "dockType")
    public native String getDockType();
    @Property(selector = "protocolStrings")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getProtocolStrings();
    @Property(selector = "delegate")
    public native EAAccessoryDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(EAAccessoryDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
