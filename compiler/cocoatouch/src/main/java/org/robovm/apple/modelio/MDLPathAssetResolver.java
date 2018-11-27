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
package org.robovm.apple.modelio;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ModelIO") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MDLPathAssetResolver/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MDLAssetResolver/*</implements>*/ {

    /*<ptr>*/public static class MDLPathAssetResolverPtr extends Ptr<MDLPathAssetResolver, MDLPathAssetResolverPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MDLPathAssetResolver.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MDLPathAssetResolver() {}
    protected MDLPathAssetResolver(Handle h, long handle) { super(h, handle); }
    protected MDLPathAssetResolver(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPath:")
    public MDLPathAssetResolver(String path) { super((SkipInit) null); initObject(init(path)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "path")
    public native String getPath();
    @Property(selector = "setPath:")
    public native void setPath(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPath:")
    protected native @Pointer long init(String path);
    @Method(selector = "canResolveAssetNamed:")
    public native boolean canResolveAssetNamed(String name);
    @Method(selector = "resolveAssetNamed:")
    public native NSURL resolveAssetNamed(String name);
    /*</methods>*/
}
