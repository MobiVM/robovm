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
package org.robovm.apple.audiotoolbox;

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
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremidi.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
public enum /*<name>*/AUErrorCode/*</name>*/ implements NSErrorCode {
    /*<values>*/
    InvalidProperty(-10879L),
    InvalidParameter(-10878L),
    InvalidElement(-10877L),
    NoConnection(-10876L),
    FailedInitialization(-10875L),
    TooManyFramesToProcess(-10874L),
    InvalidFile(-10871L),
    UnknownFileType(-10870L),
    FileNotSpecified(-10869L),
    FormatNotSupported(-10868L),
    Uninitialized(-10867L),
    InvalidScope(-10866L),
    PropertyNotWritable(-10865L),
    CannotDoInCurrentContext(-10863L),
    InvalidPropertyValue(-10851L),
    PropertyNotInUse(-10850L),
    Initialized(-10849L),
    InvalidOfflineRender(-10848L),
    Unauthorized(-10847L),
    MIDIOutputBufferFull(-66753L),
    InstanceTimedOut(-66754L),
    InstanceInvalidated(-66749L),
    RenderTimeout(-66745L),
    ExtensionNotFound(-66744L),
    InvalidParameterValue(-66743L),
    InvalidFilePath(-66742L),
    MissingKey(-66741L),
    ComponentManagerNotSupported(-66740L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/AUErrorCode/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/AUErrorCode/*</name>*/ valueOf(long n) {
        for (/*<name>*/AUErrorCode/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/AUErrorCode/*</name>*/.class.getName());
    }
}
