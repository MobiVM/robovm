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
package org.robovm.apple.coreimage;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.opengles.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.imageio.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.iosurface.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreImage") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CIQRCodeDescriptor/*</name>*/ 
    extends /*<extends>*/CIBarcodeDescriptor/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CIQRCodeDescriptorPtr extends Ptr<CIQRCodeDescriptor, CIQRCodeDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CIQRCodeDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CIQRCodeDescriptor() {}
    protected CIQRCodeDescriptor(Handle h, long handle) { super(h, handle); }
    protected CIQRCodeDescriptor(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPayload:symbolVersion:maskPattern:errorCorrectionLevel:")
    public CIQRCodeDescriptor(NSData errorCorrectedPayload, @MachineSizedSInt long symbolVersion, byte maskPattern, CIQRCodeErrorCorrectionLevel errorCorrectionLevel) { super((SkipInit) null); initObject(init(errorCorrectedPayload, symbolVersion, maskPattern, errorCorrectionLevel)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "errorCorrectedPayload")
    public native NSData getErrorCorrectedPayload();
    @Property(selector = "symbolVersion")
    public native @MachineSizedSInt long getSymbolVersion();
    @Property(selector = "maskPattern")
    public native byte getMaskPattern();
    @Property(selector = "errorCorrectionLevel")
    public native CIQRCodeErrorCorrectionLevel getErrorCorrectionLevel();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPayload:symbolVersion:maskPattern:errorCorrectionLevel:")
    protected native @Pointer long init(NSData errorCorrectedPayload, @MachineSizedSInt long symbolVersion, byte maskPattern, CIQRCodeErrorCorrectionLevel errorCorrectionLevel);
    @Method(selector = "descriptorWithPayload:symbolVersion:maskPattern:errorCorrectionLevel:")
    public static native CIQRCodeDescriptor descriptor(NSData errorCorrectedPayload, @MachineSizedSInt long symbolVersion, byte maskPattern, CIQRCodeErrorCorrectionLevel errorCorrectionLevel);
    /*</methods>*/
}
