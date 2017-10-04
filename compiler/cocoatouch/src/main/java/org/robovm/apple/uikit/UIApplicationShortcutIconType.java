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
package org.robovm.apple.uikit;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.cloudkit.*;
import org.robovm.apple.fileprovider.*;
import org.robovm.apple.intents.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/UIApplicationShortcutIconType/*</name>*/ implements ValuedEnum {
    /*<values>*/
    Compose(0L),
    Play(1L),
    Pause(2L),
    Add(3L),
    Location(4L),
    Search(5L),
    Share(6L),
    /**
     * @since Available in iOS 9.1 and later.
     */
    Prohibit(7L),
    /**
     * @since Available in iOS 9.1 and later.
     */
    Contact(8L),
    /**
     * @since Available in iOS 9.1 and later.
     */
    Home(9L),
    /**
     * @since Available in iOS 9.1 and later.
     */
    MarkLocation(10L),
    /**
     * @since Available in iOS 9.1 and later.
     */
    Favorite(11L),
    /**
     * @since Available in iOS 9.1 and later.
     */
    Love(12L),
    /**
     * @since Available in iOS 9.1 and later.
     */
    Cloud(13L),
    /**
     * @since Available in iOS 9.1 and later.
     */
    Invitation(14L),
    /**
     * @since Available in iOS 9.1 and later.
     */
    Confirmation(15L),
    /**
     * @since Available in iOS 9.1 and later.
     */
    Mail(16L),
    /**
     * @since Available in iOS 9.1 and later.
     */
    Message(17L),
    /**
     * @since Available in iOS 9.1 and later.
     */
    Date(18L),
    /**
     * @since Available in iOS 9.1 and later.
     */
    Time(19L),
    /**
     * @since Available in iOS 9.1 and later.
     */
    CapturePhoto(20L),
    /**
     * @since Available in iOS 9.1 and later.
     */
    CaptureVideo(21L),
    /**
     * @since Available in iOS 9.1 and later.
     */
    Task(22L),
    /**
     * @since Available in iOS 9.1 and later.
     */
    TaskCompleted(23L),
    /**
     * @since Available in iOS 9.1 and later.
     */
    Alarm(24L),
    /**
     * @since Available in iOS 9.1 and later.
     */
    Bookmark(25L),
    /**
     * @since Available in iOS 9.1 and later.
     */
    Shuffle(26L),
    /**
     * @since Available in iOS 9.1 and later.
     */
    Audio(27L),
    /**
     * @since Available in iOS 9.1 and later.
     */
    Update(28L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/UIApplicationShortcutIconType/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/UIApplicationShortcutIconType/*</name>*/ valueOf(long n) {
        for (/*<name>*/UIApplicationShortcutIconType/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/UIApplicationShortcutIconType/*</name>*/.class.getName());
    }
}
