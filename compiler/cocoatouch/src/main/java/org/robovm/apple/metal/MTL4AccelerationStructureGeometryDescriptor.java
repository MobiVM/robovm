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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTL4AccelerationStructureGeometryDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTL4AccelerationStructureGeometryDescriptorPtr extends Ptr<MTL4AccelerationStructureGeometryDescriptor, MTL4AccelerationStructureGeometryDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTL4AccelerationStructureGeometryDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTL4AccelerationStructureGeometryDescriptor() {}
    protected MTL4AccelerationStructureGeometryDescriptor(Handle h, long handle) { super(h, handle); }
    protected MTL4AccelerationStructureGeometryDescriptor(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "intersectionFunctionTableOffset")
    public native @MachineSizedUInt long getIntersectionFunctionTableOffset();
    @Property(selector = "setIntersectionFunctionTableOffset:")
    public native void setIntersectionFunctionTableOffset(@MachineSizedUInt long v);
    @Property(selector = "opaque")
    public native boolean isOpaque();
    @Property(selector = "setOpaque:")
    public native void setOpaque(boolean v);
    @Property(selector = "allowDuplicateIntersectionFunctionInvocation")
    public native boolean isAllowDuplicateIntersectionFunctionInvocation();
    @Property(selector = "setAllowDuplicateIntersectionFunctionInvocation:")
    public native void setAllowDuplicateIntersectionFunctionInvocation(boolean v);
    @Property(selector = "label")
    public native String getLabel();
    @Property(selector = "setLabel:")
    public native void setLabel(String v);
    @Property(selector = "primitiveDataBuffer")
    public native @ByVal MTL4BufferRange getPrimitiveDataBuffer();
    @Property(selector = "setPrimitiveDataBuffer:")
    public native void setPrimitiveDataBuffer(@ByVal MTL4BufferRange v);
    @Property(selector = "primitiveDataStride")
    public native @MachineSizedUInt long getPrimitiveDataStride();
    @Property(selector = "setPrimitiveDataStride:")
    public native void setPrimitiveDataStride(@MachineSizedUInt long v);
    @Property(selector = "primitiveDataElementSize")
    public native @MachineSizedUInt long getPrimitiveDataElementSize();
    @Property(selector = "setPrimitiveDataElementSize:")
    public native void setPrimitiveDataElementSize(@MachineSizedUInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
