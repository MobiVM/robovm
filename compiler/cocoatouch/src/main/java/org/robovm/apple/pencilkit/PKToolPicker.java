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
    protected PKToolPicker() {}
    protected PKToolPicker(Handle h, long handle) { super(h, handle); }
    protected PKToolPicker(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "selectedTool")
    public native PKTool getSelectedTool();
    @Property(selector = "setSelectedTool:")
    public native void setSelectedTool(PKTool v);
    @Property(selector = "isRulerActive")
    public native boolean isRulerActive();
    @Property(selector = "setRulerActive:")
    public native void setRulerActive(boolean v);
    @Property(selector = "isVisible")
    public native boolean isVisible();
    @Property(selector = "overrideUserInterfaceStyle")
    public native UIUserInterfaceStyle getOverrideUserInterfaceStyle();
    @Property(selector = "setOverrideUserInterfaceStyle:")
    public native void setOverrideUserInterfaceStyle(UIUserInterfaceStyle v);
    @Property(selector = "colorUserInterfaceStyle")
    public native UIUserInterfaceStyle getColorUserInterfaceStyle();
    @Property(selector = "setColorUserInterfaceStyle:")
    public native void setColorUserInterfaceStyle(UIUserInterfaceStyle v);
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
    @Method(selector = "sharedToolPickerForWindow:")
    public static native PKToolPicker sharedToolPickerForWindow(UIWindow window);
    /*</methods>*/
}
