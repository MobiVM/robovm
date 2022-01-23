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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PDFPage/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PDFPagePtr extends Ptr<PDFPage, PDFPagePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PDFPage.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PDFPage() {}
    protected PDFPage(Handle h, long handle) { super(h, handle); }
    protected PDFPage(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithImage:")
    public PDFPage(UIImage image) { super((SkipInit) null); initObject(init(image)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "document")
    public native PDFDocument getDocument();
    @Property(selector = "pageRef")
    public native CGPDFPage getPageRef();
    @Property(selector = "label")
    public native String getLabel();
    @Property(selector = "rotation")
    public native @MachineSizedSInt long getRotation();
    @Property(selector = "setRotation:")
    public native void setRotation(@MachineSizedSInt long v);
    @Property(selector = "annotations")
    public native NSArray<PDFAnnotation> getAnnotations();
    @Property(selector = "displaysAnnotations")
    public native boolean displaysAnnotations();
    @Property(selector = "setDisplaysAnnotations:")
    public native void setDisplaysAnnotations(boolean v);
    @Property(selector = "numberOfCharacters")
    public native @MachineSizedUInt long getNumberOfCharacters();
    @Property(selector = "string")
    public native String getString();
    @Property(selector = "attributedString")
    public native NSAttributedString getAttributedString();
    @Property(selector = "dataRepresentation")
    public native NSData getDataRepresentation();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithImage:")
    protected native @Pointer long init(UIImage image);
    @Method(selector = "boundsForBox:")
    public native @ByVal CGRect boundsForBox(PDFDisplayBox box);
    @Method(selector = "setBounds:forBox:")
    public native void setBounds(@ByVal CGRect bounds, PDFDisplayBox box);
    @Method(selector = "addAnnotation:")
    public native void addAnnotation(PDFAnnotation annotation);
    @Method(selector = "removeAnnotation:")
    public native void removeAnnotation(PDFAnnotation annotation);
    @Method(selector = "annotationAtPoint:")
    public native PDFAnnotation annotationAtPoint(@ByVal CGPoint point);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "transformForBox:")
    public native @ByVal CGAffineTransform transformForBox(PDFDisplayBox box);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "drawWithBox:toContext:")
    public native void draw(PDFDisplayBox box, CGContext context);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "transformContext:forBox:")
    public native void transformContext(CGContext context, PDFDisplayBox box);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "thumbnailOfSize:forBox:")
    public native UIImage thumbnail(@ByVal CGSize size, PDFDisplayBox box);
    @Method(selector = "characterBoundsAtIndex:")
    public native @ByVal CGRect characterBoundsAtIndex(@MachineSizedSInt long index);
    @Method(selector = "characterIndexAtPoint:")
    public native @MachineSizedSInt long characterIndexAtPoint(@ByVal CGPoint point);
    @Method(selector = "selectionForRect:")
    public native PDFSelection selectionForRect(@ByVal CGRect rect);
    @Method(selector = "selectionForWordAtPoint:")
    public native PDFSelection selectionForWordAtPoint(@ByVal CGPoint point);
    @Method(selector = "selectionForLineAtPoint:")
    public native PDFSelection selectionForLineAtPoint(@ByVal CGPoint point);
    @Method(selector = "selectionFromPoint:toPoint:")
    public native PDFSelection selection(@ByVal CGPoint startPoint, @ByVal CGPoint endPoint);
    @Method(selector = "selectionForRange:")
    public native PDFSelection selectionForRange(@ByVal NSRange range);
    /*</methods>*/
}
