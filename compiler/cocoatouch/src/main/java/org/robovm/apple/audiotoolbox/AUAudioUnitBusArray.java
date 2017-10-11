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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AUAudioUnitBusArray/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSFastEnumeration/*</implements>*/ {

    /*<ptr>*/public static class AUAudioUnitBusArrayPtr extends Ptr<AUAudioUnitBusArray, AUAudioUnitBusArrayPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AUAudioUnitBusArray.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AUAudioUnitBusArray() {}
    protected AUAudioUnitBusArray(Handle h, long handle) { super(h, handle); }
    protected AUAudioUnitBusArray(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAudioUnit:busType:busses:")
    public AUAudioUnitBusArray(AUAudioUnit owner, AUAudioUnitBusType busType, NSArray<AUAudioUnitBus> busArray) { super((SkipInit) null); initObject(init(owner, busType, busArray)); }
    @Method(selector = "initWithAudioUnit:busType:")
    public AUAudioUnitBusArray(AUAudioUnit owner, AUAudioUnitBusType busType) { super((SkipInit) null); initObject(init(owner, busType)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "count")
    public native @MachineSizedUInt long getCount();
    @Property(selector = "isCountChangeable")
    public native boolean isCountChangeable();
    @Property(selector = "ownerAudioUnit")
    public native AUAudioUnit getOwnerAudioUnit();
    @Property(selector = "busType")
    public native AUAudioUnitBusType getBusType();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAudioUnit:busType:busses:")
    protected native @Pointer long init(AUAudioUnit owner, AUAudioUnitBusType busType, NSArray<AUAudioUnitBus> busArray);
    @Method(selector = "initWithAudioUnit:busType:")
    protected native @Pointer long init(AUAudioUnit owner, AUAudioUnitBusType busType);
    @Method(selector = "objectAtIndexedSubscript:")
    public native AUAudioUnitBus objectAtIndexedSubscript(@MachineSizedUInt long index);
    @Method(selector = "setBusCount:error:")
    public native boolean setBusCount(@MachineSizedUInt long count, NSError.NSErrorPtr outError);
    @Method(selector = "addObserverToAllBusses:forKeyPath:options:context:")
    public native void addObserverToAllBusses(NSObject observer, String keyPath, NSKeyValueObservingOptions options, VoidPtr context);
    @Method(selector = "removeObserverFromAllBusses:forKeyPath:context:")
    public native void removeObserverFromAllBusses(NSObject observer, String keyPath, VoidPtr context);
    @Method(selector = "replaceBusses:")
    public native void replaceBusses(NSArray<AUAudioUnitBus> busArray);
    /*</methods>*/
}
