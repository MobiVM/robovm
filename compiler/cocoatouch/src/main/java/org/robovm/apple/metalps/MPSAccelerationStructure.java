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
package org.robovm.apple.metalps;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShaders") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSAccelerationStructure/*</name>*/ 
    extends /*<extends>*/MPSKernel/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class MPSAccelerationStructurePtr extends Ptr<MPSAccelerationStructure, MPSAccelerationStructurePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSAccelerationStructure.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPSAccelerationStructure() {}
    protected MPSAccelerationStructure(Handle h, long handle) { super(h, handle); }
    protected MPSAccelerationStructure(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:")
    public MPSAccelerationStructure(MTLDevice device) { super((SkipInit) null); initObject(init(device)); }
    @Method(selector = "initWithCoder:device:")
    public MPSAccelerationStructure(NSCoder decoder, MTLDevice device) { super((SkipInit) null); initObject(init(decoder, device)); }
    @Method(selector = "initWithGroup:")
    public MPSAccelerationStructure(MPSAccelerationStructureGroup group) { super((SkipInit) null); initObject(init(group)); }
    @Method(selector = "initWithCoder:group:")
    public MPSAccelerationStructure(NSCoder aDecoder, MPSAccelerationStructureGroup group) { super((SkipInit) null); initObject(init(aDecoder, group)); }
    @Method(selector = "initWithCoder:")
    public MPSAccelerationStructure(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "group")
    public native MPSAccelerationStructureGroup getGroup();
    @Property(selector = "boundingBox")
    public native @ByVal MPSAxisAlignedBoundingBox getBoundingBox();
    @Property(selector = "status")
    public native MPSAccelerationStructureStatus getStatus();
    @Property(selector = "usage")
    public native MPSAccelerationStructureUsage getUsage();
    @Property(selector = "setUsage:")
    public native void setUsage(MPSAccelerationStructureUsage v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:")
    protected native @Pointer long init(MTLDevice device);
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder decoder, MTLDevice device);
    @Method(selector = "initWithGroup:")
    protected native @Pointer long init(MPSAccelerationStructureGroup group);
    @Method(selector = "initWithCoder:group:")
    protected native @Pointer long init(NSCoder aDecoder, MPSAccelerationStructureGroup group);
    @Method(selector = "rebuild")
    public native void rebuild();
    @Method(selector = "rebuildWithCompletionHandler:")
    public native void rebuild(@Block VoidBlock1<MPSAccelerationStructure> completionHandler);
    @Method(selector = "encodeRefitToCommandBuffer:")
    public native void encodeRefitToCommandBuffer(MTLCommandBuffer commandBuffer);
    @Method(selector = "copyWithZone:device:")
    public native MPSAccelerationStructure copy(NSZone zone, MTLDevice device);
    @Method(selector = "copyWithZone:group:")
    public native MPSAccelerationStructure copy(NSZone zone, MPSAccelerationStructureGroup group);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    /*</methods>*/
}
