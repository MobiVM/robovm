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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UITextDragDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UITextDragDelegate/*</implements>*/ {

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
    @NotImplemented("textDraggableView:itemsForDrag:")
    public NSArray<UIDragItem> itemsForDrag(UIView textDraggableView, UITextDragRequest dragRequest) { return null; }
    @NotImplemented("textDraggableView:dragPreviewForLiftingItem:session:")
    public UITargetedDragPreview dragPreviewForLiftingItem(UIView textDraggableView, UIDragItem item, UIDragSession session) { return null; }
    @NotImplemented("textDraggableView:willAnimateLiftWithAnimator:session:")
    public void willAnimateLift(UIView textDraggableView, UIDragAnimating animator, UIDragSession session) {}
    @NotImplemented("textDraggableView:dragSessionWillBegin:")
    public void dragSessionWillBegin(UIView textDraggableView, UIDragSession session) {}
    @NotImplemented("textDraggableView:dragSessionDidEnd:withOperation:")
    public void dragSessionDidEnd(UIView textDraggableView, UIDragSession session, UIDropOperation operation) {}
    /*</methods>*/
}
