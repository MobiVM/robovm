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
package org.robovm.apple.scenekit;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.glkit.*;
import org.robovm.apple.spritekit.*;
import org.robovm.apple.opengles.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("SceneKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SCNRenderer/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements SCNSceneRenderer, SCNTechniqueSupport/*</implements>*/ {

    /*<ptr>*/public static class SCNRendererPtr extends Ptr<SCNRenderer, SCNRendererPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SCNRenderer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SCNRenderer() {}
    protected SCNRenderer(Handle h, long handle) { super(h, handle); }
    protected SCNRenderer(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "scene")
    public native SCNScene getScene();
    @Property(selector = "setScene:")
    public native void setScene(SCNScene v);
    @Property(selector = "nextFrameTime")
    public native double getNextFrameTime();
    @Property(selector = "sceneTime")
    public native double getSceneTime();
    @Property(selector = "setSceneTime:")
    public native void setSceneTime(double v);
    @Property(selector = "delegate")
    public native SCNSceneRendererDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(SCNSceneRendererDelegate v);
    @Property(selector = "isPlaying")
    public native boolean isPlaying();
    @Property(selector = "setPlaying:")
    public native void setPlaying(boolean v);
    @Property(selector = "loops")
    public native boolean loops();
    @Property(selector = "setLoops:")
    public native void setLoops(boolean v);
    @Property(selector = "pointOfView")
    public native SCNNode getPointOfView();
    @Property(selector = "setPointOfView:")
    public native void setPointOfView(SCNNode v);
    @Property(selector = "autoenablesDefaultLighting")
    public native boolean autoenablesDefaultLighting();
    @Property(selector = "setAutoenablesDefaultLighting:")
    public native void setAutoenablesDefaultLighting(boolean v);
    @Property(selector = "isJitteringEnabled")
    public native boolean isJitteringEnabled();
    @Property(selector = "setJitteringEnabled:")
    public native void setJitteringEnabled(boolean v);
    @Property(selector = "showsStatistics")
    public native boolean showsStatistics();
    @Property(selector = "setShowsStatistics:")
    public native void setShowsStatistics(boolean v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "debugOptions")
    public native SCNDebugOptions getDebugOptions();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setDebugOptions:")
    public native void setDebugOptions(SCNDebugOptions v);
    @WeaklyLinked
    @Property(selector = "overlaySKScene")
    public native SKScene getOverlaySKScene();
    @WeaklyLinked
    @Property(selector = "setOverlaySKScene:")
    public native void setOverlaySKScene(SKScene v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "renderingAPI")
    public native SCNRenderingAPI getRenderingAPI();
    @WeaklyLinked
    @Property(selector = "context")
    public native EAGLContext getContext();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "currentRenderCommandEncoder")
    public native MTLRenderCommandEncoder getCurrentRenderCommandEncoder();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "device")
    public native MTLDevice getDevice();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "colorPixelFormat")
    public native MTLPixelFormat getColorPixelFormat();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "depthPixelFormat")
    public native MTLPixelFormat getDepthPixelFormat();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "stencilPixelFormat")
    public native MTLPixelFormat getStencilPixelFormat();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "commandQueue")
    public native MTLCommandQueue getCommandQueue();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "audioEngine")
    public native AVAudioEngine getAudioEngine();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "audioEnvironmentNode")
    public native AVAudioEnvironmentNode getAudioEnvironmentNode();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "audioListener")
    public native SCNNode getAudioListener();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setAudioListener:")
    public native void setAudioListener(SCNNode v);
    @Property(selector = "technique")
    public native SCNTechnique getTechnique();
    @Property(selector = "setTechnique:")
    public native void setTechnique(SCNTechnique v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "renderAtTime:viewport:commandBuffer:passDescriptor:")
    public native void renderAtTime(double time, @ByVal CGRect viewport, MTLCommandBuffer commandBuffer, MTLRenderPassDescriptor renderPassDescriptor);
    @Method(selector = "renderAtTime:")
    public native void renderAtTime(double time);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "updateAtTime:")
    public native void updateAtTime(double time);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "renderWithViewport:commandBuffer:passDescriptor:")
    public native void renderWithViewport(@ByVal CGRect viewport, MTLCommandBuffer commandBuffer, MTLRenderPassDescriptor renderPassDescriptor);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "snapshotAtTime:withSize:antialiasingMode:")
    public native UIImage snapshotAtTime(double time, @ByVal CGSize size, SCNAntialiasingMode antialiasingMode);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "updateProbes:atTime:")
    public native void updateProbes(NSArray<SCNNode> lightProbes, double time);
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    @Method(selector = "render")
    public native void render();
    @Method(selector = "rendererWithContext:options:")
    public static native SCNRenderer create(EAGLContext context, NSDictionary<?, ?> options);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "rendererWithDevice:options:")
    public static native SCNRenderer create(MTLDevice device, NSDictionary<?, ?> options);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "presentScene:withTransition:incomingPointOfView:completionHandler:")
    public native void presentScene(SCNScene scene, SKTransition transition, SCNNode pointOfView, @Block Runnable completionHandler);
    @Method(selector = "hitTest:options:")
    public native NSArray<SCNHitTestResult> hitTest(@ByVal CGPoint point, SCNHitTestOptions options);
    @Method(selector = "isNodeInsideFrustum:withPointOfView:")
    public native boolean isNodeInsideFrustum(SCNNode node, SCNNode pointOfView);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "nodesInsideFrustumWithPointOfView:")
    public native NSArray<SCNNode> getNodesInsideFrustum(SCNNode pointOfView);
    @Method(selector = "projectPoint:")
    public native @ByVal SCNVector3 projectPoint(@ByVal SCNVector3 point);
    @Method(selector = "unprojectPoint:")
    public native @ByVal SCNVector3 unprojectPoint(@ByVal SCNVector3 point);
    @Method(selector = "prepareObject:shouldAbortBlock:")
    public native boolean prepareObject(NSObject object, @Block BooleanBlock block);
    @Method(selector = "prepareObjects:withCompletionHandler:")
    public native void prepareObjects(NSArray<?> objects, @Block VoidBooleanBlock completionHandler);
    /*</methods>*/
}
