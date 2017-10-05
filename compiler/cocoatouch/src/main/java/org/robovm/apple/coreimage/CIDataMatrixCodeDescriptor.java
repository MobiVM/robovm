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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CIDataMatrixCodeDescriptor/*</name>*/ 
    extends /*<extends>*/CIBarcodeDescriptor/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CIDataMatrixCodeDescriptorPtr extends Ptr<CIDataMatrixCodeDescriptor, CIDataMatrixCodeDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CIDataMatrixCodeDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CIDataMatrixCodeDescriptor() {}
    protected CIDataMatrixCodeDescriptor(Handle h, long handle) { super(h, handle); }
    protected CIDataMatrixCodeDescriptor(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPayload:rowCount:columnCount:eccVersion:")
    public CIDataMatrixCodeDescriptor(NSData errorCorrectedPayload, @MachineSizedSInt long rowCount, @MachineSizedSInt long columnCount, CIDataMatrixCodeECCVersion eccVersion) { super((SkipInit) null); initObject(init(errorCorrectedPayload, rowCount, columnCount, eccVersion)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "errorCorrectedPayload")
    public native NSData getErrorCorrectedPayload();
    @Property(selector = "rowCount")
    public native @MachineSizedSInt long getRowCount();
    @Property(selector = "columnCount")
    public native @MachineSizedSInt long getColumnCount();
    @Property(selector = "eccVersion")
    public native CIDataMatrixCodeECCVersion getEccVersion();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPayload:rowCount:columnCount:eccVersion:")
    protected native @Pointer long init(NSData errorCorrectedPayload, @MachineSizedSInt long rowCount, @MachineSizedSInt long columnCount, CIDataMatrixCodeECCVersion eccVersion);
    @Method(selector = "descriptorWithPayload:rowCount:columnCount:eccVersion:")
    public static native CIDataMatrixCodeDescriptor descriptor(NSData errorCorrectedPayload, @MachineSizedSInt long rowCount, @MachineSizedSInt long columnCount, CIDataMatrixCodeECCVersion eccVersion);
    /*</methods>*/
}
