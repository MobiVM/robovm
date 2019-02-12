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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MDLAnimatedVector2/*</name>*/ 
    extends /*<extends>*/MDLAnimatedValue/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MDLAnimatedVector2Ptr extends Ptr<MDLAnimatedVector2, MDLAnimatedVector2Ptr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MDLAnimatedVector2.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MDLAnimatedVector2() {}
    protected MDLAnimatedVector2(Handle h, long handle) { super(h, handle); }
    protected MDLAnimatedVector2(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setFloat2:atTime:")
    public native void setFloat2(@ByVal VectorFloat2 value, double time);
    @Method(selector = "setDouble2:atTime:")
    public native void setDouble2(FunctionPtr value, double time);
    @Method(selector = "float2AtTime:")
    public native @ByVal VectorFloat2 float2AtTime(double time);
    @Method(selector = "double2AtTime:")
    public native FunctionPtr double2AtTime(double time);
    @Method(selector = "resetWithFloat2Array:atTimes:count:")
    public native void resetWithFloat2Array(VectorFloat2 valuesArray, DoublePtr timesArray, @MachineSizedUInt long count);
    @Method(selector = "resetWithDouble2Array:atTimes:count:")
    public native void resetWithDouble2Array(FunctionPtr.FunctionPtrPtr valuesArray, DoublePtr timesArray, @MachineSizedUInt long count);
    @Method(selector = "getFloat2Array:maxCount:")
    public native @MachineSizedUInt long getFloat2Array(VectorFloat2 valuesArray, @MachineSizedUInt long maxCount);
    @Method(selector = "getDouble2Array:maxCount:")
    public native @MachineSizedUInt long getDouble2Array(FunctionPtr.FunctionPtrPtr valuesArray, @MachineSizedUInt long maxCount);
    /*</methods>*/
}
