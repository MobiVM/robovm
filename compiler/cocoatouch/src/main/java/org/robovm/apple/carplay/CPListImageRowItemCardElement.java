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
 * @since Available in iOS 26.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CarPlay") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPListImageRowItemCardElement/*</name>*/ 
    extends /*<extends>*/CPListImageRowItemElement/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CPListImageRowItemCardElementPtr extends Ptr<CPListImageRowItemCardElement, CPListImageRowItemCardElementPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CPListImageRowItemCardElement.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CPListImageRowItemCardElement() {}
    protected CPListImageRowItemCardElement(Handle h, long handle) { super(h, handle); }
    protected CPListImageRowItemCardElement(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithImage:showsImageFullHeight:title:subtitle:tintColor:")
    public CPListImageRowItemCardElement(UIImage image, boolean showsImageFullHeight, String title, String subtitle, UIColor tintColor) { super((SkipInit) null); initObject(init(image, showsImageFullHeight, title, subtitle, tintColor)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    @Property(selector = "subtitle")
    public native String getSubtitle();
    @Property(selector = "setSubtitle:")
    public native void setSubtitle(String v);
    @Property(selector = "showsImageFullHeight")
    public native boolean showsImageFullHeight();
    @Property(selector = "tintColor")
    public native UIColor getTintColor();
    @Property(selector = "setTintColor:")
    public native void setTintColor(UIColor v);
    @Property(selector = "maximumImageSize")
    public static native @ByVal CGSize getMaximumImageSize();
    @Property(selector = "maximumFullHeightImageSize")
    public static native @ByVal CGSize getMaximumFullHeightImageSize();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithImage:showsImageFullHeight:title:subtitle:tintColor:")
    protected native @Pointer long init(UIImage image, boolean showsImageFullHeight, String title, String subtitle, UIColor tintColor);
    /*</methods>*/
}
