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
package org.robovm.apple.coreimage;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.opengles.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.imageio.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.iosurface.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreImage") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CIImageProcessorKernel/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CIImageProcessorKernelPtr extends Ptr<CIImageProcessorKernel, CIImageProcessorKernelPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CIImageProcessorKernel.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CIImageProcessorKernel() {}
    protected CIImageProcessorKernel(Handle h, long handle) { super(h, handle); }
    protected CIImageProcessorKernel(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "outputFormat")
    public static native int getOutputFormat();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "outputIsOpaque")
    public static native boolean isOutputIsOpaque();
    @Property(selector = "synchronizeInputs")
    public static native boolean isSynchronizeInputs();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "processWithInputs:arguments:output:error:")
    public static native boolean process(NSArray<?> inputs, NSDictionary<NSString, ?> arguments, CIImageProcessorOutput output, NSError.NSErrorPtr error);
    @Method(selector = "roiForInput:arguments:outputRect:")
    public static native @ByVal CGRect roiForInput(int input, NSDictionary<NSString, ?> arguments, @ByVal CGRect outputRect);
    @Method(selector = "formatForInputAtIndex:")
    public static native int formatForInputAtIndex(int input);
    @Method(selector = "applyWithExtent:inputs:arguments:error:")
    public static native CIImage apply(@ByVal CGRect extent, NSArray<CIImage> inputs, NSDictionary<NSString, ?> args, NSError.NSErrorPtr error);
    /*</methods>*/
}
