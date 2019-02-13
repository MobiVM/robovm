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
/*<visibility>*/public/*</visibility>*/ class VectorDouble4
    extends /*<extends>*/Struct<VectorDouble4>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VectorDouble4Ptr extends Ptr<VectorDouble4, VectorDouble4Ptr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public VectorDouble4() {}
    public VectorDouble4(double x, double y, double z, double w) {
        this.setX(x);
        this.setY(y);
        this.setZ(z);
        this.setW(w);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native double getX();
    @StructMember(0) public native VectorDouble4 setX(double x);
    
    @StructMember(1) public native double getY();
    @StructMember(1) public native VectorDouble4 setY(double y);
    
    @StructMember(2) public native double getZ();
    @StructMember(2) public native VectorDouble4 setZ(double y);
    
    @StructMember(3) public native double getW();
    @StructMember(3) public native VectorDouble4 setW(double y);
    
    /*</members>*/
    public void set(double x, double y, double z, double w) {
        setX(x);
        setY(y);
        setZ(z);
        setW(w);
    }
    /*<methods>*//*</methods>*/
}
