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
/*<visibility>*/public/*</visibility>*/ class MatrixFloat2x4
    extends /*<extends>*/Struct<MatrixFloat2x4>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MatrixFloat2x4Ptr extends Ptr<MatrixFloat2x4, MatrixFloat2x4Ptr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MatrixFloat2x4() {}
    public MatrixFloat2x4(VectorFloat4[] columns) {
        this.set(columns);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native @ByVal VectorFloat4 getC1();
    @StructMember(0) public native MatrixFloat2x4 setC1(@ByVal VectorFloat4 column1);
    @StructMember(1) public native @ByVal VectorFloat4 getC2();
    @StructMember(1) public native MatrixFloat2x4 setC2(@ByVal VectorFloat4 column2);
    /*</members>*/
    public void set(VectorFloat4[] columns) {
        setC1(columns[0]);
        setC2(columns[1]);
    }
    public void set(VectorFloat4 c1, VectorFloat4 c2) {
        setC1(c1);
        setC2(c2);
    }
    /*<methods>*//*</methods>*/
}
