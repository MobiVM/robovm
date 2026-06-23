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
 * @since Available in iOS 26.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Metal") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTL4StaticLinkingDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTL4StaticLinkingDescriptorPtr extends Ptr<MTL4StaticLinkingDescriptor, MTL4StaticLinkingDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTL4StaticLinkingDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTL4StaticLinkingDescriptor() {}
    protected MTL4StaticLinkingDescriptor(Handle h, long handle) { super(h, handle); }
    protected MTL4StaticLinkingDescriptor(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "functionDescriptors")
    public native NSArray<MTL4FunctionDescriptor> getFunctionDescriptors();
    @Property(selector = "setFunctionDescriptors:")
    public native void setFunctionDescriptors(NSArray<MTL4FunctionDescriptor> v);
    @Property(selector = "privateFunctionDescriptors")
    public native NSArray<MTL4FunctionDescriptor> getPrivateFunctionDescriptors();
    @Property(selector = "setPrivateFunctionDescriptors:")
    public native void setPrivateFunctionDescriptors(NSArray<MTL4FunctionDescriptor> v);
    @Property(selector = "groups")
    public native NSDictionary<?, ?> getGroups();
    @Property(selector = "setGroups:")
    public native void setGroups(NSDictionary<?, ?> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
