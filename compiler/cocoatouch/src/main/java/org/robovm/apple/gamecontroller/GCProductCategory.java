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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GCProductCategory/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(GCProductCategory.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 15.0 and later.
     */
    @GlobalValue(symbol="GCProductCategoryDualSense", optional=true)
    public static native String DualSense();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @GlobalValue(symbol="GCProductCategoryDualShock4", optional=true)
    public static native String DualShock4();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @GlobalValue(symbol="GCProductCategoryMFi", optional=true)
    public static native String MFi();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @GlobalValue(symbol="GCProductCategoryXboxOne", optional=true)
    public static native String XboxOne();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @GlobalValue(symbol="GCProductCategorySiriRemote1stGen", optional=true)
    public static native String SiriRemote1stGen();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @GlobalValue(symbol="GCProductCategorySiriRemote2ndGen", optional=true)
    public static native String SiriRemote2ndGen();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @GlobalValue(symbol="GCProductCategoryControlCenterRemote", optional=true)
    public static native String ControlCenterRemote();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @GlobalValue(symbol="GCProductCategoryUniversalElectronicsRemote", optional=true)
    public static native String UniversalElectronicsRemote();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @GlobalValue(symbol="GCProductCategoryCoalescedRemote", optional=true)
    public static native String CoalescedRemote();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @GlobalValue(symbol="GCProductCategoryMouse", optional=true)
    public static native String Mouse();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @GlobalValue(symbol="GCProductCategoryKeyboard", optional=true)
    public static native String Keyboard();
    /*</methods>*/
}
