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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PDFActionRemoteGoTo/*</name>*/ 
    extends /*<extends>*/PDFAction/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PDFActionRemoteGoToPtr extends Ptr<PDFActionRemoteGoTo, PDFActionRemoteGoToPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PDFActionRemoteGoTo.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PDFActionRemoteGoTo() {}
    protected PDFActionRemoteGoTo(Handle h, long handle) { super(h, handle); }
    protected PDFActionRemoteGoTo(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPageIndex:atPoint:fileURL:")
    public PDFActionRemoteGoTo(@MachineSizedUInt long pageIndex, @ByVal CGPoint point, NSURL url) { super((SkipInit) null); initObject(init(pageIndex, point, url)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "pageIndex")
    public native @MachineSizedUInt long getPageIndex();
    @Property(selector = "setPageIndex:")
    public native void setPageIndex(@MachineSizedUInt long v);
    @Property(selector = "point")
    public native @ByVal CGPoint getPoint();
    @Property(selector = "setPoint:")
    public native void setPoint(@ByVal CGPoint v);
    @Property(selector = "URL")
    public native NSURL getURL();
    @Property(selector = "setURL:")
    public native void setURL(NSURL v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPageIndex:atPoint:fileURL:")
    protected native @Pointer long init(@MachineSizedUInt long pageIndex, @ByVal CGPoint point, NSURL url);
    /*</methods>*/
}
