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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIDragInteractionDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UIDragInteractionDelegate/*</implements>*/ {

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
    @NotImplemented("dragInteraction:itemsForBeginningSession:")
    public NSArray<UIDragItem> itemsForBeginningSession(UIDragInteraction interaction, UIDragSession session) { return null; }
    @NotImplemented("dragInteraction:previewForLiftingItem:session:")
    public UITargetedDragPreview previewForLiftingItem(UIDragInteraction interaction, UIDragItem item, UIDragSession session) { return null; }
    @NotImplemented("dragInteraction:willAnimateLiftWithAnimator:session:")
    public void willAnimateLift(UIDragInteraction interaction, UIDragAnimating animator, UIDragSession session) {}
    @NotImplemented("dragInteraction:sessionWillBegin:")
    public void sessionWillBegin(UIDragInteraction interaction, UIDragSession session) {}
    @NotImplemented("dragInteraction:sessionAllowsMoveOperation:")
    public boolean sessionAllowsMoveOperation(UIDragInteraction interaction, UIDragSession session) { return false; }
    @NotImplemented("dragInteraction:sessionIsRestrictedToDraggingApplication:")
    public boolean sessionIsRestrictedToDraggingApplication(UIDragInteraction interaction, UIDragSession session) { return false; }
    @NotImplemented("dragInteraction:prefersFullSizePreviewsForSession:")
    public boolean prefersFullSizePreviews(UIDragInteraction interaction, UIDragSession session) { return false; }
    @NotImplemented("dragInteraction:sessionDidMove:")
    public void sessionDidMove(UIDragInteraction interaction, UIDragSession session) {}
    @NotImplemented("dragInteraction:session:willEndWithOperation:")
    public void sessionWillEnd(UIDragInteraction interaction, UIDragSession session, UIDropOperation operation) {}
    @NotImplemented("dragInteraction:session:didEndWithOperation:")
    public void sessionDidEnd(UIDragInteraction interaction, UIDragSession session, UIDropOperation operation) {}
    @NotImplemented("dragInteraction:sessionDidTransferItems:")
    public void sessionDidTransferItems(UIDragInteraction interaction, UIDragSession session) {}
    @NotImplemented("dragInteraction:itemsForAddingToSession:withTouchAtPoint:")
    public NSArray<UIDragItem> itemsForAddingToSession(UIDragInteraction interaction, UIDragSession session, @ByVal CGPoint point) { return null; }
    @NotImplemented("dragInteraction:sessionForAddingItems:withTouchAtPoint:")
    public UIDragSession sessionForAddingItems(UIDragInteraction interaction, NSArray<?> sessions, @ByVal CGPoint point) { return null; }
    @NotImplemented("dragInteraction:session:willAddItems:forInteraction:")
    public void sessionWillAddItems(UIDragInteraction interaction, UIDragSession session, NSArray<UIDragItem> items, UIDragInteraction addingInteraction) {}
    @NotImplemented("dragInteraction:previewForCancellingItem:withDefault:")
    public UITargetedDragPreview previewForCancellingItem(UIDragInteraction interaction, UIDragItem item, UITargetedDragPreview defaultPreview) { return null; }
    @NotImplemented("dragInteraction:item:willAnimateCancelWithAnimator:")
    public void itemWillAnimateCancel(UIDragInteraction interaction, UIDragItem item, UIDragAnimating animator) {}
    /*</methods>*/
}
