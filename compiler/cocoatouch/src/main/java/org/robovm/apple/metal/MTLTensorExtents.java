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
package org.robovm.apple.metal;

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
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 26.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Metal") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLTensorExtents/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTLTensorExtentsPtr extends Ptr<MTLTensorExtents, MTLTensorExtentsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTLTensorExtents.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTLTensorExtents() {}
    protected MTLTensorExtents(Handle h, long handle) { super(h, handle); }
    protected MTLTensorExtents(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithRank:values:")
    public MTLTensorExtents(@MachineSizedUInt long rank, MachineSizedSIntPtr values) { super((SkipInit) null); initObject(init(rank, values)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "rank")
    public native @MachineSizedUInt long getRank();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithRank:values:")
    protected native @Pointer long init(@MachineSizedUInt long rank, MachineSizedSIntPtr values);
    @Method(selector = "extentAtDimensionIndex:")
    public native @MachineSizedSInt long extentAtDimensionIndex(@MachineSizedUInt long dimensionIndex);
    /*</methods>*/
}
