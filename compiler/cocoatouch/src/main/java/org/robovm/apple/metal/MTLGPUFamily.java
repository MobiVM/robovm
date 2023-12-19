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
package org.robovm.apple.metal;

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
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/MTLGPUFamily/*</name>*/ implements ValuedEnum {
    /*<values>*/
    Apple1(1001L),
    Apple2(1002L),
    Apple3(1003L),
    Apple4(1004L),
    Apple5(1005L),
    Apple6(1006L),
    Apple7(1007L),
    Apple8(1008L),
    Apple9(1009L),
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 16.0. Use MTLGPUFamilyMac2
     */
    @Deprecated
    Mac1(2001L),
    Mac2(2002L),
    Common1(3001L),
    Common2(3002L),
    Common3(3003L),
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 16.0. Use MTLGPUFamilyMac2
     */
    @Deprecated
    MacCatalyst1(4001L),
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 16.0. Use MTLGPUFamilyMac2
     */
    @Deprecated
    MacCatalyst2(4002L),
    /**
     * @since Available in iOS 16.0 and later.
     */
    Metal3(5001L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/MTLGPUFamily/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/MTLGPUFamily/*</name>*/ valueOf(long n) {
        for (/*<name>*/MTLGPUFamily/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/MTLGPUFamily/*</name>*/.class.getName());
    }
}
