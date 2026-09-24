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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTL4PrimitiveAccelerationStructureDescriptor/*</name>*/ 
    extends /*<extends>*/MTL4AccelerationStructureDescriptor/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTL4PrimitiveAccelerationStructureDescriptorPtr extends Ptr<MTL4PrimitiveAccelerationStructureDescriptor, MTL4PrimitiveAccelerationStructureDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTL4PrimitiveAccelerationStructureDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTL4PrimitiveAccelerationStructureDescriptor() {}
    protected MTL4PrimitiveAccelerationStructureDescriptor(Handle h, long handle) { super(h, handle); }
    protected MTL4PrimitiveAccelerationStructureDescriptor(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "geometryDescriptors")
    public native NSArray<MTL4AccelerationStructureGeometryDescriptor> getGeometryDescriptors();
    @Property(selector = "setGeometryDescriptors:")
    public native void setGeometryDescriptors(NSArray<MTL4AccelerationStructureGeometryDescriptor> v);
    @Property(selector = "motionStartBorderMode")
    public native MTLMotionBorderMode getMotionStartBorderMode();
    @Property(selector = "setMotionStartBorderMode:")
    public native void setMotionStartBorderMode(MTLMotionBorderMode v);
    @Property(selector = "motionEndBorderMode")
    public native MTLMotionBorderMode getMotionEndBorderMode();
    @Property(selector = "setMotionEndBorderMode:")
    public native void setMotionEndBorderMode(MTLMotionBorderMode v);
    @Property(selector = "motionStartTime")
    public native float getMotionStartTime();
    @Property(selector = "setMotionStartTime:")
    public native void setMotionStartTime(float v);
    @Property(selector = "motionEndTime")
    public native float getMotionEndTime();
    @Property(selector = "setMotionEndTime:")
    public native void setMotionEndTime(float v);
    @Property(selector = "motionKeyframeCount")
    public native @MachineSizedUInt long getMotionKeyframeCount();
    @Property(selector = "setMotionKeyframeCount:")
    public native void setMotionKeyframeCount(@MachineSizedUInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
