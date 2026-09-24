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
package org.robovm.apple.mapkit;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 18.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MapKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MKAddressFilter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class MKAddressFilterPtr extends Ptr<MKAddressFilter, MKAddressFilterPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MKAddressFilter.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MKAddressFilter() {}
    protected MKAddressFilter(Handle h, long handle) { super(h, handle); }
    protected MKAddressFilter(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initIncludingOptions:")
    public static MKAddressFilter createIncludingOptions(MKAddressFilterOption options) {
       MKAddressFilter res = new MKAddressFilter((SkipInit) null);
       res.initObject(res.initIncludingOptions(options));
       return res;
    }
    @Method(selector = "initExcludingOptions:")
    public static MKAddressFilter createExcludingOptions(MKAddressFilterOption options) {
       MKAddressFilter res = new MKAddressFilter((SkipInit) null);
       res.initObject(res.initExcludingOptions(options));
       return res;
    }
    @Method(selector = "initWithCoder:")
    public MKAddressFilter(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "filterIncludingAll")
    public static native MKAddressFilter getFilterIncludingAll();
    @Property(selector = "filterExcludingAll")
    public static native MKAddressFilter getFilterExcludingAll();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initIncludingOptions:")
    protected native @Pointer long initIncludingOptions(MKAddressFilterOption options);
    @Method(selector = "initExcludingOptions:")
    protected native @Pointer long initExcludingOptions(MKAddressFilterOption options);
    @Method(selector = "includesOptions:")
    public native boolean includesOptions(MKAddressFilterOption options);
    @Method(selector = "excludesOptions:")
    public native boolean excludesOptions(MKAddressFilterOption options);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
