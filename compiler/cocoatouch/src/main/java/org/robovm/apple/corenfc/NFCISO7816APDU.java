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
package org.robovm.apple.corenfc;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreNFC") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NFCISO7816APDU/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NFCISO7816APDUPtr extends Ptr<NFCISO7816APDU, NFCISO7816APDUPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NFCISO7816APDU.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NFCISO7816APDU() {}
    protected NFCISO7816APDU(Handle h, long handle) { super(h, handle); }
    protected NFCISO7816APDU(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithInstructionClass:instructionCode:p1Parameter:p2Parameter:data:expectedResponseLength:")
    public NFCISO7816APDU(byte instructionClass, byte instructionCode, byte p1Parameter, byte p2Parameter, NSData data, @MachineSizedSInt long expectedResponseLength) { super((SkipInit) null); initObject(init(instructionClass, instructionCode, p1Parameter, p2Parameter, data, expectedResponseLength)); }
    @Method(selector = "initWithData:")
    public NFCISO7816APDU(NSData data) { super((SkipInit) null); initObject(init(data)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "instructionClass")
    public native byte getInstructionClass();
    @Property(selector = "instructionCode")
    public native byte getInstructionCode();
    @Property(selector = "p1Parameter")
    public native byte getP1Parameter();
    @Property(selector = "p2Parameter")
    public native byte getP2Parameter();
    @Property(selector = "data")
    public native NSData getData();
    @Property(selector = "expectedResponseLength")
    public native @MachineSizedSInt long getExpectedResponseLength();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithInstructionClass:instructionCode:p1Parameter:p2Parameter:data:expectedResponseLength:")
    protected native @Pointer long init(byte instructionClass, byte instructionCode, byte p1Parameter, byte p2Parameter, NSData data, @MachineSizedSInt long expectedResponseLength);
    @Method(selector = "initWithData:")
    protected native @Pointer long init(NSData data);
    /*</methods>*/
}
