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
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Metal") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLComputePassSampleBufferAttachmentDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTLComputePassSampleBufferAttachmentDescriptorPtr extends Ptr<MTLComputePassSampleBufferAttachmentDescriptor, MTLComputePassSampleBufferAttachmentDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTLComputePassSampleBufferAttachmentDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTLComputePassSampleBufferAttachmentDescriptor() {}
    protected MTLComputePassSampleBufferAttachmentDescriptor(Handle h, long handle) { super(h, handle); }
    protected MTLComputePassSampleBufferAttachmentDescriptor(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sampleBuffer")
    public native MTLCounterSampleBuffer getSampleBuffer();
    @Property(selector = "setSampleBuffer:")
    public native void setSampleBuffer(MTLCounterSampleBuffer v);
    @Property(selector = "startOfEncoderSampleIndex")
    public native @MachineSizedUInt long getStartOfEncoderSampleIndex();
    @Property(selector = "setStartOfEncoderSampleIndex:")
    public native void setStartOfEncoderSampleIndex(@MachineSizedUInt long v);
    @Property(selector = "endOfEncoderSampleIndex")
    public native @MachineSizedUInt long getEndOfEncoderSampleIndex();
    @Property(selector = "setEndOfEncoderSampleIndex:")
    public native void setEndOfEncoderSampleIndex(@MachineSizedUInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
