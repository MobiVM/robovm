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

import org.robovm.apple.foundation.NSArray;
import org.robovm.apple.foundation.NSIndexPath;
import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.Selector;
import org.robovm.objc.annotation.NotImplemented;
import org.robovm.rt.bro.annotation.MachineSizedFloat;
import org.robovm.rt.bro.annotation.MachineSizedSInt;

import java.util.List;

public class UITableViewModel extends UIScrollViewDelegateAdapter implements UITableViewDelegate, UITableViewDataSource {
    @NotImplemented("tableView:willDisplayCell:forRowAtIndexPath:")
    public void willDisplayCell(UITableView tableView, UITableViewCell cell, NSIndexPath indexPath) {}
    /**
     * @since Available in iOS 6.0 and later.
     */
    @NotImplemented("tableView:willDisplayHeaderView:forSection:")
    public void willDisplayHeaderView(UITableView tableView, UIView view, @MachineSizedSInt long section) {}
    /**
     * @since Available in iOS 6.0 and later.
     */
    @NotImplemented("tableView:willDisplayFooterView:forSection:")
    public void willDisplayFooterView(UITableView tableView, UIView view, @MachineSizedSInt long section) {}
    /**
     * @since Available in iOS 6.0 and later.
     */
    @NotImplemented("tableView:didEndDisplayingCell:forRowAtIndexPath:")
    public void didEndDisplayingCell(UITableView tableView, UITableViewCell cell, NSIndexPath indexPath) {}
    /**
     * @since Available in iOS 6.0 and later.
     */
    @NotImplemented("tableView:didEndDisplayingHeaderView:forSection:")
    public void didEndDisplayingHeaderView(UITableView tableView, UIView view, @MachineSizedSInt long section) {}
    /**
     * @since Available in iOS 6.0 and later.
     */
    @NotImplemented("tableView:didEndDisplayingFooterView:forSection:")
    public void didEndDisplayingFooterView(UITableView tableView, UIView view, @MachineSizedSInt long section) {}
    @NotImplemented("tableView:heightForRowAtIndexPath:")
    public @MachineSizedFloat double getHeightForRow(UITableView tableView, NSIndexPath indexPath) { return 0; }
    @NotImplemented("tableView:heightForHeaderInSection:")
    public @MachineSizedFloat double getHeightForHeader(UITableView tableView, @MachineSizedSInt long section) { return 0; }
    @NotImplemented("tableView:heightForFooterInSection:")
    public @MachineSizedFloat double getHeightForFooter(UITableView tableView, @MachineSizedSInt long section) { return 0; }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("tableView:estimatedHeightForRowAtIndexPath:")
    public @MachineSizedFloat double getEstimatedHeightForRow(UITableView tableView, NSIndexPath indexPath) { return 0; }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("tableView:estimatedHeightForHeaderInSection:")
    public @MachineSizedFloat double getEstimatedHeightForHeader(UITableView tableView, @MachineSizedSInt long section) { return 0; }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("tableView:estimatedHeightForFooterInSection:")
    public @MachineSizedFloat double getEstimatedHeightForFooter(UITableView tableView, @MachineSizedSInt long section) { return 0; }
    @NotImplemented("tableView:viewForHeaderInSection:")
    public UIView getViewForHeader(UITableView tableView, @MachineSizedSInt long section) { return null; }
    @NotImplemented("tableView:viewForFooterInSection:")
    public UIView getViewForFooter(UITableView tableView, @MachineSizedSInt long section) { return null; }
    @NotImplemented("tableView:accessoryButtonTappedForRowWithIndexPath:")
    public void accessoryButtonTapped(UITableView tableView, NSIndexPath indexPath) {}
    /**
     * @since Available in iOS 6.0 and later.
     */
    @NotImplemented("tableView:shouldHighlightRowAtIndexPath:")
    public boolean shouldHighlightRow(UITableView tableView, NSIndexPath indexPath) { return false; }
    /**
     * @since Available in iOS 6.0 and later.
     */
    @NotImplemented("tableView:didHighlightRowAtIndexPath:")
    public void didHighlightRow(UITableView tableView, NSIndexPath indexPath) {}
    /**
     * @since Available in iOS 6.0 and later.
     */
    @NotImplemented("tableView:didUnhighlightRowAtIndexPath:")
    public void didUnhighlightRow(UITableView tableView, NSIndexPath indexPath) {}
    @NotImplemented("tableView:willSelectRowAtIndexPath:")
    public NSIndexPath willSelectRow(UITableView tableView, NSIndexPath indexPath) { return null; }
    /**
     * @since Available in iOS 3.0 and later.
     */
    @NotImplemented("tableView:willDeselectRowAtIndexPath:")
    public NSIndexPath willDeselectRow(UITableView tableView, NSIndexPath indexPath) { return null; }
    @NotImplemented("tableView:didSelectRowAtIndexPath:")
    public void didSelectRow(UITableView tableView, NSIndexPath indexPath) {}
    /**
     * @since Available in iOS 3.0 and later.
     */
    @NotImplemented("tableView:didDeselectRowAtIndexPath:")
    public void didDeselectRow(UITableView tableView, NSIndexPath indexPath) {}
    @NotImplemented("tableView:editingStyleForRowAtIndexPath:")
    public UITableViewCellEditingStyle getEditingStyleForRow(UITableView tableView, NSIndexPath indexPath) { return null; }
    /**
     * @since Available in iOS 3.0 and later.
     */
    @NotImplemented("tableView:titleForDeleteConfirmationButtonForRowAtIndexPath:")
    public String getTitleForDeleteConfirmationButton(UITableView tableView, NSIndexPath indexPath) { return null; }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("tableView:editActionsForRowAtIndexPath:")
    public NSArray<UITableViewRowAction> getEditActionsForRow(UITableView tableView, NSIndexPath indexPath) { return null; }
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
     * @since Available in iOS 5.0 and later.
     */
    @NotImplemented("tableView:shouldShowMenuForRowAtIndexPath:")
    public boolean shouldShowMenuForRow(UITableView tableView, NSIndexPath indexPath) { return false; }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @NotImplemented("tableView:canPerformAction:forRowAtIndexPath:withSender:")
    public boolean canPerformAction(UITableView tableView, Selector action, NSIndexPath indexPath, NSObject sender) { return false; }
    /**
     * @since Available in iOS 5.0 and later.
     */
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
    
    @NotImplemented("tableView:numberOfRowsInSection:")
    public @MachineSizedSInt long getNumberOfRowsInSection(UITableView tableView, @MachineSizedSInt long section) { return 0; }
    @NotImplemented("tableView:cellForRowAtIndexPath:")
    public UITableViewCell getCellForRow(UITableView tableView, NSIndexPath indexPath) { return null; }
    @NotImplemented("numberOfSectionsInTableView:")
    public @MachineSizedSInt long getNumberOfSections(UITableView tableView) { return 0; }
    @NotImplemented("tableView:titleForHeaderInSection:")
    public String getTitleForHeader(UITableView tableView, @MachineSizedSInt long section) { return null; }
    @NotImplemented("tableView:titleForFooterInSection:")
    public String getTitleForFooter(UITableView tableView, @MachineSizedSInt long section) { return null; }
    @NotImplemented("tableView:canEditRowAtIndexPath:")
    public boolean canEditRow(UITableView tableView, NSIndexPath indexPath) { return false; }
    @NotImplemented("tableView:canMoveRowAtIndexPath:")
    public boolean canMoveRow(UITableView tableView, NSIndexPath indexPath) { return false; }
    @NotImplemented("sectionIndexTitlesForTableView:")
    public @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getSectionIndexTitles(UITableView tableView) { return null; }
    @NotImplemented("tableView:sectionForSectionIndexTitle:atIndex:")
    public @MachineSizedSInt long getSectionForSectionIndexTitle(UITableView tableView, String title, @MachineSizedSInt long index) { return 0; }
    @NotImplemented("tableView:commitEditingStyle:forRowAtIndexPath:")
    public void commitEditingStyleForRow(UITableView tableView, UITableViewCellEditingStyle editingStyle, NSIndexPath indexPath) {}
    @NotImplemented("tableView:moveRowAtIndexPath:toIndexPath:")
    public void moveRow(UITableView tableView, NSIndexPath sourceIndexPath, NSIndexPath destinationIndexPath) {}
    @NotImplemented("tableView:leadingSwipeActionsConfigurationForRowAtIndexPath:")
    public UISwipeActionsConfiguration getLeadingSwipeActionsConfigurationForRow(UITableView tableView, NSIndexPath indexPath) { return null; }
    @NotImplemented("tableView:trailingSwipeActionsConfigurationForRowAtIndexPath:")
    public UISwipeActionsConfiguration getTrailingSwipeActionsConfigurationForRow(UITableView tableView, NSIndexPath indexPath) { return null; }
    @NotImplemented("tableView:shouldSpringLoadRowAtIndexPath:withContext:")
    public boolean shouldSpringLoadRow(UITableView tableView, NSIndexPath indexPath, UISpringLoadedInteractionContext context) { return false; }
}
