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
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UICollectionViewDiffableDataSource<SectionIdentifierType extends NSObject, ItemIdentifierType extends NSObject>/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UICollectionViewDataSource/*</implements>*/ {

    /*<ptr>*/public static class UICollectionViewDiffableDataSourcePtr<SectionIdentifierType extends NSObject, ItemIdentifierType extends NSObject> extends Ptr<UICollectionViewDiffableDataSource<SectionIdentifierType, ItemIdentifierType>, UICollectionViewDiffableDataSourcePtr<SectionIdentifierType, ItemIdentifierType>> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UICollectionViewDiffableDataSource.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UICollectionViewDiffableDataSource() {}
    protected UICollectionViewDiffableDataSource(Handle h, long handle) { super(h, handle); }
    protected UICollectionViewDiffableDataSource(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCollectionView:cellProvider:")
    public UICollectionViewDiffableDataSource(UICollectionView collectionView, @Block Block3<UICollectionView, NSIndexPath, NSObject, UICollectionViewCell> cellProvider) { super((SkipInit) null); initObject(init(collectionView, cellProvider)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "supplementaryViewProvider")
    public native @Block Block3<UICollectionView, NSString, NSIndexPath, UICollectionReusableView> getSupplementaryViewProvider();
    @Property(selector = "setSupplementaryViewProvider:")
    public native void setSupplementaryViewProvider(@Block Block3<UICollectionView, NSString, NSIndexPath, UICollectionReusableView> v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "reorderingHandlers")
    public native UICollectionViewDiffableDataSourceReorderingHandlers<SectionIdentifierType, ItemIdentifierType> getReorderingHandlers();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setReorderingHandlers:")
    public native void setReorderingHandlers(UICollectionViewDiffableDataSourceReorderingHandlers<SectionIdentifierType, ItemIdentifierType> v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "sectionSnapshotHandlers")
    public native UICollectionViewDiffableDataSourceSectionSnapshotHandlers<ItemIdentifierType> getSectionSnapshotHandlers();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setSectionSnapshotHandlers:")
    public native void setSectionSnapshotHandlers(UICollectionViewDiffableDataSourceSectionSnapshotHandlers<ItemIdentifierType> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCollectionView:cellProvider:")
    protected native @Pointer long init(UICollectionView collectionView, @Block Block3<UICollectionView, NSIndexPath, NSObject, UICollectionViewCell> cellProvider);
    @Method(selector = "snapshot")
    public native NSDiffableDataSourceSnapshot<SectionIdentifierType, ItemIdentifierType> snapshot();
    @Method(selector = "applySnapshot:animatingDifferences:")
    public native void applySnapshot(NSDiffableDataSourceSnapshot<SectionIdentifierType, ItemIdentifierType> snapshot, boolean animatingDifferences);
    @Method(selector = "applySnapshot:animatingDifferences:completion:")
    public native void applySnapshot(NSDiffableDataSourceSnapshot<SectionIdentifierType, ItemIdentifierType> snapshot, boolean animatingDifferences, @Block Runnable completion);
    @Method(selector = "itemIdentifierForIndexPath:")
    public native ItemIdentifierType itemIdentifierForIndexPath(NSIndexPath indexPath);
    @Method(selector = "indexPathForItemIdentifier:")
    public native NSIndexPath indexPathForItemIdentifier(ItemIdentifierType identifier);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "applySnapshot:toSection:animatingDifferences:")
    public native void applySnapshot(NSDiffableDataSourceSectionSnapshot<ItemIdentifierType> snapshot, SectionIdentifierType sectionIdentifier, boolean animatingDifferences);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "applySnapshot:toSection:animatingDifferences:completion:")
    public native void applySnapshot(NSDiffableDataSourceSectionSnapshot<ItemIdentifierType> snapshot, SectionIdentifierType sectionIdentifier, boolean animatingDifferences, @Block Runnable completion);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "snapshotForSection:")
    public native NSDiffableDataSourceSectionSnapshot<ItemIdentifierType> snapshotForSection(SectionIdentifierType section);
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
