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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MDLAnimatedQuaternionArray/*</name>*/ 
    extends /*<extends>*/MDLAnimatedValue/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MDLAnimatedQuaternionArrayPtr extends Ptr<MDLAnimatedQuaternionArray, MDLAnimatedQuaternionArrayPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MDLAnimatedQuaternionArray.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MDLAnimatedQuaternionArray() {}
    protected MDLAnimatedQuaternionArray(Handle h, long handle) { super(h, handle); }
    protected MDLAnimatedQuaternionArray(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithElementCount:")
    public MDLAnimatedQuaternionArray(@MachineSizedUInt long arrayElementCount) { super((SkipInit) null); initObject(init(arrayElementCount)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "elementCount")
    public native @MachineSizedUInt long getElementCount();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithElementCount:")
    protected native @Pointer long init(@MachineSizedUInt long arrayElementCount);
    @Method(selector = "setFloatQuaternionArray:count:atTime:")
    public native void setFloatQuaternionArray(VectorFloat4.VectorFloat4Ptr array, @MachineSizedUInt long count, double time);
    @Method(selector = "setDoubleQuaternionArray:count:atTime:")
    public native void setDoubleQuaternionArray(VectorFloat4.VectorFloat4Ptr array, @MachineSizedUInt long count, double time);
    @Method(selector = "getFloatQuaternionArray:maxCount:atTime:")
    public native @MachineSizedUInt long getFloatQuaternionArray(VectorFloat4.VectorFloat4Ptr array, @MachineSizedUInt long maxCount, double time);
    @Method(selector = "getDoubleQuaternionArray:maxCount:atTime:")
    public native @MachineSizedUInt long getDoubleQuaternionArray(VectorFloat4.VectorFloat4Ptr array, @MachineSizedUInt long maxCount, double time);
    @Method(selector = "resetWithFloatQuaternionArray:count:atTimes:count:")
    public native void resetWithFloatQuaternionArray(VectorFloat4.VectorFloat4Ptr valuesArray, @MachineSizedUInt long valuesCount, DoublePtr timesArray, @MachineSizedUInt long timesCount);
    @Method(selector = "resetWithDoubleQuaternionArray:count:atTimes:count:")
    public native void resetWithDoubleQuaternionArray(VectorFloat4.VectorFloat4Ptr valuesArray, @MachineSizedUInt long valuesCount, DoublePtr timesArray, @MachineSizedUInt long timesCount);
    @Method(selector = "getFloatQuaternionArray:maxCount:")
    public native @MachineSizedUInt long getFloatQuaternionArray(VectorFloat4.VectorFloat4Ptr valuesArray, @MachineSizedUInt long maxCount);
    @Method(selector = "getDoubleQuaternionArray:maxCount:")
    public native @MachineSizedUInt long getDoubleQuaternionArray(VectorFloat4.VectorFloat4Ptr valuesArray, @MachineSizedUInt long maxCount);
    /*</methods>*/
}
