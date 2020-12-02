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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPTabBarTemplate/*</name>*/ 
    extends /*<extends>*/CPTemplate/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CPTabBarTemplatePtr extends Ptr<CPTabBarTemplate, CPTabBarTemplatePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CPTabBarTemplate.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CPTabBarTemplate() {}
    protected CPTabBarTemplate(Handle h, long handle) { super(h, handle); }
    protected CPTabBarTemplate(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTemplates:")
    public CPTabBarTemplate(NSArray<CPTemplate> templates) { super((SkipInit) null); initObject(init(templates)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native CPTabBarTemplateDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(CPTabBarTemplateDelegate v);
    @Property(selector = "maximumTabCount")
    public static native @MachineSizedUInt long getMaximumTabCount();
    @Property(selector = "templates")
    public native NSArray<CPTemplate> getTemplates();
    @Property(selector = "selectedTemplate")
    public native CPTemplate getSelectedTemplate();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTemplates:")
    protected native @Pointer long init(NSArray<CPTemplate> templates);
    @Method(selector = "updateTemplates:")
    public native void updateTemplates(NSArray<CPTemplate> newTemplates);
    /*</methods>*/
}
