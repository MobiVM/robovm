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
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreImage") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CIPDF417CodeDescriptor/*</name>*/ 
    extends /*<extends>*/CIBarcodeDescriptor/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CIPDF417CodeDescriptorPtr extends Ptr<CIPDF417CodeDescriptor, CIPDF417CodeDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CIPDF417CodeDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CIPDF417CodeDescriptor() {}
    protected CIPDF417CodeDescriptor(Handle h, long handle) { super(h, handle); }
    protected CIPDF417CodeDescriptor(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPayload:isCompact:rowCount:columnCount:")
    public CIPDF417CodeDescriptor(NSData errorCorrectedPayload, boolean isCompact, @MachineSizedSInt long rowCount, @MachineSizedSInt long columnCount) { super((SkipInit) null); initObject(init(errorCorrectedPayload, isCompact, rowCount, columnCount)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "errorCorrectedPayload")
    public native NSData getErrorCorrectedPayload();
    @Property(selector = "isCompact")
    public native boolean isCompact();
    @Property(selector = "rowCount")
    public native @MachineSizedSInt long getRowCount();
    @Property(selector = "columnCount")
    public native @MachineSizedSInt long getColumnCount();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPayload:isCompact:rowCount:columnCount:")
    protected native @Pointer long init(NSData errorCorrectedPayload, boolean isCompact, @MachineSizedSInt long rowCount, @MachineSizedSInt long columnCount);
    @Method(selector = "descriptorWithPayload:isCompact:rowCount:columnCount:")
    public static native CIPDF417CodeDescriptor descriptor(NSData errorCorrectedPayload, boolean isCompact, @MachineSizedSInt long rowCount, @MachineSizedSInt long columnCount);
    /*</methods>*/
}
