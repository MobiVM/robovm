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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MDLAnimatedScalarArray/*</name>*/ 
    extends /*<extends>*/MDLAnimatedValue/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MDLAnimatedScalarArrayPtr extends Ptr<MDLAnimatedScalarArray, MDLAnimatedScalarArrayPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MDLAnimatedScalarArray.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MDLAnimatedScalarArray() {}
    protected MDLAnimatedScalarArray(Handle h, long handle) { super(h, handle); }
    protected MDLAnimatedScalarArray(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithElementCount:")
    public MDLAnimatedScalarArray(@MachineSizedUInt long arrayElementCount) { super((SkipInit) null); initObject(init(arrayElementCount)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "elementCount")
    public native @MachineSizedUInt long getElementCount();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithElementCount:")
    protected native @Pointer long init(@MachineSizedUInt long arrayElementCount);
    @Method(selector = "setFloatArray:count:atTime:")
    public native void setFloatArray(FloatPtr array, @MachineSizedUInt long count, double time);
    @Method(selector = "setDoubleArray:count:atTime:")
    public native void setDoubleArray(DoublePtr array, @MachineSizedUInt long count, double time);
    @Method(selector = "getFloatArray:maxCount:atTime:")
    public native @MachineSizedUInt long getFloatArray(FloatPtr array, @MachineSizedUInt long maxCount, double time);
    @Method(selector = "getDoubleArray:maxCount:atTime:")
    public native @MachineSizedUInt long getDoubleArray(DoublePtr array, @MachineSizedUInt long maxCount, double time);
    @Method(selector = "resetWithFloatArray:count:atTimes:count:")
    public native void resetWithFloatArray(FloatPtr valuesArray, @MachineSizedUInt long valuesCount, DoublePtr timesArray, @MachineSizedUInt long timesCount);
    @Method(selector = "resetWithDoubleArray:count:atTimes:count:")
    public native void resetWithDoubleArray(DoublePtr valuesArray, @MachineSizedUInt long valuesCount, DoublePtr timesArray, @MachineSizedUInt long timesCount);
    @Method(selector = "getFloatArray:maxCount:")
    public native @MachineSizedUInt long getFloatArray(FloatPtr valuesArray, @MachineSizedUInt long maxCount);
    @Method(selector = "getDoubleArray:maxCount:")
    public native @MachineSizedUInt long getDoubleArray(DoublePtr valuesArray, @MachineSizedUInt long maxCount);
    /*</methods>*/
}
