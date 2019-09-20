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
@Marshaler(NSString.AsStringMarshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIGraphics/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(UIGraphics.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Bridge(symbol="UIGraphicsGetCurrentContext", optional=true)
    public static native CGContext getCurrentContext();
    @Bridge(symbol="UIGraphicsPushContext", optional=true)
    public static native void pushContext(CGContext context);
    @Bridge(symbol="UIGraphicsPopContext", optional=true)
    public static native void popContext();
    @Bridge(symbol="UIRectFillUsingBlendMode", optional=true)
    public static native void rectFill(@ByVal CGRect rect, CGBlendMode blendMode);
    @Bridge(symbol="UIRectFill", optional=true)
    public static native void rectFill(@ByVal CGRect rect);
    @Bridge(symbol="UIRectFrameUsingBlendMode", optional=true)
    public static native void rectFrame(@ByVal CGRect rect, CGBlendMode blendMode);
    @Bridge(symbol="UIRectFrame", optional=true)
    public static native void rectFrame(@ByVal CGRect rect);
    @Bridge(symbol="UIRectClip", optional=true)
    public static native void rectClip(@ByVal CGRect rect);
    @Bridge(symbol="UIGraphicsBeginImageContext", optional=true)
    public static native void beginImageContext(@ByVal CGSize size);
    @Bridge(symbol="UIGraphicsBeginImageContextWithOptions", optional=true)
    public static native void beginImageContext(@ByVal CGSize size, boolean opaque, @MachineSizedFloat double scale);
    @Bridge(symbol="UIGraphicsGetImageFromCurrentImageContext", optional=true)
    public static native UIImage getImageFromCurrentImageContext();
    @Bridge(symbol="UIGraphicsEndImageContext", optional=true)
    public static native void endImageContext();
    @Bridge(symbol="UIGraphicsBeginPDFContextToFile", optional=true)
    public static native boolean beginPDFContextToFile(String path, @ByVal CGRect bounds, CGPDFContextOptions documentInfo);
    @Bridge(symbol="UIGraphicsBeginPDFContextToData", optional=true)
    public static native void beginPDFContextToData(NSMutableData data, @ByVal CGRect bounds, CGPDFContextOptions documentInfo);
    @Bridge(symbol="UIGraphicsEndPDFContext", optional=true)
    public static native void endPDFContext();
    @Bridge(symbol="UIGraphicsBeginPDFPage", optional=true)
    public static native void beginPDFPage();
    @Bridge(symbol="UIGraphicsBeginPDFPageWithInfo", optional=true)
    public static native void beginPDFPage(@ByVal CGRect bounds, CGPDFBoxOptions pageInfo);
    @Bridge(symbol="UIGraphicsGetPDFContextBounds", optional=true)
    public static native @ByVal CGRect getPDFContextBounds();
    @Bridge(symbol="UIGraphicsSetPDFContextURLForRect", optional=true)
    public static native void setPDFContextURLForRect(NSURL url, @ByVal CGRect rect);
    @Bridge(symbol="UIGraphicsAddPDFContextDestinationAtPoint", optional=true)
    public static native void addPDFContextDestinationAtPoint(String name, @ByVal CGPoint point);
    @Bridge(symbol="UIGraphicsSetPDFContextDestinationForRect", optional=true)
    public static native void setPDFContextDestinationForRect(String name, @ByVal CGRect rect);
    /*</methods>*/
}
