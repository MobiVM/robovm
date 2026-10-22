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
import org.robovm.apple.coremedia.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 27.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CarPlay") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPPanelItem/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CPPanelItemPtr extends Ptr<CPPanelItem, CPPanelItemPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CPPanelItem.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CPPanelItem() {}
    protected CPPanelItem(Handle h, long handle) { super(h, handle); }
    protected CPPanelItem(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithListItem:")
    public CPPanelItem(CPListItem listItem) { super((SkipInit) null); initObject(init(listItem)); }
    @Method(selector = "initWithGridButtons:")
    public CPPanelItem(NSArray<CPGridButton> gridButtons) { super((SkipInit) null); initObject(init(gridButtons)); }
    @Method(selector = "initWithCoder:")
    public CPPanelItem(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isEnabled")
    public native boolean isEnabled();
    @Property(selector = "setEnabled:")
    public native void setEnabled(boolean v);
    @Property(selector = "showsBottomSeparator")
    public native boolean showsBottomSeparator();
    @Property(selector = "setShowsBottomSeparator:")
    public native void setShowsBottomSeparator(boolean v);
    @Property(selector = "userInfo")
    public native NSObject getUserInfo();
    @Property(selector = "setUserInfo:")
    public native void setUserInfo(NSObject v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithListItem:")
    protected native @Pointer long init(CPListItem listItem);
    @Method(selector = "initWithGridButtons:")
    protected native @Pointer long init(NSArray<CPGridButton> gridButtons);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
