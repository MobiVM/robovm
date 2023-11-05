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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BADownload/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSCoding, NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class BADownloadPtr extends Ptr<BADownload, BADownloadPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BADownload.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected BADownload() {}
    protected BADownload(Handle h, long handle) { super(h, handle); }
    protected BADownload(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public BADownload(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "state")
    public native BADownloadState getState();
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "identifier")
    public native String getIdentifier();
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "uniqueIdentifier")
    public native String getUniqueIdentifier();
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "priority")
    public native @MachineSizedSInt long getPriority();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "isEssential")
    public native boolean isEssential();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Library("BackgroundAssets")
    public static class Priority {
        static { Bro.bind(Priority.class); }

        /**
         * @since Available in iOS 16.1 and later.
         */
        @GlobalValue(symbol="BADownloaderPriorityMin", optional=true)
        public static native @MachineSizedSInt long Min();
        /**
         * @since Available in iOS 16.1 and later.
         */
        @GlobalValue(symbol="BADownloaderPriorityDefault", optional=true)
        public static native @MachineSizedSInt long Default();
        /**
         * @since Available in iOS 16.1 and later.
         */
        @GlobalValue(symbol="BADownloaderPriorityMax", optional=true)
        public static native @MachineSizedSInt long Max();
    }
    
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "copyAsNonEssential")
    public native BADownload copyAsNonEssential();
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
