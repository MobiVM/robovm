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
/*<annotations>*/@Library("CoreGraphics")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CGITUToneMapping/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(CGITUToneMapping.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 18.0 and later.
     */
    @GlobalValue(symbol="kCGUse100nitsHLGOOTF", optional=true)
    public static native String Use100nitsHLGOOTF();
    /**
     * @since Available in iOS 18.0 and later.
     */
    @GlobalValue(symbol="kCGUseBT1886ForCoreVideoGamma", optional=true)
    public static native String UseBT1886ForCoreVideoGamma();
    /**
     * @since Available in iOS 18.0 and later.
     */
    @GlobalValue(symbol="kCGSkipBoostToHDR", optional=true)
    public static native String SkipBoostToHDR();
    /**
     * @since Available in iOS 18.1 and later.
     */
    @GlobalValue(symbol="kCGUseLegacyHDREcosystem", optional=true)
    public static native String UseLegacyHDREcosystem();
    /*</methods>*/
}
