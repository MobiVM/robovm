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
package org.robovm.apple.glkit;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.opengles.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.modelio.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @deprecated Deprecated in iOS 12.0. OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
 */
/*</javadoc>*/
/*<annotations>*/@Library("GLKit") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GLKView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*/implements NSCoding/*</implements>*/ {

    /*<ptr>*/public static class GLKViewPtr extends Ptr<GLKView, GLKViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GLKView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GLKView() {}
    protected GLKView(Handle h, long handle) { super(h, handle); }
    protected GLKView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:context:")
    public GLKView(@ByVal CGRect frame, EAGLContext context) { super((SkipInit) null); initObject(init(frame, context)); }
    @Method(selector = "initWithFrame:")
    public GLKView(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public GLKView(NSCoder coder) { super(coder); }
    /*</constructors>*/

    /*<properties>*/
    @Property(selector = "delegate")
    public native GLKViewDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(GLKViewDelegate v);
    @Property(selector = "context")
    public native EAGLContext getContext();
    @Property(selector = "setContext:")
    public native void setContext(EAGLContext v);
    @Property(selector = "drawableWidth")
    public native @MachineSizedSInt long getDrawableWidth();
    @Property(selector = "drawableHeight")
    public native @MachineSizedSInt long getDrawableHeight();
    @Property(selector = "drawableColorFormat")
    public native GLKViewDrawableColorFormat getDrawableColorFormat();
    @Property(selector = "setDrawableColorFormat:")
    public native void setDrawableColorFormat(GLKViewDrawableColorFormat v);
    @Property(selector = "drawableDepthFormat")
    public native GLKViewDrawableDepthFormat getDrawableDepthFormat();
    @Property(selector = "setDrawableDepthFormat:")
    public native void setDrawableDepthFormat(GLKViewDrawableDepthFormat v);
    @Property(selector = "drawableStencilFormat")
    public native GLKViewDrawableStencilFormat getDrawableStencilFormat();
    @Property(selector = "setDrawableStencilFormat:")
    public native void setDrawableStencilFormat(GLKViewDrawableStencilFormat v);
    @Property(selector = "drawableMultisample")
    public native GLKViewDrawableMultisample getDrawableMultisample();
    @Property(selector = "setDrawableMultisample:")
    public native void setDrawableMultisample(GLKViewDrawableMultisample v);
    @Property(selector = "snapshot")
    public native UIImage getSnapshot();
    @Property(selector = "enableSetNeedsDisplay")
    public native boolean enablesSetNeedsDisplay();
    @Property(selector = "setEnableSetNeedsDisplay:")
    public native void setEnablesSetNeedsDisplay(boolean v);
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithFrame:context:")
    protected native @Pointer long init(@ByVal CGRect frame, EAGLContext context);
    @Method(selector = "bindDrawable")
    public native void bindDrawable();
    @Method(selector = "deleteDrawable")
    public native void deleteDrawable();
    @Method(selector = "display")
    public native void display();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute attribute);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:relativeToLayoutDirection:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute semanticContentAttribute, UIUserInterfaceLayoutDirection layoutDirection);
    /*</methods>*/
}
