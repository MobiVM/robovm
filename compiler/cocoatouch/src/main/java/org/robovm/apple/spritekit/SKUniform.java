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
 * @since Available in iOS 8.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("SpriteKit") @NativeClass @WeaklyLinked/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SKUniform/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class SKUniformPtr extends Ptr<SKUniform, SKUniformPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SKUniform.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SKUniform() {}
    protected SKUniform(Handle h, long handle) { super(h, handle); }
    protected SKUniform(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithName:")
    public SKUniform(String name) { super((SkipInit) null); initObject(init(name)); }
    @Method(selector = "initWithName:texture:")
    public SKUniform(String name, SKTexture texture) { super((SkipInit) null); initObject(init(name, texture)); }
    @Method(selector = "initWithName:float:")
    public SKUniform(String name, float value) { super((SkipInit) null); initObject(init(name, value)); }
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "initWithName:vectorFloat2:")
    public SKUniform(String name, @ByVal VectorFloat2 value) { super((SkipInit) null); initObject(init(name, value)); }
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "initWithName:vectorFloat3:")
    public SKUniform(String name, @ByVal VectorFloat3 value) { super((SkipInit) null); initObject(init(name, value)); }
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "initWithName:vectorFloat4:")
    public SKUniform(String name, @ByVal VectorFloat4 value) { super((SkipInit) null); initObject(init(name, value)); }
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "initWithName:matrixFloat2x2:")
    public SKUniform(String name, @ByVal MatrixFloat2x4 value) { super((SkipInit) null); initObject(init(name, value)); }
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "initWithName:matrixFloat3x3:")
    public SKUniform(String name, @ByVal MatrixFloat3x4 value) { super((SkipInit) null); initObject(init(name, value)); }
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "initWithName:matrixFloat4x4:")
    public SKUniform(String name, @ByVal MatrixFloat4x4 value) { super((SkipInit) null); initObject(init(name, value)); }
    /**
     * @since Available in iOS 7.0 and later.
     * @deprecated Deprecated in iOS 10.0.
     */
    @Deprecated
    @Method(selector = "initWithName:floatVector2:")
    public SKUniform(String name, @ByVal GLKVector2 value) { super((SkipInit) null); initObject(init(name, value)); }
    /**
     * @since Available in iOS 7.0 and later.
     * @deprecated Deprecated in iOS 10.0.
     */
    @Deprecated
    @Method(selector = "initWithName:floatVector3:")
    public SKUniform(String name, @ByVal GLKVector3 value) { super((SkipInit) null); initObject(init(name, value)); }
    /**
     * @since Available in iOS 7.0 and later.
     * @deprecated Deprecated in iOS 10.0.
     */
    @Deprecated
    @Method(selector = "initWithName:floatVector4:")
    public SKUniform(String name, @ByVal GLKVector4 value) { super((SkipInit) null); initObject(init(name, value)); }
    /**
     * @since Available in iOS 7.0 and later.
     * @deprecated Deprecated in iOS 10.0.
     */
    @Deprecated
    @Method(selector = "initWithName:floatMatrix2:")
    public SKUniform(String name, @ByVal GLKMatrix2 value) { super((SkipInit) null); initObject(init(name, value)); }
    /**
     * @since Available in iOS 7.0 and later.
     * @deprecated Deprecated in iOS 10.0.
     */
    @Deprecated
    @Method(selector = "initWithName:floatMatrix3:")
    public SKUniform(String name, @ByVal GLKMatrix3 value) { super((SkipInit) null); initObject(init(name, value)); }
    /**
     * @since Available in iOS 7.0 and later.
     * @deprecated Deprecated in iOS 10.0.
     */
    @Deprecated
    @Method(selector = "initWithName:floatMatrix4:")
    public SKUniform(String name, @ByVal GLKMatrix4 value) { super((SkipInit) null); initObject(init(name, value)); }
    @Method(selector = "initWithCoder:")
    public SKUniform(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "uniformType")
    public native SKUniformType getUniformType();
    @Property(selector = "textureValue")
    public native SKTexture getTextureValue();
    @Property(selector = "setTextureValue:")
    public native void setTextureValue(SKTexture v);
    @Property(selector = "floatValue")
    public native float getFloatValue();
    @Property(selector = "setFloatValue:")
    public native void setFloatValue(float v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "vectorFloat2Value")
    public native @ByVal VectorFloat2 getVectorFloat2Value();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setVectorFloat2Value:")
    public native void setVectorFloat2Value(@ByVal VectorFloat2 v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "vectorFloat3Value")
    public native @ByVal VectorFloat3 getVectorFloat3Value();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setVectorFloat3Value:")
    public native void setVectorFloat3Value(@ByVal VectorFloat3 v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "vectorFloat4Value")
    public native @ByVal VectorFloat4 getVectorFloat4Value();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setVectorFloat4Value:")
    public native void setVectorFloat4Value(@ByVal VectorFloat4 v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "matrixFloat2x2Value")
    public native @ByVal MatrixFloat2x4 getMatrixFloat2x2Value();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setMatrixFloat2x2Value:")
    public native void setMatrixFloat2x2Value(@ByVal MatrixFloat2x4 v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "matrixFloat3x3Value")
    public native @ByVal MatrixFloat3x4 getMatrixFloat3x3Value();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setMatrixFloat3x3Value:")
    public native void setMatrixFloat3x3Value(@ByVal MatrixFloat3x4 v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "matrixFloat4x4Value")
    public native @ByVal MatrixFloat4x4 getMatrixFloat4x4Value();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setMatrixFloat4x4Value:")
    public native void setMatrixFloat4x4Value(@ByVal MatrixFloat4x4 v);
    /**
     * @since Available in iOS 7.0 and later.
     * @deprecated Deprecated in iOS 10.0.
     */
    @Deprecated
    @Property(selector = "floatVector2Value")
    public native @ByVal GLKVector2 getFloatVector2Value();
    /**
     * @since Available in iOS 7.0 and later.
     * @deprecated Deprecated in iOS 10.0.
     */
    @Deprecated
    @Property(selector = "setFloatVector2Value:")
    public native void setFloatVector2Value(@ByVal GLKVector2 v);
    /**
     * @since Available in iOS 7.0 and later.
     * @deprecated Deprecated in iOS 10.0.
     */
    @Deprecated
    @Property(selector = "floatVector3Value")
    public native @ByVal GLKVector3 getFloatVector3Value();
    /**
     * @since Available in iOS 7.0 and later.
     * @deprecated Deprecated in iOS 10.0.
     */
    @Deprecated
    @Property(selector = "setFloatVector3Value:")
    public native void setFloatVector3Value(@ByVal GLKVector3 v);
    /**
     * @since Available in iOS 7.0 and later.
     * @deprecated Deprecated in iOS 10.0.
     */
    @Deprecated
    @Property(selector = "floatVector4Value")
    public native @ByVal GLKVector4 getFloatVector4Value();
    /**
     * @since Available in iOS 7.0 and later.
     * @deprecated Deprecated in iOS 10.0.
     */
    @Deprecated
    @Property(selector = "setFloatVector4Value:")
    public native void setFloatVector4Value(@ByVal GLKVector4 v);
    /**
     * @since Available in iOS 7.0 and later.
     * @deprecated Deprecated in iOS 10.0.
     */
    @Deprecated
    @Property(selector = "floatMatrix2Value")
    public native @ByVal GLKMatrix2 getFloatMatrix2Value();
    /**
     * @since Available in iOS 7.0 and later.
     * @deprecated Deprecated in iOS 10.0.
     */
    @Deprecated
    @Property(selector = "setFloatMatrix2Value:")
    public native void setFloatMatrix2Value(@ByVal GLKMatrix2 v);
    /**
     * @since Available in iOS 7.0 and later.
     * @deprecated Deprecated in iOS 10.0.
     */
    @Deprecated
    @Property(selector = "floatMatrix3Value")
    public native @ByVal GLKMatrix3 getFloatMatrix3Value();
    /**
     * @since Available in iOS 7.0 and later.
     * @deprecated Deprecated in iOS 10.0.
     */
    @Deprecated
    @Property(selector = "setFloatMatrix3Value:")
    public native void setFloatMatrix3Value(@ByVal GLKMatrix3 v);
    /**
     * @since Available in iOS 7.0 and later.
     * @deprecated Deprecated in iOS 10.0.
     */
    @Deprecated
    @Property(selector = "floatMatrix4Value")
    public native @ByVal GLKMatrix4 getFloatMatrix4Value();
    /**
     * @since Available in iOS 7.0 and later.
     * @deprecated Deprecated in iOS 10.0.
     */
    @Deprecated
    @Property(selector = "setFloatMatrix4Value:")
    public native void setFloatMatrix4Value(@ByVal GLKMatrix4 v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithName:")
    protected native @Pointer long init(String name);
    @Method(selector = "initWithName:texture:")
    protected native @Pointer long init(String name, SKTexture texture);
    @Method(selector = "initWithName:float:")
    protected native @Pointer long init(String name, float value);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "initWithName:vectorFloat2:")
    protected native @Pointer long init(String name, @ByVal VectorFloat2 value);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "initWithName:vectorFloat3:")
    protected native @Pointer long init(String name, @ByVal VectorFloat3 value);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "initWithName:vectorFloat4:")
    protected native @Pointer long init(String name, @ByVal VectorFloat4 value);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "initWithName:matrixFloat2x2:")
    protected native @Pointer long init(String name, @ByVal MatrixFloat2x4 value);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "initWithName:matrixFloat3x3:")
    protected native @Pointer long init(String name, @ByVal MatrixFloat3x4 value);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "initWithName:matrixFloat4x4:")
    protected native @Pointer long init(String name, @ByVal MatrixFloat4x4 value);
    /**
     * @since Available in iOS 7.0 and later.
     * @deprecated Deprecated in iOS 10.0.
     */
    @Deprecated
    @Method(selector = "initWithName:floatVector2:")
    protected native @Pointer long init(String name, @ByVal GLKVector2 value);
    /**
     * @since Available in iOS 7.0 and later.
     * @deprecated Deprecated in iOS 10.0.
     */
    @Deprecated
    @Method(selector = "initWithName:floatVector3:")
    protected native @Pointer long init(String name, @ByVal GLKVector3 value);
    /**
     * @since Available in iOS 7.0 and later.
     * @deprecated Deprecated in iOS 10.0.
     */
    @Deprecated
    @Method(selector = "initWithName:floatVector4:")
    protected native @Pointer long init(String name, @ByVal GLKVector4 value);
    /**
     * @since Available in iOS 7.0 and later.
     * @deprecated Deprecated in iOS 10.0.
     */
    @Deprecated
    @Method(selector = "initWithName:floatMatrix2:")
    protected native @Pointer long init(String name, @ByVal GLKMatrix2 value);
    /**
     * @since Available in iOS 7.0 and later.
     * @deprecated Deprecated in iOS 10.0.
     */
    @Deprecated
    @Method(selector = "initWithName:floatMatrix3:")
    protected native @Pointer long init(String name, @ByVal GLKMatrix3 value);
    /**
     * @since Available in iOS 7.0 and later.
     * @deprecated Deprecated in iOS 10.0.
     */
    @Deprecated
    @Method(selector = "initWithName:floatMatrix4:")
    protected native @Pointer long init(String name, @ByVal GLKMatrix4 value);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
