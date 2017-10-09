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
package org.robovm.apple.networkextension;

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
import org.robovm.apple.security.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("NetworkExtension") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NEFilterControlProvider/*</name>*/ 
    extends /*<extends>*/NEFilterProvider/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NEFilterControlProviderPtr extends Ptr<NEFilterControlProvider, NEFilterControlProviderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NEFilterControlProvider.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NEFilterControlProvider() {}
    protected NEFilterControlProvider(Handle h, long handle) { super(h, handle); }
    protected NEFilterControlProvider(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "remediationMap")
    public native NSDictionary<?, ?> getRemediationMap();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setRemediationMap:")
    public native void setRemediationMap(NSDictionary<?, ?> v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "URLAppendStringMap")
    public native NSDictionary<NSString, NSString> getURLAppendStringMap();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setURLAppendStringMap:")
    public native void setURLAppendStringMap(NSDictionary<NSString, NSString> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "handleRemediationForFlow:completionHandler:")
    public native void handleRemediationForFlow(NEFilterFlow flow, @Block VoidBlock1<NEFilterControlVerdict> completionHandler);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "handleNewFlow:completionHandler:")
    public native void handleNewFlow(NEFilterFlow flow, @Block VoidBlock1<NEFilterControlVerdict> completionHandler);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "notifyRulesChanged")
    public native void notifyRulesChanged();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "handleReport:")
    public native void handleReport(NEFilterReport report);
    /*</methods>*/
}
