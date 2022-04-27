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
package org.robovm.apple.arkit;

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
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.scenekit.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.spritekit.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.imageio.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ARKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ARSKView/*</name>*/ 
    extends /*<extends>*/SKView/*</extends>*/ 
    /*<implements>*/implements ARSessionProviding/*</implements>*/ {

    /*<ptr>*/public static class ARSKViewPtr extends Ptr<ARSKView, ARSKViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ARSKView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ARSKView() {}
    protected ARSKView(Handle h, long handle) { super(h, handle); }
    protected ARSKView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public ARSKView(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public ARSKView(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native ARSKViewDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(ARSKViewDelegate v);
    @Property(selector = "session")
    public native ARSession getSession();
    @Property(selector = "setSession:")
    public native void setSession(ARSession v);
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "anchorForNode:")
    public native ARAnchor anchorForNode(SKNode node);
    @Method(selector = "nodeForAnchor:")
    public native SKNode nodeForAnchor(ARAnchor anchor);
    /**
     * @since Available in iOS 11.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use raycasting
     */
    @Deprecated
    @Method(selector = "hitTest:types:")
    public native NSArray<ARHitTestResult> hitTest(@ByVal CGPoint point, ARHitTestResultType types);
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
