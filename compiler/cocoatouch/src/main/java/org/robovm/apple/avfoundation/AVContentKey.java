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
 * @since Available in iOS 14.5 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVContentKey/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVContentKeyPtr extends Ptr<AVContentKey, AVContentKeyPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVContentKey.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVContentKey() {}
    protected AVContentKey(Handle h, long handle) { super(h, handle); }
    protected AVContentKey(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "contentKeySpecifier")
    public native AVContentKeySpecifier getContentKeySpecifier();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 10.3 and later.
     */
    @GlobalValue(symbol="AVContentKeySystemFairPlayStreaming", optional=true)
    public static native String SystemFairPlayStreaming();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="AVContentKeySystemClearKey", optional=true)
    public static native String SystemClearKey();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="AVContentKeySystemAuthorizationToken", optional=true)
    public static native String SystemAuthorizationToken();
    /**
     * @since Available in iOS 12.2 and later.
     */
    @GlobalValue(symbol="AVContentKeySessionServerPlaybackContextOptionProtocolVersions", optional=true)
    public static native String SessionServerPlaybackContextOptionProtocolVersions();
    /**
     * @since Available in iOS 12.2 and later.
     */
    @GlobalValue(symbol="AVContentKeySessionServerPlaybackContextOptionServerChallenge", optional=true)
    public static native String SessionServerPlaybackContextOptionServerChallenge();
    /**
     * @since Available in iOS 10.3 and later.
     */
    @GlobalValue(symbol="AVContentKeyRequestRetryReasonTimedOut", optional=true)
    public static native String RequestRetryReasonTimedOut();
    /**
     * @since Available in iOS 10.3 and later.
     */
    @GlobalValue(symbol="AVContentKeyRequestRetryReasonReceivedResponseWithExpiredLease", optional=true)
    public static native String RequestRetryReasonReceivedResponseWithExpiredLease();
    /**
     * @since Available in iOS 10.3 and later.
     */
    @GlobalValue(symbol="AVContentKeyRequestRetryReasonReceivedObsoleteContentKey", optional=true)
    public static native String RequestRetryReasonReceivedObsoleteContentKey();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="AVContentKeyRequestRequiresValidationDataInSecureTokenKey", optional=true)
    public static native String RequestRequiresValidationDataInSecureTokenKey();
    /**
     * @since Available in iOS 10.3 and later.
     */
    @GlobalValue(symbol="AVContentKeyRequestProtocolVersionsKey", optional=true)
    public static native String RequestProtocolVersionsKey();
    
    /**
     * @since Available in iOS 14.5 and later.
     */
    public static boolean attachToSampleBuffer(CMSampleBuffer sbuf, AVContentKey contentKey) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = attachToSampleBuffer(sbuf, contentKey, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 14.5 and later.
     */
    @Bridge(symbol="AVSampleBufferAttachContentKey", optional=true)
    private static native boolean attachToSampleBuffer(CMSampleBuffer sbuf, AVContentKey contentKey, NSError.NSErrorPtr error);
    
    
    /*</methods>*/
    /**
     * @since Available in iOS 14.5 and later.
     */
    public boolean attachToSampleBuffer(CMSampleBuffer sbuf) throws NSErrorException {
        NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
        boolean result = attachToSampleBuffer(sbuf, this, ptr);
        if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
        return result;
    }
}
