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
package org.robovm.apple.javascriptcore;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("JavaScriptCore")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/JSClassDefinition/*</name>*/ 
    extends /*<extends>*/Struct<JSClassDefinition>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class JSClassDefinitionPtr extends Ptr<JSClassDefinition, JSClassDefinitionPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(JSClassDefinition.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public JSClassDefinition() {}
    public JSClassDefinition(int version, int attributes, BytePtr className, JSClassRef parentClass, JSStaticValue staticValues, JSStaticFunction staticFunctions, FunctionPtr initialize, FunctionPtr finalize, FunctionPtr hasProperty, FunctionPtr getProperty, FunctionPtr setProperty, FunctionPtr deleteProperty, FunctionPtr getPropertyNames, FunctionPtr callAsFunction, FunctionPtr callAsConstructor, FunctionPtr hasInstance, FunctionPtr convertToType) {
        this.setVersion(version);
        this.setAttributes(attributes);
        this.setClassName(className);
        this.setParentClass(parentClass);
        this.setStaticValues(staticValues);
        this.setStaticFunctions(staticFunctions);
        this.setInitialize(initialize);
        this.setFinalize(finalize);
        this.setHasProperty(hasProperty);
        this.setGetProperty(getProperty);
        this.setSetProperty(setProperty);
        this.setDeleteProperty(deleteProperty);
        this.setGetPropertyNames(getPropertyNames);
        this.setCallAsFunction(callAsFunction);
        this.setCallAsConstructor(callAsConstructor);
        this.setHasInstance(hasInstance);
        this.setConvertToType(convertToType);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getVersion();
    @StructMember(0) public native JSClassDefinition setVersion(int version);
    @StructMember(1) public native int getAttributes();
    @StructMember(1) public native JSClassDefinition setAttributes(int attributes);
    @StructMember(2) public native BytePtr getClassName();
    @StructMember(2) public native JSClassDefinition setClassName(BytePtr className);
    @StructMember(3) public native JSClassRef getParentClass();
    @StructMember(3) public native JSClassDefinition setParentClass(JSClassRef parentClass);
    @StructMember(4) public native JSStaticValue getStaticValues();
    @StructMember(4) public native JSClassDefinition setStaticValues(JSStaticValue staticValues);
    @StructMember(5) public native JSStaticFunction getStaticFunctions();
    @StructMember(5) public native JSClassDefinition setStaticFunctions(JSStaticFunction staticFunctions);
    @StructMember(6) public native FunctionPtr getInitialize();
    @StructMember(6) public native JSClassDefinition setInitialize(FunctionPtr initialize);
    @StructMember(7) public native FunctionPtr getFinalize();
    @StructMember(7) public native JSClassDefinition setFinalize(FunctionPtr finalize);
    @StructMember(8) public native FunctionPtr getHasProperty();
    @StructMember(8) public native JSClassDefinition setHasProperty(FunctionPtr hasProperty);
    @StructMember(9) public native FunctionPtr getGetProperty();
    @StructMember(9) public native JSClassDefinition setGetProperty(FunctionPtr getProperty);
    @StructMember(10) public native FunctionPtr getSetProperty();
    @StructMember(10) public native JSClassDefinition setSetProperty(FunctionPtr setProperty);
    @StructMember(11) public native FunctionPtr getDeleteProperty();
    @StructMember(11) public native JSClassDefinition setDeleteProperty(FunctionPtr deleteProperty);
    @StructMember(12) public native FunctionPtr getGetPropertyNames();
    @StructMember(12) public native JSClassDefinition setGetPropertyNames(FunctionPtr getPropertyNames);
    @StructMember(13) public native FunctionPtr getCallAsFunction();
    @StructMember(13) public native JSClassDefinition setCallAsFunction(FunctionPtr callAsFunction);
    @StructMember(14) public native FunctionPtr getCallAsConstructor();
    @StructMember(14) public native JSClassDefinition setCallAsConstructor(FunctionPtr callAsConstructor);
    @StructMember(15) public native FunctionPtr getHasInstance();
    @StructMember(15) public native JSClassDefinition setHasInstance(FunctionPtr hasInstance);
    @StructMember(16) public native FunctionPtr getConvertToType();
    @StructMember(16) public native JSClassDefinition setConvertToType(FunctionPtr convertToType);
    /*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="kJSClassDefinitionEmpty", optional=true)
    public static native @ByVal JSClassDefinition Empty();
    /*</methods>*/
}
