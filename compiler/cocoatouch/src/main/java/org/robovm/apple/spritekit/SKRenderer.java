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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("SpriteKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SKRenderer/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SKRendererPtr extends Ptr<SKRenderer, SKRendererPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SKRenderer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SKRenderer() {}
    protected SKRenderer(Handle h, long handle) { super(h, handle); }
    protected SKRenderer(SkipInit skipInit) { super(skipInit); }
    public SKRenderer(MTLDevice device) { super((Handle) null, create(device)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "scene")
    public native SKScene getScene();
    @Property(selector = "setScene:")
    public native void setScene(SKScene v);
    @Property(selector = "ignoresSiblingOrder")
    public native boolean ignoresSiblingOrder();
    @Property(selector = "setIgnoresSiblingOrder:")
    public native void setIgnoresSiblingOrder(boolean v);
    @Property(selector = "shouldCullNonVisibleNodes")
    public native boolean shouldCullNonVisibleNodes();
    @Property(selector = "setShouldCullNonVisibleNodes:")
    public native void setShouldCullNonVisibleNodes(boolean v);
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
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "renderWithViewport:commandBuffer:renderPassDescriptor:")
    public native void render(@ByVal CGRect viewport, MTLCommandBuffer commandBuffer, MTLRenderPassDescriptor renderPassDescriptor);
    @Method(selector = "renderWithViewport:renderCommandEncoder:renderPassDescriptor:commandQueue:")
    public native void render(@ByVal CGRect viewport, MTLRenderCommandEncoder renderCommandEncoder, MTLRenderPassDescriptor renderPassDescriptor, MTLCommandQueue commandQueue);
    @Method(selector = "updateAtTime:")
    public native void updateAtTime(double currentTime);
    @Method(selector = "rendererWithDevice:")
    protected static native @Pointer long create(MTLDevice device);
    /*</methods>*/
}
