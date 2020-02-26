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
import org.robovm.apple.network.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("NetworkExtension") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NEEvaluateConnectionRule/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class NEEvaluateConnectionRulePtr extends Ptr<NEEvaluateConnectionRule, NEEvaluateConnectionRulePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NEEvaluateConnectionRule.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NEEvaluateConnectionRule() {}
    protected NEEvaluateConnectionRule(Handle h, long handle) { super(h, handle); }
    protected NEEvaluateConnectionRule(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithMatchDomains:andAction:")
    public NEEvaluateConnectionRule(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> domains, NEEvaluateConnectionRuleAction action) { super((SkipInit) null); initObject(init(domains, action)); }
    @Method(selector = "initWithCoder:")
    public NEEvaluateConnectionRule(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "action")
    public native NEEvaluateConnectionRuleAction getAction();
    @Property(selector = "matchDomains")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getMatchDomains();
    @Property(selector = "useDNSServers")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getDNSServers();
    @Property(selector = "setUseDNSServers:")
    public native void setDNSServers(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> v);
    @Property(selector = "probeURL")
    public native NSURL getProbeURL();
    @Property(selector = "setProbeURL:")
    public native void setProbeURL(NSURL v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithMatchDomains:andAction:")
    protected native @Pointer long init(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> domains, NEEvaluateConnectionRuleAction action);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
