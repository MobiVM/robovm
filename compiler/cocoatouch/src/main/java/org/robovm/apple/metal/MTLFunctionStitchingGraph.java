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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLFunctionStitchingGraph/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTLFunctionStitchingGraphPtr extends Ptr<MTLFunctionStitchingGraph, MTLFunctionStitchingGraphPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTLFunctionStitchingGraph.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTLFunctionStitchingGraph() {}
    protected MTLFunctionStitchingGraph(Handle h, long handle) { super(h, handle); }
    protected MTLFunctionStitchingGraph(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFunctionName:nodes:outputNode:attributes:")
    public MTLFunctionStitchingGraph(String functionName, NSArray<MTLFunctionStitchingFunctionNode> nodes, MTLFunctionStitchingFunctionNode outputNode, NSArray<?> attributes) { super((SkipInit) null); initObject(init(functionName, nodes, outputNode, attributes)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "functionName")
    public native String getFunctionName();
    @Property(selector = "setFunctionName:")
    public native void setFunctionName(String v);
    @Property(selector = "nodes")
    public native NSArray<MTLFunctionStitchingFunctionNode> getNodes();
    @Property(selector = "setNodes:")
    public native void setNodes(NSArray<MTLFunctionStitchingFunctionNode> v);
    @Property(selector = "outputNode")
    public native MTLFunctionStitchingFunctionNode getOutputNode();
    @Property(selector = "setOutputNode:")
    public native void setOutputNode(MTLFunctionStitchingFunctionNode v);
    @Property(selector = "attributes")
    public native NSArray<?> getAttributes();
    @Property(selector = "setAttributes:")
    public native void setAttributes(NSArray<?> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithFunctionName:nodes:outputNode:attributes:")
    protected native @Pointer long init(String functionName, NSArray<MTLFunctionStitchingFunctionNode> nodes, MTLFunctionStitchingFunctionNode outputNode, NSArray<?> attributes);
    /*</methods>*/
}
