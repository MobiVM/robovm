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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PDFDocument/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PDFDocumentPtr extends Ptr<PDFDocument, PDFDocumentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PDFDocument.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PDFDocument() {}
    protected PDFDocument(Handle h, long handle) { super(h, handle); }
    protected PDFDocument(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithURL:")
    public PDFDocument(NSURL url) { super((SkipInit) null); initObject(init(url)); }
    @Method(selector = "initWithData:")
    public PDFDocument(NSData data) { super((SkipInit) null); initObject(init(data)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "documentURL")
    public native NSURL getDocumentURL();
    @Property(selector = "documentRef")
    public native CGPDFDocument getDocumentRef();
    @Property(selector = "documentAttributes")
    public native NSDictionary<?, ?> getDocumentAttributes();
    @Property(selector = "setDocumentAttributes:")
    public native void setDocumentAttributes(NSDictionary<?, ?> v);
    @Property(selector = "majorVersion")
    public native @MachineSizedSInt long getMajorVersion();
    @Property(selector = "minorVersion")
    public native @MachineSizedSInt long getMinorVersion();
    @Property(selector = "isEncrypted")
    public native boolean isEncrypted();
    @Property(selector = "isLocked")
    public native boolean isLocked();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "allowsPrinting")
    public native boolean allowsPrinting();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "allowsCopying")
    public native boolean allowsCopying();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "allowsDocumentChanges")
    public native boolean allowsDocumentChanges();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "allowsDocumentAssembly")
    public native boolean allowsDocumentAssembly();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "allowsContentAccessibility")
    public native boolean allowsContentAccessibility();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "allowsCommenting")
    public native boolean allowsCommenting();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "allowsFormFieldEntry")
    public native boolean allowsFormFieldEntry();
    @Property(selector = "accessPermissions")
    public native PDFAccessPermissions getAccessPermissions();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "permissionsStatus")
    public native PDFDocumentPermissions getPermissionsStatus();
    @Property(selector = "string")
    public native String getString();
    @Property(selector = "delegate")
    public native PDFDocumentDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(PDFDocumentDelegate v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "outlineRoot")
    public native PDFOutline getOutlineRoot();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setOutlineRoot:")
    public native void setOutlineRoot(PDFOutline v);
    @Property(selector = "pageCount")
    public native @MachineSizedUInt long getPageCount();
    @Property(selector = "pageClass")
    public native Class<?> getPageClass();
    @Property(selector = "isFinding")
    public native boolean isFinding();
    @Property(selector = "selectionForEntireDocument")
    public native PDFSelection getSelectionForEntireDocument();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithURL:")
    protected native @Pointer long init(NSURL url);
    @Method(selector = "initWithData:")
    protected native @Pointer long init(NSData data);
    @Method(selector = "unlockWithPassword:")
    public native boolean unlock(String password);
    @Method(selector = "dataRepresentation")
    public native NSData dataRepresentation();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "dataRepresentationWithOptions:")
    public native NSData dataRepresentation(NSDictionary<?, ?> options);
    @Method(selector = "writeToFile:")
    public native boolean writeToFile(String path);
    @Method(selector = "writeToFile:withOptions:")
    public native boolean writeToFile(String path, NSDictionary<NSString, ?> options);
    @Method(selector = "writeToURL:")
    public native boolean writeToURL(NSURL url);
    @Method(selector = "writeToURL:withOptions:")
    public native boolean writeToURL(NSURL url, NSDictionary<NSString, ?> options);
    @Method(selector = "outlineItemForSelection:")
    public native PDFOutline outlineItemForSelection(PDFSelection selection);
    @Method(selector = "pageAtIndex:")
    public native PDFPage pageAtIndex(@MachineSizedUInt long index);
    @Method(selector = "indexForPage:")
    public native @MachineSizedUInt long indexForPage(PDFPage page);
    @Method(selector = "insertPage:atIndex:")
    public native void insertPage(PDFPage page, @MachineSizedUInt long index);
    @Method(selector = "removePageAtIndex:")
    public native void removePageAtIndex(@MachineSizedUInt long index);
    @Method(selector = "exchangePageAtIndex:withPageAtIndex:")
    public native void exchangePage(@MachineSizedUInt long indexA, @MachineSizedUInt long indexB);
    @Method(selector = "findString:withOptions:")
    public native NSArray<PDFSelection> findString(String string, NSStringCompareOptions options);
    @Method(selector = "beginFindString:withOptions:")
    public native void beginFindString(String string, NSStringCompareOptions options);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "beginFindStrings:withOptions:")
    public native void beginFindStrings(NSArray<NSString> strings, NSStringCompareOptions options);
    @Method(selector = "findString:fromSelection:withOptions:")
    public native PDFSelection findString(String string, PDFSelection selection, NSStringCompareOptions options);
    @Method(selector = "cancelFindString")
    public native void cancelFindString();
    @Method(selector = "selectionFromPage:atPoint:toPage:atPoint:")
    public native PDFSelection selection(PDFPage startPage, @ByVal CGPoint startPoint, PDFPage endPage, @ByVal CGPoint endPoint);
    @Method(selector = "selectionFromPage:atCharacterIndex:toPage:atCharacterIndex:")
    public native PDFSelection selection(PDFPage startPage, @MachineSizedUInt long startCharacter, PDFPage endPage, @MachineSizedUInt long endCharacter);
    /*</methods>*/
}
