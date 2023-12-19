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
package org.robovm.apple.coreanimation;

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
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.opengles.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.corevideo.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("QuartzCore") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CAEDRMetadata/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CAEDRMetadataPtr extends Ptr<CAEDRMetadata, CAEDRMetadataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CAEDRMetadata.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CAEDRMetadata() {}
    protected CAEDRMetadata(Handle h, long handle) { super(h, handle); }
    protected CAEDRMetadata(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public CAEDRMetadata(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "HLGMetadata")
    public static native CAEDRMetadata getHLGMetadata();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "isAvailable")
    public static native boolean isAvailable();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "HDR10MetadataWithDisplayInfo:contentInfo:opticalOutputScale:")
    public static native CAEDRMetadata createHDR10Metadata(NSData displayData, NSData contentData, float scale);
    @Method(selector = "HDR10MetadataWithMinLuminance:maxLuminance:opticalOutputScale:")
    public static native CAEDRMetadata createHDR10Metadata(float minNits, float maxNits, float scale);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "HLGMetadataWithAmbientViewingEnvironment:")
    public static native CAEDRMetadata createHLGMetadata(NSData data);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
