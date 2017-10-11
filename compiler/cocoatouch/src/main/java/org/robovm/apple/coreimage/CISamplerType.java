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
package org.robovm.apple.coreimage;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.opengles.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.imageio.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.iosurface.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreImage")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CISamplerType/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(CISamplerType.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kCISamplerAffineMatrix", optional=true)
    public static native String AffineMatrix();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kCISamplerWrapMode", optional=true)
    public static native String WrapMode();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kCISamplerFilterMode", optional=true)
    public static native String FilterMode();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kCISamplerWrapBlack", optional=true)
    public static native String WrapBlack();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kCISamplerWrapClamp", optional=true)
    public static native String WrapClamp();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kCISamplerFilterNearest", optional=true)
    public static native String FilterNearest();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kCISamplerFilterLinear", optional=true)
    public static native String FilterLinear();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kCISamplerColorSpace", optional=true)
    public static native String ColorSpace();
    /*</methods>*/
}
