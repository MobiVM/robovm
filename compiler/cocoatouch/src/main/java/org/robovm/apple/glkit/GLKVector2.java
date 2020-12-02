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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GLKVector2/*</name>*/ 
    extends /*<extends>*/Struct<GLKVector2>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GLKVector2Ptr extends Ptr<GLKVector2, GLKVector2Ptr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(GLKVector2.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GLKVector2() {}
    public GLKVector2(FloatBuffer v) {
        this.setV(v);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native @Array({2}) FloatBuffer getV();
    @StructMember(0) public native GLKVector2 setV(@Array({2}) FloatBuffer v);
    /*</members>*/
    /*<methods>*//*</methods>*/

    //
    // manually added methods  as apple moved these from global to static inline
    //
    /**
     * ported from GLKVector2Make
     */
    public static GLKVector2 create(float x, float y) {
        return create(new float[]{x,y});
    }

    /**
     * ported from GLKVector2MakeWithArray
     */
    public static GLKVector2 create(float[] values) {
        return new GLKVector2(FloatBuffer.wrap(values));
    }

    /**
     * ported from GLKVector2Negate
     */
    public GLKVector2 negate() {
        float[] v = { -this.getV().get(0) , -this.getV().get(1) };
        return create(v);
    }

    public GLKVector2 add(GLKVector2 vectorRight) { return add(this, vectorRight); }
    /**
     * ported from GLKVector2Add
     */
    public static GLKVector2 add(GLKVector2 vectorLeft, GLKVector2 vectorRight) {
        float[] v = {
                vectorLeft.getV().get(0) + vectorRight.getV().get(0),
                vectorLeft.getV().get(1) + vectorRight.getV().get(1) };
        return create(v);
    }

    public GLKVector2 subtract(GLKVector2 vectorRight) { return subtract(this, vectorRight); }
    /**
     * ported from GLKVector2Subtract
     */
    public static GLKVector2 subtract(GLKVector2 vectorLeft, GLKVector2 vectorRight) {
        float[] v = {
                vectorLeft.getV().get(0) - vectorRight.getV().get(0),
                vectorLeft.getV().get(1) - vectorRight.getV().get(1) };
        return create(v);
    }

    public GLKVector2 multiply(GLKVector2 vectorRight) { return multiply(this, vectorRight); }
    /**
     * ported from GLKVector2Multiply
     */
    public static GLKVector2 multiply(GLKVector2 vectorLeft, GLKVector2 vectorRight) {
        float[] v = {
                vectorLeft.getV().get(0) * vectorRight.getV().get(0),
                vectorLeft.getV().get(1) * vectorRight.getV().get(1) };
        return create(v);
    }

    /**
     * ported from GLKVector2Divide
     */
    public GLKVector2 divide(GLKVector2 vectorRight) {
        float[] v = {
                this.getV().get(0) / vectorRight.getV().get(0),
                this.getV().get(1) / vectorRight.getV().get(1) };
        return create(v);
    }

    /**
     * ported from GLKVector2AddScalar
     */
    public GLKVector2 addScalar(float value) {
        float[] v = {
                this.getV().get(0) + value,
                this.getV().get(1) + value };
        return create(v);
    }

    /**
     * ported from GLKVector2SubtractScalar
     */
    public GLKVector2 subtractScalar(float value) {
        float[] v = {
                this.getV().get(0) - value,
                this.getV().get(1) - value };
        return create(v);
    }

    /**
     * ported from GLKVector2SubtractScalar
     */
    public GLKVector2 multiplyScalar(float value) {
        float[] v = {
                this.getV().get(0) * value,
                this.getV().get(1) * value };
        return create(v);
    }

    /**
     * ported from GLKVector2DivideScalar
     */
    public GLKVector2 divideScalar(float value) {
        float[] v = {
                this.getV().get(0) / value,
                this.getV().get(1) / value };
        return create(v);
    }

    public GLKVector2 maximum(GLKVector2 vectorRight) { return maximum(this, vectorRight); }
    /**
     * ported from GLKVector2Maximum
     */
    public static GLKVector2 maximum(GLKVector2 vectorLeft, GLKVector2 vectorRight) {
        GLKVector2 max = vectorLeft.copy();
        if (vectorRight.getV().get(0) > vectorLeft.getV().get(0))
            max.getV().put(0, vectorRight.getV().get(0));
        if (vectorRight.getV().get(1) > vectorLeft.getV().get(1))
            max.getV().put(1, vectorRight.getV().get(1));
        return max;
    }

    /**
     * ported from GLKVector2Minimum
     */
    public GLKVector2 minimum(GLKVector2 vectorRight) { return minimum(this, vectorRight); }
    /**
     * ported from GLKVector2Minimum
     */
    public static GLKVector2 minimum(GLKVector2 vectorLeft, GLKVector2 vectorRight) {
        GLKVector2 min = vectorLeft.copy();
        if (vectorRight.getV().get(0) < vectorLeft.getV().get(0))
            min.getV().put(0, vectorRight.getV().get(0));
        if (vectorRight.getV().get(1) < vectorLeft.getV().get(1))
            min.getV().put(1, vectorRight.getV().get(1));
        return min;
    }

    /**
     * ported from GLKVector2AllEqualToVector2
     */
    public boolean allEqualToVector2(GLKVector2 vectorRight) { return allEqualToVector2(this, vectorRight); }
    /**
     * ported from GLKVector2AllEqualToVector2
     */
    public static boolean allEqualToVector2(GLKVector2 vectorLeft, GLKVector2 vectorRight) {
        boolean compare = false;
        if (vectorLeft.getV().get(0) == vectorRight.getV().get(0) &&
                vectorLeft.getV().get(1) == vectorRight.getV().get(1))
            compare = true;
        return compare;
    }

    /**
     * ported from GLKVector2AllEqualToScalar
     */
    public boolean allEqualToScalar(float value) {
        boolean compare = false;
        if (this.getV().get(0) == value && this.getV().get(1) == value)
            compare = true;
        return compare;
    }

    public boolean allGreaterThanVector2(GLKVector2 vectorRight) { return allGreaterThanVector2(this, vectorRight); }
    /**
     * ported from GLKVector2AllGreaterThanVector2
     */
    public static boolean allGreaterThanVector2(GLKVector2 vectorLeft, GLKVector2 vectorRight) {
        boolean compare = false;
        if (vectorLeft.getV().get(0) > vectorRight.getV().get(0) &&
                vectorLeft.getV().get(1) > vectorRight.getV().get(1))
            compare = true;
        return compare;
    }

    /**
     * ported from GLKVector2AllGreaterThanScalar
     */
    public boolean allGreaterThanScalar(float value) {
        boolean compare = false;
        if (this.getV().get(0) > value && this.getV().get(1) > value)
            compare = true;
        return compare;
    }

    public boolean allGreaterThanOrEqualToVector2(GLKVector2 vectorRight) { return allGreaterThanOrEqualToVector2(this, vectorRight); }
    /**
     * ported from GLKVector2AllGreaterThanOrEqualToVector2
     */
    public static boolean allGreaterThanOrEqualToVector2(GLKVector2 vectorLeft, GLKVector2 vectorRight) {
        boolean compare = false;
        if (vectorLeft.getV().get(0) >= vectorRight.getV().get(0) &&
                vectorLeft.getV().get(1) >= vectorRight.getV().get(1))
            compare = true;
        return compare;
    }

    /**
     * ported from GLKVector2AllGreaterThanOrEqualToScalar
     */
    public boolean allGreaterThanOrEqualToScalar(float value) {
        boolean compare = false;
        if (this.getV().get(0) >= value && this.getV().get(1) >= value)
            compare = true;
        return compare;
    }

    /**
     * ported from GLKVector2Normalize
     */
    public GLKVector2 normalize() {
        float scale = 1.0f / this.length();
        GLKVector2 v = this.multiplyScalar(scale);
        return v;
    }

    public float dotProduct(GLKVector2 vectorRight) { return dotProduct(this, vectorRight); }
    /**
     * ported from GLKVector2DotProduct
     */
    public static float dotProduct(GLKVector2 vectorLeft, GLKVector2 vectorRight) {
        return vectorLeft.getV().get(0) * vectorRight.getV().get(0) + vectorLeft.getV().get(1) * vectorRight.getV().get(1);
    }

    /**
     * ported from GLKVector2Length
     */
    public float length() {
        return (float) Math.sqrt(getV().get(0) * getV().get(0) + getV().get(1) * getV().get(1));
    }

    public float distance(GLKVector2 vectorEnd) { return distance(this, vectorEnd); }
    /**
     * ported from GLKVector2Distance
     */
    public static float distance(GLKVector2 vectorStart, GLKVector2 vectorEnd) {
        return subtract(vectorEnd, vectorStart).length();
    }

    public GLKVector2 lerp(GLKVector2 vectorEnd, float t) { return lerp(this, vectorEnd, t); }
    /**
     * ported from GLKVector2Lerp
     */
    public static GLKVector2 lerp(GLKVector2 vectorStart, GLKVector2 vectorEnd, float t) {
        float[] v = {
                vectorStart.getV().get(0) + ((vectorEnd.getV().get(0) - vectorStart.getV().get(0)) * t),
                vectorStart.getV().get(1) + ((vectorEnd.getV().get(1) - vectorStart.getV().get(1)) * t) };
        return create(v);
    }

    public GLKVector2 project(GLKVector2 projectionVector) { return project(this, projectionVector); }
    /**
     * ported from GLKVector2Project
     */
    public static GLKVector2 project(GLKVector2 vectorToProject, GLKVector2 projectionVector) {
        float scale = dotProduct(projectionVector, vectorToProject) / dotProduct(projectionVector, projectionVector);
        GLKVector2 v = projectionVector.multiplyScalar(scale);
        return v;
    }
}
