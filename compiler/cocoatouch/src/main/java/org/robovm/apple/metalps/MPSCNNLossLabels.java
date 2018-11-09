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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSCNNLossLabels/*</name>*/ 
    extends /*<extends>*/MPSState/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSCNNLossLabelsPtr extends Ptr<MPSCNNLossLabels, MPSCNNLossLabelsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSCNNLossLabels.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPSCNNLossLabels() {}
    protected MPSCNNLossLabels(Handle h, long handle) { super(h, handle); }
    protected MPSCNNLossLabels(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:labelsDescriptor:")
    public MPSCNNLossLabels(MTLDevice device, MPSCNNLossDataDescriptor labelsDescriptor) { super((SkipInit) null); initObject(init(device, labelsDescriptor)); }
    @Method(selector = "initWithDevice:lossImageSize:labelsDescriptor:weightsDescriptor:")
    public MPSCNNLossLabels(MTLDevice device, @ByVal MTLSize lossImageSize, MPSCNNLossDataDescriptor labelsDescriptor, MPSCNNLossDataDescriptor weightsDescriptor) { super((SkipInit) null); initObject(init(device, lossImageSize, labelsDescriptor, weightsDescriptor)); }
    @Method(selector = "initWithDevice:bufferSize:")
    public MPSCNNLossLabels(MTLDevice device, @MachineSizedUInt long bufferSize) { super(device, bufferSize); }
    @Method(selector = "initWithDevice:textureDescriptor:")
    public MPSCNNLossLabels(MTLDevice device, MTLTextureDescriptor descriptor) { super(device, descriptor); }
    @Method(selector = "initWithResource:")
    public MPSCNNLossLabels(MTLResource resource) { super(resource); }
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "initWithDevice:resourceList:")
    public MPSCNNLossLabels(MTLDevice device, MPSStateResourceList resourceList) { super(device, resourceList); }
    @Method(selector = "initWithResources:")
    public MPSCNNLossLabels(NSArray<?> resources) { super(resources); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:labelsDescriptor:")
    protected native @Pointer long init(MTLDevice device, MPSCNNLossDataDescriptor labelsDescriptor);
    @Method(selector = "initWithDevice:lossImageSize:labelsDescriptor:weightsDescriptor:")
    protected native @Pointer long init(MTLDevice device, @ByVal MTLSize lossImageSize, MPSCNNLossDataDescriptor labelsDescriptor, MPSCNNLossDataDescriptor weightsDescriptor);
    @Method(selector = "lossImage")
    public native MPSImage lossImage();
    @Method(selector = "labelsImage")
    public native MPSImage labelsImage();
    @Method(selector = "weightsImage")
    public native MPSImage weightsImage();
    /*</methods>*/
}
