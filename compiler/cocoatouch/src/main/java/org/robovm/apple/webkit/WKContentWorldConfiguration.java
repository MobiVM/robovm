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
package org.robovm.apple.webkit;

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
import org.robovm.apple.security.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 27.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("WebKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/WKContentWorldConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class WKContentWorldConfigurationPtr extends Ptr<WKContentWorldConfiguration, WKContentWorldConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(WKContentWorldConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public WKContentWorldConfiguration() {}
    protected WKContentWorldConfiguration(Handle h, long handle) { super(h, handle); }
    protected WKContentWorldConfiguration(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public WKContentWorldConfiguration(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "allowAccessingClosedShadowRoots")
    public native boolean isAllowAccessingClosedShadowRoots();
    @Property(selector = "setAllowAccessingClosedShadowRoots:")
    public native void setAllowAccessingClosedShadowRoots(boolean v);
    @Property(selector = "isAutofillScriptingEnabled")
    public native boolean isAutofillScriptingEnabled();
    @Property(selector = "setAutofillScriptingEnabled:")
    public native void setAutofillScriptingEnabled(boolean v);
    @Property(selector = "isElementUserInfoEnabled")
    public native boolean isElementUserInfoEnabled();
    @Property(selector = "setElementUserInfoEnabled:")
    public native void setElementUserInfoEnabled(boolean v);
    @Property(selector = "isLegacyBuiltinOverridesEnabled")
    public native boolean isLegacyBuiltinOverridesEnabled();
    @Property(selector = "setLegacyBuiltinOverridesEnabled:")
    public native void setLegacyBuiltinOverridesEnabled(boolean v);
    @Property(selector = "isNodeSnapshotCreationEnabled")
    public native boolean isNodeSnapshotCreationEnabled();
    @Property(selector = "setNodeSnapshotCreationEnabled:")
    public native void setNodeSnapshotCreationEnabled(boolean v);
    @Property(selector = "isJSHandleCreationEnabled")
    public native boolean isJsHandleCreationEnabled();
    @Property(selector = "setJSHandleCreationEnabled:")
    public native void setJsHandleCreationEnabled(boolean v);
    @Property(selector = "isInspectable")
    public native boolean isInspectable();
    @Property(selector = "setInspectable:")
    public native void setInspectable(boolean v);
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
