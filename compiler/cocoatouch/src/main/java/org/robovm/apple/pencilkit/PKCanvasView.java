/*
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
package org.robovm.apple.pencilkit;

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
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("PencilKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PKCanvasView/*</name>*/ 
    extends /*<extends>*/UIScrollView/*</extends>*/ 
    /*<implements>*/implements PKToolPickerObserver/*</implements>*/ {

    /*<ptr>*/public static class PKCanvasViewPtr extends Ptr<PKCanvasView, PKCanvasViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PKCanvasView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PKCanvasView() {}
    protected PKCanvasView(Handle h, long handle) { super(h, handle); }
    protected PKCanvasView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public PKCanvasView(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public PKCanvasView(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native PKCanvasViewDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(PKCanvasViewDelegate v);
    @Property(selector = "drawing")
    public native PKDrawing getDrawing();
    @Property(selector = "setDrawing:")
    public native void setDrawing(PKDrawing v);
    @Property(selector = "tool")
    public native PKTool getTool();
    @Property(selector = "setTool:")
    public native void setTool(PKTool v);
    @Property(selector = "isRulerActive")
    public native boolean isRulerActive();
    @Property(selector = "setRulerActive:")
    public native void setRulerActive(boolean v);
    @Property(selector = "drawingGestureRecognizer")
    public native UIGestureRecognizer getDrawingGestureRecognizer();
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use 'drawingPolicy' property.
     */
    @Deprecated
    @Property(selector = "allowsFingerDrawing")
    public native boolean allowsFingerDrawing();
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use 'drawingPolicy' property.
     */
    @Deprecated
    @Property(selector = "setAllowsFingerDrawing:")
    public native void setAllowsFingerDrawing(boolean v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "drawingPolicy")
    public native PKCanvasViewDrawingPolicy getDrawingPolicy();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setDrawingPolicy:")
    public native void setDrawingPolicy(PKCanvasViewDrawingPolicy v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "maximumSupportedContentVersion")
    public native PKContentVersion getMaximumSupportedContentVersion();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setMaximumSupportedContentVersion:")
    public native void setMaximumSupportedContentVersion(PKContentVersion v);
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
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
    @Method(selector = "toolPickerSelectedToolDidChange:")
    public native void toolPickerSelectedToolDidChange(PKToolPicker toolPicker);
    @Method(selector = "toolPickerIsRulerActiveDidChange:")
    public native void toolPickerIsRulerActiveDidChange(PKToolPicker toolPicker);
    @Method(selector = "toolPickerVisibilityDidChange:")
    public native void toolPickerVisibilityDidChange(PKToolPicker toolPicker);
    @Method(selector = "toolPickerFramesObscuredDidChange:")
    public native void toolPickerFramesObscuredDidChange(PKToolPicker toolPicker);
    /*</methods>*/
}
