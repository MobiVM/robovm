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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPContactTemplate/*</name>*/ 
    extends /*<extends>*/CPTemplate/*</extends>*/ 
    /*<implements>*/implements CPBarButtonProviding/*</implements>*/ {

    /*<ptr>*/public static class CPContactTemplatePtr extends Ptr<CPContactTemplate, CPContactTemplatePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CPContactTemplate.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CPContactTemplate() {}
    protected CPContactTemplate(Handle h, long handle) { super(h, handle); }
    protected CPContactTemplate(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithContact:")
    public CPContactTemplate(CPContact contact) { super((SkipInit) null); initObject(init(contact)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "contact")
    public native CPContact getContact();
    @Property(selector = "setContact:")
    public native void setContact(CPContact v);
    @Property(selector = "leadingNavigationBarButtons")
    public native NSArray<CPBarButton> getLeadingNavigationBarButtons();
    @Property(selector = "setLeadingNavigationBarButtons:")
    public native void setLeadingNavigationBarButtons(NSArray<CPBarButton> v);
    @Property(selector = "trailingNavigationBarButtons")
    public native NSArray<CPBarButton> getTrailingNavigationBarButtons();
    @Property(selector = "setTrailingNavigationBarButtons:")
    public native void setTrailingNavigationBarButtons(NSArray<CPBarButton> v);
    @Property(selector = "backButton")
    public native CPBarButton getBackButton();
    @Property(selector = "setBackButton:")
    public native void setBackButton(CPBarButton v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithContact:")
    protected native @Pointer long init(CPContact contact);
    /*</methods>*/
}
