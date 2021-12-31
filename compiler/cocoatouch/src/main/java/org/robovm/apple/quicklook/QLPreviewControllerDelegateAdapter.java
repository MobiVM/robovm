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
import org.robovm.apple.mobilecoreservices.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.pdfkit.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/QLPreviewControllerDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements QLPreviewControllerDelegate/*</implements>*/ {

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
    @NotImplemented("previewControllerWillDismiss:")
    public void willDismiss(QLPreviewController controller) {}
    @NotImplemented("previewControllerDidDismiss:")
    public void didDismiss(QLPreviewController controller) {}
    @NotImplemented("previewController:shouldOpenURL:forPreviewItem:")
    public boolean shouldOpenURL(QLPreviewController controller, NSURL url, QLPreviewItem item) { return false; }
    @NotImplemented("previewController:frameForPreviewItem:inSourceView:")
    public @ByVal CGRect getFrame(QLPreviewController controller, QLPreviewItem item, UIView.UIViewPtr view) { return null; }
    @NotImplemented("previewController:transitionImageForPreviewItem:contentRect:")
    public UIImage getTransitionImage(QLPreviewController controller, QLPreviewItem item, CGRect contentRect) { return null; }
    /**
     * @since Available in iOS 10.0 and later.
     */
    @NotImplemented("previewController:transitionViewForPreviewItem:")
    public UIView getTransitionViewForPreviewItem(QLPreviewController controller, QLPreviewItem item) { return null; }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("previewController:editingModeForPreviewItem:")
    public QLPreviewItemEditingMode getEditingMode(QLPreviewController controller, QLPreviewItem previewItem) { return null; }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("previewController:didUpdateContentsOfPreviewItem:")
    public void didUpdateContentsOfPreviewItem(QLPreviewController controller, QLPreviewItem previewItem) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("previewController:didSaveEditedCopyOfPreviewItem:atURL:")
    public void didSaveEditedCopyOfPreviewItem(QLPreviewController controller, QLPreviewItem previewItem, NSURL modifiedContentsURL) {}
    /*</methods>*/
}
