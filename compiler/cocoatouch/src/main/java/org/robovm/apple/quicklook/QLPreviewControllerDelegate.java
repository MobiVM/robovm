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
package org.robovm.apple.quicklook;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/QLPreviewControllerDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "previewControllerWillDismiss:")
    void willDismiss(QLPreviewController controller);
    @Method(selector = "previewControllerDidDismiss:")
    void didDismiss(QLPreviewController controller);
    @Method(selector = "previewController:shouldOpenURL:forPreviewItem:")
    boolean shouldOpenURL(QLPreviewController controller, NSURL url, QLPreviewItem item);
    @Method(selector = "previewController:frameForPreviewItem:inSourceView:")
    @ByVal CGRect getFrame(QLPreviewController controller, QLPreviewItem item, UIView.UIViewPtr view);
    @Method(selector = "previewController:transitionImageForPreviewItem:contentRect:")
    UIImage getTransitionImage(QLPreviewController controller, QLPreviewItem item, CGRect contentRect);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "previewController:transitionViewForPreviewItem:")
    UIView getTransitionViewForPreviewItem(QLPreviewController controller, QLPreviewItem item);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "previewController:editingModeForPreviewItem:")
    QLPreviewItemEditingMode getEditingMode(QLPreviewController controller, QLPreviewItem previewItem);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "previewController:didUpdateContentsOfPreviewItem:")
    void didUpdateContentsOfPreviewItem(QLPreviewController controller, QLPreviewItem previewItem);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "previewController:didSaveEditedCopyOfPreviewItem:atURL:")
    void didSaveEditedCopyOfPreviewItem(QLPreviewController controller, QLPreviewItem previewItem, NSURL modifiedContentsURL);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
