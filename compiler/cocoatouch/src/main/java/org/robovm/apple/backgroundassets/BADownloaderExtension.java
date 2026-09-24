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
package org.robovm.apple.backgroundassets;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 16.1 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/BADownloaderExtension/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "downloadsForRequest:manifestURL:extensionInfo:")
    NSSet<BADownload> getDownloads(BAContentRequest contentRequest, NSURL manifestURL, BAAppExtensionInfo extensionInfo);
    @Method(selector = "backgroundDownload:didReceiveChallenge:completionHandler:")
    void backgroundDownloadDidReceiveChallenge(BADownload download, NSURLAuthenticationChallenge challenge, @Block VoidBlock2<NSURLSessionAuthChallengeDisposition, NSURLCredential> completionHandler);
    @Method(selector = "backgroundDownload:failedWithError:")
    void backgroundDownloadFailed(BADownload download, NSError error);
    @Method(selector = "backgroundDownload:finishedWithFileURL:")
    void backgroundDownloadFinished(BADownload download, NSURL fileURL);
    /**
     * @since Available in iOS 16.1 and later.
     * @deprecated Deprecated in iOS 16.4. extensionWillTerminate will not be invoked in all applicable circumstances and should not be relied upon.
     */
    @Deprecated
    @Method(selector = "extensionWillTerminate")
    void extensionWillTerminate();
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
