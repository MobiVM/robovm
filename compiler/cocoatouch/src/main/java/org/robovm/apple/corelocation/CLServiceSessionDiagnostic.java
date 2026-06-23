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
package org.robovm.apple.corelocation;

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
import org.robovm.apple.addressbook.*;
import org.robovm.apple.corebluetooth.*;
import org.robovm.apple.contacts.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 18.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreLocation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CLServiceSessionDiagnostic/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CLServiceSessionDiagnosticPtr extends Ptr<CLServiceSessionDiagnostic, CLServiceSessionDiagnosticPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CLServiceSessionDiagnostic.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CLServiceSessionDiagnostic() {}
    protected CLServiceSessionDiagnostic(Handle h, long handle) { super(h, handle); }
    protected CLServiceSessionDiagnostic(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "authorizationDenied")
    public native boolean isAuthorizationDenied();
    @Property(selector = "authorizationDeniedGlobally")
    public native boolean isAuthorizationDeniedGlobally();
    @Property(selector = "authorizationRestricted")
    public native boolean isAuthorizationRestricted();
    @Property(selector = "insufficientlyInUse")
    public native boolean isInsufficientlyInUse();
    @Property(selector = "serviceSessionRequired")
    public native boolean isServiceSessionRequired();
    @Property(selector = "fullAccuracyDenied")
    public native boolean isFullAccuracyDenied();
    @Property(selector = "alwaysAuthorizationDenied")
    public native boolean alwaysAuthorizationDenied();
    @Property(selector = "authorizationRequestInProgress")
    public native boolean isAuthorizationRequestInProgress();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
