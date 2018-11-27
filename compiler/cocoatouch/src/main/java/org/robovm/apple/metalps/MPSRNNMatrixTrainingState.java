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
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShaders") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSRNNMatrixTrainingState/*</name>*/ 
    extends /*<extends>*/MPSState/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSRNNMatrixTrainingStatePtr extends Ptr<MPSRNNMatrixTrainingState, MPSRNNMatrixTrainingStatePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSRNNMatrixTrainingState.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPSRNNMatrixTrainingState() {}
    protected MPSRNNMatrixTrainingState(Handle h, long handle) { super(h, handle); }
    protected MPSRNNMatrixTrainingState(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:bufferSize:")
    public MPSRNNMatrixTrainingState(MTLDevice device, @MachineSizedUInt long bufferSize) { super(device, bufferSize); }
    @Method(selector = "initWithDevice:textureDescriptor:")
    public MPSRNNMatrixTrainingState(MTLDevice device, MTLTextureDescriptor descriptor) { super(device, descriptor); }
    @Method(selector = "initWithResource:")
    public MPSRNNMatrixTrainingState(MTLResource resource) { super(resource); }
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "initWithDevice:resourceList:")
    public MPSRNNMatrixTrainingState(MTLDevice device, MPSStateResourceList resourceList) { super(device, resourceList); }
    @Method(selector = "initWithResources:")
    public MPSRNNMatrixTrainingState(NSArray<?> resources) { super(resources); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
