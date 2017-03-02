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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SCNCamera/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements SCNAnimatable, SCNTechniqueSupport/*</implements>*/ {

    /*<ptr>*/public static class SCNCameraPtr extends Ptr<SCNCamera, SCNCameraPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SCNCamera.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SCNCamera() {}
    protected SCNCamera(Handle h, long handle) { super(h, handle); }
    protected SCNCamera(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "setName:")
    public native void setName(String v);
    @Property(selector = "xFov")
    public native double getXFov();
    @Property(selector = "setXFov:")
    public native void setXFov(double v);
    @Property(selector = "yFov")
    public native double getYFov();
    @Property(selector = "setYFov:")
    public native void setYFov(double v);
    @Property(selector = "zNear")
    public native double getZNear();
    @Property(selector = "setZNear:")
    public native void setZNear(double v);
    @Property(selector = "zFar")
    public native double getZFar();
    @Property(selector = "setZFar:")
    public native void setZFar(double v);
    @Property(selector = "automaticallyAdjustsZRange")
    public native boolean automaticallyAdjustsZRange();
    @Property(selector = "setAutomaticallyAdjustsZRange:")
    public native void setAutomaticallyAdjustsZRange(boolean v);
    @Property(selector = "usesOrthographicProjection")
    public native boolean usesOrthographicProjection();
    @Property(selector = "setUsesOrthographicProjection:")
    public native void setUsesOrthographicProjection(boolean v);
    @Property(selector = "orthographicScale")
    public native double getOrthographicScale();
    @Property(selector = "setOrthographicScale:")
    public native void setOrthographicScale(double v);
    @Property(selector = "projectionTransform")
    public native @ByVal SCNMatrix4 getProjectionTransform();
    @Property(selector = "setProjectionTransform:")
    public native void setProjectionTransform(@ByVal SCNMatrix4 v);
    @Property(selector = "focalDistance")
    public native @MachineSizedFloat double getFocalDistance();
    @Property(selector = "setFocalDistance:")
    public native void setFocalDistance(@MachineSizedFloat double v);
    @Property(selector = "focalSize")
    public native @MachineSizedFloat double getFocalSize();
    @Property(selector = "setFocalSize:")
    public native void setFocalSize(@MachineSizedFloat double v);
    @Property(selector = "focalBlurRadius")
    public native @MachineSizedFloat double getFocalBlurRadius();
    @Property(selector = "setFocalBlurRadius:")
    public native void setFocalBlurRadius(@MachineSizedFloat double v);
    @Property(selector = "aperture")
    public native @MachineSizedFloat double getAperture();
    @Property(selector = "setAperture:")
    public native void setAperture(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "motionBlurIntensity")
    public native @MachineSizedFloat double getMotionBlurIntensity();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setMotionBlurIntensity:")
    public native void setMotionBlurIntensity(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "wantsHDR")
    public native boolean wantsHDR();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setWantsHDR:")
    public native void setWantsHDR(boolean v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "exposureOffset")
    public native @MachineSizedFloat double getExposureOffset();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setExposureOffset:")
    public native void setExposureOffset(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "averageGray")
    public native @MachineSizedFloat double getAverageGray();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setAverageGray:")
    public native void setAverageGray(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "whitePoint")
    public native @MachineSizedFloat double getWhitePoint();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setWhitePoint:")
    public native void setWhitePoint(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "wantsExposureAdaptation")
    public native boolean wantsExposureAdaptation();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setWantsExposureAdaptation:")
    public native void setWantsExposureAdaptation(boolean v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "exposureAdaptationBrighteningSpeedFactor")
    public native @MachineSizedFloat double getExposureAdaptationBrighteningSpeedFactor();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setExposureAdaptationBrighteningSpeedFactor:")
    public native void setExposureAdaptationBrighteningSpeedFactor(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "exposureAdaptationDarkeningSpeedFactor")
    public native @MachineSizedFloat double getExposureAdaptationDarkeningSpeedFactor();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setExposureAdaptationDarkeningSpeedFactor:")
    public native void setExposureAdaptationDarkeningSpeedFactor(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "minimumExposure")
    public native @MachineSizedFloat double getMinimumExposure();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setMinimumExposure:")
    public native void setMinimumExposure(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "maximumExposure")
    public native @MachineSizedFloat double getMaximumExposure();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setMaximumExposure:")
    public native void setMaximumExposure(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "bloomThreshold")
    public native @MachineSizedFloat double getBloomThreshold();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setBloomThreshold:")
    public native void setBloomThreshold(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "bloomIntensity")
    public native @MachineSizedFloat double getBloomIntensity();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setBloomIntensity:")
    public native void setBloomIntensity(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "bloomBlurRadius")
    public native @MachineSizedFloat double getBloomBlurRadius();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setBloomBlurRadius:")
    public native void setBloomBlurRadius(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "vignettingPower")
    public native @MachineSizedFloat double getVignettingPower();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setVignettingPower:")
    public native void setVignettingPower(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "vignettingIntensity")
    public native @MachineSizedFloat double getVignettingIntensity();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setVignettingIntensity:")
    public native void setVignettingIntensity(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "colorFringeStrength")
    public native @MachineSizedFloat double getColorFringeStrength();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setColorFringeStrength:")
    public native void setColorFringeStrength(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "colorFringeIntensity")
    public native @MachineSizedFloat double getColorFringeIntensity();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setColorFringeIntensity:")
    public native void setColorFringeIntensity(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "saturation")
    public native @MachineSizedFloat double getSaturation();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setSaturation:")
    public native void setSaturation(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "contrast")
    public native @MachineSizedFloat double getContrast();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setContrast:")
    public native void setContrast(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "colorGrading")
    public native SCNMaterialProperty getColorGrading();
    @Property(selector = "categoryBitMask")
    public native @MachineSizedUInt long getCategoryBitMask();
    @Property(selector = "setCategoryBitMask:")
    public native void setCategoryBitMask(@MachineSizedUInt long v);
    @Property(selector = "animationKeys")
    public native NSArray<?> getAnimationKeys();
    @Property(selector = "technique")
    public native SCNTechnique getTechnique();
    @Property(selector = "setTechnique:")
    public native void setTechnique(SCNTechnique v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "camera")
    public static native SCNCamera create();
    @Method(selector = "addAnimation:forKey:")
    public native void addAnimation(CAAnimation animation, String key);
    @Method(selector = "removeAllAnimations")
    public native void removeAllAnimations();
    @Method(selector = "removeAnimationForKey:")
    public native void removeAnimation(String key);
    @Method(selector = "animationForKey:")
    public native CAAnimation getAnimation(String key);
    @Method(selector = "pauseAnimationForKey:")
    public native void pauseAnimation(String key);
    @Method(selector = "resumeAnimationForKey:")
    public native void resumeAnimation(String key);
    @Method(selector = "isAnimationForKeyPaused:")
    public native boolean isAnimationPaused(String key);
    @Method(selector = "removeAnimationForKey:fadeOutDuration:")
    public native void removeAnimation(String key, @MachineSizedFloat double duration);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "setSpeed:forAnimationKey:")
    public native void setSpeed(@MachineSizedFloat double speed, String key);
    /*</methods>*/
}
