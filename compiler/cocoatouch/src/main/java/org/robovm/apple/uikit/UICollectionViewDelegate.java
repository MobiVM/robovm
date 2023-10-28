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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/UICollectionViewDelegate/*</name>*/ 
    /*<implements>*/extends UIScrollViewDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "collectionView:shouldHighlightItemAtIndexPath:")
    boolean shouldHighlightItem(UICollectionView collectionView, NSIndexPath indexPath);
    @Method(selector = "collectionView:didHighlightItemAtIndexPath:")
    void didHighlightItem(UICollectionView collectionView, NSIndexPath indexPath);
    @Method(selector = "collectionView:didUnhighlightItemAtIndexPath:")
    void didUnhighlightItem(UICollectionView collectionView, NSIndexPath indexPath);
    @Method(selector = "collectionView:shouldSelectItemAtIndexPath:")
    boolean shouldSelectItem(UICollectionView collectionView, NSIndexPath indexPath);
    @Method(selector = "collectionView:shouldDeselectItemAtIndexPath:")
    boolean shouldDeselectItem(UICollectionView collectionView, NSIndexPath indexPath);
    @Method(selector = "collectionView:didSelectItemAtIndexPath:")
    void didSelectItem(UICollectionView collectionView, NSIndexPath indexPath);
    @Method(selector = "collectionView:didDeselectItemAtIndexPath:")
    void didDeselectItem(UICollectionView collectionView, NSIndexPath indexPath);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "collectionView:canPerformPrimaryActionForItemAtIndexPath:")
    boolean canPerformPrimaryAction(UICollectionView collectionView, NSIndexPath indexPath);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "collectionView:performPrimaryActionForItemAtIndexPath:")
    void performPrimaryAction(UICollectionView collectionView, NSIndexPath indexPath);
    @Method(selector = "collectionView:willDisplayCell:forItemAtIndexPath:")
    void willDisplayCell(UICollectionView collectionView, UICollectionViewCell cell, NSIndexPath indexPath);
    @Method(selector = "collectionView:willDisplaySupplementaryView:forElementKind:atIndexPath:")
    void willDisplaySupplementaryView(UICollectionView collectionView, UICollectionReusableView view, String elementKind, NSIndexPath indexPath);
    @Method(selector = "collectionView:didEndDisplayingCell:forItemAtIndexPath:")
    void didEndDisplayingCell(UICollectionView collectionView, UICollectionViewCell cell, NSIndexPath indexPath);
    @Method(selector = "collectionView:didEndDisplayingSupplementaryView:forElementOfKind:atIndexPath:")
    void didEndDisplayingSupplementaryView(UICollectionView collectionView, UICollectionReusableView view, String elementKind, NSIndexPath indexPath);
    /**
     * @deprecated Deprecated in iOS 13.0. Use collectionView:contextMenuConfigurationForItemsAtIndexPaths:point:
     */
    @Deprecated
    @Method(selector = "collectionView:shouldShowMenuForItemAtIndexPath:")
    boolean shouldShowMenuForItem(UICollectionView collectionView, NSIndexPath indexPath);
    /**
     * @deprecated Deprecated in iOS 13.0. Use collectionView:contextMenuConfigurationForItemsAtIndexPaths:point:
     */
    @Deprecated
    @Method(selector = "collectionView:canPerformAction:forItemAtIndexPath:withSender:")
    boolean canPerformAction(UICollectionView collectionView, Selector action, NSIndexPath indexPath, NSObject sender);
    /**
     * @deprecated Deprecated in iOS 13.0. Use collectionView:contextMenuConfigurationForItemsAtIndexPaths:point:
     */
    @Deprecated
    @Method(selector = "collectionView:performAction:forItemAtIndexPath:withSender:")
    void performAction(UICollectionView collectionView, Selector action, NSIndexPath indexPath, NSObject sender);
    @Method(selector = "collectionView:transitionLayoutForOldLayout:newLayout:")
    UICollectionViewTransitionLayout getTransitionLayout(UICollectionView collectionView, UICollectionViewLayout fromLayout, UICollectionViewLayout toLayout);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "collectionView:canFocusItemAtIndexPath:")
    boolean canFocusItem(UICollectionView collectionView, NSIndexPath indexPath);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "collectionView:shouldUpdateFocusInContext:")
    boolean shouldUpdateFocus(UICollectionView collectionView, UICollectionViewFocusUpdateContext context);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "collectionView:didUpdateFocusInContext:withAnimationCoordinator:")
    void didUpdateFocus(UICollectionView collectionView, UICollectionViewFocusUpdateContext context, UIFocusAnimationCoordinator coordinator);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "indexPathForPreferredFocusedViewInCollectionView:")
    NSIndexPath getIndexPathForPreferredFocusedView(UICollectionView collectionView);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "collectionView:selectionFollowsFocusForItemAtIndexPath:")
    boolean isSelectionFollowsFocus(UICollectionView collectionView, NSIndexPath indexPath);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "collectionView:targetIndexPathForMoveOfItemFromOriginalIndexPath:atCurrentIndexPath:toProposedIndexPath:")
    NSIndexPath getTargetIndexPathForMoveOfItemFromOriginalIndexPath(UICollectionView collectionView, NSIndexPath originalIndexPath, NSIndexPath currentIndexPath, NSIndexPath proposedIndexPath);
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 15.0. Use collectionView:targetIndexPathForMoveOfItemFromOriginalIndexPath:atCurrentIndexPath:toProposedIndexPath:
     */
    @Deprecated
    @Method(selector = "collectionView:targetIndexPathForMoveFromItemAtIndexPath:toProposedIndexPath:")
    NSIndexPath getTargetIndexPathForMoveFromItem(UICollectionView collectionView, NSIndexPath currentIndexPath, NSIndexPath proposedIndexPath);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "collectionView:targetContentOffsetForProposedContentOffset:")
    @ByVal CGPoint getTargetContentOffsetForProposedContentOffset(UICollectionView collectionView, @ByVal CGPoint proposedContentOffset);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "collectionView:canEditItemAtIndexPath:")
    boolean canEditItem(UICollectionView collectionView, NSIndexPath indexPath);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "collectionView:shouldSpringLoadItemAtIndexPath:withContext:")
    boolean shouldSpringLoadItem(UICollectionView collectionView, NSIndexPath indexPath, UISpringLoadedInteractionContext context);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "collectionView:shouldBeginMultipleSelectionInteractionAtIndexPath:")
    boolean shouldBeginMultipleSelectionInteraction(UICollectionView collectionView, NSIndexPath indexPath);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "collectionView:didBeginMultipleSelectionInteractionAtIndexPath:")
    void didBeginMultipleSelectionInteraction(UICollectionView collectionView, NSIndexPath indexPath);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "collectionViewDidEndMultipleSelectionInteraction:")
    void collectionViewDidEndMultipleSelectionInteraction(UICollectionView collectionView);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "collectionView:contextMenuConfigurationForItemsAtIndexPaths:point:")
    UIContextMenuConfiguration getContextMenuConfiguration(UICollectionView collectionView, NSArray<NSIndexPath> indexPaths, @ByVal CGPoint point);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "collectionView:contextMenuConfiguration:highlightPreviewForItemAtIndexPath:")
    UITargetedPreview getContextMenuHighlightPreview(UICollectionView collectionView, UIContextMenuConfiguration configuration, NSIndexPath indexPath);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "collectionView:contextMenuConfiguration:dismissalPreviewForItemAtIndexPath:")
    UITargetedPreview getContextMenuDismissalPreview(UICollectionView collectionView, UIContextMenuConfiguration configuration, NSIndexPath indexPath);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "collectionView:willPerformPreviewActionForMenuWithConfiguration:animator:")
    void willPerformPreviewAction(UICollectionView collectionView, UIContextMenuConfiguration configuration, UIContextMenuInteractionCommitAnimating animator);
    /**
     * @since Available in iOS 13.2 and later.
     */
    @Method(selector = "collectionView:willDisplayContextMenuWithConfiguration:animator:")
    void willDisplayContextMenu(UICollectionView collectionView, UIContextMenuConfiguration configuration, UIContextMenuInteractionAnimating animator);
    /**
     * @since Available in iOS 13.2 and later.
     */
    @Method(selector = "collectionView:willEndContextMenuInteractionWithConfiguration:animator:")
    void willEndContextMenuInteraction(UICollectionView collectionView, UIContextMenuConfiguration configuration, UIContextMenuInteractionAnimating animator);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "collectionView:sceneActivationConfigurationForItemAtIndexPath:point:")
    UIWindowSceneActivationConfiguration getSceneActivationConfiguration(UICollectionView collectionView, NSIndexPath indexPath, @ByVal CGPoint point);
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 16.0. Use collectionView:contextMenuConfigurationForItemsAtIndexPaths:point:
     */
    @Deprecated
    @Method(selector = "collectionView:contextMenuConfigurationForItemAtIndexPath:point:")
    UIContextMenuConfiguration getContextMenuConfiguration(UICollectionView collectionView, NSIndexPath indexPath, @ByVal CGPoint point);
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 16.0. Use collectionView:contextMenuConfiguration:highlightPreviewForItemAtIndexPath:
     */
    @Deprecated
    @Method(selector = "collectionView:previewForHighlightingContextMenuWithConfiguration:")
    UITargetedPreview getPreviewForHighlightingContextMenu(UICollectionView collectionView, UIContextMenuConfiguration configuration);
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 16.0. Use collectionView:contextMenuConfiguration:dismissalPreviewForItemAtIndexPath:
     */
    @Deprecated
    @Method(selector = "collectionView:previewForDismissingContextMenuWithConfiguration:")
    UITargetedPreview getPreviewForDismissingContextMenu(UICollectionView collectionView, UIContextMenuConfiguration configuration);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
