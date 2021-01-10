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
package org.robovm.apple.exposurenotification;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 12.5 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ExposureNotification") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ENManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ENManagerPtr extends Ptr<ENManager, ENManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ENManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ENManager() {}
    protected ENManager(Handle h, long handle) { super(h, handle); }
    protected ENManager(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "dispatchQueue")
    public native DispatchQueue getDispatchQueue();
    @Property(selector = "setDispatchQueue:")
    public native void setDispatchQueue(DispatchQueue v);
    @Property(selector = "exposureNotificationStatus")
    public native ENStatus getExposureNotificationStatus();
    @Property(selector = "invalidationHandler")
    public native @Block Runnable getInvalidationHandler();
    @Property(selector = "setInvalidationHandler:")
    public native void setInvalidationHandler(@Block Runnable v);
    @Property(selector = "authorizationStatus")
    public static native ENAuthorizationStatus getAuthorizationStatus();
    @Property(selector = "exposureNotificationEnabled")
    public native boolean isExposureNotificationEnabled();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "activateWithCompletionHandler:")
    public native void activate(@Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "invalidate")
    public native void invalidate();
    /**
     * @since Available in iOS 12.5 and later.
     */
    @Method(selector = "getUserTraveledWithCompletionHandler:")
    public native void getUserTraveled(@Block VoidBlock2<Boolean, NSError> completionHandler);
    @Method(selector = "setExposureNotificationEnabled:completionHandler:")
    public native void setExposureNotificationEnabled(boolean enabled, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 12.5 and later.
     */
    @Method(selector = "detectExposuresWithConfiguration:completionHandler:")
    public native NSProgress detectExposures(ENExposureConfiguration configuration, @Block VoidBlock2<ENExposureDetectionSummary, NSError> completionHandler);
    @Method(selector = "detectExposuresWithConfiguration:diagnosisKeyURLs:completionHandler:")
    public native NSProgress detectExposures(ENExposureConfiguration configuration, NSArray<NSURL> diagnosisKeyURLs, @Block VoidBlock2<ENExposureDetectionSummary, NSError> completionHandler);
    /**
     * @since Available in iOS 13.5 and later.
     * @deprecated Deprecated in iOS 13.6. Use getExposureWindowsFromSummary, if needed.
     */
    @Deprecated
    @Method(selector = "getExposureInfoFromSummary:userExplanation:completionHandler:")
    public native NSProgress getExposureInfo(ENExposureDetectionSummary summary, String userExplanation, @Block VoidBlock2<NSArray<ENExposureInfo>, NSError> completionHandler);
    /**
     * @since Available in iOS 12.5 and later.
     */
    @Method(selector = "getExposureWindowsFromSummary:completionHandler:")
    public native NSProgress getExposureWindows(ENExposureDetectionSummary summary, @Block VoidBlock2<NSArray<ENExposureWindow>, NSError> completionHandler);
    @Method(selector = "getDiagnosisKeysWithCompletionHandler:")
    public native void getDiagnosisKeys(@Block VoidBlock2<NSArray<ENTemporaryExposureKey>, NSError> completionHandler);
    @Method(selector = "getTestDiagnosisKeysWithCompletionHandler:")
    public native void getTestDiagnosisKeys(@Block VoidBlock2<NSArray<ENTemporaryExposureKey>, NSError> completionHandler);
    /*</methods>*/
}
