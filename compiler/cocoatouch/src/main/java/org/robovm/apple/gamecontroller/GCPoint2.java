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
package org.robovm.apple.gamecontroller;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.corehaptic.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("GameController")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GCPoint2/*</name>*/ 
    extends /*<extends>*/Struct<GCPoint2>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GCPoint2Ptr extends Ptr<GCPoint2, GCPoint2Ptr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(GCPoint2.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GCPoint2() {}
    public GCPoint2(float x, float y) {
        this.setX(x);
        this.setY(y);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native float getX();
    @StructMember(0) public native GCPoint2 setX(float x);
    @StructMember(1) public native float getY();
    @StructMember(1) public native GCPoint2 setY(float y);
    /*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 17.4 and later.
     */
    @GlobalValue(symbol="GCPoint2Zero", optional=true)
    public static native @ByVal GCPoint2 Zero();
    /*</methods>*/
}
