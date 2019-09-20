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
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ModelIO") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MDLAnimatedQuaternion/*</name>*/ 
    extends /*<extends>*/MDLAnimatedValue/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MDLAnimatedQuaternionPtr extends Ptr<MDLAnimatedQuaternion, MDLAnimatedQuaternionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MDLAnimatedQuaternion.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MDLAnimatedQuaternion() {}
    protected MDLAnimatedQuaternion(Handle h, long handle) { super(h, handle); }
    protected MDLAnimatedQuaternion(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setFloatQuaternion:atTime:")
    public native void setFloatQuaternion(@ByVal VectorFloat4 value, double time);
    @Method(selector = "setDoubleQuaternion:atTime:")
    public native void setDoubleQuaternion(@ByVal VectorDouble4 value, double time);
    @Method(selector = "floatQuaternionAtTime:")
    public native @ByVal VectorFloat4 floatQuaternionAtTime(double time);
    @Method(selector = "doubleQuaternionAtTime:")
    public native @ByVal VectorDouble4 doubleQuaternionAtTime(double time);
    @Method(selector = "resetWithFloatQuaternionArray:atTimes:count:")
    public native void reset(VectorFloat4 valuesArray, DoublePtr timesArray, @MachineSizedUInt long count);
    @Method(selector = "resetWithDoubleQuaternionArray:atTimes:count:")
    public native void reset(VectorDouble4 valuesArray, DoublePtr timesArray, @MachineSizedUInt long count);
    @Method(selector = "getFloatQuaternionArray:maxCount:")
    public native @MachineSizedUInt long getFloatQuaternionArray(VectorFloat4 valuesArray, @MachineSizedUInt long maxCount);
    @Method(selector = "getDoubleQuaternionArray:maxCount:")
    public native @MachineSizedUInt long getDoubleQuaternionArray(VectorDouble4 valuesArray, @MachineSizedUInt long maxCount);
    /*</methods>*/
}
