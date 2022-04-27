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
package org.robovm.apple.webkit;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.security.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("WebKit")/*</annotations>*/
/*<visibility>*/public final/*</visibility>*/ class /*<name>*/NSAttributedStringExtensions/*</name>*/ 
    extends /*<extends>*/NSExtensions/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSAttributedStringExtensions.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    private NSAttributedStringExtensions() {}
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "loadFromHTMLWithRequest:options:completionHandler:")
    protected static native void loadFromHTML(ObjCClass clazz, NSURLRequest request, NSDictionary<?, ?> options, @Block VoidBlock3<NSAttributedString, NSDictionary<NSString, ?>, NSError> completionHandler);
    public static void loadFromHTML(NSURLRequest request, NSDictionary<?, ?> options, @Block VoidBlock3<NSAttributedString, NSDictionary<NSString, ?>, NSError> completionHandler) { loadFromHTML(ObjCClass.getByType(NSAttributedString.class), request, options, completionHandler); }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "loadFromHTMLWithFileURL:options:completionHandler:")
    protected static native void loadFromHTML(ObjCClass clazz, NSURL fileURL, NSDictionary<?, ?> options, @Block VoidBlock3<NSAttributedString, NSDictionary<NSString, ?>, NSError> completionHandler);
    public static void loadFromHTML(NSURL fileURL, NSDictionary<?, ?> options, @Block VoidBlock3<NSAttributedString, NSDictionary<NSString, ?>, NSError> completionHandler) { loadFromHTML(ObjCClass.getByType(NSAttributedString.class), fileURL, options, completionHandler); }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "loadFromHTMLWithString:options:completionHandler:")
    protected static native void loadFromHTML(ObjCClass clazz, String string, NSDictionary<?, ?> options, @Block VoidBlock3<NSAttributedString, NSDictionary<NSString, ?>, NSError> completionHandler);
    public static void loadFromHTML(String string, NSDictionary<?, ?> options, @Block VoidBlock3<NSAttributedString, NSDictionary<NSString, ?>, NSError> completionHandler) { loadFromHTML(ObjCClass.getByType(NSAttributedString.class), string, options, completionHandler); }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "loadFromHTMLWithData:options:completionHandler:")
    protected static native void loadFromHTML(ObjCClass clazz, NSData data, NSDictionary<?, ?> options, @Block VoidBlock3<NSAttributedString, NSDictionary<NSString, ?>, NSError> completionHandler);
    public static void loadFromHTML(NSData data, NSDictionary<?, ?> options, @Block VoidBlock3<NSAttributedString, NSDictionary<NSString, ?>, NSError> completionHandler) { loadFromHTML(ObjCClass.getByType(NSAttributedString.class), data, options, completionHandler); }
    /*</methods>*/
}
