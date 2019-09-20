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
package org.robovm.apple.metal;

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
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLRasterizationRateMapAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MTLRasterizationRateMap/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("device")
    public MTLDevice getDevice() { return null; }
    @NotImplemented("label")
    public String getLabel() { return null; }
    @NotImplemented("screenSize")
    public @ByVal MTLSize getScreenSize() { return null; }
    @NotImplemented("physicalGranularity")
    public @ByVal MTLSize getPhysicalGranularity() { return null; }
    @NotImplemented("layerCount")
    public @MachineSizedUInt long getLayerCount() { return 0; }
    @NotImplemented("parameterBufferSizeAndAlign")
    public @ByVal MTLSizeAndAlign getParameterBufferSizeAndAlign() { return null; }
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("copyParameterDataToBuffer:offset:")
    public void copyParameterDataToBuffer(MTLBuffer buffer, @MachineSizedUInt long offset) {}
    @NotImplemented("physicalSizeForLayer:")
    public @ByVal MTLSize physicalSizeForLayer(@MachineSizedUInt long layerIndex) { return null; }
    @NotImplemented("mapScreenToPhysicalCoordinates:forLayer:")
    public @ByVal MTLSamplePosition mapScreenToPhysicalCoordinates(@ByVal MTLSamplePosition screenCoordinates, @MachineSizedUInt long layerIndex) { return null; }
    @NotImplemented("mapPhysicalToScreenCoordinates:forLayer:")
    public @ByVal MTLSamplePosition mapPhysicalToScreenCoordinates(@ByVal MTLSamplePosition physicalCoordinates, @MachineSizedUInt long layerIndex) { return null; }
    /*</methods>*/
}
