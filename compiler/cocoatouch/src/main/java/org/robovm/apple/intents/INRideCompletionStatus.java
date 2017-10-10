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
package org.robovm.apple.intents;

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
import org.robovm.apple.eventkit.*;
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INRideCompletionStatus/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class INRideCompletionStatusPtr extends Ptr<INRideCompletionStatus, INRideCompletionStatusPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INRideCompletionStatus.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INRideCompletionStatus() {}
    protected INRideCompletionStatus(Handle h, long handle) { super(h, handle); }
    protected INRideCompletionStatus(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public INRideCompletionStatus(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "completionUserActivity")
    public native NSUserActivity getCompletionUserActivity();
    @Property(selector = "setCompletionUserActivity:")
    public native void setCompletionUserActivity(NSUserActivity v);
    @Property(selector = "isCompleted")
    public native boolean isCompleted();
    @Property(selector = "isCanceled")
    public native boolean isCanceled();
    @Property(selector = "isMissedPickup")
    public native boolean isMissedPickup();
    @Property(selector = "paymentAmount")
    public native INCurrencyAmount getPaymentAmount();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "feedbackType")
    public native INRideFeedbackTypeOptions getFeedbackType();
    @Property(selector = "isOutstanding")
    public native boolean isOutstanding();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "defaultTippingOptions")
    public native NSSet<INCurrencyAmount> getDefaultTippingOptions();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setDefaultTippingOptions:")
    public native void setDefaultTippingOptions(NSSet<INCurrencyAmount> v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "completed")
    public static native INRideCompletionStatus completed();
    @Method(selector = "completedWithSettledPaymentAmount:")
    public static native INRideCompletionStatus completedWithSettledPaymentAmount(INCurrencyAmount settledPaymentAmount);
    @Method(selector = "completedWithOutstandingPaymentAmount:")
    public static native INRideCompletionStatus completedWithOutstandingPaymentAmount(INCurrencyAmount outstandingPaymentAmount);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "completedWithOutstandingFeedbackType:")
    public static native INRideCompletionStatus completedWithOutstandingFeedbackType(INRideFeedbackTypeOptions feedbackType);
    @Method(selector = "canceledByService")
    public static native INRideCompletionStatus canceledByService();
    @Method(selector = "canceledByUser")
    public static native INRideCompletionStatus canceledByUser();
    @Method(selector = "canceledMissedPickup")
    public static native INRideCompletionStatus canceledMissedPickup();
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
