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
package org.robovm.apple.quicklookthumbnailing;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("QuickLookThumbnailing") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/QLThumbnailGenerationRequest/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class QLThumbnailGenerationRequestPtr extends Ptr<QLThumbnailGenerationRequest, QLThumbnailGenerationRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(QLThumbnailGenerationRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected QLThumbnailGenerationRequest() {}
    protected QLThumbnailGenerationRequest(Handle h, long handle) { super(h, handle); }
    protected QLThumbnailGenerationRequest(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFileAtURL:size:scale:representationTypes:")
    public QLThumbnailGenerationRequest(NSURL url, @ByVal CGSize size, @MachineSizedFloat double scale, QLThumbnailGenerationRequestRepresentationTypes representationTypes) { super((SkipInit) null); initObject(init(url, size, scale, representationTypes)); }
    @Method(selector = "initWithCoder:")
    public QLThumbnailGenerationRequest(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "minimumDimension")
    public native @MachineSizedFloat double getMinimumDimension();
    @Property(selector = "setMinimumDimension:")
    public native void setMinimumDimension(@MachineSizedFloat double v);
    @Property(selector = "iconMode")
    public native boolean isIconMode();
    @Property(selector = "setIconMode:")
    public native void setIconMode(boolean v);
    @Property(selector = "size")
    public native @ByVal CGSize getSize();
    @Property(selector = "scale")
    public native @MachineSizedFloat double getScale();
    @Property(selector = "representationTypes")
    public native QLThumbnailGenerationRequestRepresentationTypes getRepresentationTypes();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithFileAtURL:size:scale:representationTypes:")
    protected native @Pointer long init(NSURL url, @ByVal CGSize size, @MachineSizedFloat double scale, QLThumbnailGenerationRequestRepresentationTypes representationTypes);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
