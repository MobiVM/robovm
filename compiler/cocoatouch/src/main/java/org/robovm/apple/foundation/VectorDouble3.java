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
package org.robovm.apple.foundation;

/*<imports>*/

import org.robovm.rt.bro.Struct;
import org.robovm.rt.bro.annotation.StructMember;
import org.robovm.rt.bro.annotation.Vectorised;
import org.robovm.rt.bro.ptr.Ptr;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
@Vectorised
/*<visibility>*/public/*</visibility>*/ class VectorDouble3
    extends /*<extends>*/Struct<VectorDouble3>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VectorDouble3Ptr extends Ptr<VectorDouble3, VectorDouble3Ptr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public VectorDouble3() {}
    public VectorDouble3(double x, double y, double z) {
        this.setX(x);
        this.setY(y);
        this.setZ(z);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native double getX();
    @StructMember(0) public native VectorDouble3 setX(double x);
    
    @StructMember(1) public native double getY();
    @StructMember(1) public native VectorDouble3 setY(double y);
    
    @StructMember(2) public native double getZ();
    @StructMember(2) public native VectorDouble3 setZ(double y);

    /*</members>*/
    public void set(double x, double y, double z) {
        setX(x);
        setY(y);
        setZ(z);
    }
    /*<methods>*//*</methods>*/
}
