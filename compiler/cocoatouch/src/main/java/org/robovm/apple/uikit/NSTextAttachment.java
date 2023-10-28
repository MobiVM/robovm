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
import org.robovm.apple.symbols.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSTextAttachment/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSTextAttachmentLayout, NSTextAttachmentContainer, NSSecureCoding, UIAccessibilityContentSizeCategoryImageAdjusting/*</implements>*/ {

    /*<ptr>*/public static class NSTextAttachmentPtr extends Ptr<NSTextAttachment, NSTextAttachmentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSTextAttachment.class); }/*</bind>*/
    /*<constants>*/
    public static final char AttachmentCharacter = 65532;
    /*</constants>*/
    /*<constructors>*/
    public NSTextAttachment() {}
    protected NSTextAttachment(Handle h, long handle) { super(h, handle); }
    protected NSTextAttachment(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithData:ofType:")
    public NSTextAttachment(NSData contentData, String uti) { super((SkipInit) null); initObject(init(contentData, uti)); }
    /**
     * @since Available in iOS 13.0 and later.
     */
    public NSTextAttachment(UIImage image) { super((Handle) null, create(image)); retain(getHandle()); }
    @Method(selector = "initWithCoder:")
    public NSTextAttachment(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "contents")
    public native NSData getContents();
    @Property(selector = "setContents:")
    public native void setContents(NSData v);
    @Property(selector = "fileType")
    public native String getFileType();
    @Property(selector = "setFileType:")
    public native void setFileType(String v);
    @Property(selector = "image")
    public native UIImage getImage();
    @Property(selector = "setImage:")
    public native void setImage(UIImage v);
    @Property(selector = "bounds")
    public native @ByVal CGRect getBounds();
    @Property(selector = "setBounds:")
    public native void setBounds(@ByVal CGRect v);
    @Property(selector = "fileWrapper")
    public native NSFileWrapper getFileWrapper();
    @Property(selector = "setFileWrapper:")
    public native void setFileWrapper(NSFileWrapper v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "lineLayoutPadding")
    public native @MachineSizedFloat double getLineLayoutPadding();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setLineLayoutPadding:")
    public native void setLineLayoutPadding(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "allowsTextAttachmentView")
    public native boolean allowsTextAttachmentView();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setAllowsTextAttachmentView:")
    public native void setAllowsTextAttachmentView(boolean v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "usesTextAttachmentView")
    public native boolean usesTextAttachmentView();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    @Property(selector = "adjustsImageSizeForAccessibilityContentSizeCategory")
    public native boolean adjustsImageSizeForAccessibilityContentSizeCategory();
    @Property(selector = "setAdjustsImageSizeForAccessibilityContentSizeCategory:")
    public native void setAdjustsImageSizeForAccessibilityContentSizeCategory(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithData:ofType:")
    protected native @Pointer long init(NSData contentData, String uti);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "textAttachmentViewProviderClassForFileType:")
    public static native Class<?> textAttachmentViewProviderClassForFileType(String fileType);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "registerTextAttachmentViewProviderClass:forFileType:")
    public static native void registerTextAttachmentViewProviderClass(Class<?> textAttachmentViewProviderClass, String fileType);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "textAttachmentWithImage:")
    protected static native @Pointer long create(UIImage image);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "imageForBounds:attributes:location:textContainer:")
    public native UIImage imageForBounds(@ByVal CGRect bounds, NSDictionary<NSString, ?> attributes, NSTextLocation location, NSTextContainer textContainer);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "attachmentBoundsForAttributes:location:textContainer:proposedLineFragment:position:")
    public native @ByVal CGRect attachmentBoundsForAttributes(NSDictionary<NSString, ?> attributes, NSTextLocation location, NSTextContainer textContainer, @ByVal CGRect proposedLineFragment, @ByVal CGPoint position);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "viewProviderForParentView:location:textContainer:")
    public native NSTextAttachmentViewProvider viewProviderForParentView(UIView parentView, NSTextLocation location, NSTextContainer textContainer);
    @Method(selector = "imageForBounds:textContainer:characterIndex:")
    public native UIImage getImageForBounds(@ByVal CGRect imageBounds, NSTextContainer textContainer, @MachineSizedUInt long charIndex);
    @Method(selector = "attachmentBoundsForTextContainer:proposedLineFragment:glyphPosition:characterIndex:")
    public native @ByVal CGRect getAttachmentBounds(NSTextContainer textContainer, @ByVal CGRect lineFrag, @ByVal CGPoint position, @MachineSizedUInt long charIndex);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
