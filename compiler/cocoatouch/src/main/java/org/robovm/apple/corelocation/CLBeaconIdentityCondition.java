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
package org.robovm.apple.corelocation;

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
import org.robovm.apple.addressbook.*;
import org.robovm.apple.corebluetooth.*;
import org.robovm.apple.contacts.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreLocation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CLBeaconIdentityCondition/*</name>*/ 
    extends /*<extends>*/CLCondition/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CLBeaconIdentityConditionPtr extends Ptr<CLBeaconIdentityCondition, CLBeaconIdentityConditionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CLBeaconIdentityCondition.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CLBeaconIdentityCondition() {}
    protected CLBeaconIdentityCondition(Handle h, long handle) { super(h, handle); }
    protected CLBeaconIdentityCondition(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithUUID:")
    public CLBeaconIdentityCondition(NSUUID uuid) { super((SkipInit) null); initObject(init(uuid)); }
    @Method(selector = "initWithUUID:major:")
    public CLBeaconIdentityCondition(NSUUID uuid, short major) { super((SkipInit) null); initObject(init(uuid, major)); }
    @Method(selector = "initWithUUID:major:minor:")
    public CLBeaconIdentityCondition(NSUUID uuid, short major, short minor) { super((SkipInit) null); initObject(init(uuid, major, minor)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "UUID")
    public native NSUUID getUUID();
    @Property(selector = "major")
    public native NSNumber getMajor();
    @Property(selector = "minor")
    public native NSNumber getMinor();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithUUID:")
    protected native @Pointer long init(NSUUID uuid);
    @Method(selector = "initWithUUID:major:")
    protected native @Pointer long init(NSUUID uuid, short major);
    @Method(selector = "initWithUUID:major:minor:")
    protected native @Pointer long init(NSUUID uuid, short major, short minor);
    /*</methods>*/
}
