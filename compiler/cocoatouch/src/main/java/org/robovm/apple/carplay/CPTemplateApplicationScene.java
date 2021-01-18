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
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CarPlay") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPTemplateApplicationScene/*</name>*/ 
    extends /*<extends>*/UIScene/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CPTemplateApplicationScenePtr extends Ptr<CPTemplateApplicationScene, CPTemplateApplicationScenePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CPTemplateApplicationScene.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CPTemplateApplicationScene() {}
    protected CPTemplateApplicationScene(Handle h, long handle) { super(h, handle); }
    protected CPTemplateApplicationScene(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSession:connectionOptions:")
    public CPTemplateApplicationScene(UISceneSession session, UISceneConnectionOptions connectionOptions) { super(session, connectionOptions); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native CPTemplateApplicationSceneDelegate getDelegate();
    @Property(selector = "setDelegate:")
    public native void setDelegate(CPTemplateApplicationSceneDelegate v);
    @Property(selector = "interfaceController")
    public native CPInterfaceController getInterfaceController();
    @Property(selector = "carWindow")
    public native CPWindow getCarWindow();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="CPTemplateApplicationSceneSessionRoleApplication", optional=true)
    public static native UISceneSessionRole getSceneSessionRole();
    
    
    /*</methods>*/
}
