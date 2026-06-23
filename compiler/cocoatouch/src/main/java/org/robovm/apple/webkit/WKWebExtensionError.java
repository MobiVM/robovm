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
package org.robovm.apple.webkit;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.security.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 18.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class) @Library("WebKit")/*</annotations>*/
public enum /*<name>*/WKWebExtensionError/*</name>*/ implements ValuedEnum {
    /*<values>*/
    Unknown(1L),
    ResourceNotFound(2L),
    InvalidResourceCodeSignature(3L),
    InvalidManifest(4L),
    UnsupportedManifestVersion(5L),
    InvalidManifestEntry(6L),
    InvalidDeclarativeNetRequestEntry(7L),
    InvalidBackgroundPersistence(8L),
    InvalidArchive(9L);
    /*</values>*/

    /*<bind>*/static { Bro.bind(WKWebExtensionError.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*/
    /**
     * @since Available in iOS 18.4 and later.
     */
    @GlobalValue(symbol="WKWebExtensionErrorDomain", optional=true)
    public static native String getClassDomain();
    /*</methods>*/

    private final long n;

    private /*<name>*/WKWebExtensionError/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/WKWebExtensionError/*</name>*/ valueOf(long n) {
        for (/*<name>*/WKWebExtensionError/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/WKWebExtensionError/*</name>*/.class.getName());
    }
}
