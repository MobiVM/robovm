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
package org.robovm.apple.gamecontroller;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.corehaptic.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/GCSwitchPositionInput/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "positionDidChangeHandler")
    @Block("(,,@MachineSizedSInt)") VoidBlock3<GCPhysicalInputElement, GCSwitchPositionInput, Long> getPositionDidChangeHandler();
    @Property(selector = "setPositionDidChangeHandler:")
    void setPositionDidChangeHandler(@Block("(,,@MachineSizedSInt)") VoidBlock3<GCPhysicalInputElement, GCSwitchPositionInput, Long> v);
    @Property(selector = "position")
    @MachineSizedSInt long getPosition();
    @Property(selector = "positionRange")
    @ByVal NSRange getPositionRange();
    @Property(selector = "isSequential")
    boolean isSequential();
    @Property(selector = "canWrap")
    boolean canWrap();
    @Property(selector = "lastPositionTimestamp")
    double getLastPositionTimestamp();
    @Property(selector = "lastPositionLatency")
    double getLastPositionLatency();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "sources")
    NSSet<?> getSources();
    /*</properties>*/
    /*<methods>*/
    
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
