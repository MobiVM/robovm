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
package org.robovm.apple.webkit;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.security.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
@ForceLinkClass(WKError.class)
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/WKErrorCode/*</name>*/ implements NSErrorCode {
    /*<values>*/
    Unknown(1L),
    WebContentProcessTerminated(2L),
    WebViewInvalidated(3L),
    JavaScriptExceptionOccurred(4L),
    /**
     * @since Available in iOS 9.0 and later.
     */
    JavaScriptResultTypeIsUnsupported(5L),
    /**
     * @since Available in iOS 11.0 and later.
     */
    ContentRuleListStoreCompileFailed(6L),
    /**
     * @since Available in iOS 11.0 and later.
     */
    ContentRuleListStoreLookUpFailed(7L),
    /**
     * @since Available in iOS 11.0 and later.
     */
    ContentRuleListStoreRemoveFailed(8L),
    /**
     * @since Available in iOS 11.0 and later.
     */
    ContentRuleListStoreVersionMismatch(9L),
    /**
     * @since Available in iOS 13.0 and later.
     */
    AttributedStringContentFailedToLoad(10L),
    /**
     * @since Available in iOS 13.0 and later.
     */
    AttributedStringContentLoadTimedOut(11L),
    /**
     * @since Available in iOS 14.0 and later.
     */
    JavaScriptInvalidFrameTarget(12L),
    /**
     * @since Available in iOS 14.0 and later.
     */
    NavigationAppBoundDomain(13L),
    /**
     * @since Available in iOS 14.0 and later.
     */
    JavaScriptAppBoundDomain(14L),
    /**
     * @since Available in iOS 16.0 and later.
     */
    DuplicateCredential(15L),
    /**
     * @since Available in iOS 16.0 and later.
     */
    MalformedCredential(16L),
    /**
     * @since Available in iOS 16.0 and later.
     */
    CredentialNotFound(17L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/WKErrorCode/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/WKErrorCode/*</name>*/ valueOf(long n) {
        for (/*<name>*/WKErrorCode/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/WKErrorCode/*</name>*/.class.getName());
    }
}
