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
package org.robovm.apple.pencilkit;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("PencilKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PKStrokePath/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PKStrokePathPtr extends Ptr<PKStrokePath, PKStrokePathPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PKStrokePath.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PKStrokePath() {}
    protected PKStrokePath(Handle h, long handle) { super(h, handle); }
    protected PKStrokePath(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithControlPoints:creationDate:")
    public PKStrokePath(NSArray<PKStrokePoint> controlPoints, NSDate creationDate) { super((SkipInit) null); initObject(init(controlPoints, creationDate)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "count")
    public native @MachineSizedUInt long getCount();
    @Property(selector = "creationDate")
    public native NSDate getCreationDate();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithControlPoints:creationDate:")
    protected native @Pointer long init(NSArray<PKStrokePoint> controlPoints, NSDate creationDate);
    @Method(selector = "pointAtIndex:")
    public native PKStrokePoint pointAtIndex(@MachineSizedUInt long i);
    @Method(selector = "objectAtIndexedSubscript:")
    public native PKStrokePoint objectAtIndexedSubscript(@MachineSizedUInt long i);
    @Method(selector = "interpolatedLocationAt:")
    public native @ByVal CGPoint interpolatedLocationAt(@MachineSizedFloat double parametricValue);
    @Method(selector = "interpolatedPointAt:")
    public native PKStrokePoint interpolatedPointAt(@MachineSizedFloat double parametricValue);
    @Method(selector = "enumerateInterpolatedPointsInRange:strideByDistance:usingBlock:")
    public native void enumerateInterpolatedPointsStrideByDistance(PKFloatRange range, @MachineSizedFloat double distanceStep, @Block VoidBlock2<PKStrokePoint, BooleanPtr> block);
    @Method(selector = "enumerateInterpolatedPointsInRange:strideByTime:usingBlock:")
    public native void enumerateInterpolatedPointsStrideByTime(PKFloatRange range, double timeStep, @Block VoidBlock2<PKStrokePoint, BooleanPtr> block);
    @Method(selector = "enumerateInterpolatedPointsInRange:strideByParametricStep:usingBlock:")
    public native void enumerateInterpolatedPointsStrideByParametricStep(PKFloatRange range, @MachineSizedFloat double parametricStep, @Block VoidBlock2<PKStrokePoint, BooleanPtr> block);
    @Method(selector = "parametricValue:offsetByDistance:")
    public native @MachineSizedFloat double getParametricValueOffsetByDistance(@MachineSizedFloat double parametricValue, @MachineSizedFloat double distanceStep);
    @Method(selector = "parametricValue:offsetByTime:")
    public native @MachineSizedFloat double getParametricValueOffsetByTime(@MachineSizedFloat double parametricValue, double timeStep);
    /*</methods>*/
}
