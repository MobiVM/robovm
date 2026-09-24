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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PKToolPickerInkingItem/*</name>*/ 
    extends /*<extends>*/PKToolPickerItem/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PKToolPickerInkingItemPtr extends Ptr<PKToolPickerInkingItem, PKToolPickerInkingItemPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PKToolPickerInkingItem.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected PKToolPickerInkingItem() {}
    protected PKToolPickerInkingItem(Handle h, long handle) { super(h, handle); }
    protected PKToolPickerInkingItem(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithInkType:")
    public PKToolPickerInkingItem(PKInkType inkType) { super((SkipInit) null); initObject(init(inkType)); }
    @Method(selector = "initWithInkType:color:")
    public PKToolPickerInkingItem(PKInkType inkType, UIColor color) { super((SkipInit) null); initObject(init(inkType, color)); }
    @Method(selector = "initWithInkType:width:")
    public PKToolPickerInkingItem(PKInkType inkType, @MachineSizedFloat double width) { super((SkipInit) null); initObject(init(inkType, width)); }
    @Method(selector = "initWithInkType:color:width:")
    public PKToolPickerInkingItem(PKInkType inkType, UIColor color, @MachineSizedFloat double width) { super((SkipInit) null); initObject(init(inkType, color, width)); }
    @Method(selector = "initWithInkType:color:width:identifier:")
    public PKToolPickerInkingItem(PKInkType inkType, UIColor color, @MachineSizedFloat double width, String identifier) { super((SkipInit) null); initObject(init(inkType, color, width, identifier)); }
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "initWithInkType:color:width:azimuth:identifier:")
    public PKToolPickerInkingItem(PKInkType inkType, UIColor color, @MachineSizedFloat double width, @MachineSizedFloat double azimuth, String identifier) { super((SkipInit) null); initObject(init(inkType, color, width, azimuth, identifier)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "inkingTool")
    public native PKInkingTool getInkingTool();
    @Property(selector = "allowsColorSelection")
    public native boolean allowsColorSelection();
    @Property(selector = "setAllowsColorSelection:")
    public native void setAllowsColorSelection(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithInkType:")
    protected native @Pointer long init(PKInkType inkType);
    @Method(selector = "initWithInkType:color:")
    protected native @Pointer long init(PKInkType inkType, UIColor color);
    @Method(selector = "initWithInkType:width:")
    protected native @Pointer long init(PKInkType inkType, @MachineSizedFloat double width);
    @Method(selector = "initWithInkType:color:width:")
    protected native @Pointer long init(PKInkType inkType, UIColor color, @MachineSizedFloat double width);
    @Method(selector = "initWithInkType:color:width:identifier:")
    protected native @Pointer long init(PKInkType inkType, UIColor color, @MachineSizedFloat double width, String identifier);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "initWithInkType:color:width:azimuth:identifier:")
    protected native @Pointer long init(PKInkType inkType, UIColor color, @MachineSizedFloat double width, @MachineSizedFloat double azimuth, String identifier);
    /*</methods>*/
}
