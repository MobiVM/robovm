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
package org.robovm.apple.browserenginekit;

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
import org.robovm.apple.uniformtypeid.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 18.2 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("BrowserEngineKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BEDownloadMonitor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class BEDownloadMonitorPtr extends Ptr<BEDownloadMonitor, BEDownloadMonitorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BEDownloadMonitor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected BEDownloadMonitor() {}
    protected BEDownloadMonitor(Handle h, long handle) { super(h, handle); }
    protected BEDownloadMonitor(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSourceURL:destinationURL:observedProgress:liveActivityAccessToken:")
    public BEDownloadMonitor(NSURL sourceURL, NSURL destinationURL, NSProgress observedProgress, NSData liveActivityAccessToken) { super((SkipInit) null); initObject(init(sourceURL, destinationURL, observedProgress, liveActivityAccessToken)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "identifier")
    public native NSUUID getIdentifier();
    @Property(selector = "sourceURL")
    public native NSURL getSourceURL();
    @Property(selector = "destinationURL")
    public native NSURL getDestinationURL();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSourceURL:destinationURL:observedProgress:liveActivityAccessToken:")
    protected native @Pointer long init(NSURL sourceURL, NSURL destinationURL, NSProgress observedProgress, NSData liveActivityAccessToken);
    @Method(selector = "useDownloadsFolderWithPlaceholderType:finalFileCreatedHandler:")
    public native void useDownloadsFolder(UTType type, @Block VoidBlock1<BEDownloadMonitorLocation> finalFileCreatedHandler);
    @Method(selector = "beginMonitoring:")
    public native void beginMonitoring(@Block VoidBlock2<BEDownloadMonitorLocation, NSError> completion);
    @Method(selector = "resumeMonitoring:completionHandler:")
    public native void resumeMonitoring(NSURL url, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "createAccessToken")
    public static native NSData createAccessToken();
    /*</methods>*/
}
