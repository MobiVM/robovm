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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLPrimitiveAccelerationStructureDescriptor/*</name>*/ 
    extends /*<extends>*/MTLAccelerationStructureDescriptor/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTLPrimitiveAccelerationStructureDescriptorPtr extends Ptr<MTLPrimitiveAccelerationStructureDescriptor, MTLPrimitiveAccelerationStructureDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTLPrimitiveAccelerationStructureDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTLPrimitiveAccelerationStructureDescriptor() {}
    protected MTLPrimitiveAccelerationStructureDescriptor(Handle h, long handle) { super(h, handle); }
    protected MTLPrimitiveAccelerationStructureDescriptor(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "geometryDescriptors")
    public native NSArray<MTLAccelerationStructureGeometryDescriptor> getGeometryDescriptors();
    @Property(selector = "setGeometryDescriptors:")
    public native void setGeometryDescriptors(NSArray<MTLAccelerationStructureGeometryDescriptor> v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "motionStartBorderMode")
    public native MTLMotionBorderMode getMotionStartBorderMode();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setMotionStartBorderMode:")
    public native void setMotionStartBorderMode(MTLMotionBorderMode v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "motionEndBorderMode")
    public native MTLMotionBorderMode getMotionEndBorderMode();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setMotionEndBorderMode:")
    public native void setMotionEndBorderMode(MTLMotionBorderMode v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "motionStartTime")
    public native float getMotionStartTime();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setMotionStartTime:")
    public native void setMotionStartTime(float v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "motionEndTime")
    public native float getMotionEndTime();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setMotionEndTime:")
    public native void setMotionEndTime(float v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "motionKeyframeCount")
    public native @MachineSizedUInt long getMotionKeyframeCount();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setMotionKeyframeCount:")
    public native void setMotionKeyframeCount(@MachineSizedUInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "descriptor")
    public static native MTLPrimitiveAccelerationStructureDescriptor descriptor();
    /*</methods>*/
}
