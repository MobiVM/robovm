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
package org.robovm.apple.arkit;

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
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.scenekit.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.spritekit.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.imageio.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ARKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ARSession/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ARSessionPtr extends Ptr<ARSession, ARSessionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ARSession.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ARSession() {}
    protected ARSession(Handle h, long handle) { super(h, handle); }
    protected ARSession(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native ARSessionDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(ARSessionDelegate v);
    @Property(selector = "delegateQueue")
    public native DispatchQueue getDelegateQueue();
    @Property(selector = "setDelegateQueue:")
    public native void setDelegateQueue(DispatchQueue v);
    @Property(selector = "currentFrame")
    public native ARFrame getCurrentFrame();
    @Property(selector = "configuration")
    public native ARConfiguration getConfiguration();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "runWithConfiguration:")
    public native void run(ARConfiguration configuration);
    @Method(selector = "runWithConfiguration:options:")
    public native void run(ARConfiguration configuration, ARSessionRunOptions options);
    @Method(selector = "pause")
    public native void pause();
    @Method(selector = "addAnchor:")
    public native void addAnchor(ARAnchor anchor);
    @Method(selector = "removeAnchor:")
    public native void removeAnchor(ARAnchor anchor);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "setWorldOrigin:")
    public native void setWorldOrigin(@ByVal MatrixFloat4x4 relativeTransform);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "getCurrentWorldMapWithCompletionHandler:")
    public native void getCurrentWorldMap(@Block VoidBlock2<ARWorldMap, NSError> completionHandler);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "createReferenceObjectWithTransform:center:extent:completionHandler:")
    public native void createReferenceObject(@ByVal MatrixFloat4x4 transform, @ByVal VectorFloat3 center, @ByVal VectorFloat3 extent, @Block VoidBlock2<ARReferenceObject, NSError> completionHandler);
    /*</methods>*/
}
