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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MDLAnimatedScalar/*</name>*/ 
    extends /*<extends>*/MDLAnimatedValue/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MDLAnimatedScalarPtr extends Ptr<MDLAnimatedScalar, MDLAnimatedScalarPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MDLAnimatedScalar.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MDLAnimatedScalar() {}
    protected MDLAnimatedScalar(Handle h, long handle) { super(h, handle); }
    protected MDLAnimatedScalar(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setFloat:atTime:")
    public native void setFloat(float value, double time);
    @Method(selector = "setDouble:atTime:")
    public native void setDouble(double value, double time);
    @Method(selector = "floatAtTime:")
    public native float floatAtTime(double time);
    @Method(selector = "doubleAtTime:")
    public native double doubleAtTime(double time);
    @Method(selector = "resetWithFloatArray:atTimes:count:")
    public native void resetWithFloatArray(FloatPtr valuesArray, DoublePtr timesArray, @MachineSizedUInt long count);
    @Method(selector = "resetWithDoubleArray:atTimes:count:")
    public native void resetWithDoubleArray(DoublePtr valuesArray, DoublePtr timesArray, @MachineSizedUInt long count);
    @Method(selector = "getFloatArray:maxCount:")
    public native @MachineSizedUInt long getFloatArray(FloatPtr valuesArray, @MachineSizedUInt long maxCount);
    @Method(selector = "getDoubleArray:maxCount:")
    public native @MachineSizedUInt long getDoubleArray(DoublePtr valuesArray, @MachineSizedUInt long maxCount);
    /*</methods>*/
}
