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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UICollectionViewDelegateAdapter/*</name>*/ 
    extends /*<extends>*/UIScrollViewDelegateAdapter/*</extends>*/ 
    /*<implements>*/implements UICollectionViewDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
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
     * @since Available in iOS 16.0 and later.
     */
    @NotImplemented("collectionView:canPerformPrimaryActionForItemAtIndexPath:")
    public boolean canPerformPrimaryAction(UICollectionView collectionView, NSIndexPath indexPath) { return false; }
    /**
     * @since Available in iOS 16.0 and later.
     */
    @NotImplemented("collectionView:performPrimaryActionForItemAtIndexPath:")
    public void performPrimaryAction(UICollectionView collectionView, NSIndexPath indexPath) {}
    @NotImplemented("collectionView:willDisplayCell:forItemAtIndexPath:")
    public void willDisplayCell(UICollectionView collectionView, UICollectionViewCell cell, NSIndexPath indexPath) {}
    @NotImplemented("collectionView:willDisplaySupplementaryView:forElementKind:atIndexPath:")
    public void willDisplaySupplementaryView(UICollectionView collectionView, UICollectionReusableView view, String elementKind, NSIndexPath indexPath) {}
    @NotImplemented("collectionView:didEndDisplayingCell:forItemAtIndexPath:")
    public void didEndDisplayingCell(UICollectionView collectionView, UICollectionViewCell cell, NSIndexPath indexPath) {}
    @NotImplemented("collectionView:didEndDisplayingSupplementaryView:forElementOfKind:atIndexPath:")
    public void didEndDisplayingSupplementaryView(UICollectionView collectionView, UICollectionReusableView view, String elementKind, NSIndexPath indexPath) {}
    /**
     * @deprecated Deprecated in iOS 13.0. Use collectionView:contextMenuConfigurationForItemsAtIndexPaths:point:
     */
    @Deprecated
    @NotImplemented("collectionView:shouldShowMenuForItemAtIndexPath:")
    public boolean shouldShowMenuForItem(UICollectionView collectionView, NSIndexPath indexPath) { return false; }
    /**
     * @deprecated Deprecated in iOS 13.0. Use collectionView:contextMenuConfigurationForItemsAtIndexPaths:point:
     */
    @Deprecated
    @NotImplemented("collectionView:canPerformAction:forItemAtIndexPath:withSender:")
    public boolean canPerformAction(UICollectionView collectionView, Selector action, NSIndexPath indexPath, NSObject sender) { return false; }
    /**
     * @deprecated Deprecated in iOS 13.0. Use collectionView:contextMenuConfigurationForItemsAtIndexPaths:point:
     */
    @Deprecated
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
     * @since Available in iOS 15.0 and later.
     */
    @NotImplemented("collectionView:selectionFollowsFocusForItemAtIndexPath:")
    public boolean isSelectionFollowsFocus(UICollectionView collectionView, NSIndexPath indexPath) { return false; }
    /**
     * @since Available in iOS 15.0 and later.
     */
    @NotImplemented("collectionView:targetIndexPathForMoveOfItemFromOriginalIndexPath:atCurrentIndexPath:toProposedIndexPath:")
    public NSIndexPath getTargetIndexPathForMoveOfItemFromOriginalIndexPath(UICollectionView collectionView, NSIndexPath originalIndexPath, NSIndexPath currentIndexPath, NSIndexPath proposedIndexPath) { return null; }
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 15.0. Use collectionView:targetIndexPathForMoveOfItemFromOriginalIndexPath:atCurrentIndexPath:toProposedIndexPath:
     */
    @Deprecated
    @NotImplemented("collectionView:targetIndexPathForMoveFromItemAtIndexPath:toProposedIndexPath:")
    public NSIndexPath getTargetIndexPathForMoveFromItem(UICollectionView collectionView, NSIndexPath currentIndexPath, NSIndexPath proposedIndexPath) { return null; }
    /**
     * @since Available in iOS 9.0 and later.
     */
    @NotImplemented("collectionView:targetContentOffsetForProposedContentOffset:")
    public @ByVal CGPoint getTargetContentOffsetForProposedContentOffset(UICollectionView collectionView, @ByVal CGPoint proposedContentOffset) { return null; }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @NotImplemented("collectionView:canEditItemAtIndexPath:")
    public boolean canEditItem(UICollectionView collectionView, NSIndexPath indexPath) { return false; }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("collectionView:shouldSpringLoadItemAtIndexPath:withContext:")
    public boolean shouldSpringLoadItem(UICollectionView collectionView, NSIndexPath indexPath, UISpringLoadedInteractionContext context) { return false; }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("collectionView:shouldBeginMultipleSelectionInteractionAtIndexPath:")
    public boolean shouldBeginMultipleSelectionInteraction(UICollectionView collectionView, NSIndexPath indexPath) { return false; }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("collectionView:didBeginMultipleSelectionInteractionAtIndexPath:")
    public void didBeginMultipleSelectionInteraction(UICollectionView collectionView, NSIndexPath indexPath) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("collectionViewDidEndMultipleSelectionInteraction:")
    public void collectionViewDidEndMultipleSelectionInteraction(UICollectionView collectionView) {}
    /**
     * @since Available in iOS 16.0 and later.
     */
    @NotImplemented("collectionView:contextMenuConfigurationForItemsAtIndexPaths:point:")
    public UIContextMenuConfiguration getContextMenuConfiguration(UICollectionView collectionView, NSArray<NSIndexPath> indexPaths, @ByVal CGPoint point) { return null; }
    /**
     * @since Available in iOS 16.0 and later.
     */
    @NotImplemented("collectionView:contextMenuConfiguration:highlightPreviewForItemAtIndexPath:")
    public UITargetedPreview getContextMenuHighlightPreview(UICollectionView collectionView, UIContextMenuConfiguration configuration, NSIndexPath indexPath) { return null; }
    /**
     * @since Available in iOS 16.0 and later.
     */
    @NotImplemented("collectionView:contextMenuConfiguration:dismissalPreviewForItemAtIndexPath:")
    public UITargetedPreview getContextMenuDismissalPreview(UICollectionView collectionView, UIContextMenuConfiguration configuration, NSIndexPath indexPath) { return null; }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("collectionView:willPerformPreviewActionForMenuWithConfiguration:animator:")
    public void willPerformPreviewAction(UICollectionView collectionView, UIContextMenuConfiguration configuration, UIContextMenuInteractionCommitAnimating animator) {}
    /**
     * @since Available in iOS 13.2 and later.
     */
    @NotImplemented("collectionView:willDisplayContextMenuWithConfiguration:animator:")
    public void willDisplayContextMenu(UICollectionView collectionView, UIContextMenuConfiguration configuration, UIContextMenuInteractionAnimating animator) {}
    /**
     * @since Available in iOS 13.2 and later.
     */
    @NotImplemented("collectionView:willEndContextMenuInteractionWithConfiguration:animator:")
    public void willEndContextMenuInteraction(UICollectionView collectionView, UIContextMenuConfiguration configuration, UIContextMenuInteractionAnimating animator) {}
    /**
     * @since Available in iOS 15.0 and later.
     */
    @NotImplemented("collectionView:sceneActivationConfigurationForItemAtIndexPath:point:")
    public UIWindowSceneActivationConfiguration getSceneActivationConfiguration(UICollectionView collectionView, NSIndexPath indexPath, @ByVal CGPoint point) { return null; }
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 16.0. Use collectionView:contextMenuConfigurationForItemsAtIndexPaths:point:
     */
    @Deprecated
    @NotImplemented("collectionView:contextMenuConfigurationForItemAtIndexPath:point:")
    public UIContextMenuConfiguration getContextMenuConfiguration(UICollectionView collectionView, NSIndexPath indexPath, @ByVal CGPoint point) { return null; }
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 16.0. Use collectionView:contextMenuConfiguration:highlightPreviewForItemAtIndexPath:
     */
    @Deprecated
    @NotImplemented("collectionView:previewForHighlightingContextMenuWithConfiguration:")
    public UITargetedPreview getPreviewForHighlightingContextMenu(UICollectionView collectionView, UIContextMenuConfiguration configuration) { return null; }
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 16.0. Use collectionView:contextMenuConfiguration:dismissalPreviewForItemAtIndexPath:
     */
    @Deprecated
    @NotImplemented("collectionView:previewForDismissingContextMenuWithConfiguration:")
    public UITargetedPreview getPreviewForDismissingContextMenu(UICollectionView collectionView, UIContextMenuConfiguration configuration) { return null; }
    /*</methods>*/
}
