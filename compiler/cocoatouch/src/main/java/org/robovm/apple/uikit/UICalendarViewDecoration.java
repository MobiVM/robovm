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
package org.robovm.apple.uikit;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.cloudkit.*;
import org.robovm.apple.fileprovider.*;
import org.robovm.apple.intents.*;
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.linkpresentation.*;
import org.robovm.apple.symbols.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UICalendarViewDecoration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UICalendarViewDecorationPtr extends Ptr<UICalendarViewDecoration, UICalendarViewDecorationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UICalendarViewDecoration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UICalendarViewDecoration() {}
    protected UICalendarViewDecoration(Handle h, long handle) { super(h, handle); }
    protected UICalendarViewDecoration(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithImage:color:size:")
    public UICalendarViewDecoration(UIImage image, UIColor color, UICalendarViewDecorationSize size) { super((SkipInit) null); initObject(init(image, color, size)); }
    @Method(selector = "initWithCustomViewProvider:")
    public UICalendarViewDecoration(@Block Block0<UIView> customViewProvider) { super((SkipInit) null); initObject(init(customViewProvider)); }
    public UICalendarViewDecoration(UIColor color, UICalendarViewDecorationSize size) { super((Handle) null, create(color, size)); retain(getHandle()); }
    public UICalendarViewDecoration(UIImage image) { super((Handle) null, create(image)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithImage:color:size:")
    protected native @Pointer long init(UIImage image, UIColor color, UICalendarViewDecorationSize size);
    @Method(selector = "initWithCustomViewProvider:")
    protected native @Pointer long init(@Block Block0<UIView> customViewProvider);
    @Method(selector = "decorationWithColor:size:")
    protected static native @Pointer long create(UIColor color, UICalendarViewDecorationSize size);
    @Method(selector = "decorationWithImage:")
    protected static native @Pointer long create(UIImage image);
    /*</methods>*/
}
