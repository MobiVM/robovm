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
package org.robovm.apple.metalps;

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
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Metal") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSMatrixDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSMatrixDescriptorPtr extends Ptr<MPSMatrixDescriptor, MPSMatrixDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSMatrixDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSMatrixDescriptor() {}
    protected MPSMatrixDescriptor(Handle h, long handle) { super(h, handle); }
    protected MPSMatrixDescriptor(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    public MPSMatrixDescriptor(@MachineSizedUInt long rows, @MachineSizedUInt long columns, @MachineSizedUInt long rowBytes, MPSDataType dataType) { super((Handle) null, create(rows, columns, rowBytes, dataType)); retain(getHandle()); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    public MPSMatrixDescriptor(@MachineSizedUInt long rows, @MachineSizedUInt long columns, @MachineSizedUInt long matrices, @MachineSizedUInt long rowBytes, @MachineSizedUInt long matrixBytes, MPSDataType dataType) { super((Handle) null, create(rows, columns, matrices, rowBytes, matrixBytes, dataType)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "rows")
    public native @MachineSizedUInt long getRows();
    @Property(selector = "setRows:")
    public native void setRows(@MachineSizedUInt long v);
    @Property(selector = "columns")
    public native @MachineSizedUInt long getColumns();
    @Property(selector = "setColumns:")
    public native void setColumns(@MachineSizedUInt long v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "matrices")
    public native @MachineSizedUInt long getMatrices();
    @Property(selector = "dataType")
    public native MPSDataType getDataType();
    @Property(selector = "setDataType:")
    public native void setDataType(MPSDataType v);
    @Property(selector = "rowBytes")
    public native @MachineSizedUInt long getRowBytes();
    @Property(selector = "setRowBytes:")
    public native void setRowBytes(@MachineSizedUInt long v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "matrixBytes")
    public native @MachineSizedUInt long getMatrixBytes();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0.
     */
    @Deprecated
    @Method(selector = "matrixDescriptorWithDimensions:columns:rowBytes:dataType:")
    public static native MPSMatrixDescriptor createForDimensions(@MachineSizedUInt long rows, @MachineSizedUInt long columns, @MachineSizedUInt long rowBytes, MPSDataType dataType);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "matrixDescriptorWithRows:columns:rowBytes:dataType:")
    protected static native @Pointer long create(@MachineSizedUInt long rows, @MachineSizedUInt long columns, @MachineSizedUInt long rowBytes, MPSDataType dataType);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "matrixDescriptorWithRows:columns:matrices:rowBytes:matrixBytes:dataType:")
    protected static native @Pointer long create(@MachineSizedUInt long rows, @MachineSizedUInt long columns, @MachineSizedUInt long matrices, @MachineSizedUInt long rowBytes, @MachineSizedUInt long matrixBytes, MPSDataType dataType);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0.
     */
    @Deprecated
    @Method(selector = "rowBytesFromColumns:dataType:")
    public static native @MachineSizedUInt long getRowBytesFromColumns(@MachineSizedUInt long columns, MPSDataType dataType);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "rowBytesForColumns:dataType:")
    public static native @MachineSizedUInt long getRowBytesForColumns(@MachineSizedUInt long columns, MPSDataType dataType);
    /*</methods>*/
}
