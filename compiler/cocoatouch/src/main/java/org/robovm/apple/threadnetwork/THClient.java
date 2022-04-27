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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/THClient/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class THClientPtr extends Ptr<THClient, THClientPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(THClient.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public THClient() {}
    protected THClient(Handle h, long handle) { super(h, handle); }
    protected THClient(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "retrieveAllCredentials:")
    public native void retrieveAllCredentials(@Block VoidBlock2<NSSet<THCredentials>, NSError> completion);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "deleteCredentialsForBorderAgent:completion:")
    public native void deleteCredentialsForBorderAgent(NSData borderAgentID, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "retrieveCredentialsForBorderAgent:completion:")
    public native void retrieveCredentialsForBorderAgent(NSData borderAgentID, @Block VoidBlock2<THCredentials, NSError> completion);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "storeCredentialsForBorderAgent:activeOperationalDataSet:completion:")
    public native void storeCredentialsForBorderAgent(NSData borderAgentID, NSData activeOperationalDataSet, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "retrievePreferredCredentials:")
    public native void retrievePreferredCredentials(@Block VoidBlock2<THCredentials, NSError> completion);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "retrieveCredentialsForExtendedPANID:completion:")
    public native void retrieveCredentialsForExtendedPANID(NSData extendedPANID, @Block VoidBlock2<THCredentials, NSError> completion);
    /*</methods>*/
}
