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
package org.robovm.apple.callkit;

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
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CallKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CXProviderConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CXProviderConfigurationPtr extends Ptr<CXProviderConfiguration, CXProviderConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CXProviderConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CXProviderConfiguration() {}
    protected CXProviderConfiguration(Handle h, long handle) { super(h, handle); }
    protected CXProviderConfiguration(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithLocalizedName:")
    public CXProviderConfiguration(String localizedName) { super((SkipInit) null); initObject(init(localizedName)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "localizedName")
    public native String getLocalizedName();
    @Property(selector = "ringtoneSound")
    public native String getRingtoneSound();
    @Property(selector = "setRingtoneSound:")
    public native void setRingtoneSound(String v);
    @Property(selector = "iconTemplateImageData")
    public native NSData getIconTemplateImageData();
    @Property(selector = "setIconTemplateImageData:")
    public native void setIconTemplateImageData(NSData v);
    @Property(selector = "maximumCallGroups")
    public native @MachineSizedUInt long getMaximumCallGroups();
    @Property(selector = "setMaximumCallGroups:")
    public native void setMaximumCallGroups(@MachineSizedUInt long v);
    @Property(selector = "maximumCallsPerCallGroup")
    public native @MachineSizedUInt long getMaximumCallsPerCallGroup();
    @Property(selector = "setMaximumCallsPerCallGroup:")
    public native void setMaximumCallsPerCallGroup(@MachineSizedUInt long v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "includesCallsInRecents")
    public native boolean includesCallsInRecents();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setIncludesCallsInRecents:")
    public native void setIncludesCallsInRecents(boolean v);
    @Property(selector = "supportsVideo")
    public native boolean supportsVideo();
    @Property(selector = "setSupportsVideo:")
    public native void setSupportsVideo(boolean v);
    @Property(selector = "supportedHandleTypes")
    public native NSSet<NSNumber> getSupportedHandleTypes();
    @Property(selector = "setSupportedHandleTypes:")
    public native void setSupportedHandleTypes(NSSet<NSNumber> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithLocalizedName:")
    protected native @Pointer long init(String localizedName);
    /*</methods>*/
}
