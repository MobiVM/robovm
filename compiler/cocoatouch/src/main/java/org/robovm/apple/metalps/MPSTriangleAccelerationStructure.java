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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSTriangleAccelerationStructure/*</name>*/ 
    extends /*<extends>*/MPSPolygonAccelerationStructure/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSTriangleAccelerationStructurePtr extends Ptr<MPSTriangleAccelerationStructure, MPSTriangleAccelerationStructurePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSTriangleAccelerationStructure.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPSTriangleAccelerationStructure() {}
    protected MPSTriangleAccelerationStructure(Handle h, long handle) { super(h, handle); }
    protected MPSTriangleAccelerationStructure(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:")
    public MPSTriangleAccelerationStructure(MTLDevice device) { super(device); }
    @Method(selector = "initWithCoder:device:")
    public MPSTriangleAccelerationStructure(NSCoder decoder, MTLDevice device) { super(decoder, device); }
    @Method(selector = "initWithGroup:")
    public MPSTriangleAccelerationStructure(MPSAccelerationStructureGroup group) { super(group); }
    @Method(selector = "initWithCoder:group:")
    public MPSTriangleAccelerationStructure(NSCoder aDecoder, MPSAccelerationStructureGroup group) { super(aDecoder, group); }
    @Method(selector = "initWithCoder:")
    public MPSTriangleAccelerationStructure(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "triangleCount")
    public native @MachineSizedUInt long getTriangleCount();
    @Property(selector = "setTriangleCount:")
    public native void setTriangleCount(@MachineSizedUInt long v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
