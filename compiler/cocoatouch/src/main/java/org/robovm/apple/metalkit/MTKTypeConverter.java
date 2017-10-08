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
package org.robovm.apple.metalkit;

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
import org.robovm.apple.metal.*;
import org.robovm.apple.modelio.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("MetalKit")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTKTypeConverter/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(MTKTypeConverter.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Bridge(symbol="MTKModelIOVertexDescriptorFromMetal", optional=true)
    public static native MDLVertexDescriptor convertVertexDescriptor(MTLVertexDescriptor metalDescriptor);
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static MDLVertexDescriptor convertVertexDescriptorEx(MTLVertexDescriptor metalDescriptor) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       MDLVertexDescriptor result = convertVertexDescriptorEx(metalDescriptor, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Bridge(symbol="MTKModelIOVertexDescriptorFromMetalWithError", optional=true)
    private static native MDLVertexDescriptor convertVertexDescriptorEx(MTLVertexDescriptor metalDescriptor, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Bridge(symbol="MTKMetalVertexDescriptorFromModelIO", optional=true)
    public static native MTLVertexDescriptor convertVertexDescriptor(MDLVertexDescriptor modelIODescriptor);
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static MTLVertexDescriptor convertVertexDescriptorEx(MDLVertexDescriptor modelIODescriptor) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       MTLVertexDescriptor result = convertVertexDescriptorEx(modelIODescriptor, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Bridge(symbol="MTKMetalVertexDescriptorFromModelIOWithError", optional=true)
    private static native MTLVertexDescriptor convertVertexDescriptorEx(MDLVertexDescriptor modelIODescriptor, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Bridge(symbol="MTKModelIOVertexFormatFromMetal", optional=true)
    public static native MDLVertexFormat convertVertexFormat(MTLVertexFormat vertexFormat);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Bridge(symbol="MTKMetalVertexFormatFromModelIO", optional=true)
    public static native MTLVertexFormat convertVertexFormat(MDLVertexFormat vertexFormat);
    /*</methods>*/
}
