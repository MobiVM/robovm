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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BAURLDownload/*</name>*/ 
    extends /*<extends>*/BADownload/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class BAURLDownloadPtr extends Ptr<BAURLDownload, BAURLDownloadPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BAURLDownload.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected BAURLDownload() {}
    protected BAURLDownload(Handle h, long handle) { super(h, handle); }
    protected BAURLDownload(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithIdentifier:request:fileSize:applicationGroupIdentifier:")
    public BAURLDownload(String identifier, NSURLRequest request, @MachineSizedUInt long fileSize, String applicationGroupIdentifier) { super((SkipInit) null); initObject(init(identifier, request, fileSize, applicationGroupIdentifier)); }
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithIdentifier:request:essential:fileSize:applicationGroupIdentifier:priority:")
    public BAURLDownload(String identifier, NSURLRequest request, boolean essential, @MachineSizedUInt long fileSize, String applicationGroupIdentifier, @MachineSizedSInt long priority) { super((SkipInit) null); initObject(init(identifier, request, essential, fileSize, applicationGroupIdentifier, priority)); }
    /**
     * @since Available in iOS 16.1 and later.
     * @deprecated Deprecated in iOS 16.4. Use initWithIdentifier:request:fileSize:applicationGroupIdentifier:
     */
    @Deprecated
    @Method(selector = "initWithIdentifier:request:applicationGroupIdentifier:")
    public BAURLDownload(String identifier, NSURLRequest request, String applicationGroupIdentifier) { super((SkipInit) null); initObject(init(identifier, request, applicationGroupIdentifier)); }
    /**
     * @since Available in iOS 16.1 and later.
     * @deprecated Deprecated in iOS 16.4. Use initWithIdentifier:request:essential:fileSize:applicationGroupIdentifier:priority:
     */
    @Deprecated
    @Method(selector = "initWithIdentifier:request:applicationGroupIdentifier:priority:")
    public BAURLDownload(String identifier, NSURLRequest request, String applicationGroupIdentifier, @MachineSizedSInt long priority) { super((SkipInit) null); initObject(init(identifier, request, applicationGroupIdentifier, priority)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithIdentifier:request:fileSize:applicationGroupIdentifier:")
    protected native @Pointer long init(String identifier, NSURLRequest request, @MachineSizedUInt long fileSize, String applicationGroupIdentifier);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithIdentifier:request:essential:fileSize:applicationGroupIdentifier:priority:")
    protected native @Pointer long init(String identifier, NSURLRequest request, boolean essential, @MachineSizedUInt long fileSize, String applicationGroupIdentifier, @MachineSizedSInt long priority);
    /**
     * @since Available in iOS 16.1 and later.
     * @deprecated Deprecated in iOS 16.4. Use initWithIdentifier:request:fileSize:applicationGroupIdentifier:
     */
    @Deprecated
    @Method(selector = "initWithIdentifier:request:applicationGroupIdentifier:")
    protected native @Pointer long init(String identifier, NSURLRequest request, String applicationGroupIdentifier);
    /**
     * @since Available in iOS 16.1 and later.
     * @deprecated Deprecated in iOS 16.4. Use initWithIdentifier:request:essential:fileSize:applicationGroupIdentifier:priority:
     */
    @Deprecated
    @Method(selector = "initWithIdentifier:request:applicationGroupIdentifier:priority:")
    protected native @Pointer long init(String identifier, NSURLRequest request, String applicationGroupIdentifier, @MachineSizedSInt long priority);
    /*</methods>*/
}
