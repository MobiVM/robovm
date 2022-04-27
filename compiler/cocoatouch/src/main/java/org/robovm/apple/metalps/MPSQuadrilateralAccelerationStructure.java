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
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShaders") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSQuadrilateralAccelerationStructure/*</name>*/ 
    extends /*<extends>*/MPSPolygonAccelerationStructure/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSQuadrilateralAccelerationStructurePtr extends Ptr<MPSQuadrilateralAccelerationStructure, MPSQuadrilateralAccelerationStructurePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSQuadrilateralAccelerationStructure.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPSQuadrilateralAccelerationStructure() {}
    protected MPSQuadrilateralAccelerationStructure(Handle h, long handle) { super(h, handle); }
    protected MPSQuadrilateralAccelerationStructure(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:")
    public MPSQuadrilateralAccelerationStructure(MTLDevice device) { super(device); }
    @Method(selector = "initWithCoder:device:")
    public MPSQuadrilateralAccelerationStructure(NSCoder decoder, MTLDevice device) { super(decoder, device); }
    @Method(selector = "initWithGroup:")
    public MPSQuadrilateralAccelerationStructure(MPSAccelerationStructureGroup group) { super(group); }
    @Method(selector = "initWithCoder:group:")
    public MPSQuadrilateralAccelerationStructure(NSCoder aDecoder, MPSAccelerationStructureGroup group) { super(aDecoder, group); }
    @Method(selector = "initWithCoder:")
    public MPSQuadrilateralAccelerationStructure(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "quadrilateralCount")
    public native @MachineSizedUInt long getQuadrilateralCount();
    @Property(selector = "setQuadrilateralCount:")
    public native void setQuadrilateralCount(@MachineSizedUInt long v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
