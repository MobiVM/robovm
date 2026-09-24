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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PHASENumberMetaParameterDefinition/*</name>*/ 
    extends /*<extends>*/PHASEMetaParameterDefinition/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PHASENumberMetaParameterDefinitionPtr extends Ptr<PHASENumberMetaParameterDefinition, PHASENumberMetaParameterDefinitionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PHASENumberMetaParameterDefinition.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected PHASENumberMetaParameterDefinition() {}
    protected PHASENumberMetaParameterDefinition(Handle h, long handle) { super(h, handle); }
    protected PHASENumberMetaParameterDefinition(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithValue:identifier:")
    public PHASENumberMetaParameterDefinition(double value, String identifier) { super((SkipInit) null); initObject(init(value, identifier)); }
    @Method(selector = "initWithValue:")
    public PHASENumberMetaParameterDefinition(double value) { super((SkipInit) null); initObject(init(value)); }
    @Method(selector = "initWithValue:minimum:maximum:identifier:")
    public PHASENumberMetaParameterDefinition(double value, double minimum, double maximum, String identifier) { super((SkipInit) null); initObject(init(value, minimum, maximum, identifier)); }
    @Method(selector = "initWithValue:minimum:maximum:")
    public PHASENumberMetaParameterDefinition(double value, double minimum, double maximum) { super((SkipInit) null); initObject(init(value, minimum, maximum)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "minimum")
    public native double getMinimum();
    @Property(selector = "maximum")
    public native double getMaximum();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithValue:identifier:")
    protected native @Pointer long init(double value, String identifier);
    @Method(selector = "initWithValue:")
    protected native @Pointer long init(double value);
    @Method(selector = "initWithValue:minimum:maximum:identifier:")
    protected native @Pointer long init(double value, double minimum, double maximum, String identifier);
    @Method(selector = "initWithValue:minimum:maximum:")
    protected native @Pointer long init(double value, double minimum, double maximum);
    /*</methods>*/
}
