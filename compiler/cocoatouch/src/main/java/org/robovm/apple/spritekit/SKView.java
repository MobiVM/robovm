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
package org.robovm.apple.spritekit;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.glkit.*;
import org.robovm.apple.scenekit.*;
import org.robovm.apple.gameplaykit.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("SpriteKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SKView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SKViewPtr extends Ptr<SKView, SKViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SKView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SKView() {}
    protected SKView(Handle h, long handle) { super(h, handle); }
    protected SKView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public SKView(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public SKView(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isPaused")
    public native boolean isPaused();
    @Property(selector = "setPaused:")
    public native void setPaused(boolean v);
    @Property(selector = "showsFPS")
    public native boolean showsFPS();
    @Property(selector = "setShowsFPS:")
    public native void setShowsFPS(boolean v);
    @Property(selector = "showsDrawCount")
    public native boolean showsDrawCount();
    @Property(selector = "setShowsDrawCount:")
    public native void setShowsDrawCount(boolean v);
    @Property(selector = "showsNodeCount")
    public native boolean showsNodeCount();
    @Property(selector = "setShowsNodeCount:")
    public native void setShowsNodeCount(boolean v);
    @Property(selector = "showsQuadCount")
    public native boolean showsQuadCount();
    @Property(selector = "setShowsQuadCount:")
    public native void setShowsQuadCount(boolean v);
    @Property(selector = "showsPhysics")
    public native boolean showsPhysics();
    @Property(selector = "setShowsPhysics:")
    public native void setShowsPhysics(boolean v);
    @Property(selector = "showsFields")
    public native boolean showsFields();
    @Property(selector = "setShowsFields:")
    public native void setShowsFields(boolean v);
    @Property(selector = "isAsynchronous")
    public native boolean isAsynchronous();
    @Property(selector = "setAsynchronous:")
    public native void setAsynchronous(boolean v);
    @Property(selector = "allowsTransparency")
    public native boolean allowsTransparency();
    @Property(selector = "setAllowsTransparency:")
    public native void setAllowsTransparency(boolean v);
    @Property(selector = "ignoresSiblingOrder")
    public native boolean ignoresSiblingOrder();
    @Property(selector = "setIgnoresSiblingOrder:")
    public native void setIgnoresSiblingOrder(boolean v);
    @Property(selector = "shouldCullNonVisibleNodes")
    public native boolean shouldCullNonVisibleNodes();
    @Property(selector = "setShouldCullNonVisibleNodes:")
    public native void setShouldCullNonVisibleNodes(boolean v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "preferredFramesPerSecond")
    public native @MachineSizedSInt long getPreferredFramesPerSecond();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setPreferredFramesPerSecond:")
    public native void setPreferredFramesPerSecond(@MachineSizedSInt long v);
    @Property(selector = "disableDepthStencilBuffer")
    public native boolean isDisableDepthStencilBuffer();
    @Property(selector = "setDisableDepthStencilBuffer:")
    public native void setDisableDepthStencilBuffer(boolean v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "delegate")
    public native SKViewDelegate getDelegate();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(SKViewDelegate v);
    /**
     * @deprecated Deprecated in iOS 10.0.
     */
    @Deprecated
    @Property(selector = "frameInterval")
    public native @MachineSizedSInt long getFrameInterval();
    /**
     * @deprecated Deprecated in iOS 10.0.
     */
    @Deprecated
    @Property(selector = "setFrameInterval:")
    public native void setFrameInterval(@MachineSizedSInt long v);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 10.0.
     */
    @Deprecated
    @Property(selector = "preferredFrameRate")
    public native float getPreferredFrameRate();
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 10.0.
     */
    @Deprecated
    @Property(selector = "setPreferredFrameRate:")
    public native void setPreferredFrameRate(float v);
    @Property(selector = "scene")
    public native SKScene getScene();
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "presentScene:")
    public native void presentScene(SKScene scene);
    @Method(selector = "presentScene:transition:")
    public native void presentScene(SKScene scene, SKTransition transition);
    @Method(selector = "textureFromNode:")
    public native SKTexture getTextureFromNode(SKNode node);
    @Method(selector = "textureFromNode:crop:")
    public native SKTexture getTextureFromNode(SKNode node, @ByVal CGRect crop);
    @Method(selector = "convertPoint:toScene:")
    public native @ByVal CGPoint convertPointToScene(@ByVal CGPoint point, SKScene scene);
    @Method(selector = "convertPoint:fromScene:")
    public native @ByVal CGPoint convertPointFromScene(@ByVal CGPoint point, SKScene scene);
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
