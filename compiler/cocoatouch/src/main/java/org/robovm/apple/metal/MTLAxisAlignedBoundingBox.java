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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLAxisAlignedBoundingBox/*</name>*/ 
    extends /*<extends>*/Struct<MTLAxisAlignedBoundingBox>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTLAxisAlignedBoundingBoxPtr extends Ptr<MTLAxisAlignedBoundingBox, MTLAxisAlignedBoundingBoxPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTLAxisAlignedBoundingBox() {}
    public MTLAxisAlignedBoundingBox(MTLPackedFloat3 min, MTLPackedFloat3 max) {
        this.setMin(min);
        this.setMax(max);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native @ByVal MTLPackedFloat3 getMin();
    @StructMember(0) public native MTLAxisAlignedBoundingBox setMin(@ByVal MTLPackedFloat3 min);
    @StructMember(1) public native @ByVal MTLPackedFloat3 getMax();
    @StructMember(1) public native MTLAxisAlignedBoundingBox setMax(@ByVal MTLPackedFloat3 max);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
