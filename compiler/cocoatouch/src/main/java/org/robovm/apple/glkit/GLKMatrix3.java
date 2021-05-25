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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GLKMatrix3/*</name>*/
    extends /*<extends>*/Struct<GLKMatrix3>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GLKMatrix3Ptr extends Ptr<GLKMatrix3, GLKMatrix3Ptr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(GLKMatrix3.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GLKMatrix3() {}
    public GLKMatrix3(FloatBuffer m) {
        this.setM(m);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native @Array({9}) FloatBuffer getM();
    @StructMember(0) public native GLKMatrix3 setM(@Array({9}) FloatBuffer m);
    /*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="GLKMatrix3Identity", optional=true)
    public static native @ByVal GLKMatrix3 Identity();
    
    public GLKMatrix3 invert(BooleanPtr isInvertible) { return invert(this, isInvertible); }
    @Bridge(symbol="GLKMatrix3Invert", optional=true)
    private static native @ByVal GLKMatrix3 invert(@ByVal GLKMatrix3 matrix, BooleanPtr isInvertible);
    public GLKMatrix3 invertAndTranspose(BooleanPtr isInvertible) { return invertAndTranspose(this, isInvertible); }
    @Bridge(symbol="GLKMatrix3InvertAndTranspose", optional=true)
    private static native @ByVal GLKMatrix3 invertAndTranspose(@ByVal GLKMatrix3 matrix, BooleanPtr isInvertible);

    //
    // manually added methods  as apple moved these from global to static inline
    //
    /**
     * ported from GLKMatrix3Make
     */
    public static GLKMatrix3 create(float m00, float m01, float m02,
                                    float m10, float m11, float m12,
                                    float m20, float m21, float m22) {
        float[] m = {
                m00, m01, m02,
                m10, m11, m12,
                m20, m21, m22 };
        return create(m);

    }

    /**
     * ported from GLKMatrix3MakeAndTranspose
     */
    public static GLKMatrix3 createAndTranspose(float m00, float m01, float m02,
                                                float m10, float m11, float m12,
                                                float m20, float m21, float m22) {
        float[] m = {
                m00, m10, m20,
                m01, m11, m21,
                m02, m12, m22 };
        return create(m);
    }

    /**
     * ported from GLKMatrix3MakeWithArray
     */
    public static GLKMatrix3 create(float[] values) {
        return new GLKMatrix3(FloatBuffer.wrap(values));
    }

    /**
     * ported from GLKMatrix3MakeWithArrayAndTranspose
     */
    public static GLKMatrix3 createAndTranspose(float[] values) {
        float[] m = {
                values[0], values[3], values[6],
                values[1], values[4], values[7],
                values[2], values[5], values[8] };
        return create(m);
    }

    /**
     * ported from GLKMatrix3MakeWithRows
     */
    public static GLKMatrix3 createWithRows(GLKVector3 row0, GLKVector3 row1, GLKVector3 row2) {
        FloatBuffer row0_v = row0.getV();
        FloatBuffer row1_v = row1.getV();
        FloatBuffer row2_v = row2.getV();
        float[] m = {
                row0_v.get(0), row1_v.get(0), row2_v.get(0),
                row0_v.get(1), row1_v.get(1), row2_v.get(1),
                row0_v.get(2), row1_v.get(2), row2_v.get(2) };
        return create(m);

    }

    /**
     * ported from GLKMatrix3MakeWithColumns
     */
    public static GLKMatrix3 createWithColumns(GLKVector3 column0, GLKVector3 column1, GLKVector3 column2) {
        FloatBuffer column0_v = column0.getV();
        FloatBuffer column1_v = column1.getV();
        FloatBuffer column2_v = column2.getV();
        float[] m = {
                column0_v.get(0), column0_v.get(1), column0_v.get(2),
                column1_v.get(0), column1_v.get(1), column1_v.get(2),
                column2_v.get(0), column2_v.get(1), column2_v.get(2) };
        return create(m);
    }

    /**
     * ported from GLKMatrix3MakeWithQuaternion
     */
    public static GLKMatrix3 create(GLKQuaternion quaternion) {
        quaternion = quaternion.normalize();

        FloatBuffer quaternion_q = quaternion.getQ();
        float x = quaternion_q.get(0);
        float y = quaternion_q.get(1);
        float z = quaternion_q.get(2);
        float w = quaternion_q.get(3);

        float _2x = x + x;
        float _2y = y + y;
        float _2z = z + z;
        float _2w = w + w;

        float[] m = {
                1.0f - _2y * y - _2z * z,
                _2x * y + _2w * z,
                _2x * z - _2w * y,

                _2x * y - _2w * z,
                1.0f - _2x * x - _2z * z,
                _2y * z + _2w * x,

                _2x * z + _2w * y,
                _2y * z - _2w * x,
                1.0f - _2x * x - _2y * y };

        return create(m);
    }

    /**
     * ported from GLKMatrix3MakeScale
     */
    public static GLKMatrix3 createScale(float sx, float sy, float sz) {
        GLKMatrix3 m = Identity();
        FloatBuffer m_m = m.getM();
        m_m.put(0, sx);
        m_m.put(4, sy);
        m_m.put(8, sz);
        return m;
    }

    /**
     * ported from GLKMatrix3MakeRotation
     */
    public static GLKMatrix3 createRotation(float radians, float x, float y, float z) {
        GLKVector3 v = GLKVector3.create(x, y, z).normalize();
        float cos = (float) Math.cos(radians);
        float cosp = 1.0f - cos;
        float sin = (float) Math.sin(radians);

        FloatBuffer v_v = v.getV();
        float[] m = {
                cos + cosp * v_v.get(0) * v_v.get(0),
                cosp * v_v.get(0) * v_v.get(1) + v_v.get(2) * sin,
                cosp * v_v.get(0) * v_v.get(2) - v_v.get(1) * sin,

                cosp * v_v.get(0) * v_v.get(1) - v_v.get(2) * sin,
                cos + cosp * v_v.get(1) * v_v.get(1),
                cosp * v_v.get(1) * v_v.get(2) + v_v.get(0) * sin,

                cosp * v_v.get(0) * v_v.get(2) + v_v.get(1) * sin,
                cosp * v_v.get(1) * v_v.get(2) - v_v.get(0) * sin,
                cos + cosp * v_v.get(2) * v_v.get(2) };

        return create(m);
    }

    /**
     * ported from GLKMatrix3MakeXRotation
     */
    public static GLKMatrix3 createXRotation(float radians) {
        float cos = (float) Math.cos(radians);
        float sin = (float) Math.sin(radians);

        float[] m = {
                1.0f, 0.0f, 0.0f,
                0.0f, cos, sin,
                0.0f, -sin, cos };

        return create(m);
    }

    /**
     * ported from GLKMatrix3MakeYRotation
     */
    public static GLKMatrix3 createYRotation(float radians) {
        float cos = (float) Math.cos(radians);
        float sin = (float) Math.sin(radians);

        float[] m = {
                cos, 0.0f, -sin,
                0.0f, 1.0f, 0.0f,
                sin, 0.0f, cos };

        return create(m);
    }

    /**
     * ported from GLKMatrix3MakeZRotation
     */
    public static GLKMatrix3 createZRotation(float radians) {
        float cos = (float) Math.cos(radians);
        float sin = (float) Math.sin(radians);

        float[] m = {
                cos, sin, 0.0f,
                -sin, cos, 0.0f,
                0.0f, 0.0f, 1.0f };

        return create(m);
    }

    /**
     * ported from GLKMatrix3GetMatrix2
     */
    public GLKMatrix2 getMatrix2() {
        FloatBuffer matrix_m = this.getM();
        float[] m = {
                matrix_m.get(0), matrix_m.get(1),
                matrix_m.get(3), matrix_m.get(4) };
        return GLKMatrix2.create(m);
    }

    /**
     * ported from GLKMatrix3GetRow
     */
    public GLKVector3 getRow(int row) {
        FloatBuffer matrix_m = this.getM();
        float[] v = { matrix_m.get(row), matrix_m.get(3 + row), matrix_m.get(6 + row) };
        return GLKVector3.create(v);
    }

    /**
     * ported from GLKMatrix3GetColumn
     */
    public GLKVector3 getColumn(int column) {
        FloatBuffer matrix_m = this.getM();
        float[] v = { matrix_m.get(column * 3), matrix_m.get(column * 3 + 1), matrix_m.get(column * 3 + 2) };
        return GLKVector3.create(v);
    }

    /**
     * ported from GLKMatrix3SetRow
     */
    public GLKMatrix3 setRow(int row, GLKVector3 vector) {
        GLKMatrix3 matrix = this.copy();
        FloatBuffer vector_v = vector.getV();
        FloatBuffer matrix_m = this.getM();
        matrix_m.put(row, vector_v.get(0));
        matrix_m.put(row + 3, vector_v.get(1));
        matrix_m.put(row + 6, vector_v.get(2));

        return matrix;
    }

    /**
     * ported from GLKMatrix3SetRow
     */
    public GLKMatrix3 setColumn(int column, GLKVector3 vector) {
        GLKMatrix3 matrix = this.copy();
        FloatBuffer vector_v = vector.getV();
        FloatBuffer matrix_m = this.getM();
        matrix_m.put(column * 3, vector_v.get(0));
        matrix_m.put(column * 3 + 1, vector_v.get(1));
        matrix_m.put(column * 3 + 2, vector_v.get(2));
        return matrix;
    }

    /**
     * ported from GLKMatrix3Transpose
     */
    public GLKMatrix3 transpose() {
        FloatBuffer matrix_m = this.getM();
        float[] m = {
                matrix_m.get(0), matrix_m.get(3), matrix_m.get(6),
                matrix_m.get(1), matrix_m.get(4), matrix_m.get(7),
                matrix_m.get(2), matrix_m.get(5), matrix_m.get(8) };
        return create(m);
    }

    public GLKMatrix3 multiply(GLKMatrix3 matrixRight) { return multiply(this, matrixRight); }
    /**
     * ported from GLKMatrix3Multiply
     */
    public static GLKMatrix3 multiply(GLKMatrix3 matrixLeft, GLKMatrix3 matrixRight) {
        float[] m = new float[9];
        float[] matrixLeft_m = new float[9];
        float[] matrixRight_m = new float[9];
        matrixLeft.getM().get(matrixLeft_m);
        matrixRight.getM().get(matrixRight_m);
        m[0] = matrixLeft_m[0] * matrixRight_m[0] + matrixLeft_m[3] * matrixRight_m[1] + matrixLeft_m[6] * matrixRight_m[2];
        m[3] = matrixLeft_m[0] * matrixRight_m[3] + matrixLeft_m[3] * matrixRight_m[4] + matrixLeft_m[6] * matrixRight_m[5];
        m[6] = matrixLeft_m[0] * matrixRight_m[6] + matrixLeft_m[3] * matrixRight_m[7] + matrixLeft_m[6] * matrixRight_m[8];

        m[1] = matrixLeft_m[1] * matrixRight_m[0] + matrixLeft_m[4] * matrixRight_m[1] + matrixLeft_m[7] * matrixRight_m[2];
        m[4] = matrixLeft_m[1] * matrixRight_m[3] + matrixLeft_m[4] * matrixRight_m[4] + matrixLeft_m[7] * matrixRight_m[5];
        m[7] = matrixLeft_m[1] * matrixRight_m[6] + matrixLeft_m[4] * matrixRight_m[7] + matrixLeft_m[7] * matrixRight_m[8];

        m[2] = matrixLeft_m[2] * matrixRight_m[0] + matrixLeft_m[5] * matrixRight_m[1] + matrixLeft_m[8] * matrixRight_m[2];
        m[5] = matrixLeft_m[2] * matrixRight_m[3] + matrixLeft_m[5] * matrixRight_m[4] + matrixLeft_m[8] * matrixRight_m[5];
        m[8] = matrixLeft_m[2] * matrixRight_m[6] + matrixLeft_m[5] * matrixRight_m[7] + matrixLeft_m[8] * matrixRight_m[8];

        return create(m);
    }

    public GLKMatrix3 add(GLKMatrix3 matrixRight) { return add(this, matrixRight); }
    /**
     * ported from GLKMatrix3Add
     */
    public static GLKMatrix3 add(GLKMatrix3 matrixLeft, GLKMatrix3 matrixRight) {
        float[] m = new float[9];
        float[] matrixLeft_m = new float[9];
        float[] matrixRight_m = new float[9];
        matrixLeft.getM().get(matrixLeft_m);
        matrixRight.getM().get(matrixRight_m);

        m[0] = matrixLeft_m[0] + matrixRight_m[0];
        m[1] = matrixLeft_m[1] + matrixRight_m[1];
        m[2] = matrixLeft_m[2] + matrixRight_m[2];

        m[3] = matrixLeft_m[3] + matrixRight_m[3];
        m[4] = matrixLeft_m[4] + matrixRight_m[4];
        m[5] = matrixLeft_m[5] + matrixRight_m[5];

        m[6] = matrixLeft_m[6] + matrixRight_m[6];
        m[7] = matrixLeft_m[7] + matrixRight_m[7];
        m[8] = matrixLeft_m[8] + matrixRight_m[8];

        return create(m);
    }

    public GLKMatrix3 subtract(GLKMatrix3 matrixRight) { return subtract(this, matrixRight); }
    /**
     * ported from GLKMatrix3Subtract
     */
    public static GLKMatrix3 subtract(GLKMatrix3 matrixLeft, GLKMatrix3 matrixRight) {
        float[] m = new float[9];
        float[] matrixLeft_m = new float[9];
        float[] matrixRight_m = new float[9];
        matrixLeft.getM().get(matrixLeft_m);
        matrixRight.getM().get(matrixRight_m);

        m[0] = matrixLeft_m[0] - matrixRight_m[0];
        m[1] = matrixLeft_m[1] - matrixRight_m[1];
        m[2] = matrixLeft_m[2] - matrixRight_m[2];

        m[3] = matrixLeft_m[3] - matrixRight_m[3];
        m[4] = matrixLeft_m[4] - matrixRight_m[4];
        m[5] = matrixLeft_m[5] - matrixRight_m[5];

        m[6] = matrixLeft_m[6] - matrixRight_m[6];
        m[7] = matrixLeft_m[7] - matrixRight_m[7];
        m[8] = matrixLeft_m[8] - matrixRight_m[8];

        return create(m);
    }

    /**
     * ported from GLKMatrix3Scale
     */
    public GLKMatrix3 scale(float sx, float sy, float sz) {
        float[] matrix_m = new float[9];
        this.getM().get(matrix_m);
        float[] m = {
                matrix_m[0] * sx, matrix_m[1] * sx, matrix_m[2] * sx,
                matrix_m[3] * sy, matrix_m[4] * sy, matrix_m[5] * sy,
                matrix_m[6] * sz, matrix_m[7] * sz, matrix_m[8] * sz };
        return create(m);
    }

    /**
     * ported from GLKMatrix3ScaleWithVector3
     */
    public GLKMatrix3 scale(GLKVector3 scaleVector) {
        float[] matrix_m = new float[9];
        float[] scaleVector_v = new float[3];
        this.getM().get(matrix_m);
        scaleVector.getV().get(scaleVector_v);
        float[] m = {
                matrix_m[0] * scaleVector_v[0], matrix_m[1] * scaleVector_v[0], matrix_m[2] * scaleVector_v[0],
                matrix_m[3] * scaleVector_v[1], matrix_m[4] * scaleVector_v[1], matrix_m[5] * scaleVector_v[1],
                matrix_m[6] * scaleVector_v[2], matrix_m[7] * scaleVector_v[2], matrix_m[8] * scaleVector_v[2] };
        return create(m);
    }

    /**
     * ported from GLKMatrix3ScaleWithVector4
     */
    public GLKMatrix3 scale(GLKVector4 scaleVector) {
        float[] matrix_m = new float[9];
        float[] scaleVector_v = new float[4];
        this.getM().get(matrix_m);
        scaleVector.getV().get(scaleVector_v);
        float[] m = {
                matrix_m[0] * scaleVector_v[0], matrix_m[1] * scaleVector_v[0], matrix_m[2] * scaleVector_v[0],
                matrix_m[3] * scaleVector_v[1], matrix_m[4] * scaleVector_v[1], matrix_m[5] * scaleVector_v[1],
                matrix_m[6] * scaleVector_v[2], matrix_m[7] * scaleVector_v[2], matrix_m[8] * scaleVector_v[2] };
        return create(m);
    }

    /**
     * ported from GLKMatrix3Rotate
     */
    public GLKMatrix3 rotate(float radians, float x, float y, float z) {
        GLKMatrix3 rm = createRotation(radians, x, y, z);
        return this.multiply(rm);
    }

    /**
     * ported from GLKMatrix3RotateWithVector3
     */
    public GLKMatrix3 rotate(float radians, GLKVector3 axisVector) {
        GLKMatrix3 rm = createRotation(radians, axisVector.getV().get(0), axisVector.getV().get(1), axisVector.getV().get(2));
        return this.multiply(rm);
    }

    /**
     * ported from GLKMatrix3RotateWithVector4
     */
    public GLKMatrix3 rotate(float radians, GLKVector4 axisVector) {
        GLKMatrix3 rm = createRotation(radians, axisVector.getV().get(0), axisVector.getV().get(1), axisVector.getV().get(2));
        return this.multiply(rm);
    }

    /**
     * ported from GLKMatrix3RotateX
     */
    public GLKMatrix3 rotateX(float radians) {
        GLKMatrix3 rm = createXRotation(radians);
        return this.multiply(rm);
    }

    /**
     * ported from GLKMatrix3RotateY
     */
    public GLKMatrix3 rotateY(float radians) {
        GLKMatrix3 rm = createYRotation(radians);
        return this.multiply(rm);
    }

    /**
     * ported from GLKMatrix3RotateZ
     */
    public GLKMatrix3 rotateZ(float radians) {
        GLKMatrix3 rm = createZRotation(radians);
        return this.multiply(rm);
    }

    /**
     * ported from GLKMatrix3MultiplyVector3
     */
    public GLKVector3 multiplyVector3(GLKVector3 vectorRight) {
        float[] m = new float[9];
        float[] matrixLeft_m = new float[9];
        float[] vectorRight_v = new float[3];
        this.getM().get(matrixLeft_m);
        vectorRight.getV().get(vectorRight_v);

        float[] v = {
                matrixLeft_m[0] * vectorRight_v[0] + matrixLeft_m[3] * vectorRight_v[1] + matrixLeft_m[6] * vectorRight_v[2],
                matrixLeft_m[1] * vectorRight_v[0] + matrixLeft_m[4] * vectorRight_v[1] + matrixLeft_m[7] * vectorRight_v[2],
                matrixLeft_m[2] * vectorRight_v[0] + matrixLeft_m[5] * vectorRight_v[1] + matrixLeft_m[8] * vectorRight_v[2] };
        return GLKVector3.create(v);
    }

    /**
     * ported from GLKMatrix3MultiplyVector3Array
     */
    public void multiplyVector3Array(GLKVector3 vectors, long vectorCount) {
        GLKVector3 v = vectors;
        for (int i = 0; i < vectorCount; i++) {
            v.update(this.multiplyVector3(v));
            v = v.next();
        }
    }
}
