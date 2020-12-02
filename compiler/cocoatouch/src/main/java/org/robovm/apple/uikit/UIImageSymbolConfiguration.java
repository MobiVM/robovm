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
package org.robovm.apple.uikit;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.cloudkit.*;
import org.robovm.apple.fileprovider.*;
import org.robovm.apple.intents.*;
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.linkpresentation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIImageSymbolConfiguration/*</name>*/ 
    extends /*<extends>*/UIImageConfiguration/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UIImageSymbolConfigurationPtr extends Ptr<UIImageSymbolConfiguration, UIImageSymbolConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIImageSymbolConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UIImageSymbolConfiguration() {}
    protected UIImageSymbolConfiguration(Handle h, long handle) { super(h, handle); }
    protected UIImageSymbolConfiguration(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "unspecifiedConfiguration")
    public static native UIImageSymbolConfiguration getUnspecifiedConfiguration();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "configurationWithoutTextStyle")
    public native UIImageSymbolConfiguration getConfigurationWithoutTextStyle();
    @Method(selector = "configurationWithoutScale")
    public native UIImageSymbolConfiguration getConfigurationWithoutScale();
    @Method(selector = "configurationWithoutWeight")
    public native UIImageSymbolConfiguration getConfigurationWithoutWeight();
    @Method(selector = "configurationWithoutPointSizeAndWeight")
    public native UIImageSymbolConfiguration getConfigurationWithoutPointSizeAndWeight();
    @Method(selector = "isEqualToConfiguration:")
    public native boolean isEqualToConfiguration(UIImageSymbolConfiguration otherConfiguration);
    @Method(selector = "configurationWithScale:")
    public static native UIImageSymbolConfiguration getConfigurationWithScale(UIImageSymbolScale scale);
    @Method(selector = "configurationWithPointSize:")
    public static native UIImageSymbolConfiguration getConfigurationWithPointSize(@MachineSizedFloat double pointSize);
    @Method(selector = "configurationWithWeight:")
    public static native UIImageSymbolConfiguration getConfigurationWithWeight(UIImageSymbolWeight weight);
    @Method(selector = "configurationWithPointSize:weight:")
    public static native UIImageSymbolConfiguration getConfigurationWithPointSizeWeight(@MachineSizedFloat double pointSize, UIImageSymbolWeight weight);
    @Method(selector = "configurationWithPointSize:weight:scale:")
    public static native UIImageSymbolConfiguration getConfigurationWithPointSizeWeightScale(@MachineSizedFloat double pointSize, UIImageSymbolWeight weight, UIImageSymbolScale scale);
    @Method(selector = "configurationWithTextStyle:")
    public static native UIImageSymbolConfiguration getConfigurationWithTextStyle(String textStyle);
    @Method(selector = "configurationWithTextStyle:scale:")
    public static native UIImageSymbolConfiguration getConfigurationWithTextStyleScale(String textStyle, UIImageSymbolScale scale);
    @Method(selector = "configurationWithFont:")
    public static native UIImageSymbolConfiguration getConfigurationWithFont(UIFont font);
    @Method(selector = "configurationWithFont:scale:")
    public static native UIImageSymbolConfiguration getConfigurationWithFontScale(UIFont font, UIImageSymbolScale scale);
    /*</methods>*/
}
