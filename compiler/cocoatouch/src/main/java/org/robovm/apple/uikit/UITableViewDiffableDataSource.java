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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UITableViewDiffableDataSource<SectionIdentifierType extends NSObject, ItemIdentifierType extends NSObject>/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UITableViewDataSource/*</implements>*/ {

    /*<ptr>*/public static class UITableViewDiffableDataSourcePtr<SectionIdentifierType extends NSObject, ItemIdentifierType extends NSObject> extends Ptr<UITableViewDiffableDataSource<SectionIdentifierType, ItemIdentifierType>, UITableViewDiffableDataSourcePtr<SectionIdentifierType, ItemIdentifierType>> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UITableViewDiffableDataSource.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UITableViewDiffableDataSource() {}
    protected UITableViewDiffableDataSource(Handle h, long handle) { super(h, handle); }
    protected UITableViewDiffableDataSource(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTableView:cellProvider:")
    public UITableViewDiffableDataSource(UITableView tableView, @Block Block3<UITableView, NSIndexPath, NSObject, UITableViewCell> cellProvider) { super((SkipInit) null); initObject(init(tableView, cellProvider)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "defaultRowAnimation")
    public native UITableViewRowAnimation getDefaultRowAnimation();
    @Property(selector = "setDefaultRowAnimation:")
    public native void setDefaultRowAnimation(UITableViewRowAnimation v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTableView:cellProvider:")
    protected native @Pointer long init(UITableView tableView, @Block Block3<UITableView, NSIndexPath, NSObject, UITableViewCell> cellProvider);
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
