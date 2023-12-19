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
package org.robovm.apple.matter;

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
import org.robovm.apple.security.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("Matter") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRDeviceController/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRDeviceControllerPtr extends Ptr<MTRDeviceController, MTRDeviceControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRDeviceController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRDeviceController() {}
    protected MTRDeviceController(Handle h, long handle) { super(h, handle); }
    protected MTRDeviceController(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isRunning")
    public native boolean isRunning();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "controllerNodeID")
    public native NSNumber getControllerNodeID();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 16.2 and later.
     */
    public boolean setupCommissioningSession(MTRSetupPayload payload, NSNumber newNodeID) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = setupCommissioningSession(payload, newNodeID, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 16.2 and later.
     */
    @Method(selector = "setupCommissioningSessionWithPayload:newNodeID:error:")
    private native boolean setupCommissioningSession(MTRSetupPayload payload, NSNumber newNodeID, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 17.0 and later.
     */
    public boolean setupCommissioningSession(MTRCommissionableBrowserResult discoveredDevice, MTRSetupPayload payload, NSNumber newNodeID) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = setupCommissioningSession(discoveredDevice, payload, newNodeID, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "setupCommissioningSessionWithDiscoveredDevice:payload:newNodeID:error:")
    private native boolean setupCommissioningSession(MTRCommissionableBrowserResult discoveredDevice, MTRSetupPayload payload, NSNumber newNodeID, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 16.4 and later.
     */
    public boolean commissionNode(NSNumber nodeID, MTRCommissioningParameters commissioningParams) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = commissionNode(nodeID, commissioningParams, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "commissionNodeWithID:commissioningParams:error:")
    private native boolean commissionNode(NSNumber nodeID, MTRCommissioningParameters commissioningParams, NSError.NSErrorPtr error);
    public boolean continueCommissioning(VoidPtr opaqueDeviceHandle, boolean ignoreAttestationFailure) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = continueCommissioning(opaqueDeviceHandle, ignoreAttestationFailure, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "continueCommissioningDevice:ignoreAttestationFailure:error:")
    private native boolean continueCommissioning(VoidPtr opaqueDeviceHandle, boolean ignoreAttestationFailure, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 16.4 and later.
     */
    public boolean cancelCommissioning(NSNumber nodeID) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = cancelCommissioning(nodeID, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "cancelCommissioningForNodeID:error:")
    private native boolean cancelCommissioning(NSNumber nodeID, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 16.4 and later.
     */
    public MTRBaseDevice deviceBeingCommissioned(NSNumber nodeID) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       MTRBaseDevice result = deviceBeingCommissioned(nodeID, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "deviceBeingCommissionedWithNodeID:error:")
    private native MTRBaseDevice deviceBeingCommissioned(NSNumber nodeID, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "preWarmCommissioningSession")
    public native void preWarmCommissioningSession();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "setDeviceControllerDelegate:queue:")
    public native void setDeviceControllerDelegate(MTRDeviceControllerDelegate delegate, DispatchQueue queue);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "startBrowseForCommissionables:queue:")
    public native boolean startBrowse(MTRCommissionableBrowserDelegate delegate, DispatchQueue queue);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "stopBrowseForCommissionables")
    public native boolean stopBrowseForCommissionables();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "attestationChallengeForDeviceID:")
    public native NSData attestationChallengeForDeviceID(NSNumber deviceID);
    @Method(selector = "shutdown")
    public native void shutdown();
    /**
     * @since Available in iOS 16.4 and later.
     */
    public static NSData computePASEVerifier(NSNumber setupPasscode, NSNumber iterations, NSData salt) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSData result = computePASEVerifier(setupPasscode, iterations, salt, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "computePASEVerifierForSetupPasscode:iterations:salt:error:")
    private static native NSData computePASEVerifier(NSNumber setupPasscode, NSNumber iterations, NSData salt, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "sharedControllerWithID:xpcConnectBlock:")
    public static native MTRDeviceController getSharedController(NSObject controllerID, @Block Block0<NSXPCConnection> xpcConnectBlock);
    @Method(selector = "encodeXPCResponseValues:")
    public static native NSArray<?> encodeXPCResponseValues(NSArray<?> values);
    @Method(selector = "decodeXPCResponseValues:")
    public static native NSArray<?> decodeXPCResponseValues(NSArray<?> values);
    @Method(selector = "encodeXPCReadParams:")
    public static native NSDictionary<NSString, ?> encodeXPCReadParams(MTRReadParams params);
    @Method(selector = "decodeXPCReadParams:")
    public static native MTRReadParams decodeXPCReadParams(NSDictionary<NSString, ?> params);
    @Method(selector = "encodeXPCSubscribeParams:")
    public static native NSDictionary<NSString, ?> encodeXPCSubscribeParams(MTRSubscribeParams params);
    @Method(selector = "decodeXPCSubscribeParams:")
    public static native MTRSubscribeParams decodeXPCSubscribeParams(NSDictionary<NSString, ?> params);
    /**
     * @since Available in iOS 16.5 and later.
     */
    @Method(selector = "xpcInterfaceForServerProtocol")
    public static native NSXPCInterface xpcInterfaceForServerProtocol();
    /**
     * @since Available in iOS 16.5 and later.
     */
    @Method(selector = "xpcInterfaceForClientProtocol")
    public static native NSXPCInterface xpcInterfaceForClientProtocol();
    /*</methods>*/
}
