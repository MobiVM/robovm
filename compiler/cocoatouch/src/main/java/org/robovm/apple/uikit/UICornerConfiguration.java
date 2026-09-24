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
import org.robovm.apple.symbols.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 26.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UICornerConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UICornerConfigurationPtr extends Ptr<UICornerConfiguration, UICornerConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UICornerConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UICornerConfiguration() {}
    protected UICornerConfiguration(Handle h, long handle) { super(h, handle); }
    protected UICornerConfiguration(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "configurationWithRadius:")
    public static native UICornerConfiguration getConfiguration(UICornerRadius radius);
    @Method(selector = "configurationWithTopLeftRadius:topRightRadius:bottomLeftRadius:bottomRightRadius:")
    public static native UICornerConfiguration getConfiguration(UICornerRadius topLeftRadius, UICornerRadius topRightRadius, UICornerRadius bottomLeftRadius, UICornerRadius bottomRightRadius);
    @Method(selector = "capsuleConfiguration")
    public static native UICornerConfiguration capsuleConfiguration();
    @Method(selector = "capsuleConfigurationWithMaximumRadius:")
    public static native UICornerConfiguration getCapsuleConfiguration(@MachineSizedFloat double maximumRadius);
    @Method(selector = "configurationWithUniformRadius:")
    public static native UICornerConfiguration getConfigurationWithUniformRadius(UICornerRadius radius);
    @Method(selector = "configurationWithUniformTopRadius:uniformBottomRadius:")
    public static native UICornerConfiguration getConfigurationWithUniformTopBottomRadius(UICornerRadius topRadius, UICornerRadius bottomRadius);
    @Method(selector = "configurationWithUniformLeftRadius:uniformRightRadius:")
    public static native UICornerConfiguration getConfigurationWithUniformLeftRightRadius(UICornerRadius leftRadius, UICornerRadius rightRadius);
    @Method(selector = "configurationWithUniformTopRadius:bottomLeftRadius:bottomRightRadius:")
    public static native UICornerConfiguration getConfigurationWithUniformTopRadius(UICornerRadius topRadius, UICornerRadius bottomLeftRadius, UICornerRadius bottomRightRadius);
    @Method(selector = "configurationWithUniformBottomRadius:topLeftRadius:topRightRadius:")
    public static native UICornerConfiguration getConfigurationWithUniformBottomRadius(UICornerRadius bottomRadius, UICornerRadius topLeftRadius, UICornerRadius topRightRadius);
    @Method(selector = "configurationWithUniformLeftRadius:topRightRadius:bottomRightRadius:")
    public static native UICornerConfiguration getConfigurationWithUniformLeftRadius(UICornerRadius leftRadius, UICornerRadius topRightRadius, UICornerRadius bottomRightRadius);
    @Method(selector = "configurationWithUniformRightRadius:topLeftRadius:bottomLeftRadius:")
    public static native UICornerConfiguration getConfigurationWithUniformRightRadius(UICornerRadius rightRadius, UICornerRadius topLeftRadius, UICornerRadius bottomLeftRadius);
    /*</methods>*/
}
