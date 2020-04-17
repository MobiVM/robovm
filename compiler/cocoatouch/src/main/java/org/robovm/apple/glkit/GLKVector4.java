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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GLKVector4/*</name>*/ 
    extends /*<extends>*/Struct<GLKVector4>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GLKVector4Ptr extends Ptr<GLKVector4, GLKVector4Ptr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(GLKVector4.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GLKVector4() {}
    public GLKVector4(FloatBuffer v) {
        this.setV(v);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native @Array({4}) FloatBuffer getV();
    @StructMember(0) public native GLKVector4 setV(@Array({4}) FloatBuffer v);
    /*</members>*/
    /*<methods>*//*</methods>*/

    //
    // manually added methods  as apple moved these from global to static inline
    //
    /**
     * ported from GLKVector4Make
     */
    public static GLKVector4 create(float x, float y, float z, float w) {
        float[] v = {x, y, z, w};
        return create(v);
    }

    /**
     * ported from GLKVector4MakeWithArray
     */
    public static GLKVector4 create(float[] values) {
        if (values == null || values.length != 4)
            throw new IllegalArgumentException();
        return new GLKVector4(FloatBuffer.wrap(values));
    }

    /**
     * ported from GLKVector4MakeWithVector3
     */
    public static GLKVector4 create(GLKVector3 vector, float w) {
        float[] v = {vector.getV().get(0), vector.getV().get(1), vector.getV().get(2), w};
        return create(v);
    }

    /**
     * ported from GLKVector4Negate
     */
    public GLKVector4 negate() {
        float[] v = { -getV().get(0), -getV().get(1), -getV().get(2), -getV().get(3) };
        return create(v);
    }

    public GLKVector4 add(GLKVector4 vectorRight) { return add(this, vectorRight); }
    /**
     * ported from GLKVector4Add
     */
    public static GLKVector4 add(GLKVector4 vectorLeft, GLKVector4 vectorRight) {
        float[] vectorLeft_v = new float[4];
        float[] vectorRight_v = new float[4];
        vectorLeft.getV().get(vectorLeft_v);
        vectorRight.getV().get(vectorRight_v);
        float[] v = {
                vectorLeft_v[0] + vectorRight_v[0],
                vectorLeft_v[1] + vectorRight_v[1],
                vectorLeft_v[2] + vectorRight_v[2],
                vectorLeft_v[3] + vectorRight_v[3] };
        return create(v);
    }

    public GLKVector4 subtract(GLKVector4 vectorRight) { return subtract(this, vectorRight); }
    /**
     * ported from GLKVector4Subtract
     */
    public static GLKVector4 subtract(GLKVector4 vectorLeft, GLKVector4 vectorRight) {
        float[] vectorLeft_v = new float[4];
        float[] vectorRight_v = new float[4];
        vectorLeft.getV().get(vectorLeft_v);
        vectorRight.getV().get(vectorRight_v);
        float[] v = {
                vectorLeft_v[0] - vectorRight_v[0],
                vectorLeft_v[1] - vectorRight_v[1],
                vectorLeft_v[2] - vectorRight_v[2],
                vectorLeft_v[3] - vectorRight_v[3] };
        return create(v);
    }

    public GLKVector4 multiply(GLKVector4 vectorRight) { return multiply(this, vectorRight); }
    /**
     * ported from GLKVector4Multiply
     */
    public static GLKVector4 multiply(GLKVector4 vectorLeft, GLKVector4 vectorRight) {
        float[] vectorLeft_v = new float[4];
        float[] vectorRight_v = new float[4];
        vectorLeft.getV().get(vectorLeft_v);
        vectorRight.getV().get(vectorRight_v);
        float[] v = {
                vectorLeft_v[0] * vectorRight_v[0],
                vectorLeft_v[1] * vectorRight_v[1],
                vectorLeft_v[2] * vectorRight_v[2],
                vectorLeft_v[3] * vectorRight_v[3] };
        return create(v);
    }

    public GLKVector4 divide(GLKVector4 vectorRight) { return divide(this, vectorRight); }
    /**
     * ported from GLKVector4Divide
     */
    public static GLKVector4 divide(GLKVector4 vectorLeft, GLKVector4 vectorRight) {
        float[] vectorLeft_v = new float[4];
        float[] vectorRight_v = new float[4];
        vectorLeft.getV().get(vectorLeft_v);
        vectorRight.getV().get(vectorRight_v);
        float[] v = {
                vectorLeft_v[0] / vectorRight_v[0],
                vectorLeft_v[1] / vectorRight_v[1],
                vectorLeft_v[2] / vectorRight_v[2],
                vectorLeft_v[3] / vectorRight_v[3] };
        return create(v);
    }

    /**
     * ported from GLKVector4AddScalar
     */
    public GLKVector4 addScalar(float value) {
        float[] vector_v = new float[4];
        this.getV().get(vector_v);
        float[] v = {
                vector_v[0] + value,
                vector_v[1] + value,
                vector_v[2] + value,
                vector_v[3] + value };
        return create(v);
    }

    /**
     * ported from GLKVector4SubtractScalar
     */
    public GLKVector4 subtractScalar(float value) {
        float[] vector_v = new float[4];
        this.getV().get(vector_v);
        float[] v = {
                vector_v[0] - value,
                vector_v[1] - value,
                vector_v[2] - value,
                vector_v[3] - value };
        return create(v);
    }

    /**
     * ported from GLKVector4MultiplyScalar
     */
    public GLKVector4 multiplyScalar(float value) {
        float[] vector_v = new float[4];
        this.getV().get(vector_v);
        float[] v = {
                vector_v[0] * value,
                vector_v[1] * value,
                vector_v[2] * value,
                vector_v[3] * value };
        return create(v);
    }

    /**
     * ported from GLKVector4DivideScalar
     */
    public GLKVector4 divideScalar(float value) {
        float[] vector_v = new float[4];
        this.getV().get(vector_v);
        float[] v = {
                vector_v[0] / value,
                vector_v[1] / value,
                vector_v[2] / value,
                vector_v[3] / value };
        return create(v);
    }

    public GLKVector4 maximum(GLKVector4 vectorRight) { return maximum(this, vectorRight); }
    /**
     * ported from GLKVector4Maximum
     */
    public static GLKVector4 maximum(GLKVector4 vectorLeft, GLKVector4 vectorRight) {
        float[] vectorLeft_v = new float[4];
        float[] vectorRight_v = new float[4];
        vectorLeft.getV().get(vectorLeft_v);
        vectorRight.getV().get(vectorRight_v);
        GLKVector4 max = vectorLeft.copy();
        if (vectorRight_v[0] > vectorLeft_v[0])
            max.getV().put(0, vectorRight_v[0]);
        if (vectorRight_v[1] > vectorLeft_v[1])
            max.getV().put(1, vectorRight_v[1]);
        if (vectorRight_v[2] > vectorLeft_v[2])
            max.getV().put(2, vectorRight_v[2]);
        if (vectorRight_v[3] > vectorLeft_v[3])
            max.getV().put(3, vectorRight_v[3]);
        return max;
    }

    public GLKVector4 minimum(GLKVector4 vectorRight) { return minimum(this, vectorRight); }
    /**
     * ported from GLKVector4Minimum
     */
    public static GLKVector4 minimum(GLKVector4 vectorLeft, GLKVector4 vectorRight) {
        float[] vectorLeft_v = new float[4];
        float[] vectorRight_v = new float[4];
        vectorLeft.getV().get(vectorLeft_v);
        vectorRight.getV().get(vectorRight_v);
        GLKVector4 min = vectorLeft.copy();
        if (vectorRight_v[0] < vectorLeft_v[0])
            min.getV().put(0, vectorRight_v[0]);
        if (vectorRight_v[1] < vectorLeft_v[1])
            min.getV().put(1, vectorRight_v[1]);
        if (vectorRight_v[2] < vectorLeft_v[2])
            min.getV().put(2, vectorRight_v[2]);
        if (vectorRight_v[3] < vectorLeft_v[3])
            min.getV().put(3, vectorRight_v[3]);
        return min;
    }

    public boolean allEqualToVector4(GLKVector4 vectorRight) { return allEqualToVector4(this, vectorRight); }
    /**
     * ported from GLKVector4AllEqualToVector4
     */
    public static boolean allEqualToVector4(GLKVector4 vectorLeft, GLKVector4 vectorRight) {
        float[] vectorLeft_v = new float[4];
        float[] vectorRight_v = new float[4];
        vectorLeft.getV().get(vectorLeft_v);
        vectorRight.getV().get(vectorRight_v);
        boolean compare = false;
        if (vectorLeft_v[0] == vectorRight_v[0] &&
                vectorLeft_v[1] == vectorRight_v[1] &&
                vectorLeft_v[2] == vectorRight_v[2] &&
                vectorLeft_v[3] == vectorRight_v[3])
            compare = true;
        return compare;
    }

    /**
     * ported from GLKVector4AllEqualToScalar
     */
    public boolean allEqualToScalar(float value) {
        boolean compare = false;
        if (getV().get(0) == value && getV().get(1) == value && getV().get(2) == value && getV().get(3) == value)
            compare = true;
        return compare;
    }

    public boolean allGreaterThanVector4(GLKVector4 vectorRight) { return allGreaterThanVector4(this, vectorRight); }
    /**
     * ported from GLKVector4AllGreaterThanVector4
     */
    public static boolean allGreaterThanVector4(GLKVector4 vectorLeft, GLKVector4 vectorRight) {
        float[] vectorLeft_v = new float[4];
        float[] vectorRight_v = new float[4];
        vectorLeft.getV().get(vectorLeft_v);
        vectorRight.getV().get(vectorRight_v);
        boolean compare = false;
        if (vectorLeft_v[0] > vectorRight_v[0] &&
                vectorLeft_v[1] > vectorRight_v[1] &&
                vectorLeft_v[2] > vectorRight_v[2] &&
                vectorLeft_v[3] > vectorRight_v[3])
            compare = true;
        return compare;
    }

    /**
     * ported from GLKVector4AllGreaterThanScalar
     */
    public boolean allGreaterThanScalar(float value) {
        boolean compare = false;
        if (getV().get(0) > value && getV().get(1) > value && getV().get(2) > value && getV().get(3) > value)
            compare = true;
        return compare;
    }

    public boolean allGreaterThanOrEqualToVector4(GLKVector4 vectorRight) { return allGreaterThanOrEqualToVector4(this, vectorRight); }
    /**
     * ported from GLKVector4AllGreaterThanOrEqualToVector4
     */
    public static boolean allGreaterThanOrEqualToVector4(GLKVector4 vectorLeft, GLKVector4 vectorRight) {
        float[] vectorLeft_v = new float[4];
        float[] vectorRight_v = new float[4];
        vectorLeft.getV().get(vectorLeft_v);
        vectorRight.getV().get(vectorRight_v);
        boolean compare = false;
        if (vectorLeft_v[0] >= vectorRight_v[0] &&
                vectorLeft_v[1] >= vectorRight_v[1] &&
                vectorLeft_v[2] >= vectorRight_v[2] &&
                vectorLeft_v[3] >= vectorRight_v[3])
            compare = true;
        return compare;
    }

    /**
     * ported from allGreaterThanOrEqualToScalar
     */
    public boolean allGreaterThanOrEqualToScalar(float value) {
        boolean compare = false;
        if (getV().get(0) >= value && getV().get(1) >= value && getV().get(2) >= value && getV().get(3) >= value)
            compare = true;
        return compare;
    }

    /**
     * ported from GLKVector4Normalize
     */
    public GLKVector4 normalize() {
        float scale = 1.0f / this.length();
        GLKVector4 v = this.multiplyScalar(scale);
        return v;
    }

    public float dotProduct(GLKVector4 vectorRight) { return dotProduct(this, vectorRight); }
    /**
     * ported from GLKVector4DotProduct
     */
    public static float dotProduct(GLKVector4 vectorLeft, GLKVector4 vectorRight) {
        float[] vectorLeft_v = new float[4];
        float[] vectorRight_v = new float[4];
        vectorLeft.getV().get(vectorLeft_v);
        vectorRight.getV().get(vectorRight_v);
        return
                vectorLeft_v[0] * vectorRight_v[0] +
                vectorLeft_v[1] * vectorRight_v[1] +
                vectorLeft_v[2] * vectorRight_v[2] +
                vectorLeft_v[3] * vectorRight_v[3];    
    }

    /**
     * ported from GLKVector4Length
     */
    public float length() {
        float[] vector_v = new float[4];
        this.getV().get(vector_v);
        return (float) Math.sqrt(
                vector_v[0] * vector_v[0] +
                vector_v[1] * vector_v[1] +
                vector_v[2] * vector_v[2] +
                vector_v[3] * vector_v[3]);
    }

    public float distance(GLKVector4 vectorEnd) { return distance(this, vectorEnd); }
    /**
     * ported from GLKVector4Distance
     */
    public static float distance(GLKVector4 vectorStart, GLKVector4 vectorEnd) {
        return subtract(vectorEnd, vectorStart).length();
    }

    public GLKVector4 lerp(GLKVector4 vectorEnd, float t) { return lerp(this, vectorEnd, t); }
    /**
     * ported from GLKVector4Lerp
     */
    public static GLKVector4 lerp(GLKVector4 vectorStart, GLKVector4 vectorEnd, float t) {
        float[] vectorStart_v = new float[4];
        float[] vectorEnd_v = new float[4];
        vectorStart.getV().get(vectorStart_v);
        vectorEnd.getV().get(vectorEnd_v);
        float[] v = { vectorStart_v[0] + ((vectorEnd_v[0] - vectorStart_v[0]) * t),
                vectorStart_v[1] + ((vectorEnd_v[1] - vectorStart_v[1]) * t),
                vectorStart_v[2] + ((vectorEnd_v[2] - vectorStart_v[2]) * t),
                vectorStart_v[3] + ((vectorEnd_v[3] - vectorStart_v[3]) * t) };
        return create(v);
    }

    public GLKVector4 crossProduct(GLKVector4 vectorRight) { return crossProduct(this, vectorRight); }
    /**
     * ported from GLKVector4CrossProduct
     */
    public static GLKVector4 crossProduct(GLKVector4 vectorLeft, GLKVector4 vectorRight) {
        float[] vectorLeft_v = new float[4];
        float[] vectorRight_v = new float[4];
        vectorLeft.getV().get(vectorLeft_v);
        vectorRight.getV().get(vectorRight_v);
        float[] v = {
                vectorLeft_v[1] * vectorRight_v[2] - vectorLeft_v[2] * vectorRight_v[1],
                vectorLeft_v[2] * vectorRight_v[0] - vectorLeft_v[0] * vectorRight_v[2],
                vectorLeft_v[0] * vectorRight_v[1] - vectorLeft_v[1] * vectorRight_v[0],
                0.0f };
        return create(v);
    }

    public GLKVector4 project(GLKVector4 projectionVector) { return project(this, projectionVector); }
    /**
     * ported from GLKVector4Project
     */
    public static GLKVector4 project(GLKVector4 vectorToProject, GLKVector4 projectionVector) {
        float scale = dotProduct(projectionVector, vectorToProject) / dotProduct(projectionVector, projectionVector);
        GLKVector4 v = projectionVector.multiplyScalar(scale);
        return v;
    }
}
