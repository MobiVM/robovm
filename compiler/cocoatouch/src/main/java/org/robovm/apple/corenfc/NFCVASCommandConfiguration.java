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
package org.robovm.apple.corenfc;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreNFC") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NFCVASCommandConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NFCVASCommandConfigurationPtr extends Ptr<NFCVASCommandConfiguration, NFCVASCommandConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NFCVASCommandConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NFCVASCommandConfiguration() {}
    protected NFCVASCommandConfiguration(Handle h, long handle) { super(h, handle); }
    protected NFCVASCommandConfiguration(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithVASMode:passTypeIdentifier:url:")
    public NFCVASCommandConfiguration(VASMode mode, String passTypeIdentifier, NSURL url) { super((SkipInit) null); initObject(init(mode, passTypeIdentifier, url)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "mode")
    public native VASMode getMode();
    @Property(selector = "setMode:")
    public native void setMode(VASMode v);
    @Property(selector = "passTypeIdentifier")
    public native String getPassTypeIdentifier();
    @Property(selector = "setPassTypeIdentifier:")
    public native void setPassTypeIdentifier(String v);
    @Property(selector = "url")
    public native NSURL getUrl();
    @Property(selector = "setUrl:")
    public native void setUrl(NSURL v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithVASMode:passTypeIdentifier:url:")
    protected native @Pointer long init(VASMode mode, String passTypeIdentifier, NSURL url);
    /*</methods>*/
}
