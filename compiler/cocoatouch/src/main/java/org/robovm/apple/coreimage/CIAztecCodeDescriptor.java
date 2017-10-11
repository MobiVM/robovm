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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CIAztecCodeDescriptor/*</name>*/ 
    extends /*<extends>*/CIBarcodeDescriptor/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CIAztecCodeDescriptorPtr extends Ptr<CIAztecCodeDescriptor, CIAztecCodeDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CIAztecCodeDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CIAztecCodeDescriptor() {}
    protected CIAztecCodeDescriptor(Handle h, long handle) { super(h, handle); }
    protected CIAztecCodeDescriptor(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPayload:isCompact:layerCount:dataCodewordCount:")
    public CIAztecCodeDescriptor(NSData errorCorrectedPayload, boolean isCompact, @MachineSizedSInt long layerCount, @MachineSizedSInt long dataCodewordCount) { super((SkipInit) null); initObject(init(errorCorrectedPayload, isCompact, layerCount, dataCodewordCount)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "errorCorrectedPayload")
    public native NSData getErrorCorrectedPayload();
    @Property(selector = "isCompact")
    public native boolean isCompact();
    @Property(selector = "layerCount")
    public native @MachineSizedSInt long getLayerCount();
    @Property(selector = "dataCodewordCount")
    public native @MachineSizedSInt long getDataCodewordCount();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPayload:isCompact:layerCount:dataCodewordCount:")
    protected native @Pointer long init(NSData errorCorrectedPayload, boolean isCompact, @MachineSizedSInt long layerCount, @MachineSizedSInt long dataCodewordCount);
    @Method(selector = "descriptorWithPayload:isCompact:layerCount:dataCodewordCount:")
    public static native CIAztecCodeDescriptor descriptor(NSData errorCorrectedPayload, boolean isCompact, @MachineSizedSInt long layerCount, @MachineSizedSInt long dataCodewordCount);
    /*</methods>*/
}
