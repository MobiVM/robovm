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
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/MTLIntersectionFunctionTable/*</name>*/ 
    /*<implements>*/extends MTLResource/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "setBuffer:offset:atIndex:")
    void setBuffer(MTLBuffer buffer, @MachineSizedUInt long offset, @MachineSizedUInt long index);
    @Method(selector = "setBuffers:offsets:withRange:")
    void setBuffers(MTLBuffer buffers, MachineSizedUIntPtr offsets, @ByVal NSRange range);
    @Method(selector = "setFunction:atIndex:")
    void setFunction(MTLFunctionHandle function, @MachineSizedUInt long index);
    @Method(selector = "setFunctions:withRange:")
    void setFunctions(MTLFunctionHandle functions, @ByVal NSRange range);
    @Method(selector = "setOpaqueTriangleIntersectionFunctionWithSignature:atIndex:")
    void setOpaqueTriangleIntersectionFunction(MTLIntersectionFunctionSignature signature, @MachineSizedUInt long index);
    @Method(selector = "setOpaqueTriangleIntersectionFunctionWithSignature:withRange:")
    void setOpaqueTriangleIntersectionFunction(MTLIntersectionFunctionSignature signature, @ByVal NSRange range);
    @Method(selector = "setVisibleFunctionTable:atBufferIndex:")
    void setVisibleFunctionTable(MTLVisibleFunctionTable functionTable, @MachineSizedUInt long bufferIndex);
    @Method(selector = "setVisibleFunctionTables:withBufferRange:")
    void setVisibleFunctionTables(MTLVisibleFunctionTable functionTables, @ByVal NSRange bufferRange);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
