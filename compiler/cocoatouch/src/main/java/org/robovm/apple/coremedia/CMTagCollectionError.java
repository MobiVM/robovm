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
package org.robovm.apple.coremedia;

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
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.audiotoolbox.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
public enum /*<name>*/CMTagCollectionError/*</name>*/ implements ValuedEnum {
    /*<values>*/
    ParamErr(-15740L),
    AllocationFailed(-15741L),
    InternalError(-15742L),
    InvalidTag(-15743L),
    InvalidTagCollectionDictionary(-15744L),
    InvalidTagCollectionData(-15745L),
    TagNotFound(-15746L),
    InvalidTagCollectionDataVersion(-15747L),
    ExhaustedBufferSize(-15748L),
    NotYetImplemented(-15749L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/CMTagCollectionError/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/CMTagCollectionError/*</name>*/ valueOf(long n) {
        for (/*<name>*/CMTagCollectionError/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/CMTagCollectionError/*</name>*/.class.getName());
    }
}
