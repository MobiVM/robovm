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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PKToolPickerCustomItem/*</name>*/ 
    extends /*<extends>*/PKToolPickerItem/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PKToolPickerCustomItemPtr extends Ptr<PKToolPickerCustomItem, PKToolPickerCustomItemPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PKToolPickerCustomItem.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected PKToolPickerCustomItem() {}
    protected PKToolPickerCustomItem(Handle h, long handle) { super(h, handle); }
    protected PKToolPickerCustomItem(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithConfiguration:")
    public PKToolPickerCustomItem(PKToolPickerCustomItemConfiguration configuration) { super((SkipInit) null); initObject(init(configuration)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "configuration")
    public native PKToolPickerCustomItemConfiguration getConfiguration();
    @Property(selector = "color")
    public native UIColor getColor();
    @Property(selector = "setColor:")
    public native void setColor(UIColor v);
    @Property(selector = "allowsColorSelection")
    public native boolean allowsColorSelection();
    @Property(selector = "setAllowsColorSelection:")
    public native void setAllowsColorSelection(boolean v);
    @Property(selector = "width")
    public native @MachineSizedFloat double getWidth();
    @Property(selector = "setWidth:")
    public native void setWidth(@MachineSizedFloat double v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithConfiguration:")
    protected native @Pointer long init(PKToolPickerCustomItemConfiguration configuration);
    @Method(selector = "reloadImage")
    public native void reloadImage();
    /*</methods>*/
}
