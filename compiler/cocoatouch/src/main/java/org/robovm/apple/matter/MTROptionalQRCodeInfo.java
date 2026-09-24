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
 * @since Available in iOS 16.1 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Matter") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTROptionalQRCodeInfo/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTROptionalQRCodeInfoPtr extends Ptr<MTROptionalQRCodeInfo, MTROptionalQRCodeInfoPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTROptionalQRCodeInfo.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTROptionalQRCodeInfo() {}
    protected MTROptionalQRCodeInfo(Handle h, long handle) { super(h, handle); }
    protected MTROptionalQRCodeInfo(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "initWithTag:stringValue:")
    public MTROptionalQRCodeInfo(NSNumber tag, String value) { super((SkipInit) null); initObject(init(tag, value)); }
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "initWithTag:int32Value:")
    public MTROptionalQRCodeInfo(NSNumber tag, int value) { super((SkipInit) null); initObject(init(tag, value)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "type")
    public native MTROptionalQRCodeInfoType getType();
    @Property(selector = "tag")
    public native NSNumber getTag();
    @Property(selector = "integerValue")
    public native NSNumber getIntegerValue();
    @Property(selector = "stringValue")
    public native String getStringValue();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "initWithTag:stringValue:")
    protected native @Pointer long init(NSNumber tag, String value);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "initWithTag:int32Value:")
    protected native @Pointer long init(NSNumber tag, int value);
    /**
     * @since Available in iOS 16.1 and later.
     * @deprecated Deprecated in iOS 17.6. MTROptionalQRCodeInfo is immutable
     */
    @Deprecated
    @Method(selector = "setType:")
    public native void setType(MTROptionalQRCodeInfoType type);
    /**
     * @since Available in iOS 16.1 and later.
     * @deprecated Deprecated in iOS 17.6. MTROptionalQRCodeInfo is immutable
     */
    @Deprecated
    @Method(selector = "setTag:")
    public native void setTag(NSNumber tag);
    /**
     * @since Available in iOS 16.1 and later.
     * @deprecated Deprecated in iOS 17.6. MTROptionalQRCodeInfo is immutable
     */
    @Deprecated
    @Method(selector = "setIntegerValue:")
    public native void setIntegerValue(NSNumber integerValue);
    /**
     * @since Available in iOS 16.1 and later.
     * @deprecated Deprecated in iOS 17.6. MTROptionalQRCodeInfo is immutable
     */
    @Deprecated
    @Method(selector = "setStringValue:")
    public native void setStringValue(String stringValue);
    /*</methods>*/
}
