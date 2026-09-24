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
package org.robovm.apple.videosubscriberaccount;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.2 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("VideoSubscriberAccount") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VSAccountProviderResponse/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VSAccountProviderResponsePtr extends Ptr<VSAccountProviderResponse, VSAccountProviderResponsePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VSAccountProviderResponse.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public VSAccountProviderResponse() {}
    protected VSAccountProviderResponse(Handle h, long handle) { super(h, handle); }
    protected VSAccountProviderResponse(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "authenticationScheme")
    public native String getAuthenticationScheme();
    @Property(selector = "status")
    public native String getStatus();
    @Property(selector = "body")
    public native String getBody();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Library("VideoSubscriberAccount")
    public static class AuthenticationScheme {
        static { Bro.bind(AuthenticationScheme.class); }

        /**
         * @since Available in iOS 10.2 and later.
         */
        @GlobalValue(symbol="VSAccountProviderAuthenticationSchemeSAML", optional=true)
        public static native NSString SAML();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="VSAccountProviderAuthenticationSchemeAPI", optional=true)
        public static native NSString API();
    }
    
    
    /*</methods>*/
}
