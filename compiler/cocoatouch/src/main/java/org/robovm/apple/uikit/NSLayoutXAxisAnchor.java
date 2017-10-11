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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSLayoutXAxisAnchor/*</name>*/ 
    extends /*<extends>*/NSLayoutAnchor<NSLayoutXAxisAnchor>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSLayoutXAxisAnchorPtr extends Ptr<NSLayoutXAxisAnchor, NSLayoutXAxisAnchorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSLayoutXAxisAnchor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSLayoutXAxisAnchor() {}
    protected NSLayoutXAxisAnchor(Handle h, long handle) { super(h, handle); }
    protected NSLayoutXAxisAnchor(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "anchorWithOffsetToAnchor:")
    public native NSLayoutDimension anchorWithOffsetToAnchor(NSLayoutXAxisAnchor otherAnchor);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "constraintEqualToSystemSpacingAfterAnchor:multiplier:")
    public native NSLayoutConstraint constraintEqualToSystemSpacingAfterAnchor(NSLayoutXAxisAnchor anchor, @MachineSizedFloat double multiplier);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "constraintGreaterThanOrEqualToSystemSpacingAfterAnchor:multiplier:")
    public native NSLayoutConstraint constraintGreaterThanOrEqualToSystemSpacingAfterAnchor(NSLayoutXAxisAnchor anchor, @MachineSizedFloat double multiplier);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "constraintLessThanOrEqualToSystemSpacingAfterAnchor:multiplier:")
    public native NSLayoutConstraint constraintLessThanOrEqualToSystemSpacingAfterAnchor(NSLayoutXAxisAnchor anchor, @MachineSizedFloat double multiplier);
    /*</methods>*/
}
