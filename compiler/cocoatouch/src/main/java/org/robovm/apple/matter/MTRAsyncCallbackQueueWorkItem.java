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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRAsyncCallbackQueueWorkItem/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRAsyncCallbackQueueWorkItemPtr extends Ptr<MTRAsyncCallbackQueueWorkItem, MTRAsyncCallbackQueueWorkItemPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRAsyncCallbackQueueWorkItem.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRAsyncCallbackQueueWorkItem() {}
    protected MTRAsyncCallbackQueueWorkItem(Handle h, long handle) { super(h, handle); }
    protected MTRAsyncCallbackQueueWorkItem(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithQueue:")
    public MTRAsyncCallbackQueueWorkItem(DispatchQueue queue) { super((SkipInit) null); initObject(init(queue)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "readyHandler")
    public native @Block("(,@MachineSizedUInt)") VoidBlock2<NSObject, Long> getReadyHandler();
    @Property(selector = "setReadyHandler:")
    public native void setReadyHandler(@Block("(,@MachineSizedUInt)") VoidBlock2<NSObject, Long> v);
    @Property(selector = "cancelHandler")
    public native @Block Runnable getCancelHandler();
    @Property(selector = "setCancelHandler:")
    public native void setCancelHandler(@Block Runnable v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithQueue:")
    protected native @Pointer long init(DispatchQueue queue);
    @Method(selector = "endWork")
    public native void endWork();
    @Method(selector = "retryWork")
    public native void retryWork();
    /*</methods>*/
}
