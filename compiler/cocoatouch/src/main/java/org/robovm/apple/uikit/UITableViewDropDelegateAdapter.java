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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UITableViewDropDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UITableViewDropDelegate/*</implements>*/ {

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
    @NotImplemented("tableView:performDropWithCoordinator:")
    public void performDrop(UITableView tableView, UITableViewDropCoordinator coordinator) {}
    @NotImplemented("tableView:canHandleDropSession:")
    public boolean canHandleDropSession(UITableView tableView, UIDropSession session) { return false; }
    @NotImplemented("tableView:dropSessionDidEnter:")
    public void dropSessionDidEnter(UITableView tableView, UIDropSession session) {}
    @NotImplemented("tableView:dropSessionDidUpdate:withDestinationIndexPath:")
    public UITableViewDropProposal dropSessionDidUpdate(UITableView tableView, UIDropSession session, NSIndexPath destinationIndexPath) { return null; }
    @NotImplemented("tableView:dropSessionDidExit:")
    public void dropSessionDidExit(UITableView tableView, UIDropSession session) {}
    @NotImplemented("tableView:dropSessionDidEnd:")
    public void dropSessionDidEnd(UITableView tableView, UIDropSession session) {}
    @NotImplemented("tableView:dropPreviewParametersForRowAtIndexPath:")
    public UIDragPreviewParameters dropPreviewParameters(UITableView tableView, NSIndexPath indexPath) { return null; }
    /*</methods>*/
}
