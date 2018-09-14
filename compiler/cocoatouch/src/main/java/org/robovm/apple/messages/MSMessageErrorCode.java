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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class) @Library("Messages")/*</annotations>*/
public enum /*<name>*/MSMessageErrorCode/*</name>*/ implements ValuedEnum {
    /*<values>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    Unknown(-1L),
    FileNotFound(1L),
    FileUnreadable(2L),
    ImproperFileType(3L),
    ImproperFileURL(4L),
    StickerFileImproperFileAttributes(5L),
    StickerFileImproperFileSize(6L),
    StickerFileImproperFileFormat(7L),
    URLExceedsMaxSize(8L),
    /**
     * @since Available in iOS 11.0 and later.
     */
    SendWithoutRecentInteraction(9L),
    /**
     * @since Available in iOS 11.0 and later.
     */
    SendWhileNotVisible(10L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    APIUnavailableInPresentationContext(11L);
    /*</values>*/

    /*<bind>*/static { Bro.bind(MSMessageErrorCode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*/
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="MSStickersErrorDomain", optional=true)
    public static native String getStickersErrorDomain();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="MSMessagesErrorDomain", optional=true)
    public static native String getMessagesErrorDomain();
    /*</methods>*/

    private final long n;

    private /*<name>*/MSMessageErrorCode/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/MSMessageErrorCode/*</name>*/ valueOf(long n) {
        for (/*<name>*/MSMessageErrorCode/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/MSMessageErrorCode/*</name>*/.class.getName());
    }
}
