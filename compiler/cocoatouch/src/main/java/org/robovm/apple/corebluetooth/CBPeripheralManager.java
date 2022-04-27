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
package org.robovm.apple.corebluetooth;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("CoreBluetooth") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CBPeripheralManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CBPeripheralManagerPtr extends Ptr<CBPeripheralManager, CBPeripheralManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CBPeripheralManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CBPeripheralManager() {}
    protected CBPeripheralManager(Handle h, long handle) { super(h, handle); }
    protected CBPeripheralManager(SkipInit skipInit) { super(skipInit); }
    @WeaklyLinked
    @Method(selector = "initWithDelegate:queue:")
    public CBPeripheralManager(CBPeripheralManagerDelegate delegate, DispatchQueue queue) { super((SkipInit) null); initObject(init(delegate, queue)); }
    @WeaklyLinked
    @Method(selector = "initWithDelegate:queue:options:")
    public CBPeripheralManager(CBPeripheralManagerDelegate delegate, DispatchQueue queue, CBPeripheralManagerOptions options) { super((SkipInit) null); initObject(init(delegate, queue, options)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native CBPeripheralManagerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(CBPeripheralManagerDelegate v);
    @Property(selector = "isAdvertising")
    public native boolean isAdvertising();
    /**
     * @since Available in iOS 13.1 and later.
     */
    @Property(selector = "authorization")
    public static native CBManagerAuthorization authorization();
    /*</properties>*/
    /*<members>*//*</members>*/
    @Property(selector = "state")
    public native CBManagerState getState(); //TODO CBManager state method, but can't inherit for compatibility so manually declare.
    /*<methods>*/
    @WeaklyLinked
    @Method(selector = "initWithDelegate:queue:")
    protected native @Pointer long init(CBPeripheralManagerDelegate delegate, DispatchQueue queue);
    @WeaklyLinked
    @Method(selector = "initWithDelegate:queue:options:")
    protected native @Pointer long init(CBPeripheralManagerDelegate delegate, DispatchQueue queue, CBPeripheralManagerOptions options);
    @Method(selector = "startAdvertising:")
    public native void startAdvertising(CBAdvertisementData advertisementData);
    @Method(selector = "stopAdvertising")
    public native void stopAdvertising();
    @Method(selector = "setDesiredConnectionLatency:forCentral:")
    public native void setDesiredConnectionLatency(CBPeripheralManagerConnectionLatency latency, CBCentral central);
    @Method(selector = "addService:")
    public native void addService(CBMutableService service);
    @Method(selector = "removeService:")
    public native void removeService(CBMutableService service);
    @Method(selector = "removeAllServices")
    public native void removeAllServices();
    @Method(selector = "respondToRequest:withResult:")
    public native void respondToRequest(CBATTRequest request, CBATTErrorCode result);
    @Method(selector = "updateValue:forCharacteristic:onSubscribedCentrals:")
    public native boolean updateValue(NSData value, CBMutableCharacteristic characteristic, NSArray<CBCentral> centrals);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "publishL2CAPChannelWithEncryption:")
    public native void publishL2CAPChannel(boolean encryptionRequired);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "unpublishL2CAPChannel:")
    public native void unpublishL2CAPChannel(short PSM);
    /**
     * @deprecated Deprecated in iOS 13.0. Use CBManagerAuthorization instead
     */
    @Deprecated
    @Method(selector = "authorizationStatus")
    public static native CBPeripheralManagerAuthorizationStatus authorizationStatus();
    /*</methods>*/
}
