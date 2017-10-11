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

import org.robovm.apple.coregraphics.CGPoint;
import org.robovm.apple.foundation.NSArray;
import org.robovm.apple.foundation.NSIndexPath;
import org.robovm.apple.foundation.NSObject;
import org.robovm.apple.foundation.NSString;
import org.robovm.objc.Selector;
import org.robovm.objc.annotation.NotImplemented;
import org.robovm.rt.bro.annotation.ByVal;
import org.robovm.rt.bro.annotation.MachineSizedSInt;

public class UICollectionViewModel extends UIScrollViewDelegateAdapter implements UICollectionViewDelegate, UICollectionViewDataSource {
    @NotImplemented("collectionView:shouldHighlightItemAtIndexPath:")
    public boolean shouldHighlightItem(UICollectionView collectionView, NSIndexPath indexPath) { return false; }
    @NotImplemented("collectionView:didHighlightItemAtIndexPath:")
    public void didHighlightItem(UICollectionView collectionView, NSIndexPath indexPath) {}
    @NotImplemented("collectionView:didUnhighlightItemAtIndexPath:")
    public void didUnhighlightItem(UICollectionView collectionView, NSIndexPath indexPath) {}
    @NotImplemented("collectionView:shouldSelectItemAtIndexPath:")
    public boolean shouldSelectItem(UICollectionView collectionView, NSIndexPath indexPath) { return false; }
    @NotImplemented("collectionView:shouldDeselectItemAtIndexPath:")
    public boolean shouldDeselectItem(UICollectionView collectionView, NSIndexPath indexPath) { return false; }
    @NotImplemented("collectionView:didSelectItemAtIndexPath:")
    public void didSelectItem(UICollectionView collectionView, NSIndexPath indexPath) {}
    @NotImplemented("collectionView:didDeselectItemAtIndexPath:")
    public void didDeselectItem(UICollectionView collectionView, NSIndexPath indexPath) {}
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("collectionView:willDisplayCell:forItemAtIndexPath:")
    public void willDisplayCell(UICollectionView collectionView, UICollectionViewCell cell, NSIndexPath indexPath) {}
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("collectionView:willDisplaySupplementaryView:forElementKind:atIndexPath:")
    public void willDisplaySupplementaryView(UICollectionView collectionView, UICollectionReusableView view, String elementKind, NSIndexPath indexPath) {}
    @NotImplemented("collectionView:didEndDisplayingCell:forItemAtIndexPath:")
    public void didEndDisplayingCell(UICollectionView collectionView, UICollectionViewCell cell, NSIndexPath indexPath) {}
    @NotImplemented("collectionView:didEndDisplayingSupplementaryView:forElementOfKind:atIndexPath:")
    public void didEndDisplayingSupplementaryView(UICollectionView collectionView, UICollectionReusableView view, String elementKind, NSIndexPath indexPath) {}
    @NotImplemented("collectionView:shouldShowMenuForItemAtIndexPath:")
    public boolean shouldShowMenuForItem(UICollectionView collectionView, NSIndexPath indexPath) { return false; }
    @NotImplemented("collectionView:canPerformAction:forItemAtIndexPath:withSender:")
    public boolean canPerformAction(UICollectionView collectionView, Selector action, NSIndexPath indexPath, NSObject sender) { return false; }
    @NotImplemented("collectionView:performAction:forItemAtIndexPath:withSender:")
    public void performAction(UICollectionView collectionView, Selector action, NSIndexPath indexPath, NSObject sender) {}
    @NotImplemented("collectionView:transitionLayoutForOldLayout:newLayout:")
    public UICollectionViewTransitionLayout getTransitionLayout(UICollectionView collectionView, UICollectionViewLayout fromLayout, UICollectionViewLayout toLayout) { return null; }
    /**
     * @since Available in iOS 9.0 and later.
     */
    @NotImplemented("collectionView:canFocusItemAtIndexPath:")
    public boolean canFocusItem(UICollectionView collectionView, NSIndexPath indexPath) { return false; }
    /**
     * @since Available in iOS 9.0 and later.
     */
    @NotImplemented("collectionView:shouldUpdateFocusInContext:")
    public boolean shouldUpdateFocus(UICollectionView collectionView, UICollectionViewFocusUpdateContext context) { return false; }
    /**
     * @since Available in iOS 9.0 and later.
     */
    @NotImplemented("collectionView:didUpdateFocusInContext:withAnimationCoordinator:")
    public void didUpdateFocus(UICollectionView collectionView, UICollectionViewFocusUpdateContext context, UIFocusAnimationCoordinator coordinator) {}
    /**
     * @since Available in iOS 9.0 and later.
     */
    @NotImplemented("indexPathForPreferredFocusedViewInCollectionView:")
    public NSIndexPath getIndexPathForPreferredFocusedView(UICollectionView collectionView) { return null; }
    /**
     * @since Available in iOS 9.0 and later.
     */
    @NotImplemented("collectionView:targetIndexPathForMoveFromItemAtIndexPath:toProposedIndexPath:")
    public NSIndexPath getTargetIndexPathForMoveFromItem(UICollectionView collectionView, NSIndexPath originalIndexPath, NSIndexPath proposedIndexPath) { return null; }
    /**
     * @since Available in iOS 9.0 and later.
     */
    @NotImplemented("collectionView:targetContentOffsetForProposedContentOffset:")
    public @ByVal CGPoint getTargetContentOffsetForProposedContentOffset(UICollectionView collectionView, @ByVal CGPoint proposedContentOffset) { return null; }

    @NotImplemented("collectionView:numberOfItemsInSection:")
    public @MachineSizedSInt long getNumberOfItemsInSection(UICollectionView collectionView, @MachineSizedSInt long section) { return 0; }
    @NotImplemented("collectionView:cellForItemAtIndexPath:")
    public UICollectionViewCell getCellForItem(UICollectionView collectionView, NSIndexPath indexPath) { return null; }
    @NotImplemented("numberOfSectionsInCollectionView:")
    public @MachineSizedSInt long getNumberOfSections(UICollectionView collectionView) { return 0; }
    @NotImplemented("collectionView:viewForSupplementaryElementOfKind:atIndexPath:")
    public UICollectionReusableView getViewForSupplementaryElement(UICollectionView collectionView, String kind, NSIndexPath indexPath) { return null; }
    /**
     * @since Available in iOS 9.0 and later.
     */
    @NotImplemented("collectionView:canMoveItemAtIndexPath:")
    public boolean canMoveItemAt(UICollectionView collectionView, NSIndexPath indexPath) { return false; }
    /**
     * @since Available in iOS 9.0 and later.
     */
    @NotImplemented("collectionView:moveItemAtIndexPath:toIndexPath:")
    public void moveItemAt(UICollectionView collectionView, NSIndexPath sourceIndexPath, NSIndexPath destinationIndexPath) {}
    @NotImplemented("indexTitlesForCollectionView:")
    public NSArray<NSString> indexTitlesForCollectionView(UICollectionView collectionView) { return null; }
    @NotImplemented("collectionView:indexPathForIndexTitle:atIndex:")
    public NSIndexPath indexPathForIndexTitle(UICollectionView collectionView, String title, @MachineSizedSInt long index) { return null; }
    @NotImplemented("collectionView:shouldSpringLoadItemAtIndexPath:withContext:")
    public boolean shouldSpringLoadItem(UICollectionView collectionView, NSIndexPath indexPath, UISpringLoadedInteractionContext context) { return false; }
}
