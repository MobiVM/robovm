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
package org.robovm.apple.messages;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 27.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Messages") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MSUPIRequest/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MSUPIRequestPtr extends Ptr<MSUPIRequest, MSUPIRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MSUPIRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MSUPIRequest() {}
    protected MSUPIRequest(Handle h, long handle) { super(h, handle); }
    protected MSUPIRequest(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithValidationToken:recipients:")
    public MSUPIRequest(String validationToken, NSArray<NSString> recipients) { super((SkipInit) null); initObject(init(validationToken, recipients)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "validationToken")
    public native String getValidationToken();
    @Property(selector = "recipients")
    public native NSArray<NSString> getRecipients();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithValidationToken:recipients:")
    protected native @Pointer long init(String validationToken, NSArray<NSString> recipients);
    @Method(selector = "sendWithCompletionHandler:")
    public native void send(@Block VoidBooleanBlock completionHandler);
    /*</methods>*/
}
