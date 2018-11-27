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
 * @since Available in iOS 6.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UICollectionView/*</name>*/ 
    extends /*<extends>*/UIScrollView/*</extends>*/ 
    /*<implements>*/implements UIDataSourceTranslating, UISpringLoadedInteractionSupporting/*</implements>*/ {

    /*<ptr>*/public static class UICollectionViewPtr extends Ptr<UICollectionView, UICollectionViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UICollectionView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UICollectionView() {}
    protected UICollectionView(Handle h, long handle) { super(h, handle); }
    protected UICollectionView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:collectionViewLayout:")
    public UICollectionView(@ByVal CGRect frame, UICollectionViewLayout layout) { super((SkipInit) null); initObject(init(frame, layout)); }
    @Method(selector = "initWithCoder:")
    public UICollectionView(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    @Method(selector = "initWithFrame:")
    public UICollectionView(@ByVal CGRect frame) { super(frame); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "collectionViewLayout")
    public native UICollectionViewLayout getCollectionViewLayout();
    @Property(selector = "setCollectionViewLayout:")
    public native void setCollectionViewLayout(UICollectionViewLayout v);
    @Property(selector = "delegate")
    public native UICollectionViewDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UICollectionViewDelegate v);
    @Property(selector = "dataSource")
    public native UICollectionViewDataSource getDataSource();
    @Property(selector = "setDataSource:", strongRef = true)
    public native void setDataSource(UICollectionViewDataSource v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "prefetchDataSource")
    public native UICollectionViewDataSourcePrefetching getPrefetchDataSource();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setPrefetchDataSource:", strongRef = true)
    public native void setPrefetchDataSource(UICollectionViewDataSourcePrefetching v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "isPrefetchingEnabled")
    public native boolean isPrefetchingEnabled();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setPrefetchingEnabled:")
    public native void setPrefetchingEnabled(boolean v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "dragDelegate")
    public native UICollectionViewDragDelegate getDragDelegate();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setDragDelegate:", strongRef = true)
    public native void setDragDelegate(UICollectionViewDragDelegate v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "dropDelegate")
    public native UICollectionViewDropDelegate getDropDelegate();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setDropDelegate:", strongRef = true)
    public native void setDropDelegate(UICollectionViewDropDelegate v);
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
    @Property(selector = "reorderingCadence")
    public native UICollectionViewReorderingCadence getReorderingCadence();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setReorderingCadence:")
    public native void setReorderingCadence(UICollectionViewReorderingCadence v);
    @Property(selector = "backgroundView")
    public native UIView getBackgroundView();
    @Property(selector = "setBackgroundView:")
    public native void setBackgroundView(UIView v);
    @Property(selector = "allowsSelection")
    public native boolean allowsSelection();
    @Property(selector = "setAllowsSelection:")
    public native void setAllowsSelection(boolean v);
    @Property(selector = "allowsMultipleSelection")
    public native boolean allowsMultipleSelection();
    @Property(selector = "setAllowsMultipleSelection:")
    public native void setAllowsMultipleSelection(boolean v);
    @Property(selector = "indexPathsForSelectedItems")
    public native NSArray<NSIndexPath> getIndexPathsForSelectedItems();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "hasUncommittedUpdates")
    public native boolean hasUncommittedUpdates();
    @Property(selector = "numberOfSections")
    public native @MachineSizedSInt long getNumberOfSections();
    @Property(selector = "visibleCells")
    public native NSArray<UICollectionViewCell> getVisibleCells();
    @Property(selector = "indexPathsForVisibleItems")
    public native NSArray<NSIndexPath> getIndexPathsForVisibleItems();
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
    private UICollectionViewModel model;
    public void setModel(UICollectionViewModel model) {
        this.model = model;
        setDelegate(model);
        setDataSource(model);
    }
    public UICollectionViewModel getModel() {
        return model;
    }
    /*<methods>*/
    @Method(selector = "initWithFrame:collectionViewLayout:")
    protected native @Pointer long init(@ByVal CGRect frame, UICollectionViewLayout layout);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    @Method(selector = "registerClass:forCellWithReuseIdentifier:")
    public native void registerReusableCellClass(Class<? extends UICollectionViewCell> cellClass, String identifier);
    @Method(selector = "registerNib:forCellWithReuseIdentifier:")
    public native void registerReusableCellNib(UINib nib, String identifier);
    @Method(selector = "registerClass:forSupplementaryViewOfKind:withReuseIdentifier:")
    public native void registerReusableSupplementaryViewClass(Class<? extends UICollectionReusableView> viewClass, UICollectionElementKind elementKind, String identifier);
    @Method(selector = "registerNib:forSupplementaryViewOfKind:withReuseIdentifier:")
    public native void registerReusableSupplementaryViewNib(UINib nib, UICollectionElementKind kind, String identifier);
    @Method(selector = "dequeueReusableCellWithReuseIdentifier:forIndexPath:")
    public native UICollectionReusableView dequeueReusableCell(String identifier, NSIndexPath indexPath);
    @Method(selector = "dequeueReusableSupplementaryViewOfKind:withReuseIdentifier:forIndexPath:")
    public native UICollectionReusableView dequeueReusableSupplementaryView(UICollectionElementKind elementKind, String identifier, NSIndexPath indexPath);
    @Method(selector = "selectItemAtIndexPath:animated:scrollPosition:")
    public native void selectItem(NSIndexPath indexPath, boolean animated, UICollectionViewScrollPosition scrollPosition);
    @Method(selector = "deselectItemAtIndexPath:animated:")
    public native void deselectItem(NSIndexPath indexPath, boolean animated);
    @Method(selector = "reloadData")
    public native void reloadData();
    @Method(selector = "setCollectionViewLayout:animated:")
    public native void setCollectionViewLayout(UICollectionViewLayout layout, boolean animated);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Method(selector = "setCollectionViewLayout:animated:completion:")
    public native void setCollectionViewLayout(UICollectionViewLayout layout, boolean animated, @Block VoidBooleanBlock completion);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Method(selector = "startInteractiveTransitionToCollectionViewLayout:completion:")
    public native UICollectionViewTransitionLayout startInteractiveTransition(UICollectionViewLayout layout, @Block VoidBlock2<Boolean, Boolean> completion);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Method(selector = "finishInteractiveTransition")
    public native void finishInteractiveTransition();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Method(selector = "cancelInteractiveTransition")
    public native void cancelInteractiveTransition();
    @Method(selector = "numberOfItemsInSection:")
    public native @MachineSizedSInt long getNumberOfItemsInSection(@MachineSizedSInt long section);
    @Method(selector = "layoutAttributesForItemAtIndexPath:")
    public native UICollectionViewLayoutAttributes getLayoutAttributesForItem(NSIndexPath indexPath);
    @Method(selector = "layoutAttributesForSupplementaryElementOfKind:atIndexPath:")
    public native UICollectionViewLayoutAttributes getLayoutAttributesForSupplementaryElement(UICollectionElementKind kind, NSIndexPath indexPath);
    @Method(selector = "indexPathForItemAtPoint:")
    public native NSIndexPath getIndexPathForItem(@ByVal CGPoint point);
    @Method(selector = "indexPathForCell:")
    public native NSIndexPath getIndexPathForCell(UICollectionViewCell cell);
    @Method(selector = "cellForItemAtIndexPath:")
    public native UICollectionViewCell getCellForItem(NSIndexPath indexPath);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "supplementaryViewForElementKind:atIndexPath:")
    public native UICollectionReusableView getSupplementaryView(String elementKind, NSIndexPath indexPath);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "visibleSupplementaryViewsOfKind:")
    public native NSArray<UICollectionReusableView> getVisibleSupplementaryViews(String elementKind);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "indexPathsForVisibleSupplementaryElementsOfKind:")
    public native NSArray<NSIndexPath> getIndexPathsForVisibleSupplementaryElements(String elementKind);
    @Method(selector = "scrollToItemAtIndexPath:atScrollPosition:animated:")
    public native void scrollToItem(NSIndexPath indexPath, UICollectionViewScrollPosition scrollPosition, boolean animated);
    @Method(selector = "insertSections:")
    public native void insertSections(NSIndexSet sections);
    @Method(selector = "deleteSections:")
    public native void deleteSections(NSIndexSet sections);
    @Method(selector = "reloadSections:")
    public native void reloadSections(NSIndexSet sections);
    @Method(selector = "moveSection:toSection:")
    public native void moveSection(@MachineSizedSInt long section, @MachineSizedSInt long newSection);
    @Method(selector = "insertItemsAtIndexPaths:")
    public native void insertItems(NSArray<NSIndexPath> indexPaths);
    @Method(selector = "deleteItemsAtIndexPaths:")
    public native void deleteItems(NSArray<NSIndexPath> indexPaths);
    @Method(selector = "reloadItemsAtIndexPaths:")
    public native void reloadItems(NSArray<NSIndexPath> indexPaths);
    @Method(selector = "moveItemAtIndexPath:toIndexPath:")
    public native void moveItem(NSIndexPath indexPath, NSIndexPath newIndexPath);
    @Method(selector = "performBatchUpdates:completion:")
    public native void performBatchUpdates(@Block Runnable updates, @Block VoidBooleanBlock completion);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "beginInteractiveMovementForItemAtIndexPath:")
    public native boolean beginInteractiveMovement(NSIndexPath indexPath);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "updateInteractiveMovementTargetPosition:")
    public native void updateInteractiveMovement(@ByVal CGPoint targetPosition);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "endInteractiveMovement")
    public native void endInteractiveMovement();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "cancelInteractiveMovement")
    public native void cancelInteractiveMovement();
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
