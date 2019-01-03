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
package org.robovm.apple.carplay;

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
import org.robovm.apple.mapkit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CarPlay") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPRouteChoice/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CPRouteChoicePtr extends Ptr<CPRouteChoice, CPRouteChoicePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CPRouteChoice.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CPRouteChoice() {}
    protected CPRouteChoice(Handle h, long handle) { super(h, handle); }
    protected CPRouteChoice(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSummaryVariants:additionalInformationVariants:selectionSummaryVariants:")
    public CPRouteChoice(NSArray<NSString> summaryVariants, NSArray<NSString> additionalInformationVariants, NSArray<NSString> selectionSummaryVariants) { super((SkipInit) null); initObject(init(summaryVariants, additionalInformationVariants, selectionSummaryVariants)); }
    @Method(selector = "initWithCoder:")
    public CPRouteChoice(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "summaryVariants")
    public native NSArray<NSString> getSummaryVariants();
    @Property(selector = "selectionSummaryVariants")
    public native NSArray<NSString> getSelectionSummaryVariants();
    @Property(selector = "additionalInformationVariants")
    public native NSArray<NSString> getAdditionalInformationVariants();
    @Property(selector = "userInfo")
    public native NSObject getUserInfo();
    @Property(selector = "setUserInfo:")
    public native void setUserInfo(NSObject v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSummaryVariants:additionalInformationVariants:selectionSummaryVariants:")
    protected native @Pointer long init(NSArray<NSString> summaryVariants, NSArray<NSString> additionalInformationVariants, NSArray<NSString> selectionSummaryVariants);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
