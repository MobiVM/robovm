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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CarPlay") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPListItem/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CPListItemPtr extends Ptr<CPListItem, CPListItemPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CPListItem.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CPListItem() {}
    protected CPListItem(Handle h, long handle) { super(h, handle); }
    protected CPListItem(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithText:detailText:image:showsDisclosureIndicator:")
    public CPListItem(String text, String detailText, UIImage image, boolean showsDisclosureIndicator) { super((SkipInit) null); initObject(init(text, detailText, image, showsDisclosureIndicator)); }
    @Method(selector = "initWithText:detailText:image:")
    public CPListItem(String text, String detailText, UIImage image) { super((SkipInit) null); initObject(init(text, detailText, image)); }
    @Method(selector = "initWithText:detailText:")
    public CPListItem(String text, String detailText) { super((SkipInit) null); initObject(init(text, detailText)); }
    @Method(selector = "initWithCoder:")
    public CPListItem(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "text")
    public native String getText();
    @Property(selector = "detailText")
    public native String getDetailText();
    @Property(selector = "image")
    public native UIImage getImage();
    @Property(selector = "showsDisclosureIndicator")
    public native boolean showsDisclosureIndicator();
    @Property(selector = "userInfo")
    public native NSObject getUserInfo();
    @Property(selector = "setUserInfo:")
    public native void setUserInfo(NSObject v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="CPMaximumListItemImageSize", optional=true)
    public static native @ByVal CGSize getMaximumListItemImageSize();
    
    @Method(selector = "initWithText:detailText:image:showsDisclosureIndicator:")
    protected native @Pointer long init(String text, String detailText, UIImage image, boolean showsDisclosureIndicator);
    @Method(selector = "initWithText:detailText:image:")
    protected native @Pointer long init(String text, String detailText, UIImage image);
    @Method(selector = "initWithText:detailText:")
    protected native @Pointer long init(String text, String detailText);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
