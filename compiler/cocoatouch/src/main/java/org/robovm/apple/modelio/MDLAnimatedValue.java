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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MDLAnimatedValue/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MDLAnimatedValuePtr extends Ptr<MDLAnimatedValue, MDLAnimatedValuePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MDLAnimatedValue.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MDLAnimatedValue() {}
    protected MDLAnimatedValue(Handle h, long handle) { super(h, handle); }
    protected MDLAnimatedValue(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "precision")
    public native MDLDataPrecision getPrecision();
    @Property(selector = "timeSampleCount")
    public native @MachineSizedUInt long getTimeSampleCount();
    @Property(selector = "minimumTime")
    public native double getMinimumTime();
    @Property(selector = "maximumTime")
    public native double getMaximumTime();
    @Property(selector = "interpolation")
    public native MDLAnimatedValueInterpolation getInterpolation();
    @Property(selector = "setInterpolation:")
    public native void setInterpolation(MDLAnimatedValueInterpolation v);
    @Property(selector = "keyTimes")
    public native NSArray<NSNumber> getKeyTimes();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "isAnimated")
    public native boolean isAnimated();
    @Method(selector = "clear")
    public native void clear();
    @Method(selector = "getTimes:maxCount:")
    public native @MachineSizedUInt long getTimes(DoublePtr timesArray, @MachineSizedUInt long maxCount);
    /*</methods>*/
}
