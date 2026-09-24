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
package org.robovm.apple.securityui;

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
import org.robovm.apple.security.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 18.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("SecurityUI") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SFCertificatePresentation/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SFCertificatePresentationPtr extends Ptr<SFCertificatePresentation, SFCertificatePresentationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SFCertificatePresentation.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected SFCertificatePresentation() {}
    protected SFCertificatePresentation(Handle h, long handle) { super(h, handle); }
    protected SFCertificatePresentation(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTrust:")
    public SFCertificatePresentation(SecTrust trust) { super((SkipInit) null); initObject(init(trust)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "trust")
    public native SecTrust getTrust();
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    @Property(selector = "message")
    public native String getMessage();
    @Property(selector = "setMessage:")
    public native void setMessage(String v);
    @Property(selector = "helpURL")
    public native NSURL getHelpURL();
    @Property(selector = "setHelpURL:")
    public native void setHelpURL(NSURL v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTrust:")
    protected native @Pointer long init(SecTrust trust);
    @Method(selector = "presentSheetInViewController:dismissHandler:")
    public native void presentSheet(UIViewController viewController, @Block Runnable dismissHandler);
    @Method(selector = "dismissSheet")
    public native void dismissSheet();
    /*</methods>*/
}
