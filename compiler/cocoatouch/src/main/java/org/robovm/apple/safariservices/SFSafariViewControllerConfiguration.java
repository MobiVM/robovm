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
package org.robovm.apple.safariservices;

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
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("SafariServices") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SFSafariViewControllerConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SFSafariViewControllerConfigurationPtr extends Ptr<SFSafariViewControllerConfiguration, SFSafariViewControllerConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SFSafariViewControllerConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SFSafariViewControllerConfiguration() {}
    protected SFSafariViewControllerConfiguration(Handle h, long handle) { super(h, handle); }
    protected SFSafariViewControllerConfiguration(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "entersReaderIfAvailable")
    public native boolean isEntersReaderIfAvailable();
    @Property(selector = "setEntersReaderIfAvailable:")
    public native void setEntersReaderIfAvailable(boolean v);
    @Property(selector = "barCollapsingEnabled")
    public native boolean isBarCollapsingEnabled();
    @Property(selector = "setBarCollapsingEnabled:")
    public native void setBarCollapsingEnabled(boolean v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "activityButton")
    public native SFSafariViewControllerActivityButton getActivityButton();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setActivityButton:")
    public native void setActivityButton(SFSafariViewControllerActivityButton v);
    /**
     * @since Available in iOS 15.2 and later.
     */
    @Property(selector = "eventAttribution")
    public native UIEventAttribution getEventAttribution();
    /**
     * @since Available in iOS 15.2 and later.
     */
    @Property(selector = "setEventAttribution:")
    public native void setEventAttribution(UIEventAttribution v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
