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
 * @since Available in iOS 11.3 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShaders") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSNNBinaryGradientState/*</name>*/ 
    extends /*<extends>*/MPSState/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSNNBinaryGradientStatePtr extends Ptr<MPSNNBinaryGradientState, MPSNNBinaryGradientStatePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSNNBinaryGradientState.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPSNNBinaryGradientState() {}
    protected MPSNNBinaryGradientState(Handle h, long handle) { super(h, handle); }
    protected MPSNNBinaryGradientState(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:bufferSize:")
    public MPSNNBinaryGradientState(MTLDevice device, @MachineSizedUInt long bufferSize) { super(device, bufferSize); }
    @Method(selector = "initWithDevice:textureDescriptor:")
    public MPSNNBinaryGradientState(MTLDevice device, MTLTextureDescriptor descriptor) { super(device, descriptor); }
    @Method(selector = "initWithResource:")
    public MPSNNBinaryGradientState(MTLResource resource) { super(resource); }
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "initWithDevice:resourceList:")
    public MPSNNBinaryGradientState(MTLDevice device, MPSStateResourceList resourceList) { super(device, resourceList); }
    @Method(selector = "initWithResources:")
    public MPSNNBinaryGradientState(NSArray<?> resources) { super(resources); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
