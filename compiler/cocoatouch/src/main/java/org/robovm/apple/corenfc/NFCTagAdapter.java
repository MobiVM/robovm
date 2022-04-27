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
package org.robovm.apple.corenfc;

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
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NFCTagAdapter/*</name>*/ 
    extends /*<extends>*/NSCodingAdapter/*</extends>*/ 
    /*<implements>*/implements NFCTag/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("type")
    public NFCTagType getType() { return null; }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("session")
    public NFCReaderSessionProtocol getSession() { return null; }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("isAvailable")
    public boolean isAvailable() { return false; }
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("asNFCISO15693Tag")
    public NFCISO15693Tag asNFCISO15693Tag() { return null; }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("asNFCISO7816Tag")
    public NFCISO7816Tag asNFCISO7816Tag() { return null; }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("asNFCFeliCaTag")
    public NFCFeliCaTag asNFCFeliCaTag() { return null; }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("asNFCMiFareTag")
    public NFCMiFareTag asNFCMiFareTag() { return null; }
    /*</methods>*/
}
