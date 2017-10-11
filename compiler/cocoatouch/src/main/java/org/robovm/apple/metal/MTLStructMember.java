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
package org.robovm.apple.metal;

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
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 8.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Metal") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLStructMember/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTLStructMemberPtr extends Ptr<MTLStructMember, MTLStructMemberPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTLStructMember.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTLStructMember() {}
    protected MTLStructMember(Handle h, long handle) { super(h, handle); }
    protected MTLStructMember(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "offset")
    public native @MachineSizedUInt long getOffset();
    @Property(selector = "dataType")
    public native MTLDataType getDataType();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "argumentIndex")
    public native @MachineSizedUInt long getArgumentIndex();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "structType")
    public native MTLStructType getStructType();
    @Method(selector = "arrayType")
    public native MTLArrayType getArrayType();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "textureReferenceType")
    public native MTLTextureReferenceType textureReferenceType();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "pointerType")
    public native MTLPointerType pointerType();
    /*</methods>*/
}
