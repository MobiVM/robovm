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
package org.robovm.apple.passkit;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.addressbook.*;
import org.robovm.apple.contacts.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("PassKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PKSecureElementPass/*</name>*/ 
    extends /*<extends>*/PKPass/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PKSecureElementPassPtr extends Ptr<PKSecureElementPass, PKSecureElementPassPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PKSecureElementPass.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PKSecureElementPass() {}
    protected PKSecureElementPass(Handle h, long handle) { super(h, handle); }
    protected PKSecureElementPass(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithData:error:")
    public PKSecureElementPass(NSData data) throws NSErrorException { super(data); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "primaryAccountIdentifier")
    public native String getPrimaryAccountIdentifier();
    @Property(selector = "primaryAccountNumberSuffix")
    public native String getPrimaryAccountNumberSuffix();
    @Property(selector = "deviceAccountIdentifier")
    public native String getDeviceAccountIdentifier();
    @Property(selector = "deviceAccountNumberSuffix")
    public native String getDeviceAccountNumberSuffix();
    @Property(selector = "passActivationState")
    public native PKSecureElementPassActivationState getPassActivationState();
    @Property(selector = "devicePassIdentifier")
    public native String getDevicePassIdentifier();
    @Property(selector = "pairedTerminalIdentifier")
    public native String getPairedTerminalIdentifier();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
