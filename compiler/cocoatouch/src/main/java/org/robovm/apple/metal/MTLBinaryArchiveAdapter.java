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
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLBinaryArchiveAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MTLBinaryArchive/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("label")
    public String getLabel() { return null; }
    @NotImplemented("setLabel:")
    public void setLabel(String v) {}
    @NotImplemented("device")
    public MTLDevice getDevice() { return null; }
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("addComputePipelineFunctionsWithDescriptor:error:")
    public boolean addComputePipeline(MTLComputePipelineDescriptor descriptor, NSError.NSErrorPtr error) { return false; }
    @NotImplemented("addRenderPipelineFunctionsWithDescriptor:error:")
    public boolean addRenderPipelineFunctions(MTLRenderPipelineDescriptor descriptor, NSError.NSErrorPtr error) { return false; }
    @NotImplemented("addTileRenderPipelineFunctionsWithDescriptor:error:")
    public boolean addTileRenderPipelineFunctions(MTLTileRenderPipelineDescriptor descriptor, NSError.NSErrorPtr error) { return false; }
    @NotImplemented("serializeToURL:error:")
    public boolean serializeToURL(NSURL url, NSError.NSErrorPtr error) { return false; }
    /**
     * @since Available in iOS 15.0 and later.
     */
    @NotImplemented("addFunctionWithDescriptor:library:error:")
    public boolean addFunction(MTLFunctionDescriptor descriptor, MTLLibrary library, NSError.NSErrorPtr error) { return false; }
    /*</methods>*/
}
