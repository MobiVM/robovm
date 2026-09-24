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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PHASEDucker/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PHASEDuckerPtr extends Ptr<PHASEDucker, PHASEDuckerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PHASEDucker.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected PHASEDucker() {}
    protected PHASEDucker(Handle h, long handle) { super(h, handle); }
    protected PHASEDucker(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithEngine:sourceGroups:targetGroups:gain:attackTime:releaseTime:attackCurve:releaseCurve:")
    public PHASEDucker(PHASEEngine engine, NSSet<PHASEGroup> sourceGroups, NSSet<PHASEGroup> targetGroups, double gain, double attackTime, double releaseTime, PHASECurveType attackCurve, PHASECurveType releaseCurve) { super((SkipInit) null); initObject(init(engine, sourceGroups, targetGroups, gain, attackTime, releaseTime, attackCurve, releaseCurve)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sourceGroups")
    public native NSSet<PHASEGroup> getSourceGroups();
    @Property(selector = "targetGroups")
    public native NSSet<PHASEGroup> getTargetGroups();
    @Property(selector = "isActive")
    public native boolean isActive();
    @Property(selector = "gain")
    public native double getGain();
    @Property(selector = "attackTime")
    public native double getAttackTime();
    @Property(selector = "releaseTime")
    public native double getReleaseTime();
    @Property(selector = "attackCurve")
    public native PHASECurveType getAttackCurve();
    @Property(selector = "releaseCurve")
    public native PHASECurveType getReleaseCurve();
    @Property(selector = "identifier")
    public native String getIdentifier();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithEngine:sourceGroups:targetGroups:gain:attackTime:releaseTime:attackCurve:releaseCurve:")
    protected native @Pointer long init(PHASEEngine engine, NSSet<PHASEGroup> sourceGroups, NSSet<PHASEGroup> targetGroups, double gain, double attackTime, double releaseTime, PHASECurveType attackCurve, PHASECurveType releaseCurve);
    @Method(selector = "activate")
    public native void activate();
    @Method(selector = "deactivate")
    public native void deactivate();
    /*</methods>*/
}
