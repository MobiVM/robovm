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
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CloudKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CKAllowedSharingOptions/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CKAllowedSharingOptionsPtr extends Ptr<CKAllowedSharingOptions, CKAllowedSharingOptionsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CKAllowedSharingOptions.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CKAllowedSharingOptions() {}
    protected CKAllowedSharingOptions(Handle h, long handle) { super(h, handle); }
    protected CKAllowedSharingOptions(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAllowedParticipantPermissionOptions:allowedParticipantAccessOptions:")
    public CKAllowedSharingOptions(CKSharingParticipantPermissionOption allowedParticipantPermissionOptions, CKSharingParticipantAccessOption allowedParticipantAccessOptions) { super((SkipInit) null); initObject(init(allowedParticipantPermissionOptions, allowedParticipantAccessOptions)); }
    @Method(selector = "initWithCoder:")
    public CKAllowedSharingOptions(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "allowedParticipantPermissionOptions")
    public native CKSharingParticipantPermissionOption getAllowedParticipantPermissionOptions();
    @Property(selector = "setAllowedParticipantPermissionOptions:")
    public native void setAllowedParticipantPermissionOptions(CKSharingParticipantPermissionOption v);
    @Property(selector = "allowedParticipantAccessOptions")
    public native CKSharingParticipantAccessOption getAllowedParticipantAccessOptions();
    @Property(selector = "setAllowedParticipantAccessOptions:")
    public native void setAllowedParticipantAccessOptions(CKSharingParticipantAccessOption v);
    @Property(selector = "standardOptions")
    public static native CKAllowedSharingOptions getStandardOptions();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAllowedParticipantPermissionOptions:allowedParticipantAccessOptions:")
    protected native @Pointer long init(CKSharingParticipantPermissionOption allowedParticipantPermissionOptions, CKSharingParticipantAccessOption allowedParticipantAccessOptions);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
