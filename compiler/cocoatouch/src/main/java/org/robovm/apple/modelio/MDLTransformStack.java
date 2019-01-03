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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MDLTransformStack/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MDLTransformComponent/*</implements>*/ {

    /*<ptr>*/public static class MDLTransformStackPtr extends Ptr<MDLTransformStack, MDLTransformStackPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MDLTransformStack.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MDLTransformStack() {}
    protected MDLTransformStack(Handle h, long handle) { super(h, handle); }
    protected MDLTransformStack(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "keyTimes")
    public native NSArray<NSNumber> getKeyTimes();
    @Property(selector = "transformOps")
    public native NSArray<?> getTransformOps();
    @Property(selector = "matrix")
    public native @ByVal MatrixFloat4x4 getMatrix();
    @Property(selector = "setMatrix:")
    public native void setMatrix(@ByVal MatrixFloat4x4 v);
    @Property(selector = "resetsTransform")
    public native boolean resetsTransform();
    @Property(selector = "setResetsTransform:")
    public native void setResetsTransform(boolean v);
    @Property(selector = "minimumTime")
    public native double getMinimumTime();
    @Property(selector = "maximumTime")
    public native double getMaximumTime();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "addTranslateOp:inverse:")
    public native MDLTransformTranslateOp addTranslateOp(String animatedValueName, boolean inverse);
    @Method(selector = "addRotateXOp:inverse:")
    public native MDLTransformRotateXOp addRotateXOp(String animatedValueName, boolean inverse);
    @Method(selector = "addRotateYOp:inverse:")
    public native MDLTransformRotateYOp addRotateYOp(String animatedValueName, boolean inverse);
    @Method(selector = "addRotateZOp:inverse:")
    public native MDLTransformRotateZOp addRotateZOp(String animatedValueName, boolean inverse);
    @Method(selector = "addRotateOp:order:inverse:")
    public native MDLTransformRotateOp addRotateOp(String animatedValueName, MDLTransformOpRotationOrder order, boolean inverse);
    @Method(selector = "addScaleOp:inverse:")
    public native MDLTransformScaleOp addScaleOp(String animatedValueName, boolean inverse);
    @Method(selector = "addMatrixOp:inverse:")
    public native MDLTransformMatrixOp addMatrixOp(String animatedValueName, boolean inverse);
    @Method(selector = "animatedValueWithName:")
    public native MDLAnimatedValue getAnimatedValue(String name);
    @Method(selector = "float4x4AtTime:")
    public native @ByVal MatrixFloat4x4 float4x4AtTime(double time);
    @Method(selector = "double4x4AtTime:")
    public native @ByVal MatrixDouble4x4 double4x4AtTime(double time);
    @Method(selector = "count")
    public native @MachineSizedUInt long count();
    @Method(selector = "setLocalTransform:forTime:")
    public native void setLocalTransform(@ByVal MatrixFloat4x4 transform, double time);
    @Method(selector = "setLocalTransform:")
    public native void setLocalTransform(@ByVal MatrixFloat4x4 transform);
    @Method(selector = "localTransformAtTime:")
    public native @ByVal MatrixFloat4x4 getLocalTransform(double time);
    /*</methods>*/
}
