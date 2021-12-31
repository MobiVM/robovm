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
package org.robovm.apple.threadnetwork;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ThreadNetwork") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/THCredentials/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class THCredentialsPtr extends Ptr<THCredentials, THCredentialsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(THCredentials.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected THCredentials() {}
    protected THCredentials(Handle h, long handle) { super(h, handle); }
    protected THCredentials(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public THCredentials(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "networkName")
    public native String getNetworkName();
    @Property(selector = "extendedPANID")
    public native NSData getExtendedPANID();
    @Property(selector = "borderAgentID")
    public native NSData getBorderAgentID();
    @Property(selector = "activeOperationalDataSet")
    public native NSData getActiveOperationalDataSet();
    @Property(selector = "networkKey")
    public native NSData getNetworkKey();
    @Property(selector = "PSKC")
    public native NSData getPSKC();
    @Property(selector = "channel")
    public native byte getChannel();
    @Property(selector = "setChannel:")
    public native void setChannel(byte v);
    @Property(selector = "panID")
    public native NSData getPanID();
    @Property(selector = "creationDate")
    public native NSDate getCreationDate();
    @Property(selector = "lastModificationDate")
    public native NSDate getLastModificationDate();
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
