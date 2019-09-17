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
package org.robovm.apple.cryptotokenkit;

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
import org.robovm.apple.security.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("CryptoTokenKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TKSmartCardPINFormat/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class TKSmartCardPINFormatPtr extends Ptr<TKSmartCardPINFormat, TKSmartCardPINFormatPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TKSmartCardPINFormat.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public TKSmartCardPINFormat() {}
    protected TKSmartCardPINFormat(Handle h, long handle) { super(h, handle); }
    protected TKSmartCardPINFormat(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "charset")
    public native TKSmartCardPINCharset getCharset();
    @Property(selector = "setCharset:")
    public native void setCharset(TKSmartCardPINCharset v);
    @Property(selector = "encoding")
    public native TKSmartCardPINEncoding getEncoding();
    @Property(selector = "setEncoding:")
    public native void setEncoding(TKSmartCardPINEncoding v);
    @Property(selector = "minPINLength")
    public native @MachineSizedSInt long getMinPINLength();
    @Property(selector = "setMinPINLength:")
    public native void setMinPINLength(@MachineSizedSInt long v);
    @Property(selector = "maxPINLength")
    public native @MachineSizedSInt long getMaxPINLength();
    @Property(selector = "setMaxPINLength:")
    public native void setMaxPINLength(@MachineSizedSInt long v);
    @Property(selector = "PINBlockByteLength")
    public native @MachineSizedSInt long getPINBlockByteLength();
    @Property(selector = "setPINBlockByteLength:")
    public native void setPINBlockByteLength(@MachineSizedSInt long v);
    @Property(selector = "PINJustification")
    public native TKSmartCardPINJustification getPINJustification();
    @Property(selector = "setPINJustification:")
    public native void setPINJustification(TKSmartCardPINJustification v);
    @Property(selector = "PINBitOffset")
    public native @MachineSizedSInt long getPINBitOffset();
    @Property(selector = "setPINBitOffset:")
    public native void setPINBitOffset(@MachineSizedSInt long v);
    @Property(selector = "PINLengthBitOffset")
    public native @MachineSizedSInt long getPINLengthBitOffset();
    @Property(selector = "setPINLengthBitOffset:")
    public native void setPINLengthBitOffset(@MachineSizedSInt long v);
    @Property(selector = "PINLengthBitSize")
    public native @MachineSizedSInt long getPINLengthBitSize();
    @Property(selector = "setPINLengthBitSize:")
    public native void setPINLengthBitSize(@MachineSizedSInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
