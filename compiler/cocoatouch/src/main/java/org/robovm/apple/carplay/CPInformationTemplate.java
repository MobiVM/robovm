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
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CarPlay") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPInformationTemplate/*</name>*/ 
    extends /*<extends>*/CPTemplate/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CPInformationTemplatePtr extends Ptr<CPInformationTemplate, CPInformationTemplatePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CPInformationTemplate.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CPInformationTemplate() {}
    protected CPInformationTemplate(Handle h, long handle) { super(h, handle); }
    protected CPInformationTemplate(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTitle:layout:items:actions:")
    public CPInformationTemplate(String title, CPInformationTemplateLayout layout, NSArray<CPInformationItem> items, NSArray<CPTextButton> actions) { super((SkipInit) null); initObject(init(title, layout, items, actions)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "layout")
    public native CPInformationTemplateLayout getLayout();
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    @Property(selector = "items")
    public native NSArray<CPInformationItem> getItems();
    @Property(selector = "setItems:")
    public native void setItems(NSArray<CPInformationItem> v);
    @Property(selector = "actions")
    public native NSArray<CPTextButton> getActions();
    @Property(selector = "setActions:")
    public native void setActions(NSArray<CPTextButton> v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTitle:layout:items:actions:")
    protected native @Pointer long init(String title, CPInformationTemplateLayout layout, NSArray<CPInformationItem> items, NSArray<CPTextButton> actions);
    /*</methods>*/
}
