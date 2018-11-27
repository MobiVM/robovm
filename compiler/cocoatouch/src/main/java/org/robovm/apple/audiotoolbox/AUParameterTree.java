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
package org.robovm.apple.audiotoolbox;

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
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremidi.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AudioToolbox") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AUParameterTree/*</name>*/ 
    extends /*<extends>*/AUParameterGroup/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class AUParameterTreePtr extends Ptr<AUParameterTree, AUParameterTreePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AUParameterTree.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AUParameterTree() {}
    protected AUParameterTree(Handle h, long handle) { super(h, handle); }
    protected AUParameterTree(SkipInit skipInit) { super(skipInit); }
    public AUParameterTree(NSArray<AUParameterNode> children) { super((Handle) null, create(children)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "parameterWithAddress:")
    public native AUParameter getParameter(long address);
    @Method(selector = "parameterWithID:scope:element:")
    public native AUParameter getParameter(int paramID, int scope, int element);
    @Method(selector = "createParameterWithIdentifier:name:address:min:max:unit:unitName:flags:valueStrings:dependentParameters:")
    public static native AUParameter createParameter(String identifier, String name, long address, float min, float max, AudioUnitParameterUnit unit, String unitName, AUParameterFlags flags, NSArray<NSString> valueStrings, NSArray<NSNumber> dependentParameters);
    @Method(selector = "createGroupWithIdentifier:name:children:")
    public static native AUParameterGroup createGroup(String identifier, String name, NSArray<AUParameterNode> children);
    @Method(selector = "createGroupTemplate:")
    public static native AUParameterGroup createGroupTemplate(NSArray<AUParameterNode> children);
    @Method(selector = "createGroupFromTemplate:identifier:name:addressOffset:")
    public static native AUParameterGroup createGroup(AUParameterGroup templateGroup, String identifier, String name, long addressOffset);
    @Method(selector = "createTreeWithChildren:")
    protected static native @Pointer long create(NSArray<AUParameterNode> children);
    /*</methods>*/
}
