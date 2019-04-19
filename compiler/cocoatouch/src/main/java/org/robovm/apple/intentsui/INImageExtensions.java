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
package org.robovm.apple.intentsui;

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
import org.robovm.apple.intents.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("IntentsUI")/*</annotations>*/
/*<visibility>*/public final/*</visibility>*/ class /*<name>*/INImageExtensions/*</name>*/ 
    extends /*<extends>*/NSExtensions/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INImageExtensions.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    private INImageExtensions() {}
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "fetchUIImageWithCompletion:")
    public static native void fetchUIImageWithCompletion(INImage thiz, @Block VoidBlock1<UIImage> completion);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "imageWithCGImage:")
    protected static native INImage imageWithCGImage(ObjCClass clazz, CGImage imageRef);
    public static INImage imageWithCGImage(CGImage imageRef) { return imageWithCGImage(ObjCClass.getByType(INImage.class), imageRef); }
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "imageWithUIImage:")
    protected static native INImage imageWithUIImage(ObjCClass clazz, UIImage image);
    public static INImage imageWithUIImage(UIImage image) { return imageWithUIImage(ObjCClass.getByType(INImage.class), image); }
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "imageSizeForIntentResponse:")
    protected static native @ByVal CGSize imageSizeForIntentResponse(ObjCClass clazz, INIntentResponse response);
    public static @ByVal CGSize imageSizeForIntentResponse(INIntentResponse response) { return imageSizeForIntentResponse(ObjCClass.getByType(INImage.class), response); }
    /*</methods>*/
}
