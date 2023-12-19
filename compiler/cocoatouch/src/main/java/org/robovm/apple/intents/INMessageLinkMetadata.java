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
package org.robovm.apple.intents;

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
import org.robovm.apple.eventkit.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INMessageLinkMetadata/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class INMessageLinkMetadataPtr extends Ptr<INMessageLinkMetadata, INMessageLinkMetadataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INMessageLinkMetadata.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public INMessageLinkMetadata() {}
    protected INMessageLinkMetadata(Handle h, long handle) { super(h, handle); }
    protected INMessageLinkMetadata(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSiteName:summary:title:openGraphType:linkURL:")
    public INMessageLinkMetadata(String siteName, String summary, String title, String openGraphType, NSURL linkURL) { super((SkipInit) null); initObject(init(siteName, summary, title, openGraphType, linkURL)); }
    @Method(selector = "initWithCoder:")
    public INMessageLinkMetadata(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "siteName")
    public native String getSiteName();
    @Property(selector = "setSiteName:")
    public native void setSiteName(String v);
    @Property(selector = "summary")
    public native String getSummary();
    @Property(selector = "setSummary:")
    public native void setSummary(String v);
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    @Property(selector = "openGraphType")
    public native String getOpenGraphType();
    @Property(selector = "setOpenGraphType:")
    public native void setOpenGraphType(String v);
    @Property(selector = "linkURL")
    public native NSURL getLinkURL();
    @Property(selector = "setLinkURL:")
    public native void setLinkURL(NSURL v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSiteName:summary:title:openGraphType:linkURL:")
    protected native @Pointer long init(String siteName, String summary, String title, String openGraphType, NSURL linkURL);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
