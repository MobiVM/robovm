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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPTemplate/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CPTemplatePtr extends Ptr<CPTemplate, CPTemplatePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CPTemplate.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CPTemplate() {}
    protected CPTemplate(Handle h, long handle) { super(h, handle); }
    protected CPTemplate(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public CPTemplate(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "userInfo")
    public native NSObject getUserInfo();
    @Property(selector = "setUserInfo:")
    public native void setUserInfo(NSObject v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "tabTitle")
    public native String getTabTitle();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setTabTitle:")
    public native void setTabTitle(String v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "tabImage")
    public native UIImage getTabImage();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setTabImage:")
    public native void setTabImage(UIImage v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "tabSystemItem")
    public native UITabBarSystemItem getTabSystemItem();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setTabSystemItem:")
    public native void setTabSystemItem(UITabBarSystemItem v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "showsTabBadge")
    public native boolean showsTabBadge();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setShowsTabBadge:")
    public native void setShowsTabBadge(boolean v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
