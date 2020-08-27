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
/*<annotations>*/@Library("Metal") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLAccelerationStructureBoundingBoxGeometryDescriptor/*</name>*/ 
    extends /*<extends>*/MTLAccelerationStructureGeometryDescriptor/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTLAccelerationStructureBoundingBoxGeometryDescriptorPtr extends Ptr<MTLAccelerationStructureBoundingBoxGeometryDescriptor, MTLAccelerationStructureBoundingBoxGeometryDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTLAccelerationStructureBoundingBoxGeometryDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTLAccelerationStructureBoundingBoxGeometryDescriptor() {}
    protected MTLAccelerationStructureBoundingBoxGeometryDescriptor(Handle h, long handle) { super(h, handle); }
    protected MTLAccelerationStructureBoundingBoxGeometryDescriptor(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "boundingBoxBuffer")
    public native MTLBuffer getBoundingBoxBuffer();
    @Property(selector = "setBoundingBoxBuffer:")
    public native void setBoundingBoxBuffer(MTLBuffer v);
    @Property(selector = "boundingBoxBufferOffset")
    public native @MachineSizedUInt long getBoundingBoxBufferOffset();
    @Property(selector = "setBoundingBoxBufferOffset:")
    public native void setBoundingBoxBufferOffset(@MachineSizedUInt long v);
    @Property(selector = "boundingBoxStride")
    public native @MachineSizedUInt long getBoundingBoxStride();
    @Property(selector = "setBoundingBoxStride:")
    public native void setBoundingBoxStride(@MachineSizedUInt long v);
    @Property(selector = "boundingBoxCount")
    public native @MachineSizedUInt long getBoundingBoxCount();
    @Property(selector = "setBoundingBoxCount:")
    public native void setBoundingBoxCount(@MachineSizedUInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "descriptor")
    public static native MTLAccelerationStructureBoundingBoxGeometryDescriptor descriptor();
    /*</methods>*/
}
