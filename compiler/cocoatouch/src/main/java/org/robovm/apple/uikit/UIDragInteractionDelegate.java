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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/UIDragInteractionDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "dragInteraction:itemsForBeginningSession:")
    NSArray<UIDragItem> itemsForBeginningSession(UIDragInteraction interaction, UIDragSession session);
    @Method(selector = "dragInteraction:previewForLiftingItem:session:")
    UITargetedDragPreview previewForLiftingItem(UIDragInteraction interaction, UIDragItem item, UIDragSession session);
    @Method(selector = "dragInteraction:willAnimateLiftWithAnimator:session:")
    void willAnimateLift(UIDragInteraction interaction, UIDragAnimating animator, UIDragSession session);
    @Method(selector = "dragInteraction:sessionWillBegin:")
    void sessionWillBegin(UIDragInteraction interaction, UIDragSession session);
    @Method(selector = "dragInteraction:sessionAllowsMoveOperation:")
    boolean sessionAllowsMoveOperation(UIDragInteraction interaction, UIDragSession session);
    @Method(selector = "dragInteraction:sessionIsRestrictedToDraggingApplication:")
    boolean sessionIsRestrictedToDraggingApplication(UIDragInteraction interaction, UIDragSession session);
    @Method(selector = "dragInteraction:prefersFullSizePreviewsForSession:")
    boolean prefersFullSizePreviews(UIDragInteraction interaction, UIDragSession session);
    @Method(selector = "dragInteraction:sessionDidMove:")
    void sessionDidMove(UIDragInteraction interaction, UIDragSession session);
    @Method(selector = "dragInteraction:session:willEndWithOperation:")
    void sessionWillEnd(UIDragInteraction interaction, UIDragSession session, UIDropOperation operation);
    @Method(selector = "dragInteraction:session:didEndWithOperation:")
    void sessionDidEnd(UIDragInteraction interaction, UIDragSession session, UIDropOperation operation);
    @Method(selector = "dragInteraction:sessionDidTransferItems:")
    void sessionDidTransferItems(UIDragInteraction interaction, UIDragSession session);
    @Method(selector = "dragInteraction:itemsForAddingToSession:withTouchAtPoint:")
    NSArray<UIDragItem> itemsForAddingToSession(UIDragInteraction interaction, UIDragSession session, @ByVal CGPoint point);
    @Method(selector = "dragInteraction:sessionForAddingItems:withTouchAtPoint:")
    UIDragSession sessionForAddingItems(UIDragInteraction interaction, NSArray<?> sessions, @ByVal CGPoint point);
    @Method(selector = "dragInteraction:session:willAddItems:forInteraction:")
    void sessionWillAddItems(UIDragInteraction interaction, UIDragSession session, NSArray<UIDragItem> items, UIDragInteraction addingInteraction);
    @Method(selector = "dragInteraction:previewForCancellingItem:withDefault:")
    UITargetedDragPreview previewForCancellingItem(UIDragInteraction interaction, UIDragItem item, UITargetedDragPreview defaultPreview);
    @Method(selector = "dragInteraction:item:willAnimateCancelWithAnimator:")
    void itemWillAnimateCancel(UIDragInteraction interaction, UIDragItem item, UIDragAnimating animator);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
