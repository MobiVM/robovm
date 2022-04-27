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
package org.robovm.apple.intentsui;

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
import org.robovm.apple.intents.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("IntentsUI") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INUIAddVoiceShortcutButton/*</name>*/ 
    extends /*<extends>*/UIButton/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INUIAddVoiceShortcutButtonPtr extends Ptr<INUIAddVoiceShortcutButton, INUIAddVoiceShortcutButtonPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INUIAddVoiceShortcutButton.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INUIAddVoiceShortcutButton() {}
    protected INUIAddVoiceShortcutButton(Handle h, long handle) { super(h, handle); }
    protected INUIAddVoiceShortcutButton(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithStyle:")
    public INUIAddVoiceShortcutButton(INUIAddVoiceShortcutButtonStyle style) { super((SkipInit) null); initObject(init(style)); }
    @Method(selector = "initWithCoder:")
    public INUIAddVoiceShortcutButton(NSCoder coder) { super(coder); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithFrame:primaryAction:")
    public INUIAddVoiceShortcutButton(@ByVal CGRect frame, UIAction primaryAction) { super(frame, primaryAction); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "style")
    public native INUIAddVoiceShortcutButtonStyle getStyle();
    @Property(selector = "setStyle:")
    public native void setStyle(INUIAddVoiceShortcutButtonStyle v);
    @Property(selector = "delegate")
    public native INUIAddVoiceShortcutButtonDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(INUIAddVoiceShortcutButtonDelegate v);
    @Property(selector = "shortcut")
    public native INShortcut getShortcut();
    @Property(selector = "setShortcut:")
    public native void setShortcut(INShortcut v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "cornerRadius")
    public native @MachineSizedFloat double getCornerRadius();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setCornerRadius:")
    public native void setCornerRadius(@MachineSizedFloat double v);
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithStyle:")
    protected native @Pointer long init(INUIAddVoiceShortcutButtonStyle style);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "systemButtonWithImage:target:action:")
    public static native INUIAddVoiceShortcutButton getSystemButtonWithImage(UIImage image, NSObject target, Selector action);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "systemButtonWithPrimaryAction:")
    public static native INUIAddVoiceShortcutButton getSystemButtonWithPrimaryAction(UIAction primaryAction);
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
