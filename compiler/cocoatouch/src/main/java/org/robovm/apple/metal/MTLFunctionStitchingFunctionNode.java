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
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Metal") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLFunctionStitchingFunctionNode/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MTLFunctionStitchingNode/*</implements>*/ {

    /*<ptr>*/public static class MTLFunctionStitchingFunctionNodePtr extends Ptr<MTLFunctionStitchingFunctionNode, MTLFunctionStitchingFunctionNodePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTLFunctionStitchingFunctionNode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTLFunctionStitchingFunctionNode() {}
    protected MTLFunctionStitchingFunctionNode(Handle h, long handle) { super(h, handle); }
    protected MTLFunctionStitchingFunctionNode(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithName:arguments:controlDependencies:")
    public MTLFunctionStitchingFunctionNode(String name, NSArray<?> arguments, NSArray<MTLFunctionStitchingFunctionNode> controlDependencies) { super((SkipInit) null); initObject(init(name, arguments, controlDependencies)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "setName:")
    public native void setName(String v);
    @Property(selector = "arguments")
    public native NSArray<?> getArguments();
    @Property(selector = "setArguments:")
    public native void setArguments(NSArray<?> v);
    @Property(selector = "controlDependencies")
    public native NSArray<MTLFunctionStitchingFunctionNode> getControlDependencies();
    @Property(selector = "setControlDependencies:")
    public native void setControlDependencies(NSArray<MTLFunctionStitchingFunctionNode> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithName:arguments:controlDependencies:")
    protected native @Pointer long init(String name, NSArray<?> arguments, NSArray<MTLFunctionStitchingFunctionNode> controlDependencies);
    /*</methods>*/
}
