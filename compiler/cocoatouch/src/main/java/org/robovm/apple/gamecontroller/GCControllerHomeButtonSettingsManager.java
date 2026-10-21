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
 * @since Available in iOS 27.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("GameController") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GCControllerHomeButtonSettingsManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GCControllerHomeButtonSettingsManagerPtr extends Ptr<GCControllerHomeButtonSettingsManager, GCControllerHomeButtonSettingsManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GCControllerHomeButtonSettingsManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GCControllerHomeButtonSettingsManager() {}
    protected GCControllerHomeButtonSettingsManager(Handle h, long handle) { super(h, handle); }
    protected GCControllerHomeButtonSettingsManager(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithQueue:")
    public GCControllerHomeButtonSettingsManager(DispatchQueue queue) { super((SkipInit) null); initObject(init(queue)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "settingsDidChangeHandler")
    public native @Block VoidBlock1<GCControllerHomeButtonSettingsManager> getSettingsDidChangeHandler();
    @Property(selector = "setSettingsDidChangeHandler:")
    public native void setSettingsDidChangeHandler(@Block VoidBlock1<GCControllerHomeButtonSettingsManager> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithQueue:")
    protected native @Pointer long init(DispatchQueue queue);
    public boolean openControllerHomeButtonSettings(GCControllerHomeButtonSettingsCustomizationActivity activity) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = openControllerHomeButtonSettings(activity, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "openControllerHomeButtonSettingsForActivity:error:")
    private native boolean openControllerHomeButtonSettings(GCControllerHomeButtonSettingsCustomizationActivity activity, NSError.NSErrorPtr error);
    public GCControllerHomeButtonSettingSystemAction readControllerHomeButtonSystemAction(MachineSizedSIntPtr customization) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       GCControllerHomeButtonSettingSystemAction result = readControllerHomeButtonSystemAction(customization, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "readControllerHomeButtonSystemAction:withError:")
    private native GCControllerHomeButtonSettingSystemAction readControllerHomeButtonSystemAction(MachineSizedSIntPtr customization, NSError.NSErrorPtr error);
    public GCControllerHomeButtonSettingSystemAction readControllerHomeButtonSystemAction() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       GCControllerHomeButtonSettingSystemAction result = readControllerHomeButtonSystemAction(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "readControllerHomeButtonSystemActionWithError:")
    private native GCControllerHomeButtonSettingSystemAction readControllerHomeButtonSystemAction(NSError.NSErrorPtr error);
    public GCControllerHomeButtonSettingInAppAction readControllerHomeButtonInAppAction(MachineSizedSIntPtr customization) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       GCControllerHomeButtonSettingInAppAction result = readControllerHomeButtonInAppAction(customization, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "readControllerHomeButtonInAppAction:withError:")
    private native GCControllerHomeButtonSettingInAppAction readControllerHomeButtonInAppAction(MachineSizedSIntPtr customization, NSError.NSErrorPtr error);
    public GCControllerHomeButtonSettingInAppAction readControllerHomeButtonInAppAction() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       GCControllerHomeButtonSettingInAppAction result = readControllerHomeButtonInAppAction(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "readControllerHomeButtonInAppActionWithError:")
    private native GCControllerHomeButtonSettingInAppAction readControllerHomeButtonInAppAction(NSError.NSErrorPtr error);
    /*</methods>*/
}
