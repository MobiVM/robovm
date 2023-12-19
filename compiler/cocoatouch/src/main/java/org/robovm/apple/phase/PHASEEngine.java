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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PHASEEngine/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PHASEEnginePtr extends Ptr<PHASEEngine, PHASEEnginePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PHASEEngine.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected PHASEEngine() {}
    protected PHASEEngine(Handle h, long handle) { super(h, handle); }
    protected PHASEEngine(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithUpdateMode:")
    public PHASEEngine(PHASEUpdateMode updateMode) { super((SkipInit) null); initObject(init(updateMode)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "outputSpatializationMode")
    public native PHASESpatializationMode getOutputSpatializationMode();
    @Property(selector = "setOutputSpatializationMode:")
    public native void setOutputSpatializationMode(PHASESpatializationMode v);
    @Property(selector = "renderingState")
    public native PHASERenderingState getRenderingState();
    @Property(selector = "rootObject")
    public native PHASEObject getRootObject();
    @Property(selector = "defaultMedium")
    public native PHASEMedium getDefaultMedium();
    @Property(selector = "setDefaultMedium:")
    public native void setDefaultMedium(PHASEMedium v);
    @Property(selector = "defaultReverbPreset")
    public native PHASEReverbPreset getDefaultReverbPreset();
    @Property(selector = "setDefaultReverbPreset:")
    public native void setDefaultReverbPreset(PHASEReverbPreset v);
    @Property(selector = "unitsPerSecond")
    public native double getUnitsPerSecond();
    @Property(selector = "setUnitsPerSecond:")
    public native void setUnitsPerSecond(double v);
    @Property(selector = "unitsPerMeter")
    public native double getUnitsPerMeter();
    @Property(selector = "setUnitsPerMeter:")
    public native void setUnitsPerMeter(double v);
    @Property(selector = "assetRegistry")
    public native PHASEAssetRegistry getAssetRegistry();
    @Property(selector = "soundEvents")
    public native NSArray<PHASESoundEvent> getSoundEvents();
    @Property(selector = "groups")
    public native NSDictionary<NSString, PHASEGroup> getGroups();
    @Property(selector = "duckers")
    public native NSArray<PHASEDucker> getDuckers();
    @Property(selector = "activeGroupPreset")
    public native PHASEGroupPreset getActiveGroupPreset();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithUpdateMode:")
    protected native @Pointer long init(PHASEUpdateMode updateMode);
    @Method(selector = "startAndReturnError:")
    public native boolean startAndReturnError(NSError.NSErrorPtr error);
    @Method(selector = "pause")
    public native void pause();
    @Method(selector = "stop")
    public native void stop();
    @Method(selector = "update")
    public native void update();
    /*</methods>*/
}
