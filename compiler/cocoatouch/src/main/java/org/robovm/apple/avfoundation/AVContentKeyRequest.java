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
package org.robovm.apple.avfoundation;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.mediatoolbox.*;
import org.robovm.apple.audiotoolbox.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.3 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVContentKeyRequest/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVContentKeyRequestPtr extends Ptr<AVContentKeyRequest, AVContentKeyRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVContentKeyRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVContentKeyRequest() {}
    protected AVContentKeyRequest(Handle h, long handle) { super(h, handle); }
    protected AVContentKeyRequest(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "status")
    public native AVContentKeyRequestStatus getStatus();
    @Property(selector = "error")
    public native NSError getError();
    @Property(selector = "identifier")
    public native NSObject getIdentifier();
    @Property(selector = "initializationData")
    public native NSData getInitializationData();
    @Property(selector = "canProvidePersistableContentKey")
    public native boolean canProvidePersistableContentKey();
    @Property(selector = "renewsExpiringResponseData")
    public native boolean isRenewsExpiringResponseData();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "makeStreamingContentKeyRequestDataForApp:contentIdentifier:options:completionHandler:")
    public native void makeStreamingContentKeyRequestDataForApp(NSData appIdentifier, NSData contentIdentifier, NSDictionary<NSString, ?> options, @Block VoidBlock2<NSData, NSError> handler);
    @Method(selector = "processContentKeyResponse:")
    public native void processContentKeyResponse(AVContentKeyResponse keyResponse);
    @Method(selector = "processContentKeyResponseError:")
    public native void processContentKeyResponseError(NSError error);
    /**
     * @since Available in iOS 10.3 and later.
     * @deprecated Deprecated in iOS 11.2. Use respondByRequestingPersistableContentKeyRequestAndReturnError: instead.
     */
    @Deprecated
    @Method(selector = "respondByRequestingPersistableContentKeyRequest")
    public native void respondByRequestingPersistableContentKeyRequest();
    /**
     * @since Available in iOS 11.2 and later.
     */
    @Method(selector = "respondByRequestingPersistableContentKeyRequestAndReturnError:")
    public native boolean respondByRequestingPersistableContentKeyRequestAndReturnError(NSError.NSErrorPtr outError);
    /*</methods>*/
}
