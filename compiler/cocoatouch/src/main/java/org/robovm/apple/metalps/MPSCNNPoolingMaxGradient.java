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
/*<annotations>*/@Library("Metal") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSCNNPoolingMaxGradient/*</name>*/ 
    extends /*<extends>*/MPSCNNPoolingGradient/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSCNNPoolingMaxGradientPtr extends Ptr<MPSCNNPoolingMaxGradient, MPSCNNPoolingMaxGradientPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSCNNPoolingMaxGradient.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSCNNPoolingMaxGradient() {}
    protected MPSCNNPoolingMaxGradient(Handle h, long handle) { super(h, handle); }
    protected MPSCNNPoolingMaxGradient(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:kernelWidth:kernelHeight:strideInPixelsX:strideInPixelsY:")
    public MPSCNNPoolingMaxGradient(MTLDevice device, @MachineSizedUInt long kernelWidth, @MachineSizedUInt long kernelHeight, @MachineSizedUInt long strideInPixelsX, @MachineSizedUInt long strideInPixelsY) { super((SkipInit) null); initObject(init(device, kernelWidth, kernelHeight, strideInPixelsX, strideInPixelsY)); }
    @Method(selector = "initWithCoder:device:")
    public MPSCNNPoolingMaxGradient(NSCoder aDecoder, MTLDevice device) { super((SkipInit) null); initObject(init(aDecoder, device)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:kernelWidth:kernelHeight:strideInPixelsX:strideInPixelsY:")
    protected native @Pointer long init(MTLDevice device, @MachineSizedUInt long kernelWidth, @MachineSizedUInt long kernelHeight, @MachineSizedUInt long strideInPixelsX, @MachineSizedUInt long strideInPixelsY);
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder aDecoder, MTLDevice device);
    /*</methods>*/
}
