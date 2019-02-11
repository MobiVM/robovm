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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MDLAnimatedVector3Array/*</name>*/ 
    extends /*<extends>*/MDLAnimatedValue/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MDLAnimatedVector3ArrayPtr extends Ptr<MDLAnimatedVector3Array, MDLAnimatedVector3ArrayPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MDLAnimatedVector3Array.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MDLAnimatedVector3Array() {}
    protected MDLAnimatedVector3Array(Handle h, long handle) { super(h, handle); }
    protected MDLAnimatedVector3Array(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithElementCount:")
    public MDLAnimatedVector3Array(@MachineSizedUInt long arrayElementCount) { super((SkipInit) null); initObject(init(arrayElementCount)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "elementCount")
    public native @MachineSizedUInt long getElementCount();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithElementCount:")
    protected native @Pointer long init(@MachineSizedUInt long arrayElementCount);
    @Method(selector = "setFloat3Array:count:atTime:")
    public native void setFloat3Array(VectorFloat3 array, @MachineSizedUInt long count, double time);
    @Method(selector = "setDouble3Array:count:atTime:")
    public native void setDouble3Array(FunctionPtr.FunctionPtrPtr array, @MachineSizedUInt long count, double time);
    @Method(selector = "getFloat3Array:maxCount:atTime:")
    public native @MachineSizedUInt long getFloat3Array(VectorFloat3 array, @MachineSizedUInt long maxCount, double time);
    @Method(selector = "getDouble3Array:maxCount:atTime:")
    public native @MachineSizedUInt long getDouble3Array(FunctionPtr.FunctionPtrPtr array, @MachineSizedUInt long maxCount, double time);
    @Method(selector = "resetWithFloat3Array:count:atTimes:count:")
    public native void resetWithFloat3Array(VectorFloat3 valuesArray, @MachineSizedUInt long valuesCount, DoublePtr timesArray, @MachineSizedUInt long timesCount);
    @Method(selector = "resetWithDouble3Array:count:atTimes:count:")
    public native void resetWithDouble3Array(FunctionPtr.FunctionPtrPtr valuesArray, @MachineSizedUInt long valuesCount, DoublePtr timesArray, @MachineSizedUInt long timesCount);
    @Method(selector = "getFloat3Array:maxCount:")
    public native @MachineSizedUInt long getFloat3Array(VectorFloat3 valuesArray, @MachineSizedUInt long maxCount);
    @Method(selector = "getDouble3Array:maxCount:")
    public native @MachineSizedUInt long getDouble3Array(FunctionPtr.FunctionPtrPtr valuesArray, @MachineSizedUInt long maxCount);
    /*</methods>*/
}
