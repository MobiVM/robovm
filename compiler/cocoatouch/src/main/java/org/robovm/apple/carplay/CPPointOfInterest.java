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
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CarPlay") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPPointOfInterest/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CPPointOfInterestPtr extends Ptr<CPPointOfInterest, CPPointOfInterestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CPPointOfInterest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CPPointOfInterest() {}
    protected CPPointOfInterest(Handle h, long handle) { super(h, handle); }
    protected CPPointOfInterest(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithLocation:title:subtitle:summary:detailTitle:detailSubtitle:detailSummary:pinImage:")
    public CPPointOfInterest(MKMapItem location, String title, String subtitle, String summary, String detailTitle, String detailSubtitle, String detailSummary, UIImage pinImage) { super((SkipInit) null); initObject(init(location, title, subtitle, summary, detailTitle, detailSubtitle, detailSummary, pinImage)); }
    @Method(selector = "initWithCoder:")
    public CPPointOfInterest(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "location")
    public native MKMapItem getLocation();
    @Property(selector = "setLocation:")
    public native void setLocation(MKMapItem v);
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    @Property(selector = "subtitle")
    public native String getSubtitle();
    @Property(selector = "setSubtitle:")
    public native void setSubtitle(String v);
    @Property(selector = "summary")
    public native String getSummary();
    @Property(selector = "setSummary:")
    public native void setSummary(String v);
    @Property(selector = "detailTitle")
    public native String getDetailTitle();
    @Property(selector = "setDetailTitle:")
    public native void setDetailTitle(String v);
    @Property(selector = "detailSubtitle")
    public native String getDetailSubtitle();
    @Property(selector = "setDetailSubtitle:")
    public native void setDetailSubtitle(String v);
    @Property(selector = "detailSummary")
    public native String getDetailSummary();
    @Property(selector = "setDetailSummary:")
    public native void setDetailSummary(String v);
    @Property(selector = "pinImage")
    public native UIImage getPinImage();
    @Property(selector = "setPinImage:")
    public native void setPinImage(UIImage v);
    @Property(selector = "primaryButton")
    public native CPTextButton getPrimaryButton();
    @Property(selector = "setPrimaryButton:")
    public native void setPrimaryButton(CPTextButton v);
    @Property(selector = "secondaryButton")
    public native CPTextButton getSecondaryButton();
    @Property(selector = "setSecondaryButton:")
    public native void setSecondaryButton(CPTextButton v);
    @Property(selector = "userInfo")
    public native NSObject getUserInfo();
    @Property(selector = "setUserInfo:")
    public native void setUserInfo(NSObject v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithLocation:title:subtitle:summary:detailTitle:detailSubtitle:detailSummary:pinImage:")
    protected native @Pointer long init(MKMapItem location, String title, String subtitle, String summary, String detailTitle, String detailSubtitle, String detailSummary, UIImage pinImage);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
