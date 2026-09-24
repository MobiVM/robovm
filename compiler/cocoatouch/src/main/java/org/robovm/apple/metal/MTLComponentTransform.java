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

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLComponentTransform/*</name>*/ 
    extends /*<extends>*/Struct<MTLComponentTransform>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTLComponentTransformPtr extends Ptr<MTLComponentTransform, MTLComponentTransformPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTLComponentTransform() {}
    public MTLComponentTransform(MTLPackedFloat3 scale, MTLPackedFloat3 shear, MTLPackedFloat3 pivot, MTLPackedFloatQuaternion rotation, MTLPackedFloat3 translation) {
        this.setScale(scale);
        this.setShear(shear);
        this.setPivot(pivot);
        this.setRotation(rotation);
        this.setTranslation(translation);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native @ByVal MTLPackedFloat3 getScale();
    @StructMember(0) public native MTLComponentTransform setScale(@ByVal MTLPackedFloat3 scale);
    @StructMember(1) public native @ByVal MTLPackedFloat3 getShear();
    @StructMember(1) public native MTLComponentTransform setShear(@ByVal MTLPackedFloat3 shear);
    @StructMember(2) public native @ByVal MTLPackedFloat3 getPivot();
    @StructMember(2) public native MTLComponentTransform setPivot(@ByVal MTLPackedFloat3 pivot);
    @StructMember(3) public native @ByVal MTLPackedFloatQuaternion getRotation();
    @StructMember(3) public native MTLComponentTransform setRotation(@ByVal MTLPackedFloatQuaternion rotation);
    @StructMember(4) public native @ByVal MTLPackedFloat3 getTranslation();
    @StructMember(4) public native MTLComponentTransform setTranslation(@ByVal MTLPackedFloat3 translation);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
