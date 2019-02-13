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
package org.robovm.apple.scenekit;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.glkit.*;
import org.robovm.apple.spritekit.*;
import org.robovm.apple.opengles.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("SceneKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SCNReferenceNode/*</name>*/ 
    extends /*<extends>*/SCNNode/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SCNReferenceNodePtr extends Ptr<SCNReferenceNode, SCNReferenceNodePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SCNReferenceNode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SCNReferenceNode() {}
    protected SCNReferenceNode(Handle h, long handle) { super(h, handle); }
    protected SCNReferenceNode(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithURL:")
    public SCNReferenceNode(NSURL referenceURL) { super((SkipInit) null); initObject(init(referenceURL)); }
    @Method(selector = "initWithCoder:")
    public SCNReferenceNode(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "referenceURL")
    public native NSURL getReferenceURL();
    @Property(selector = "setReferenceURL:")
    public native void setReferenceURL(NSURL v);
    @Property(selector = "loadingPolicy")
    public native SCNReferenceLoadingPolicy getLoadingPolicy();
    @Property(selector = "setLoadingPolicy:")
    public native void setLoadingPolicy(SCNReferenceLoadingPolicy v);
    @Property(selector = "isLoaded")
    public native boolean isLoaded();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithURL:")
    protected native @Pointer long init(NSURL referenceURL);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    @Method(selector = "load")
    public native void load();
    @Method(selector = "unload")
    public native void unload();
    /*</methods>*/
}
