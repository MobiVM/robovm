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
package org.robovm.apple.metalpsgraph;

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
import org.robovm.apple.metal.*;
import org.robovm.apple.metalps.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShadersGraph") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSGraphExecutableExecutionDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSGraphExecutableExecutionDescriptorPtr extends Ptr<MPSGraphExecutableExecutionDescriptor, MPSGraphExecutableExecutionDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSGraphExecutableExecutionDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSGraphExecutableExecutionDescriptor() {}
    protected MPSGraphExecutableExecutionDescriptor(Handle h, long handle) { super(h, handle); }
    protected MPSGraphExecutableExecutionDescriptor(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "scheduledHandler")
    public native @Block VoidBlock2<NSArray<MPSGraphTensorData>, NSError> getScheduledHandler();
    @Property(selector = "setScheduledHandler:")
    public native void setScheduledHandler(@Block VoidBlock2<NSArray<MPSGraphTensorData>, NSError> v);
    @Property(selector = "completionHandler")
    public native @Block VoidBlock2<NSArray<MPSGraphTensorData>, NSError> getCompletionHandler();
    @Property(selector = "setCompletionHandler:")
    public native void setCompletionHandler(@Block VoidBlock2<NSArray<MPSGraphTensorData>, NSError> v);
    @Property(selector = "waitUntilCompleted")
    public native boolean isWaitUntilCompleted();
    @Property(selector = "setWaitUntilCompleted:")
    public native void setWaitUntilCompleted(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
