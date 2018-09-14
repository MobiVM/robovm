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
package org.robovm.apple.uikit;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.cloudkit.*;
import org.robovm.apple.fileprovider.*;
import org.robovm.apple.intents.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("UIKit")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSDirectionalEdgeInsets/*</name>*/ 
    extends /*<extends>*/Struct<NSDirectionalEdgeInsets>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSDirectionalEdgeInsetsPtr extends Ptr<NSDirectionalEdgeInsets, NSDirectionalEdgeInsetsPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(NSDirectionalEdgeInsets.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSDirectionalEdgeInsets() {}
    public NSDirectionalEdgeInsets(@MachineSizedFloat double top, @MachineSizedFloat double leading, @MachineSizedFloat double bottom, @MachineSizedFloat double trailing) {
        this.setTop(top);
        this.setLeading(leading);
        this.setBottom(bottom);
        this.setTrailing(trailing);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native @MachineSizedFloat double getTop();
    @StructMember(0) public native NSDirectionalEdgeInsets setTop(@MachineSizedFloat double top);
    @StructMember(1) public native @MachineSizedFloat double getLeading();
    @StructMember(1) public native NSDirectionalEdgeInsets setLeading(@MachineSizedFloat double leading);
    @StructMember(2) public native @MachineSizedFloat double getBottom();
    @StructMember(2) public native NSDirectionalEdgeInsets setBottom(@MachineSizedFloat double bottom);
    @StructMember(3) public native @MachineSizedFloat double getTrailing();
    @StructMember(3) public native NSDirectionalEdgeInsets setTrailing(@MachineSizedFloat double trailing);
    /*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="NSDirectionalEdgeInsetsZero", optional=true)
    public static native @ByVal NSDirectionalEdgeInsets Zero();
    /*</methods>*/
}
