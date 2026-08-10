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
package org.robovm.apple.colorsync;

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
import org.robovm.apple.corefoundation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("ColorSync")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ColorSyncProfile/*</name>*/ 
    extends /*<extends>*/CFType/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ColorSyncProfilePtr extends Ptr<ColorSyncProfile, ColorSyncProfilePtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(ColorSyncProfile.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ColorSyncProfile() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Bridge(symbol="ColorSyncProfileGetTypeID", optional=true)
    public static native @MachineSizedUInt long typeId();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Bridge(symbol="ColorSyncProfileCreate", optional=true)
    public static native ColorSyncProfile create(CFData data, CFError.CFErrorPtr error);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Bridge(symbol="ColorSyncProfileCreateWithURL", optional=true)
    public static native ColorSyncProfile createWithURL(CFURL url, CFError.CFErrorPtr error);
    /**
     * @since Available in iOS 26.1 and later.
     */
    @Bridge(symbol="ColorSyncProfileCreateWithURLAndOptions", optional=true)
    public static native ColorSyncProfile createWithURLAndOptions(CFURL url, CFDictionary options, CFError.CFErrorPtr error);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Bridge(symbol="ColorSyncProfileCreateWithName", optional=true)
    public static native ColorSyncProfile createWithName(CFString name);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Bridge(symbol="ColorSyncProfileCreateMutable", optional=true)
    public static native ColorSyncMutableProfile createMutable();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Bridge(symbol="ColorSyncProfileCreateMutableCopy", optional=true)
    public native ColorSyncMutableProfile createMutableCopy();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Bridge(symbol="ColorSyncProfileCreateLink", optional=true)
    public static native ColorSyncProfile createLink(CFArray profileInfo, CFDictionary options);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Bridge(symbol="ColorSyncProfileVerify", optional=true)
    public native boolean verify(CFError.CFErrorPtr errors, CFError.CFErrorPtr warnings);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Bridge(symbol="ColorSyncProfileIsWideGamut", optional=true)
    public native boolean isWideGamut();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Bridge(symbol="ColorSyncProfileIsMatrixBased", optional=true)
    public native boolean isMatrixBased();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Bridge(symbol="ColorSyncProfileIsPQBased", optional=true)
    public native boolean isPQBased();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Bridge(symbol="ColorSyncProfileIsHLGBased", optional=true)
    public native boolean isHLGBased();
    /**
     * @since Available in iOS 26.1 and later.
     */
    @Bridge(symbol="ColorSyncProfileEstimateGamma", optional=true)
    public native float estimateGamma(CFError.CFErrorPtr error);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Bridge(symbol="ColorSyncProfileGetMD5", optional=true)
    public native @ByVal ColorSyncMD5 getMD5();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Bridge(symbol="ColorSyncProfileCopyData", optional=true)
    public native CFData copyData(CFError.CFErrorPtr error);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Bridge(symbol="ColorSyncProfileGetURL", optional=true)
    public native CFURL getURL(CFError.CFErrorPtr error);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Bridge(symbol="ColorSyncProfileCopyHeader", optional=true)
    public native CFData copyHeader();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Bridge(symbol="ColorSyncProfileSetHeader", optional=true)
    public static native void setHeader(ColorSyncMutableProfile prof, CFData header);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Bridge(symbol="ColorSyncProfileCopyDescriptionString", optional=true)
    public native CFString copyDescriptionString();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Bridge(symbol="ColorSyncProfileCopyTagSignatures", optional=true)
    public native CFArray copyTagSignatures();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Bridge(symbol="ColorSyncProfileContainsTag", optional=true)
    public native boolean containsTag(CFString signature);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Bridge(symbol="ColorSyncProfileCopyTag", optional=true)
    public native CFData copyTag(CFString signature);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Bridge(symbol="ColorSyncProfileSetTag", optional=true)
    public static native void setTag(ColorSyncMutableProfile prof, CFString signature, CFData data);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Bridge(symbol="ColorSyncProfileRemoveTag", optional=true)
    public static native void removeTag(ColorSyncMutableProfile prof, CFString signature);
    /*</methods>*/
}
