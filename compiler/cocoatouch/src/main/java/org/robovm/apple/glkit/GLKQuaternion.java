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
package org.robovm.apple.glkit;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.modelio.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("GLKit")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GLKQuaternion/*</name>*/ 
    extends /*<extends>*/Struct<GLKQuaternion>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GLKQuaternionPtr extends Ptr<GLKQuaternion, GLKQuaternionPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(GLKQuaternion.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GLKQuaternion() {}
    public GLKQuaternion(FloatBuffer q) {
        this.setQ(q);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native @Array({4}) FloatBuffer getQ();
    @StructMember(0) public native GLKQuaternion setQ(@Array({4}) FloatBuffer q);
    /*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="GLKQuaternionIdentity", optional=true)
    public static native @ByVal GLKQuaternion Identity();
    
    @Bridge(symbol="GLKQuaternionMakeWithMatrix3", optional=true)
    public static native @ByVal GLKQuaternion create(@ByVal GLKMatrix3 matrix);
    @Bridge(symbol="GLKQuaternionMakeWithMatrix4", optional=true)
    public static native @ByVal GLKQuaternion create(@ByVal GLKMatrix4 matrix);
    public float angle() { return angle(this); }
    @Bridge(symbol="GLKQuaternionAngle", optional=true)
    private static native float angle(@ByVal GLKQuaternion quaternion);
    public GLKVector3 axis() { return axis(this); }
    @Bridge(symbol="GLKQuaternionAxis", optional=true)
    private static native @ByVal GLKVector3 axis(@ByVal GLKQuaternion quaternion);
    public GLKQuaternion slerp(GLKQuaternion quaternionEnd, float t) { return slerp(this, quaternionEnd, t); }
    @Bridge(symbol="GLKQuaternionSlerp", optional=true)
    private static native @ByVal GLKQuaternion slerp(@ByVal GLKQuaternion quaternionStart, @ByVal GLKQuaternion quaternionEnd, float t);
    public void rotateVector3Array(GLKVector3 vectors, @MachineSizedUInt long vectorCount) { rotateVector3Array(this, vectors, vectorCount); }
    @Bridge(symbol="GLKQuaternionRotateVector3Array", optional=true)
    private static native void rotateVector3Array(@ByVal GLKQuaternion quaternion, GLKVector3 vectors, @MachineSizedUInt long vectorCount);
    public void rotateVector4Array(GLKVector4 vectors, @MachineSizedUInt long vectorCount) { rotateVector4Array(this, vectors, vectorCount); }
    @Bridge(symbol="GLKQuaternionRotateVector4Array", optional=true)
    private static native void rotateVector4Array(@ByVal GLKQuaternion quaternion, GLKVector4 vectors, @MachineSizedUInt long vectorCount);
    /*</methods>*/

    //
    // manually added methods  as apple moved these from global to static inline
    //
    /**
     * ported from GLKQuaternionMake
     */
    public static GLKQuaternion create(float x, float y, float z, float w) {
        float[] v = {x, y, z, w};
        return create(v);
    }

    /**
     * ported from GLKQuaternionMakeWithVector3
     */
    public static GLKQuaternion create(GLKVector3 vector, float scalar) {
        float[] v = {vector.getV().get(0), vector.getV().get(1), vector.getV().get(2), scalar};
        return create(v);
    }

    /**
     * ported from GLKQuaternionMakeWithArray
     */
    public static GLKQuaternion create(float[] values) {
        return new GLKQuaternion(FloatBuffer.wrap(values));
    }

    /**
     * ported from GLKQuaternionMakeWithAngleAndAxis
     */
    public static GLKQuaternion createRotation(float radians, float x, float y, float z) {
        float halfAngle = radians * 0.5f;
        float scale = (float) Math.sin(halfAngle);
        float[] q = { scale * x, scale * y, scale * z, (float) Math.cos(halfAngle)};
        return create(q);

    }

    /**
     * ported from GLKQuaternionMakeWithAngleAndVector3Axis
     */
    public static GLKQuaternion createRotation(float radians, GLKVector3 axisVector) {
        return createRotation(radians, axisVector.getV().get(0), axisVector.getV().get(1), axisVector.getV().get(2));
    }

    public GLKQuaternion add(GLKQuaternion quaternionRight) { return add(this, quaternionRight); }
    /**
     * ported from GLKQuaternionAdd
     */
    public static GLKQuaternion add(GLKQuaternion quaternionLeft, GLKQuaternion quaternionRight) {
        float[] quaternionLeft_q = new float[4];
        float[] quaternionRight_q = new float[4];
        quaternionLeft.getQ().get(quaternionLeft_q);
        quaternionRight.getQ().get(quaternionRight_q);

        float[] q = {
                quaternionLeft_q[0] + quaternionRight_q[0],
                quaternionLeft_q[1] + quaternionRight_q[1],
                quaternionLeft_q[2] + quaternionRight_q[2],
                quaternionLeft_q[3] + quaternionRight_q[3] };
        return create(q);
    }

    public GLKQuaternion subtract(GLKQuaternion quaternionRight) { return subtract(this, quaternionRight); }
    /**
     * ported from GLKQuaternionSubtract
     */
    public static GLKQuaternion subtract(GLKQuaternion quaternionLeft, GLKQuaternion quaternionRight) {
        float[] quaternionLeft_q = new float[4];
        float[] quaternionRight_q = new float[4];
        quaternionLeft.getQ().get(quaternionLeft_q);
        quaternionRight.getQ().get(quaternionRight_q);

        float[] q = {
                quaternionLeft_q[0] - quaternionRight_q[0],
                quaternionLeft_q[1] - quaternionRight_q[1],
                quaternionLeft_q[2] - quaternionRight_q[2],
                quaternionLeft_q[3] - quaternionRight_q[3] };
        return create(q);
    }

    public GLKQuaternion multiply(GLKQuaternion quaternionRight) { return multiply(this, quaternionRight); }
    /**
     * ported from GLKQuaternionMultiply
     */
    public static GLKQuaternion multiply(GLKQuaternion quaternionLeft, GLKQuaternion quaternionRight) {
        float[] quaternionLeft_q = new float[4];
        float[] quaternionRight_q = new float[4];
        quaternionLeft.getQ().get(quaternionLeft_q);
        quaternionRight.getQ().get(quaternionRight_q);

        float[] q = {
                quaternionLeft_q[3] * quaternionRight_q[0] +
                quaternionLeft_q[0] * quaternionRight_q[3] +
                quaternionLeft_q[1] * quaternionRight_q[2] -
                quaternionLeft_q[2] * quaternionRight_q[1],

                quaternionLeft_q[3] * quaternionRight_q[1] +
                quaternionLeft_q[1] * quaternionRight_q[3] +
                quaternionLeft_q[2] * quaternionRight_q[0] -
                quaternionLeft_q[0] * quaternionRight_q[2],

                quaternionLeft_q[3] * quaternionRight_q[2] +
                quaternionLeft_q[2] * quaternionRight_q[3] +
                quaternionLeft_q[0] * quaternionRight_q[1] -
                quaternionLeft_q[1] * quaternionRight_q[0],

                quaternionLeft_q[3] * quaternionRight_q[3] -
                quaternionLeft_q[0] * quaternionRight_q[0] -
                quaternionLeft_q[1] * quaternionRight_q[1] -
                quaternionLeft_q[2] * quaternionRight_q[2] };
        return create(q);
    }

    /**
     * ported from GLKQuaternionLength
     */
    public float length() {
        float[] quaternion_q = new float[4];
        this.getQ().get(quaternion_q);
        return (float) Math.sqrt(quaternion_q[0] * quaternion_q[0] +
                quaternion_q[1] * quaternion_q[1] +
                quaternion_q[2] * quaternion_q[2] +
                quaternion_q[3] * quaternion_q[3]);
    }

    /**
     * ported from GLKQuaternionConjugate
     */
    public GLKQuaternion conjugate() {
        float[] q = { -getQ().get(0), -getQ().get(1), -getQ().get(2), getQ().get(3) };
        return create(q);
    }

    /**
     * ported from GLKQuaternionInvert
     */
    public GLKQuaternion invert() {
        float[] quaternion_q = new float[4];
        this.getQ().get(quaternion_q);
        float scale = 1.0f / (
                quaternion_q[0] * quaternion_q[0] +
                quaternion_q[1] * quaternion_q[1] +
                quaternion_q[2] * quaternion_q[2] +
                quaternion_q[3] * quaternion_q[3]);
        float[] q = { -quaternion_q[0] * scale, -quaternion_q[1] * scale, -quaternion_q[2] * scale, quaternion_q[3] * scale };
        return create(q);
    }

    /**
     * ported from GLKQuaternionNormalize
     */
    public GLKQuaternion normalize() {
        float[] quaternion_q = new float[4];
        this.getQ().get(quaternion_q);
        float scale = 1.0f / this.length();
        float[] q = { quaternion_q[0] * scale, quaternion_q[1] * scale, quaternion_q[2] * scale, quaternion_q[3] * scale };
        return create(q);
    }

    /**
     * ported from GLKQuaternionRotateVector3
     */
    public GLKVector3 rotateVector3(GLKVector3 vector) {
        GLKQuaternion rotatedQuaternion = create(vector, 0.0f);
        rotatedQuaternion = this.multiply(rotatedQuaternion).multiply(this.invert());

        return GLKVector3.create(rotatedQuaternion.getQ().get(0), rotatedQuaternion.getQ().get(1), rotatedQuaternion.getQ().get(2));
    }

    /**
     * ported from GLKQuaternionRotateVector4
     */
    public GLKVector4 rotateVector4(GLKVector4 vector) {
        GLKQuaternion rotatedQuaternion = create(vector.getV().get(0), vector.getV().get(1), vector.getV().get(2), 0.0f);
        rotatedQuaternion = this.multiply(rotatedQuaternion).multiply(this.invert());

        return GLKVector4.create(rotatedQuaternion.getQ().get(0), rotatedQuaternion.getQ().get(1), rotatedQuaternion.getQ().get(2), rotatedQuaternion.getQ().get(3));
    }
}
