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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UICollectionViewDropCoordinatorAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UICollectionViewDropCoordinator/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("items")
    public NSArray<?> getItems() { return null; }
    @NotImplemented("destinationIndexPath")
    public NSIndexPath getDestinationIndexPath() { return null; }
    @NotImplemented("proposal")
    public UICollectionViewDropProposal getProposal() { return null; }
    @NotImplemented("session")
    public UIDropSession getSession() { return null; }
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("dropItem:toPlaceholder:")
    public UICollectionViewDropPlaceholderContext dropItem(UIDragItem dragItem, UICollectionViewDropPlaceholder placeholder) { return null; }
    @NotImplemented("dropItem:toItemAtIndexPath:")
    public UIDragAnimating dropItem(UIDragItem dragItem, NSIndexPath indexPath) { return null; }
    @NotImplemented("dropItem:intoItemAtIndexPath:rect:")
    public UIDragAnimating dropItemIntoItem(UIDragItem dragItem, NSIndexPath indexPath, @ByVal CGRect rect) { return null; }
    @NotImplemented("dropItem:toTarget:")
    public UIDragAnimating dropItemToTarget(UIDragItem dragItem, UIDragPreviewTarget target) { return null; }
    /*</methods>*/
}
