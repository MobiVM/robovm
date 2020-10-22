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
package org.robovm.apple.sensorkit;

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
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/SRNotificationEvent/*</name>*/ implements ValuedEnum {
    /*<values>*/
    Unknown(0L),
    Received(1L),
    DefaultAction(2L),
    SupplementaryAction(3L),
    Clear(4L),
    NotificationCenterClearAll(5L),
    Removed(6L),
    Hide(7L),
    LongLook(8L),
    Silence(9L),
    AppLaunch(10L),
    Expired(11L),
    BannerPulldown(12L),
    TapCoalesce(13L),
    Deduped(14L),
    DeviceActivated(15L),
    DeviceUnlocked(16L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/SRNotificationEvent/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/SRNotificationEvent/*</name>*/ valueOf(long n) {
        for (/*<name>*/SRNotificationEvent/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/SRNotificationEvent/*</name>*/.class.getName());
    }
}
