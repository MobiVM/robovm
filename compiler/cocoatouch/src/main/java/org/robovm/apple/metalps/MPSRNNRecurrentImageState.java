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
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShaders") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSRNNRecurrentImageState/*</name>*/ 
    extends /*<extends>*/MPSState/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSRNNRecurrentImageStatePtr extends Ptr<MPSRNNRecurrentImageState, MPSRNNRecurrentImageStatePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSRNNRecurrentImageState.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPSRNNRecurrentImageState() {}
    protected MPSRNNRecurrentImageState(Handle h, long handle) { super(h, handle); }
    protected MPSRNNRecurrentImageState(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:bufferSize:")
    public MPSRNNRecurrentImageState(MTLDevice device, @MachineSizedUInt long bufferSize) { super(device, bufferSize); }
    @Method(selector = "initWithDevice:textureDescriptor:")
    public MPSRNNRecurrentImageState(MTLDevice device, MTLTextureDescriptor descriptor) { super(device, descriptor); }
    @Method(selector = "initWithResource:")
    public MPSRNNRecurrentImageState(MTLResource resource) { super(resource); }
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "initWithDevice:resourceList:")
    public MPSRNNRecurrentImageState(MTLDevice device, MPSStateResourceList resourceList) { super(device, resourceList); }
    @Method(selector = "initWithResources:")
    public MPSRNNRecurrentImageState(NSArray<?> resources) { super(resources); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "getRecurrentOutputImageForLayerIndex:")
    public native MPSImage getRecurrentOutputImageForLayerIndex(@MachineSizedUInt long layerIndex);
    @Method(selector = "getMemoryCellImageForLayerIndex:")
    public native MPSImage getMemoryCellImageForLayerIndex(@MachineSizedUInt long layerIndex);
    /*</methods>*/
}
