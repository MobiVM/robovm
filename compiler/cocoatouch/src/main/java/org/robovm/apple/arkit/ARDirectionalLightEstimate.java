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
import org.robovm.apple.uikit.*;
import org.robovm.apple.scenekit.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.spritekit.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.imageio.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ARKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ARDirectionalLightEstimate/*</name>*/ 
    extends /*<extends>*/ARLightEstimate/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ARDirectionalLightEstimatePtr extends Ptr<ARDirectionalLightEstimate, ARDirectionalLightEstimatePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ARDirectionalLightEstimate.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ARDirectionalLightEstimate() {}
    protected ARDirectionalLightEstimate(Handle h, long handle) { super(h, handle); }
    protected ARDirectionalLightEstimate(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sphericalHarmonicsCoefficients")
    public native NSData getSphericalHarmonicsCoefficients();
    @Property(selector = "primaryLightDirection")
    public native @ByVal VectorFloat3 getPrimaryLightDirection();
    @Property(selector = "primaryLightIntensity")
    public native @MachineSizedFloat double getPrimaryLightIntensity();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
