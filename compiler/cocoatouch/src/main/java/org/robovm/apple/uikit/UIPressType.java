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

/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/UIPressType/*</name>*/ implements ValuedEnum {
    /*<values>*/
    UpArrow(0L),
    DownArrow(1L),
    LeftArrow(2L),
    RightArrow(3L),
    Select(4L),
    Menu(5L),
    PlayPause(6L);
    /*</values>*/
    
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<UIPressType> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSNumber> o = (NSArray<NSNumber>) NSObject.Marshaler.toObject(cls, handle, flags);
            if (o == null) {
                return null;
            }
            List<UIPressType> list = new ArrayList<>();
            for (NSNumber n : o) {
                list.add(UIPressType.valueOf(n.longValue()));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<UIPressType> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSNumber> array = new NSMutableArray<>();
            for (UIPressType i : l) {
                array.add(NSNumber.valueOf(i.value()));
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/UIPressType/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/UIPressType/*</name>*/ valueOf(long n) {
        for (/*<name>*/UIPressType/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/UIPressType/*</name>*/.class.getName());
    }
}
