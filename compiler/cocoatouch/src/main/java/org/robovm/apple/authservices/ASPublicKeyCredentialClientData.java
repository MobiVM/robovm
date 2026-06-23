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
package org.robovm.apple.authservices;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 17.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AuthenticationServices") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ASPublicKeyCredentialClientData/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ASPublicKeyCredentialClientDataPtr extends Ptr<ASPublicKeyCredentialClientData, ASPublicKeyCredentialClientDataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ASPublicKeyCredentialClientData.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ASPublicKeyCredentialClientData() {}
    protected ASPublicKeyCredentialClientData(Handle h, long handle) { super(h, handle); }
    protected ASPublicKeyCredentialClientData(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithChallenge:origin:")
    public ASPublicKeyCredentialClientData(NSData challenge, String origin) { super((SkipInit) null); initObject(init(challenge, origin)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "challenge")
    public native NSData getChallenge();
    @Property(selector = "setChallenge:")
    public native void setChallenge(NSData v);
    @Property(selector = "origin")
    public native String getOrigin();
    @Property(selector = "setOrigin:")
    public native void setOrigin(String v);
    @Property(selector = "topOrigin")
    public native String getTopOrigin();
    @Property(selector = "setTopOrigin:")
    public native void setTopOrigin(String v);
    @Property(selector = "crossOrigin")
    public native ASPublicKeyCredentialClientDataCrossOriginValue getCrossOrigin();
    @Property(selector = "setCrossOrigin:")
    public native void setCrossOrigin(ASPublicKeyCredentialClientDataCrossOriginValue v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithChallenge:origin:")
    protected native @Pointer long init(NSData challenge, String origin);
    /*</methods>*/
}
