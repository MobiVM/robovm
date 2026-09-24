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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PHASEGeneratorNodeDefinition/*</name>*/ 
    extends /*<extends>*/PHASESoundEventNodeDefinition/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PHASEGeneratorNodeDefinitionPtr extends Ptr<PHASEGeneratorNodeDefinition, PHASEGeneratorNodeDefinitionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PHASEGeneratorNodeDefinition.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected PHASEGeneratorNodeDefinition() {}
    protected PHASEGeneratorNodeDefinition(Handle h, long handle) { super(h, handle); }
    protected PHASEGeneratorNodeDefinition(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "calibrationMode")
    public native PHASECalibrationMode getCalibrationMode();
    @Property(selector = "level")
    public native double getLevel();
    @Property(selector = "rate")
    public native double getRate();
    @Property(selector = "setRate:")
    public native void setRate(double v);
    @Property(selector = "group")
    public native PHASEGroup getGroup();
    @Property(selector = "setGroup:", strongRef = true)
    public native void setGroup(PHASEGroup v);
    @Property(selector = "gainMetaParameterDefinition")
    public native PHASENumberMetaParameterDefinition getGainMetaParameterDefinition();
    @Property(selector = "setGainMetaParameterDefinition:")
    public native void setGainMetaParameterDefinition(PHASENumberMetaParameterDefinition v);
    @Property(selector = "rateMetaParameterDefinition")
    public native PHASENumberMetaParameterDefinition getRateMetaParameterDefinition();
    @Property(selector = "setRateMetaParameterDefinition:")
    public native void setRateMetaParameterDefinition(PHASENumberMetaParameterDefinition v);
    @Property(selector = "mixerDefinition")
    public native PHASEMixerDefinition getMixerDefinition();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setCalibrationMode:level:")
    public native void setCalibrationMode(PHASECalibrationMode calibrationMode, double level);
    /*</methods>*/
}
