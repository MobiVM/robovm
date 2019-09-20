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
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CryptoTokenKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TKTokenSmartCardPINAuthOperation/*</name>*/ 
    extends /*<extends>*/TKTokenAuthOperation/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class TKTokenSmartCardPINAuthOperationPtr extends Ptr<TKTokenSmartCardPINAuthOperation, TKTokenSmartCardPINAuthOperationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TKTokenSmartCardPINAuthOperation.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public TKTokenSmartCardPINAuthOperation() {}
    protected TKTokenSmartCardPINAuthOperation(Handle h, long handle) { super(h, handle); }
    protected TKTokenSmartCardPINAuthOperation(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "PINFormat")
    public native TKSmartCardPINFormat getPINFormat();
    @Property(selector = "setPINFormat:")
    public native void setPINFormat(TKSmartCardPINFormat v);
    @Property(selector = "APDUTemplate")
    public native NSData getAPDUTemplate();
    @Property(selector = "setAPDUTemplate:")
    public native void setAPDUTemplate(NSData v);
    @Property(selector = "PINByteOffset")
    public native @MachineSizedSInt long getPINByteOffset();
    @Property(selector = "setPINByteOffset:")
    public native void setPINByteOffset(@MachineSizedSInt long v);
    @Property(selector = "smartCard")
    public native TKSmartCard getSmartCard();
    @Property(selector = "setSmartCard:")
    public native void setSmartCard(TKSmartCard v);
    @Property(selector = "PIN")
    public native String getPIN();
    @Property(selector = "setPIN:")
    public native void setPIN(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
