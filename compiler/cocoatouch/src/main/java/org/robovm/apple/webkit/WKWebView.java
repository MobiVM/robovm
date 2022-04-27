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
/*<annotations>*/@Library("WebKit") @NativeClass @WeaklyLinked/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/WKWebView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class WKWebViewPtr extends Ptr<WKWebView, WKWebViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(WKWebView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public WKWebView() {}
    protected WKWebView(Handle h, long handle) { super(h, handle); }
    protected WKWebView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:configuration:")
    public WKWebView(@ByVal CGRect frame, WKWebViewConfiguration configuration) { super((SkipInit) null); initObject(init(frame, configuration)); }
    @Method(selector = "initWithCoder:")
    public WKWebView(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    @Method(selector = "initWithFrame:")
    public WKWebView(@ByVal CGRect frame) { super(frame); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "configuration")
    public native WKWebViewConfiguration getConfiguration();
    @Property(selector = "navigationDelegate")
    public native WKNavigationDelegate getNavigationDelegate();
    @Property(selector = "setNavigationDelegate:", strongRef = true)
    public native void setNavigationDelegate(WKNavigationDelegate v);
    @Property(selector = "UIDelegate")
    public native WKUIDelegate getUIDelegate();
    @Property(selector = "setUIDelegate:", strongRef = true)
    public native void setUIDelegate(WKUIDelegate v);
    @Property(selector = "backForwardList")
    public native WKBackForwardList getBackForwardList();
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "URL")
    public native NSURL getURL();
    @Property(selector = "isLoading")
    public native boolean isLoading();
    @Property(selector = "estimatedProgress")
    public native double getEstimatedProgress();
    @Property(selector = "hasOnlySecureContent")
    public native boolean hasOnlySecureContent();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "serverTrust")
    public native SecTrust getServerTrust();
    @Property(selector = "canGoBack")
    public native boolean canGoBack();
    @Property(selector = "canGoForward")
    public native boolean canGoForward();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "cameraCaptureState")
    public native WKMediaCaptureState getCameraCaptureState();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "microphoneCaptureState")
    public native WKMediaCaptureState getMicrophoneCaptureState();
    @Property(selector = "allowsBackForwardNavigationGestures")
    public native boolean allowsBackForwardNavigationGestures();
    @Property(selector = "setAllowsBackForwardNavigationGestures:")
    public native void setAllowsBackForwardNavigationGestures(boolean v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "customUserAgent")
    public native String getCustomUserAgent();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setCustomUserAgent:")
    public native void setCustomUserAgent(String v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "allowsLinkPreview")
    public native boolean allowsLinkPreview();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setAllowsLinkPreview:")
    public native void setAllowsLinkPreview(boolean v);
    @Property(selector = "scrollView")
    public native UIScrollView getScrollView();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "pageZoom")
    public native @MachineSizedFloat double getPageZoom();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setPageZoom:")
    public native void setPageZoom(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "mediaType")
    public native String getMediaType();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setMediaType:")
    public native void setMediaType(String v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "interactionState")
    public native NSObject getInteractionState();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setInteractionState:")
    public native void setInteractionState(NSObject v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "themeColor")
    public native UIColor getThemeColor();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "underPageBackgroundColor")
    public native UIColor getUnderPageBackgroundColor();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setUnderPageBackgroundColor:")
    public native void setUnderPageBackgroundColor(UIColor v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "fullscreenState")
    public native WKFullscreenState getFullscreenState();
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 10.0. Use serverTrust
     */
    @Deprecated
    @Property(selector = "certificateChain")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsListMarshaler.class) List<SecCertificate> getCertificateChain();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithFrame:configuration:")
    protected native @Pointer long init(@ByVal CGRect frame, WKWebViewConfiguration configuration);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    @Method(selector = "loadRequest:")
    public native WKNavigation loadRequest(NSURLRequest request);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "loadFileURL:allowingReadAccessToURL:")
    public native WKNavigation loadFileURL(NSURL URL, NSURL readAccessURL);
    @Method(selector = "loadHTMLString:baseURL:")
    public native WKNavigation loadHTMLString(String string, NSURL baseURL);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "loadData:MIMEType:characterEncodingName:baseURL:")
    public native WKNavigation loadData(NSData data, String MIMEType, String characterEncodingName, NSURL baseURL);
    @Method(selector = "goToBackForwardListItem:")
    public native WKNavigation goToBackForwardListItem(WKBackForwardListItem item);
    @Method(selector = "goBack")
    public native WKNavigation goBack();
    @Method(selector = "goForward")
    public native WKNavigation goForward();
    @Method(selector = "reload")
    public native WKNavigation reload();
    @Method(selector = "reloadFromOrigin")
    public native WKNavigation reloadFromOrigin();
    @Method(selector = "stopLoading")
    public native void stopLoading();
    @Method(selector = "evaluateJavaScript:completionHandler:")
    public native void evaluateJavaScript(String javaScriptString, @Block VoidBlock2<NSObject, NSError> completionHandler);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "evaluateJavaScript:inFrame:inContentWorld:completionHandler:")
    public native void evaluateJavaScript(String javaScriptString, WKFrameInfo frame, WKContentWorld contentWorld, @Block VoidBlock2<NSObject, NSError> completionHandler);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "callAsyncJavaScript:arguments:inFrame:inContentWorld:completionHandler:")
    public native void callAsyncJavaScript(String functionBody, NSDictionary<NSString, ?> arguments, WKFrameInfo frame, WKContentWorld contentWorld, @Block VoidBlock2<NSObject, NSError> completionHandler);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "closeAllMediaPresentationsWithCompletionHandler:")
    public native void closeAllMediaPresentations(@Block Runnable completionHandler);
    /**
     * @since Available in iOS 14.5 and later.
     * @deprecated Deprecated in iOS 15.0. Use closeAllMediaPresentationsWithCompletionHandler:
     */
    @Deprecated
    @Method(selector = "closeAllMediaPresentations")
    public native void closeAllMediaPresentations();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "pauseAllMediaPlaybackWithCompletionHandler:")
    public native void pauseAllMediaPlayback(@Block Runnable completionHandler);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "setAllMediaPlaybackSuspended:completionHandler:")
    public native void setAllMediaPlaybackSuspended(boolean suspended, @Block Runnable completionHandler);
    /**
     * @since Available in iOS 14.5 and later.
     * @deprecated Deprecated in iOS 15.0. Use setAllMediaPlaybackSuspended:completionHandler:
     */
    @Deprecated
    @Method(selector = "resumeAllMediaPlayback:")
    public native void resumeAllMediaPlayback(@Block Runnable completionHandler);
    /**
     * @since Available in iOS 14.5 and later.
     * @deprecated Deprecated in iOS 15.0. Use setAllMediaPlaybackSuspended:completionHandler:
     */
    @Deprecated
    @Method(selector = "suspendAllMediaPlayback:")
    public native void suspendAllMediaPlayback(@Block Runnable completionHandler);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "requestMediaPlaybackStateWithCompletionHandler:")
    public native void requestMediaPlaybackState(@Block VoidBlock1<WKMediaPlaybackState> completionHandler);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "setCameraCaptureState:completionHandler:")
    public native void setCameraCaptureState(WKMediaCaptureState state, @Block Runnable completionHandler);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "setMicrophoneCaptureState:completionHandler:")
    public native void setMicrophoneCaptureState(WKMediaCaptureState state, @Block Runnable completionHandler);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "takeSnapshotWithConfiguration:completionHandler:")
    public native void takeSnapshot(WKSnapshotConfiguration snapshotConfiguration, @Block VoidBlock2<UIImage, NSError> completionHandler);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "createPDFWithConfiguration:completionHandler:")
    public native void createPDF(WKPDFConfiguration pdfConfiguration, @Block VoidBlock2<NSData, NSError> completionHandler);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "createWebArchiveDataWithCompletionHandler:")
    public native void createWebArchiveData(@Block VoidBlock2<NSData, NSError> completionHandler);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "findString:withConfiguration:completionHandler:")
    public native void findString(String string, WKFindConfiguration configuration, @Block VoidBlock1<WKFindResult> completionHandler);
    /**
     * @since Available in iOS 14.5 and later.
     */
    @Method(selector = "startDownloadUsingRequest:completionHandler:")
    public native void startDownload(NSURLRequest request, @Block VoidBlock1<WKDownload> completionHandler);
    /**
     * @since Available in iOS 14.5 and later.
     */
    @Method(selector = "resumeDownloadFromResumeData:completionHandler:")
    public native void resumeDownload(NSData resumeData, @Block VoidBlock1<WKDownload> completionHandler);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "loadSimulatedRequest:response:responseData:")
    public native WKNavigation loadSimulatedRequest(NSURLRequest request, NSURLResponse response, NSData data);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "loadFileRequest:allowingReadAccessToURL:")
    public native WKNavigation loadFileRequest(NSURLRequest request, NSURL readAccessURL);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "loadSimulatedRequest:responseHTMLString:")
    public native WKNavigation loadSimulatedRequest(NSURLRequest request, String string);
    /**
     * @since Available in iOS 15.0 and later.
     * @deprecated Deprecated in iOS 15.0. Use loadSimulatedRequest:responseHTMLString:
     */
    @Deprecated
    @Method(selector = "loadSimulatedRequest:withResponseHTMLString:")
    public native WKNavigation loadSimulatedReques(NSURLRequest request, String string);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "handlesURLScheme:")
    public static native boolean handlesURLScheme(String urlScheme);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute attribute);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:relativeToLayoutDirection:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute semanticContentAttribute, UIUserInterfaceLayoutDirection layoutDirection);
    /*</methods>*/
}
