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
package org.robovm.apple.matter;

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
import org.robovm.apple.security.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 18.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Matter") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRCommissionerControlClusterReverseOpenCommissioningWindowParams/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRCommissionerControlClusterReverseOpenCommissioningWindowParamsPtr extends Ptr<MTRCommissionerControlClusterReverseOpenCommissioningWindowParams, MTRCommissionerControlClusterReverseOpenCommissioningWindowParamsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRCommissionerControlClusterReverseOpenCommissioningWindowParams.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTRCommissionerControlClusterReverseOpenCommissioningWindowParams() {}
    protected MTRCommissionerControlClusterReverseOpenCommissioningWindowParams(Handle h, long handle) { super(h, handle); }
    protected MTRCommissionerControlClusterReverseOpenCommissioningWindowParams(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "initWithResponseValue:error:")
    public MTRCommissionerControlClusterReverseOpenCommissioningWindowParams(NSDictionary<NSString, ?> responseValue) throws NSErrorException {
       super((SkipInit) null);
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       long handle = init(responseValue, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       initObject(handle);
    }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "commissioningTimeout")
    public native NSNumber getCommissioningTimeout();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setCommissioningTimeout:")
    public native void setCommissioningTimeout(NSNumber v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "pakePasscodeVerifier")
    public native NSData getPakePasscodeVerifier();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setPakePasscodeVerifier:")
    public native void setPakePasscodeVerifier(NSData v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "discriminator")
    public native NSNumber getDiscriminator();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setDiscriminator:")
    public native void setDiscriminator(NSNumber v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "iterations")
    public native NSNumber getIterations();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setIterations:")
    public native void setIterations(NSNumber v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "salt")
    public native NSData getSalt();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setSalt:")
    public native void setSalt(NSData v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "initWithResponseValue:error:")
    private native @Pointer long init(NSDictionary<NSString, ?> responseValue, NSError.NSErrorPtr error);
    /*</methods>*/
}
