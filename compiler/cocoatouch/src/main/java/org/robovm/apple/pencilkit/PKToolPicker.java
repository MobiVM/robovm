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
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("PencilKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PKToolPicker/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PKToolPickerPtr extends Ptr<PKToolPicker, PKToolPickerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PKToolPicker.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PKToolPicker() {}
    protected PKToolPicker(Handle h, long handle) { super(h, handle); }
    protected PKToolPicker(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Method(selector = "initWithToolItems:")
    public PKToolPicker(NSArray<PKToolPickerItem> items) { super((SkipInit) null); initObject(init(items)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Property(selector = "delegate")
    public native PKToolPickerDelegate getDelegate();
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(PKToolPickerDelegate v);
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 18.0. Use selectedToolItem instead.
     */
    @Deprecated
    @Property(selector = "selectedTool")
    public native PKTool getSelectedTool();
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 18.0. Use selectedToolItem instead.
     */
    @Deprecated
    @Property(selector = "setSelectedTool:")
    public native void setSelectedTool(PKTool v);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Property(selector = "selectedToolItem")
    public native PKToolPickerItem getSelectedToolItem();
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Property(selector = "setSelectedToolItem:")
    public native void setSelectedToolItem(PKToolPickerItem v);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Property(selector = "selectedToolItemIdentifier")
    public native String getSelectedToolItemIdentifier();
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Property(selector = "setSelectedToolItemIdentifier:")
    public native void setSelectedToolItemIdentifier(String v);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Property(selector = "toolItems")
    public native NSArray<PKToolPickerItem> getToolItems();
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Property(selector = "defaultToolItems")
    public static native NSArray<PKToolPickerItem> getDefaultToolItems();
    @Property(selector = "isRulerActive")
    public native boolean isRulerActive();
    @Property(selector = "setRulerActive:")
    public native void setRulerActive(boolean v);
    @Property(selector = "isVisible")
    public native boolean isVisible();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "stateAutosaveName")
    public native String getStateAutosaveName();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setStateAutosaveName:")
    public native void setStateAutosaveName(String v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "maximumSupportedContentVersion")
    public native PKContentVersion getMaximumSupportedContentVersion();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setMaximumSupportedContentVersion:")
    public native void setMaximumSupportedContentVersion(PKContentVersion v);
    @Property(selector = "overrideUserInterfaceStyle")
    public native UIUserInterfaceStyle getOverrideUserInterfaceStyle();
    @Property(selector = "setOverrideUserInterfaceStyle:")
    public native void setOverrideUserInterfaceStyle(UIUserInterfaceStyle v);
    @Property(selector = "colorUserInterfaceStyle")
    public native UIUserInterfaceStyle getColorUserInterfaceStyle();
    @Property(selector = "setColorUserInterfaceStyle:")
    public native void setColorUserInterfaceStyle(UIUserInterfaceStyle v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "showsDrawingPolicyControls")
    public native boolean showsDrawingPolicyControls();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setShowsDrawingPolicyControls:")
    public native void setShowsDrawingPolicyControls(boolean v);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Property(selector = "accessoryItem")
    public native UIBarButtonItem getAccessoryItem();
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Property(selector = "setAccessoryItem:")
    public native void setAccessoryItem(UIBarButtonItem v);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Property(selector = "colorMaximumLinearExposure")
    public native @MachineSizedFloat double getColorMaximumLinearExposure();
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Property(selector = "setColorMaximumLinearExposure:")
    public native void setColorMaximumLinearExposure(@MachineSizedFloat double v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "addObserver:")
    public native void addObserver(PKToolPickerObserver observer);
    @Method(selector = "removeObserver:")
    public native void removeObserver(PKToolPickerObserver observer);
    @Method(selector = "setVisible:forFirstResponder:")
    public native void setVisible(boolean visible, UIResponder responder);
    @Method(selector = "frameObscuredInView:")
    public native @ByVal CGRect frameObscuredInView(UIView view);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Method(selector = "initWithToolItems:")
    protected native @Pointer long init(NSArray<PKToolPickerItem> items);
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 14.0. Create individual instances instead.
     */
    @Deprecated
    @Method(selector = "sharedToolPickerForWindow:")
    public static native PKToolPicker sharedToolPickerForWindow(UIWindow window);
    /*</methods>*/
}
