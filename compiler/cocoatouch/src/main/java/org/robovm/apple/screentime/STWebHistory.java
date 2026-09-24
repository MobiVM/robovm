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
package org.robovm.apple.screentime;

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
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ScreenTime") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/STWebHistory/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class STWebHistoryPtr extends Ptr<STWebHistory, STWebHistoryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(STWebHistory.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public STWebHistory() {}
    protected STWebHistory(Handle h, long handle) { super(h, handle); }
    protected STWebHistory(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "initWithBundleIdentifier:profileIdentifier:error:")
    public STWebHistory(String bundleIdentifier, String profileIdentifier) throws NSErrorException {
       super((SkipInit) null);
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       long handle = init(bundleIdentifier, profileIdentifier, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       initObject(handle);
    }
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "initWithProfileIdentifier:")
    public static STWebHistory createWithProfileIdentifier(String profileIdentifier) {
       STWebHistory res = new STWebHistory((SkipInit) null);
       res.initObject(res.initWithProfileIdentifier(profileIdentifier));
       return res;
    }
    @Method(selector = "initWithBundleIdentifier:error:")
    public STWebHistory(String bundleIdentifier) throws NSErrorException {
       super((SkipInit) null);
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       long handle = init(bundleIdentifier, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       initObject(handle);
    }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "initWithBundleIdentifier:profileIdentifier:error:")
    private native @Pointer long init(String bundleIdentifier, String profileIdentifier, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "initWithProfileIdentifier:")
    protected native @Pointer long initWithProfileIdentifier(String profileIdentifier);
    @Method(selector = "initWithBundleIdentifier:error:")
    private native @Pointer long init(String bundleIdentifier, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "fetchHistoryDuringInterval:completionHandler:")
    public native void fetchHistoryDuringInterval(NSDateInterval interval, @Block VoidBlock2<NSSet<NSURL>, NSError> completionHandler);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "fetchAllHistoryWithCompletionHandler:")
    public native void fetchAllHistory(@Block VoidBlock2<NSSet<NSURL>, NSError> completionHandler);
    @Method(selector = "deleteHistoryForURL:")
    public native void deleteHistoryForURL(NSURL url);
    @Method(selector = "deleteHistoryDuringInterval:")
    public native void deleteHistoryDuringInterval(NSDateInterval interval);
    @Method(selector = "deleteAllHistory")
    public native void deleteAllHistory();
    /*</methods>*/
}
