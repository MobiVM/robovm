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
package org.robovm.apple.cryptotokenkit;

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
import org.robovm.apple.security.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("CryptoTokenKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TKSmartCard/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class TKSmartCardPtr extends Ptr<TKSmartCard, TKSmartCardPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TKSmartCard.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public TKSmartCard() {}
    protected TKSmartCard(Handle h, long handle) { super(h, handle); }
    protected TKSmartCard(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "slot")
    public native TKSmartCardSlot getSlot();
    @Property(selector = "valid")
    public native boolean isValid();
    @Property(selector = "allowedProtocols")
    public native TKSmartCardProtocol getAllowedProtocols();
    @Property(selector = "setAllowedProtocols:")
    public native void setAllowedProtocols(TKSmartCardProtocol v);
    @Property(selector = "currentProtocol")
    public native TKSmartCardProtocol getCurrentProtocol();
    @Property(selector = "sensitive")
    public native boolean isSensitive();
    @Property(selector = "setSensitive:")
    public native void setSensitive(boolean v);
    @Property(selector = "context")
    public native NSObject getContext();
    @Property(selector = "setContext:")
    public native void setContext(NSObject v);
    @Property(selector = "cla")
    public native byte getCla();
    @Property(selector = "setCla:")
    public native void setCla(byte v);
    @Property(selector = "useExtendedLength")
    public native boolean isUseExtendedLength();
    @Property(selector = "setUseExtendedLength:")
    public native void setUseExtendedLength(boolean v);
    @Property(selector = "useCommandChaining")
    public native boolean isUseCommandChaining();
    @Property(selector = "setUseCommandChaining:")
    public native void setUseCommandChaining(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "beginSessionWithReply:")
    public native void beginSession(@Block VoidBlock2<Boolean, NSError> reply);
    @Method(selector = "transmitRequest:reply:")
    public native void transmitRequest(NSData request, @Block VoidBlock2<NSData, NSError> reply);
    @Method(selector = "endSession")
    public native void endSession();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "userInteractionForSecurePINVerificationWithPINFormat:APDU:PINByteOffset:")
    public native TKSmartCardUserInteractionForSecurePINVerification userInteractionForSecurePINVerification(TKSmartCardPINFormat PINFormat, NSData APDU, @MachineSizedSInt long PINByteOffset);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "userInteractionForSecurePINChangeWithPINFormat:APDU:currentPINByteOffset:newPINByteOffset:")
    public native TKSmartCardUserInteractionForSecurePINChange userInteractionForSecurePINChange(TKSmartCardPINFormat PINFormat, NSData APDU, @MachineSizedSInt long currentPINByteOffset, @MachineSizedSInt long newPINByteOffset);
    @Method(selector = "sendIns:p1:p2:data:le:reply:")
    public native void send(byte ins, byte p1, byte p2, NSData requestData, NSNumber le, @Block VoidBlock3<NSData, Short, NSError> reply);
    @Method(selector = "inSessionWithError:executeBlock:")
    public native boolean executeBlock(NSError.NSErrorPtr error, @Block Block1<NSError.NSErrorPtr, Boolean> block);
    @Method(selector = "sendIns:p1:p2:data:le:sw:error:")
    public native NSData send(byte ins, byte p1, byte p2, NSData requestData, NSNumber le, ShortPtr sw, NSError.NSErrorPtr error);
    /*</methods>*/
}
