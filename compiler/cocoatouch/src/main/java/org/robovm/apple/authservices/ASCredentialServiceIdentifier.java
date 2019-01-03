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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AuthenticationServices") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ASCredentialServiceIdentifier/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class ASCredentialServiceIdentifierPtr extends Ptr<ASCredentialServiceIdentifier, ASCredentialServiceIdentifierPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ASCredentialServiceIdentifier.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ASCredentialServiceIdentifier() {}
    protected ASCredentialServiceIdentifier(Handle h, long handle) { super(h, handle); }
    protected ASCredentialServiceIdentifier(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithIdentifier:type:")
    public ASCredentialServiceIdentifier(String identifier, ASCredentialServiceIdentifierType type) { super((SkipInit) null); initObject(init(identifier, type)); }
    @Method(selector = "initWithCoder:")
    public ASCredentialServiceIdentifier(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "identifier")
    public native String getIdentifier();
    @Property(selector = "type")
    public native ASCredentialServiceIdentifierType getType();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithIdentifier:type:")
    protected native @Pointer long init(String identifier, ASCredentialServiceIdentifierType type);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
