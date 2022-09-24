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
package org.robovm.apple.corehaptic;

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
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreHaptics") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CHHapticPattern/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CHHapticPatternPtr extends Ptr<CHHapticPattern, CHHapticPatternPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CHHapticPattern.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CHHapticPattern() {}
    protected CHHapticPattern(Handle h, long handle) { super(h, handle); }
    protected CHHapticPattern(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithEvents:parameters:error:")
    public static  CHHapticPattern createUsingParameters(NSArray<CHHapticEvent> events, NSArray<CHHapticDynamicParameter> parameters) throws NSErrorException  {
       CHHapticPattern res = new CHHapticPattern((SkipInit) null);
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       res.initObject(res.initUsingParameters(events, parameters, ptr));
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return res;
    }
    @Method(selector = "initWithEvents:parameterCurves:error:")
    public CHHapticPattern(NSArray<CHHapticEvent> events, NSArray<CHHapticParameterCurve> parameterCurves) throws NSErrorException {
       super((SkipInit) null);
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       long handle = init(events, parameterCurves, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       initObject(handle);
    }
    @Method(selector = "initWithDictionary:error:")
    public CHHapticPattern(CHHapticPatternDict patternDict) throws NSErrorException {
       super((SkipInit) null);
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       long handle = init(patternDict, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       initObject(handle);
    }
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "initWithContentsOfURL:error:")
    public CHHapticPattern(NSURL ahapURL) throws NSErrorException {
       super((SkipInit) null);
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       long handle = init(ahapURL, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       initObject(handle);
    }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "duration")
    public native double getDuration();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithEvents:parameters:error:")
    protected native @Pointer long initUsingParameters(NSArray<CHHapticEvent> events, NSArray<CHHapticDynamicParameter> parameters, NSError.NSErrorPtr outError);
    @Method(selector = "initWithEvents:parameterCurves:error:")
    private native @Pointer long init(NSArray<CHHapticEvent> events, NSArray<CHHapticParameterCurve> parameterCurves, NSError.NSErrorPtr outError);
    @Method(selector = "initWithDictionary:error:")
    private native @Pointer long init(CHHapticPatternDict patternDict, NSError.NSErrorPtr outError);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "initWithContentsOfURL:error:")
    private native @Pointer long init(NSURL ahapURL, NSError.NSErrorPtr outError);
    @Method(selector = "exportDictionaryAndReturnError:")
    public native CHHapticPatternDict exportDictionaryAndReturnError(NSError.NSErrorPtr outError);
    /*</methods>*/
}
