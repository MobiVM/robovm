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
package org.robovm.apple.matter;

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
import org.robovm.apple.security.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("Matter") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRAsyncCallbackWorkQueue/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRAsyncCallbackWorkQueuePtr extends Ptr<MTRAsyncCallbackWorkQueue, MTRAsyncCallbackWorkQueuePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRAsyncCallbackWorkQueue.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRAsyncCallbackWorkQueue() {}
    protected MTRAsyncCallbackWorkQueue(Handle h, long handle) { super(h, handle); }
    protected MTRAsyncCallbackWorkQueue(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithContext:queue:")
    public MTRAsyncCallbackWorkQueue(NSObject context, DispatchQueue queue) { super((SkipInit) null); initObject(init(context, queue)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithContext:queue:")
    protected native @Pointer long init(NSObject context, DispatchQueue queue);
    @Method(selector = "invalidate")
    public native void invalidate();
    @Method(selector = "enqueueWorkItem:")
    public native void enqueueWorkItem(MTRAsyncCallbackQueueWorkItem item);
    /*</methods>*/
}
