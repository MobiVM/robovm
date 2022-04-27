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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MDLAnimatedVector3/*</name>*/ 
    extends /*<extends>*/MDLAnimatedValue/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MDLAnimatedVector3Ptr extends Ptr<MDLAnimatedVector3, MDLAnimatedVector3Ptr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MDLAnimatedVector3.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MDLAnimatedVector3() {}
    protected MDLAnimatedVector3(Handle h, long handle) { super(h, handle); }
    protected MDLAnimatedVector3(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setFloat3:atTime:")
    public native void setFloat3(@ByVal VectorFloat3 value, double time);
    @Method(selector = "setDouble3:atTime:")
    public native void setDouble3(@ByVal VectorDouble3 value, double time);
    @Method(selector = "float3AtTime:")
    public native @ByVal VectorFloat3 float3AtTime(double time);
    @Method(selector = "double3AtTime:")
    public native @ByVal VectorDouble3 double3AtTime(double time);
    @Method(selector = "resetWithFloat3Array:atTimes:count:")
    public native void resetWithFloat3Array(VectorFloat3 valuesArray, DoublePtr timesArray, @MachineSizedUInt long count);
    @Method(selector = "resetWithDouble3Array:atTimes:count:")
    public native void resetWithDouble3Array(VectorDouble3 valuesArray, DoublePtr timesArray, @MachineSizedUInt long count);
    @Method(selector = "getFloat3Array:maxCount:")
    public native @MachineSizedUInt long getFloat3Array(VectorFloat3 valuesArray, @MachineSizedUInt long maxCount);
    @Method(selector = "getDouble3Array:maxCount:")
    public native @MachineSizedUInt long getDouble3Array(VectorDouble3 valuesArray, @MachineSizedUInt long maxCount);
    /*</methods>*/
}
