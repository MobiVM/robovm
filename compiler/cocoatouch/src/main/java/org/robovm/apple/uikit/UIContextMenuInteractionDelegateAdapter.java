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
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIContextMenuInteractionDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UIContextMenuInteractionDelegate/*</implements>*/ {

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
    @NotImplemented("contextMenuInteraction:configurationForMenuAtLocation:")
    public UIContextMenuConfiguration getConfiguration(UIContextMenuInteraction interaction, @ByVal CGPoint location) { return null; }
    /**
     * @since Available in iOS 16.0 and later.
     */
    @NotImplemented("contextMenuInteraction:configuration:highlightPreviewForItemWithIdentifier:")
    public UITargetedPreview getHighlightPreview(UIContextMenuInteraction interaction, UIContextMenuConfiguration configuration, NSObject identifier) { return null; }
    /**
     * @since Available in iOS 16.0 and later.
     */
    @NotImplemented("contextMenuInteraction:configuration:dismissalPreviewForItemWithIdentifier:")
    public UITargetedPreview getDismissalPreview(UIContextMenuInteraction interaction, UIContextMenuConfiguration configuration, NSObject identifier) { return null; }
    @NotImplemented("contextMenuInteraction:willPerformPreviewActionForMenuWithConfiguration:animator:")
    public void willPerformPreviewAction(UIContextMenuInteraction interaction, UIContextMenuConfiguration configuration, UIContextMenuInteractionCommitAnimating animator) {}
    @NotImplemented("contextMenuInteraction:willDisplayMenuForConfiguration:animator:")
    public void willDisplayMenu(UIContextMenuInteraction interaction, UIContextMenuConfiguration configuration, UIContextMenuInteractionAnimating animator) {}
    @NotImplemented("contextMenuInteraction:willEndForConfiguration:animator:")
    public void willEnd(UIContextMenuInteraction interaction, UIContextMenuConfiguration configuration, UIContextMenuInteractionAnimating animator) {}
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 16.0. Use contextMenuInteraction:configuration:highlightPreviewForItemWithIdentifier:
     */
    @Deprecated
    @NotImplemented("contextMenuInteraction:previewForHighlightingMenuWithConfiguration:")
    public UITargetedPreview getPreviewForHighlightingMenu(UIContextMenuInteraction interaction, UIContextMenuConfiguration configuration) { return null; }
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 16.0. Use contextMenuInteraction:configuration:dismissalPreviewForItemWithIdentifier:
     */
    @Deprecated
    @NotImplemented("contextMenuInteraction:previewForDismissingMenuWithConfiguration:")
    public UITargetedPreview getPreviewForDismissingMenu(UIContextMenuInteraction interaction, UIContextMenuConfiguration configuration) { return null; }
    /*</methods>*/
}
