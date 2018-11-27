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
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreImage") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CISampler/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CISamplerPtr extends Ptr<CISampler, CISamplerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CISampler.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CISampler() {}
    protected CISampler(Handle h, long handle) { super(h, handle); }
    protected CISampler(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithImage:")
    public CISampler(CIImage im) { super((SkipInit) null); initObject(init(im)); }
    @Method(selector = "initWithImage:options:")
    public CISampler(CIImage im, NSDictionary<?, ?> dict) { super((SkipInit) null); initObject(init(im, dict)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "definition")
    public native CIFilterShape getDefinition();
    @Property(selector = "extent")
    public native @ByVal CGRect getExtent();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithImage:")
    protected native @Pointer long init(CIImage im);
    @Method(selector = "initWithImage:options:")
    protected native @Pointer long init(CIImage im, NSDictionary<?, ?> dict);
    /*</methods>*/
}
