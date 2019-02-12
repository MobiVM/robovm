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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MDLAnimatedVector4/*</name>*/ 
    extends /*<extends>*/MDLAnimatedValue/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MDLAnimatedVector4Ptr extends Ptr<MDLAnimatedVector4, MDLAnimatedVector4Ptr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MDLAnimatedVector4.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MDLAnimatedVector4() {}
    protected MDLAnimatedVector4(Handle h, long handle) { super(h, handle); }
    protected MDLAnimatedVector4(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setFloat4:atTime:")
    public native void setFloat4(@ByVal VectorFloat4 value, double time);
    @Method(selector = "setDouble4:atTime:")
    public native void setDouble4(@ByVal VectorDouble4 value, double time);
    @Method(selector = "float4AtTime:")
    public native @ByVal VectorFloat4 float4AtTime(double time);
    @Method(selector = "double4AtTime:")
    public native @ByVal VectorDouble4 double4AtTime(double time);
    @Method(selector = "resetWithFloat4Array:atTimes:count:")
    public native void resetWithFloat4Array(VectorFloat4 valuesArray, DoublePtr timesArray, @MachineSizedUInt long count);
    @Method(selector = "resetWithDouble4Array:atTimes:count:")
    public native void resetWithDouble4Array(VectorDouble4 valuesArray, DoublePtr timesArray, @MachineSizedUInt long count);
    @Method(selector = "getFloat4Array:maxCount:")
    public native @MachineSizedUInt long getFloat4Array(VectorFloat4 valuesArray, @MachineSizedUInt long maxCount);
    @Method(selector = "getDouble4Array:maxCount:")
    public native @MachineSizedUInt long getDouble4Array(VectorDouble4 valuesArray, @MachineSizedUInt long maxCount);
    /*</methods>*/
}
