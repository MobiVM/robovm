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
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/UIContextMenuInteractionDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "contextMenuInteraction:configurationForMenuAtLocation:")
    UIContextMenuConfiguration getConfiguration(UIContextMenuInteraction interaction, @ByVal CGPoint location);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "contextMenuInteraction:configuration:highlightPreviewForItemWithIdentifier:")
    UITargetedPreview getHighlightPreview(UIContextMenuInteraction interaction, UIContextMenuConfiguration configuration, NSObject identifier);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "contextMenuInteraction:configuration:dismissalPreviewForItemWithIdentifier:")
    UITargetedPreview getDismissalPreview(UIContextMenuInteraction interaction, UIContextMenuConfiguration configuration, NSObject identifier);
    @Method(selector = "contextMenuInteraction:willPerformPreviewActionForMenuWithConfiguration:animator:")
    void willPerformPreviewAction(UIContextMenuInteraction interaction, UIContextMenuConfiguration configuration, UIContextMenuInteractionCommitAnimating animator);
    @Method(selector = "contextMenuInteraction:willDisplayMenuForConfiguration:animator:")
    void willDisplayMenu(UIContextMenuInteraction interaction, UIContextMenuConfiguration configuration, UIContextMenuInteractionAnimating animator);
    @Method(selector = "contextMenuInteraction:willEndForConfiguration:animator:")
    void willEnd(UIContextMenuInteraction interaction, UIContextMenuConfiguration configuration, UIContextMenuInteractionAnimating animator);
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 16.0. Use contextMenuInteraction:configuration:highlightPreviewForItemWithIdentifier:
     */
    @Deprecated
    @Method(selector = "contextMenuInteraction:previewForHighlightingMenuWithConfiguration:")
    UITargetedPreview getPreviewForHighlightingMenu(UIContextMenuInteraction interaction, UIContextMenuConfiguration configuration);
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 16.0. Use contextMenuInteraction:configuration:dismissalPreviewForItemWithIdentifier:
     */
    @Deprecated
    @Method(selector = "contextMenuInteraction:previewForDismissingMenuWithConfiguration:")
    UITargetedPreview getPreviewForDismissingMenu(UIContextMenuInteraction interaction, UIContextMenuConfiguration configuration);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
