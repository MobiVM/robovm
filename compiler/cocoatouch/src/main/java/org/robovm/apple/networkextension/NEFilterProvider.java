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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NEFilterProvider/*</name>*/ 
    extends /*<extends>*/NEProvider/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NEFilterProviderPtr extends Ptr<NEFilterProvider, NEFilterProviderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NEFilterProvider.class); }/*</bind>*/
    /*<constants>*/
    public static final String RemediationURLFlowURLHostname = "NE_FLOW_HOSTNAME";
    public static final String RemediationURLFlowURL = "NE_FLOW_URL";
    public static final String RemediationURLOrganization = "NE_ORGANIZATION";
    public static final String RemediationURLUsername = "NE_USERNAME";
    /*</constants>*/
    /*<constructors>*/
    public NEFilterProvider() {}
    protected NEFilterProvider(Handle h, long handle) { super(h, handle); }
    protected NEFilterProvider(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "filterConfiguration")
    public native NEFilterProviderConfiguration getFilterConfiguration();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="NEFilterProviderRemediationMapRemediationURLs", optional=true)
    public static native String RemediationMapRemediationURLs();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="NEFilterProviderRemediationMapRemediationButtonTexts", optional=true)
    public static native String RemediationMapRemediationButtonTexts();
    
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "startFilterWithCompletionHandler:")
    public native void startFilter(@Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "stopFilterWithReason:completionHandler:")
    public native void stopFilter(NEProviderStopReason reason, @Block Runnable completionHandler);
    /*</methods>*/
}
