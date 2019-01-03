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
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ModelIO") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MDLTransform/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MDLTransformComponent/*</implements>*/ {

    /*<ptr>*/public static class MDLTransformPtr extends Ptr<MDLTransform, MDLTransformPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MDLTransform.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MDLTransform() {}
    protected MDLTransform(Handle h, long handle) { super(h, handle); }
    protected MDLTransform(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTransformComponent:")
    public MDLTransform(MDLTransformComponent component) { super((SkipInit) null); initObject(init(component)); }
    @Method(selector = "initWithTransformComponent:resetsTransform:")
    public MDLTransform(MDLTransformComponent component, boolean resetsTransform) { super((SkipInit) null); initObject(init(component, resetsTransform)); }
    @Method(selector = "initWithMatrix:")
    public MDLTransform(@ByVal MatrixFloat4x4 matrix) { super((SkipInit) null); initObject(init(matrix)); }
    @Method(selector = "initWithMatrix:resetsTransform:")
    public MDLTransform(@ByVal MatrixFloat4x4 matrix, boolean resetsTransform) { super((SkipInit) null); initObject(init(matrix, resetsTransform)); }
    /*</constructors>*/
    public MDLTransform(boolean identity) {
        super((SkipInit) null);
        initObject(identity ? initWithIdentity() : init());
    }
    /*<properties>*/
    @Property(selector = "translation")
    public native @ByVal VectorFloat3 getTranslation();
    @Property(selector = "setTranslation:")
    public native void setTranslation(@ByVal VectorFloat3 v);
    @Property(selector = "rotation")
    public native @ByVal VectorFloat3 getRotation();
    @Property(selector = "setRotation:")
    public native void setRotation(@ByVal VectorFloat3 v);
    @Property(selector = "shear")
    public native @ByVal VectorFloat3 getShear();
    @Property(selector = "setShear:")
    public native void setShear(@ByVal VectorFloat3 v);
    @Property(selector = "scale")
    public native @ByVal VectorFloat3 getScale();
    @Property(selector = "setScale:")
    public native void setScale(@ByVal VectorFloat3 v);
    @Property(selector = "matrix")
    public native @ByVal MatrixFloat4x4 getMatrix();
    @Property(selector = "setMatrix:")
    public native void setMatrix(@ByVal MatrixFloat4x4 v);
    @Property(selector = "resetsTransform")
    public native boolean resetsTransform();
    @Property(selector = "setResetsTransform:")
    public native void setResetsTransform(boolean v);
    @Property(selector = "minimumTime")
    public native double getMinimumTime();
    @Property(selector = "maximumTime")
    public native double getMaximumTime();
    @Property(selector = "keyTimes")
    public native NSArray<NSNumber> getKeyTimes();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 11.0.
     */
    @Deprecated
    @Method(selector = "initWithIdentity")
    protected native @Pointer long initWithIdentity();
    @Method(selector = "initWithTransformComponent:")
    protected native @Pointer long init(MDLTransformComponent component);
    @Method(selector = "initWithTransformComponent:resetsTransform:")
    protected native @Pointer long init(MDLTransformComponent component, boolean resetsTransform);
    @Method(selector = "initWithMatrix:")
    protected native @Pointer long init(@ByVal MatrixFloat4x4 matrix);
    @Method(selector = "initWithMatrix:resetsTransform:")
    protected native @Pointer long init(@ByVal MatrixFloat4x4 matrix, boolean resetsTransform);
    @Method(selector = "setIdentity")
    public native void setIdentity();
    @Method(selector = "translationAtTime:")
    public native @ByVal VectorFloat3 getTranslation(double time);
    @Method(selector = "rotationAtTime:")
    public native @ByVal VectorFloat3 getRotation(double time);
    @Method(selector = "shearAtTime:")
    public native @ByVal VectorFloat3 getShear(double time);
    @Method(selector = "scaleAtTime:")
    public native @ByVal VectorFloat3 getScale(double time);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "setMatrix:forTime:")
    public native void setMatrix(@ByVal MatrixFloat4x4 matrix, double time);
    @Method(selector = "setTranslation:forTime:")
    public native void setTranslation(@ByVal VectorFloat3 translation, double time);
    @Method(selector = "setRotation:forTime:")
    public native void setRotation(@ByVal VectorFloat3 rotation, double time);
    @Method(selector = "setShear:forTime:")
    public native void setShear(@ByVal VectorFloat3 shear, double time);
    @Method(selector = "setScale:forTime:")
    public native void setScale(@ByVal VectorFloat3 scale, double time);
    @Method(selector = "rotationMatrixAtTime:")
    public native @ByVal MatrixFloat4x4 getRotationMatrix(double time);
    @Method(selector = "setLocalTransform:forTime:")
    public native void setLocalTransform(@ByVal MatrixFloat4x4 transform, double time);
    @Method(selector = "setLocalTransform:")
    public native void setLocalTransform(@ByVal MatrixFloat4x4 transform);
    @Method(selector = "localTransformAtTime:")
    public native @ByVal MatrixFloat4x4 getLocalTransform(double time);
    /*</methods>*/
    @Method(selector = "globalTransformWithObject:atTime:")
    public static native MatrixFloat4x4 getGlobalTransform(MDLObject object, double time);
}
