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
package org.robovm.apple.metalps;

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
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSRayPackedOriginDirection/*</name>*/ 
    extends /*<extends>*/Struct<MPSRayPackedOriginDirection>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSRayPackedOriginDirectionPtr extends Ptr<MPSRayPackedOriginDirection, MPSRayPackedOriginDirectionPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSRayPackedOriginDirection() {}
    public MPSRayPackedOriginDirection(MPSPackedFloat3 origin, MPSPackedFloat3 direction) {
        this.setOrigin(origin);
        this.setDirection(direction);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native @ByVal MPSPackedFloat3 getOrigin();
    @StructMember(0) public native MPSRayPackedOriginDirection setOrigin(@ByVal MPSPackedFloat3 origin);
    @StructMember(1) public native @ByVal MPSPackedFloat3 getDirection();
    @StructMember(1) public native MPSRayPackedOriginDirection setDirection(@ByVal MPSPackedFloat3 direction);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
