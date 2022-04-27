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
package org.robovm.apple.corenfc;

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
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class) @Library("CoreNFC")/*</annotations>*/
public enum /*<name>*/NFCReaderError/*</name>*/ implements NSErrorCode {
    /*<values>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    ReaderErrorUnsupportedFeature(1L),
    /**
     * @since Available in iOS 11.0 and later.
     */
    ReaderErrorSecurityViolation(2L),
    /**
     * @since Available in iOS 13.0 and later.
     */
    ReaderErrorInvalidParameter(3L),
    /**
     * @since Available in iOS 13.0 and later.
     */
    ReaderErrorInvalidParameterLength(4L),
    /**
     * @since Available in iOS 13.0 and later.
     */
    ReaderErrorParameterOutOfBound(5L),
    /**
     * @since Available in iOS 14.0 and later.
     */
    ReaderErrorRadioDisabled(6L),
    /**
     * @since Available in iOS 11.0 and later.
     */
    ReaderTransceiveErrorTagConnectionLost(100L),
    /**
     * @since Available in iOS 11.0 and later.
     */
    ReaderTransceiveErrorRetryExceeded(101L),
    /**
     * @since Available in iOS 11.0 and later.
     */
    ReaderTransceiveErrorTagResponseError(102L),
    /**
     * @since Available in iOS 13.0 and later.
     */
    ReaderTransceiveErrorSessionInvalidated(103L),
    /**
     * @since Available in iOS 13.0 and later.
     */
    ReaderTransceiveErrorTagNotConnected(104L),
    /**
     * @since Available in iOS 14.0 and later.
     */
    ReaderTransceiveErrorPacketTooLong(105L),
    /**
     * @since Available in iOS 11.0 and later.
     */
    ReaderSessionInvalidationErrorUserCanceled(200L),
    /**
     * @since Available in iOS 11.0 and later.
     */
    ReaderSessionInvalidationErrorSessionTimeout(201L),
    /**
     * @since Available in iOS 11.0 and later.
     */
    ReaderSessionInvalidationErrorSessionTerminatedUnexpectedly(202L),
    /**
     * @since Available in iOS 11.0 and later.
     */
    ReaderSessionInvalidationErrorSystemIsBusy(203L),
    /**
     * @since Available in iOS 11.0 and later.
     */
    ReaderSessionInvalidationErrorFirstNDEFTagRead(204L),
    /**
     * @since Available in iOS 11.0 and later.
     */
    TagCommandConfigurationErrorInvalidParameters(300L),
    /**
     * @since Available in iOS 13.0 and later.
     */
    NdefReaderSessionErrorTagNotWritable(400L),
    /**
     * @since Available in iOS 13.0 and later.
     */
    NdefReaderSessionErrorTagUpdateFailure(401L),
    /**
     * @since Available in iOS 13.0 and later.
     */
    NdefReaderSessionErrorTagSizeTooSmall(402L),
    /**
     * @since Available in iOS 13.0 and later.
     */
    NdefReaderSessionErrorZeroLengthMessage(403L);
    /*</values>*/

    /*<bind>*/static { Bro.bind(NFCReaderError.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="NFCErrorDomain", optional=true)
    public static native String getClassDomain();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="NFCISO15693TagResponseErrorKey", optional=true)
    public static native NSString ISO15693TagResponseErrorKey();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="NFCTagResponseUnexpectedLengthErrorKey", optional=true)
    public static native NSString TagResponseUnexpectedLengthErrorKey();
    /*</methods>*/

    private final long n;

    private /*<name>*/NFCReaderError/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/NFCReaderError/*</name>*/ valueOf(long n) {
        for (/*<name>*/NFCReaderError/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in "
            + /*<name>*/NFCReaderError/*</name>*/.class.getName());
    }

    // bind wrap to include it in compilation as long as nserror enum is used
    static { Bro.bind(NSErrorWrap.class); }
    @StronglyLinked
    public static class NSErrorWrap extends NSError {
        protected NSErrorWrap(SkipInit skipInit) {super(skipInit);}

        @Override public NSErrorCode getErrorCode() {
             try {
                 return  /*<name>*/NFCReaderError/*</name>*/.valueOf(getCode());
             } catch (IllegalArgumentException e) {
                 return null;
             }
         }

        public static String getClassDomain() {
            /** must be incerted in value section */
            return /*<name>*/NFCReaderError/*</name>*/.getClassDomain();
        }
    }
}
