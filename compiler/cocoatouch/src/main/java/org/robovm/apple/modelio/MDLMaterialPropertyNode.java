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
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ModelIO") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MDLMaterialPropertyNode/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MDLNamed/*</implements>*/ {

    /*<ptr>*/public static class MDLMaterialPropertyNodePtr extends Ptr<MDLMaterialPropertyNode, MDLMaterialPropertyNodePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MDLMaterialPropertyNode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MDLMaterialPropertyNode() {}
    protected MDLMaterialPropertyNode(Handle h, long handle) { super(h, handle); }
    protected MDLMaterialPropertyNode(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithInputs:outputs:evaluationFunction:")
    public MDLMaterialPropertyNode(NSArray<MDLMaterialProperty> inputs, NSArray<MDLMaterialProperty> outputs, @Block VoidBlock1<MDLMaterialPropertyNode> function) { super((SkipInit) null); initObject(init(inputs, outputs, function)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "evaluationFunction")
    public native @Block VoidBlock1<MDLMaterialPropertyNode> getEvaluationFunction();
    @Property(selector = "setEvaluationFunction:")
    public native void setEvaluationFunction(@Block VoidBlock1<MDLMaterialPropertyNode> v);
    @Property(selector = "inputs")
    public native NSArray<MDLMaterialProperty> getInputs();
    @Property(selector = "outputs")
    public native NSArray<MDLMaterialProperty> getOutputs();
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "setName:")
    public native void setName(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithInputs:outputs:evaluationFunction:")
    protected native @Pointer long init(NSArray<MDLMaterialProperty> inputs, NSArray<MDLMaterialProperty> outputs, @Block VoidBlock1<MDLMaterialPropertyNode> function);
    /*</methods>*/
}
