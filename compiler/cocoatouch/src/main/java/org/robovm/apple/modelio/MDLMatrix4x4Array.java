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
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ModelIO") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MDLMatrix4x4Array/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MDLMatrix4x4ArrayPtr extends Ptr<MDLMatrix4x4Array, MDLMatrix4x4ArrayPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MDLMatrix4x4Array.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MDLMatrix4x4Array() {}
    protected MDLMatrix4x4Array(Handle h, long handle) { super(h, handle); }
    protected MDLMatrix4x4Array(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithElementCount:")
    public MDLMatrix4x4Array(@MachineSizedUInt long arrayElementCount) { super((SkipInit) null); initObject(init(arrayElementCount)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "elementCount")
    public native @MachineSizedUInt long getElementCount();
    @Property(selector = "precision")
    public native MDLDataPrecision getPrecision();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "clear")
    public native void clear();
    @Method(selector = "initWithElementCount:")
    protected native @Pointer long init(@MachineSizedUInt long arrayElementCount);
    @Method(selector = "setFloat4x4Array:count:")
    public native void setFloat4x4Array(MatrixFloat4x4 valuesArray, @MachineSizedUInt long count);
    @Method(selector = "setDouble4x4Array:count:")
    public native void setDouble4x4Array(MatrixDouble4x4 valuesArray, @MachineSizedUInt long count);
    @Method(selector = "getFloat4x4Array:maxCount:")
    public native @MachineSizedUInt long getFloat4x4Array(MatrixFloat4x4 valuesArray, @MachineSizedUInt long maxCount);
    @Method(selector = "getDouble4x4Array:maxCount:")
    public native @MachineSizedUInt long getDouble4x4Array(MatrixDouble4x4 valuesArray, @MachineSizedUInt long maxCount);
    /*</methods>*/
}
