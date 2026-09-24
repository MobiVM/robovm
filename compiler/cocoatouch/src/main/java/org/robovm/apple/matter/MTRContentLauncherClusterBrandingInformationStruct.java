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
package org.robovm.apple.matter;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.security.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 16.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Matter") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRContentLauncherClusterBrandingInformationStruct/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRContentLauncherClusterBrandingInformationStructPtr extends Ptr<MTRContentLauncherClusterBrandingInformationStruct, MTRContentLauncherClusterBrandingInformationStructPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRContentLauncherClusterBrandingInformationStruct.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTRContentLauncherClusterBrandingInformationStruct() {}
    protected MTRContentLauncherClusterBrandingInformationStruct(Handle h, long handle) { super(h, handle); }
    protected MTRContentLauncherClusterBrandingInformationStruct(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "providerName")
    public native String getProviderName();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setProviderName:")
    public native void setProviderName(String v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "background")
    public native MTRContentLauncherClusterStyleInformationStruct getBackground();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setBackground:")
    public native void setBackground(MTRContentLauncherClusterStyleInformationStruct v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "logo")
    public native MTRContentLauncherClusterStyleInformationStruct getLogo();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setLogo:")
    public native void setLogo(MTRContentLauncherClusterStyleInformationStruct v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "progressBar")
    public native MTRContentLauncherClusterStyleInformationStruct getProgressBar();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setProgressBar:")
    public native void setProgressBar(MTRContentLauncherClusterStyleInformationStruct v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "splash")
    public native MTRContentLauncherClusterStyleInformationStruct getSplash();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setSplash:")
    public native void setSplash(MTRContentLauncherClusterStyleInformationStruct v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "waterMark")
    public native MTRContentLauncherClusterStyleInformationStruct getWaterMark();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setWaterMark:")
    public native void setWaterMark(MTRContentLauncherClusterStyleInformationStruct v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
