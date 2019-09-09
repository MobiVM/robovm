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
package org.robovm.apple.coreml;

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
import org.robovm.apple.corevideo.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.imageio.*;
import org.robovm.apple.vision.*;
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreML") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MLUpdateTask/*</name>*/ 
    extends /*<extends>*/MLTask/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MLUpdateTaskPtr extends Ptr<MLUpdateTask, MLUpdateTaskPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MLUpdateTask.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MLUpdateTask() {}
    protected MLUpdateTask(Handle h, long handle) { super(h, handle); }
    protected MLUpdateTask(SkipInit skipInit) { super(skipInit); }
    public MLUpdateTask(NSURL modelURL, MLBatchProvider trainingData, MLModelConfiguration configuration, @Block VoidBlock1<MLUpdateContext> completionHandler, NSError.NSErrorPtr error) { super((Handle) null, create(modelURL, trainingData, configuration, completionHandler, error)); retain(getHandle()); }
    public MLUpdateTask(NSURL modelURL, MLBatchProvider trainingData, MLModelConfiguration configuration, MLUpdateProgressHandlers progressHandlers, NSError.NSErrorPtr error) { super((Handle) null, create(modelURL, trainingData, configuration, progressHandlers, error)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "resumeWithParameters:")
    public native void resume(NSDictionary<MLParameterKey, ?> updateParameters);
    @Method(selector = "updateTaskForModelAtURL:trainingData:configuration:completionHandler:error:")
    protected static native @Pointer long create(NSURL modelURL, MLBatchProvider trainingData, MLModelConfiguration configuration, @Block VoidBlock1<MLUpdateContext> completionHandler, NSError.NSErrorPtr error);
    @Method(selector = "updateTaskForModelAtURL:trainingData:configuration:progressHandlers:error:")
    protected static native @Pointer long create(NSURL modelURL, MLBatchProvider trainingData, MLModelConfiguration configuration, MLUpdateProgressHandlers progressHandlers, NSError.NSErrorPtr error);
    /*</methods>*/
}
