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
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSURLSession/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSURLSessionPtr extends Ptr<NSURLSession, NSURLSessionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSURLSession.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSURLSession() {}
    @Deprecated protected NSURLSession(long handle) { super(handle); }
    protected NSURLSession(Handle h, long handle) { super(h, handle); }
    protected NSURLSession(SkipInit skipInit) { super(skipInit); }
    public NSURLSession(NSURLSessionConfiguration configuration) { super((Handle) null, create(configuration)); retain(getHandle()); }
    public NSURLSession(NSURLSessionConfiguration configuration, NSURLSessionDelegate delegate, NSOperationQueue queue) { super((Handle) null, create(configuration, delegate, queue)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sharedSession")
    public static native NSURLSession getSharedSession();
    @Property(selector = "delegateQueue")
    public native NSOperationQueue getDelegateQueue();
    @Property(selector = "delegate")
    public native NSURLSessionDelegate getDelegate();
    @Property(selector = "configuration")
    public native NSURLSessionConfiguration getConfiguration();
    @Property(selector = "sessionDescription")
    public native String getSessionDescription();
    @Property(selector = "setSessionDescription:")
    public native void setSessionDescription(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="NSURLSessionTransferSizeUnknown", optional=true)
    public static native long getTransferSizeUnknown();
    
    @Method(selector = "finishTasksAndInvalidate")
    public native void finishTasksAndInvalidate();
    @Method(selector = "invalidateAndCancel")
    public native void invalidateAndCancel();
    @Method(selector = "resetWithCompletionHandler:")
    public native void reset(@Block Runnable completionHandler);
    @Method(selector = "flushWithCompletionHandler:")
    public native void flush(@Block Runnable completionHandler);
    @Method(selector = "getTasksWithCompletionHandler:")
    public native void getTasks(@Block VoidBlock3<NSArray<NSURLSessionDataTask>, NSArray<NSURLSessionUploadTask>, NSArray<NSURLSessionDownloadTask>> completionHandler);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "getAllTasksWithCompletionHandler:")
    public native void getAllTasks(@Block VoidBlock1<NSArray<NSURLSessionTask>> completionHandler);
    @Method(selector = "dataTaskWithRequest:")
    public native NSURLSessionDataTask newDataTask(NSURLRequest request);
    @Method(selector = "dataTaskWithURL:")
    public native NSURLSessionDataTask newDataTask(NSURL url);
    @Method(selector = "uploadTaskWithRequest:fromFile:")
    public native NSURLSessionUploadTask newUploadTask(NSURLRequest request, NSURL fileURL);
    @Method(selector = "uploadTaskWithRequest:fromData:")
    public native NSURLSessionUploadTask newUploadTask(NSURLRequest request, NSData bodyData);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "uploadTaskWithResumeData:")
    public native NSURLSessionUploadTask newUploadTask(NSData resumeData);
    @Method(selector = "uploadTaskWithStreamedRequest:")
    public native NSURLSessionUploadTask newStreamedUploadTask(NSURLRequest request);
    @Method(selector = "downloadTaskWithRequest:")
    public native NSURLSessionDownloadTask newDownloadTask(NSURLRequest request);
    @Method(selector = "downloadTaskWithURL:")
    public native NSURLSessionDownloadTask newDownloadTask(NSURL url);
    @Method(selector = "downloadTaskWithResumeData:")
    public native NSURLSessionDownloadTask newDownloadTask(NSData resumeData);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "streamTaskWithHostName:port:")
    public native NSURLSessionStreamTask newStreamTask(String hostname, @MachineSizedSInt long port);
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Use nw_connection_t in Network framework instead
     */
    @Deprecated
    @Method(selector = "streamTaskWithNetService:")
    public native NSURLSessionStreamTask newStreamTask(NSNetService service);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "webSocketTaskWithURL:")
    public native NSURLSessionWebSocketTask newWebSocket(NSURL url);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "webSocketTaskWithURL:protocols:")
    public native NSURLSessionWebSocketTask newWebSocket(NSURL url, NSArray<NSString> protocols);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "webSocketTaskWithRequest:")
    public native NSURLSessionWebSocketTask newWebSocket(NSURLRequest request);
    @Method(selector = "sessionWithConfiguration:")
    protected static native @Pointer long create(NSURLSessionConfiguration configuration);
    @Method(selector = "sessionWithConfiguration:delegate:delegateQueue:")
    protected static native @Pointer long create(NSURLSessionConfiguration configuration, NSURLSessionDelegate delegate, NSOperationQueue queue);
    @Method(selector = "dataTaskWithRequest:completionHandler:")
    public native NSURLSessionDataTask newDataTask(NSURLRequest request, @Block VoidBlock3<NSData, NSURLResponse, NSError> completionHandler);
    @Method(selector = "dataTaskWithURL:completionHandler:")
    public native NSURLSessionDataTask newDataTask(NSURL url, @Block VoidBlock3<NSData, NSURLResponse, NSError> completionHandler);
    @Method(selector = "uploadTaskWithRequest:fromFile:completionHandler:")
    public native NSURLSessionUploadTask newUploadTask(NSURLRequest request, NSURL fileURL, @Block VoidBlock3<NSData, NSURLResponse, NSError> completionHandler);
    @Method(selector = "uploadTaskWithRequest:fromData:completionHandler:")
    public native NSURLSessionUploadTask newUploadTask(NSURLRequest request, NSData bodyData, @Block VoidBlock3<NSData, NSURLResponse, NSError> completionHandler);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "uploadTaskWithResumeData:completionHandler:")
    public native NSURLSessionUploadTask newUploadTask(NSData resumeData, @Block VoidBlock3<NSData, NSURLResponse, NSError> completionHandler);
    @Method(selector = "downloadTaskWithRequest:completionHandler:")
    public native NSURLSessionDownloadTask newDownloadTask(NSURLRequest request, @Block VoidBlock3<NSURL, NSURLResponse, NSError> completionHandler);
    @Method(selector = "downloadTaskWithURL:completionHandler:")
    public native NSURLSessionDownloadTask newDownloadTask(NSURL url, @Block VoidBlock3<NSURL, NSURLResponse, NSError> completionHandler);
    @Method(selector = "downloadTaskWithResumeData:completionHandler:")
    public native NSURLSessionDownloadTask newDownloadTask(NSData resumeData, @Block VoidBlock3<NSURL, NSURLResponse, NSError> completionHandler);
    /*</methods>*/
}
