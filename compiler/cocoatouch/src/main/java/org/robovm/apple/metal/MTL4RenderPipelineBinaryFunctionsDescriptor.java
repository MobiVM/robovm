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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTL4RenderPipelineBinaryFunctionsDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTL4RenderPipelineBinaryFunctionsDescriptorPtr extends Ptr<MTL4RenderPipelineBinaryFunctionsDescriptor, MTL4RenderPipelineBinaryFunctionsDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTL4RenderPipelineBinaryFunctionsDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTL4RenderPipelineBinaryFunctionsDescriptor() {}
    protected MTL4RenderPipelineBinaryFunctionsDescriptor(Handle h, long handle) { super(h, handle); }
    protected MTL4RenderPipelineBinaryFunctionsDescriptor(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "vertexAdditionalBinaryFunctions")
    public native NSArray<MTL4BinaryFunction> getVertexAdditionalBinaryFunctions();
    @Property(selector = "setVertexAdditionalBinaryFunctions:")
    public native void setVertexAdditionalBinaryFunctions(NSArray<MTL4BinaryFunction> v);
    @Property(selector = "fragmentAdditionalBinaryFunctions")
    public native NSArray<MTL4BinaryFunction> getFragmentAdditionalBinaryFunctions();
    @Property(selector = "setFragmentAdditionalBinaryFunctions:")
    public native void setFragmentAdditionalBinaryFunctions(NSArray<MTL4BinaryFunction> v);
    @Property(selector = "tileAdditionalBinaryFunctions")
    public native NSArray<MTL4BinaryFunction> getTileAdditionalBinaryFunctions();
    @Property(selector = "setTileAdditionalBinaryFunctions:")
    public native void setTileAdditionalBinaryFunctions(NSArray<MTL4BinaryFunction> v);
    @Property(selector = "objectAdditionalBinaryFunctions")
    public native NSArray<MTL4BinaryFunction> getObjectAdditionalBinaryFunctions();
    @Property(selector = "setObjectAdditionalBinaryFunctions:")
    public native void setObjectAdditionalBinaryFunctions(NSArray<MTL4BinaryFunction> v);
    @Property(selector = "meshAdditionalBinaryFunctions")
    public native NSArray<MTL4BinaryFunction> getMeshAdditionalBinaryFunctions();
    @Property(selector = "setMeshAdditionalBinaryFunctions:")
    public native void setMeshAdditionalBinaryFunctions(NSArray<MTL4BinaryFunction> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "reset")
    public native void reset();
    /*</methods>*/
}
