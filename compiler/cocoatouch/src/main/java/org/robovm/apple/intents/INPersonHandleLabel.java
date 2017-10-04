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
package org.robovm.apple.intents;

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
import org.robovm.apple.eventkit.*;
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("Intents")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INPersonHandleLabel/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(INPersonHandleLabel.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 10.2 and later.
     */
    @GlobalValue(symbol="INPersonHandleLabelHome", optional=true)
    public static native NSString Home();
    /**
     * @since Available in iOS 10.2 and later.
     */
    @GlobalValue(symbol="INPersonHandleLabelWork", optional=true)
    public static native NSString Work();
    /**
     * @since Available in iOS 10.2 and later.
     */
    @GlobalValue(symbol="INPersonHandleLabeliPhone", optional=true)
    public static native NSString iPhone();
    /**
     * @since Available in iOS 10.2 and later.
     */
    @GlobalValue(symbol="INPersonHandleLabelMobile", optional=true)
    public static native NSString Mobile();
    /**
     * @since Available in iOS 10.2 and later.
     */
    @GlobalValue(symbol="INPersonHandleLabelMain", optional=true)
    public static native NSString Main();
    /**
     * @since Available in iOS 10.2 and later.
     */
    @GlobalValue(symbol="INPersonHandleLabelHomeFax", optional=true)
    public static native NSString HomeFax();
    /**
     * @since Available in iOS 10.2 and later.
     */
    @GlobalValue(symbol="INPersonHandleLabelWorkFax", optional=true)
    public static native NSString WorkFax();
    /**
     * @since Available in iOS 10.2 and later.
     */
    @GlobalValue(symbol="INPersonHandleLabelPager", optional=true)
    public static native NSString Pager();
    /**
     * @since Available in iOS 10.2 and later.
     */
    @GlobalValue(symbol="INPersonHandleLabelOther", optional=true)
    public static native NSString Other();
    /*</methods>*/
}
