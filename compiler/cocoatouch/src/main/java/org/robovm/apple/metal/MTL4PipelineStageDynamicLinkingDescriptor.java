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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTL4PipelineStageDynamicLinkingDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTL4PipelineStageDynamicLinkingDescriptorPtr extends Ptr<MTL4PipelineStageDynamicLinkingDescriptor, MTL4PipelineStageDynamicLinkingDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTL4PipelineStageDynamicLinkingDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTL4PipelineStageDynamicLinkingDescriptor() {}
    protected MTL4PipelineStageDynamicLinkingDescriptor(Handle h, long handle) { super(h, handle); }
    protected MTL4PipelineStageDynamicLinkingDescriptor(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "maxCallStackDepth")
    public native @MachineSizedUInt long getMaxCallStackDepth();
    @Property(selector = "setMaxCallStackDepth:")
    public native void setMaxCallStackDepth(@MachineSizedUInt long v);
    @Property(selector = "binaryLinkedFunctions")
    public native NSArray<MTL4BinaryFunction> getBinaryLinkedFunctions();
    @Property(selector = "setBinaryLinkedFunctions:")
    public native void setBinaryLinkedFunctions(NSArray<MTL4BinaryFunction> v);
    @Property(selector = "preloadedLibraries")
    public native NSArray<MTLDynamicLibrary> getPreloadedLibraries();
    @Property(selector = "setPreloadedLibraries:")
    public native void setPreloadedLibraries(NSArray<MTLDynamicLibrary> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
