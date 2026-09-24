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
/*<annotations>*/@Library("BackgroundAssets") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BADownloadManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class BADownloadManagerPtr extends Ptr<BADownloadManager, BADownloadManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BADownloadManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected BADownloadManager() {}
    protected BADownloadManager(Handle h, long handle) { super(h, handle); }
    protected BADownloadManager(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "sharedManager")
    public static native BADownloadManager getSharedManager();
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "delegate")
    public native BADownloadManagerDelegate getDelegate();
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(BADownloadManagerDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "fetchCurrentDownloads:")
    public native NSArray<BADownload> fetchCurrentDownloads(NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "fetchCurrentDownloadsWithCompletionHandler:")
    public native void fetchCurrentDownloads(@Block VoidBlock2<NSArray<BADownload>, NSError> completionHandler);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public boolean scheduleDownload(BADownload download) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = scheduleDownload(download, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "scheduleDownload:error:")
    private native boolean scheduleDownload(BADownload download, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "performWithExclusiveControl:")
    public native void performWithExclusiveControl(@Block VoidBlock2<Boolean, NSError> performHandler);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "performWithExclusiveControlBeforeDate:performHandler:")
    public native void performWithExclusiveControl(NSDate date, @Block VoidBlock2<Boolean, NSError> performHandler);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public boolean startForegroundDownload(BADownload download) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = startForegroundDownload(download, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "startForegroundDownload:error:")
    private native boolean startForegroundDownload(BADownload download, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public boolean cancelDownload(BADownload download) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = cancelDownload(download, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "cancelDownload:error:")
    private native boolean cancelDownload(BADownload download, NSError.NSErrorPtr error);
    /*</methods>*/
}
