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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PDFView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*/implements UIGestureRecognizerDelegate, UIFindInteractionDelegate/*</implements>*/ {

    /*<ptr>*/public static class PDFViewPtr extends Ptr<PDFView, PDFViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PDFView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PDFView() {}
    protected PDFView(Handle h, long handle) { super(h, handle); }
    protected PDFView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public PDFView(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public PDFView(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "document")
    public native PDFDocument getDocument();
    @Property(selector = "setDocument:")
    public native void setDocument(PDFDocument v);
    @Property(selector = "canGoToFirstPage")
    public native boolean canGoToFirstPage();
    @Property(selector = "canGoToLastPage")
    public native boolean canGoToLastPage();
    @Property(selector = "canGoToNextPage")
    public native boolean canGoToNextPage();
    @Property(selector = "canGoToPreviousPage")
    public native boolean canGoToPreviousPage();
    @Property(selector = "canGoBack")
    public native boolean canGoBack();
    @Property(selector = "canGoForward")
    public native boolean canGoForward();
    @Property(selector = "currentPage")
    public native PDFPage getCurrentPage();
    @Property(selector = "currentDestination")
    public native PDFDestination getCurrentDestination();
    @Property(selector = "displayMode")
    public native PDFDisplayMode getDisplayMode();
    @Property(selector = "setDisplayMode:")
    public native void setDisplayMode(PDFDisplayMode v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "displayDirection")
    public native PDFDisplayDirection getDisplayDirection();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setDisplayDirection:")
    public native void setDisplayDirection(PDFDisplayDirection v);
    @Property(selector = "displaysPageBreaks")
    public native boolean displaysPageBreaks();
    @Property(selector = "setDisplaysPageBreaks:")
    public native void setDisplaysPageBreaks(boolean v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "pageBreakMargins")
    public native @ByVal UIEdgeInsets getPageBreakMargins();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setPageBreakMargins:")
    public native void setPageBreakMargins(@ByVal UIEdgeInsets v);
    @Property(selector = "displayBox")
    public native PDFDisplayBox getDisplayBox();
    @Property(selector = "setDisplayBox:")
    public native void setDisplayBox(PDFDisplayBox v);
    @Property(selector = "displaysAsBook")
    public native boolean displaysAsBook();
    @Property(selector = "setDisplaysAsBook:")
    public native void setDisplaysAsBook(boolean v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "displaysRTL")
    public native boolean displaysRTL();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setDisplaysRTL:")
    public native void setDisplaysRTL(boolean v);
    @Property(selector = "backgroundColor")
    public native UIColor getBackgroundColor();
    @Property(selector = "setBackgroundColor:")
    public native void setBackgroundColor(UIColor v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "interpolationQuality")
    public native PDFInterpolationQuality getInterpolationQuality();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setInterpolationQuality:")
    public native void setInterpolationQuality(PDFInterpolationQuality v);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "pageShadowsEnabled")
    public native boolean isPageShadowsEnabled();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "enablePageShadows:")
    public native void setPageShadowsEnabled(boolean v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "isUsingPageViewController")
    public native boolean isUsingPageViewController();
    @Property(selector = "delegate")
    public native PDFViewDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(PDFViewDelegate v);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "pageOverlayViewProvider")
    public native PDFPageOverlayViewProvider getPageOverlayViewProvider();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setPageOverlayViewProvider:", strongRef = true)
    public native void setPageOverlayViewProvider(PDFPageOverlayViewProvider v);
    @Property(selector = "scaleFactor")
    public native @MachineSizedFloat double getScaleFactor();
    @Property(selector = "setScaleFactor:")
    public native void setScaleFactor(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "minScaleFactor")
    public native @MachineSizedFloat double getMinScaleFactor();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setMinScaleFactor:")
    public native void setMinScaleFactor(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "maxScaleFactor")
    public native @MachineSizedFloat double getMaxScaleFactor();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setMaxScaleFactor:")
    public native void setMaxScaleFactor(@MachineSizedFloat double v);
    @Property(selector = "autoScales")
    public native boolean isAutoScales();
    @Property(selector = "setAutoScales:")
    public native void setAutoScales(boolean v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "scaleFactorForSizeToFit")
    public native @MachineSizedFloat double getScaleFactorForSizeToFit();
    @Property(selector = "canZoomIn")
    public native boolean canZoomIn();
    @Property(selector = "canZoomOut")
    public native boolean canZoomOut();
    @Property(selector = "currentSelection")
    public native PDFSelection getCurrentSelection();
    @Property(selector = "setCurrentSelection:")
    public native void setCurrentSelection(PDFSelection v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "highlightedSelections")
    public native NSArray<PDFSelection> getHighlightedSelections();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setHighlightedSelections:")
    public native void setHighlightedSelections(NSArray<PDFSelection> v);
    @Property(selector = "documentView")
    public native UIView getDocumentView();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "visiblePages")
    public native NSArray<PDFPage> getVisiblePages();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "enableDataDetectors")
    public native boolean isEnableDataDetectors();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setEnableDataDetectors:")
    public native void setEnableDataDetectors(boolean v);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "isInMarkupMode")
    public native boolean isInMarkupMode();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setInMarkupMode:")
    public native void setInMarkupMode(boolean v);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "findInteraction")
    public native UIFindInteraction getFindInteraction();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "isFindInteractionEnabled")
    public native boolean isFindInteractionEnabled();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setFindInteractionEnabled:")
    public native void setFindInteractionEnabled(boolean v);
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "goToFirstPage:")
    public native void goToFirstPage(NSObject sender);
    @Method(selector = "goToLastPage:")
    public native void goToLastPage(NSObject sender);
    @Method(selector = "goToNextPage:")
    public native void goToNextPage(NSObject sender);
    @Method(selector = "goToPreviousPage:")
    public native void goToPreviousPage(NSObject sender);
    @Method(selector = "goBack:")
    public native void goBack(NSObject sender);
    @Method(selector = "goForward:")
    public native void goForward(NSObject sender);
    @Method(selector = "goToPage:")
    public native void goToPage(PDFPage page);
    @Method(selector = "goToDestination:")
    public native void goToDestination(PDFDestination destination);
    @Method(selector = "goToSelection:")
    public native void goToSelection(PDFSelection selection);
    @Method(selector = "goToRect:onPage:")
    public native void goToRect(@ByVal CGRect rect, PDFPage page);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "usePageViewController:withViewOptions:")
    public native void usePageViewController(boolean enable, NSDictionary<?, ?> viewOptions);
    @Method(selector = "zoomIn:")
    public native void zoomIn(NSObject sender);
    @Method(selector = "zoomOut:")
    public native void zoomOut(NSObject sender);
    @Method(selector = "areaOfInterestForMouse:")
    public native PDFAreaOfInterest areaOfInterestForMouse(UIEvent event);
    @Method(selector = "areaOfInterestForPoint:")
    public native PDFAreaOfInterest areaOfInterestForPoint(@ByVal CGPoint cursorLocation);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "performAction:")
    public native void performAction(PDFAction action);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "setCurrentSelection:animate:")
    public native void setCurrentSelection(PDFSelection selection, boolean animate);
    @Method(selector = "clearSelection")
    public native void clearSelection();
    @Method(selector = "selectAll:")
    public native void selectAll(NSObject sender);
    @Method(selector = "scrollSelectionToVisible:")
    public native void scrollSelectionToVisible(NSObject sender);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "drawPage:toContext:")
    public native void drawPage(PDFPage page, CGContext context);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "drawPagePost:toContext:")
    public native void drawPagePost(PDFPage page, CGContext context);
    @Method(selector = "copy:")
    public native void copy(NSObject sender);
    @Method(selector = "pageForPoint:nearest:")
    public native PDFPage pageForPoint(@ByVal CGPoint point, boolean nearest);
    @Method(selector = "convertPoint:toPage:")
    public native @ByVal CGPoint convertPointToPage(@ByVal CGPoint point, PDFPage page);
    @Method(selector = "convertRect:toPage:")
    public native @ByVal CGRect convertRectToPage(@ByVal CGRect rect, PDFPage page);
    @Method(selector = "convertPoint:fromPage:")
    public native @ByVal CGPoint convertPointFromPage(@ByVal CGPoint point, PDFPage page);
    @Method(selector = "convertRect:fromPage:")
    public native @ByVal CGRect convertRectFromPage(@ByVal CGRect rect, PDFPage page);
    @Method(selector = "layoutDocumentView")
    public native void layoutDocumentView();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "annotationsChangedOnPage:")
    public native void annotationsChangedOnPage(PDFPage page);
    @Method(selector = "rowSizeForPage:")
    public native @ByVal CGSize rowSizeForPage(PDFPage page);
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
    @Method(selector = "gestureRecognizerShouldBegin:")
    public native boolean shouldBegin(UIGestureRecognizer gestureRecognizer);
    @Method(selector = "gestureRecognizer:shouldRecognizeSimultaneouslyWithGestureRecognizer:")
    public native boolean shouldRecognizeSimultaneously(UIGestureRecognizer gestureRecognizer, UIGestureRecognizer otherGestureRecognizer);
    @Method(selector = "gestureRecognizer:shouldRequireFailureOfGestureRecognizer:")
    public native boolean shouldRequireFailure(UIGestureRecognizer gestureRecognizer, UIGestureRecognizer otherGestureRecognizer);
    @Method(selector = "gestureRecognizer:shouldBeRequiredToFailByGestureRecognizer:")
    public native boolean shouldBeRequiredToFail(UIGestureRecognizer gestureRecognizer, UIGestureRecognizer otherGestureRecognizer);
    @Method(selector = "gestureRecognizer:shouldReceiveTouch:")
    public native boolean shouldReceiveTouch(UIGestureRecognizer gestureRecognizer, UITouch touch);
    @Method(selector = "gestureRecognizer:shouldReceivePress:")
    public native boolean shouldReceivePress(UIGestureRecognizer gestureRecognizer, UIPress press);
    /**
     * @since Available in iOS 13.4 and later.
     */
    @Method(selector = "gestureRecognizer:shouldReceiveEvent:")
    public native boolean shouldReceiveEvent(UIGestureRecognizer gestureRecognizer, UIEvent event);
    @Method(selector = "findInteraction:sessionForView:")
    public native UIFindSession getSession(UIFindInteraction interaction, UIView view);
    @Method(selector = "findInteraction:didBeginFindSession:")
    public native void didBeginFindSession(UIFindInteraction interaction, UIFindSession session);
    @Method(selector = "findInteraction:didEndFindSession:")
    public native void didEndFindSession(UIFindInteraction interaction, UIFindSession session);
    /*</methods>*/
}
