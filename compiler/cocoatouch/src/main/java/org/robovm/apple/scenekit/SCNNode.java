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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SCNNode/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding, SCNAnimatable, SCNActionable, SCNBoundingVolume, UIFocusItem/*</implements>*/ {

    /*<ptr>*/public static class SCNNodePtr extends Ptr<SCNNode, SCNNodePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SCNNode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SCNNode() {}
    protected SCNNode(Handle h, long handle) { super(h, handle); }
    protected SCNNode(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public SCNNode(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "setName:")
    public native void setName(String v);
    @Property(selector = "light")
    public native SCNLight getLight();
    @Property(selector = "setLight:")
    public native void setLight(SCNLight v);
    @Property(selector = "camera")
    public native SCNCamera getCamera();
    @Property(selector = "setCamera:")
    public native void setCamera(SCNCamera v);
    @Property(selector = "geometry")
    public native SCNGeometry getGeometry();
    @Property(selector = "setGeometry:")
    public native void setGeometry(SCNGeometry v);
    @Property(selector = "skinner")
    public native SCNSkinner getSkinner();
    @Property(selector = "setSkinner:")
    public native void setSkinner(SCNSkinner v);
    @Property(selector = "morpher")
    public native SCNMorpher getMorpher();
    @Property(selector = "setMorpher:")
    public native void setMorpher(SCNMorpher v);
    @Property(selector = "transform")
    public native @ByVal SCNMatrix4 getTransform();
    @Property(selector = "setTransform:")
    public native void setTransform(@ByVal SCNMatrix4 v);
    @Property(selector = "worldTransform")
    public native @ByVal SCNMatrix4 getWorldTransform();
    @Property(selector = "setWorldTransform:")
    public native void setWorldTransform(@ByVal SCNMatrix4 v);
    @Property(selector = "position")
    public native @ByVal SCNVector3 getPosition();
    @Property(selector = "setPosition:")
    public native void setPosition(@ByVal SCNVector3 v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "worldPosition")
    public native @ByVal SCNVector3 getWorldPosition();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setWorldPosition:")
    public native void setWorldPosition(@ByVal SCNVector3 v);
    @Property(selector = "rotation")
    public native @ByVal SCNVector4 getRotation();
    @Property(selector = "setRotation:")
    public native void setRotation(@ByVal SCNVector4 v);
    @Property(selector = "orientation")
    public native @ByVal SCNVector4 getOrientation();
    @Property(selector = "setOrientation:")
    public native void setOrientation(@ByVal SCNVector4 v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "worldOrientation")
    public native @ByVal SCNVector4 getWorldOrientation();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setWorldOrientation:")
    public native void setWorldOrientation(@ByVal SCNVector4 v);
    @Property(selector = "eulerAngles")
    public native @ByVal SCNVector3 getEulerAngles();
    @Property(selector = "setEulerAngles:")
    public native void setEulerAngles(@ByVal SCNVector3 v);
    @Property(selector = "scale")
    public native @ByVal SCNVector3 getScale();
    @Property(selector = "setScale:")
    public native void setScale(@ByVal SCNVector3 v);
    @Property(selector = "pivot")
    public native @ByVal SCNMatrix4 getPivot();
    @Property(selector = "setPivot:")
    public native void setPivot(@ByVal SCNMatrix4 v);
    @Property(selector = "isHidden")
    public native boolean isHidden();
    @Property(selector = "setHidden:")
    public native void setHidden(boolean v);
    @Property(selector = "opacity")
    public native @MachineSizedFloat double getOpacity();
    @Property(selector = "setOpacity:")
    public native void setOpacity(@MachineSizedFloat double v);
    @Property(selector = "renderingOrder")
    public native @MachineSizedSInt long getRenderingOrder();
    @Property(selector = "setRenderingOrder:")
    public native void setRenderingOrder(@MachineSizedSInt long v);
    @Property(selector = "castsShadow")
    public native boolean castsShadow();
    @Property(selector = "setCastsShadow:")
    public native void setCastsShadow(boolean v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "movabilityHint")
    public native SCNMovabilityHint getMovabilityHint();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setMovabilityHint:")
    public native void setMovabilityHint(SCNMovabilityHint v);
    @Property(selector = "parentNode")
    public native SCNNode getParentNode();
    @Property(selector = "childNodes")
    public native NSArray<SCNNode> getChildNodes();
    @Property(selector = "physicsBody")
    public native SCNPhysicsBody getPhysicsBody();
    @Property(selector = "setPhysicsBody:")
    public native void setPhysicsBody(SCNPhysicsBody v);
    @Property(selector = "physicsField")
    public native SCNPhysicsField getPhysicsField();
    @Property(selector = "setPhysicsField:")
    public native void setPhysicsField(SCNPhysicsField v);
    @Property(selector = "constraints")
    public native NSArray<SCNConstraint> getConstraints();
    @Property(selector = "setConstraints:")
    public native void setConstraints(NSArray<SCNConstraint> v);
    @Property(selector = "filters")
    public native NSArray<org.robovm.apple.coreimage.CIFilter> getFilters();
    @Property(selector = "setFilters:")
    public native void setFilters(NSArray<org.robovm.apple.coreimage.CIFilter> v);
    @Property(selector = "presentationNode")
    public native SCNNode getPresentationNode();
    @Property(selector = "isPaused")
    public native boolean isPaused();
    @Property(selector = "setPaused:")
    public native void setPaused(boolean v);
    @Property(selector = "rendererDelegate")
    public native SCNNodeRendererDelegate getRendererDelegate();
    @Property(selector = "setRendererDelegate:", strongRef = true)
    public native void setRendererDelegate(SCNNodeRendererDelegate v);
    @Property(selector = "categoryBitMask")
    public native @MachineSizedUInt long getCategoryBitMask();
    @Property(selector = "setCategoryBitMask:")
    public native void setCategoryBitMask(@MachineSizedUInt long v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "focusBehavior")
    public native SCNNodeFocusBehavior getFocusBehavior();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setFocusBehavior:")
    public native void setFocusBehavior(SCNNodeFocusBehavior v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "localUp")
    public static native @ByVal SCNVector3 getLocalUp();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "localRight")
    public static native @ByVal SCNVector3 getLocalRight();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "localFront")
    public static native @ByVal SCNVector3 getLocalFront();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "worldUp")
    public native @ByVal SCNVector3 getWorldUp();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "worldRight")
    public native @ByVal SCNVector3 getWorldRight();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "worldFront")
    public native @ByVal SCNVector3 getWorldFront();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "simdTransform")
    public native @ByVal MatrixFloat4x4 getSimdTransform();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setSimdTransform:")
    public native void setSimdTransform(@ByVal MatrixFloat4x4 v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "simdPosition")
    public native @ByVal VectorFloat3 getSimdPosition();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setSimdPosition:")
    public native void setSimdPosition(@ByVal VectorFloat3 v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "simdRotation")
    public native @ByVal VectorFloat4 getSimdRotation();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setSimdRotation:")
    public native void setSimdRotation(@ByVal VectorFloat4 v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "simdOrientation")
    public native @ByVal VectorFloat4 getSimdOrientation();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setSimdOrientation:")
    public native void setSimdOrientation(@ByVal VectorFloat4 v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "simdEulerAngles")
    public native @ByVal VectorFloat3 getSimdEulerAngles();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setSimdEulerAngles:")
    public native void setSimdEulerAngles(@ByVal VectorFloat3 v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "simdScale")
    public native @ByVal VectorFloat3 getSimdScale();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setSimdScale:")
    public native void setSimdScale(@ByVal VectorFloat3 v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "simdPivot")
    public native @ByVal MatrixFloat4x4 getSimdPivot();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setSimdPivot:")
    public native void setSimdPivot(@ByVal MatrixFloat4x4 v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "simdWorldPosition")
    public native @ByVal VectorFloat3 getSimdWorldPosition();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setSimdWorldPosition:")
    public native void setSimdWorldPosition(@ByVal VectorFloat3 v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "simdWorldOrientation")
    public native @ByVal VectorFloat4 getSimdWorldOrientation();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setSimdWorldOrientation:")
    public native void setSimdWorldOrientation(@ByVal VectorFloat4 v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "simdWorldTransform")
    public native @ByVal MatrixFloat4x4 getSimdWorldTransform();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setSimdWorldTransform:")
    public native void setSimdWorldTransform(@ByVal MatrixFloat4x4 v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "simdLocalUp")
    public static native @ByVal VectorFloat3 getSimdLocalUp();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "simdLocalRight")
    public static native @ByVal VectorFloat3 getSimdLocalRight();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "simdLocalFront")
    public static native @ByVal VectorFloat3 getSimdLocalFront();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "simdWorldUp")
    public native @ByVal VectorFloat3 getSimdWorldUp();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "simdWorldRight")
    public native @ByVal VectorFloat3 getSimdWorldRight();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "simdWorldFront")
    public native @ByVal VectorFloat3 getSimdWorldFront();
    @Property(selector = "particleSystems")
    public native NSArray<SCNParticleSystem> getParticleSystems();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "audioPlayers")
    public native NSArray<SCNAudioPlayer> getAudioPlayers();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    @Property(selector = "animationKeys")
    public native NSArray<NSString> getAnimationKeys();
    @Property(selector = "hasActions")
    public native boolean hasActions();
    @Property(selector = "actionKeys")
    public native NSArray<NSString> getActionKeys();
    @Property(selector = "canBecomeFocused")
    public native boolean canBecomeFocused();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "frame")
    public native @ByVal CGRect getFrame();
    @Property(selector = "preferredFocusEnvironments")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsListMarshaler.class) List<UIFocusEnvironment> getPreferredFocusEnvironments();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "parentFocusEnvironment")
    public native UIFocusEnvironment getParentFocusEnvironment();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "focusItemContainer")
    public native UIFocusItemContainer getFocusItemContainer();
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 10.0. Use -preferredFocusEnvironments instead.
     */
    @Deprecated
    @Property(selector = "preferredFocusedView")
    public native UIView getPreferredFocusedView();
    /*</properties>*/
    /*<members>*//*</members>*/
    public SCNVector3 getBoundingBoxMin() {
        SCNVector3.SCNVector3Ptr ptr = new SCNVector3.SCNVector3Ptr();
        boolean result = getBoundingBox(ptr, null);
        if (result) {
            return ptr.get();
        }
        return null;
    }
    public SCNVector3 getBoundingBoxMax() {
        SCNVector3.SCNVector3Ptr ptr = new SCNVector3.SCNVector3Ptr();
        boolean result = getBoundingBox(null, ptr);
        if (result) {
            return ptr.get();
        }
        return null;
    }
    public SCNVector3 getBoundingSphereCenter() {
        SCNVector3.SCNVector3Ptr ptr = new SCNVector3.SCNVector3Ptr();
        boolean result = getBoundingSphere(ptr, null);
        if (result) {
            return ptr.get();
        }
        return null;
    }
    public double getBoundingSphereRadius() {
        MachineSizedFloatPtr ptr = new MachineSizedFloatPtr();
        boolean result = getBoundingSphere(null, ptr);
        if (result) {
            return ptr.get();
        }
        return 0;
    }
    public void setBoundingBox(SCNVector3 min, SCNVector3 max) {
        SCNVector3.SCNVector3Ptr minptr = new SCNVector3.SCNVector3Ptr();
        minptr.set(min);
        SCNVector3.SCNVector3Ptr maxptr = new SCNVector3.SCNVector3Ptr();
        maxptr.set(max);
        setBoundingBox(minptr, maxptr);
    }
    /*<methods>*/
    @Method(selector = "addChildNode:")
    public native void addChildNode(SCNNode child);
    @Method(selector = "insertChildNode:atIndex:")
    public native void insertChildNode(SCNNode child, @MachineSizedUInt long index);
    @Method(selector = "removeFromParentNode")
    public native void removeFromParentNode();
    @Method(selector = "replaceChildNode:with:")
    public native void replaceChildNode(SCNNode oldChild, SCNNode newChild);
    @Method(selector = "childNodeWithName:recursively:")
    public native SCNNode findChildNodeWithName(String name, boolean recursively);
    @Method(selector = "childNodesPassingTest:")
    public native NSArray<SCNNode> getChildNodesPassingTest(@Block Block2<SCNNode, BooleanPtr, Boolean> predicate);
    @Method(selector = "enumerateChildNodesUsingBlock:")
    public native void enumerateChildNodes(@Block VoidBlock2<SCNNode, BooleanPtr> block);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "enumerateHierarchyUsingBlock:")
    public native void enumerateHierarchyUsingBlock(@Block VoidBlock2<SCNNode, BooleanPtr> block);
    @Method(selector = "convertPosition:toNode:")
    public native @ByVal SCNVector3 convertPositionToNode(@ByVal SCNVector3 position, SCNNode node);
    @Method(selector = "convertPosition:fromNode:")
    public native @ByVal SCNVector3 convertPositionFromNode(@ByVal SCNVector3 position, SCNNode node);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "convertVector:toNode:")
    public native @ByVal SCNVector3 convertVector(@ByVal SCNVector3 vector, SCNNode node);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "convertVector:fromNode:")
    public native @ByVal SCNVector3 convertVector$fromNode$(@ByVal SCNVector3 vector, SCNNode node);
    @Method(selector = "convertTransform:toNode:")
    public native @ByVal SCNMatrix4 convertTransformToNode(@ByVal SCNMatrix4 transform, SCNNode node);
    @Method(selector = "convertTransform:fromNode:")
    public native @ByVal SCNMatrix4 convertTransformFromNode(@ByVal SCNMatrix4 transform, SCNNode node);
    @Method(selector = "hitTestWithSegmentFromPoint:toPoint:options:")
    public native NSArray<SCNHitTestResult> hitTestWithSegment(@ByVal SCNVector3 pointA, @ByVal SCNVector3 pointB, SCNHitTestOptions options);
    @Method(selector = "node")
    public static native SCNNode create();
    @Method(selector = "nodeWithGeometry:")
    public static native SCNNode create(SCNGeometry geometry);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "lookAt:")
    public native void lookAt(@ByVal SCNVector3 worldTarget);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "lookAt:up:localFront:")
    public native void lookAt$up$localFront$(@ByVal SCNVector3 worldTarget, @ByVal SCNVector3 worldUp, @ByVal SCNVector3 localFront);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "localTranslateBy:")
    public native void localTranslateBy(@ByVal SCNVector3 translation);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "localRotateBy:")
    public native void localRotateBy(@ByVal SCNVector4 rotation);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "rotateBy:aroundTarget:")
    public native void rotate(@ByVal SCNVector4 worldRotation, @ByVal SCNVector3 worldTarget);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "simdConvertPosition:toNode:")
    public native @ByVal VectorFloat3 simdConvertPositionToNode(@ByVal VectorFloat3 position, SCNNode node);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "simdConvertPosition:fromNode:")
    public native @ByVal VectorFloat3 simdConvertPositionFromNode(@ByVal VectorFloat3 position, SCNNode node);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "simdConvertVector:toNode:")
    public native @ByVal VectorFloat3 simdConvertVectorToNode(@ByVal VectorFloat3 vector, SCNNode node);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "simdConvertVector:fromNode:")
    public native @ByVal VectorFloat3 simdConvertVectorFromNode(@ByVal VectorFloat3 vector, SCNNode node);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "simdConvertTransform:toNode:")
    public native @ByVal MatrixFloat4x4 simdConvertTransformTtoNode(@ByVal MatrixFloat4x4 transform, SCNNode node);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "simdConvertTransform:fromNode:")
    public native @ByVal MatrixFloat4x4 simdConvertTransformFromNode(@ByVal MatrixFloat4x4 transform, SCNNode node);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "simdLookAt:")
    public native void simdLookAt(@ByVal VectorFloat3 worldTarget);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "simdLookAt:up:localFront:")
    public native void simdLook(@ByVal VectorFloat3 worldTarget, @ByVal VectorFloat3 worldUp, @ByVal VectorFloat3 localFront);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "simdLocalTranslateBy:")
    public native void simdLocalTranslateBy(@ByVal VectorFloat3 translation);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "simdLocalRotateBy:")
    public native void simdLocalRotateBy(@ByVal VectorFloat4 rotation);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "simdRotateBy:aroundTarget:")
    public native void simdRotate(@ByVal VectorFloat4 worldRotation, @ByVal VectorFloat3 worldTarget);
    @Method(selector = "addParticleSystem:")
    public native void addParticleSystem(SCNParticleSystem system);
    @Method(selector = "removeAllParticleSystems")
    public native void removeAllParticleSystems();
    @Method(selector = "removeParticleSystem:")
    public native void removeParticleSystem(SCNParticleSystem system);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "addAudioPlayer:")
    public native void addAudioPlayer(SCNAudioPlayer player);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "removeAllAudioPlayers")
    public native void removeAllAudioPlayers();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "removeAudioPlayer:")
    public native void removeAudioPlayer(SCNAudioPlayer player);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    @Method(selector = "addAnimation:forKey:")
    public native void addAnimation(SCNAnimation animation, String key);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "addAnimationPlayer:forKey:")
    public native void addAnimationPlayer(SCNAnimationPlayer player, String key);
    @Method(selector = "removeAllAnimations")
    public native void removeAllAnimations();
    @Method(selector = "removeAnimationForKey:")
    public native void removeAnimation(String key);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "animationPlayerForKey:")
    public native SCNAnimationPlayer animationPlayerForKey(String key);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "removeAnimationForKey:blendOutDuration:")
    public native void removeAnimationForKey(String key, @MachineSizedFloat double duration);
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 11.0.
     */
    @Deprecated
    @Method(selector = "removeAnimationForKey:fadeOutDuration:")
    public native void removeAnimation(String key, @MachineSizedFloat double duration);
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 11.0.
     */
    @Deprecated
    @Method(selector = "animationForKey:")
    public native CAAnimation getAnimation(String key);
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use -[SCNAnimationPlayer setPaused:] instead
     */
    @Deprecated
    @Method(selector = "pauseAnimationForKey:")
    public native void pauseAnimation(String key);
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use -[SCNAnimationPlayer setPaused:] instead
     */
    @Deprecated
    @Method(selector = "resumeAnimationForKey:")
    public native void resumeAnimation(String key);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use -[SCNAnimationPlayer setSpeed:] instead
     */
    @Deprecated
    @Method(selector = "setSpeed:forAnimationKey:")
    public native void setSpeed(@MachineSizedFloat double speed, String key);
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use -[SCNAnimationPlayer paused] instead
     */
    @Deprecated
    @Method(selector = "isAnimationForKeyPaused:")
    public native boolean isAnimationPaused(String key);
    @Method(selector = "runAction:")
    public native void runAction(SCNAction action);
    @Method(selector = "runAction:completionHandler:")
    public native void runAction(SCNAction action, @Block Runnable block);
    @Method(selector = "runAction:forKey:")
    public native void runAction(SCNAction action, String key);
    @Method(selector = "runAction:forKey:completionHandler:")
    public native void runAction(SCNAction action, String key, @Block Runnable block);
    @Method(selector = "actionForKey:")
    public native SCNAction getAction(String key);
    @Method(selector = "removeActionForKey:")
    public native void removeAction(String key);
    @Method(selector = "removeAllActions")
    public native void removeAllActions();
    @Method(selector = "getBoundingBoxMin:max:")
    public native boolean getBoundingBox(SCNVector3.SCNVector3Ptr min, SCNVector3.SCNVector3Ptr max);
    @Method(selector = "setBoundingBoxMin:max:")
    public native void setBoundingBox(SCNVector3.SCNVector3Ptr min, SCNVector3.SCNVector3Ptr max);
    @Method(selector = "getBoundingSphereCenter:radius:")
    public native boolean getBoundingSphere(SCNVector3.SCNVector3Ptr center, MachineSizedFloatPtr radius);
    @Method(selector = "didHintFocusMovement:")
    public native void didHintFocusMovement(UIFocusMovementHint hint);
    @Method(selector = "setNeedsFocusUpdate")
    public native void setNeedsFocusUpdate();
    @Method(selector = "updateFocusIfNeeded")
    public native void updateFocusIfNeeded();
    @Method(selector = "shouldUpdateFocusInContext:")
    public native boolean shouldUpdateFocus(UIFocusUpdateContext context);
    @Method(selector = "didUpdateFocusInContext:withAnimationCoordinator:")
    public native void didUpdateFocus(UIFocusUpdateContext context, UIFocusAnimationCoordinator coordinator);
    /*</methods>*/
}
