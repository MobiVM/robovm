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
package org.robovm.apple.avkit;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.iad.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.avrouting.*;
import org.robovm.apple.uniformtypeid.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVLegibleMediaOptionsMenuState/*</name>*/ 
    extends /*<extends>*/Struct<AVLegibleMediaOptionsMenuState>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVLegibleMediaOptionsMenuStatePtr extends Ptr<AVLegibleMediaOptionsMenuState, AVLegibleMediaOptionsMenuStatePtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVLegibleMediaOptionsMenuState() {}
    public AVLegibleMediaOptionsMenuState(boolean enabled, AVLegibleMediaOptionsMenuStateChangeReason reason) {
        this.setEnabled(enabled);
        this.setReason(reason);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native boolean isEnabled();
    @StructMember(0) public native AVLegibleMediaOptionsMenuState setEnabled(boolean enabled);
    @StructMember(1) public native AVLegibleMediaOptionsMenuStateChangeReason getReason();
    @StructMember(1) public native AVLegibleMediaOptionsMenuState setReason(AVLegibleMediaOptionsMenuStateChangeReason reason);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
