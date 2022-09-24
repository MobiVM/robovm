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
package org.robovm.apple.coregraphics;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CGAffineTransformComponents/*</name>*/ 
    extends /*<extends>*/Struct<CGAffineTransformComponents>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CGAffineTransformComponentsPtr extends Ptr<CGAffineTransformComponents, CGAffineTransformComponentsPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CGAffineTransformComponents() {}
    public CGAffineTransformComponents(CGSize scale, @MachineSizedFloat double horizontalShear, @MachineSizedFloat double rotation, CGVector translation) {
        this.setScale(scale);
        this.setHorizontalShear(horizontalShear);
        this.setRotation(rotation);
        this.setTranslation(translation);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native @ByVal CGSize getScale();
    @StructMember(0) public native CGAffineTransformComponents setScale(@ByVal CGSize scale);
    @StructMember(1) public native @MachineSizedFloat double getHorizontalShear();
    @StructMember(1) public native CGAffineTransformComponents setHorizontalShear(@MachineSizedFloat double horizontalShear);
    @StructMember(2) public native @MachineSizedFloat double getRotation();
    @StructMember(2) public native CGAffineTransformComponents setRotation(@MachineSizedFloat double rotation);
    @StructMember(3) public native @ByVal CGVector getTranslation();
    @StructMember(3) public native CGAffineTransformComponents setTranslation(@ByVal CGVector translation);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
