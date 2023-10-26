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
package org.robovm.apple.foundation;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.security.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSURLSessionTaskDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSURLSessionDelegateAdapter/*</extends>*/ 
    /*<implements>*/implements NSURLSessionTaskDelegate/*</implements>*/ {

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
     * @since Available in iOS 16.0 and later.
     */
    @NotImplemented("URLSession:didCreateTask:")
    public void didCreateTask(NSURLSession session, NSURLSessionTask task) {}
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("URLSession:task:willBeginDelayedRequest:completionHandler:")
    public void willBeginDelayedRequest(NSURLSession session, NSURLSessionTask task, NSURLRequest request, @Block VoidBlock2<NSURLSessionDelayedRequestDisposition, NSURLRequest> completionHandler) {}
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("URLSession:taskIsWaitingForConnectivity:")
    public void taskIsWaitingForConnectivity(NSURLSession session, NSURLSessionTask task) {}
    @NotImplemented("URLSession:task:willPerformHTTPRedirection:newRequest:completionHandler:")
    public void willPerformHTTPRedirection(NSURLSession session, NSURLSessionTask task, NSHTTPURLResponse response, NSURLRequest request, @Block VoidBlock1<NSURLRequest> completionHandler) {}
    @NotImplemented("URLSession:task:didReceiveChallenge:completionHandler:")
    public void didReceiveChallenge(NSURLSession session, NSURLSessionTask task, NSURLAuthenticationChallenge challenge, @Block VoidBlock2<NSURLSessionAuthChallengeDisposition, NSURLCredential> completionHandler) {}
    @NotImplemented("URLSession:task:needNewBodyStream:")
    public void needNewBodyStream(NSURLSession session, NSURLSessionTask task, @Block VoidBlock1<NSInputStream> completionHandler) {}
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("URLSession:task:needNewBodyStreamFromOffset:completionHandler:")
    public void needNewBodyStream(NSURLSession session, NSURLSessionTask task, long offset, @Block VoidBlock1<NSInputStream> completionHandler) {}
    @NotImplemented("URLSession:task:didSendBodyData:totalBytesSent:totalBytesExpectedToSend:")
    public void didSendBodyData(NSURLSession session, NSURLSessionTask task, long bytesSent, long totalBytesSent, long totalBytesExpectedToSend) {}
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("URLSession:task:didReceiveInformationalResponse:")
    public void didReceiveInformationalResponse(NSURLSession session, NSURLSessionTask task, NSHTTPURLResponse response) {}
    /**
     * @since Available in iOS 10.0 and later.
     */
    @NotImplemented("URLSession:task:didFinishCollectingMetrics:")
    public void didFinishCollectingMetrics(NSURLSession session, NSURLSessionTask task, NSURLSessionTaskMetrics metrics) {}
    @NotImplemented("URLSession:task:didCompleteWithError:")
    public void didComplete(NSURLSession session, NSURLSessionTask task, NSError error) {}
    /*</methods>*/
}
