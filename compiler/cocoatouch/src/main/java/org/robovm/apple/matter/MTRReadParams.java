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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRReadParams/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class MTRReadParamsPtr extends Ptr<MTRReadParams, MTRReadParamsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRReadParams.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTRReadParams() {}
    protected MTRReadParams(Handle h, long handle) { super(h, handle); }
    protected MTRReadParams(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public MTRReadParams(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "shouldFilterByFabric")
    public native boolean isFilterByFabric();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setFilterByFabric:")
    public native void setFilterByFabric(boolean v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "minEventNumber")
    public native NSNumber getMinEventNumber();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setMinEventNumber:")
    public native void setMinEventNumber(NSNumber v);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Property(selector = "shouldAssumeUnknownAttributesReportable")
    public native boolean isAssumeUnknownAttributesReportable();
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Property(selector = "setAssumeUnknownAttributesReportable:")
    public native void setAssumeUnknownAttributesReportable(boolean v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
