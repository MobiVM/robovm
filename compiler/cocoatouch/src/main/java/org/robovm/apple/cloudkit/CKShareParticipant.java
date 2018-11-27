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
package org.robovm.apple.cloudkit;

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
import org.robovm.apple.corelocation.*;
import org.robovm.apple.contacts.*;
import org.robovm.apple.fileprovider.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CloudKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CKShareParticipant/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CKShareParticipantPtr extends Ptr<CKShareParticipant, CKShareParticipantPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CKShareParticipant.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CKShareParticipant() {}
    protected CKShareParticipant(Handle h, long handle) { super(h, handle); }
    protected CKShareParticipant(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public CKShareParticipant(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "userIdentity")
    public native CKUserIdentity getUserIdentity();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "role")
    public native CKShareParticipantRole getRole();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "setRole:")
    public native void setRole(CKShareParticipantRole v);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 12.0.
     */
    @Deprecated
    @Property(selector = "type")
    public native CKShareParticipantType getType();
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 12.0.
     */
    @Deprecated
    @Property(selector = "setType:")
    public native void setType(CKShareParticipantType v);
    @Property(selector = "acceptanceStatus")
    public native CKShareParticipantAcceptanceStatus getAcceptanceStatus();
    @Property(selector = "permission")
    public native CKShareParticipantPermission getPermission();
    @Property(selector = "setPermission:")
    public native void setPermission(CKShareParticipantPermission v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
