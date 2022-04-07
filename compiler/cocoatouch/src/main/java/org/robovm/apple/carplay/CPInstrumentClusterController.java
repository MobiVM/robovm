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
package org.robovm.apple.carplay;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.mapkit.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 15.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CarPlay") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPInstrumentClusterController/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CPInstrumentClusterControllerPtr extends Ptr<CPInstrumentClusterController, CPInstrumentClusterControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CPInstrumentClusterController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CPInstrumentClusterController() {}
    protected CPInstrumentClusterController(Handle h, long handle) { super(h, handle); }
    protected CPInstrumentClusterController(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native CPInstrumentClusterControllerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(CPInstrumentClusterControllerDelegate v);
    @Property(selector = "instrumentClusterWindow")
    public native UIWindow getInstrumentClusterWindow();
    @Property(selector = "speedLimitSetting")
    public native CPInstrumentClusterSetting getSpeedLimitSetting();
    @Property(selector = "compassSetting")
    public native CPInstrumentClusterSetting getCompassSetting();
    @Property(selector = "inactiveDescriptionVariants")
    public native NSArray<NSString> getInactiveDescriptionVariants();
    @Property(selector = "setInactiveDescriptionVariants:")
    public native void setInactiveDescriptionVariants(NSArray<NSString> v);
    @Property(selector = "attributedInactiveDescriptionVariants")
    public native NSArray<NSAttributedString> getAttributedInactiveDescriptionVariants();
    @Property(selector = "setAttributedInactiveDescriptionVariants:")
    public native void setAttributedInactiveDescriptionVariants(NSArray<NSAttributedString> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
