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
package org.robovm.apple.passkit;

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
import org.robovm.apple.addressbook.*;
import org.robovm.apple.contacts.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("PassKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PKAddPassButton/*</name>*/ 
    extends /*<extends>*/UIButton/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PKAddPassButtonPtr extends Ptr<PKAddPassButton, PKAddPassButtonPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PKAddPassButton.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PKAddPassButton() {}
    protected PKAddPassButton(Handle h, long handle) { super(h, handle); }
    protected PKAddPassButton(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAddPassButtonStyle:")
    public PKAddPassButton(PKAddPassButtonStyle style) { super((SkipInit) null); initObject(init(style)); }
    @Method(selector = "initWithFrame:")
    public PKAddPassButton(@ByVal org.robovm.apple.coregraphics.CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public PKAddPassButton(NSCoder coder) { super(coder); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithFrame:primaryAction:")
    public PKAddPassButton(@ByVal org.robovm.apple.coregraphics.CGRect frame, UIAction primaryAction) { super(frame, primaryAction); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "addPassButtonStyle")
    public native PKAddPassButtonStyle getAddPassButtonStyle();
    @Property(selector = "setAddPassButtonStyle:")
    public native void setAddPassButtonStyle(PKAddPassButtonStyle v);
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAddPassButtonStyle:")
    protected native @Pointer long init(PKAddPassButtonStyle style);
    @Method(selector = "addPassButtonWithStyle:")
    public static native PKAddPassButton addPassButton(PKAddPassButtonStyle addPassButtonStyle);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "systemButtonWithImage:target:action:")
    public static native PKAddPassButton getSystemButtonWithImage(UIImage image, NSObject target, Selector action);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "systemButtonWithPrimaryAction:")
    public static native PKAddPassButton getSystemButtonWithPrimaryAction(UIAction primaryAction);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute attribute);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:relativeToLayoutDirection:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute semanticContentAttribute, UIUserInterfaceLayoutDirection layoutDirection);
    /*</methods>*/
}
