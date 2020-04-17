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
package org.robovm.apple.callkit;

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
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CallKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CXProvider/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CXProviderPtr extends Ptr<CXProvider, CXProviderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CXProvider.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CXProvider() {}
    protected CXProvider(Handle h, long handle) { super(h, handle); }
    protected CXProvider(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithConfiguration:")
    public CXProvider(CXProviderConfiguration configuration) { super((SkipInit) null); initObject(init(configuration)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "configuration")
    public native CXProviderConfiguration getConfiguration();
    @Property(selector = "setConfiguration:")
    public native void setConfiguration(CXProviderConfiguration v);
    @Property(selector = "pendingTransactions")
    public native NSArray<CXTransaction> getPendingTransactions();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithConfiguration:")
    protected native @Pointer long init(CXProviderConfiguration configuration);
    @Method(selector = "setDelegate:queue:")
    public native void setDelegate(CXProviderDelegate delegate, DispatchQueue queue);
    @Method(selector = "reportNewIncomingCallWithUUID:update:completion:")
    public native void reportNewIncomingCall(NSUUID UUID, CXCallUpdate update, @Block VoidBlock1<NSError> completion);
    @Method(selector = "reportCallWithUUID:updated:")
    public native void reportCall(NSUUID UUID, CXCallUpdate update);
    @Method(selector = "reportCallWithUUID:endedAtDate:reason:")
    public native void reportCall(NSUUID UUID, NSDate dateEnded, CXCallEndedReason endedReason);
    @Method(selector = "reportOutgoingCallWithUUID:startedConnectingAtDate:")
    public native void reportOutgoingStartedCall(NSUUID UUID, NSDate dateStartedConnecting);
    @Method(selector = "reportOutgoingCallWithUUID:connectedAtDate:")
    public native void reportOutgoingConnectedCall(NSUUID UUID, NSDate dateConnected);
    @Method(selector = "invalidate")
    public native void invalidate();
    @Method(selector = "pendingCallActionsOfClass:withCallUUID:")
    public native NSArray<CXCallAction> getPendingCallActionsOfClass(Class<?> callActionClass, NSUUID callUUID);
    /*</methods>*/
}
