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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UICollectionViewController/*</name>*/ 
    extends /*<extends>*/UIViewController/*</extends>*/ 
    /*<implements>*/implements UICollectionViewDelegate, UICollectionViewDataSource/*</implements>*/ {

    /*<ptr>*/public static class UICollectionViewControllerPtr extends Ptr<UICollectionViewController, UICollectionViewControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UICollectionViewController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UICollectionViewController() {}
    protected UICollectionViewController(Handle h, long handle) { super(h, handle); }
    protected UICollectionViewController(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCollectionViewLayout:")
    public UICollectionViewController(UICollectionViewLayout layout) { super((SkipInit) null); initObject(init(layout)); }
    @Method(selector = "initWithNibName:bundle:")
    public UICollectionViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { super((SkipInit) null); initObject(init(nibNameOrNil, nibBundleOrNil)); }
    @Method(selector = "initWithCoder:")
    public UICollectionViewController(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "collectionView")
    public native UICollectionView getCollectionView();
    @Property(selector = "setCollectionView:")
    public native void setCollectionView(UICollectionView v);
    @Property(selector = "clearsSelectionOnViewWillAppear")
    public native boolean clearsSelectionOnViewWillAppear();
    @Property(selector = "setClearsSelectionOnViewWillAppear:")
    public native void setClearsSelectionOnViewWillAppear(boolean v);
    @Property(selector = "useLayoutToLayoutNavigationTransitions")
    public native boolean usesLayoutToLayoutNavigationTransitions();
    @Property(selector = "setUseLayoutToLayoutNavigationTransitions:")
    public native void setUsesLayoutToLayoutNavigationTransitions(boolean v);
    @Property(selector = "collectionViewLayout")
    public native UICollectionViewLayout getCollectionViewLayout();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "installsStandardGestureForInteractiveMovement")
    public native boolean installsStandardGestureForInteractiveMovement();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setInstallsStandardGestureForInteractiveMovement:")
    public native void setInstallsStandardGestureForInteractiveMovement(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCollectionViewLayout:")
    protected native @Pointer long init(UICollectionViewLayout layout);
    @Method(selector = "initWithNibName:bundle:")
    protected native @Pointer long init(String nibNameOrNil, NSBundle nibBundleOrNil);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    @Method(selector = "collectionView:shouldHighlightItemAtIndexPath:")
    public native boolean shouldHighlightItem(UICollectionView collectionView, NSIndexPath indexPath);
    @Method(selector = "collectionView:didHighlightItemAtIndexPath:")
    public native void didHighlightItem(UICollectionView collectionView, NSIndexPath indexPath);
    @Method(selector = "collectionView:didUnhighlightItemAtIndexPath:")
    public native void didUnhighlightItem(UICollectionView collectionView, NSIndexPath indexPath);
    @Method(selector = "collectionView:shouldSelectItemAtIndexPath:")
    public native boolean shouldSelectItem(UICollectionView collectionView, NSIndexPath indexPath);
    @Method(selector = "collectionView:shouldDeselectItemAtIndexPath:")
    public native boolean shouldDeselectItem(UICollectionView collectionView, NSIndexPath indexPath);
    @Method(selector = "collectionView:didSelectItemAtIndexPath:")
    public native void didSelectItem(UICollectionView collectionView, NSIndexPath indexPath);
    @Method(selector = "collectionView:didDeselectItemAtIndexPath:")
    public native void didDeselectItem(UICollectionView collectionView, NSIndexPath indexPath);
    @Method(selector = "collectionView:willDisplayCell:forItemAtIndexPath:")
    public native void willDisplayCell(UICollectionView collectionView, UICollectionViewCell cell, NSIndexPath indexPath);
    @Method(selector = "collectionView:willDisplaySupplementaryView:forElementKind:atIndexPath:")
    public native void willDisplaySupplementaryView(UICollectionView collectionView, UICollectionReusableView view, String elementKind, NSIndexPath indexPath);
    @Method(selector = "collectionView:didEndDisplayingCell:forItemAtIndexPath:")
    public native void didEndDisplayingCell(UICollectionView collectionView, UICollectionViewCell cell, NSIndexPath indexPath);
    @Method(selector = "collectionView:didEndDisplayingSupplementaryView:forElementOfKind:atIndexPath:")
    public native void didEndDisplayingSupplementaryView(UICollectionView collectionView, UICollectionReusableView view, String elementKind, NSIndexPath indexPath);
    /**
     * @deprecated Deprecated in iOS 13.0. Use collectionView:contextMenuConfigurationForItemAtIndexPath:
     */
    @Deprecated
    @Method(selector = "collectionView:shouldShowMenuForItemAtIndexPath:")
    public native boolean shouldShowMenuForItem(UICollectionView collectionView, NSIndexPath indexPath);
    /**
     * @deprecated Deprecated in iOS 13.0. Use collectionView:contextMenuConfigurationForItemAtIndexPath:
     */
    @Deprecated
    @Method(selector = "collectionView:canPerformAction:forItemAtIndexPath:withSender:")
    public native boolean canPerformAction(UICollectionView collectionView, Selector action, NSIndexPath indexPath, NSObject sender);
    /**
     * @deprecated Deprecated in iOS 13.0. Use collectionView:contextMenuConfigurationForItemAtIndexPath:
     */
    @Deprecated
    @Method(selector = "collectionView:performAction:forItemAtIndexPath:withSender:")
    public native void performAction(UICollectionView collectionView, Selector action, NSIndexPath indexPath, NSObject sender);
    @Method(selector = "collectionView:transitionLayoutForOldLayout:newLayout:")
    public native UICollectionViewTransitionLayout getTransitionLayout(UICollectionView collectionView, UICollectionViewLayout fromLayout, UICollectionViewLayout toLayout);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "collectionView:canFocusItemAtIndexPath:")
    public native boolean canFocusItem(UICollectionView collectionView, NSIndexPath indexPath);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "collectionView:shouldUpdateFocusInContext:")
    public native boolean shouldUpdateFocus(UICollectionView collectionView, UICollectionViewFocusUpdateContext context);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "collectionView:didUpdateFocusInContext:withAnimationCoordinator:")
    public native void didUpdateFocus(UICollectionView collectionView, UICollectionViewFocusUpdateContext context, UIFocusAnimationCoordinator coordinator);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "indexPathForPreferredFocusedViewInCollectionView:")
    public native NSIndexPath getIndexPathForPreferredFocusedView(UICollectionView collectionView);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "collectionView:selectionFollowsFocusForItemAtIndexPath:")
    public native boolean isSelectionFollowsFocus(UICollectionView collectionView, NSIndexPath indexPath);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "collectionView:targetIndexPathForMoveOfItemFromOriginalIndexPath:atCurrentIndexPath:toProposedIndexPath:")
    public native NSIndexPath getTargetIndexPathForMoveOfItemFromOriginalIndexPath(UICollectionView collectionView, NSIndexPath originalIndexPath, NSIndexPath currentIndexPath, NSIndexPath proposedIndexPath);
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 15.0. Use collectionView:targetIndexPathForMoveOfItemFromOriginalIndexPath:atCurrentIndexPath:toProposedIndexPath:
     */
    @Deprecated
    @Method(selector = "collectionView:targetIndexPathForMoveFromItemAtIndexPath:toProposedIndexPath:")
    public native NSIndexPath getTargetIndexPathForMoveFromItem(UICollectionView collectionView, NSIndexPath currentIndexPath, NSIndexPath proposedIndexPath);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "collectionView:targetContentOffsetForProposedContentOffset:")
    public native @ByVal CGPoint getTargetContentOffsetForProposedContentOffset(UICollectionView collectionView, @ByVal CGPoint proposedContentOffset);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "collectionView:canEditItemAtIndexPath:")
    public native boolean canEditItem(UICollectionView collectionView, NSIndexPath indexPath);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "collectionView:shouldSpringLoadItemAtIndexPath:withContext:")
    public native boolean shouldSpringLoadItem(UICollectionView collectionView, NSIndexPath indexPath, UISpringLoadedInteractionContext context);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "collectionView:shouldBeginMultipleSelectionInteractionAtIndexPath:")
    public native boolean shouldBeginMultipleSelectionInteraction(UICollectionView collectionView, NSIndexPath indexPath);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "collectionView:didBeginMultipleSelectionInteractionAtIndexPath:")
    public native void didBeginMultipleSelectionInteraction(UICollectionView collectionView, NSIndexPath indexPath);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "collectionViewDidEndMultipleSelectionInteraction:")
    public native void collectionViewDidEndMultipleSelectionInteraction(UICollectionView collectionView);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "collectionView:contextMenuConfigurationForItemAtIndexPath:point:")
    public native UIContextMenuConfiguration getContextMenuConfiguration(UICollectionView collectionView, NSIndexPath indexPath, @ByVal CGPoint point);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "collectionView:previewForHighlightingContextMenuWithConfiguration:")
    public native UITargetedPreview getPreviewForHighlightingContextMenu(UICollectionView collectionView, UIContextMenuConfiguration configuration);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "collectionView:previewForDismissingContextMenuWithConfiguration:")
    public native UITargetedPreview getPreviewForDismissingContextMenu(UICollectionView collectionView, UIContextMenuConfiguration configuration);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "collectionView:willPerformPreviewActionForMenuWithConfiguration:animator:")
    public native void willPerformPreviewAction(UICollectionView collectionView, UIContextMenuConfiguration configuration, UIContextMenuInteractionCommitAnimating animator);
    /**
     * @since Available in iOS 13.2 and later.
     */
    @Method(selector = "collectionView:willDisplayContextMenuWithConfiguration:animator:")
    public native void willDisplayContextMenu(UICollectionView collectionView, UIContextMenuConfiguration configuration, UIContextMenuInteractionAnimating animator);
    /**
     * @since Available in iOS 13.2 and later.
     */
    @Method(selector = "collectionView:willEndContextMenuInteractionWithConfiguration:animator:")
    public native void willEndContextMenuInteraction(UICollectionView collectionView, UIContextMenuConfiguration configuration, UIContextMenuInteractionAnimating animator);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "collectionView:sceneActivationConfigurationForItemAtIndexPath:point:")
    public native UIWindowSceneActivationConfiguration getSceneActivationConfiguration(UICollectionView collectionView, NSIndexPath indexPath, @ByVal CGPoint point);
    @Method(selector = "scrollViewDidScroll:")
    public native void didScroll(UIScrollView scrollView);
    @Method(selector = "scrollViewDidZoom:")
    public native void didZoom(UIScrollView scrollView);
    @Method(selector = "scrollViewWillBeginDragging:")
    public native void willBeginDragging(UIScrollView scrollView);
    @Method(selector = "scrollViewWillEndDragging:withVelocity:targetContentOffset:")
    public native void willEndDragging(UIScrollView scrollView, @ByVal CGPoint velocity, CGPoint targetContentOffset);
    @Method(selector = "scrollViewDidEndDragging:willDecelerate:")
    public native void didEndDragging(UIScrollView scrollView, boolean decelerate);
    @Method(selector = "scrollViewWillBeginDecelerating:")
    public native void willBeginDecelerating(UIScrollView scrollView);
    @Method(selector = "scrollViewDidEndDecelerating:")
    public native void didEndDecelerating(UIScrollView scrollView);
    @Method(selector = "scrollViewDidEndScrollingAnimation:")
    public native void didEndScrollingAnimation(UIScrollView scrollView);
    @Method(selector = "viewForZoomingInScrollView:")
    public native UIView getViewForZooming(UIScrollView scrollView);
    @Method(selector = "scrollViewWillBeginZooming:withView:")
    public native void willBeginZooming(UIScrollView scrollView, UIView view);
    @Method(selector = "scrollViewDidEndZooming:withView:atScale:")
    public native void didEndZooming(UIScrollView scrollView, UIView view, @MachineSizedFloat double scale);
    @Method(selector = "scrollViewShouldScrollToTop:")
    public native boolean shouldScrollToTop(UIScrollView scrollView);
    @Method(selector = "scrollViewDidScrollToTop:")
    public native void didScrollToTop(UIScrollView scrollView);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "scrollViewDidChangeAdjustedContentInset:")
    public native void scrollViewDidChangeAdjustedContentInset(UIScrollView scrollView);
    @Method(selector = "collectionView:numberOfItemsInSection:")
    public native @MachineSizedSInt long getNumberOfItemsInSection(UICollectionView collectionView, @MachineSizedSInt long section);
    @Method(selector = "collectionView:cellForItemAtIndexPath:")
    public native UICollectionViewCell getCellForItem(UICollectionView collectionView, NSIndexPath indexPath);
    @Method(selector = "numberOfSectionsInCollectionView:")
    public native @MachineSizedSInt long getNumberOfSections(UICollectionView collectionView);
    @Method(selector = "collectionView:viewForSupplementaryElementOfKind:atIndexPath:")
    public native UICollectionReusableView getViewForSupplementaryElement(UICollectionView collectionView, String kind, NSIndexPath indexPath);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "collectionView:canMoveItemAtIndexPath:")
    public native boolean canMoveItemAt(UICollectionView collectionView, NSIndexPath indexPath);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "collectionView:moveItemAtIndexPath:toIndexPath:")
    public native void moveItemAt(UICollectionView collectionView, NSIndexPath sourceIndexPath, NSIndexPath destinationIndexPath);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "indexTitlesForCollectionView:")
    public native NSArray<NSString> indexTitlesForCollectionView(UICollectionView collectionView);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "collectionView:indexPathForIndexTitle:atIndex:")
    public native NSIndexPath indexPathForIndexTitle(UICollectionView collectionView, String title, @MachineSizedSInt long index);
    /*</methods>*/
}
