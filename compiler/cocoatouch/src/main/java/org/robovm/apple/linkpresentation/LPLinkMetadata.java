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
package org.robovm.apple.linkpresentation;

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
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("LinkPresentation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/LPLinkMetadata/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class LPLinkMetadataPtr extends Ptr<LPLinkMetadata, LPLinkMetadataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(LPLinkMetadata.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public LPLinkMetadata() {}
    protected LPLinkMetadata(Handle h, long handle) { super(h, handle); }
    protected LPLinkMetadata(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public LPLinkMetadata(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "originalURL")
    public native NSURL getOriginalURL();
    @Property(selector = "setOriginalURL:")
    public native void setOriginalURL(NSURL v);
    @Property(selector = "URL")
    public native NSURL getURL();
    @Property(selector = "setURL:")
    public native void setURL(NSURL v);
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    @Property(selector = "iconProvider")
    public native NSItemProvider getIconProvider();
    @Property(selector = "setIconProvider:")
    public native void setIconProvider(NSItemProvider v);
    @Property(selector = "imageProvider")
    public native NSItemProvider getImageProvider();
    @Property(selector = "setImageProvider:")
    public native void setImageProvider(NSItemProvider v);
    @Property(selector = "videoProvider")
    public native NSItemProvider getVideoProvider();
    @Property(selector = "setVideoProvider:")
    public native void setVideoProvider(NSItemProvider v);
    @Property(selector = "remoteVideoURL")
    public native NSURL getRemoteVideoURL();
    @Property(selector = "setRemoteVideoURL:")
    public native void setRemoteVideoURL(NSURL v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
