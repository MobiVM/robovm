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
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("UIKit")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIActivityType/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(UIActivityType.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="UIActivityTypePostToFacebook", optional=true)
    public static native String PostToFacebook();
    @GlobalValue(symbol="UIActivityTypePostToTwitter", optional=true)
    public static native String PostToTwitter();
    @GlobalValue(symbol="UIActivityTypePostToWeibo", optional=true)
    public static native String PostToWeibo();
    @GlobalValue(symbol="UIActivityTypeMessage", optional=true)
    public static native String Message();
    @GlobalValue(symbol="UIActivityTypeMail", optional=true)
    public static native String Mail();
    @GlobalValue(symbol="UIActivityTypePrint", optional=true)
    public static native String Print();
    @GlobalValue(symbol="UIActivityTypeCopyToPasteboard", optional=true)
    public static native String CopyToPasteboard();
    @GlobalValue(symbol="UIActivityTypeAssignToContact", optional=true)
    public static native String AssignToContact();
    @GlobalValue(symbol="UIActivityTypeSaveToCameraRoll", optional=true)
    public static native String SaveToCameraRoll();
    @GlobalValue(symbol="UIActivityTypeAddToReadingList", optional=true)
    public static native String AddToReadingList();
    @GlobalValue(symbol="UIActivityTypePostToFlickr", optional=true)
    public static native String PostToFlickr();
    @GlobalValue(symbol="UIActivityTypePostToVimeo", optional=true)
    public static native String PostToVimeo();
    @GlobalValue(symbol="UIActivityTypePostToTencentWeibo", optional=true)
    public static native String PostToTencentWeibo();
    @GlobalValue(symbol="UIActivityTypeAirDrop", optional=true)
    public static native String AirDrop();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="UIActivityTypeOpenInIBooks", optional=true)
    public static native String OpenInIBooks();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="UIActivityTypeMarkupAsPDF", optional=true)
    public static native String MarkupAsPDF();
    /*</methods>*/
}
