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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PDFThumbnailView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*/implements NSCoding/*</implements>*/ {

    /*<ptr>*/public static class PDFThumbnailViewPtr extends Ptr<PDFThumbnailView, PDFThumbnailViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PDFThumbnailView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PDFThumbnailView() {}
    protected PDFThumbnailView(Handle h, long handle) { super(h, handle); }
    protected PDFThumbnailView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public PDFThumbnailView(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public PDFThumbnailView(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "PDFView")
    public native PDFView getPDFView();
    @Property(selector = "setPDFView:", strongRef = true)
    public native void setPDFView(PDFView v);
    @Property(selector = "backgroundColor")
    public native UIColor getBackgroundColor();
    @Property(selector = "setBackgroundColor:")
    public native void setBackgroundColor(UIColor v);
    @Property(selector = "selectedPages")
    public native NSArray<PDFPage> getSelectedPages();
    @Property(selector = "thumbnailSize")
    public native @ByVal CGSize getThumbnailSize();
    @Property(selector = "setThumbnailSize:")
    public native void setThumbnailSize(@ByVal CGSize v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "layoutMode")
    public native PDFThumbnailLayoutMode getLayoutMode();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setLayoutMode:")
    public native void setLayoutMode(PDFThumbnailLayoutMode v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "contentInset")
    public native @ByVal UIEdgeInsets getContentInset();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setContentInset:")
    public native void setContentInset(@ByVal UIEdgeInsets v);
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute attribute);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:relativeToLayoutDirection:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute semanticContentAttribute, UIUserInterfaceLayoutDirection layoutDirection);
    /*</methods>*/
}
