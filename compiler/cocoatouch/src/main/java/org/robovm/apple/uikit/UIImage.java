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
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "isHighDynamicRange")
    public native boolean isHighDynamicRange();
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
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityDirectTouchOptions")
    public native UIAccessibilityDirectTouchOptions getAccessibilityDirectTouchOptions();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityDirectTouchOptions:")
    public native void setAccessibilityDirectTouchOptions(UIAccessibilityDirectTouchOptions v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "isAccessibilityElementBlock")
    public native @Block BooleanBlock getIsAccessibilityElementBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setIsAccessibilityElementBlock:")
    public native void setIsAccessibilityElementBlock(@Block BooleanBlock v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityLabelBlock")
    public native @Block Block0<String> getAccessibilityLabelBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityLabelBlock:")
    public native void setAccessibilityLabelBlock(@Block Block0<String> v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityValueBlock")
    public native @Block Block0<String> getAccessibilityValueBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityValueBlock:")
    public native void setAccessibilityValueBlock(@Block Block0<String> v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityHintBlock")
    public native @Block Block0<String> getAccessibilityHintBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityHintBlock:")
    public native void setAccessibilityHintBlock(@Block Block0<String> v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityTraitsBlock")
    public native @Block Block0<UIAccessibilityTraits> getAccessibilityTraitsBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityTraitsBlock:")
    public native void setAccessibilityTraitsBlock(@Block Block0<UIAccessibilityTraits> v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityIdentifierBlock")
    public native @Block Block0<String> getAccessibilityIdentifierBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityIdentifierBlock:")
    public native void setAccessibilityIdentifierBlock(@Block Block0<String> v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityHeaderElementsBlock")
    public native @Block Block0<NSArray<?>> getAccessibilityHeaderElementsBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityHeaderElementsBlock:")
    public native void setAccessibilityHeaderElementsBlock(@Block Block0<NSArray<?>> v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityAttributedLabelBlock")
    public native @Block Block0<NSAttributedString> getAccessibilityAttributedLabelBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityAttributedLabelBlock:")
    public native void setAccessibilityAttributedLabelBlock(@Block Block0<NSAttributedString> v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityAttributedHintBlock")
    public native @Block Block0<NSAttributedString> getAccessibilityAttributedHintBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityAttributedHintBlock:")
    public native void setAccessibilityAttributedHintBlock(@Block Block0<NSAttributedString> v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityLanguageBlock")
    public native @Block Block0<String> getAccessibilityLanguageBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityLanguageBlock:")
    public native void setAccessibilityLanguageBlock(@Block Block0<String> v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityTextualContextBlock")
    public native @Block Block0<String> getAccessibilityTextualContextBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityTextualContextBlock:")
    public native void setAccessibilityTextualContextBlock(@Block Block0<String> v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityUserInputLabelsBlock")
    public native @Block Block0<NSArray<NSString>> getAccessibilityUserInputLabelsBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityUserInputLabelsBlock:")
    public native void setAccessibilityUserInputLabelsBlock(@Block Block0<NSArray<NSString>> v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityAttributedUserInputLabelsBlock")
    public native @Block Block0<NSArray<NSAttributedString>> getAccessibilityAttributedUserInputLabelsBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityAttributedUserInputLabelsBlock:")
    public native void setAccessibilityAttributedUserInputLabelsBlock(@Block Block0<NSArray<NSAttributedString>> v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityAttributedValueBlock")
    public native @Block Block0<NSAttributedString> getAccessibilityAttributedValueBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityAttributedValueBlock:")
    public native void setAccessibilityAttributedValueBlock(@Block Block0<NSAttributedString> v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityElementsHiddenBlock")
    public native @Block BooleanBlock getAccessibilityElementsHiddenBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityElementsHiddenBlock:")
    public native void setAccessibilityElementsHiddenBlock(@Block BooleanBlock v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityRespondsToUserInteractionBlock")
    public native @Block BooleanBlock getAccessibilityRespondsToUserInteractionBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityRespondsToUserInteractionBlock:")
    public native void setAccessibilityRespondsToUserInteractionBlock(@Block BooleanBlock v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityViewIsModalBlock")
    public native @Block BooleanBlock getAccessibilityViewIsModalBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityViewIsModalBlock:")
    public native void setAccessibilityViewIsModalBlock(@Block BooleanBlock v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityShouldGroupAccessibilityChildrenBlock")
    public native @Block BooleanBlock getAccessibilityShouldGroupAccessibilityChildrenBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityShouldGroupAccessibilityChildrenBlock:")
    public native void setAccessibilityShouldGroupAccessibilityChildrenBlock(@Block BooleanBlock v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityElementsBlock")
    public native @Block Block0<NSArray<?>> getAccessibilityElementsBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityElementsBlock:")
    public native void setAccessibilityElementsBlock(@Block Block0<NSArray<?>> v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "automationElementsBlock")
    public native @Block Block0<NSArray<?>> getAutomationElementsBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAutomationElementsBlock:")
    public native void setAutomationElementsBlock(@Block Block0<NSArray<?>> v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityContainerTypeBlock")
    public native @Block Block0<UIAccessibilityContainerType> getAccessibilityContainerTypeBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityContainerTypeBlock:")
    public native void setAccessibilityContainerTypeBlock(@Block Block0<UIAccessibilityContainerType> v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityActivationPointBlock")
    public native @Block Block0<CGPoint> getAccessibilityActivationPointBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityActivationPointBlock:")
    public native void setAccessibilityActivationPointBlock(@Block Block0<CGPoint> v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityFrameBlock")
    public native @Block Block0<CGRect> getAccessibilityFrameBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityFrameBlock:")
    public native void setAccessibilityFrameBlock(@Block Block0<CGRect> v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityNavigationStyleBlock")
    public native @Block Block0<UIAccessibilityNavigationStyle> getAccessibilityNavigationStyleBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityNavigationStyleBlock:")
    public native void setAccessibilityNavigationStyleBlock(@Block Block0<UIAccessibilityNavigationStyle> v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityPathBlock")
    public native @Block Block0<UIBezierPath> getAccessibilityPathBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityPathBlock:")
    public native void setAccessibilityPathBlock(@Block Block0<UIBezierPath> v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityActivateBlock")
    public native @Block BooleanBlock getAccessibilityActivateBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityActivateBlock:")
    public native void setAccessibilityActivateBlock(@Block BooleanBlock v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityIncrementBlock")
    public native @Block Runnable getAccessibilityIncrementBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityIncrementBlock:")
    public native void setAccessibilityIncrementBlock(@Block Runnable v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityDecrementBlock")
    public native @Block Runnable getAccessibilityDecrementBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityDecrementBlock:")
    public native void setAccessibilityDecrementBlock(@Block Runnable v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityPerformEscapeBlock")
    public native @Block BooleanBlock getAccessibilityPerformEscapeBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityPerformEscapeBlock:")
    public native void setAccessibilityPerformEscapeBlock(@Block BooleanBlock v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityMagicTapBlock")
    public native @Block BooleanBlock getAccessibilityMagicTapBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityMagicTapBlock:")
    public native void setAccessibilityMagicTapBlock(@Block BooleanBlock v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityCustomActionsBlock")
    public native @Block Block0<NSArray<UIAccessibilityCustomAction>> getAccessibilityCustomActionsBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityCustomActionsBlock:")
    public native void setAccessibilityCustomActionsBlock(@Block Block0<NSArray<UIAccessibilityCustomAction>> v);
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
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="UIImageHEICRepresentation", optional=true)
    public native NSData toHEICData();
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
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "imageRestrictedToStandardDynamicRange")
    public native UIImage imageRestrictedToStandardDynamicRange();
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
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "systemImageNamed:variableValue:withConfiguration:")
    public static native UIImage getSystemImage(String name, double value, UIImageConfiguration configuration);
    @Method(selector = "imageNamed:")
    public static native UIImage getImage(String name);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "imageNamed:inBundle:withConfiguration:")
    public static native UIImage getImage(String name, NSBundle bundle, UIImageConfiguration configuration);
    @Method(selector = "imageNamed:inBundle:compatibleWithTraitCollection:")
    public static native UIImage getImage(String name, NSBundle bundle, UITraitCollection traitCollection);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "imageNamed:inBundle:variableValue:withConfiguration:")
    public static native UIImage getImage(String name, NSBundle bundle, double value, UIImageConfiguration configuration);
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
