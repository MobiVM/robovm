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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SCNGeometry/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements SCNAnimatable, SCNBoundingVolume, SCNShadable, NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class SCNGeometryPtr extends Ptr<SCNGeometry, SCNGeometryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SCNGeometry.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SCNGeometry() {}
    protected SCNGeometry(Handle h, long handle) { super(h, handle); }
    protected SCNGeometry(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public SCNGeometry(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "setName:")
    public native void setName(String v);
    @Property(selector = "materials")
    public native NSArray<SCNMaterial> getMaterials();
    @Property(selector = "setMaterials:")
    public native void setMaterials(NSArray<SCNMaterial> v);
    @Property(selector = "firstMaterial")
    public native SCNMaterial getFirstMaterial();
    @Property(selector = "setFirstMaterial:")
    public native void setFirstMaterial(SCNMaterial v);
    @Property(selector = "geometrySources")
    public native NSArray<SCNGeometrySource> getGeometrySources();
    @Property(selector = "geometryElements")
    public native NSArray<SCNGeometryElement> getGeometryElements();
    @Property(selector = "geometryElementCount")
    public native @MachineSizedSInt long getGeometryElementCount();
    @Property(selector = "levelsOfDetail")
    public native NSArray<SCNLevelOfDetail> getLevelsOfDetail();
    @Property(selector = "setLevelsOfDetail:")
    public native void setLevelsOfDetail(NSArray<SCNLevelOfDetail> v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "tessellator")
    public native SCNGeometryTessellator getTessellator();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setTessellator:")
    public native void setTessellator(SCNGeometryTessellator v);
    @Property(selector = "subdivisionLevel")
    public native @MachineSizedUInt long getSubdivisionLevel();
    @Property(selector = "setSubdivisionLevel:")
    public native void setSubdivisionLevel(@MachineSizedUInt long v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "wantsAdaptiveSubdivision")
    public native boolean wantsAdaptiveSubdivision();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setWantsAdaptiveSubdivision:")
    public native void setWantsAdaptiveSubdivision(boolean v);
    @Property(selector = "edgeCreasesElement")
    public native SCNGeometryElement getEdgeCreasesElement();
    @Property(selector = "setEdgeCreasesElement:")
    public native void setEdgeCreasesElement(SCNGeometryElement v);
    @Property(selector = "edgeCreasesSource")
    public native SCNGeometrySource getEdgeCreasesSource();
    @Property(selector = "setEdgeCreasesSource:")
    public native void setEdgeCreasesSource(SCNGeometrySource v);
    @Property(selector = "animationKeys")
    public native NSArray<NSString> getAnimationKeys();
    @Property(selector = "program")
    public native SCNProgram getProgram();
    @Property(selector = "setProgram:")
    public native void setProgram(SCNProgram v);
    @Property(selector = "shaderModifiers")
    public native @org.robovm.rt.bro.annotation.Marshaler(SCNShaderModifierEntryPoint.AsStringMapMarshaler.class) Map<SCNShaderModifierEntryPoint, String> getShaderModifiers();
    @Property(selector = "setShaderModifiers:")
    public native void setShaderModifiers(@org.robovm.rt.bro.annotation.Marshaler(SCNShaderModifierEntryPoint.AsStringMapMarshaler.class) Map<SCNShaderModifierEntryPoint, String> v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "minimumLanguageVersion")
    public native NSNumber getMinimumLanguageVersion();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setMinimumLanguageVersion:")
    public native void setMinimumLanguageVersion(NSNumber v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "insertMaterial:atIndex:")
    public native void insertMaterial(SCNMaterial material, @MachineSizedUInt long index);
    @Method(selector = "removeMaterialAtIndex:")
    public native void removeMaterial(@MachineSizedUInt long index);
    @Method(selector = "replaceMaterialAtIndex:withMaterial:")
    public native void replaceMaterial(@MachineSizedUInt long index, SCNMaterial material);
    @Method(selector = "materialWithName:")
    public native SCNMaterial getMaterial(String name);
    @Method(selector = "geometrySourcesForSemantic:")
    public native NSArray<SCNGeometrySource> getGeometrySourcesForSemantic(SCNGeometrySourceSemantic semantic);
    @Method(selector = "geometryElementAtIndex:")
    public native SCNGeometryElement getGeometryElement(@MachineSizedSInt long elementIndex);
    @Method(selector = "geometry")
    public static native SCNGeometry createGeometry();
    @Method(selector = "geometryWithSources:elements:")
    public static native SCNGeometry createGeometry(NSArray<SCNGeometrySource> sources, NSArray<SCNGeometryElement> elements);
    @Method(selector = "addAnimation:forKey:")
    public native void addAnimation(SCNAnimationProtocol animation, String key);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "addAnimationPlayer:forKey:")
    public native void addAnimationPlayer(SCNAnimationPlayer player, String key);
    @Method(selector = "removeAllAnimations")
    public native void removeAllAnimations();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "removeAllAnimationsWithBlendOutDuration:")
    public native void removeAllAnimations(@MachineSizedFloat double duration);
    @Method(selector = "removeAnimationForKey:")
    public native void removeAnimation(String key);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "removeAnimationForKey:blendOutDuration:")
    public native void removeAnimationForKey(String key, @MachineSizedFloat double duration);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "animationPlayerForKey:")
    public native SCNAnimationPlayer animationPlayerForKey(String key);
    /**
     * @deprecated Deprecated in iOS 11.0. Use -removeAnimationForKey:blendOutDuration:
     */
    @Deprecated
    @Method(selector = "removeAnimationForKey:fadeOutDuration:")
    public native void removeAnimation(String key, @MachineSizedFloat double duration);
    /**
     * @deprecated Deprecated in iOS 11.0. Use -animationPlayerForKey:
     */
    @Deprecated
    @Method(selector = "animationForKey:")
    public native CAAnimation getAnimation(String key);
    /**
     * @deprecated Deprecated in iOS 11.0. Use -[SCNAnimationPlayer setPaused:] instead
     */
    @Deprecated
    @Method(selector = "pauseAnimationForKey:")
    public native void pauseAnimation(String key);
    /**
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
     * @deprecated Deprecated in iOS 11.0. Use -[SCNAnimationPlayer paused] instead
     */
    @Deprecated
    @Method(selector = "isAnimationForKeyPaused:")
    public native boolean isAnimationPaused(String key);
    @Method(selector = "getBoundingBoxMin:max:")
    public native boolean getBoundingBox(SCNVector3.SCNVector3Ptr min, SCNVector3.SCNVector3Ptr max);
    @Method(selector = "setBoundingBoxMin:max:")
    public native void setBoundingBox(SCNVector3.SCNVector3Ptr min, SCNVector3.SCNVector3Ptr max);
    @Method(selector = "getBoundingSphereCenter:radius:")
    public native boolean getBoundingSphere(SCNVector3.SCNVector3Ptr center, MachineSizedFloatPtr radius);
    @Method(selector = "handleBindingOfSymbol:usingBlock:")
    public native void handleBindingOfSymbol(String symbol, @Block VoidBlock4<Integer, Integer, SCNNode, SCNRenderer> block);
    @Method(selector = "handleUnbindingOfSymbol:usingBlock:")
    public native void handleUnbindingOfSymbol(String symbol, @Block VoidBlock4<Integer, Integer, SCNNode, SCNRenderer> block);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
