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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIGraphicsPDFRenderer/*</name>*/ 
    extends /*<extends>*/UIGraphicsRenderer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UIGraphicsPDFRendererPtr extends Ptr<UIGraphicsPDFRenderer, UIGraphicsPDFRendererPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIGraphicsPDFRenderer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIGraphicsPDFRenderer() {}
    protected UIGraphicsPDFRenderer(Handle h, long handle) { super(h, handle); }
    protected UIGraphicsPDFRenderer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithBounds:format:")
    public UIGraphicsPDFRenderer(@ByVal CGRect bounds, UIGraphicsPDFRendererFormat format) { super((SkipInit) null); initObject(init(bounds, format)); }
    @Method(selector = "initWithBounds:")
    public UIGraphicsPDFRenderer(@ByVal CGRect bounds) { super(bounds); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithBounds:format:")
    protected native @Pointer long init(@ByVal CGRect bounds, UIGraphicsPDFRendererFormat format);
    public boolean writePDFToURL(NSURL url, @Block VoidBlock1<UIGraphicsPDFRendererContext> actions) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = writePDFToURL(url, actions, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "writePDFToURL:withActions:error:")
    private native boolean writePDFToURL(NSURL url, @Block VoidBlock1<UIGraphicsPDFRendererContext> actions, NSError.NSErrorPtr error);
    @Method(selector = "PDFDataWithActions:")
    public native NSData toPDFData(@Block VoidBlock1<UIGraphicsPDFRendererContext> actions);
    /*</methods>*/
}
