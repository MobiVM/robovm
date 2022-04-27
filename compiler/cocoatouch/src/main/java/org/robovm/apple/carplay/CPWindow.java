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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPWindow/*</name>*/ 
    extends /*<extends>*/UIWindow/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CPWindowPtr extends Ptr<CPWindow, CPWindowPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CPWindow.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CPWindow() {}
    protected CPWindow(Handle h, long handle) { super(h, handle); }
    protected CPWindow(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "initWithWindowScene:")
    public CPWindow(UIWindowScene windowScene) { super(windowScene); }
    @Method(selector = "initWithFrame:")
    public CPWindow(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public CPWindow(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "mapButtonSafeAreaLayoutGuide")
    public native UILayoutGuide getMapButtonSafeAreaLayoutGuide();
    @Property(selector = "templateApplicationScene")
    public native CPTemplateApplicationScene getTemplateApplicationScene();
    @Property(selector = "setTemplateApplicationScene:", strongRef = true)
    public native void setTemplateApplicationScene(CPTemplateApplicationScene v);
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
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
