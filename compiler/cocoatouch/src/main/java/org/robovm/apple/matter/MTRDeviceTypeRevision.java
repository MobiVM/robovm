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
package org.robovm.apple.matter;

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
import org.robovm.apple.security.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 17.6 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Matter") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRDeviceTypeRevision/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class MTRDeviceTypeRevisionPtr extends Ptr<MTRDeviceTypeRevision, MTRDeviceTypeRevisionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRDeviceTypeRevision.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRDeviceTypeRevision() {}
    protected MTRDeviceTypeRevision(Handle h, long handle) { super(h, handle); }
    protected MTRDeviceTypeRevision(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDeviceTypeID:revision:")
    public MTRDeviceTypeRevision(NSNumber deviceTypeID, NSNumber revision) { super((SkipInit) null); initObject(init(deviceTypeID, revision)); }
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "initWithDeviceTypeStruct:")
    public MTRDeviceTypeRevision(MTRDescriptorClusterDeviceTypeStruct deviceTypeStruct) { super((SkipInit) null); initObject(init(deviceTypeStruct)); }
    @Method(selector = "initWithCoder:")
    public MTRDeviceTypeRevision(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "deviceTypeID")
    public native NSNumber getDeviceTypeID();
    @Property(selector = "deviceTypeRevision")
    public native NSNumber getDeviceTypeRevision();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "typeInformation")
    public native MTRDeviceType getTypeInformation();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDeviceTypeID:revision:")
    protected native @Pointer long init(NSNumber deviceTypeID, NSNumber revision);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "initWithDeviceTypeStruct:")
    protected native @Pointer long init(MTRDescriptorClusterDeviceTypeStruct deviceTypeStruct);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
