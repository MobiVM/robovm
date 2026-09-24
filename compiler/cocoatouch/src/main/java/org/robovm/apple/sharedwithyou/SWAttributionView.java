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
package org.robovm.apple.sharedwithyou;

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
import org.robovm.apple.uniformtypeid.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("SharedWithYou") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SWAttributionView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SWAttributionViewPtr extends Ptr<SWAttributionView, SWAttributionViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SWAttributionView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SWAttributionView() {}
    protected SWAttributionView(Handle h, long handle) { super(h, handle); }
    protected SWAttributionView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public SWAttributionView(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public SWAttributionView(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "highlight")
    public native SWHighlight getHighlight();
    @Property(selector = "setHighlight:")
    public native void setHighlight(SWHighlight v);
    @Property(selector = "displayContext")
    public native SWAttributionViewDisplayContext getDisplayContext();
    @Property(selector = "setDisplayContext:")
    public native void setDisplayContext(SWAttributionViewDisplayContext v);
    @Property(selector = "horizontalAlignment")
    public native SWAttributionViewHorizontalAlignment getHorizontalAlignment();
    @Property(selector = "setHorizontalAlignment:")
    public native void setHorizontalAlignment(SWAttributionViewHorizontalAlignment v);
    @Property(selector = "backgroundStyle")
    public native SWAttributionViewBackgroundStyle getBackgroundStyle();
    @Property(selector = "setBackgroundStyle:")
    public native void setBackgroundStyle(SWAttributionViewBackgroundStyle v);
    @Property(selector = "preferredMaxLayoutWidth")
    public native @MachineSizedFloat double getPreferredMaxLayoutWidth();
    @Property(selector = "setPreferredMaxLayoutWidth:")
    public native void setPreferredMaxLayoutWidth(@MachineSizedFloat double v);
    @Property(selector = "highlightMenu")
    public native UIMenu getHighlightMenu();
    @Property(selector = "menuTitleForHideAction")
    public native String getMenuTitleForHideAction();
    @Property(selector = "setMenuTitleForHideAction:")
    public native void setMenuTitleForHideAction(String v);
    @Property(selector = "supplementalMenu")
    public native UIMenu getSupplementalMenu();
    @Property(selector = "setSupplementalMenu:")
    public native void setSupplementalMenu(UIMenu v);
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
