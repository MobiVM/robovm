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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSOffset/*</name>*/ 
    extends /*<extends>*/Struct<MPSOffset>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSOffsetPtr extends Ptr<MPSOffset, MPSOffsetPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSOffset() {}
    public MPSOffset(@MachineSizedSInt long x, @MachineSizedSInt long y, @MachineSizedSInt long z) {
        this.setX(x);
        this.setY(y);
        this.setZ(z);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native @MachineSizedSInt long getX();
    @StructMember(0) public native MPSOffset setX(@MachineSizedSInt long x);
    @StructMember(1) public native @MachineSizedSInt long getY();
    @StructMember(1) public native MPSOffset setY(@MachineSizedSInt long y);
    @StructMember(2) public native @MachineSizedSInt long getZ();
    @StructMember(2) public native MPSOffset setZ(@MachineSizedSInt long z);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
