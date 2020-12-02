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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPPointOfInterestTemplate/*</name>*/ 
    extends /*<extends>*/CPTemplate/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CPPointOfInterestTemplatePtr extends Ptr<CPPointOfInterestTemplate, CPPointOfInterestTemplatePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CPPointOfInterestTemplate.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CPPointOfInterestTemplate() {}
    protected CPPointOfInterestTemplate(Handle h, long handle) { super(h, handle); }
    protected CPPointOfInterestTemplate(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTitle:pointsOfInterest:selectedIndex:")
    public CPPointOfInterestTemplate(String title, NSArray<CPPointOfInterest> pointsOfInterest, @MachineSizedUInt long selectedIndex) { super((SkipInit) null); initObject(init(title, pointsOfInterest, selectedIndex)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    @Property(selector = "pointsOfInterest")
    public native NSArray<CPPointOfInterest> getPointsOfInterest();
    @Property(selector = "selectedIndex")
    public native @MachineSizedUInt long getSelectedIndex();
    @Property(selector = "setSelectedIndex:")
    public native void setSelectedIndex(@MachineSizedUInt long v);
    @Property(selector = "pointOfInterestDelegate")
    public native CPPointOfInterestTemplateDelegate getPointOfInterestDelegate();
    @Property(selector = "setPointOfInterestDelegate:", strongRef = true)
    public native void setPointOfInterestDelegate(CPPointOfInterestTemplateDelegate v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTitle:pointsOfInterest:selectedIndex:")
    protected native @Pointer long init(String title, NSArray<CPPointOfInterest> pointsOfInterest, @MachineSizedUInt long selectedIndex);
    @Method(selector = "setPointsOfInterest:selectedIndex:")
    public native void setPointsOfInterest(NSArray<CPPointOfInterest> pointsOfInterest, @MachineSizedUInt long selectedIndex);
    /*</methods>*/
}
