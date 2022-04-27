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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SCNParticleSystem/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding, SCNAnimatable/*</implements>*/ {

    /*<ptr>*/public static class SCNParticleSystemPtr extends Ptr<SCNParticleSystem, SCNParticleSystemPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SCNParticleSystem.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SCNParticleSystem() {}
    protected SCNParticleSystem(Handle h, long handle) { super(h, handle); }
    protected SCNParticleSystem(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public SCNParticleSystem(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "emissionDuration")
    public native @MachineSizedFloat double getEmissionDuration();
    @Property(selector = "setEmissionDuration:")
    public native void setEmissionDuration(@MachineSizedFloat double v);
    @Property(selector = "emissionDurationVariation")
    public native @MachineSizedFloat double getEmissionDurationVariation();
    @Property(selector = "setEmissionDurationVariation:")
    public native void setEmissionDurationVariation(@MachineSizedFloat double v);
    @Property(selector = "idleDuration")
    public native @MachineSizedFloat double getIdleDuration();
    @Property(selector = "setIdleDuration:")
    public native void setIdleDuration(@MachineSizedFloat double v);
    @Property(selector = "idleDurationVariation")
    public native @MachineSizedFloat double getIdleDurationVariation();
    @Property(selector = "setIdleDurationVariation:")
    public native void setIdleDurationVariation(@MachineSizedFloat double v);
    @Property(selector = "loops")
    public native boolean loops();
    @Property(selector = "setLoops:")
    public native void setLoops(boolean v);
    @Property(selector = "birthRate")
    public native @MachineSizedFloat double getBirthRate();
    @Property(selector = "setBirthRate:")
    public native void setBirthRate(@MachineSizedFloat double v);
    @Property(selector = "birthRateVariation")
    public native @MachineSizedFloat double getBirthRateVariation();
    @Property(selector = "setBirthRateVariation:")
    public native void setBirthRateVariation(@MachineSizedFloat double v);
    @Property(selector = "warmupDuration")
    public native @MachineSizedFloat double getWarmupDuration();
    @Property(selector = "setWarmupDuration:")
    public native void setWarmupDuration(@MachineSizedFloat double v);
    @Property(selector = "emitterShape")
    public native SCNGeometry getEmitterShape();
    @Property(selector = "setEmitterShape:")
    public native void setEmitterShape(SCNGeometry v);
    @Property(selector = "birthLocation")
    public native SCNParticleBirthLocation getBirthLocation();
    @Property(selector = "setBirthLocation:")
    public native void setBirthLocation(SCNParticleBirthLocation v);
    @Property(selector = "birthDirection")
    public native SCNParticleBirthDirection getBirthDirection();
    @Property(selector = "setBirthDirection:")
    public native void setBirthDirection(SCNParticleBirthDirection v);
    @Property(selector = "spreadingAngle")
    public native @MachineSizedFloat double getSpreadingAngle();
    @Property(selector = "setSpreadingAngle:")
    public native void setSpreadingAngle(@MachineSizedFloat double v);
    @Property(selector = "emittingDirection")
    public native @ByVal SCNVector3 getEmittingDirection();
    @Property(selector = "setEmittingDirection:")
    public native void setEmittingDirection(@ByVal SCNVector3 v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "orientationDirection")
    public native @ByVal SCNVector3 getOrientationDirection();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setOrientationDirection:")
    public native void setOrientationDirection(@ByVal SCNVector3 v);
    @Property(selector = "acceleration")
    public native @ByVal SCNVector3 getAcceleration();
    @Property(selector = "setAcceleration:")
    public native void setAcceleration(@ByVal SCNVector3 v);
    @Property(selector = "isLocal")
    public native boolean isLocal();
    @Property(selector = "setLocal:")
    public native void setLocal(boolean v);
    @Property(selector = "particleAngle")
    public native @MachineSizedFloat double getParticleAngle();
    @Property(selector = "setParticleAngle:")
    public native void setParticleAngle(@MachineSizedFloat double v);
    @Property(selector = "particleAngleVariation")
    public native @MachineSizedFloat double getParticleAngleVariation();
    @Property(selector = "setParticleAngleVariation:")
    public native void setParticleAngleVariation(@MachineSizedFloat double v);
    @Property(selector = "particleVelocity")
    public native @MachineSizedFloat double getParticleVelocity();
    @Property(selector = "setParticleVelocity:")
    public native void setParticleVelocity(@MachineSizedFloat double v);
    @Property(selector = "particleVelocityVariation")
    public native @MachineSizedFloat double getParticleVelocityVariation();
    @Property(selector = "setParticleVelocityVariation:")
    public native void setParticleVelocityVariation(@MachineSizedFloat double v);
    @Property(selector = "particleAngularVelocity")
    public native @MachineSizedFloat double getParticleAngularVelocity();
    @Property(selector = "setParticleAngularVelocity:")
    public native void setParticleAngularVelocity(@MachineSizedFloat double v);
    @Property(selector = "particleAngularVelocityVariation")
    public native @MachineSizedFloat double getParticleAngularVelocityVariation();
    @Property(selector = "setParticleAngularVelocityVariation:")
    public native void setParticleAngularVelocityVariation(@MachineSizedFloat double v);
    @Property(selector = "particleLifeSpan")
    public native @MachineSizedFloat double getParticleLifeSpan();
    @Property(selector = "setParticleLifeSpan:")
    public native void setParticleLifeSpan(@MachineSizedFloat double v);
    @Property(selector = "particleLifeSpanVariation")
    public native @MachineSizedFloat double getParticleLifeSpanVariation();
    @Property(selector = "setParticleLifeSpanVariation:")
    public native void setParticleLifeSpanVariation(@MachineSizedFloat double v);
    @Property(selector = "systemSpawnedOnDying")
    public native SCNParticleSystem getSystemSpawnedOnDying();
    @Property(selector = "setSystemSpawnedOnDying:")
    public native void setSystemSpawnedOnDying(SCNParticleSystem v);
    @Property(selector = "systemSpawnedOnCollision")
    public native SCNParticleSystem getSystemSpawnedOnCollision();
    @Property(selector = "setSystemSpawnedOnCollision:")
    public native void setSystemSpawnedOnCollision(SCNParticleSystem v);
    @Property(selector = "systemSpawnedOnLiving")
    public native SCNParticleSystem getSystemSpawnedOnLiving();
    @Property(selector = "setSystemSpawnedOnLiving:")
    public native void setSystemSpawnedOnLiving(SCNParticleSystem v);
    @Property(selector = "particleImage")
    public native UIImage getParticleImage();
    @Property(selector = "setParticleImage:")
    public native void setParticleImage(UIImage v);
    @Property(selector = "imageSequenceColumnCount")
    public native @MachineSizedUInt long getImageSequenceColumnCount();
    @Property(selector = "setImageSequenceColumnCount:")
    public native void setImageSequenceColumnCount(@MachineSizedUInt long v);
    @Property(selector = "imageSequenceRowCount")
    public native @MachineSizedUInt long getImageSequenceRowCount();
    @Property(selector = "setImageSequenceRowCount:")
    public native void setImageSequenceRowCount(@MachineSizedUInt long v);
    @Property(selector = "imageSequenceInitialFrame")
    public native @MachineSizedFloat double getImageSequenceInitialFrame();
    @Property(selector = "setImageSequenceInitialFrame:")
    public native void setImageSequenceInitialFrame(@MachineSizedFloat double v);
    @Property(selector = "imageSequenceInitialFrameVariation")
    public native @MachineSizedFloat double getImageSequenceInitialFrameVariation();
    @Property(selector = "setImageSequenceInitialFrameVariation:")
    public native void setImageSequenceInitialFrameVariation(@MachineSizedFloat double v);
    @Property(selector = "imageSequenceFrameRate")
    public native @MachineSizedFloat double getImageSequenceFrameRate();
    @Property(selector = "setImageSequenceFrameRate:")
    public native void setImageSequenceFrameRate(@MachineSizedFloat double v);
    @Property(selector = "imageSequenceFrameRateVariation")
    public native @MachineSizedFloat double getImageSequenceFrameRateVariation();
    @Property(selector = "setImageSequenceFrameRateVariation:")
    public native void setImageSequenceFrameRateVariation(@MachineSizedFloat double v);
    @Property(selector = "imageSequenceAnimationMode")
    public native SCNParticleImageSequenceAnimationMode getImageSequenceAnimationMode();
    @Property(selector = "setImageSequenceAnimationMode:")
    public native void setImageSequenceAnimationMode(SCNParticleImageSequenceAnimationMode v);
    @Property(selector = "particleColor")
    public native UIColor getParticleColor();
    @Property(selector = "setParticleColor:")
    public native void setParticleColor(UIColor v);
    @Property(selector = "particleColorVariation")
    public native @ByVal SCNVector4 getParticleColorVariation();
    @Property(selector = "setParticleColorVariation:")
    public native void setParticleColorVariation(@ByVal SCNVector4 v);
    @Property(selector = "particleSize")
    public native @MachineSizedFloat double getParticleSize();
    @Property(selector = "setParticleSize:")
    public native void setParticleSize(@MachineSizedFloat double v);
    @Property(selector = "particleSizeVariation")
    public native @MachineSizedFloat double getParticleSizeVariation();
    @Property(selector = "setParticleSizeVariation:")
    public native void setParticleSizeVariation(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "particleIntensity")
    public native @MachineSizedFloat double getParticleIntensity();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setParticleIntensity:")
    public native void setParticleIntensity(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "particleIntensityVariation")
    public native @MachineSizedFloat double getParticleIntensityVariation();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setParticleIntensityVariation:")
    public native void setParticleIntensityVariation(@MachineSizedFloat double v);
    @Property(selector = "blendMode")
    public native SCNParticleBlendMode getBlendMode();
    @Property(selector = "setBlendMode:")
    public native void setBlendMode(SCNParticleBlendMode v);
    @Property(selector = "isBlackPassEnabled")
    public native boolean isBlackPassEnabled();
    @Property(selector = "setBlackPassEnabled:")
    public native void setBlackPassEnabled(boolean v);
    @Property(selector = "orientationMode")
    public native SCNParticleOrientationMode getOrientationMode();
    @Property(selector = "setOrientationMode:")
    public native void setOrientationMode(SCNParticleOrientationMode v);
    @Property(selector = "sortingMode")
    public native SCNParticleSortingMode getSortingMode();
    @Property(selector = "setSortingMode:")
    public native void setSortingMode(SCNParticleSortingMode v);
    @Property(selector = "isLightingEnabled")
    public native boolean isLightingEnabled();
    @Property(selector = "setLightingEnabled:")
    public native void setLightingEnabled(boolean v);
    @Property(selector = "affectedByGravity")
    public native boolean isAffectedByGravity();
    @Property(selector = "setAffectedByGravity:")
    public native void setAffectedByGravity(boolean v);
    @Property(selector = "affectedByPhysicsFields")
    public native boolean isAffectedByPhysicsFields();
    @Property(selector = "setAffectedByPhysicsFields:")
    public native void setAffectedByPhysicsFields(boolean v);
    @Property(selector = "particleDiesOnCollision")
    public native boolean particleDiesOnCollision();
    @Property(selector = "setParticleDiesOnCollision:")
    public native void setParticleDiesOnCollision(boolean v);
    @Property(selector = "colliderNodes")
    public native NSArray<SCNNode> getColliderNodes();
    @Property(selector = "setColliderNodes:")
    public native void setColliderNodes(NSArray<SCNNode> v);
    @Property(selector = "particleMass")
    public native @MachineSizedFloat double getParticleMass();
    @Property(selector = "setParticleMass:")
    public native void setParticleMass(@MachineSizedFloat double v);
    @Property(selector = "particleMassVariation")
    public native @MachineSizedFloat double getParticleMassVariation();
    @Property(selector = "setParticleMassVariation:")
    public native void setParticleMassVariation(@MachineSizedFloat double v);
    @Property(selector = "particleBounce")
    public native @MachineSizedFloat double getParticleBounce();
    @Property(selector = "setParticleBounce:")
    public native void setParticleBounce(@MachineSizedFloat double v);
    @Property(selector = "particleBounceVariation")
    public native @MachineSizedFloat double getParticleBounceVariation();
    @Property(selector = "setParticleBounceVariation:")
    public native void setParticleBounceVariation(@MachineSizedFloat double v);
    @Property(selector = "particleFriction")
    public native @MachineSizedFloat double getParticleFriction();
    @Property(selector = "setParticleFriction:")
    public native void setParticleFriction(@MachineSizedFloat double v);
    @Property(selector = "particleFrictionVariation")
    public native @MachineSizedFloat double getParticleFrictionVariation();
    @Property(selector = "setParticleFrictionVariation:")
    public native void setParticleFrictionVariation(@MachineSizedFloat double v);
    @Property(selector = "particleCharge")
    public native @MachineSizedFloat double getParticleCharge();
    @Property(selector = "setParticleCharge:")
    public native void setParticleCharge(@MachineSizedFloat double v);
    @Property(selector = "particleChargeVariation")
    public native @MachineSizedFloat double getParticleChargeVariation();
    @Property(selector = "setParticleChargeVariation:")
    public native void setParticleChargeVariation(@MachineSizedFloat double v);
    @Property(selector = "dampingFactor")
    public native @MachineSizedFloat double getDampingFactor();
    @Property(selector = "setDampingFactor:")
    public native void setDampingFactor(@MachineSizedFloat double v);
    @Property(selector = "speedFactor")
    public native @MachineSizedFloat double getSpeedFactor();
    @Property(selector = "setSpeedFactor:")
    public native void setSpeedFactor(@MachineSizedFloat double v);
    @Property(selector = "stretchFactor")
    public native @MachineSizedFloat double getStretchFactor();
    @Property(selector = "setStretchFactor:")
    public native void setStretchFactor(@MachineSizedFloat double v);
    @Property(selector = "fresnelExponent")
    public native @MachineSizedFloat double getFresnelExponent();
    @Property(selector = "setFresnelExponent:")
    public native void setFresnelExponent(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "writesToDepthBuffer")
    public native boolean writesToDepthBuffer();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setWritesToDepthBuffer:")
    public native void setWritesToDepthBuffer(boolean v);
    @Property(selector = "propertyControllers")
    public native @org.robovm.rt.bro.annotation.Marshaler(SCNParticleProperty.AsPropertyControllerMapMarshaler.class) Map<SCNParticleProperty, SCNParticlePropertyController> getPropertyControllers();
    @Property(selector = "setPropertyControllers:")
    public native void setPropertyControllers(@org.robovm.rt.bro.annotation.Marshaler(SCNParticleProperty.AsPropertyControllerMapMarshaler.class) Map<SCNParticleProperty, SCNParticlePropertyController> v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    @Property(selector = "animationKeys")
    public native NSArray<NSString> getAnimationKeys();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "reset")
    public native void reset();
    @Method(selector = "handleEvent:forProperties:withBlock:")
    public native void handleEventForProperties(SCNParticleEvent event, @org.robovm.rt.bro.annotation.Marshaler(SCNParticleProperty.AsListMarshaler.class) List<SCNParticleProperty> properties, @Block("(,,,@MachineSizedSInt)") VoidBlock4<VoidPtr.VoidPtrPtr, VoidPtr, IntPtr, Long> block);
    @Method(selector = "addModifierForProperties:atStage:withBlock:")
    public native void addModifierForProperties(@org.robovm.rt.bro.annotation.Marshaler(SCNParticleProperty.AsListMarshaler.class) List<SCNParticleProperty> properties, SCNParticleModifierStage stage, @Block("(,,,@MachineSizedSInt)") VoidBlock4<VoidPtr.VoidPtrPtr, VoidPtr, IntPtr, Long> block);
    @Method(selector = "removeModifiersOfStage:")
    public native void removeModifiersOfStage(SCNParticleModifierStage stage);
    @Method(selector = "removeAllModifiers")
    public native void removeAllModifiers();
    @Method(selector = "particleSystem")
    public static native SCNParticleSystem create();
    @Method(selector = "particleSystemNamed:inDirectory:")
    public static native SCNParticleSystem create(String name, String directory);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
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
    /*</methods>*/
}
