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
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.linkpresentation.*;
import org.robovm.apple.symbols.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("UIKit")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIFloatRange/*</name>*/ 
    extends /*<extends>*/Struct<UIFloatRange>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UIFloatRangePtr extends Ptr<UIFloatRange, UIFloatRangePtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(UIFloatRange.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIFloatRange() {}
    public UIFloatRange(@MachineSizedFloat double minimum, @MachineSizedFloat double maximum) {
        this.setMinimum(minimum);
        this.setMaximum(maximum);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native @MachineSizedFloat double getMinimum();
    @StructMember(0) public native UIFloatRange setMinimum(@MachineSizedFloat double minimum);
    @StructMember(1) public native @MachineSizedFloat double getMaximum();
    @StructMember(1) public native UIFloatRange setMaximum(@MachineSizedFloat double maximum);
    /*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="UIFloatRangeZero", optional=true)
    public static native @ByVal UIFloatRange Zero();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="UIFloatRangeInfinite", optional=true)
    public static native @ByVal UIFloatRange Infinite();
    
    /**
     * @since Available in iOS 9.0 and later.
     */
    public boolean isInfinite() { return isInfinite(this); }
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Bridge(symbol="UIFloatRangeIsInfinite", optional=true)
    private static native boolean isInfinite(@ByVal UIFloatRange range);
    /*</methods>*/
}
