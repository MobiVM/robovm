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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIImage/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UIAccessibility, UIAccessibilityIdentification/*</implements>*/ {

    /*<ptr>*/public static class UIImagePtr extends Ptr<UIImage, UIImagePtr> {}/*</ptr>*/
    
    private static java.util.concurrent.atomic.AtomicLong id = new java.util.concurrent.atomic.AtomicLong();
    private static final Selector didFinishSaving = Selector.register("image:didFinishSavingWithError:contextInfo:");
    private static final LongMap<CallbackWrapper> callbacks = new LongMap<>();
    private static class CallbackWrapper extends NSObject {
        private final VoidBlock2<UIImage, NSError> callback;
        private CallbackWrapper(VoidBlock2<UIImage, NSError> callback, long contextInfo) {
            this.callback = callback;
            
            synchronized (callbacks) {
                callbacks.put(contextInfo, this);
            }
        }
        @TypeEncoding("v@:@:^v")
        @Method(selector = "image:didFinishSavingWithError:contextInfo:")
        private void didFinishSaving(UIImage image, NSError error, @Pointer long contextInfo) {
            callback.invoke(image, error);
            
            synchronized (callbacks) {
                callbacks.remove(contextInfo);
            }
        }
    }
    
    /*<bind>*/static { ObjCRuntime.bind(UIImage.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIImage() {}
    protected UIImage(Handle h, long handle) { super(h, handle); }
    protected UIImage(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithData:")
    public UIImage(NSData data) { super((SkipInit) null); initObject(init(data)); }
    @Method(selector = "initWithData:scale:")
    public UIImage(NSData data, @MachineSizedFloat double scale) { super((SkipInit) null); initObject(init(data, scale)); }
    @Method(selector = "initWithCGImage:")
    public UIImage(CGImage cgImage) { super((SkipInit) null); initObject(init(cgImage)); }
    @Method(selector = "initWithCGImage:scale:orientation:")
    public UIImage(CGImage cgImage, @MachineSizedFloat double scale, UIImageOrientation orientation) { super((SkipInit) null); initObject(init(cgImage, scale, orientation)); }
    @WeaklyLinked
    @Method(selector = "initWithCIImage:")
    public UIImage(CIImage ciImage) { super((SkipInit) null); initObject(init(ciImage)); }
    @WeaklyLinked
    @Method(selector = "initWithCIImage:scale:orientation:")
    public UIImage(CIImage ciImage, @MachineSizedFloat double scale, UIImageOrientation orientation) { super((SkipInit) null); initObject(init(ciImage, scale, orientation)); }
    /*</constructors>*/
    public UIImage(File file) {
        super((SkipInit) null);
        initObject(initWithFile(file.getAbsolutePath()));
    }
    /*<properties>*/
    @Property(selector = "size")
    public native @ByVal CGSize getSize();
    @Property(selector = "CGImage")
    public native CGImage getCGImage();
    @WeaklyLinked
    @Property(selector = "CIImage")
    public native CIImage getCIImage();
    @Property(selector = "imageOrientation")
    public native UIImageOrientation getOrientation();
    @Property(selector = "scale")
    public native @MachineSizedFloat double getScale();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "isSymbolImage")
    public native boolean isSymbolImage();
    @Property(selector = "images")
    public native NSArray<UIImage> getImages();
    @Property(selector = "duration")
    public native double getDuration();
    @Property(selector = "capInsets")
    public native @ByVal UIEdgeInsets getCapInsets();
    @Property(selector = "resizingMode")
    public native UIImageResizingMode getResizingMode();
    @Property(selector = "alignmentRectInsets")
    public native @ByVal UIEdgeInsets getAlignmentRectInsets();
    @Property(selector = "renderingMode")
    public native UIImageRenderingMode getRenderingMode();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "imageRendererFormat")
    public native UIGraphicsImageRendererFormat getImageRendererFormat();
    @Property(selector = "traitCollection")
    public native UITraitCollection getTraitCollection();
    @Property(selector = "imageAsset")
    public native UIImageAsset getImageAsset();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "flipsForRightToLeftLayoutDirection")
    public native boolean flipsHorizontally();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "baselineOffsetFromBottom")
    public native @MachineSizedFloat double getBaselineOffsetFromBottom();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "hasBaseline")
    public native boolean hasBaseline();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "configuration")
    public native UIImageConfiguration getConfiguration();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "symbolConfiguration")
    public native UIImageSymbolConfiguration getSymbolConfiguration();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "actionsImage")
    public static native UIImage getActionsImage();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "addImage")
    public static native UIImage getAddImage();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "removeImage")
    public static native UIImage getRemoveImage();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "checkmarkImage")
    public static native UIImage getCheckmarkImage();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "strokedCheckmarkImage")
    public static native UIImage getStrokedCheckmarkImage();
    @Property(selector = "leftCapWidth")
    public native @MachineSizedSInt long getLeftCapWidth();
    @Property(selector = "topCapHeight")
    public native @MachineSizedSInt long getTopCapHeight();
    @Property(selector = "isAccessibilityElement")
    public native boolean isAccessibilityElement();
    @Property(selector = "setIsAccessibilityElement:")
    public native void setAccessibilityElement(boolean v);
    @Property(selector = "accessibilityLabel")
    public native String getAccessibilityLabel();
    @Property(selector = "setAccessibilityLabel:")
    public native void setAccessibilityLabel(String v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "accessibilityAttributedLabel")
    public native NSAttributedString getAccessibilityAttributedLabel();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setAccessibilityAttributedLabel:")
    public native void setAccessibilityAttributedLabel(NSAttributedString v);
    @Property(selector = "accessibilityHint")
    public native String getAccessibilityHint();
    @Property(selector = "setAccessibilityHint:")
    public native void setAccessibilityHint(String v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "accessibilityAttributedHint")
    public native NSAttributedString getAccessibilityAttributedHint();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setAccessibilityAttributedHint:")
    public native void setAccessibilityAttributedHint(NSAttributedString v);
    @Property(selector = "accessibilityValue")
    public native String getAccessibilityValue();
    @Property(selector = "setAccessibilityValue:")
    public native void setAccessibilityValue(String v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "accessibilityAttributedValue")
    public native NSAttributedString getAccessibilityAttributedValue();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setAccessibilityAttributedValue:")
    public native void setAccessibilityAttributedValue(NSAttributedString v);
    @Property(selector = "accessibilityTraits")
    public native UIAccessibilityTraits getAccessibilityTraits();
    @Property(selector = "setAccessibilityTraits:")
    public native void setAccessibilityTraits(UIAccessibilityTraits v);
    @Property(selector = "accessibilityFrame")
    public native @ByVal CGRect getAccessibilityFrame();
    @Property(selector = "setAccessibilityFrame:")
    public native void setAccessibilityFrame(@ByVal CGRect v);
    @Property(selector = "accessibilityPath")
    public native UIBezierPath getAccessibilityPath();
    @Property(selector = "setAccessibilityPath:")
    public native void setAccessibilityPath(UIBezierPath v);
    @Property(selector = "accessibilityActivationPoint")
    public native @ByVal CGPoint getAccessibilityActivationPoint();
    @Property(selector = "setAccessibilityActivationPoint:")
    public native void setAccessibilityActivationPoint(@ByVal CGPoint v);
    @Property(selector = "accessibilityLanguage")
    public native String getAccessibilityLanguage();
    @Property(selector = "setAccessibilityLanguage:")
    public native void setAccessibilityLanguage(String v);
    @Property(selector = "accessibilityElementsHidden")
    public native boolean areAccessibilityElementsHidden();
    @Property(selector = "setAccessibilityElementsHidden:")
    public native void setAccessibilityElementsHidden(boolean v);
    @Property(selector = "accessibilityViewIsModal")
    public native boolean isAccessibilityViewModal();
    @Property(selector = "setAccessibilityViewIsModal:")
    public native void setAccessibilityViewModal(boolean v);
    @Property(selector = "shouldGroupAccessibilityChildren")
    public native boolean shouldGroupAccessibilityChildren();
    @Property(selector = "setShouldGroupAccessibilityChildren:")
    public native void setShouldGroupAccessibilityChildren(boolean v);
    @Property(selector = "accessibilityNavigationStyle")
    public native UIAccessibilityNavigationStyle getAccessibilityNavigationStyle();
    @Property(selector = "setAccessibilityNavigationStyle:")
    public native void setAccessibilityNavigationStyle(UIAccessibilityNavigationStyle v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "accessibilityRespondsToUserInteraction")
    public native boolean isAccessibilityRespondsToUserInteraction();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setAccessibilityRespondsToUserInteraction:")
    public native void setAccessibilityRespondsToUserInteraction(boolean v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "accessibilityUserInputLabels")
    public native NSArray<NSString> getAccessibilityUserInputLabels();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setAccessibilityUserInputLabels:")
    public native void setAccessibilityUserInputLabels(NSArray<NSString> v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "accessibilityAttributedUserInputLabels")
    public native NSArray<NSAttributedString> getAccessibilityAttributedUserInputLabels();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setAccessibilityAttributedUserInputLabels:")
    public native void setAccessibilityAttributedUserInputLabels(NSArray<NSAttributedString> v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "accessibilityTextualContext")
    public native String getAccessibilityTextualContext();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setAccessibilityTextualContext:")
    public native void setAccessibilityTextualContext(String v);
    @Property(selector = "accessibilityIdentifier")
    public native String getAccessibilityIdentifier();
    @Property(selector = "setAccessibilityIdentifier:")
    public native void setAccessibilityIdentifier(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    public void saveToPhotosAlbum(VoidBlock2<UIImage, NSError> callback) {
        if (callback != null) {
            long context = id.getAndIncrement();
            CallbackWrapper l = new CallbackWrapper(callback, context);
            saveToPhotosAlbum(l, didFinishSaving, context);
        } else {
            saveToPhotosAlbum(null, null, 0);
        }
    }
    
    public static UIImage getImage(File file) {
        return getImageWithContentsOfFile(file.getAbsolutePath());
    }
    /*<methods>*/
    @Bridge(symbol="UIImagePNGRepresentation", optional=true)
    public native NSData toPNGData();
    @Bridge(symbol="UIImageJPEGRepresentation", optional=true)
    public native NSData toJPEGData(@MachineSizedFloat double compressionQuality);
    @Bridge(symbol="UIImageWriteToSavedPhotosAlbum", optional=true)
    public native void saveToPhotosAlbum(NSObject completionTarget, Selector completionSelector, @Pointer long contextInfo);
    
    @Method(selector = "initWithContentsOfFile:")
    protected native @Pointer long initWithFile(String path);
    @Method(selector = "initWithData:")
    protected native @Pointer long init(NSData data);
    @Method(selector = "initWithData:scale:")
    protected native @Pointer long init(NSData data, @MachineSizedFloat double scale);
    @Method(selector = "initWithCGImage:")
    protected native @Pointer long init(CGImage cgImage);
    @Method(selector = "initWithCGImage:scale:orientation:")
    protected native @Pointer long init(CGImage cgImage, @MachineSizedFloat double scale, UIImageOrientation orientation);
    @WeaklyLinked
    @Method(selector = "initWithCIImage:")
    protected native @Pointer long init(CIImage ciImage);
    @WeaklyLinked
    @Method(selector = "initWithCIImage:scale:orientation:")
    protected native @Pointer long init(CIImage ciImage, @MachineSizedFloat double scale, UIImageOrientation orientation);
    @Method(selector = "drawAtPoint:")
    public native void draw(@ByVal CGPoint point);
    @Method(selector = "drawAtPoint:blendMode:alpha:")
    public native void draw(@ByVal CGPoint point, CGBlendMode blendMode, @MachineSizedFloat double alpha);
    @Method(selector = "drawInRect:")
    public native void draw(@ByVal CGRect rect);
    @Method(selector = "drawInRect:blendMode:alpha:")
    public native void draw(@ByVal CGRect rect, CGBlendMode blendMode, @MachineSizedFloat double alpha);
    @Method(selector = "drawAsPatternInRect:")
    public native void drawAsPattern(@ByVal CGRect rect);
    @Method(selector = "resizableImageWithCapInsets:")
    public native UIImage newResizableImage(@ByVal UIEdgeInsets capInsets);
    @Method(selector = "resizableImageWithCapInsets:resizingMode:")
    public native UIImage newResizableImage(@ByVal UIEdgeInsets capInsets, UIImageResizingMode resizingMode);
    @Method(selector = "imageWithAlignmentRectInsets:")
    public native UIImage newImage(@ByVal UIEdgeInsets alignmentInsets);
    @Method(selector = "imageWithRenderingMode:")
    public native UIImage newImage(UIImageRenderingMode renderingMode);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "imageFlippedForRightToLeftLayoutDirection")
    public native UIImage flipHorizontally();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "imageWithHorizontallyFlippedOrientation")
    public native UIImage imageWithHorizontallyFlippedOrientation();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "imageWithBaselineOffsetFromBottom:")
    public native UIImage imageWithBaselineOffsetFromBottom(@MachineSizedFloat double baselineOffset);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "imageWithoutBaseline")
    public native UIImage imageWithoutBaseline();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "imageWithConfiguration:")
    public native UIImage imageWithConfiguration(UIImageConfiguration configuration);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "imageByApplyingSymbolConfiguration:")
    public native UIImage imageByApplyingSymbolConfiguration(UIImageSymbolConfiguration configuration);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "imageWithTintColor:")
    public native UIImage imageWithTintColor(UIColor color);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "imageWithTintColor:renderingMode:")
    public native UIImage imageWithTintColor(UIColor color, UIImageRenderingMode renderingMode);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "imageByPreparingForDisplay")
    public native UIImage imageByPreparingForDisplay();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "prepareForDisplayWithCompletionHandler:")
    public native void prepareForDisplay(@Block VoidBlock1<UIImage> completionHandler);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "imageByPreparingThumbnailOfSize:")
    public native UIImage imageByPreparingThumbnailOfSize(@ByVal CGSize size);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "prepareThumbnailOfSize:completionHandler:")
    public native void prepareThumbnail(@ByVal CGSize size, @Block VoidBlock1<UIImage> completionHandler);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "systemImageNamed:")
    public static native UIImage systemImageNamed(String name);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "systemImageNamed:withConfiguration:")
    public static native UIImage getSystemImage(String name, UIImageConfiguration configuration);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "systemImageNamed:compatibleWithTraitCollection:")
    public static native UIImage getSystemImage(String name, UITraitCollection traitCollection);
    @Method(selector = "imageNamed:")
    public static native UIImage getImage(String name);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "imageNamed:inBundle:withConfiguration:")
    public static native UIImage getImage(String name, NSBundle bundle, UIImageConfiguration configuration);
    @Method(selector = "imageNamed:inBundle:compatibleWithTraitCollection:")
    public static native UIImage getImage(String name, NSBundle bundle, UITraitCollection traitCollection);
    @Method(selector = "imageWithContentsOfFile:")
    private static native UIImage getImageWithContentsOfFile(String path);
    @Method(selector = "animatedImageNamed:duration:")
    public static native UIImage getAnimatedImage(String name, double duration);
    @Method(selector = "animatedResizableImageNamed:capInsets:duration:")
    public static native UIImage getAnimatedResizableImage(String name, @ByVal UIEdgeInsets capInsets, double duration);
    @Method(selector = "animatedResizableImageNamed:capInsets:resizingMode:duration:")
    public static native UIImage getAnimatedResizableImage(String name, @ByVal UIEdgeInsets capInsets, UIImageResizingMode resizingMode, double duration);
    @Method(selector = "animatedImageWithImages:duration:")
    public static native UIImage getAnimatedImage(NSArray<UIImage> images, double duration);
    /*</methods>*/
}
