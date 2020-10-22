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
package org.robovm.apple.vision;

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
import org.robovm.apple.coreml.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.imageio.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Vision") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VNVideoProcessor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VNVideoProcessorPtr extends Ptr<VNVideoProcessor, VNVideoProcessorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VNVideoProcessor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected VNVideoProcessor() {}
    protected VNVideoProcessor(Handle h, long handle) { super(h, handle); }
    protected VNVideoProcessor(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithURL:")
    public VNVideoProcessor(NSURL videoURL) { super((SkipInit) null); initObject(init(videoURL)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithURL:")
    protected native @Pointer long init(NSURL videoURL);
    public boolean addRequest(VNRequest request, VNVideoProcessorRequestProcessingOptions processingOptions) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = addRequest(request, processingOptions, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "addRequest:processingOptions:error:")
    private native boolean addRequest(VNRequest request, VNVideoProcessorRequestProcessingOptions processingOptions, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use -addRequest:processingOptions:error:
     */
    @Deprecated
    public boolean addRequest(VNRequest request, NSDictionary<NSString, ?> processingOptions) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = addRequest(request, processingOptions, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use -addRequest:processingOptions:error:
     */
    @Deprecated
    @Method(selector = "addRequest:withProcessingOptions:error:")
    private native boolean addRequest(VNRequest request, NSDictionary<NSString, ?> processingOptions, NSError.NSErrorPtr error);
    public boolean removeRequest(VNRequest request) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = removeRequest(request, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "removeRequest:error:")
    private native boolean removeRequest(VNRequest request, NSError.NSErrorPtr error);
    public boolean analyzeTimeRange(@ByVal CMTimeRange timeRange) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = analyzeTimeRange(timeRange, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "analyzeTimeRange:error:")
    private native boolean analyzeTimeRange(@ByVal CMTimeRange timeRange, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use -analyzeTimeRange:error:
     */
    @Deprecated
    public boolean analyzeWithTimeRange(@ByVal CMTimeRange timeRange) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = analyzeWithTimeRange(timeRange, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use -analyzeTimeRange:error:
     */
    @Deprecated
    @Method(selector = "analyzeWithTimeRange:error:")
    private native boolean analyzeWithTimeRange(@ByVal CMTimeRange timeRange, NSError.NSErrorPtr error);
    @Method(selector = "cancel")
    public native void cancel();
    /*</methods>*/
}
