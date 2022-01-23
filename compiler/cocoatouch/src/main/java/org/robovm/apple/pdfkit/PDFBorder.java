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
package org.robovm.apple.pdfkit;

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
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("PDFKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PDFBorder/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSCoding/*</implements>*/ {

    /*<ptr>*/public static class PDFBorderPtr extends Ptr<PDFBorder, PDFBorderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PDFBorder.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PDFBorder() {}
    protected PDFBorder(Handle h, long handle) { super(h, handle); }
    protected PDFBorder(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public PDFBorder(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "style")
    public native PDFBorderStyle getStyle();
    @Property(selector = "setStyle:")
    public native void setStyle(PDFBorderStyle v);
    @Property(selector = "lineWidth")
    public native @MachineSizedFloat double getLineWidth();
    @Property(selector = "setLineWidth:")
    public native void setLineWidth(@MachineSizedFloat double v);
    @Property(selector = "dashPattern")
    public native NSArray<?> getDashPattern();
    @Property(selector = "setDashPattern:")
    public native void setDashPattern(NSArray<?> v);
    @Property(selector = "borderKeyValues")
    public native NSDictionary<?, ?> getBorderKeyValues();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "drawInRect:")
    public native void drawInRect(@ByVal CGRect rect);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
