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
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSDiffableDataSourceSectionSnapshot<ItemIdentifierType extends NSObject>/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSDiffableDataSourceSectionSnapshotPtr<ItemIdentifierType extends NSObject> extends Ptr<NSDiffableDataSourceSectionSnapshot<ItemIdentifierType>, NSDiffableDataSourceSectionSnapshotPtr<ItemIdentifierType>> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSDiffableDataSourceSectionSnapshot.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSDiffableDataSourceSectionSnapshot() {}
    protected NSDiffableDataSourceSectionSnapshot(Handle h, long handle) { super(h, handle); }
    protected NSDiffableDataSourceSectionSnapshot(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "items")
    public native NSArray<ItemIdentifierType> getItems();
    @Property(selector = "rootItems")
    public native NSArray<ItemIdentifierType> getRootItems();
    @Property(selector = "visibleItems")
    public native NSArray<ItemIdentifierType> getVisibleItems();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "appendItems:")
    public native void appendItems(NSArray<ItemIdentifierType> items);
    @Method(selector = "appendItems:intoParentItem:")
    public native void appendItems(NSArray<ItemIdentifierType> items, ItemIdentifierType parentItem);
    @Method(selector = "insertItems:beforeItem:")
    public native void insertItemsBeforeItem(NSArray<ItemIdentifierType> items, ItemIdentifierType beforeIdentifier);
    @Method(selector = "insertItems:afterItem:")
    public native void insertItemsAgterItem(NSArray<ItemIdentifierType> items, ItemIdentifierType afterIdentifier);
    @Method(selector = "deleteItems:")
    public native void deleteItems(NSArray<ItemIdentifierType> items);
    @Method(selector = "deleteAllItems")
    public native void deleteAllItems();
    @Method(selector = "expandItems:")
    public native void expandItems(NSArray<ItemIdentifierType> items);
    @Method(selector = "collapseItems:")
    public native void collapseItems(NSArray<ItemIdentifierType> items);
    @Method(selector = "replaceChildrenOfParentItem:withSnapshot:")
    public native void replaceChildrenOfParentItem(ItemIdentifierType parentItem, NSDiffableDataSourceSectionSnapshot<ItemIdentifierType> snapshot);
    @Method(selector = "insertSnapshot:beforeItem:")
    public native void insertSnapshotBeforeItem(NSDiffableDataSourceSectionSnapshot<ItemIdentifierType> snapshot, ItemIdentifierType item);
    @Method(selector = "insertSnapshot:afterItem:")
    public native ItemIdentifierType insertSnapshotAfterItem(NSDiffableDataSourceSectionSnapshot<ItemIdentifierType> snapshot, ItemIdentifierType item);
    @Method(selector = "isExpanded:")
    public native boolean isExpanded(ItemIdentifierType item);
    @Method(selector = "isVisible:")
    public native boolean isVisible(ItemIdentifierType item);
    @Method(selector = "containsItem:")
    public native boolean containsItem(ItemIdentifierType item);
    @Method(selector = "levelOfItem:")
    public native @MachineSizedSInt long levelOfItem(ItemIdentifierType item);
    @Method(selector = "indexOfItem:")
    public native @MachineSizedSInt long indexOfItem(ItemIdentifierType item);
    @Method(selector = "expandedItems")
    public native NSArray<ItemIdentifierType> expandedItems();
    @Method(selector = "parentOfChildItem:")
    public native ItemIdentifierType parentOfChildItem(ItemIdentifierType childItem);
    @Method(selector = "snapshotOfParentItem:")
    public native NSDiffableDataSourceSectionSnapshot<ItemIdentifierType> snapshotOfParentItem(ItemIdentifierType parentItem);
    @Method(selector = "snapshotOfParentItem:includingParentItem:")
    public native NSDiffableDataSourceSectionSnapshot<ItemIdentifierType> getSnapshotOfParentItem(ItemIdentifierType parentItem, boolean includingParentItem);
    @Method(selector = "visualDescription")
    public native String visualDescription();
    /*</methods>*/
}
