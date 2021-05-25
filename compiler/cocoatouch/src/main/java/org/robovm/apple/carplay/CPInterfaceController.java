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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPInterfaceController/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CPInterfaceControllerPtr extends Ptr<CPInterfaceController, CPInterfaceControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CPInterfaceController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CPInterfaceController() {}
    protected CPInterfaceController(Handle h, long handle) { super(h, handle); }
    protected CPInterfaceController(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native CPInterfaceControllerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(CPInterfaceControllerDelegate v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "prefersDarkUserInterfaceStyle")
    public native boolean prefersDarkUserInterfaceStyle();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setPrefersDarkUserInterfaceStyle:")
    public native void setPrefersDarkUserInterfaceStyle(boolean v);
    @Property(selector = "presentedTemplate")
    public native CPTemplate getPresentedTemplate();
    @Property(selector = "rootTemplate")
    public native CPTemplate getRootTemplate();
    @Property(selector = "topTemplate")
    public native CPTemplate getTopTemplate();
    @Property(selector = "templates")
    public native NSArray<CPTemplate> getTemplates();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "carTraitCollection")
    public native UITraitCollection getCarTraitCollection();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "setRootTemplate:animated:completion:")
    public native void setRootTemplate(CPTemplate rootTemplate, boolean animated, @Block VoidBlock2<Boolean, NSError> completion);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "pushTemplate:animated:completion:")
    public native void pushTemplate(CPTemplate templateToPush, boolean animated, @Block VoidBlock2<Boolean, NSError> completion);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "popTemplateAnimated:completion:")
    public native void popTemplate(boolean animated, @Block VoidBlock2<Boolean, NSError> completion);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "popToRootTemplateAnimated:completion:")
    public native void popToRootTemplate(boolean animated, @Block VoidBlock2<Boolean, NSError> completion);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "popToTemplate:animated:completion:")
    public native void popToTemplate(CPTemplate targetTemplate, boolean animated, @Block VoidBlock2<Boolean, NSError> completion);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "presentTemplate:animated:completion:")
    public native void presentTemplate(CPTemplate templateToPresent, boolean animated, @Block VoidBlock2<Boolean, NSError> completion);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "dismissTemplateAnimated:completion:")
    public native void dismissTemplate(boolean animated, @Block VoidBlock2<Boolean, NSError> completion);
    /**
     * @since Available in iOS 12.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use -setRootTemplate:animated:completion:
     */
    @Deprecated
    @Method(selector = "setRootTemplate:animated:")
    public native void setRootTemplate(CPTemplate rootTemplate, boolean animated);
    /**
     * @since Available in iOS 12.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use -pushTemplate:animated:completion:
     */
    @Deprecated
    @Method(selector = "pushTemplate:animated:")
    public native void pushTemplate(CPTemplate templateToPush, boolean animated);
    /**
     * @since Available in iOS 12.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use -popTemplateAnimated:completion:
     */
    @Deprecated
    @Method(selector = "popTemplateAnimated:")
    public native void popTemplateAnimated(boolean animated);
    /**
     * @since Available in iOS 12.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use -popToRootTemplateAnimated:completion:
     */
    @Deprecated
    @Method(selector = "popToRootTemplateAnimated:")
    public native void popToRootTemplateAnimated(boolean animated);
    /**
     * @since Available in iOS 12.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use -popToTemplate:animated:completion:
     */
    @Deprecated
    @Method(selector = "popToTemplate:animated:")
    public native void popToTemplate(CPTemplate targetTemplate, boolean animated);
    /**
     * @since Available in iOS 12.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use -presentTemplate:animated:completion:
     */
    @Deprecated
    @Method(selector = "presentTemplate:animated:")
    public native void presentTemplate(CPTemplate templateToPresent, boolean animated);
    /**
     * @since Available in iOS 12.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use -dismissTemplateAnimated:completion:
     */
    @Deprecated
    @Method(selector = "dismissTemplateAnimated:")
    public native void dismissTemplateAnimated(boolean animated);
    /*</methods>*/
}
