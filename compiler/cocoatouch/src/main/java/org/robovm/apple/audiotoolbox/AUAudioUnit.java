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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AUAudioUnit/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AUAudioUnitPtr extends Ptr<AUAudioUnit, AUAudioUnitPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AUAudioUnit.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AUAudioUnit() {}
    protected AUAudioUnit(Handle h, long handle) { super(h, handle); }
    protected AUAudioUnit(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithComponentDescription:options:error:")
    public AUAudioUnit(@ByVal AudioComponentDescription componentDescription, AudioComponentInstantiationOptions options) throws NSErrorException {
       super((SkipInit) null);
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       long handle = init(componentDescription, options, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       initObject(handle);
    }
    @Method(selector = "initWithComponentDescription:error:")
    public AUAudioUnit(@ByVal AudioComponentDescription componentDescription) throws NSErrorException {
       super((SkipInit) null);
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       long handle = init(componentDescription, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       initObject(handle);
    }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "componentDescription")
    public native @ByVal AudioComponentDescription getComponentDescription();
    @Property(selector = "component")
    public native AudioComponent getComponent();
    @Property(selector = "componentName")
    public native String getComponentName();
    @Property(selector = "audioUnitName")
    public native String getAudioUnitName();
    @Property(selector = "manufacturerName")
    public native String getManufacturerName();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "audioUnitShortName")
    public native String getAudioUnitShortName();
    @Property(selector = "componentVersion")
    public native int getComponentVersion();
    @Property(selector = "renderResourcesAllocated")
    public native boolean isRenderResourcesAllocated();
    @Property(selector = "inputBusses")
    public native AUAudioUnitBusArray getInputBusses();
    @Property(selector = "outputBusses")
    public native AUAudioUnitBusArray getOutputBusses();
    @Property(selector = "renderBlock")
    public native @Block("(,,,@MachineSizedSInt,,@Block)") Block6<IntPtr, AudioTimeStamp, Integer, Long, AudioBufferList, Block5<IntPtr, AudioTimeStamp, Integer, Long, AudioBufferList, OSStatus>, OSStatus> getRenderBlock();
    @Property(selector = "scheduleParameterBlock")
    public native @Block VoidBlock4<AUEventSampleTime, Integer, Long, Float> getScheduleParameterBlock();
    @Property(selector = "maximumFramesToRender")
    public native int getMaximumFramesToRender();
    @Property(selector = "setMaximumFramesToRender:")
    public native void setMaximumFramesToRender(int v);
    @Property(selector = "parameterTree")
    public native AUParameterTree getParameterTree();
    @Property(selector = "allParameterValues")
    public native boolean isAllParameterValues();
    @Property(selector = "isMusicDeviceOrEffect")
    public native boolean isMusicDeviceOrEffect();
    @Property(selector = "virtualMIDICableCount")
    public native @MachineSizedSInt long getVirtualMIDICableCount();
    @Property(selector = "scheduleMIDIEventBlock")
    public native @Block("(,,@MachineSizedSInt,)") VoidBlock4<AUEventSampleTime, Byte, Long, BytePtr> getScheduleMIDIEventBlock();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "MIDIOutputNames")
    public native NSArray<NSString> getMIDIOutputNames();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "providesUserInterface")
    public native boolean providesUserInterface();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "MIDIOutputEventBlock")
    public native @Block("(,,@MachineSizedSInt,)") Block4<AUEventSampleTime, Byte, Long, BytePtr, OSStatus> getMIDIOutputEventBlock();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setMIDIOutputEventBlock:")
    public native void setMIDIOutputEventBlock(@Block("(,,@MachineSizedSInt,)") Block4<AUEventSampleTime, Byte, Long, BytePtr, OSStatus> v);
    @Property(selector = "fullState")
    public native NSDictionary<NSString, ?> getFullState();
    @Property(selector = "setFullState:")
    public native void setFullState(NSDictionary<NSString, ?> v);
    @Property(selector = "fullStateForDocument")
    public native NSDictionary<NSString, ?> getFullStateForDocument();
    @Property(selector = "setFullStateForDocument:")
    public native void setFullStateForDocument(NSDictionary<NSString, ?> v);
    @Property(selector = "factoryPresets")
    public native NSArray<AUAudioUnitPreset> getFactoryPresets();
    @Property(selector = "currentPreset")
    public native AUAudioUnitPreset getCurrentPreset();
    @Property(selector = "setCurrentPreset:")
    public native void setCurrentPreset(AUAudioUnitPreset v);
    @Property(selector = "latency")
    public native double getLatency();
    @Property(selector = "tailTime")
    public native double getTailTime();
    @Property(selector = "renderQuality")
    public native @MachineSizedSInt long getRenderQuality();
    @Property(selector = "setRenderQuality:")
    public native void setRenderQuality(@MachineSizedSInt long v);
    @Property(selector = "shouldBypassEffect")
    public native boolean shouldBypassEffect();
    @Property(selector = "setShouldBypassEffect:")
    public native void setShouldBypassEffect(boolean v);
    @Property(selector = "canProcessInPlace")
    public native boolean canProcessInPlace();
    @Property(selector = "isRenderingOffline")
    public native boolean isRenderingOffline();
    @Property(selector = "setRenderingOffline:")
    public native void setRenderingOffline(boolean v);
    @Property(selector = "channelCapabilities")
    public native NSArray<NSNumber> getChannelCapabilities();
    @Property(selector = "musicalContextBlock")
    public native @Block Block6<DoublePtr, DoublePtr, MachineSizedSIntPtr, DoublePtr, MachineSizedSIntPtr, DoublePtr, Boolean> getMusicalContextBlock();
    @Property(selector = "setMusicalContextBlock:")
    public native void setMusicalContextBlock(@Block Block6<DoublePtr, DoublePtr, MachineSizedSIntPtr, DoublePtr, MachineSizedSIntPtr, DoublePtr, Boolean> v);
    @Property(selector = "transportStateBlock")
    public native @Block Block4<MachineSizedUIntPtr, DoublePtr, DoublePtr, DoublePtr, Boolean> getTransportStateBlock();
    @Property(selector = "setTransportStateBlock:")
    public native void setTransportStateBlock(@Block Block4<MachineSizedUIntPtr, DoublePtr, DoublePtr, DoublePtr, Boolean> v);
    @Property(selector = "contextName")
    public native String getContextName();
    @Property(selector = "setContextName:")
    public native void setContextName(String v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "supportsMPE")
    public native boolean supportsMPE();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "channelMap")
    public native NSArray<NSNumber> getChannelMap();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setChannelMap:")
    public native void setChannelMap(NSArray<NSNumber> v);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "profileChangedBlock")
    public native @Block VoidBlock4<Byte, Byte, MIDICIProfile, Boolean> getProfileChangedBlock();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "setProfileChangedBlock:")
    public native void setProfileChangedBlock(@Block VoidBlock4<Byte, Byte, MIDICIProfile, Boolean> v);
    @Property(selector = "canPerformInput")
    public native boolean canPerformInput();
    @Property(selector = "canPerformOutput")
    public native boolean canPerformOutput();
    @Property(selector = "isInputEnabled")
    public native boolean isInputEnabled();
    @Property(selector = "setInputEnabled:")
    public native void setInputEnabled(boolean v);
    @Property(selector = "isOutputEnabled")
    public native boolean isOutputEnabled();
    @Property(selector = "setOutputEnabled:")
    public native void setOutputEnabled(boolean v);
    @Property(selector = "outputProvider")
    public native @Block("(,,,@MachineSizedSInt,)") Block5<IntPtr, AudioTimeStamp, Integer, Long, AudioBufferList, OSStatus> getOutputProvider();
    @Property(selector = "setOutputProvider:")
    public native void setOutputProvider(@Block("(,,,@MachineSizedSInt,)") Block5<IntPtr, AudioTimeStamp, Integer, Long, AudioBufferList, OSStatus> v);
    @Property(selector = "inputHandler")
    public native @Block("(,,,@MachineSizedSInt)") VoidBlock4<IntPtr, AudioTimeStamp, Integer, Long> getInputHandler();
    @Property(selector = "setInputHandler:")
    public native void setInputHandler(@Block("(,,,@MachineSizedSInt)") VoidBlock4<IntPtr, AudioTimeStamp, Integer, Long> v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "isRunning")
    public native boolean isRunning();
    @Property(selector = "internalRenderBlock")
    public native  ObjCBlock getInternalRenderBlock();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "MIDIOutputBufferSizeHint")
    public native @MachineSizedSInt long getMIDIOutputBufferSizeHint();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setMIDIOutputBufferSizeHint:")
    public native void setMIDIOutputBufferSizeHint(@MachineSizedSInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithComponentDescription:options:error:")
    private native @Pointer long init(@ByVal AudioComponentDescription componentDescription, AudioComponentInstantiationOptions options, NSError.NSErrorPtr outError);
    @Method(selector = "initWithComponentDescription:error:")
    private native @Pointer long init(@ByVal AudioComponentDescription componentDescription, NSError.NSErrorPtr outError);
    @Method(selector = "allocateRenderResourcesAndReturnError:")
    public native boolean allocateRenderResourcesAndReturnError(NSError.NSErrorPtr outError);
    @Method(selector = "deallocateRenderResources")
    public native void deallocateRenderResources();
    @Method(selector = "reset")
    public native void reset();
    @Method(selector = "tokenByAddingRenderObserver:")
    public native @MachineSizedSInt long tokenByAddingRenderObserver(@Block("(,,,@MachineSizedSInt)") VoidBlock4<AURenderActionFlags, AudioTimeStamp, Integer, Long> observer);
    @Method(selector = "removeRenderObserver:")
    public native void removeRenderObserver(@MachineSizedSInt long token);
    @Method(selector = "parametersForOverviewWithCount:")
    public native NSArray<NSNumber> getParameters(@MachineSizedSInt long count);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "profileStateForCable:channel:")
    public native MIDICIProfileState getProfileState(byte cable, byte channel);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "enableProfile:cable:onChannel:error:")
    public native boolean enableProfile(MIDICIProfile profile, byte cable, byte channel, NSError.NSErrorPtr outError);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "disableProfile:cable:onChannel:error:")
    public native boolean disableProfile(MIDICIProfile profile, byte cable, byte channel, NSError.NSErrorPtr outError);
    @Method(selector = "instantiateWithComponentDescription:options:completionHandler:")
    public static native void instantiate(@ByVal AudioComponentDescription componentDescription, AudioComponentInstantiationOptions options, @Block VoidBlock2<AUAudioUnit, NSError> completionHandler);
    @Method(selector = "startHardwareAndReturnError:")
    public native boolean startHardwareAndReturnError(NSError.NSErrorPtr outError);
    @Method(selector = "stopHardware")
    public native void stopHardware();
    @Method(selector = "shouldChangeToFormat:forBus:")
    public native boolean shouldChangeToFormat(AVAudioFormat format, AUAudioUnitBus bus);
    @Method(selector = "setRenderResourcesAllocated:")
    public native void setRenderResourcesAllocated(boolean flag);
    @Method(selector = "registerSubclass:asComponentDescription:name:version:")
    public static native void registerSubclass(Class<?> cls, @ByVal AudioComponentDescription componentDescription, String name, int version);
    /*</methods>*/
}
