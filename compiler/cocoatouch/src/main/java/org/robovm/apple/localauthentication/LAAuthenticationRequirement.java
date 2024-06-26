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
package org.robovm.apple.localauthentication;

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
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("LocalAuthentication") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/LAAuthenticationRequirement/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class LAAuthenticationRequirementPtr extends Ptr<LAAuthenticationRequirement, LAAuthenticationRequirementPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(LAAuthenticationRequirement.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public LAAuthenticationRequirement() {}
    protected LAAuthenticationRequirement(Handle h, long handle) { super(h, handle); }
    protected LAAuthenticationRequirement(SkipInit skipInit) { super(skipInit); }
    public LAAuthenticationRequirement(LABiometryFallbackRequirement fallback) { super((Handle) null, create(fallback)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "defaultRequirement")
    public static native LAAuthenticationRequirement getDefaultRequirement();
    @Property(selector = "biometryRequirement")
    public static native LAAuthenticationRequirement getBiometryRequirement();
    @Property(selector = "biometryCurrentSetRequirement")
    public static native LAAuthenticationRequirement getBiometryCurrentSetRequirement();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "biometryRequirementWithFallback:")
    protected static native @Pointer long create(LABiometryFallbackRequirement fallback);
    /*</methods>*/
}
