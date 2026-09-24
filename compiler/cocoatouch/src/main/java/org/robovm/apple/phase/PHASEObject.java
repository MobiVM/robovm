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
package org.robovm.apple.phase;

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
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.modelio.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("PHASE") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PHASEObject/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PHASEObjectPtr extends Ptr<PHASEObject, PHASEObjectPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PHASEObject.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected PHASEObject() {}
    protected PHASEObject(Handle h, long handle) { super(h, handle); }
    protected PHASEObject(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithEngine:")
    public PHASEObject(PHASEEngine engine) { super((SkipInit) null); initObject(init(engine)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "parent")
    public native PHASEObject getParent();
    @Property(selector = "children")
    public native NSArray<PHASEObject> getChildren();
    @Property(selector = "right")
    public static native @ByVal VectorFloat3 getRight();
    @Property(selector = "up")
    public static native @ByVal VectorFloat3 getUp();
    @Property(selector = "forward")
    public static native @ByVal VectorFloat3 getForward();
    @Property(selector = "transform")
    public native @ByVal MatrixFloat4x4 getTransform();
    @Property(selector = "setTransform:")
    public native void setTransform(@ByVal MatrixFloat4x4 v);
    @Property(selector = "worldTransform")
    public native @ByVal MatrixFloat4x4 getWorldTransform();
    @Property(selector = "setWorldTransform:")
    public native void setWorldTransform(@ByVal MatrixFloat4x4 v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithEngine:")
    protected native @Pointer long init(PHASEEngine engine);
    public boolean addChild(PHASEObject child) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = addChild(child, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "addChild:error:")
    private native boolean addChild(PHASEObject child, NSError.NSErrorPtr error);
    @Method(selector = "removeChild:")
    public native void removeChild(PHASEObject child);
    @Method(selector = "removeChildren")
    public native void removeChildren();
    /*</methods>*/
}
