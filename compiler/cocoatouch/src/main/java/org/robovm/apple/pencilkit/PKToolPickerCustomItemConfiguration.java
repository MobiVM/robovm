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
package org.robovm.apple.pencilkit;

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
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 18.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("PencilKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PKToolPickerCustomItemConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PKToolPickerCustomItemConfigurationPtr extends Ptr<PKToolPickerCustomItemConfiguration, PKToolPickerCustomItemConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PKToolPickerCustomItemConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected PKToolPickerCustomItemConfiguration() {}
    protected PKToolPickerCustomItemConfiguration(Handle h, long handle) { super(h, handle); }
    protected PKToolPickerCustomItemConfiguration(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithIdentifier:name:")
    public PKToolPickerCustomItemConfiguration(String identifier, String name) { super((SkipInit) null); initObject(init(identifier, name)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "identifier")
    public native String getIdentifier();
    @Property(selector = "setIdentifier:")
    public native void setIdentifier(String v);
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "setName:")
    public native void setName(String v);
    @Property(selector = "imageProvider")
    public native @Block Block1<PKToolPickerCustomItem, UIImage> getImageProvider();
    @Property(selector = "setImageProvider:")
    public native void setImageProvider(@Block Block1<PKToolPickerCustomItem, UIImage> v);
    @Property(selector = "viewControllerProvider")
    public native @Block Block1<PKToolPickerCustomItem, UIViewController> getViewControllerProvider();
    @Property(selector = "setViewControllerProvider:")
    public native void setViewControllerProvider(@Block Block1<PKToolPickerCustomItem, UIViewController> v);
    @Property(selector = "defaultWidth")
    public native @MachineSizedFloat double getDefaultWidth();
    @Property(selector = "setDefaultWidth:")
    public native void setDefaultWidth(@MachineSizedFloat double v);
    @Property(selector = "widthVariants")
    public native NSDictionary<NSNumber, UIImage> getWidthVariants();
    @Property(selector = "setWidthVariants:")
    public native void setWidthVariants(NSDictionary<NSNumber, UIImage> v);
    @Property(selector = "defaultColor")
    public native UIColor getDefaultColor();
    @Property(selector = "setDefaultColor:")
    public native void setDefaultColor(UIColor v);
    @Property(selector = "allowsColorSelection")
    public native boolean allowsColorSelection();
    @Property(selector = "setAllowsColorSelection:")
    public native void setAllowsColorSelection(boolean v);
    @Property(selector = "toolAttributeControls")
    public native PKToolPickerCustomItemControlOptions getToolAttributeControls();
    @Property(selector = "setToolAttributeControls:")
    public native void setToolAttributeControls(PKToolPickerCustomItemControlOptions v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithIdentifier:name:")
    protected native @Pointer long init(String identifier, String name);
    /*</methods>*/
}
