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
package org.robovm.apple.coreanimation;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.opengles.*;
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @deprecated Deprecated in iOS 12.0. OpenGLES is deprecated
 */
/*</javadoc>*/
/*<annotations>*/@Library("QuartzCore") @NativeClass @Deprecated @WeaklyLinked/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CAEAGLLayer/*</name>*/ 
    extends /*<extends>*/CALayer/*</extends>*/ 
    /*<implements>*/implements EAGLDrawable/*</implements>*/ {

    /*<ptr>*/public static class CAEAGLLayerPtr extends Ptr<CAEAGLLayer, CAEAGLLayerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CAEAGLLayer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CAEAGLLayer() {}
    protected CAEAGLLayer(Handle h, long handle) { super(h, handle); }
    protected CAEAGLLayer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithLayer:")
    public CAEAGLLayer(CALayer layer) { super(layer); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "presentsWithTransaction")
    public native boolean presentsWithTransaction();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setPresentsWithTransaction:")
    public native void setPresentsWithTransaction(boolean v);
    @Property(selector = "drawableProperties")
    public native EAGLDrawableProperties getDrawableProperties();
    @Property(selector = "setDrawableProperties:")
    public native void setDrawableProperties(EAGLDrawableProperties v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "defaultValueForKey:")
    public static native NSObject getDefaultValue(String key);
    @Method(selector = "needsDisplayForKey:")
    public static native boolean needsDisplay(String key);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "cornerCurveExpansionFactor:")
    public static native @MachineSizedFloat double cornerCurveExpansionFactor(CALayerCornerCurve curve);
    @Method(selector = "defaultActionForKey:")
    public static native CAAction getDefaultAction(String event);
    /*</methods>*/
}
