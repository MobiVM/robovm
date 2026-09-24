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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIMainMenuSystemConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UIMainMenuSystemConfigurationPtr extends Ptr<UIMainMenuSystemConfiguration, UIMainMenuSystemConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIMainMenuSystemConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIMainMenuSystemConfiguration() {}
    protected UIMainMenuSystemConfiguration(Handle h, long handle) { super(h, handle); }
    protected UIMainMenuSystemConfiguration(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "newScenePreference")
    public native UIMenuSystemElementGroupPreference getNewScenePreference();
    @Property(selector = "setNewScenePreference:")
    public native void setNewScenePreference(UIMenuSystemElementGroupPreference v);
    @Property(selector = "documentPreference")
    public native UIMenuSystemElementGroupPreference getDocumentPreference();
    @Property(selector = "setDocumentPreference:")
    public native void setDocumentPreference(UIMenuSystemElementGroupPreference v);
    @Property(selector = "printingPreference")
    public native UIMenuSystemElementGroupPreference getPrintingPreference();
    @Property(selector = "setPrintingPreference:")
    public native void setPrintingPreference(UIMenuSystemElementGroupPreference v);
    @Property(selector = "findingPreference")
    public native UIMenuSystemElementGroupPreference getFindingPreference();
    @Property(selector = "setFindingPreference:")
    public native void setFindingPreference(UIMenuSystemElementGroupPreference v);
    @Property(selector = "findingConfiguration")
    public native UIMenuSystemFindElementGroupConfiguration getFindingConfiguration();
    @Property(selector = "toolbarPreference")
    public native UIMenuSystemElementGroupPreference getToolbarPreference();
    @Property(selector = "setToolbarPreference:")
    public native void setToolbarPreference(UIMenuSystemElementGroupPreference v);
    @Property(selector = "sidebarPreference")
    public native UIMenuSystemElementGroupPreference getSidebarPreference();
    @Property(selector = "setSidebarPreference:")
    public native void setSidebarPreference(UIMenuSystemElementGroupPreference v);
    @Property(selector = "inspectorPreference")
    public native UIMenuSystemElementGroupPreference getInspectorPreference();
    @Property(selector = "setInspectorPreference:")
    public native void setInspectorPreference(UIMenuSystemElementGroupPreference v);
    @Property(selector = "textFormattingPreference")
    public native UIMenuSystemElementGroupPreference getTextFormattingPreference();
    @Property(selector = "setTextFormattingPreference:")
    public native void setTextFormattingPreference(UIMenuSystemElementGroupPreference v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
