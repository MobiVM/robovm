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
package org.robovm.apple.contacts;

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
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
@ForceLinkClass(CNErrorCode.class)
public enum /*<name>*/CNErrorCode/*</name>*/ implements NSErrorCode {
    /*<values>*/
    CommunicationError(1L),
    DataAccessError(2L),
    AuthorizationDenied(100L),
    /**
     * @since Available in iOS 11.3 and later.
     */
    NoAccessableWritableContainers(101L),
    /**
     * @since Available in iOS 13.0 and later.
     */
    UnauthorizedKeys(102L),
    /**
     * @since Available in iOS 13.0 and later.
     */
    FeatureDisabledByUser(103L),
    /**
     * @since Available in iOS 17.0 and later.
     */
    FeatureNotAvailable(104L),
    RecordDoesNotExist(200L),
    InsertedRecordAlreadyExists(201L),
    ContainmentCycle(202L),
    ContainmentScope(203L),
    ParentRecordDoesNotExist(204L),
    RecordIdentifierInvalid(205L),
    /**
     * @since Available in iOS 13.0 and later.
     */
    RecordNotWritable(206L),
    /**
     * @since Available in iOS 13.0 and later.
     */
    ParentContainerNotWritable(207L),
    ValidationMultipleErrors(300L),
    ValidationTypeMismatch(301L),
    ValidationConfigurationError(302L),
    PredicateInvalid(400L),
    PolicyViolation(500L),
    ClientIdentifierInvalid(600L),
    ClientIdentifierDoesNotExist(601L),
    ClientIdentifierCollision(602L),
    ChangeHistoryExpired(603L),
    ChangeHistoryInvalidAnchor(604L),
    ChangeHistoryInvalidFetchRequest(605L),
    /**
     * @since Available in iOS 11.0 and later.
     */
    VCardMalformed(700L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    VCardSummarizationError(701L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/CNErrorCode/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/CNErrorCode/*</name>*/ valueOf(long n) {
        for (/*<name>*/CNErrorCode/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/CNErrorCode/*</name>*/.class.getName());
    }
}
