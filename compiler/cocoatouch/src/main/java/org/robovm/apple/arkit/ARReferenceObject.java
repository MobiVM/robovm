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
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ARKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ARReferenceObject/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class ARReferenceObjectPtr extends Ptr<ARReferenceObject, ARReferenceObjectPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ARReferenceObject.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ARReferenceObject() {}
    protected ARReferenceObject(Handle h, long handle) { super(h, handle); }
    protected ARReferenceObject(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithArchiveURL:error:")
    public ARReferenceObject(NSURL url, NSError.NSErrorPtr error) { super((SkipInit) null); initObject(init(url, error)); }
    @Method(selector = "initWithCoder:")
    public ARReferenceObject(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "setName:")
    public native void setName(String v);
    @Property(selector = "center")
    public native @ByVal VectorFloat3 getCenter();
    @Property(selector = "extent")
    public native @ByVal VectorFloat3 getExtent();
    @Property(selector = "scale")
    public native @ByVal VectorFloat3 getScale();
    @Property(selector = "rawFeaturePoints")
    public native ARPointCloud getRawFeaturePoints();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 12.0 and later.
     */
    @GlobalValue(symbol="ARReferenceObjectArchiveExtension", optional=true)
    public static native String getArchiveExtension();
    
    @Method(selector = "initWithArchiveURL:error:")
    protected native @Pointer long init(NSURL url, NSError.NSErrorPtr error);
    @Method(selector = "exportObjectToURL:previewImage:error:")
    public native boolean exportObject(NSURL url, UIImage previewImage, NSError.NSErrorPtr error);
    @Method(selector = "referenceObjectByApplyingTransform:")
    public native ARReferenceObject referenceObjectByApplyingTransform(@ByVal MatrixFloat4x4 transform);
    @Method(selector = "referenceObjectByMergingObject:error:")
    public native ARReferenceObject referenceObjectByMerging(ARReferenceObject object, NSError.NSErrorPtr error);
    @Method(selector = "referenceObjectsInGroupNamed:bundle:")
    public static native NSSet<ARReferenceObject> referenceObjectsInGroup(String name, NSBundle bundle);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
