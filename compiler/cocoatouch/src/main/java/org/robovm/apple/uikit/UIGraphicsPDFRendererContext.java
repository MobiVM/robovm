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
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIGraphicsPDFRendererContext/*</name>*/ 
    extends /*<extends>*/UIGraphicsRendererContext/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UIGraphicsPDFRendererContextPtr extends Ptr<UIGraphicsPDFRendererContext, UIGraphicsPDFRendererContextPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIGraphicsPDFRendererContext.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIGraphicsPDFRendererContext() {}
    protected UIGraphicsPDFRendererContext(Handle h, long handle) { super(h, handle); }
    protected UIGraphicsPDFRendererContext(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "pdfContextBounds")
    public native @ByVal CGRect getPdfContextBounds();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "beginPage")
    public native void beginPage();
    @Method(selector = "beginPageWithBounds:pageInfo:")
    public native void beginPage(@ByVal CGRect bounds, NSDictionary<NSString, ?> pageInfo);
    @Method(selector = "setURL:forRect:")
    public native void setURLForRect(NSURL url, @ByVal CGRect rect);
    @Method(selector = "addDestinationWithName:atPoint:")
    public native void addDestination(String name, @ByVal CGPoint point);
    @Method(selector = "setDestinationWithName:forRect:")
    public native void setDestination(String name, @ByVal CGRect rect);
    /*</methods>*/
}
