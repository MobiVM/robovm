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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UITableViewDelegateAdapter/*</name>*/ 
    extends /*<extends>*/UIScrollViewDelegateAdapter/*</extends>*/ 
    /*<implements>*/implements UITableViewDelegate/*</implements>*/ {

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
    @NotImplemented("tableView:willDisplayCell:forRowAtIndexPath:")
    public void willDisplayCell(UITableView tableView, UITableViewCell cell, NSIndexPath indexPath) {}
    @NotImplemented("tableView:willDisplayHeaderView:forSection:")
    public void willDisplayHeaderView(UITableView tableView, UIView view, @MachineSizedSInt long section) {}
    @NotImplemented("tableView:willDisplayFooterView:forSection:")
    public void willDisplayFooterView(UITableView tableView, UIView view, @MachineSizedSInt long section) {}
    @NotImplemented("tableView:didEndDisplayingCell:forRowAtIndexPath:")
    public void didEndDisplayingCell(UITableView tableView, UITableViewCell cell, NSIndexPath indexPath) {}
    @NotImplemented("tableView:didEndDisplayingHeaderView:forSection:")
    public void didEndDisplayingHeaderView(UITableView tableView, UIView view, @MachineSizedSInt long section) {}
    @NotImplemented("tableView:didEndDisplayingFooterView:forSection:")
    public void didEndDisplayingFooterView(UITableView tableView, UIView view, @MachineSizedSInt long section) {}
    @NotImplemented("tableView:heightForRowAtIndexPath:")
    public @MachineSizedFloat double getHeightForRow(UITableView tableView, NSIndexPath indexPath) { return 0; }
    @NotImplemented("tableView:heightForHeaderInSection:")
    public @MachineSizedFloat double getHeightForHeader(UITableView tableView, @MachineSizedSInt long section) { return 0; }
    @NotImplemented("tableView:heightForFooterInSection:")
    public @MachineSizedFloat double getHeightForFooter(UITableView tableView, @MachineSizedSInt long section) { return 0; }
    @NotImplemented("tableView:estimatedHeightForRowAtIndexPath:")
    public @MachineSizedFloat double getEstimatedHeightForRow(UITableView tableView, NSIndexPath indexPath) { return 0; }
    @NotImplemented("tableView:estimatedHeightForHeaderInSection:")
    public @MachineSizedFloat double getEstimatedHeightForHeader(UITableView tableView, @MachineSizedSInt long section) { return 0; }
    @NotImplemented("tableView:estimatedHeightForFooterInSection:")
    public @MachineSizedFloat double getEstimatedHeightForFooter(UITableView tableView, @MachineSizedSInt long section) { return 0; }
    @NotImplemented("tableView:viewForHeaderInSection:")
    public UIView getViewForHeader(UITableView tableView, @MachineSizedSInt long section) { return null; }
    @NotImplemented("tableView:viewForFooterInSection:")
    public UIView getViewForFooter(UITableView tableView, @MachineSizedSInt long section) { return null; }
    @NotImplemented("tableView:accessoryButtonTappedForRowWithIndexPath:")
    public void accessoryButtonTapped(UITableView tableView, NSIndexPath indexPath) {}
    @NotImplemented("tableView:shouldHighlightRowAtIndexPath:")
    public boolean shouldHighlightRow(UITableView tableView, NSIndexPath indexPath) { return false; }
    @NotImplemented("tableView:didHighlightRowAtIndexPath:")
    public void didHighlightRow(UITableView tableView, NSIndexPath indexPath) {}
    @NotImplemented("tableView:didUnhighlightRowAtIndexPath:")
    public void didUnhighlightRow(UITableView tableView, NSIndexPath indexPath) {}
    @NotImplemented("tableView:willSelectRowAtIndexPath:")
    public NSIndexPath willSelectRow(UITableView tableView, NSIndexPath indexPath) { return null; }
    @NotImplemented("tableView:willDeselectRowAtIndexPath:")
    public NSIndexPath willDeselectRow(UITableView tableView, NSIndexPath indexPath) { return null; }
    @NotImplemented("tableView:didSelectRowAtIndexPath:")
    public void didSelectRow(UITableView tableView, NSIndexPath indexPath) {}
    @NotImplemented("tableView:didDeselectRowAtIndexPath:")
    public void didDeselectRow(UITableView tableView, NSIndexPath indexPath) {}
    @NotImplemented("tableView:editingStyleForRowAtIndexPath:")
    public UITableViewCellEditingStyle getEditingStyleForRow(UITableView tableView, NSIndexPath indexPath) { return null; }
    @NotImplemented("tableView:titleForDeleteConfirmationButtonForRowAtIndexPath:")
    public String getTitleForDeleteConfirmationButton(UITableView tableView, NSIndexPath indexPath) { return null; }
    /**
     * @deprecated Deprecated in iOS 13.0. Use tableView:trailingSwipeActionsConfigurationForRowAtIndexPath:
     */
    @Deprecated
    @NotImplemented("tableView:editActionsForRowAtIndexPath:")
    public NSArray<UITableViewRowAction> getEditActionsForRow(UITableView tableView, NSIndexPath indexPath) { return null; }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("tableView:leadingSwipeActionsConfigurationForRowAtIndexPath:")
    public UISwipeActionsConfiguration getLeadingSwipeActionsConfigurationForRow(UITableView tableView, NSIndexPath indexPath) { return null; }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("tableView:trailingSwipeActionsConfigurationForRowAtIndexPath:")
    public UISwipeActionsConfiguration getTrailingSwipeActionsConfigurationForRow(UITableView tableView, NSIndexPath indexPath) { return null; }
    @NotImplemented("tableView:shouldIndentWhileEditingRowAtIndexPath:")
    public boolean shouldIndentWhileEditingRow(UITableView tableView, NSIndexPath indexPath) { return false; }
    @NotImplemented("tableView:willBeginEditingRowAtIndexPath:")
    public void willBeginEditingRow(UITableView tableView, NSIndexPath indexPath) {}
    @NotImplemented("tableView:didEndEditingRowAtIndexPath:")
    public void didEndEditingRow(UITableView tableView, NSIndexPath indexPath) {}
    @NotImplemented("tableView:targetIndexPathForMoveFromRowAtIndexPath:toProposedIndexPath:")
    public NSIndexPath getTargetForMove(UITableView tableView, NSIndexPath sourceIndexPath, NSIndexPath proposedDestinationIndexPath) { return null; }
    @NotImplemented("tableView:indentationLevelForRowAtIndexPath:")
    public @MachineSizedSInt long getIndentationLevelForRow(UITableView tableView, NSIndexPath indexPath) { return 0; }
    /**
     * @deprecated Deprecated in iOS 13.0. Use tableView:contextMenuConfigurationForRowAtIndexPath:point:
     */
    @Deprecated
    @NotImplemented("tableView:shouldShowMenuForRowAtIndexPath:")
    public boolean shouldShowMenuForRow(UITableView tableView, NSIndexPath indexPath) { return false; }
    /**
     * @deprecated Deprecated in iOS 13.0. Use tableView:contextMenuConfigurationForRowAtIndexPath:point:
     */
    @Deprecated
    @NotImplemented("tableView:canPerformAction:forRowAtIndexPath:withSender:")
    public boolean canPerformAction(UITableView tableView, Selector action, NSIndexPath indexPath, NSObject sender) { return false; }
    /**
     * @deprecated Deprecated in iOS 13.0. Use tableView:contextMenuConfigurationForRowAtIndexPath:
     */
    @Deprecated
    @NotImplemented("tableView:performAction:forRowAtIndexPath:withSender:")
    public void performActionForRow(UITableView tableView, Selector action, NSIndexPath indexPath, NSObject sender) {}
    /**
     * @since Available in iOS 9.0 and later.
     */
    @NotImplemented("tableView:canFocusRowAtIndexPath:")
    public boolean canFocusRow(UITableView tableView, NSIndexPath indexPath) { return true; }
    /**
     * @since Available in iOS 9.0 and later.
     */
    @NotImplemented("tableView:shouldUpdateFocusInContext:")
    public boolean shouldUpdateFocus(UITableView tableView, UITableViewFocusUpdateContext context) { return true; }
    /**
     * @since Available in iOS 9.0 and later.
     */
    @NotImplemented("tableView:didUpdateFocusInContext:withAnimationCoordinator:")
    public void didUpdateFocus(UITableView tableView, UITableViewFocusUpdateContext context, UIFocusAnimationCoordinator coordinator) {}
    /**
     * @since Available in iOS 9.0 and later.
     */
    @NotImplemented("indexPathForPreferredFocusedViewInTableView:")
    public NSIndexPath getIndexPathForPreferredFocusedView(UITableView tableView) { return null; }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("tableView:shouldSpringLoadRowAtIndexPath:withContext:")
    public boolean shouldSpringLoadRow(UITableView tableView, NSIndexPath indexPath, UISpringLoadedInteractionContext context) { return false; }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("tableView:shouldBeginMultipleSelectionInteractionAtIndexPath:")
    public boolean shouldBeginMultipleSelectionInteraction(UITableView tableView, NSIndexPath indexPath) { return false; }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("tableView:didBeginMultipleSelectionInteractionAtIndexPath:")
    public void didBeginMultipleSelectionInteraction(UITableView tableView, NSIndexPath indexPath) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("tableViewDidEndMultipleSelectionInteraction:")
    public void tableViewDidEndMultipleSelectionInteraction(UITableView tableView) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("tableView:contextMenuConfigurationForRowAtIndexPath:point:")
    public UIContextMenuConfiguration getContextMenuConfiguration(UITableView tableView, NSIndexPath indexPath, @ByVal CGPoint point) { return null; }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("tableView:previewForHighlightingContextMenuWithConfiguration:")
    public UITargetedPreview getPreviewForHighlightingContextMenu(UITableView tableView, UIContextMenuConfiguration configuration) { return null; }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("tableView:previewForDismissingContextMenuWithConfiguration:")
    public UITargetedPreview getPreviewForDismissingContextMenu(UITableView tableView, UIContextMenuConfiguration configuration) { return null; }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("tableView:willPerformPreviewActionForMenuWithConfiguration:animator:")
    public void willPerformPreviewAction(UITableView tableView, UIContextMenuConfiguration configuration, UIContextMenuInteractionCommitAnimating animator) {}
    /*</methods>*/
}
