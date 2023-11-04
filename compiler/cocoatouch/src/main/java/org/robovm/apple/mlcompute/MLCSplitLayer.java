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
package org.robovm.apple.mlcompute;

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
import org.robovm.apple.metal.*;
import org.robovm.apple.metalps.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 * @deprecated Use Metal Performance Shaders Graph or BNNS instead.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MLCompute") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MLCSplitLayer/*</name>*/ 
    extends /*<extends>*/MLCLayer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MLCSplitLayerPtr extends Ptr<MLCSplitLayer, MLCSplitLayerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MLCSplitLayer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MLCSplitLayer() {}
    protected MLCSplitLayer(Handle h, long handle) { super(h, handle); }
    protected MLCSplitLayer(SkipInit skipInit) { super(skipInit); }
    public MLCSplitLayer(@MachineSizedUInt long splitCount, @MachineSizedUInt long dimension) { super((Handle) null, create(splitCount, dimension)); retain(getHandle()); }
    public MLCSplitLayer(NSArray<NSNumber> splitSectionLengths, @MachineSizedUInt long dimension) { super((Handle) null, create(splitSectionLengths, dimension)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "dimension")
    public native @MachineSizedUInt long getDimension();
    @Property(selector = "splitCount")
    public native @MachineSizedUInt long getSplitCount();
    @Property(selector = "splitSectionLengths")
    public native NSArray<NSNumber> getSplitSectionLengths();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "layerWithSplitCount:dimension:")
    protected static native @Pointer long create(@MachineSizedUInt long splitCount, @MachineSizedUInt long dimension);
    @Method(selector = "layerWithSplitSectionLengths:dimension:")
    protected static native @Pointer long create(NSArray<NSNumber> splitSectionLengths, @MachineSizedUInt long dimension);
    @Method(selector = "supportsDataType:onDevice:")
    public static native boolean supportsDataType(MLCDataType dataType, MLCDevice device);
    /*</methods>*/
}
