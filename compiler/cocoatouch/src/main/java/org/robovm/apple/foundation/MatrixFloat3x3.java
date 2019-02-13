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
/*<visibility>*/public/*</visibility>*/ class MatrixFloat3x3
    extends /*<extends>*/Struct<MatrixFloat3x3>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MatrixFloat3x3Ptr extends Ptr<MatrixFloat3x3, MatrixFloat3x3Ptr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MatrixFloat3x3() {}
    public MatrixFloat3x3(VectorFloat3[] columns) {
        this.set(columns);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native @ByVal VectorFloat3 getC1();
    @StructMember(0) public native MatrixFloat3x3 setC1(@ByVal VectorFloat3 column1);
    @StructMember(1) public native @ByVal VectorFloat3 getC2();
    @StructMember(1) public native MatrixFloat3x3 setC2(@ByVal VectorFloat3 column2);
    @StructMember(2) public native @ByVal VectorFloat3 getC3();
    @StructMember(2) public native MatrixFloat3x3 setC3(@ByVal VectorFloat3 column3);
    /*</members>*/
    public void set(VectorFloat3[] columns) {
        setC1(columns[0]);
        setC2(columns[1]);
        setC3(columns[2]);
    }
    public void set(VectorFloat3 c1, VectorFloat3 c2, VectorFloat3 c3) {
        setC1(c1);
        setC2(c2);
        setC3(c3);
    }
    /*<methods>*//*</methods>*/
}
