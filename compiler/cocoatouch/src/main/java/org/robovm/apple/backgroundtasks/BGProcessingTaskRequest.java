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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BGProcessingTaskRequest/*</name>*/ 
    extends /*<extends>*/BGTaskRequest/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class BGProcessingTaskRequestPtr extends Ptr<BGProcessingTaskRequest, BGProcessingTaskRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BGProcessingTaskRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected BGProcessingTaskRequest() {}
    protected BGProcessingTaskRequest(Handle h, long handle) { super(h, handle); }
    protected BGProcessingTaskRequest(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithIdentifier:")
    public BGProcessingTaskRequest(String identifier) { super((SkipInit) null); initObject(init(identifier)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "requiresNetworkConnectivity")
    public native boolean requiresNetworkConnectivity();
    @Property(selector = "setRequiresNetworkConnectivity:")
    public native void setRequiresNetworkConnectivity(boolean v);
    @Property(selector = "requiresExternalPower")
    public native boolean requiresExternalPower();
    @Property(selector = "setRequiresExternalPower:")
    public native void setRequiresExternalPower(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithIdentifier:")
    protected native @Pointer long init(String identifier);
    /*</methods>*/
}
