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
package org.robovm.apple.phase;

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
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.modelio.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("PHASE") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PHASEMappedMetaParameterDefinition/*</name>*/ 
    extends /*<extends>*/PHASENumberMetaParameterDefinition/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PHASEMappedMetaParameterDefinitionPtr extends Ptr<PHASEMappedMetaParameterDefinition, PHASEMappedMetaParameterDefinitionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PHASEMappedMetaParameterDefinition.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected PHASEMappedMetaParameterDefinition() {}
    protected PHASEMappedMetaParameterDefinition(Handle h, long handle) { super(h, handle); }
    protected PHASEMappedMetaParameterDefinition(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithInputMetaParameterDefinition:envelope:identifier:")
    public PHASEMappedMetaParameterDefinition(PHASENumberMetaParameterDefinition inputMetaParameterDefinition, PHASEEnvelope envelope, String identifier) { super((SkipInit) null); initObject(init(inputMetaParameterDefinition, envelope, identifier)); }
    @Method(selector = "initWithInputMetaParameterDefinition:envelope:")
    public PHASEMappedMetaParameterDefinition(PHASENumberMetaParameterDefinition inputMetaParameterDefinition, PHASEEnvelope envelope) { super((SkipInit) null); initObject(init(inputMetaParameterDefinition, envelope)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "envelope")
    public native PHASEEnvelope getEnvelope();
    @Property(selector = "inputMetaParameterDefinition")
    public native PHASENumberMetaParameterDefinition getInputMetaParameterDefinition();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithInputMetaParameterDefinition:envelope:identifier:")
    protected native @Pointer long init(PHASENumberMetaParameterDefinition inputMetaParameterDefinition, PHASEEnvelope envelope, String identifier);
    @Method(selector = "initWithInputMetaParameterDefinition:envelope:")
    protected native @Pointer long init(PHASENumberMetaParameterDefinition inputMetaParameterDefinition, PHASEEnvelope envelope);
    /*</methods>*/
}
