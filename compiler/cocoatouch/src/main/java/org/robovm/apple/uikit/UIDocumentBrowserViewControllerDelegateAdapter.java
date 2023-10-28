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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIDocumentBrowserViewControllerDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UIDocumentBrowserViewControllerDelegate/*</implements>*/ {

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
    /**
     * @since Available in iOS 11.0 and later.
     * @deprecated Deprecated in iOS 12.0. Use documentBrowser:didPickDocumentsAtURLs:
     */
    @Deprecated
    @NotImplemented("documentBrowser:didPickDocumentURLs:")
    public void didPickDocumentURLs(UIDocumentBrowserViewController controller, NSArray<NSURL> documentURLs) {}
    /**
     * @since Available in iOS 12.0 and later.
     */
    @NotImplemented("documentBrowser:didPickDocumentsAtURLs:")
    public void didPickDocumentsAtURLs(UIDocumentBrowserViewController controller, NSArray<NSURL> documentURLs) {}
    @NotImplemented("documentBrowser:didRequestDocumentCreationWithHandler:")
    public void didRequestDocumentCreationWithHandler(UIDocumentBrowserViewController controller, @Block VoidBlock2<NSURL, UIDocumentBrowserImportMode> importHandler) {}
    @NotImplemented("documentBrowser:didImportDocumentAtURL:toDestinationURL:")
    public void didImportDocument(UIDocumentBrowserViewController controller, NSURL sourceURL, NSURL destinationURL) {}
    @NotImplemented("documentBrowser:failedToImportDocumentAtURL:error:")
    public void failedToImportDocument(UIDocumentBrowserViewController controller, NSURL documentURL, NSError error) {}
    @NotImplemented("documentBrowser:applicationActivitiesForDocumentURLs:")
    public NSArray<UIActivity> applicationActivities(UIDocumentBrowserViewController controller, NSArray<NSURL> documentURLs) { return null; }
    @NotImplemented("documentBrowser:willPresentActivityViewController:")
    public void willPresentActivityViewController(UIDocumentBrowserViewController controller, UIActivityViewController activityViewController) {}
    /*</methods>*/
}
