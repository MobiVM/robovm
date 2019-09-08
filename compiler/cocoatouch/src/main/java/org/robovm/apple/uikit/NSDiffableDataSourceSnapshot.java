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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSDiffableDataSourceSnapshot<SectionIdentifierType extends NSObject, ItemIdentifierType extends NSObject>/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSDiffableDataSourceSnapshotPtr<SectionIdentifierType extends NSObject, ItemIdentifierType extends NSObject> extends Ptr<NSDiffableDataSourceSnapshot<SectionIdentifierType, ItemIdentifierType>, NSDiffableDataSourceSnapshotPtr<SectionIdentifierType, ItemIdentifierType>> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSDiffableDataSourceSnapshot.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSDiffableDataSourceSnapshot() {}
    protected NSDiffableDataSourceSnapshot(Handle h, long handle) { super(h, handle); }
    protected NSDiffableDataSourceSnapshot(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "numberOfItems")
    public native @MachineSizedSInt long getNumberOfItems();
    @Property(selector = "numberOfSections")
    public native @MachineSizedSInt long getNumberOfSections();
    @Property(selector = "sectionIdentifiers")
    public native NSArray<SectionIdentifierType> getSectionIdentifiers();
    @Property(selector = "itemIdentifiers")
    public native NSArray<ItemIdentifierType> getItemIdentifiers();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "numberOfItemsInSection:")
    public native @MachineSizedSInt long numberOfItemsInSection(SectionIdentifierType sectionIdentifier);
    @Method(selector = "itemIdentifiersInSectionWithIdentifier:")
    public native NSArray<ItemIdentifierType> getItemIdentifiersInSection(SectionIdentifierType sectionIdentifier);
    @Method(selector = "sectionIdentifierForSectionContainingItemIdentifier:")
    public native SectionIdentifierType sectionIdentifierForSectionContainingItemIdentifier(ItemIdentifierType itemIdentifier);
    @Method(selector = "indexOfItemIdentifier:")
    public native @MachineSizedSInt long indexOfItemIdentifier(ItemIdentifierType itemIdentifier);
    @Method(selector = "indexOfSectionIdentifier:")
    public native @MachineSizedSInt long indexOfSectionIdentifier(SectionIdentifierType sectionIdentifier);
    @Method(selector = "appendItemsWithIdentifiers:")
    public native void appendItems(NSArray<ItemIdentifierType> identifiers);
    @Method(selector = "appendItemsWithIdentifiers:intoSectionWithIdentifier:")
    public native void appendItems(NSArray<ItemIdentifierType> identifiers, SectionIdentifierType sectionIdentifier);
    @Method(selector = "insertItemsWithIdentifiers:beforeItemWithIdentifier:")
    public native void insertItemsBeforeItem(NSArray<ItemIdentifierType> identifiers, ItemIdentifierType itemIdentifier);
    @Method(selector = "insertItemsWithIdentifiers:afterItemWithIdentifier:")
    public native void insertItemsAfterItem(NSArray<ItemIdentifierType> identifiers, ItemIdentifierType itemIdentifier);
    @Method(selector = "deleteItemsWithIdentifiers:")
    public native void deleteItems(NSArray<ItemIdentifierType> identifiers);
    @Method(selector = "deleteAllItems")
    public native void deleteAllItems();
    @Method(selector = "moveItemWithIdentifier:beforeItemWithIdentifier:")
    public native void moveItemBeforeItem(ItemIdentifierType fromIdentifier, ItemIdentifierType toIdentifier);
    @Method(selector = "moveItemWithIdentifier:afterItemWithIdentifier:")
    public native void moveItemAfterItem(ItemIdentifierType fromIdentifier, ItemIdentifierType toIdentifier);
    @Method(selector = "reloadItemsWithIdentifiers:")
    public native void reloadItems(NSArray<ItemIdentifierType> identifiers);
    @Method(selector = "appendSectionsWithIdentifiers:")
    public native void appendSections(NSArray<?> sectionIdentifiers);
    @Method(selector = "insertSectionsWithIdentifiers:beforeSectionWithIdentifier:")
    public native void insertSectionsBeforeSection(NSArray<SectionIdentifierType> sectionIdentifiers, SectionIdentifierType toSectionIdentifier);
    @Method(selector = "insertSectionsWithIdentifiers:afterSectionWithIdentifier:")
    public native void insertSectionsAfterSection(NSArray<SectionIdentifierType> sectionIdentifiers, SectionIdentifierType toSectionIdentifier);
    @Method(selector = "deleteSectionsWithIdentifiers:")
    public native void deleteSections(NSArray<SectionIdentifierType> sectionIdentifiers);
    @Method(selector = "moveSectionWithIdentifier:beforeSectionWithIdentifier:")
    public native void moveSectionBeforeSection(SectionIdentifierType fromSectionIdentifier, SectionIdentifierType toSectionIdentifier);
    @Method(selector = "moveSectionWithIdentifier:afterSectionWithIdentifier:")
    public native void moveSectionAfterSection(SectionIdentifierType fromSectionIdentifier, SectionIdentifierType toSectionIdentifier);
    @Method(selector = "reloadSectionsWithIdentifiers:")
    public native void reloadSections(NSArray<SectionIdentifierType> sectionIdentifiers);
    /*</methods>*/
}
