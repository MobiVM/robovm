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
package org.robovm.apple.spritekit;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.glkit.*;
import org.robovm.apple.scenekit.*;
import org.robovm.apple.gameplaykit.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("SpriteKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SKCropNode/*</name>*/ 
    extends /*<extends>*/SKNode/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SKCropNodePtr extends Ptr<SKCropNode, SKCropNodePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SKCropNode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SKCropNode() {}
    protected SKCropNode(Handle h, long handle) { super(h, handle); }
    protected SKCropNode(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public SKCropNode(NSCoder coder) { super(coder); }
    public SKCropNode(String filename) { super((Handle) null, create(filename)); retain(getHandle()); }
    /**
     * @since Available in iOS 12.0 and later.
     */
    public SKCropNode(String filename, NSSet<?> classes) throws NSErrorException {
       this(filename, classes, new NSError.NSErrorPtr());
    }
    private SKCropNode(String filename, NSSet<?> classes, NSError.NSErrorPtr ptr) throws NSErrorException {
       super((Handle) null, create(filename, classes, ptr));
       retain(getHandle());
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
    }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "maskNode")
    public native SKNode getMaskNode();
    @Property(selector = "setMaskNode:")
    public native void setMaskNode(SKNode v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "nodeWithFileNamed:")
    protected static native @Pointer long create(String filename);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "nodeWithFileNamed:securelyWithClasses:andError:")
    protected static native @Pointer long create(String filename, NSSet<?> classes, NSError.NSErrorPtr error);
    /*</methods>*/
}
