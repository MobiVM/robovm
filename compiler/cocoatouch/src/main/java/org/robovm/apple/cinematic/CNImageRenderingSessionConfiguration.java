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
package org.robovm.apple.cinematic;

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
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 27.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Cinematic") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CNImageRenderingSessionConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CNImageRenderingSessionConfigurationPtr extends Ptr<CNImageRenderingSessionConfiguration, CNImageRenderingSessionConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CNImageRenderingSessionConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CNImageRenderingSessionConfiguration() {}
    protected CNImageRenderingSessionConfiguration(Handle h, long handle) { super(h, handle); }
    protected CNImageRenderingSessionConfiguration(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithQuality:")
    public CNImageRenderingSessionConfiguration(CNRenderingQuality quality) { super((SkipInit) null); initObject(init(quality)); }
    @Method(selector = "initWithQuality:renderingVersion:")
    public CNImageRenderingSessionConfiguration(CNRenderingQuality quality, @MachineSizedSInt long renderingVersion) { super((SkipInit) null); initObject(init(quality, renderingVersion)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "quality")
    public native CNRenderingQuality getQuality();
    @Property(selector = "renderingVersion")
    public native @MachineSizedSInt long getRenderingVersion();
    @Property(selector = "latestRenderingVersion")
    public static native @MachineSizedSInt long getLatestRenderingVersion();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithQuality:")
    protected native @Pointer long init(CNRenderingQuality quality);
    @Method(selector = "initWithQuality:renderingVersion:")
    protected native @Pointer long init(CNRenderingQuality quality, @MachineSizedSInt long renderingVersion);
    @Method(selector = "isRenderingVersionSupported:")
    public static native boolean isRenderingVersionSupported(@MachineSizedSInt long renderingVersion);
    /*</methods>*/
}
