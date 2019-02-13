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
package org.robovm.apple.intents;

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
import org.robovm.apple.eventkit.*;
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class) @Library("Intents")/*</annotations>*/
public enum /*<name>*/INIntentErrorCode/*</name>*/ implements NSErrorCode {
    /*<values>*/
    InteractionOperationNotSupported(1900L),
    DonatingInteraction(1901L),
    DeletingAllInteractions(1902L),
    DeletingInteractionWithIdentifiers(1903L),
    DeletingInteractionWithGroupIdentifier(1904L),
    IntentSupportedByMultipleExtension(2001L),
    RestrictedIntentsNotSupportedByExtension(2002L),
    NoHandlerProvidedForIntent(2003L),
    InvalidIntentName(2004L),
    NoAppAvailable(2005L),
    RequestTimedOut(3001L),
    MissingInformation(3002L),
    InvalidUserVocabularyFileLocation(4000L),
    ExtensionLaunchingTimeout(5000L),
    ExtensionBringUpFailed(5001L),
    ImageGeneric(6000L),
    ImageNoServiceAvailable(6001L),
    ImageStorageFailed(6002L),
    ImageLoadingFailed(6003L),
    ImageRetrievalFailed(6004L),
    ImageProxyLoop(6005L),
    ImageProxyInvalid(6006L),
    ImageProxyTimeout(6007L),
    ImageServiceFailure(6008L),
    ImageScalingFailed(6009L),
    PermissionDenied(6010L),
    VoiceShortcutCreationFailed(7000L),
    VoiceShortcutGetFailed(7001L),
    VoiceShortcutDeleteFailed(7002L),
    EncodingGeneric(8000L),
    EncodingFailed(8001L),
    DecodingGeneric(9000L);
    /*</values>*/

    /*<bind>*/static { Bro.bind(INIntentErrorCode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="INIntentErrorDomain", optional=true)
    public static native String getClassDomain();
    /*</methods>*/

    private final long n;

    private /*<name>*/INIntentErrorCode/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/INIntentErrorCode/*</name>*/ valueOf(long n) {
        for (/*<name>*/INIntentErrorCode/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in "
            + /*<name>*/INIntentErrorCode/*</name>*/.class.getName());
    }

    // bind wrap to include it in compilation as long as nserror enum is used 
    static { Bro.bind(NSErrorWrap.class); }
    @StronglyLinked
    public static class NSErrorWrap extends NSError {
        protected NSErrorWrap(SkipInit skipInit) {super(skipInit);}

        @Override public NSErrorCode getErrorCode() {
             try {
                 return  /*<name>*/INIntentErrorCode/*</name>*/.valueOf(getCode());
             } catch (IllegalArgumentException e) {
                 return null;
             }
         }

        public static String getClassDomain() {
            /** must be incerted in value section */
            return /*<name>*/INIntentErrorCode/*</name>*/.getClassDomain();
        }
    }
}
