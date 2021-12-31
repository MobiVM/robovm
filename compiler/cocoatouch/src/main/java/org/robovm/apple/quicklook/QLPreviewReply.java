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
package org.robovm.apple.quicklook;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.mobilecoreservices.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.pdfkit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("QuickLook") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/QLPreviewReply/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class QLPreviewReplyPtr extends Ptr<QLPreviewReply, QLPreviewReplyPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(QLPreviewReply.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public QLPreviewReply() {}
    protected QLPreviewReply(Handle h, long handle) { super(h, handle); }
    protected QLPreviewReply(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithContextSize:isBitmap:drawingBlock:")
    public QLPreviewReply(@ByVal CGSize contextSize, boolean isBitmap, @Block Block3<CGContext, QLPreviewReply, NSError.NSErrorPtr, Boolean> drawingBlock) { super((SkipInit) null); initObject(init(contextSize, isBitmap, drawingBlock)); }
    @Method(selector = "initWithFileURL:")
    public QLPreviewReply(NSURL fileURL) { super((SkipInit) null); initObject(init(fileURL)); }
    @Method(selector = "initWithDataOfContentType:contentSize:dataCreationBlock:")
    public QLPreviewReply(UTType contentType, @ByVal CGSize contentSize, @Block Block2<QLPreviewReply, NSError.NSErrorPtr, NSData> dataCreationBlock) { super((SkipInit) null); initObject(init(contentType, contentSize, dataCreationBlock)); }
    @Method(selector = "initForPDFWithPageSize:documentCreationBlock:")
    public QLPreviewReply(@ByVal CGSize defaultPageSize, @Block Block2<QLPreviewReply, NSError.NSErrorPtr, PDFDocument> documentCreationBlock) { super((SkipInit) null); initObject(init(defaultPageSize, documentCreationBlock)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "stringEncoding")
    public native NSStringEncoding getStringEncoding();
    @Property(selector = "setStringEncoding:")
    public native void setStringEncoding(NSStringEncoding v);
    @Property(selector = "attachments")
    public native NSDictionary<NSString, QLPreviewReplyAttachment> getAttachments();
    @Property(selector = "setAttachments:")
    public native void setAttachments(NSDictionary<NSString, QLPreviewReplyAttachment> v);
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithContextSize:isBitmap:drawingBlock:")
    protected native @Pointer long init(@ByVal CGSize contextSize, boolean isBitmap, @Block Block3<CGContext, QLPreviewReply, NSError.NSErrorPtr, Boolean> drawingBlock);
    @Method(selector = "initWithFileURL:")
    protected native @Pointer long init(NSURL fileURL);
    @Method(selector = "initWithDataOfContentType:contentSize:dataCreationBlock:")
    protected native @Pointer long init(UTType contentType, @ByVal CGSize contentSize, @Block Block2<QLPreviewReply, NSError.NSErrorPtr, NSData> dataCreationBlock);
    @Method(selector = "initForPDFWithPageSize:documentCreationBlock:")
    protected native @Pointer long init(@ByVal CGSize defaultPageSize, @Block Block2<QLPreviewReply, NSError.NSErrorPtr, PDFDocument> documentCreationBlock);
    /*</methods>*/
}
