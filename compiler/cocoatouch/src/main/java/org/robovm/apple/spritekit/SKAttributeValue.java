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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("SpriteKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SKAttributeValue/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class SKAttributeValuePtr extends Ptr<SKAttributeValue, SKAttributeValuePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SKAttributeValue.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SKAttributeValue() {}
    protected SKAttributeValue(Handle h, long handle) { super(h, handle); }
    protected SKAttributeValue(SkipInit skipInit) { super(skipInit); }
    public SKAttributeValue(float value) { super((Handle) null, create(value)); retain(getHandle()); }
    public SKAttributeValue(@ByVal VectorFloat2 value) { super((Handle) null, create(value)); retain(getHandle()); }
    public SKAttributeValue(@ByVal VectorFloat3 value) { super((Handle) null, create(value)); retain(getHandle()); }
    public SKAttributeValue(@ByVal VectorFloat4 value) { super((Handle) null, create(value)); retain(getHandle()); }
    @Method(selector = "initWithCoder:")
    public SKAttributeValue(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "floatValue")
    public native float getFloatValue();
    @Property(selector = "setFloatValue:")
    public native void setFloatValue(float v);
    @Property(selector = "vectorFloat2Value")
    public native @ByVal VectorFloat2 getVectorFloat2Value();
    @Property(selector = "setVectorFloat2Value:")
    public native void setVectorFloat2Value(@ByVal VectorFloat2 v);
    @Property(selector = "vectorFloat3Value")
    public native @ByVal VectorFloat3 getVectorFloat3Value();
    @Property(selector = "setVectorFloat3Value:")
    public native void setVectorFloat3Value(@ByVal VectorFloat3 v);
    @Property(selector = "vectorFloat4Value")
    public native @ByVal VectorFloat4 getVectorFloat4Value();
    @Property(selector = "setVectorFloat4Value:")
    public native void setVectorFloat4Value(@ByVal VectorFloat4 v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "valueWithFloat:")
    protected static native @Pointer long create(float value);
    @Method(selector = "valueWithVectorFloat2:")
    protected static native @Pointer long create(@ByVal VectorFloat2 value);
    @Method(selector = "valueWithVectorFloat3:")
    protected static native @Pointer long create(@ByVal VectorFloat3 value);
    @Method(selector = "valueWithVectorFloat4:")
    protected static native @Pointer long create(@ByVal VectorFloat4 value);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
