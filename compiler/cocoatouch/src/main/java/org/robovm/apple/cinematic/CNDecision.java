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
package org.robovm.apple.cinematic;

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
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Cinematic") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CNDecision/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CNDecisionPtr extends Ptr<CNDecision, CNDecisionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CNDecision.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CNDecision() {}
    protected CNDecision(Handle h, long handle) { super(h, handle); }
    protected CNDecision(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTime:detectionID:strong:")
    public CNDecision(@ByVal CMTime time, long detectionID, boolean isStrong) { super((SkipInit) null); initObject(init(time, detectionID, isStrong)); }
    @Method(selector = "initWithTime:detectionGroupID:strong:")
    public static  CNDecision createUsingGroupID(@ByVal CMTime time, long detectionGroupID, boolean isStrong) {
       CNDecision res = new CNDecision((SkipInit) null);
       res.initObject(res.initWithTimeDetectionGroupID(time, detectionGroupID, isStrong));
       return res;
    }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "time")
    public native @ByVal CMTime getTime();
    @Property(selector = "detectionID")
    public native long getDetectionID();
    @Property(selector = "detectionGroupID")
    public native long getDetectionGroupID();
    @Property(selector = "isUserDecision")
    public native boolean isUserDecision();
    @Property(selector = "isGroupDecision")
    public native boolean isGroupDecision();
    @Property(selector = "isStrongDecision")
    public native boolean isStrongDecision();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTime:detectionID:strong:")
    protected native @Pointer long init(@ByVal CMTime time, long detectionID, boolean isStrong);
    @Method(selector = "initWithTime:detectionGroupID:strong:")
    protected native @Pointer long initWithTimeDetectionGroupID(@ByVal CMTime time, long detectionGroupID, boolean isStrong);
    /*</methods>*/
}
