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
 * @since Available in iOS 18.2 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIWritingToolsCoordinatorAnimationParameters/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UIWritingToolsCoordinatorAnimationParametersPtr extends Ptr<UIWritingToolsCoordinatorAnimationParameters, UIWritingToolsCoordinatorAnimationParametersPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIWritingToolsCoordinatorAnimationParameters.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UIWritingToolsCoordinatorAnimationParameters() {}
    protected UIWritingToolsCoordinatorAnimationParameters(Handle h, long handle) { super(h, handle); }
    protected UIWritingToolsCoordinatorAnimationParameters(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "duration")
    public native @MachineSizedFloat double getDuration();
    @Property(selector = "delay")
    public native @MachineSizedFloat double getDelay();
    @Property(selector = "progressHandler")
    public native @Block VoidFloatBlock getProgressHandler();
    @Property(selector = "setProgressHandler:")
    public native void setProgressHandler(@Block VoidFloatBlock v);
    @Property(selector = "completionHandler")
    public native @Block Runnable getCompletionHandler();
    @Property(selector = "setCompletionHandler:")
    public native void setCompletionHandler(@Block Runnable v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
