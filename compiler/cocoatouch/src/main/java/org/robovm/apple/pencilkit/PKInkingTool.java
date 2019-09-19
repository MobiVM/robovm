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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PKInkingTool/*</name>*/ 
    extends /*<extends>*/PKTool/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PKInkingToolPtr extends Ptr<PKInkingTool, PKInkingToolPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PKInkingTool.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected PKInkingTool() {}
    protected PKInkingTool(Handle h, long handle) { super(h, handle); }
    protected PKInkingTool(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithInkType:color:width:")
    public PKInkingTool(PKInkType type, UIColor color, @MachineSizedFloat double width) { super((SkipInit) null); initObject(init(type, color, width)); }
    @Method(selector = "initWithInkType:color:")
    public PKInkingTool(PKInkType type, UIColor color) { super((SkipInit) null); initObject(init(type, color)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "inkType")
    public native PKInkType getInkType();
    @Property(selector = "color")
    public native UIColor getColor();
    @Property(selector = "width")
    public native @MachineSizedFloat double getWidth();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithInkType:color:width:")
    protected native @Pointer long init(PKInkType type, UIColor color, @MachineSizedFloat double width);
    @Method(selector = "initWithInkType:color:")
    protected native @Pointer long init(PKInkType type, UIColor color);
    @Method(selector = "defaultWidthForInkType:")
    public static native @MachineSizedFloat double defaultWidthForInkType(PKInkType inkType);
    @Method(selector = "minimumWidthForInkType:")
    public static native @MachineSizedFloat double minimumWidthForInkType(PKInkType inkType);
    @Method(selector = "maximumWidthForInkType:")
    public static native @MachineSizedFloat double maximumWidthForInkType(PKInkType inkType);
    @Method(selector = "convertColor:fromUserInterfaceStyle:to:")
    public static native UIColor convertColor(UIColor color, UIUserInterfaceStyle fromUserInterfaceStyle, UIUserInterfaceStyle toUserInterfaceStyle);
    /*</methods>*/
}
