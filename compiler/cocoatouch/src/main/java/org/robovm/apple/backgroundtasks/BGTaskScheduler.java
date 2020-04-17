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
package org.robovm.apple.backgroundtasks;

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
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("BackgroundTasks") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BGTaskScheduler/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class BGTaskSchedulerPtr extends Ptr<BGTaskScheduler, BGTaskSchedulerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BGTaskScheduler.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected BGTaskScheduler() {}
    protected BGTaskScheduler(Handle h, long handle) { super(h, handle); }
    protected BGTaskScheduler(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sharedScheduler")
    public static native BGTaskScheduler getSharedScheduler();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "registerForTaskWithIdentifier:usingQueue:launchHandler:")
    public native boolean registerForTask(String identifier, DispatchQueue queue, @Block VoidBlock1<BGTask> launchHandler);
    @Method(selector = "submitTaskRequest:error:")
    public native boolean submitTaskRequest(BGTaskRequest taskRequest, NSError.NSErrorPtr error);
    @Method(selector = "cancelTaskRequestWithIdentifier:")
    public native void cancelTaskRequest(String identifier);
    @Method(selector = "cancelAllTaskRequests")
    public native void cancelAllTaskRequests();
    @Method(selector = "getPendingTaskRequestsWithCompletionHandler:")
    public native void getPendingTaskRequests(@Block VoidBlock1<NSArray<BGTaskRequest>> completionHandler);
    /*</methods>*/
}
