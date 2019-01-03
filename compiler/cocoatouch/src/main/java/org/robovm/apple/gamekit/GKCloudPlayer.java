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
package org.robovm.apple.gamekit;

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
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 * @deprecated Deprecated in iOS 12.0. GKGameSession is deprecated. Use GKPlayer for both real-time and turn-based matchmaking APIs.
 */
@Deprecated
/*</javadoc>*/
/*<annotations>*/@Library("GameKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GKCloudPlayer/*</name>*/ 
    extends /*<extends>*/GKBasePlayer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GKCloudPlayerPtr extends Ptr<GKCloudPlayer, GKCloudPlayerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GKCloudPlayer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GKCloudPlayer() {}
    protected GKCloudPlayer(Handle h, long handle) { super(h, handle); }
    protected GKCloudPlayer(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "getCurrentSignedInPlayerForContainer:completionHandler:")
    public static native void getCurrentSignedInPlayerForContainer(String containerName, @Block VoidBlock2<GKCloudPlayer, NSError> handler);
    /*</methods>*/
}
