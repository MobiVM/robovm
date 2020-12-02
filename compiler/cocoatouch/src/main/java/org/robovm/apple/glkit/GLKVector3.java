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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GLKVector3/*</name>*/ 
    extends /*<extends>*/Struct<GLKVector3>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GLKVector3Ptr extends Ptr<GLKVector3, GLKVector3Ptr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(GLKVector3.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GLKVector3() {}
    public GLKVector3(FloatBuffer v) {
        this.setV(v);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native @Array({3}) FloatBuffer getV();
    @StructMember(0) public native GLKVector3 setV(@Array({3}) FloatBuffer v);
    /*</members>*/
    /*<methods>*/

    //
    // manually added methods  as apple moved these from global to static inline
    //
    /**
     * ported from GLKVector3Make
     */
    public static GLKVector3 create(float x, float y, float z) {
        float[] v = {x, y, z};
        return create(v);
    }

    /**
     * ported from GLKVector3MakeWithArray
     */
    public static GLKVector3 create(float[] values) {
        return new GLKVector3(FloatBuffer.wrap(values));
    }

    /**
     * ported from GLKVector3Negate
     */
    public GLKVector3 negate() {
        float[] v = { -getV().get(0), -getV().get(1), -getV().get(2) };
        return create(v);
    }

    public GLKVector3 add(GLKVector3 vectorRight) { return add(this, vectorRight); }
    /**
     * ported from GLKVector3Add
     */
    public static GLKVector3 add(GLKVector3 vectorLeft, GLKVector3 vectorRight) {
        float[] vectorLeft_v = new float[3];
        float[] vectorRight_v = new float[3];
        vectorLeft.getV().get(vectorLeft_v);
        vectorRight.getV().get(vectorRight_v);

        float[] v = {
                vectorLeft_v[0] + vectorRight_v[0],
                vectorLeft_v[1] + vectorRight_v[1],
                vectorLeft_v[2] + vectorRight_v[2] };
        return create(v);
    }

    public GLKVector3 subtract(GLKVector3 vectorRight) { return subtract(this, vectorRight); }
    /**
     * ported from GLKVector3Subtract
     */
    public static GLKVector3 subtract(GLKVector3 vectorLeft, GLKVector3 vectorRight) {
        float[] vectorLeft_v = new float[3];
        float[] vectorRight_v = new float[3];
        vectorLeft.getV().get(vectorLeft_v);
        vectorRight.getV().get(vectorRight_v);

        float[] v = {
                vectorLeft_v[0] - vectorRight_v[0],
                vectorLeft_v[1] - vectorRight_v[1],
                vectorLeft_v[2] - vectorRight_v[2] };
        return create(v);
    }

    public GLKVector3 multiply(GLKVector3 vectorRight) { return multiply(this, vectorRight); }
    /**
     * ported from GLKVector3Multiply
     */
    public static GLKVector3 multiply(GLKVector3 vectorLeft, GLKVector3 vectorRight) {
        float[] vectorLeft_v = new float[3];
        float[] vectorRight_v = new float[3];
        vectorLeft.getV().get(vectorLeft_v);
        vectorRight.getV().get(vectorRight_v);

        float[] v = {
                vectorLeft_v[0] * vectorRight_v[0],
                vectorLeft_v[1] * vectorRight_v[1],
                vectorLeft_v[2] * vectorRight_v[2] };
        return create(v);
    }

    public GLKVector3 divide(GLKVector3 vectorRight) { return divide(this, vectorRight); }
    /**
     * ported from GLKVector3Divide
     */
    public static GLKVector3 divide(GLKVector3 vectorLeft, GLKVector3 vectorRight) {
        float[] vectorLeft_v = new float[3];
        float[] vectorRight_v = new float[3];
        vectorLeft.getV().get(vectorLeft_v);
        vectorRight.getV().get(vectorRight_v);

        float[] v = {
                vectorLeft_v[0] / vectorRight_v[0],
                vectorLeft_v[1] / vectorRight_v[1],
                vectorLeft_v[2] / vectorRight_v[2] };
        return create(v);
    }

    /**
     * ported from GLKVector3AddScalar
     */
    public GLKVector3 addScalar(float value) {
        float[] vectorLeft_v = new float[3];
        this.getV().get(vectorLeft_v);

        float[] v = {
                vectorLeft_v[0] + value,
                vectorLeft_v[1] + value,
                vectorLeft_v[2] + value };
        return create(v);
    }

    /**
     * ported from GLKVector3SubtractScalar
     */
    public GLKVector3 subtractScalar(float value) {
        float[] vectorLeft_v = new float[3];
        this.getV().get(vectorLeft_v);

        float[] v = {
                vectorLeft_v[0] - value,
                vectorLeft_v[1] - value,
                vectorLeft_v[2] - value };
        return create(v);
    }

    /**
     * ported from GLKVector3MultiplyScalar
     */
    public GLKVector3 multiplyScalar(float value) {
        float[] vectorLeft_v = new float[3];
        this.getV().get(vectorLeft_v);

        float[] v = {
                vectorLeft_v[0] * value,
                vectorLeft_v[1] * value,
                vectorLeft_v[2] * value };
        return create(v);
    }

    /**
     * ported from GLKVector3DivideScalar
     */
    public GLKVector3 divideScalar(float value) {
        float[] vectorLeft_v = new float[3];
        this.getV().get(vectorLeft_v);

        float[] v = {
                vectorLeft_v[0] / value,
                vectorLeft_v[1] / value,
                vectorLeft_v[2] / value };
        return create(v);
    }

    public GLKVector3 maximum(GLKVector3 vectorRight) { return maximum(this, vectorRight); }
    /**
     * ported from GLKVector3Maximum
     */
    public static GLKVector3 maximum(GLKVector3 vectorLeft, GLKVector3 vectorRight) {
        float[] vectorLeft_v = new float[3];
        float[] vectorRight_v = new float[3];
        vectorLeft.getV().get(vectorLeft_v);
        vectorRight.getV().get(vectorRight_v);
        GLKVector3 max = vectorLeft.copy();
        if (vectorRight_v[0] > vectorLeft_v[0])
            max.getV().put(0, vectorRight_v[0]);
        if (vectorRight_v[1] > vectorLeft_v[1])
            max.getV().put(1, vectorRight_v[1]);
        if (vectorRight_v[2] > vectorLeft_v[2])
            max.getV().put(2, vectorRight_v[2]);
        return max;
    }

    public GLKVector3 minimum(GLKVector3 vectorRight) { return minimum(this, vectorRight); }
    /**
     * ported from GLKVector3Minimum
     */
    public static GLKVector3 minimum(GLKVector3 vectorLeft, GLKVector3 vectorRight) {
        float[] vectorLeft_v = new float[3];
        float[] vectorRight_v = new float[3];
        vectorLeft.getV().get(vectorLeft_v);
        vectorRight.getV().get(vectorRight_v);
        GLKVector3 min = vectorLeft.copy();
        if (vectorRight_v[0] < vectorLeft_v[0])
            min.getV().put(0, vectorRight_v[0]);
        if (vectorRight_v[1] < vectorLeft_v[1])
            min.getV().put(1, vectorRight_v[1]);
        if (vectorRight_v[2] < vectorLeft_v[2])
            min.getV().put(2, vectorRight_v[2]);
        return min;
    }

    /**
     * ported from GLKVector3AllEqualToVector3
     */
    public boolean allEqualToVector3(GLKVector3 vectorRight) { return allEqualToVector3(this, vectorRight); }
    /**
     * ported from GLKVector3AllEqualToVector3
     */
    public static boolean allEqualToVector3(GLKVector3 vectorLeft, GLKVector3 vectorRight) {
        float[] vectorLeft_v = new float[3];
        float[] vectorRight_v = new float[3];
        vectorLeft.getV().get(vectorLeft_v);
        vectorRight.getV().get(vectorRight_v);
        boolean compare = false;
        if (vectorLeft_v[0] == vectorRight_v[0] &&
                vectorLeft_v[1] == vectorRight_v[1] &&
                vectorLeft_v[2] == vectorRight_v[2])
            compare = true;
        return compare;
    }

    /**
     * ported from GLKVector3AllEqualToScalar
     */
    public boolean allEqualToScalar(float value) {
        boolean compare = false;
        if (getV().get(0) == value && getV().get(1) == value && getV().get(2) == value)
            compare = true;
        return compare;
    }

    public boolean allGreaterThanVector3(GLKVector3 vectorRight) { return allGreaterThanVector3(this, vectorRight); }
    /**
     * ported from GLKVector3AllGreaterThanVector3
     */
    public static boolean allGreaterThanVector3(GLKVector3 vectorLeft, GLKVector3 vectorRight) {
        float[] vectorLeft_v = new float[3];
        float[] vectorRight_v = new float[3];
        vectorLeft.getV().get(vectorLeft_v);
        vectorRight.getV().get(vectorRight_v);
        boolean compare = false;
        if (vectorLeft_v[0] > vectorRight_v[0] &&
                vectorLeft_v[1] > vectorRight_v[1] &&
                vectorLeft_v[2] > vectorRight_v[2])
            compare = true;
        return compare;
    }

    /**
     * ported from GLKVector3AllGreaterThanScalar
     */
    public boolean allGreaterThanScalar(float value) {
        boolean compare = false;
        if (getV().get(0) > value && getV().get(1) > value && getV().get(2) > value)
            compare = true;
        return compare;
    }

    public boolean allGreaterThanOrEqualToVector3(GLKVector3 vectorRight) { return allGreaterThanOrEqualToVector3(this, vectorRight); }
    /**
     * ported from GLKVector3AllGreaterThanOrEqualToVector3
     */
    public static boolean allGreaterThanOrEqualToVector3(GLKVector3 vectorLeft, GLKVector3 vectorRight) {
        float[] vectorLeft_v = new float[3];
        float[] vectorRight_v = new float[3];
        vectorLeft.getV().get(vectorLeft_v);
        vectorRight.getV().get(vectorRight_v);
        boolean compare = false;
        if (vectorLeft_v[0] >= vectorRight_v[0] &&
                vectorLeft_v[1] >= vectorRight_v[1] &&
                vectorLeft_v[2] >= vectorRight_v[2])
            compare = true;
        return compare;
    }

    /**
     * ported from GLKVector3AllGreaterThanOrEqualToScalar
     */
    public boolean allGreaterThanOrEqualToScalar(float value) {
        boolean compare = false;
        if (getV().get(0) >= value && getV().get(1) >= value && getV().get(2) >= value)
            compare = true;
        return compare;
    }

    /**
     * ported from GLKVector3Normalize
     */
    public GLKVector3 normalize() {
        float scale = 1.0f / this.length();
        float[] v = { getV().get(0) * scale, getV().get(1) * scale, getV().get(2) * scale };
        return create(v);
    }

    public float dotProduct(GLKVector3 vectorRight) { return dotProduct(this, vectorRight); }
    /**
     * ported from GLKVector3DotProduct
     */
    public static float dotProduct(GLKVector3 vectorLeft, GLKVector3 vectorRight) {
        float[] vectorLeft_v = new float[3];
        float[] vectorRight_v = new float[3];
        vectorLeft.getV().get(vectorLeft_v);
        vectorRight.getV().get(vectorRight_v);
        return vectorLeft_v[0] * vectorRight_v[0] + vectorLeft_v[1] * vectorRight_v[1] + vectorLeft_v[2] * vectorRight_v[2];
    }

    /**
     * ported from GLKVector3Length
     */
    public float length() {
        float[] vector_v = new float[3];
        this.getV().get(vector_v);
        return (float) Math.sqrt(vector_v[0] * vector_v[0] + vector_v[1] * vector_v[1] + vector_v[2] * vector_v[2]);
    }

    public float distance(GLKVector3 vectorEnd) { return distance(this, vectorEnd); }
    /**
     * ported from GLKVector3Distance
     */
    public static float distance(GLKVector3 vectorStart, GLKVector3 vectorEnd) {
        return subtract(vectorEnd, vectorStart).length();
    }

    public GLKVector3 lerp(GLKVector3 vectorEnd, float t) { return lerp(this, vectorEnd, t); }
    /**
     * ported from GLKVector3Lerp
     */
    public static GLKVector3 lerp(GLKVector3 vectorStart, GLKVector3 vectorEnd, float t) {
        float[] vectorStart_v = new float[3];
        float[] vectorEnd_v = new float[3];
        vectorStart.getV().get(vectorStart_v);
        vectorEnd.getV().get(vectorEnd_v);
        float[] v = {
                vectorStart_v[0] + ((vectorEnd_v[0] - vectorStart_v[0]) * t),
                vectorStart_v[1] + ((vectorEnd_v[1] - vectorStart_v[1]) * t),
                vectorStart_v[2] + ((vectorEnd_v[2] - vectorStart_v[2]) * t) };
        return create(v);
    }

    public GLKVector3 crossProduct(GLKVector3 vectorRight) { return crossProduct(this, vectorRight); }
    /**
     * ported from GLKVector3CrossProduct
     */
    public static GLKVector3 crossProduct(GLKVector3 vectorLeft, GLKVector3 vectorRight) {
        float[] vectorLeft_v = new float[3];
        float[] vectorRight_v = new float[3];
        vectorLeft.getV().get(vectorLeft_v);
        vectorRight.getV().get(vectorRight_v);
        float[] v = {
                vectorLeft_v[1] * vectorRight_v[2] - vectorLeft_v[2] * vectorRight_v[1],
                vectorLeft_v[2] * vectorRight_v[0] - vectorLeft_v[0] * vectorRight_v[2],
                vectorLeft_v[0] * vectorRight_v[1] - vectorLeft_v[1] * vectorRight_v[0] };
        return create(v);
    }

    public GLKVector3 project(GLKVector3 projectionVector) { return project(this, projectionVector); }
    /**
     * ported from GLKVector3Project
     */
    public static GLKVector3 project(GLKVector3 vectorToProject, GLKVector3 projectionVector) {
        float scale = dotProduct(projectionVector, vectorToProject) / dotProduct(projectionVector, projectionVector);
        GLKVector3 v = projectionVector.multiplyScalar(scale);
        return v;
    }
}
