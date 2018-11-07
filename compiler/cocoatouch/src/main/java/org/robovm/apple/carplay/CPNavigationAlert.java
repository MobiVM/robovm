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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPNavigationAlert/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CPNavigationAlertPtr extends Ptr<CPNavigationAlert, CPNavigationAlertPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CPNavigationAlert.class); }/*</bind>*/
    /*<constants>*/
    public static final int getNavigationAlertMinimumDuration = 5;
    /*</constants>*/
    /*<constructors>*/
    public CPNavigationAlert() {}
    protected CPNavigationAlert(Handle h, long handle) { super(h, handle); }
    protected CPNavigationAlert(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTitleVariants:subtitleVariants:imageSet:primaryAction:secondaryAction:duration:")
    public CPNavigationAlert(NSArray<NSString> titleVariants, NSArray<NSString> subtitleVariants, CPImageSet imageSet, CPAlertAction primaryAction, CPAlertAction secondaryAction, double duration) { super((SkipInit) null); initObject(init(titleVariants, subtitleVariants, imageSet, primaryAction, secondaryAction, duration)); }
    @Method(selector = "initWithCoder:")
    public CPNavigationAlert(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "titleVariants")
    public native NSArray<NSString> getTitleVariants();
    @Property(selector = "subtitleVariants")
    public native NSArray<NSString> getSubtitleVariants();
    @Property(selector = "imageSet")
    public native CPImageSet getImageSet();
    @Property(selector = "primaryAction")
    public native CPAlertAction getPrimaryAction();
    @Property(selector = "secondaryAction")
    public native CPAlertAction getSecondaryAction();
    @Property(selector = "duration")
    public native double getDuration();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTitleVariants:subtitleVariants:imageSet:primaryAction:secondaryAction:duration:")
    protected native @Pointer long init(NSArray<NSString> titleVariants, NSArray<NSString> subtitleVariants, CPImageSet imageSet, CPAlertAction primaryAction, CPAlertAction secondaryAction, double duration);
    @Method(selector = "updateTitleVariants:subtitleVariants:")
    public native void updateTitleVariants(NSArray<NSString> newTitleVariants, NSArray<NSString> newSubtitleVariants);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
