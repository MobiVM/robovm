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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GLKMatrix4/*</name>*/ 
    extends /*<extends>*/Struct<GLKMatrix4>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GLKMatrix4Ptr extends Ptr<GLKMatrix4, GLKMatrix4Ptr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(GLKMatrix4.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GLKMatrix4() {}
    public GLKMatrix4(FloatBuffer m) {
        this.setM(m);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native @Array({16}) FloatBuffer getM();
    @StructMember(0) public native GLKMatrix4 setM(@Array({16}) FloatBuffer m);
    /*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="GLKMatrix4Identity", optional=true)
    public static native @ByVal GLKMatrix4 Identity();
    
    public GLKMatrix4 invert(BooleanPtr isInvertible) { return invert(this, isInvertible); }
    @Bridge(symbol="GLKMatrix4Invert", optional=true)
    private static native @ByVal GLKMatrix4 invert(@ByVal GLKMatrix4 matrix, BooleanPtr isInvertible);
    public GLKMatrix4 invertAndTranspose(BooleanPtr isInvertible) { return invertAndTranspose(this, isInvertible); }
    @Bridge(symbol="GLKMatrix4InvertAndTranspose", optional=true)
    private static native @ByVal GLKMatrix4 invertAndTranspose(@ByVal GLKMatrix4 matrix, BooleanPtr isInvertible);
    /*</methods>*/

    //
    // manually added methods  as apple moved these from global to static inline
    //
    /**
     * ported from GLKMatrix4Make
     */
    public static GLKMatrix4 create(float m00, float m01, float m02, float m03,
                                    float m10, float m11, float m12, float m13,
                                    float m20, float m21, float m22, float m23,
                                    float m30, float m31, float m32, float m33) {
        float[] m = {
                m00, m01, m02, m03,
                m10, m11, m12, m13,
                m20, m21, m22, m23,
                m30, m31, m32, m33};
        return create(m);
    }

    /**
     * ported from GLKMatrix4MakeAndTranspose
     */
    public static GLKMatrix4 createAndTranspose(float m00, float m01, float m02, float m03,
                                                float m10, float m11, float m12, float m13,
                                                float m20, float m21, float m22, float m23,
                                                float m30, float m31, float m32, float m33) {
        float[] m = {
                m00, m10, m20, m30,
                m01, m11, m21, m31,
                m02, m12, m22, m32,
                m03, m13, m23, m33};
        return create(m);
    }

    /**
     * ported from GLKMatrix4MakeWithArray
     */
    public static GLKMatrix4 create(float[] values) {
        if (values == null || values.length != 16)
            throw new IllegalArgumentException();
        return new GLKMatrix4(FloatBuffer.wrap(values));
    }

    /**
     * ported from GLKMatrix4MakeWithArrayAndTranspose
     */
    public static GLKMatrix4 createAndTranspose(float[] values){
        float[] m = {
                values[0], values[4], values[8], values[12],
                values[1], values[5], values[9], values[13],
                values[2], values[6], values[10], values[14],
                values[3], values[7], values[11], values[15]};
        return create(m);
    }

    /**
     * ported from GLKMatrix4MakeWithRows
     */
    public static GLKMatrix4 createWithRows(GLKVector4 row0, GLKVector4 row1, GLKVector4 row2, GLKVector4 row3) {
        FloatBuffer row0_v = row0.getV();
        FloatBuffer row1_v = row1.getV();
        FloatBuffer row2_v = row2.getV();
        FloatBuffer row3_v = row3.getV();

        float[] m = {
                row0_v.get(0), row1_v.get(0), row2_v.get(0), row3_v.get(0),
                row0_v.get(1), row1_v.get(1), row2_v.get(1), row3_v.get(1),
                row0_v.get(2), row1_v.get(2), row2_v.get(2), row3_v.get(2),
                row0_v.get(3), row1_v.get(3), row2_v.get(3), row3_v.get(3)};
        return create(m);
    }

    /**
     * ported from GLKMatrix4MakeWithColumns
     */
    public static GLKMatrix4 createWithColumns(GLKVector4 column0, GLKVector4 column1, GLKVector4 column2, GLKVector4 column3) {
        FloatBuffer column0_v = column0.getV();
        FloatBuffer column1_v = column1.getV();
        FloatBuffer column2_v = column2.getV();
        FloatBuffer column3_v = column3.getV();
        float[] m = {
                column0_v.get(0), column0_v.get(1), column0_v.get(2), column0_v.get(3),
                column1_v.get(0), column1_v.get(1), column1_v.get(2), column1_v.get(3),
                column2_v.get(0), column2_v.get(1), column2_v.get(2), column2_v.get(3),
                column3_v.get(0), column3_v.get(1), column3_v.get(2), column3_v.get(3)};
        return create(m);
    }
    /**
     * ported from GLKMatrix4MakeWithQuaternion
     */
    public static GLKMatrix4 create(GLKQuaternion quaternion) {
        quaternion = quaternion.normalize();

        float x = quaternion.getQ().get(0);
        float y = quaternion.getQ().get(1);
        float z = quaternion.getQ().get(2);
        float w = quaternion.getQ().get(3);

        float _2x = x + x;
        float _2y = y + y;
        float _2z = z + z;
        float _2w = w + w;

        float[] m = {
                1.0f - _2y * y - _2z * z,
                _2x * y + _2w * z,
                _2x * z - _2w * y,
                0.0f,
                _2x * y - _2w * z,
                1.0f - _2x * x - _2z * z,
                _2y * z + _2w * x,
                0.0f,
                _2x * z + _2w * y,
                _2y * z - _2w * x,
                1.0f - _2x * x - _2y * y,
                0.0f,
                0.0f,
                0.0f,
                0.0f,
                1.0f};

        return create(m);
    }

    /**
     * ported from GLKMatrix4MakeTranslation
     */
    public static GLKMatrix4 createTranslation(float tx, float ty, float tz) {
        GLKMatrix4 m = Identity();
        FloatBuffer m_m = m.getM();
        m_m.put(12, tx);
        m_m.put(13, ty);
        m_m.put(14, tz);
        return m;
    }

    /**
     * ported from GLKMatrix4MakeScale
     */
    public static GLKMatrix4 createScale(float sx, float sy, float sz) {
        GLKMatrix4 m = Identity();
        FloatBuffer m_m = m.getM();
        m_m.put(0, sx);
        m_m.put(5, sy);
        m_m.put(10, sz);
        return m;
    }

    /**
     * ported from GLKMatrix4MakeRotation
     */
    public static GLKMatrix4 createRotation(float radians, float x, float y, float z) {
        GLKVector3 v = GLKVector3.create(x, y, z).normalize();
        float cos = (float) Math.cos(radians);
        float cosp = 1.0f - cos;
        float sin = (float) Math.sin(radians);

        FloatBuffer v_v = v.getV();
        float[] m = {cos + cosp * v_v.get(0) * v_v.get(0),
                cosp * v_v.get(0) * v_v.get(1) + v_v.get(2) * sin,
                cosp * v_v.get(0) * v_v.get(2) - v_v.get(1) * sin,
                0.0f,
                cosp * v_v.get(0) * v_v.get(1) - v_v.get(2) * sin,
                cos + cosp * v_v.get(1) * v_v.get(1),
                cosp * v_v.get(1) * v_v.get(2) + v_v.get(0) * sin,
                0.0f,
                cosp * v_v.get(0) * v_v.get(2) + v_v.get(1) * sin,
                cosp * v_v.get(1) * v_v.get(2) - v_v.get(0) * sin,
                cos + cosp * v_v.get(2) * v_v.get(2),
                0.0f,
                0.0f,
                0.0f,
                0.0f,
                1.0f};

        return create(m);
    }

    /**
     * ported from GLKMatrix4MakeXRotation
     */
    public static GLKMatrix4 createXRotation(float radians) {
        float cos = (float) Math.cos(radians);
        float sin = (float) Math.sin(radians);

        float[] m = {
                1.0f, 0.0f, 0.0f, 0.0f,
                0.0f, cos, sin, 0.0f,
                0.0f, -sin, cos, 0.0f,
                0.0f, 0.0f, 0.0f, 1.0f};

        return create(m);
    }

    /**
     * ported from GLKMatrix4MakeYRotation
     */
    public static GLKMatrix4 createYRotation(float radians) {
        float cos = (float) Math.cos(radians);
        float sin = (float) Math.sin(radians);

        float[] m = {
                cos, 0.0f, -sin, 0.0f,
                0.0f, 1.0f, 0.0f, 0.0f,
                sin, 0.0f, cos, 0.0f,
                0.0f, 0.0f, 0.0f, 1.0f};

        return create(m);
    }

    /**
     * ported from GLKMatrix4MakeZRotation
     */
    public static GLKMatrix4 createZRotation(float radians) {
        float cos = (float)Math.cos(radians);
        float sin = (float)Math.sin(radians);

        float[] m = {
                cos, sin, 0.0f, 0.0f,
                -sin, cos, 0.0f, 0.0f,
                0.0f, 0.0f, 1.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 1.0f};

        return create(m);
    }
    
    /**
     * ported from GLKMatrix4MakePerspective
     */
    public static GLKMatrix4 createPerspective(float fovyRadians, float aspect, float nearZ, float farZ) {
        float cotan = (float) (1.0f / Math.tan(fovyRadians / 2.0f));

        float[] m = {
                cotan / aspect, 0.0f, 0.0f, 0.0f,
                0.0f, cotan, 0.0f, 0.0f,
                0.0f, 0.0f, (farZ + nearZ) / (nearZ - farZ), -1.0f,
                0.0f, 0.0f, (2.0f * farZ * nearZ) / (nearZ - farZ), 0.0f};

        return create(m);
    }

    /**
     * ported from GLKMatrix4MakeFrustum
     */
    public static GLKMatrix4 createFrustum(float left, float right, float bottom, float top, float nearZ, float farZ) {
        float ral = right + left;
        float rsl = right - left;
        float tsb = top - bottom;
        float tab = top + bottom;
        float fan = farZ + nearZ;
        float fsn = farZ - nearZ;

        float[] m = {
                2.0f * nearZ / rsl, 0.0f, 0.0f, 0.0f,
                0.0f, 2.0f * nearZ / tsb, 0.0f, 0.0f,
                ral / rsl, tab / tsb, -fan / fsn, -1.0f,
                0.0f, 0.0f, (-2.0f * farZ * nearZ) / fsn, 0.0f};

        return create(m);
    }

    /**
     * ported from GLKMatrix4MakeOrtho
     */
    public static GLKMatrix4 createOrtho(float left, float right, float bottom, float top, float nearZ, float farZ) {
        float ral = right + left;
        float rsl = right - left;
        float tab = top + bottom;
        float tsb = top - bottom;
        float fan = farZ + nearZ;
        float fsn = farZ - nearZ;

        float[] m = {
                2.0f / rsl, 0.0f, 0.0f, 0.0f,
                0.0f, 2.0f / tsb, 0.0f, 0.0f,
                0.0f, 0.0f, -2.0f / fsn, 0.0f,
                -ral / rsl, -tab / tsb, -fan / fsn, 1.0f};

        return create(m);
    }

    /**
     * ported from GLKMatrix4MakeLookAt
     */
    public static GLKMatrix4 createLookAt(float eyeX, float eyeY, float eyeZ, float centerX, float centerY, float centerZ, float upX, float upY, float upZ) {
        GLKVector3 ev = GLKVector3.create(eyeX, eyeY, eyeZ);
        GLKVector3 cv = GLKVector3.create(centerX, centerY, centerZ);
        GLKVector3 uv = GLKVector3.create(upX, upY, upZ);
        GLKVector3 n = GLKVector3.add(ev, cv.negate()).normalize();
        GLKVector3 u = GLKVector3.crossProduct(uv, n).normalize();
        GLKVector3 v = GLKVector3.crossProduct(n, u);

        FloatBuffer u_v = u.getV();
        FloatBuffer v_v = u.getV();
        FloatBuffer n_v = u.getV();
        float[] m = {u_v.get(0), v_v.get(0), n_v.get(0), 0.0f,
                u_v.get(1), v_v.get(1), n_v.get(1), 0.0f,
                u_v.get(2), v_v.get(2), n_v.get(2), 0.0f,
                GLKVector3.dotProduct(u.negate(), ev),
                GLKVector3.dotProduct(v.negate(), ev),
                GLKVector3.dotProduct(n.negate(), ev),
                1.0f};

        return create(m);
    }

    /**
     * ported from GLKMatrix4GetMatrix3
     */
    public GLKMatrix3 getMatrix3() {
        FloatBuffer m_m = getM();
        float[] m = {
                m_m.get(0), m_m.get(1), m_m.get(2),
                m_m.get(4), m_m.get(5), m_m.get(6),
                m_m.get(8), m_m.get(9), m_m.get(10)};
        return GLKMatrix3.create(m);
    }

    /**
     * ported from GLKMatrix4GetMatrix2
     */
    public GLKMatrix2 getMatrix2() {
        FloatBuffer m_m = getM();
        float[] m = {
                m_m.get(0), m_m.get(1),
                m_m.get(4), m_m.get(5)};
        return GLKMatrix2.create(m);

    }

    /**
     * ported from GLKMatrix4GetRow
     */
    public GLKVector4 getRow(int row) {
        FloatBuffer m_m = getM();
        GLKVector4 v = GLKVector4.create(m_m.get(row), m_m.get(4 + row), m_m.get(8 + row), m_m.get(12 + row));
        return v;
    }

    /**
     * ported from GLKMatrix4GetColumn
     */
    public GLKVector4 getColumn(int column) {
        FloatBuffer m_m = getM();
        GLKVector4 v = GLKVector4.create(m_m.get(column * 4 + 0), m_m.get(column * 4 + 1), m_m.get(column * 4 + 2), m_m.get(column * 4 + 3));
        return v;
    }

    /**
     * ported from GLKMatrix4SetRow
     */
    public GLKMatrix4 setRow(int row, GLKVector4 vector) {
        GLKMatrix4 matrix = this.copy();
        FloatBuffer vector_v = vector.getV();
        FloatBuffer matrix_m = matrix.getM();
        matrix_m.put(row, vector_v.get(0));
        matrix_m.put(row + 4, vector_v.get(1));
        matrix_m.put(row + 8, vector_v.get(2));
        matrix_m.put(row + 12, vector_v.get(3));

        return matrix;
    }

    /**
     * ported from GLKMatrix4SetColumn
     */
    public GLKMatrix4 setColumn(int column, GLKVector4 vector) {
        GLKMatrix4 matrix = this.copy();
        FloatBuffer vector_v = vector.getV();
        FloatBuffer matrix_m = matrix.getM();
        matrix_m.put(column * 4 + 0, vector_v.get(0));
        matrix_m.put(column * 4 + 1, vector_v.get(1));
        matrix_m.put(column * 4 + 2, vector_v.get(2));
        matrix_m.put(column * 4 + 3, vector_v.get(3));

        return matrix;

    }

    /**
     * ported from GLKMatrix4Transpose
     */
    public GLKMatrix4 transpose() {
        GLKMatrix4 matrix = this.copy();
        FloatBuffer matrix_m = matrix.getM();
        float[] m = {
                matrix_m.get(0), matrix_m.get(4), matrix_m.get(8), matrix_m.get(12),
                matrix_m.get(1), matrix_m.get(5), matrix_m.get(9), matrix_m.get(13),
                matrix_m.get(2), matrix_m.get(6), matrix_m.get(10), matrix_m.get(14),
                matrix_m.get(3), matrix_m.get(7), matrix_m.get(11), matrix_m.get(15)};
        return create(m);
    }

    public GLKMatrix4 multiply(GLKMatrix4 matrixRight) {
        return multiply(this, matrixRight);
    }
    /**
     * ported from GLKMatrix4Multiply
     */
    public static GLKMatrix4 multiply(GLKMatrix4 matrixLeft, GLKMatrix4 matrixRight) {
        float[] m = new float[16];
        float[] matrixLeft_m = new float[16];
        float[] matrixRight_m = new float[16];
        matrixLeft.getM().get(matrixLeft_m);
        matrixRight.getM().get(matrixRight_m);

        m[0] = matrixLeft_m[0] * matrixRight_m[0] + matrixLeft_m[4] * matrixRight_m[1] + matrixLeft_m[8] * matrixRight_m[2] + matrixLeft_m[12] * matrixRight_m[3];
        m[4] = matrixLeft_m[0] * matrixRight_m[4] + matrixLeft_m[4] * matrixRight_m[5] + matrixLeft_m[8] * matrixRight_m[6] + matrixLeft_m[12] * matrixRight_m[7];
        m[8] = matrixLeft_m[0] * matrixRight_m[8] + matrixLeft_m[4] * matrixRight_m[9] + matrixLeft_m[8] * matrixRight_m[10] + matrixLeft_m[12] * matrixRight_m[11];
        m[12] = matrixLeft_m[0] * matrixRight_m[12] + matrixLeft_m[4] * matrixRight_m[13] + matrixLeft_m[8] * matrixRight_m[14] + matrixLeft_m[12] * matrixRight_m[15];

        m[1] = matrixLeft_m[1] * matrixRight_m[0] + matrixLeft_m[5] * matrixRight_m[1] + matrixLeft_m[9] * matrixRight_m[2] + matrixLeft_m[13] * matrixRight_m[3];
        m[5] = matrixLeft_m[1] * matrixRight_m[4] + matrixLeft_m[5] * matrixRight_m[5] + matrixLeft_m[9] * matrixRight_m[6] + matrixLeft_m[13] * matrixRight_m[7];
        m[9] = matrixLeft_m[1] * matrixRight_m[8] + matrixLeft_m[5] * matrixRight_m[9] + matrixLeft_m[9] * matrixRight_m[10] + matrixLeft_m[13] * matrixRight_m[11];
        m[13] = matrixLeft_m[1] * matrixRight_m[12] + matrixLeft_m[5] * matrixRight_m[13] + matrixLeft_m[9] * matrixRight_m[14] + matrixLeft_m[13] * matrixRight_m[15];

        m[2] = matrixLeft_m[2] * matrixRight_m[0] + matrixLeft_m[6] * matrixRight_m[1] + matrixLeft_m[10] * matrixRight_m[2] + matrixLeft_m[14] * matrixRight_m[3];
        m[6] = matrixLeft_m[2] * matrixRight_m[4] + matrixLeft_m[6] * matrixRight_m[5] + matrixLeft_m[10] * matrixRight_m[6] + matrixLeft_m[14] * matrixRight_m[7];
        m[10] = matrixLeft_m[2] * matrixRight_m[8] + matrixLeft_m[6] * matrixRight_m[9] + matrixLeft_m[10] * matrixRight_m[10] + matrixLeft_m[14] * matrixRight_m[11];
        m[14] = matrixLeft_m[2] * matrixRight_m[12] + matrixLeft_m[6] * matrixRight_m[13] + matrixLeft_m[10] * matrixRight_m[14] + matrixLeft_m[14] * matrixRight_m[15];

        m[3] = matrixLeft_m[3] * matrixRight_m[0] + matrixLeft_m[7] * matrixRight_m[1] + matrixLeft_m[11] * matrixRight_m[2] + matrixLeft_m[15] * matrixRight_m[3];
        m[7] = matrixLeft_m[3] * matrixRight_m[4] + matrixLeft_m[7] * matrixRight_m[5] + matrixLeft_m[11] * matrixRight_m[6] + matrixLeft_m[15] * matrixRight_m[7];
        m[11] = matrixLeft_m[3] * matrixRight_m[8] + matrixLeft_m[7] * matrixRight_m[9] + matrixLeft_m[11] * matrixRight_m[10] + matrixLeft_m[15] * matrixRight_m[11];
        m[15] = matrixLeft_m[3] * matrixRight_m[12] + matrixLeft_m[7] * matrixRight_m[13] + matrixLeft_m[11] * matrixRight_m[14] + matrixLeft_m[15] * matrixRight_m[15];

        return create(m);
    }

    public GLKMatrix4 add(GLKMatrix4 matrixRight) { return add(this, matrixRight); }
    /**
     * ported from GLKMatrix4Add
     */
    public static GLKMatrix4 add(GLKMatrix4 matrixLeft, GLKMatrix4 matrixRight) {
        float[] m = new float[16];
        float[] matrixLeft_m = new float[16];
        float[] matrixRight_m = new float[16];
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
        m[9] = matrixLeft_m[9] + matrixRight_m[9];
        m[10] = matrixLeft_m[10] + matrixRight_m[10];
        m[11] = matrixLeft_m[11] + matrixRight_m[11];

        m[12] = matrixLeft_m[12] + matrixRight_m[12];
        m[13] = matrixLeft_m[13] + matrixRight_m[13];
        m[14] = matrixLeft_m[14] + matrixRight_m[14];
        m[15] = matrixLeft_m[15] + matrixRight_m[15];

        return create(m);
    }

    public GLKMatrix4 subtract(GLKMatrix4 matrixRight) { return subtract(this, matrixRight); }
    /**
     * ported from GLKMatrix4Subtract
     */
    public static GLKMatrix4 subtract(GLKMatrix4 matrixLeft, GLKMatrix4 matrixRight) {
        float[] m = new float[16];
        float[] matrixLeft_m = new float[16];
        float[] matrixRight_m = new float[16];
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
        m[9] = matrixLeft_m[9] - matrixRight_m[9];
        m[10] = matrixLeft_m[10] - matrixRight_m[10];
        m[11] = matrixLeft_m[11] - matrixRight_m[11];

        m[12] = matrixLeft_m[12] - matrixRight_m[12];
        m[13] = matrixLeft_m[13] - matrixRight_m[13];
        m[14] = matrixLeft_m[14] - matrixRight_m[14];
        m[15] = matrixLeft_m[15] - matrixRight_m[15];

        return create(m);
    }

    /**
     * ported from GLKMatrix4Translate
     */
    public GLKMatrix4 translate(float tx, float ty, float tz) {
        float[] matrix_m = new float[16];
        this.getM().get(matrix_m);
        float[] m = {
                matrix_m[0], matrix_m[1], matrix_m[2], matrix_m[3],
                matrix_m[4], matrix_m[5], matrix_m[6], matrix_m[7],
                matrix_m[8], matrix_m[9], matrix_m[10], matrix_m[11],
                matrix_m[0] * tx + matrix_m[4] * ty + matrix_m[8] * tz + matrix_m[12],
                matrix_m[1] * tx + matrix_m[5] * ty + matrix_m[9] * tz + matrix_m[13],
                matrix_m[2] * tx + matrix_m[6] * ty + matrix_m[10] * tz + matrix_m[14],
                matrix_m[3] * tx + matrix_m[7] * ty + matrix_m[11] * tz + matrix_m[15]};
        return create(m);
    }

    /**
     * ported from GLKMatrix4TranslateWithVector3
     */
    public GLKMatrix4 translateWithVector3(GLKVector3 translationVector) {
        float[] matrix_m = new float[16];
        float[] translationVector_v = new float[3];
        this.getM().get(matrix_m);
        translationVector.getV().get(translationVector_v);
        float[] m = {
                matrix_m[0], matrix_m[1], matrix_m[2], matrix_m[3],
                matrix_m[4], matrix_m[5], matrix_m[6], matrix_m[7],
                matrix_m[8], matrix_m[9], matrix_m[10], matrix_m[11],
                matrix_m[0] * translationVector_v[0] + matrix_m[4] * translationVector_v[1] + matrix_m[8] * translationVector_v[2] + matrix_m[12],
                matrix_m[1] * translationVector_v[0] + matrix_m[5] * translationVector_v[1] + matrix_m[9] * translationVector_v[2] + matrix_m[13],
                matrix_m[2] * translationVector_v[0] + matrix_m[6] * translationVector_v[1] + matrix_m[10] * translationVector_v[2] + matrix_m[14],
                matrix_m[3] * translationVector_v[0] + matrix_m[7] * translationVector_v[1] + matrix_m[11] * translationVector_v[2] + matrix_m[15]};
        return create(m);
    }

    /**
     * ported from GLKMatrix4TranslateWithVector4
     */
    public GLKMatrix4 translateWithVector4(GLKVector4 translationVector) {
        float[] matrix_m = new float[16];
        float[] translationVector_v = new float[4];
        this.getM().get(matrix_m);
        translationVector.getV().get(translationVector_v);

        float[] m = {
                matrix_m[0], matrix_m[1], matrix_m[2], matrix_m[3],
                matrix_m[4], matrix_m[5], matrix_m[6], matrix_m[7],
                matrix_m[8], matrix_m[9], matrix_m[10], matrix_m[11],
                matrix_m[0] * translationVector_v[0] + matrix_m[4] * translationVector_v[1] + matrix_m[8] * translationVector_v[2] + matrix_m[12],
                matrix_m[1] * translationVector_v[0] + matrix_m[5] * translationVector_v[1] + matrix_m[9] * translationVector_v[2] + matrix_m[13],
                matrix_m[2] * translationVector_v[0] + matrix_m[6] * translationVector_v[1] + matrix_m[10] * translationVector_v[2] + matrix_m[14],
                matrix_m[3] * translationVector_v[0] + matrix_m[7] * translationVector_v[1] + matrix_m[11] * translationVector_v[2] + matrix_m[15]};
        return create(m);
    }

    /**
     * ported from GLKMatrix4Scale
     */
    public GLKMatrix4 scale(float sx, float sy, float sz) {
        float[] matrix_m = new float[16];
        this.getM().get(matrix_m);
        float[] m = {
                matrix_m[0] * sx, matrix_m[1] * sx, matrix_m[2] * sx, matrix_m[3] * sx,
                matrix_m[4] * sy, matrix_m[5] * sy, matrix_m[6] * sy, matrix_m[7] * sy,
                matrix_m[8] * sz, matrix_m[9] * sz, matrix_m[10] * sz, matrix_m[11] * sz,
                matrix_m[12], matrix_m[13], matrix_m[14], matrix_m[15]};
        return create(m);

    }

    /**
     * ported from GLKMatrix4ScaleWithVector3
     */
    public GLKMatrix4 scaleWithVector3(GLKVector3 scaleVector) {
        float[] matrix_m = new float[16];
        float[] scaleVector_v = new float[3];
        this.getM().get(matrix_m);
        scaleVector.getV().get(scaleVector_v);
        float[] m = {
                matrix_m[0] * scaleVector_v[0], matrix_m[1] * scaleVector_v[0], matrix_m[2] * scaleVector_v[0], matrix_m[3] * scaleVector_v[0],
                matrix_m[4] * scaleVector_v[1], matrix_m[5] * scaleVector_v[1], matrix_m[6] * scaleVector_v[1], matrix_m[7] * scaleVector_v[1],
                matrix_m[8] * scaleVector_v[2], matrix_m[9] * scaleVector_v[2], matrix_m[10] * scaleVector_v[2], matrix_m[11] * scaleVector_v[2],
                matrix_m[12], matrix_m[13], matrix_m[14], matrix_m[15]};
        return create(m);
     }

    /**
     * ported from GLKMatrix4ScaleWithVector4
     */
    public GLKMatrix4 scaleWithVector4(GLKVector4 scaleVector) {
        float[] matrix_m = new float[16];
        float[] scaleVector_v = new float[4];
        this.getM().get(matrix_m);
        scaleVector.getV().get(scaleVector_v);
        float[] m = {
                matrix_m[0] * scaleVector_v[0], matrix_m[1] * scaleVector_v[0], matrix_m[2] * scaleVector_v[0], matrix_m[3] * scaleVector_v[0],
                matrix_m[4] * scaleVector_v[1], matrix_m[5] * scaleVector_v[1], matrix_m[6] * scaleVector_v[1], matrix_m[7] * scaleVector_v[1],
                matrix_m[8] * scaleVector_v[2], matrix_m[9] * scaleVector_v[2], matrix_m[10] * scaleVector_v[2], matrix_m[11] * scaleVector_v[2],
                matrix_m[12], matrix_m[13], matrix_m[14], matrix_m[15]};
        return create(m);
     }

    /**
     * ported from GLKMatrix4Rotate
     */
    public GLKMatrix4 rotate(float radians, float x, float y, float z) {
        GLKMatrix4 rm = createRotation(radians, x, y, z);
        return multiply(this, rm);
    }

    /**
     * ported from GLKMatrix4RotateWithVector3
     */
    public GLKMatrix4 rotateWithVector3(float radians, GLKVector3 axisVector) {
        GLKMatrix4 rm = createRotation(radians, axisVector.getV().get(0), axisVector.getV().get(1), axisVector.getV().get(2));
        return multiply(this, rm);
    }

    /**
     * ported from GLKMatrix4RotateWithVector4
     */
    public GLKMatrix4 rotateWithVector4(float radians, GLKVector4 axisVector) {
        GLKMatrix4 rm = createRotation(radians, axisVector.getV().get(0), axisVector.getV().get(1), axisVector.getV().get(2));
        return multiply(this, rm);
    }

    /**
     * ported from GLKMatrix4RotateX
     */
    public GLKMatrix4 rotateX(float radians) {
        GLKMatrix4 rm = createXRotation(radians);
        return multiply(this, rm);
    }

    /**
     * ported from GLKMatrix4RotateY
     */
    public GLKMatrix4 rotateY(float radians) {
        GLKMatrix4 rm = createYRotation(radians);
        return multiply(this, rm);
    }

    /**
     * ported from GLKMatrix4RotateZ
     */
    public GLKMatrix4 rotateZ(float radians) {
        GLKMatrix4 rm = createZRotation(radians);
        return multiply(this, rm);
    }

    /**
     * ported from GLKMatrix4MultiplyVector3
     */
    public GLKVector3 multiplyVector3(GLKVector3 vectorRight) {
        GLKVector4 v4 = this.multiplyVector4(GLKVector4.create(vectorRight, 0.0f));
        return GLKVector3.create(v4.getV().get(0), v4.getV().get(1), v4.getV().get(2));
    }

    /**
     * ported from GLKMatrix4MultiplyVector3WithTranslation
     */
    public GLKVector3 multiplyVector3WithTranslation(GLKVector3 vectorRight) {
        GLKVector4 v4 = this.multiplyVector4(GLKVector4.create(vectorRight, 1.0f));
        return GLKVector3.create(v4.getV().get(0), v4.getV().get(1), v4.getV().get(2));
    }

    /**
     * ported from GLKMatrix4MultiplyAndProjectVector3
     */
    public GLKVector3 multiplyAndProjectVector3(GLKVector3 vectorRight) {
        GLKVector4 v4 = this.multiplyVector4(GLKVector4.create(vectorRight, 1.0f));
        return GLKVector3.create(v4.getV().get(0), v4.getV().get(1), v4.getV().get(2)).multiplyScalar(1.0f / v4.getV().get(4));
    }

    /**
     * ported from GLKMatrix4MultiplyVector3Array
     */
    public void multiplyVector3Array(GLKVector3 vectors, long vectorCount) {
        GLKVector3 v = vectors;
        for (int i = 0; i < vectorCount; i++) {
            v.update(this.multiplyVector3(v));
            v = v.next();
        }
    }

    /**
     * ported from GLKMatrix4MultiplyVector3ArrayWithTranslation
     */
    public void multiplyVector3ArrayWithTranslation(GLKVector3 vectors, long vectorCount) {
        GLKVector3 v = vectors;
        for (int i = 0; i < vectorCount; i++) {
            v.update(this.multiplyVector3WithTranslation(v));
            v = v.next();
        }
    }

    /**
     * ported from GLKMatrix4MultiplyAndProjectVector3Array
     */
    public void multiplyAndProjectVector3Array(GLKVector3 vectors, long vectorCount) {
        GLKVector3 v = vectors;
        for (int i = 0; i < vectorCount; i++) {
            v.update(this.multiplyAndProjectVector3(v));
            v = v.next();
        }
    }

    /**
     * ported from GLKMatrix4MultiplyVector4
     */
    public GLKVector4 multiplyVector4(GLKVector4 vectorRight) {
        float[] m_m = new float[16];
        float[] vectorRight_v = new float[4];
        this.getM().get(m_m);
        vectorRight.getV().get(vectorRight_v);
        float[] v = {
                m_m[0] * vectorRight_v[0] + m_m[4] * vectorRight_v[1] + m_m[8] * vectorRight_v[2] + m_m[12] * vectorRight_v[3],
                m_m[1] * vectorRight_v[0] + m_m[5] * vectorRight_v[1] + m_m[9] * vectorRight_v[2] + m_m[13] * vectorRight_v[3],
                m_m[2] * vectorRight_v[0] + m_m[6] * vectorRight_v[1] + m_m[10] * vectorRight_v[2] + m_m[14] * vectorRight_v[3],
                m_m[3] * vectorRight_v[0] + m_m[7] * vectorRight_v[1] + m_m[11] * vectorRight_v[2] + m_m[15] * vectorRight_v[3]};
        return GLKVector4.create(v);
    }

    /**
     * ported from GLKMatrix4MultiplyVector4Array
     */
    public void multiplyVector4Array(GLKVector4 vectors, long vectorCount) {
        GLKVector4 v = vectors;
        for (int i = 0; i < vectorCount; i++) {
            v.update(this.multiplyVector4(v));
            v = v.next();
        }
    }
}
