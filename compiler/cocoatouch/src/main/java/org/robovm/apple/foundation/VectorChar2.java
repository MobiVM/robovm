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
/*<visibility>*/public/*</visibility>*/ class VectorChar2
    extends /*<extends>*/Struct<VectorChar2>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VectorChar16Ptr extends Ptr<VectorChar2, VectorChar16Ptr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public VectorChar2() {}
    public VectorChar2(byte[] data) {
        set(data);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native byte getC0();
    @StructMember(0) public native VectorChar2 setC0(byte b);

    @StructMember(1) public native byte getC1();
    @StructMember(1) public native VectorChar2 setC1(byte b);
    /*</members>*/
    public void set(byte[] data) {
        if (data == null || data.length != 2)
            throw new IllegalArgumentException("2 bytes are expected/1");
        setC0(data[0]);
        setC1(data[1]);
    }
    /*<methods>*//*</methods>*/
}
