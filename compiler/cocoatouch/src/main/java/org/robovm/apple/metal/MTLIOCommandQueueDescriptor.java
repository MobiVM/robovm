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
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Metal") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLIOCommandQueueDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTLIOCommandQueueDescriptorPtr extends Ptr<MTLIOCommandQueueDescriptor, MTLIOCommandQueueDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTLIOCommandQueueDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTLIOCommandQueueDescriptor() {}
    protected MTLIOCommandQueueDescriptor(Handle h, long handle) { super(h, handle); }
    protected MTLIOCommandQueueDescriptor(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "maxCommandBufferCount")
    public native @MachineSizedUInt long getMaxCommandBufferCount();
    @Property(selector = "setMaxCommandBufferCount:")
    public native void setMaxCommandBufferCount(@MachineSizedUInt long v);
    @Property(selector = "priority")
    public native MTLIOPriority getPriority();
    @Property(selector = "setPriority:")
    public native void setPriority(MTLIOPriority v);
    @Property(selector = "type")
    public native MTLIOCommandQueueType getType();
    @Property(selector = "setType:")
    public native void setType(MTLIOCommandQueueType v);
    @Property(selector = "maxCommandsInFlight")
    public native @MachineSizedUInt long getMaxCommandsInFlight();
    @Property(selector = "setMaxCommandsInFlight:")
    public native void setMaxCommandsInFlight(@MachineSizedUInt long v);
    @Property(selector = "scratchBufferAllocator")
    public native MTLIOScratchBufferAllocator getScratchBufferAllocator();
    @Property(selector = "setScratchBufferAllocator:")
    public native void setScratchBufferAllocator(MTLIOScratchBufferAllocator v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
