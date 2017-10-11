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
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/UITableViewDropCoordinator/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "items")
    NSArray<?> getItems();
    @Property(selector = "destinationIndexPath")
    NSIndexPath getDestinationIndexPath();
    @Property(selector = "proposal")
    UITableViewDropProposal getProposal();
    @Property(selector = "session")
    UIDropSession getSession();
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "dropItem:toPlaceholder:")
    UITableViewDropPlaceholderContext dropItem(UIDragItem dragItem, UITableViewDropPlaceholder placeholder);
    @Method(selector = "dropItem:toRowAtIndexPath:")
    UIDragAnimating dropItem(UIDragItem dragItem, NSIndexPath indexPath);
    @Method(selector = "dropItem:intoRowAtIndexPath:rect:")
    UIDragAnimating dropItem(UIDragItem dragItem, NSIndexPath indexPath, @ByVal CGRect rect);
    @Method(selector = "dropItem:toTarget:")
    UIDragAnimating dropItem(UIDragItem dragItem, UIDragPreviewTarget target);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
