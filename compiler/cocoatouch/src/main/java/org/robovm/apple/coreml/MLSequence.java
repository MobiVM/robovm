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
package org.robovm.apple.coreml;

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
import org.robovm.apple.corevideo.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreML") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MLSequence/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MLSequencePtr extends Ptr<MLSequence, MLSequencePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MLSequence.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MLSequence() {}
    protected MLSequence(Handle h, long handle) { super(h, handle); }
    protected MLSequence(SkipInit skipInit) { super(skipInit); }
    public MLSequence(MLFeatureType type) { super((Handle) null, create(type)); retain(getHandle()); }
    public MLSequence(NSArray<NSString> stringValues) { super((Handle) null, create0(stringValues)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "type")
    public native MLFeatureType getType();
    @Property(selector = "stringValues")
    public native NSArray<NSString> getStringValues();
    @Property(selector = "int64Values")
    public native NSArray<NSNumber> getInt64Values();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "emptySequenceWithType:")
    protected static native @Pointer long create(MLFeatureType type);
    @Method(selector = "sequenceWithStringArray:")
    protected static native @Pointer long create0(NSArray<NSString> stringValues);
    @Method(selector = "sequenceWithInt64Array:")
    public static native MLSequence create(NSArray<NSNumber> int64Values);
    /*</methods>*/
}
