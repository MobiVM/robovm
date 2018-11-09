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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSImageCoordinate/*</name>*/ 
    extends /*<extends>*/Struct<MPSImageCoordinate>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSImageCoordinatePtr extends Ptr<MPSImageCoordinate, MPSImageCoordinatePtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSImageCoordinate() {}
    public MPSImageCoordinate(@MachineSizedUInt long x, @MachineSizedUInt long y, @MachineSizedUInt long channel) {
        this.setX(x);
        this.setY(y);
        this.setChannel(channel);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native @MachineSizedUInt long getX();
    @StructMember(0) public native MPSImageCoordinate setX(@MachineSizedUInt long x);
    @StructMember(1) public native @MachineSizedUInt long getY();
    @StructMember(1) public native MPSImageCoordinate setY(@MachineSizedUInt long y);
    @StructMember(2) public native @MachineSizedUInt long getChannel();
    @StructMember(2) public native MPSImageCoordinate setChannel(@MachineSizedUInt long channel);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
