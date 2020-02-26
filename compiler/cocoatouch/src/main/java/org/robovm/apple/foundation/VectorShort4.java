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
/*<visibility>*/public/*</visibility>*/ class VectorShort4
    extends /*<extends>*/Struct<VectorShort4>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VectorShort4Ptr extends Ptr<VectorShort4, VectorShort4Ptr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public VectorShort4() {}
    public VectorShort4(short x, short y, short z, short w) {
        this.setX(x);
        this.setY(y);
        this.setZ(z);
        this.setW(w);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native short getX();
    @StructMember(0) public native VectorShort4 setX(short x);
    
    @StructMember(1) public native short getY();
    @StructMember(1) public native VectorShort4 setY(short y);
    
    @StructMember(2) public native short getZ();
    @StructMember(2) public native VectorShort4 setZ(short z);
    
    @StructMember(3) public native short getW();
    @StructMember(3) public native VectorShort4 setW(short w);
    /*</members>*/
    public void set(short x, short y, short z, short w) {
        setX(x);
        setY(y);
        setZ(z);
        setW(w);
    }
    /*<methods>*//*</methods>*/
}
