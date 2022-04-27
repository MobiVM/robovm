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
package org.robovm.apple.screentime;

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
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ScreenTime") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/STScreenTimeConfigurationObserver/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class STScreenTimeConfigurationObserverPtr extends Ptr<STScreenTimeConfigurationObserver, STScreenTimeConfigurationObserverPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(STScreenTimeConfigurationObserver.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected STScreenTimeConfigurationObserver() {}
    protected STScreenTimeConfigurationObserver(Handle h, long handle) { super(h, handle); }
    protected STScreenTimeConfigurationObserver(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithUpdateQueue:")
    public STScreenTimeConfigurationObserver(DispatchQueue updateQueue) { super((SkipInit) null); initObject(init(updateQueue)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "configuration")
    public native STScreenTimeConfiguration getConfiguration();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithUpdateQueue:")
    protected native @Pointer long init(DispatchQueue updateQueue);
    @Method(selector = "startObserving")
    public native void startObserving();
    @Method(selector = "stopObserving")
    public native void stopObserving();
    /*</methods>*/
}
