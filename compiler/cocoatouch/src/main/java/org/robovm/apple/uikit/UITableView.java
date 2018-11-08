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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 2.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UITableView/*</name>*/ 
    extends /*<extends>*/UIScrollView/*</extends>*/ 
    /*<implements>*/implements NSCoding, UIDataSourceTranslating, UISpringLoadedInteractionSupporting/*</implements>*/ {

    public static class Notifications {
        public static NSObject observeSelectionDidChange(UITableView object, final VoidBlock1<UITableView> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(SelectionDidChangeNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke((UITableView) a.getObject());
                }
            });
        }
    }
    /*<ptr>*/public static class UITableViewPtr extends Ptr<UITableView, UITableViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UITableView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UITableView() {}
    protected UITableView(Handle h, long handle) { super(h, handle); }
    protected UITableView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:style:")
    public UITableView(@ByVal CGRect frame, UITableViewStyle style) { super((SkipInit) null); initObject(init(frame, style)); }
    @Method(selector = "initWithCoder:")
    public UITableView(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    @Method(selector = "initWithFrame:")
    public UITableView(@ByVal CGRect frame) { super(frame); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "style")
    public native UITableViewStyle getStyle();
    @Property(selector = "dataSource")
    public native UITableViewDataSource getDataSource();
    @Property(selector = "setDataSource:", strongRef = true)
    public native void setDataSource(UITableViewDataSource v);
    @Property(selector = "delegate")
    public native UITableViewDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UITableViewDelegate v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "prefetchDataSource")
    public native UITableViewDataSourcePrefetching getPrefetchDataSource();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setPrefetchDataSource:", strongRef = true)
    public native void setPrefetchDataSource(UITableViewDataSourcePrefetching v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "dragDelegate")
    public native UITableViewDragDelegate getDragDelegate();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setDragDelegate:", strongRef = true)
    public native void setDragDelegate(UITableViewDragDelegate v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "dropDelegate")
    public native UITableViewDropDelegate getDropDelegate();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setDropDelegate:", strongRef = true)
    public native void setDropDelegate(UITableViewDropDelegate v);
    @Property(selector = "rowHeight")
    public native @MachineSizedFloat double getRowHeight();
    @Property(selector = "setRowHeight:")
    public native void setRowHeight(@MachineSizedFloat double v);
    @Property(selector = "sectionHeaderHeight")
    public native @MachineSizedFloat double getSectionHeaderHeight();
    @Property(selector = "setSectionHeaderHeight:")
    public native void setSectionHeaderHeight(@MachineSizedFloat double v);
    @Property(selector = "sectionFooterHeight")
    public native @MachineSizedFloat double getSectionFooterHeight();
    @Property(selector = "setSectionFooterHeight:")
    public native void setSectionFooterHeight(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "estimatedRowHeight")
    public native @MachineSizedFloat double getEstimatedRowHeight();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "setEstimatedRowHeight:")
    public native void setEstimatedRowHeight(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "estimatedSectionHeaderHeight")
    public native @MachineSizedFloat double getEstimatedSectionHeaderHeight();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "setEstimatedSectionHeaderHeight:")
    public native void setEstimatedSectionHeaderHeight(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "estimatedSectionFooterHeight")
    public native @MachineSizedFloat double getEstimatedSectionFooterHeight();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "setEstimatedSectionFooterHeight:")
    public native void setEstimatedSectionFooterHeight(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "separatorInset")
    public native @ByVal UIEdgeInsets getSeparatorInset();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "setSeparatorInset:")
    public native void setSeparatorInset(@ByVal UIEdgeInsets v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "separatorInsetReference")
    public native UITableViewSeparatorInsetReference getSeparatorInsetReference();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setSeparatorInsetReference:")
    public native void setSeparatorInsetReference(UITableViewSeparatorInsetReference v);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Property(selector = "backgroundView")
    public native UIView getBackgroundView();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Property(selector = "setBackgroundView:")
    public native void setBackgroundView(UIView v);
    @Property(selector = "numberOfSections")
    public native @MachineSizedSInt long getNumberOfSections();
    @Property(selector = "visibleCells")
    public native NSArray<UITableViewCell> getVisibleCells();
    @Property(selector = "indexPathsForVisibleRows")
    public native NSArray<NSIndexPath> getIndexPathsForVisibleRows();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "hasUncommittedUpdates")
    public native boolean hasUncommittedUpdates();
    @Property(selector = "isEditing")
    public native boolean isEditing();
    @Property(selector = "setEditing:")
    public native void setEditing(boolean v);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Property(selector = "allowsSelection")
    public native boolean allowsSelection();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Property(selector = "setAllowsSelection:")
    public native void setAllowsSelection(boolean v);
    @Property(selector = "allowsSelectionDuringEditing")
    public native boolean allowsSelectionDuringEditing();
    @Property(selector = "setAllowsSelectionDuringEditing:")
    public native void setAllowsSelectionDuringEditing(boolean v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Property(selector = "allowsMultipleSelection")
    public native boolean allowsMultipleSelection();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Property(selector = "setAllowsMultipleSelection:")
    public native void setAllowsMultipleSelection(boolean v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Property(selector = "allowsMultipleSelectionDuringEditing")
    public native boolean allowsMultipleSelectionDuringEditing();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Property(selector = "setAllowsMultipleSelectionDuringEditing:")
    public native void setAllowsMultipleSelectionDuringEditing(boolean v);
    @Property(selector = "indexPathForSelectedRow")
    public native NSIndexPath getIndexPathForSelectedRow();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Property(selector = "indexPathsForSelectedRows")
    public native NSArray<NSIndexPath> getIndexPathsForSelectedRows();
    @Property(selector = "sectionIndexMinimumDisplayRowCount")
    public native @MachineSizedSInt long getSectionIndexMinimumDisplayRowCount();
    @Property(selector = "setSectionIndexMinimumDisplayRowCount:")
    public native void setSectionIndexMinimumDisplayRowCount(@MachineSizedSInt long v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Property(selector = "sectionIndexColor")
    public native UIColor getSectionIndexColor();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Property(selector = "setSectionIndexColor:")
    public native void setSectionIndexColor(UIColor v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "sectionIndexBackgroundColor")
    public native UIColor getSectionIndexBackgroundColor();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "setSectionIndexBackgroundColor:")
    public native void setSectionIndexBackgroundColor(UIColor v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Property(selector = "sectionIndexTrackingBackgroundColor")
    public native UIColor getSectionIndexTrackingBackgroundColor();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Property(selector = "setSectionIndexTrackingBackgroundColor:")
    public native void setSectionIndexTrackingBackgroundColor(UIColor v);
    @Property(selector = "separatorStyle")
    public native UITableViewCellSeparatorStyle getSeparatorStyle();
    @Property(selector = "setSeparatorStyle:")
    public native void setSeparatorStyle(UITableViewCellSeparatorStyle v);
    @Property(selector = "separatorColor")
    public native UIColor getSeparatorColor();
    @Property(selector = "setSeparatorColor:")
    public native void setSeparatorColor(UIColor v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "separatorEffect")
    public native UIVisualEffect getSeparatorEffect();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "setSeparatorEffect:")
    public native void setSeparatorEffect(UIVisualEffect v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "cellLayoutMarginsFollowReadableWidth")
    public native boolean cellLayoutMarginsFollowReadableWidth();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setCellLayoutMarginsFollowReadableWidth:")
    public native void setCellLayoutMarginsFollowReadableWidth(boolean v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "insetsContentViewsToSafeArea")
    public native boolean isInsetsContentViewsToSafeArea();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setInsetsContentViewsToSafeArea:")
    public native void setInsetsContentViewsToSafeArea(boolean v);
    @Property(selector = "tableHeaderView")
    public native UIView getTableHeaderView();
    @Property(selector = "setTableHeaderView:")
    public native void setTableHeaderView(UIView v);
    @Property(selector = "tableFooterView")
    public native UIView getTableFooterView();
    @Property(selector = "setTableFooterView:")
    public native void setTableFooterView(UIView v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "remembersLastFocusedIndexPath")
    public native boolean remembersLastFocusedIndexPath();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setRemembersLastFocusedIndexPath:")
    public native void setRemembersLastFocusedIndexPath(boolean v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "dragInteractionEnabled")
    public native boolean isDragInteractionEnabled();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setDragInteractionEnabled:")
    public native void setDragInteractionEnabled(boolean v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "hasActiveDrag")
    public native boolean hasActiveDrag();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "hasActiveDrop")
    public native boolean hasActiveDrop();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "isSpringLoaded")
    public native boolean isSpringLoaded();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setSpringLoaded:")
    public native void setSpringLoaded(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    public void insertRow(NSIndexPath indexPath, UITableViewRowAnimation animation) {
        insertRows(new NSArray<>(indexPath), animation);
    }
    public void deleteRow(NSIndexPath indexPath, UITableViewRowAnimation animation) {
        deleteRows(new NSArray<>(indexPath), animation);
    }
    public void reloadRow(NSIndexPath indexPath, UITableViewRowAnimation animation) {
        reloadRows(new NSArray<>(indexPath), animation);
    }
    
    private UITableViewModel model;
    public void setModel(UITableViewModel model) {
        this.model = model;
        setDelegate(model);
        setDataSource(model);
    }
    public UITableViewModel getModel() {
        return model;
    }
    /*<methods>*/
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalValue(symbol="UITableViewIndexSearch", optional=true)
    public static native String getIndexSearch();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalValue(symbol="UITableViewAutomaticDimension", optional=true)
    public static native @MachineSizedFloat double getAutomaticDimension();
    @GlobalValue(symbol="UITableViewSelectionDidChangeNotification", optional=true)
    public static native NSString SelectionDidChangeNotification();
    
    @Method(selector = "initWithFrame:style:")
    protected native @Pointer long init(@ByVal CGRect frame, UITableViewStyle style);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    @Method(selector = "numberOfRowsInSection:")
    public native @MachineSizedSInt long getNumberOfRowsInSection(@MachineSizedSInt long section);
    @Method(selector = "rectForSection:")
    public native @ByVal CGRect getRectForSection(@MachineSizedSInt long section);
    @Method(selector = "rectForHeaderInSection:")
    public native @ByVal CGRect getRectForHeaderInSection(@MachineSizedSInt long section);
    @Method(selector = "rectForFooterInSection:")
    public native @ByVal CGRect getRectForFooterInSection(@MachineSizedSInt long section);
    @Method(selector = "rectForRowAtIndexPath:")
    public native @ByVal CGRect getRectForRow(NSIndexPath indexPath);
    @Method(selector = "indexPathForRowAtPoint:")
    public native NSIndexPath getIndexPathForRow(@ByVal CGPoint point);
    @Method(selector = "indexPathForCell:")
    public native NSIndexPath getIndexPathForCell(UITableViewCell cell);
    @Method(selector = "indexPathsForRowsInRect:")
    public native NSArray<NSIndexPath> getIndexPathsForRowsInRect(@ByVal CGRect rect);
    @Method(selector = "cellForRowAtIndexPath:")
    public native UITableViewCell getCellForRow(NSIndexPath indexPath);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Method(selector = "headerViewForSection:")
    public native UITableViewHeaderFooterView getHeaderViewForSection(@MachineSizedSInt long section);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Method(selector = "footerViewForSection:")
    public native UITableViewHeaderFooterView getFooterViewForSection(@MachineSizedSInt long section);
    @Method(selector = "scrollToRowAtIndexPath:atScrollPosition:animated:")
    public native void scrollToRow(NSIndexPath indexPath, UITableViewScrollPosition scrollPosition, boolean animated);
    @Method(selector = "scrollToNearestSelectedRowAtScrollPosition:animated:")
    public native void scrollToNearestSelectedRow(UITableViewScrollPosition scrollPosition, boolean animated);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "performBatchUpdates:completion:")
    public native void performBatchUpdates(@Block Runnable updates, @Block VoidBooleanBlock completion);
    @Method(selector = "beginUpdates")
    public native void beginUpdates();
    @Method(selector = "endUpdates")
    public native void endUpdates();
    @Method(selector = "insertSections:withRowAnimation:")
    public native void insertSections(NSIndexSet sections, UITableViewRowAnimation animation);
    @Method(selector = "deleteSections:withRowAnimation:")
    public native void deleteSections(NSIndexSet sections, UITableViewRowAnimation animation);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Method(selector = "reloadSections:withRowAnimation:")
    public native void reloadSections(NSIndexSet sections, UITableViewRowAnimation animation);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Method(selector = "moveSection:toSection:")
    public native void moveSection(@MachineSizedSInt long section, @MachineSizedSInt long newSection);
    @Method(selector = "insertRowsAtIndexPaths:withRowAnimation:")
    public native void insertRows(NSArray<NSIndexPath> indexPaths, UITableViewRowAnimation animation);
    @Method(selector = "deleteRowsAtIndexPaths:withRowAnimation:")
    public native void deleteRows(NSArray<NSIndexPath> indexPaths, UITableViewRowAnimation animation);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Method(selector = "reloadRowsAtIndexPaths:withRowAnimation:")
    public native void reloadRows(NSArray<NSIndexPath> indexPaths, UITableViewRowAnimation animation);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Method(selector = "moveRowAtIndexPath:toIndexPath:")
    public native void moveRow(NSIndexPath indexPath, NSIndexPath newIndexPath);
    @Method(selector = "reloadData")
    public native void reloadData();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Method(selector = "reloadSectionIndexTitles")
    public native void reloadSectionIndexTitles();
    @Method(selector = "setEditing:animated:")
    public native void setEditing(boolean editing, boolean animated);
    @Method(selector = "selectRowAtIndexPath:animated:scrollPosition:")
    public native void selectRow(NSIndexPath indexPath, boolean animated, UITableViewScrollPosition scrollPosition);
    @Method(selector = "deselectRowAtIndexPath:animated:")
    public native void deselectRow(NSIndexPath indexPath, boolean animated);
    @Method(selector = "dequeueReusableCellWithIdentifier:")
    public native UITableViewCell dequeueReusableCell(String identifier);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Method(selector = "dequeueReusableCellWithIdentifier:forIndexPath:")
    public native UITableViewCell dequeueReusableCell(String identifier, NSIndexPath indexPath);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Method(selector = "dequeueReusableHeaderFooterViewWithIdentifier:")
    public native UITableViewHeaderFooterView dequeueReusableHeaderFooterView(String identifier);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Method(selector = "registerNib:forCellReuseIdentifier:")
    public native void registerReusableCellNib(UINib nib, String identifier);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Method(selector = "registerClass:forCellReuseIdentifier:")
    public native void registerReusableCellClass(Class<? extends UITableViewCell> cellClass, String identifier);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Method(selector = "registerNib:forHeaderFooterViewReuseIdentifier:")
    public native void registerReusableHeaderFooterViewNib(UINib nib, String identifier);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Method(selector = "registerClass:forHeaderFooterViewReuseIdentifier:")
    public native void registerReusableHeaderFooterViewClass(Class<? extends UITableViewHeaderFooterView> aClass, String identifier);
    @Method(selector = "presentationSectionIndexForDataSourceSectionIndex:")
    public native @MachineSizedSInt long presentationSectionIndexForDataSourceSectionIndex(@MachineSizedSInt long dataSourceSectionIndex);
    @Method(selector = "dataSourceSectionIndexForPresentationSectionIndex:")
    public native @MachineSizedSInt long dataSourceSectionIndexForPresentationSectionIndex(@MachineSizedSInt long presentationSectionIndex);
    @Method(selector = "presentationIndexPathForDataSourceIndexPath:")
    public native NSIndexPath presentationIndexPathForDataSourceIndexPath(NSIndexPath dataSourceIndexPath);
    @Method(selector = "dataSourceIndexPathForPresentationIndexPath:")
    public native NSIndexPath dataSourceIndexPathForPresentationIndexPath(NSIndexPath presentationIndexPath);
    @Method(selector = "performUsingPresentationValues:")
    public native void performUsingPresentationValues(@Block Runnable actionsToTranslate);
    /*</methods>*/
}
