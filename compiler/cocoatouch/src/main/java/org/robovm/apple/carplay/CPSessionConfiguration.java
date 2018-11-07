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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CarPlay") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPSessionConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CPSessionConfigurationPtr extends Ptr<CPSessionConfiguration, CPSessionConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CPSessionConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CPSessionConfiguration() {}
    protected CPSessionConfiguration(Handle h, long handle) { super(h, handle); }
    protected CPSessionConfiguration(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDelegate:")
    public CPSessionConfiguration(CPSessionConfigurationDelegate delegate) { super((SkipInit) null); initObject(init(delegate)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "limitedUserInterfaces")
    public native CPLimitableUserInterface getLimitedUserInterfaces();
    @Property(selector = "delegate")
    public native CPSessionConfigurationDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(CPSessionConfigurationDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDelegate:")
    protected native @Pointer long init(CPSessionConfigurationDelegate delegate);
    /*</methods>*/
}
