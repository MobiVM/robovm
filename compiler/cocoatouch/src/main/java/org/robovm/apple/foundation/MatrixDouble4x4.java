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
import org.robovm.rt.bro.annotation.ByVal;
import org.robovm.rt.bro.annotation.StructMember;
import org.robovm.rt.bro.annotation.Vectorised;
import org.robovm.rt.bro.ptr.Ptr;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
@Vectorised
/*<visibility>*/public/*</visibility>*/ class MatrixDouble4x4 
    extends /*<extends>*/Struct<MatrixDouble4x4>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MatrixDouble4x4Ptr extends Ptr<MatrixDouble4x4, MatrixDouble4x4Ptr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MatrixDouble4x4() {}
    public MatrixDouble4x4(VectorDouble4[] columns) {
        this.set(columns);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native @ByVal VectorDouble4 getC1();
    @StructMember(0) public native MatrixDouble4x4 setC1(@ByVal VectorDouble4 column1);
    @StructMember(1) public native @ByVal VectorDouble4 getC2();
    @StructMember(1) public native MatrixDouble4x4 setC2(@ByVal VectorDouble4 column2);
    @StructMember(2) public native @ByVal VectorDouble4 getC3();
    @StructMember(2) public native MatrixDouble4x4 setC3(@ByVal VectorDouble4 column3);
    @StructMember(3) public native @ByVal VectorDouble4 getC4();
    @StructMember(3) public native MatrixDouble4x4 setC4(@ByVal VectorDouble4 column4);
    /*</members>*/
    public void set(VectorDouble4[] columns) {
        setC1(columns[0]);
        setC2(columns[1]);
        setC3(columns[2]);
        setC4(columns[3]);
    }
    public void set(VectorDouble4 c1, VectorDouble4 c2, VectorDouble4 c3, VectorDouble4 c4) {
        setC1(c1);
        setC2(c2);
        setC3(c3);
        setC4(c4);
    }
    /*<methods>*//*</methods>*/
}
