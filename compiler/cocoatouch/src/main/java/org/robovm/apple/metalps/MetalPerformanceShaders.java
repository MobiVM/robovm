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
package org.robovm.apple.metalps;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShaders")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MetalPerformanceShaders/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(MetalPerformanceShaders.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="MPSRectNoClip", optional=true)
    public static native @ByVal MTLRegion getRectNoClip();
    
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Bridge(symbol="MPSSupportsMTLDevice", optional=true)
    public static native boolean supportsMTLDevice(MTLDevice device);
    @Bridge(symbol="MPSHintTemporaryMemoryHighWaterMark", optional=true)
    public static native void hintTemporaryMemoryHighWaterMark(MTLCommandBuffer cmdBuf, @MachineSizedUInt long bytes);
    @Bridge(symbol="MPSSetHeapCacheDuration", optional=true)
    public static native void setHeapCacheDuration(MTLCommandBuffer cmdBuf, double seconds);
    /**
     * @since Available in iOS 12.2 and later.
     */
    @Bridge(symbol="MPSGetPreferredDevice", optional=true)
    public static native MTLDevice getPreferredDevice(MPSDeviceOptions options);
    /*</methods>*/
}
