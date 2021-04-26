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
package org.robovm.apple.webkit;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.security.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/WKDownloadDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "download:decideDestinationUsingResponse:suggestedFilename:completionHandler:")
    void decideDestinationUsingResponse(WKDownload download, NSURLResponse response, String suggestedFilename, @Block VoidBlock1<NSURL> completionHandler);
    @Method(selector = "download:willPerformHTTPRedirection:newRequest:decisionHandler:")
    void willPerformHTTPRedirection(WKDownload download, NSHTTPURLResponse response, NSURLRequest request, @Block VoidBlock1<WKDownloadRedirectPolicy> decisionHandler);
    @Method(selector = "download:didReceiveAuthenticationChallenge:completionHandler:")
    void didReceiveAuthenticationChallenge(WKDownload download, NSURLAuthenticationChallenge challenge, @Block VoidBlock2<NSURLSessionAuthChallengeDisposition, NSURLCredential> completionHandler);
    @Method(selector = "downloadDidFinish:")
    void didFinish(WKDownload download);
    @Method(selector = "download:didFailWithError:resumeData:")
    void didFailWithError(WKDownload download, NSError error, NSData resumeData);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
