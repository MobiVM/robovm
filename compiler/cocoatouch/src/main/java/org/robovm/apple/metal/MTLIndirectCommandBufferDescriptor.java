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
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Metal") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLIndirectCommandBufferDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTLIndirectCommandBufferDescriptorPtr extends Ptr<MTLIndirectCommandBufferDescriptor, MTLIndirectCommandBufferDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTLIndirectCommandBufferDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTLIndirectCommandBufferDescriptor() {}
    protected MTLIndirectCommandBufferDescriptor(Handle h, long handle) { super(h, handle); }
    protected MTLIndirectCommandBufferDescriptor(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "commandTypes")
    public native MTLIndirectCommandType getCommandTypes();
    @Property(selector = "setCommandTypes:")
    public native void setCommandTypes(MTLIndirectCommandType v);
    @Property(selector = "inheritBuffers")
    public native boolean isInheritBuffers();
    @Property(selector = "setInheritBuffers:")
    public native void setInheritBuffers(boolean v);
    @Property(selector = "maxVertexBufferBindCount")
    public native @MachineSizedUInt long getMaxVertexBufferBindCount();
    @Property(selector = "setMaxVertexBufferBindCount:")
    public native void setMaxVertexBufferBindCount(@MachineSizedUInt long v);
    @Property(selector = "maxFragmentBufferBindCount")
    public native @MachineSizedUInt long getMaxFragmentBufferBindCount();
    @Property(selector = "setMaxFragmentBufferBindCount:")
    public native void setMaxFragmentBufferBindCount(@MachineSizedUInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
