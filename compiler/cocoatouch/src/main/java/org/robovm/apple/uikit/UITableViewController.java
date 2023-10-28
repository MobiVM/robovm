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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UITableViewController/*</name>*/ 
    extends /*<extends>*/UIViewController/*</extends>*/ 
    /*<implements>*/implements UITableViewDelegate, UITableViewDataSource/*</implements>*/ {

    /*<ptr>*/public static class UITableViewControllerPtr extends Ptr<UITableViewController, UITableViewControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UITableViewController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UITableViewController() {}
    protected UITableViewController(Handle h, long handle) { super(h, handle); }
    protected UITableViewController(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithStyle:")
    public UITableViewController(UITableViewStyle style) { super((SkipInit) null); initObject(init(style)); }
    @Method(selector = "initWithNibName:bundle:")
    public UITableViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { super((SkipInit) null); initObject(init(nibNameOrNil, nibBundleOrNil)); }
    @Method(selector = "initWithCoder:")
    public UITableViewController(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "tableView")
    public native UITableView getTableView();
    @Property(selector = "setTableView:")
    public native void setTableView(UITableView v);
    @Property(selector = "clearsSelectionOnViewWillAppear")
    public native boolean clearsSelectionOnViewWillAppear();
    @Property(selector = "setClearsSelectionOnViewWillAppear:")
    public native void setClearsSelectionOnViewWillAppear(boolean v);
    @Property(selector = "refreshControl")
    public native UIRefreshControl getRefreshControl();
    @Property(selector = "setRefreshControl:")
    public native void setRefreshControl(UIRefreshControl v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithStyle:")
    protected native @Pointer long init(UITableViewStyle style);
    @Method(selector = "initWithNibName:bundle:")
    protected native @Pointer long init(String nibNameOrNil, NSBundle nibBundleOrNil);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    @Method(selector = "tableView:willDisplayCell:forRowAtIndexPath:")
    public native void willDisplayCell(UITableView tableView, UITableViewCell cell, NSIndexPath indexPath);
    @Method(selector = "tableView:willDisplayHeaderView:forSection:")
    public native void willDisplayHeaderView(UITableView tableView, UIView view, @MachineSizedSInt long section);
    @Method(selector = "tableView:willDisplayFooterView:forSection:")
    public native void willDisplayFooterView(UITableView tableView, UIView view, @MachineSizedSInt long section);
    @Method(selector = "tableView:didEndDisplayingCell:forRowAtIndexPath:")
    public native void didEndDisplayingCell(UITableView tableView, UITableViewCell cell, NSIndexPath indexPath);
    @Method(selector = "tableView:didEndDisplayingHeaderView:forSection:")
    public native void didEndDisplayingHeaderView(UITableView tableView, UIView view, @MachineSizedSInt long section);
    @Method(selector = "tableView:didEndDisplayingFooterView:forSection:")
    public native void didEndDisplayingFooterView(UITableView tableView, UIView view, @MachineSizedSInt long section);
    @Method(selector = "tableView:heightForRowAtIndexPath:")
    public native @MachineSizedFloat double getHeightForRow(UITableView tableView, NSIndexPath indexPath);
    @Method(selector = "tableView:heightForHeaderInSection:")
    public native @MachineSizedFloat double getHeightForHeader(UITableView tableView, @MachineSizedSInt long section);
    @Method(selector = "tableView:heightForFooterInSection:")
    public native @MachineSizedFloat double getHeightForFooter(UITableView tableView, @MachineSizedSInt long section);
    @Method(selector = "tableView:estimatedHeightForRowAtIndexPath:")
    public native @MachineSizedFloat double getEstimatedHeightForRow(UITableView tableView, NSIndexPath indexPath);
    @Method(selector = "tableView:estimatedHeightForHeaderInSection:")
    public native @MachineSizedFloat double getEstimatedHeightForHeader(UITableView tableView, @MachineSizedSInt long section);
    @Method(selector = "tableView:estimatedHeightForFooterInSection:")
    public native @MachineSizedFloat double getEstimatedHeightForFooter(UITableView tableView, @MachineSizedSInt long section);
    @Method(selector = "tableView:viewForHeaderInSection:")
    public native UIView getViewForHeader(UITableView tableView, @MachineSizedSInt long section);
    @Method(selector = "tableView:viewForFooterInSection:")
    public native UIView getViewForFooter(UITableView tableView, @MachineSizedSInt long section);
    @Method(selector = "tableView:accessoryButtonTappedForRowWithIndexPath:")
    public native void accessoryButtonTapped(UITableView tableView, NSIndexPath indexPath);
    @Method(selector = "tableView:shouldHighlightRowAtIndexPath:")
    public native boolean shouldHighlightRow(UITableView tableView, NSIndexPath indexPath);
    @Method(selector = "tableView:didHighlightRowAtIndexPath:")
    public native void didHighlightRow(UITableView tableView, NSIndexPath indexPath);
    @Method(selector = "tableView:didUnhighlightRowAtIndexPath:")
    public native void didUnhighlightRow(UITableView tableView, NSIndexPath indexPath);
    @Method(selector = "tableView:willSelectRowAtIndexPath:")
    public native NSIndexPath willSelectRow(UITableView tableView, NSIndexPath indexPath);
    @Method(selector = "tableView:willDeselectRowAtIndexPath:")
    public native NSIndexPath willDeselectRow(UITableView tableView, NSIndexPath indexPath);
    @Method(selector = "tableView:didSelectRowAtIndexPath:")
    public native void didSelectRow(UITableView tableView, NSIndexPath indexPath);
    @Method(selector = "tableView:didDeselectRowAtIndexPath:")
    public native void didDeselectRow(UITableView tableView, NSIndexPath indexPath);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "tableView:canPerformPrimaryActionForRowAtIndexPath:")
    public native boolean canPerformPrimaryAction(UITableView tableView, NSIndexPath indexPath);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "tableView:performPrimaryActionForRowAtIndexPath:")
    public native void performPrimaryAction(UITableView tableView, NSIndexPath indexPath);
    @Method(selector = "tableView:editingStyleForRowAtIndexPath:")
    public native UITableViewCellEditingStyle getEditingStyleForRow(UITableView tableView, NSIndexPath indexPath);
    @Method(selector = "tableView:titleForDeleteConfirmationButtonForRowAtIndexPath:")
    public native String getTitleForDeleteConfirmationButton(UITableView tableView, NSIndexPath indexPath);
    /**
     * @deprecated Deprecated in iOS 13.0. Use tableView:trailingSwipeActionsConfigurationForRowAtIndexPath:
     */
    @Deprecated
    @Method(selector = "tableView:editActionsForRowAtIndexPath:")
    public native NSArray<UITableViewRowAction> getEditActionsForRow(UITableView tableView, NSIndexPath indexPath);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "tableView:leadingSwipeActionsConfigurationForRowAtIndexPath:")
    public native UISwipeActionsConfiguration getLeadingSwipeActionsConfigurationForRow(UITableView tableView, NSIndexPath indexPath);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "tableView:trailingSwipeActionsConfigurationForRowAtIndexPath:")
    public native UISwipeActionsConfiguration getTrailingSwipeActionsConfigurationForRow(UITableView tableView, NSIndexPath indexPath);
    @Method(selector = "tableView:shouldIndentWhileEditingRowAtIndexPath:")
    public native boolean shouldIndentWhileEditingRow(UITableView tableView, NSIndexPath indexPath);
    @Method(selector = "tableView:willBeginEditingRowAtIndexPath:")
    public native void willBeginEditingRow(UITableView tableView, NSIndexPath indexPath);
    @Method(selector = "tableView:didEndEditingRowAtIndexPath:")
    public native void didEndEditingRow(UITableView tableView, NSIndexPath indexPath);
    @Method(selector = "tableView:targetIndexPathForMoveFromRowAtIndexPath:toProposedIndexPath:")
    public native NSIndexPath getTargetForMove(UITableView tableView, NSIndexPath sourceIndexPath, NSIndexPath proposedDestinationIndexPath);
    @Method(selector = "tableView:indentationLevelForRowAtIndexPath:")
    public native @MachineSizedSInt long getIndentationLevelForRow(UITableView tableView, NSIndexPath indexPath);
    /**
     * @deprecated Deprecated in iOS 13.0. Use tableView:contextMenuConfigurationForRowAtIndexPath:point:
     */
    @Deprecated
    @Method(selector = "tableView:shouldShowMenuForRowAtIndexPath:")
    public native boolean shouldShowMenuForRow(UITableView tableView, NSIndexPath indexPath);
    /**
     * @deprecated Deprecated in iOS 13.0. Use tableView:contextMenuConfigurationForRowAtIndexPath:point:
     */
    @Deprecated
    @Method(selector = "tableView:canPerformAction:forRowAtIndexPath:withSender:")
    public native boolean canPerformAction(UITableView tableView, Selector action, NSIndexPath indexPath, NSObject sender);
    /**
     * @deprecated Deprecated in iOS 13.0. Use tableView:contextMenuConfigurationForRowAtIndexPath:
     */
    @Deprecated
    @Method(selector = "tableView:performAction:forRowAtIndexPath:withSender:")
    public native void performActionForRow(UITableView tableView, Selector action, NSIndexPath indexPath, NSObject sender);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "tableView:canFocusRowAtIndexPath:")
    public native boolean canFocusRow(UITableView tableView, NSIndexPath indexPath);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "tableView:shouldUpdateFocusInContext:")
    public native boolean shouldUpdateFocus(UITableView tableView, UITableViewFocusUpdateContext context);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "tableView:didUpdateFocusInContext:withAnimationCoordinator:")
    public native void didUpdateFocus(UITableView tableView, UITableViewFocusUpdateContext context, UIFocusAnimationCoordinator coordinator);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "indexPathForPreferredFocusedViewInTableView:")
    public native NSIndexPath getIndexPathForPreferredFocusedView(UITableView tableView);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "tableView:selectionFollowsFocusForRowAtIndexPath:")
    public native boolean isSelectionFollowsFocus(UITableView tableView, NSIndexPath indexPath);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "tableView:shouldSpringLoadRowAtIndexPath:withContext:")
    public native boolean shouldSpringLoadRow(UITableView tableView, NSIndexPath indexPath, UISpringLoadedInteractionContext context);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "tableView:shouldBeginMultipleSelectionInteractionAtIndexPath:")
    public native boolean shouldBeginMultipleSelectionInteraction(UITableView tableView, NSIndexPath indexPath);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "tableView:didBeginMultipleSelectionInteractionAtIndexPath:")
    public native void didBeginMultipleSelectionInteraction(UITableView tableView, NSIndexPath indexPath);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "tableViewDidEndMultipleSelectionInteraction:")
    public native void tableViewDidEndMultipleSelectionInteraction(UITableView tableView);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "tableView:contextMenuConfigurationForRowAtIndexPath:point:")
    public native UIContextMenuConfiguration getContextMenuConfiguration(UITableView tableView, NSIndexPath indexPath, @ByVal CGPoint point);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "tableView:previewForHighlightingContextMenuWithConfiguration:")
    public native UITargetedPreview getPreviewForHighlightingContextMenu(UITableView tableView, UIContextMenuConfiguration configuration);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "tableView:previewForDismissingContextMenuWithConfiguration:")
    public native UITargetedPreview getPreviewForDismissingContextMenu(UITableView tableView, UIContextMenuConfiguration configuration);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "tableView:willPerformPreviewActionForMenuWithConfiguration:animator:")
    public native void willPerformPreviewAction(UITableView tableView, UIContextMenuConfiguration configuration, UIContextMenuInteractionCommitAnimating animator);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "tableView:willDisplayContextMenuWithConfiguration:animator:")
    public native void willDisplayContextMenu(UITableView tableView, UIContextMenuConfiguration configuration, UIContextMenuInteractionAnimating animator);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "tableView:willEndContextMenuInteractionWithConfiguration:animator:")
    public native void willEndContextMenuInteraction(UITableView tableView, UIContextMenuConfiguration configuration, UIContextMenuInteractionAnimating animator);
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
    @Method(selector = "tableView:numberOfRowsInSection:")
    public native @MachineSizedSInt long getNumberOfRowsInSection(UITableView tableView, @MachineSizedSInt long section);
    @Method(selector = "tableView:cellForRowAtIndexPath:")
    public native UITableViewCell getCellForRow(UITableView tableView, NSIndexPath indexPath);
    @Method(selector = "numberOfSectionsInTableView:")
    public native @MachineSizedSInt long getNumberOfSections(UITableView tableView);
    @Method(selector = "tableView:titleForHeaderInSection:")
    public native String getTitleForHeader(UITableView tableView, @MachineSizedSInt long section);
    @Method(selector = "tableView:titleForFooterInSection:")
    public native String getTitleForFooter(UITableView tableView, @MachineSizedSInt long section);
    @Method(selector = "tableView:canEditRowAtIndexPath:")
    public native boolean canEditRow(UITableView tableView, NSIndexPath indexPath);
    @Method(selector = "tableView:canMoveRowAtIndexPath:")
    public native boolean canMoveRow(UITableView tableView, NSIndexPath indexPath);
    @Method(selector = "sectionIndexTitlesForTableView:")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getSectionIndexTitles(UITableView tableView);
    @Method(selector = "tableView:sectionForSectionIndexTitle:atIndex:")
    public native @MachineSizedSInt long getSectionForSectionIndexTitle(UITableView tableView, String title, @MachineSizedSInt long index);
    @Method(selector = "tableView:commitEditingStyle:forRowAtIndexPath:")
    public native void commitEditingStyleForRow(UITableView tableView, UITableViewCellEditingStyle editingStyle, NSIndexPath indexPath);
    @Method(selector = "tableView:moveRowAtIndexPath:toIndexPath:")
    public native void moveRow(UITableView tableView, NSIndexPath sourceIndexPath, NSIndexPath destinationIndexPath);
    /*</methods>*/
}
