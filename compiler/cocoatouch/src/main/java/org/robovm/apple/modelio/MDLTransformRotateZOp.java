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
package org.robovm.apple.modelio;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ModelIO") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MDLTransformRotateZOp/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MDLTransformOp/*</implements>*/ {

    /*<ptr>*/public static class MDLTransformRotateZOpPtr extends Ptr<MDLTransformRotateZOp, MDLTransformRotateZOpPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MDLTransformRotateZOp.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MDLTransformRotateZOp() {}
    protected MDLTransformRotateZOp(Handle h, long handle) { super(h, handle); }
    protected MDLTransformRotateZOp(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "animatedValue")
    public native MDLAnimatedScalar getAnimatedValue();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "float4x4AtTime:")
    public native @ByVal MatrixFloat4x4 float4x4AtTime(double time);
    @Method(selector = "double4x4AtTime:")
    public native @ByVal MatrixDouble4x4 double4x4AtTime(double time);
    @Method(selector = "IsInverseOp")
    public native boolean IsInverseOp();
    /*</methods>*/
}
