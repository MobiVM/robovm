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
package org.robovm.apple.videotoolbox;

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
import org.robovm.apple.corevideo.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 26.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("VideoToolbox") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VTFrameProcessor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VTFrameProcessorPtr extends Ptr<VTFrameProcessor, VTFrameProcessorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VTFrameProcessor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public VTFrameProcessor() {}
    protected VTFrameProcessor(Handle h, long handle) { super(h, handle); }
    protected VTFrameProcessor(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    public boolean startSession(VTFrameProcessorConfiguration configuration) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = startSession(configuration, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "startSessionWithConfiguration:error:")
    private native boolean startSession(VTFrameProcessorConfiguration configuration, NSError.NSErrorPtr error);
    public boolean process(VTFrameProcessorParameters parameters) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = process(parameters, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "processWithParameters:error:")
    private native boolean process(VTFrameProcessorParameters parameters, NSError.NSErrorPtr error);
    @Method(selector = "processWithParameters:completionHandler:")
    public native void process(VTFrameProcessorParameters parameters, @Block VoidBlock2<VTFrameProcessorParameters, NSError> completionHandler);
    @Method(selector = "processWithParameters:frameOutputHandler:")
    public native void process(VTFrameProcessorParameters parameters, @Block("(,@ByVal,,)") VoidBlock4<VTFrameProcessorParameters, CMTime, Boolean, NSError> frameOutputHandler);
    @Method(selector = "processWithCommandBuffer:parameters:")
    public native void process(MTLCommandBuffer commandBuffer, VTFrameProcessorParameters parameters);
    @Method(selector = "endSession")
    public native void endSession();
    /*</methods>*/
}
