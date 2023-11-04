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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PHASEBlendNodeDefinition/*</name>*/ 
    extends /*<extends>*/PHASESoundEventNodeDefinition/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PHASEBlendNodeDefinitionPtr extends Ptr<PHASEBlendNodeDefinition, PHASEBlendNodeDefinitionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PHASEBlendNodeDefinition.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected PHASEBlendNodeDefinition() {}
    protected PHASEBlendNodeDefinition(Handle h, long handle) { super(h, handle); }
    protected PHASEBlendNodeDefinition(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithBlendMetaParameterDefinition:identifier:")
    public PHASEBlendNodeDefinition(PHASENumberMetaParameterDefinition blendMetaParameterDefinition, String identifier) { super((SkipInit) null); initObject(init(blendMetaParameterDefinition, identifier)); }
    @Method(selector = "initWithBlendMetaParameterDefinition:")
    public PHASEBlendNodeDefinition(PHASENumberMetaParameterDefinition blendMetaParameterDefinition) { super((SkipInit) null); initObject(init(blendMetaParameterDefinition)); }
    @Method(selector = "initDistanceBlendWithSpatialMixerDefinition:identifier:")
    public PHASEBlendNodeDefinition(PHASESpatialMixerDefinition spatialMixerDefinition, String identifier) { super((SkipInit) null); initObject(init(spatialMixerDefinition, identifier)); }
    @Method(selector = "initDistanceBlendWithSpatialMixerDefinition:")
    public PHASEBlendNodeDefinition(PHASESpatialMixerDefinition spatialMixerDefinition) { super((SkipInit) null); initObject(init(spatialMixerDefinition)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "blendParameterDefinition")
    public native PHASENumberMetaParameterDefinition getBlendParameterDefinition();
    @Property(selector = "spatialMixerDefinitionForDistance")
    public native PHASESpatialMixerDefinition getSpatialMixerDefinitionForDistance();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithBlendMetaParameterDefinition:identifier:")
    protected native @Pointer long init(PHASENumberMetaParameterDefinition blendMetaParameterDefinition, String identifier);
    @Method(selector = "initWithBlendMetaParameterDefinition:")
    protected native @Pointer long init(PHASENumberMetaParameterDefinition blendMetaParameterDefinition);
    @Method(selector = "initDistanceBlendWithSpatialMixerDefinition:identifier:")
    protected native @Pointer long init(PHASESpatialMixerDefinition spatialMixerDefinition, String identifier);
    @Method(selector = "initDistanceBlendWithSpatialMixerDefinition:")
    protected native @Pointer long init(PHASESpatialMixerDefinition spatialMixerDefinition);
    @Method(selector = "addRangeForInputValuesBelow:fullGainAtValue:fadeCurveType:subtree:")
    public native void addRangeForInputValuesBelow(double value, double fullGainAtValue, PHASECurveType fadeCurveType, PHASESoundEventNodeDefinition subtree);
    @Method(selector = "addRangeForInputValuesBetween:highValue:fullGainAtLowValue:fullGainAtHighValue:lowFadeCurveType:highFadeCurveType:subtree:")
    public native void addRangeForInputValuesBetween(double lowValue, double highValue, double fullGainAtLowValue, double fullGainAtHighValue, PHASECurveType lowFadeCurveType, PHASECurveType highFadeCurveType, PHASESoundEventNodeDefinition subtree);
    @Method(selector = "addRangeForInputValuesAbove:fullGainAtValue:fadeCurveType:subtree:")
    public native void addRangeForInputValuesAbove(double value, double fullGainAtValue, PHASECurveType fadeCurveType, PHASESoundEventNodeDefinition subtree);
    @Method(selector = "addRangeWithEnvelope:subtree:")
    public native void addRangeWithEnvelope(PHASEEnvelope envelope, PHASESoundEventNodeDefinition subtree);
    /*</methods>*/
}
