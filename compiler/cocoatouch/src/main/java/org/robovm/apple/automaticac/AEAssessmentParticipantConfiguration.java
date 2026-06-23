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
package org.robovm.apple.automaticac;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AutomaticAssessmentConfiguration") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AEAssessmentParticipantConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AEAssessmentParticipantConfigurationPtr extends Ptr<AEAssessmentParticipantConfiguration, AEAssessmentParticipantConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AEAssessmentParticipantConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AEAssessmentParticipantConfiguration() {}
    protected AEAssessmentParticipantConfiguration(Handle h, long handle) { super(h, handle); }
    protected AEAssessmentParticipantConfiguration(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 17.5 and later.
     */
    @Property(selector = "allowsNetworkAccess")
    public native boolean allowsNetworkAccess();
    /**
     * @since Available in iOS 17.5 and later.
     */
    @Property(selector = "setAllowsNetworkAccess:")
    public native void setAllowsNetworkAccess(boolean v);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Property(selector = "isRequired")
    public native boolean isRequired();
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Property(selector = "setRequired:")
    public native void setRequired(boolean v);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Property(selector = "configurationInfo")
    public native NSDictionary<NSString, ?> getConfigurationInfo();
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Property(selector = "setConfigurationInfo:")
    public native void setConfigurationInfo(NSDictionary<NSString, ?> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
