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
package org.robovm.apple.coremotion;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreMotion") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CMTremorResult/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CMTremorResultPtr extends Ptr<CMTremorResult, CMTremorResultPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CMTremorResult.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CMTremorResult() {}
    protected CMTremorResult(Handle h, long handle) { super(h, handle); }
    protected CMTremorResult(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public CMTremorResult(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "startDate")
    public native NSDate getStartDate();
    @Property(selector = "endDate")
    public native NSDate getEndDate();
    @Property(selector = "percentUnknown")
    public native float getPercentUnknown();
    @Property(selector = "percentNone")
    public native float getPercentNone();
    @Property(selector = "percentSlight")
    public native float getPercentSlight();
    @Property(selector = "percentMild")
    public native float getPercentMild();
    @Property(selector = "percentModerate")
    public native float getPercentModerate();
    @Property(selector = "percentStrong")
    public native float getPercentStrong();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
