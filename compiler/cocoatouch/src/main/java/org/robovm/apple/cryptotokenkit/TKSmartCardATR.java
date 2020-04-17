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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TKSmartCardATR/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class TKSmartCardATRPtr extends Ptr<TKSmartCardATR, TKSmartCardATRPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TKSmartCardATR.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public TKSmartCardATR() {}
    protected TKSmartCardATR(Handle h, long handle) { super(h, handle); }
    protected TKSmartCardATR(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithBytes:")
    public TKSmartCardATR(NSData bytes) { super((SkipInit) null); initObject(init(bytes)); }
    @Method(selector = "initWithSource:")
    public TKSmartCardATR(@Block IntBlock source) { super((SkipInit) null); initObject(init(source)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "bytes")
    public native NSData getBytes();
    @Property(selector = "protocols")
    public native NSArray<NSNumber> getProtocols();
    @Property(selector = "historicalBytes")
    public native NSData getHistoricalBytes();
    @Property(selector = "historicalRecords")
    public native NSArray<TKCompactTLVRecord> getHistoricalRecords();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithBytes:")
    protected native @Pointer long init(NSData bytes);
    @Method(selector = "initWithSource:")
    protected native @Pointer long init(@Block IntBlock source);
    @Method(selector = "interfaceGroupAtIndex:")
    public native TKSmartCardATRInterfaceGroup interfaceGroupAtIndex(@MachineSizedSInt long index);
    @Method(selector = "interfaceGroupForProtocol:")
    public native TKSmartCardATRInterfaceGroup interfaceGroupForProtocol(TKSmartCardProtocol protocol);
    /*</methods>*/
}
