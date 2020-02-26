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
/*<visibility>*/public/*</visibility>*/ class VectorChar16
    extends /*<extends>*/Struct<VectorChar16>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VectorChar16Ptr extends Ptr<VectorChar16, VectorChar16Ptr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public VectorChar16() {}
    public VectorChar16(byte[] data) {
        set(data);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native byte getC0();
    @StructMember(0) public native VectorChar16 setC0(byte b);

    @StructMember(1) public native byte getC1();
    @StructMember(1) public native VectorChar16 setC1(byte b);

    @StructMember(2) public native byte getC2();
    @StructMember(2) public native VectorChar16 setC2(byte b);

    @StructMember(3) public native byte getC3();
    @StructMember(3) public native VectorChar16 setC3(byte b);

    @StructMember(4) public native byte getC4();
    @StructMember(4) public native VectorChar16 setC4(byte b);

    @StructMember(5) public native byte getC5();
    @StructMember(5) public native VectorChar16 setC5(byte b);

    @StructMember(6) public native byte getC6();
    @StructMember(6) public native VectorChar16 setC6(byte b);

    @StructMember(7) public native byte getC7();
    @StructMember(7) public native VectorChar16 setC7(byte b);

    @StructMember(8) public native byte getC8();
    @StructMember(8) public native VectorChar16 setC8(byte b);

    @StructMember(9) public native byte getC9();
    @StructMember(9) public native VectorChar16 setC9(byte b);

    @StructMember(10) public native byte getC10();
    @StructMember(10) public native VectorChar16 setC10(byte b);

    @StructMember(11) public native byte getC11();
    @StructMember(11) public native VectorChar16 setC11(byte b);

    @StructMember(12) public native byte getC12();
    @StructMember(12) public native VectorChar16 setC12(byte b);

    @StructMember(13) public native byte getC13();
    @StructMember(13) public native VectorChar16 setC13(byte b);

    @StructMember(14) public native byte getC14();
    @StructMember(14) public native VectorChar16 setC14(byte b);

    @StructMember(15) public native byte getC15();
    @StructMember(15) public native VectorChar16 setC15(byte b);
    /*</members>*/
    public void set(byte[] data) {
        if (data == null || data.length != 16)
            throw new IllegalArgumentException("16 bytes are expected/1");
        setC0(data[0]);
        setC1(data[1]);
        setC2(data[2]);
        setC3(data[3]);
        setC4(data[4]);
        setC5(data[5]);
        setC6(data[6]);
        setC7(data[7]);
        setC8(data[8]);
        setC9(data[9]);
        setC10(data[10]);
        setC11(data[11]);
        setC12(data[12]);
        setC13(data[13]);
        setC14(data[14]);
        setC15(data[15]);
    }
    /*<methods>*//*</methods>*/
}
