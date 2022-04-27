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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PDFSelection/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PDFSelectionPtr extends Ptr<PDFSelection, PDFSelectionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PDFSelection.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PDFSelection() {}
    protected PDFSelection(Handle h, long handle) { super(h, handle); }
    protected PDFSelection(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithDocument:")
    public PDFSelection(PDFDocument document) { super((SkipInit) null); initObject(init(document)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "pages")
    public native NSArray<PDFPage> getPages();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "color")
    public native UIColor getColor();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setColor:")
    public native void setColor(UIColor v);
    @Property(selector = "string")
    public native String getString();
    @Property(selector = "attributedString")
    public native NSAttributedString getAttributedString();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithDocument:")
    protected native @Pointer long init(PDFDocument document);
    @Method(selector = "boundsForPage:")
    public native @ByVal CGRect boundsForPage(PDFPage page);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "numberOfTextRangesOnPage:")
    public native @MachineSizedUInt long numberOfTextRangesOnPage(PDFPage page);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "rangeAtIndex:onPage:")
    public native @ByVal NSRange range(@MachineSizedUInt long index, PDFPage page);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "selectionsByLine")
    public native NSArray<PDFSelection> selectionsByLine();
    @Method(selector = "addSelection:")
    public native void addSelection(PDFSelection selection);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "addSelections:")
    public native void addSelections(NSArray<PDFSelection> selections);
    @Method(selector = "extendSelectionAtEnd:")
    public native void extendSelectionAtEnd(@MachineSizedSInt long succeed);
    @Method(selector = "extendSelectionAtStart:")
    public native void extendSelectionAtStart(@MachineSizedSInt long precede);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "extendSelectionForLineBoundaries")
    public native void extendSelectionForLineBoundaries();
    @Method(selector = "drawForPage:active:")
    public native void draw(PDFPage page, boolean active);
    @Method(selector = "drawForPage:withBox:active:")
    public native void draw(PDFPage page, PDFDisplayBox box, boolean active);
    /*</methods>*/
}
