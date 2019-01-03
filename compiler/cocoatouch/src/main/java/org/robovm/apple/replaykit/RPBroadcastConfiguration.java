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
package org.robovm.apple.replaykit;

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
import org.robovm.apple.coremedia.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 * @deprecated Deprecated in iOS 11.0. No longer supported
 */
@Deprecated
/*</javadoc>*/
/*<annotations>*/@Library("ReplayKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/RPBroadcastConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSCoding, NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class RPBroadcastConfigurationPtr extends Ptr<RPBroadcastConfiguration, RPBroadcastConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(RPBroadcastConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public RPBroadcastConfiguration() {}
    protected RPBroadcastConfiguration(Handle h, long handle) { super(h, handle); }
    protected RPBroadcastConfiguration(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public RPBroadcastConfiguration(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "clipDuration")
    public native double getClipDuration();
    @Property(selector = "setClipDuration:")
    public native void setClipDuration(double v);
    @Property(selector = "videoCompressionProperties")
    public native NSDictionary<?, ?> getVideoCompressionProperties();
    @Property(selector = "setVideoCompressionProperties:")
    public native void setVideoCompressionProperties(NSDictionary<?, ?> v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
