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
package org.robovm.apple.security;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @deprecated Deprecated in iOS 15.0. Replaced with SecKeyAlgorithm
 */
/*</javadoc>*/
/*<annotations>*/@Deprecated/*</annotations>*/
public final class /*<name>*/SecPadding/*</name>*/ extends Bits</*<name>*/SecPadding/*</name>*/> {
    /*<values>*/
    public static final SecPadding None = new SecPadding(0L);
    public static final SecPadding PKCS1 = new SecPadding(1L);
    public static final SecPadding OAEP = new SecPadding(2L);
    public static final SecPadding SigRaw = new SecPadding(16384L);
    public static final SecPadding PKCS1MD2 = new SecPadding(32768L);
    public static final SecPadding PKCS1MD5 = new SecPadding(32769L);
    public static final SecPadding PKCS1SHA1 = new SecPadding(32770L);
    public static final SecPadding PKCS1SHA224 = new SecPadding(32771L);
    public static final SecPadding PKCS1SHA256 = new SecPadding(32772L);
    public static final SecPadding PKCS1SHA384 = new SecPadding(32773L);
    public static final SecPadding PKCS1SHA512 = new SecPadding(32774L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/SecPadding/*</name>*/[] values = _values(/*<name>*/SecPadding/*</name>*/.class);

    public /*<name>*/SecPadding/*</name>*/(long value) { super(value); }
    private /*<name>*/SecPadding/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/SecPadding/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/SecPadding/*</name>*/(value, mask);
    }
    protected /*<name>*/SecPadding/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/SecPadding/*</name>*/[] values() {
        return values.clone();
    }
}
