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
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UITableViewDragDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UITableViewDragDelegate/*</implements>*/ {

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
    @NotImplemented("tableView:itemsForBeginningDragSession:atIndexPath:")
    public NSArray<UIDragItem> itemsForBeginningDragSession(UITableView tableView, UIDragSession session, NSIndexPath indexPath) { return null; }
    @NotImplemented("tableView:itemsForAddingToDragSession:atIndexPath:point:")
    public NSArray<UIDragItem> itemsForAddingToDragSession(UITableView tableView, UIDragSession session, NSIndexPath indexPath, @ByVal CGPoint point) { return null; }
    @NotImplemented("tableView:dragPreviewParametersForRowAtIndexPath:")
    public UIDragPreviewParameters dragPreviewParametersForRow(UITableView tableView, NSIndexPath indexPath) { return null; }
    @NotImplemented("tableView:dragSessionWillBegin:")
    public void dragSessionWillBegin(UITableView tableView, UIDragSession session) {}
    @NotImplemented("tableView:dragSessionDidEnd:")
    public void dragSessionDidEnd(UITableView tableView, UIDragSession session) {}
    @NotImplemented("tableView:dragSessionAllowsMoveOperation:")
    public boolean dragSessionAllowsMoveOperation(UITableView tableView, UIDragSession session) { return false; }
    @NotImplemented("tableView:dragSessionIsRestrictedToDraggingApplication:")
    public boolean dragSessionIsRestrictedToDraggingApplication(UITableView tableView, UIDragSession session) { return false; }
    /*</methods>*/
}
