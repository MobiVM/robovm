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
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSLayoutYAxisAnchor/*</name>*/ 
    extends /*<extends>*/NSLayoutAnchor<NSLayoutYAxisAnchor>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSLayoutYAxisAnchorPtr extends Ptr<NSLayoutYAxisAnchor, NSLayoutYAxisAnchorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSLayoutYAxisAnchor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSLayoutYAxisAnchor() {}
    protected NSLayoutYAxisAnchor(Handle h, long handle) { super(h, handle); }
    protected NSLayoutYAxisAnchor(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "anchorWithOffsetToAnchor:")
    public native NSLayoutDimension anchorWithOffsetToAnchor(NSLayoutYAxisAnchor otherAnchor);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "constraintEqualToSystemSpacingBelowAnchor:multiplier:")
    public native NSLayoutConstraint constraintEqualToSystemSpacingBelowAnchor(NSLayoutYAxisAnchor anchor, @MachineSizedFloat double multiplier);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "constraintGreaterThanOrEqualToSystemSpacingBelowAnchor:multiplier:")
    public native NSLayoutConstraint constraintGreaterThanOrEqualToSystemSpacingBelowAnchor(NSLayoutYAxisAnchor anchor, @MachineSizedFloat double multiplier);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "constraintLessThanOrEqualToSystemSpacingBelowAnchor:multiplier:")
    public native NSLayoutConstraint constraintLessThanOrEqualToSystemSpacingBelowAnchor(NSLayoutYAxisAnchor anchor, @MachineSizedFloat double multiplier);
    /*</methods>*/
}
