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
package org.robovm.apple.photos;

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
import org.robovm.apple.corelocation.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.imageio.*;
import org.robovm.apple.uniformtypeid.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 26.1 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Photos") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PHAssetResourceUploadJob/*</name>*/ 
    extends /*<extends>*/PHObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PHAssetResourceUploadJobPtr extends Ptr<PHAssetResourceUploadJob, PHAssetResourceUploadJobPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PHAssetResourceUploadJob.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PHAssetResourceUploadJob() {}
    protected PHAssetResourceUploadJob(Handle h, long handle) { super(h, handle); }
    protected PHAssetResourceUploadJob(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "jobLimit")
    public static native @MachineSizedSInt long getJobLimit();
    @Property(selector = "resource")
    public native PHAssetResource getResource();
    @Property(selector = "destination")
    public native NSURLRequest getDestination();
    @Property(selector = "state")
    public native PHAssetResourceUploadJobState getState();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "fetchJobsWithAction:options:")
    public static native PHFetchResult<PHAssetResourceUploadJob> fetchJobs(PHAssetResourceUploadJobAction action, PHFetchOptions options);
    /*</methods>*/
}
