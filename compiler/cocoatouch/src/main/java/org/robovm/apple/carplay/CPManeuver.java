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
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CarPlay") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPManeuver/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CPManeuverPtr extends Ptr<CPManeuver, CPManeuverPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CPManeuver.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CPManeuver() {}
    protected CPManeuver(Handle h, long handle) { super(h, handle); }
    protected CPManeuver(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public CPManeuver(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 12.0 and later.
     * @deprecated Deprecated in iOS 13.0. Use symbolImage
     */
    @Deprecated
    @Property(selector = "symbolSet")
    public native CPImageSet getSymbolSet();
    /**
     * @since Available in iOS 12.0 and later.
     * @deprecated Deprecated in iOS 13.0. Use symbolImage
     */
    @Deprecated
    @Property(selector = "setSymbolSet:")
    public native void setSymbolSet(CPImageSet v);
    /**
     * @since Available in iOS 15.4 and later.
     */
    @Property(selector = "cardBackgroundColor")
    public native UIColor getCardBackgroundColor();
    /**
     * @since Available in iOS 15.4 and later.
     */
    @Property(selector = "setCardBackgroundColor:")
    public native void setCardBackgroundColor(UIColor v);
    @Property(selector = "symbolImage")
    public native UIImage getSymbolImage();
    @Property(selector = "setSymbolImage:")
    public native void setSymbolImage(UIImage v);
    @Property(selector = "junctionImage")
    public native UIImage getJunctionImage();
    @Property(selector = "setJunctionImage:")
    public native void setJunctionImage(UIImage v);
    @Property(selector = "instructionVariants")
    public native NSArray<NSString> getInstructionVariants();
    @Property(selector = "setInstructionVariants:")
    public native void setInstructionVariants(NSArray<NSString> v);
    @Property(selector = "initialTravelEstimates")
    public native CPTravelEstimates getInitialTravelEstimates();
    @Property(selector = "setInitialTravelEstimates:")
    public native void setInitialTravelEstimates(CPTravelEstimates v);
    @Property(selector = "attributedInstructionVariants")
    public native NSArray<NSAttributedString> getAttributedInstructionVariants();
    @Property(selector = "setAttributedInstructionVariants:")
    public native void setAttributedInstructionVariants(NSArray<NSAttributedString> v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "dashboardSymbolImage")
    public native UIImage getDashboardSymbolImage();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setDashboardSymbolImage:")
    public native void setDashboardSymbolImage(UIImage v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "dashboardJunctionImage")
    public native UIImage getDashboardJunctionImage();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setDashboardJunctionImage:")
    public native void setDashboardJunctionImage(UIImage v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "dashboardInstructionVariants")
    public native NSArray<NSString> getDashboardInstructionVariants();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setDashboardInstructionVariants:")
    public native void setDashboardInstructionVariants(NSArray<NSString> v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "dashboardAttributedInstructionVariants")
    public native NSArray<NSAttributedString> getDashboardAttributedInstructionVariants();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setDashboardAttributedInstructionVariants:")
    public native void setDashboardAttributedInstructionVariants(NSArray<NSAttributedString> v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "notificationSymbolImage")
    public native UIImage getNotificationSymbolImage();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setNotificationSymbolImage:")
    public native void setNotificationSymbolImage(UIImage v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "notificationInstructionVariants")
    public native NSArray<NSString> getNotificationInstructionVariants();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setNotificationInstructionVariants:")
    public native void setNotificationInstructionVariants(NSArray<NSString> v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "notificationAttributedInstructionVariants")
    public native NSArray<NSAttributedString> getNotificationAttributedInstructionVariants();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setNotificationAttributedInstructionVariants:")
    public native void setNotificationAttributedInstructionVariants(NSArray<NSAttributedString> v);
    @Property(selector = "userInfo")
    public native NSObject getUserInfo();
    @Property(selector = "setUserInfo:")
    public native void setUserInfo(NSObject v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
