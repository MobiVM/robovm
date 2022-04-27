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
package org.robovm.apple.mediaplayer;

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
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 8.4 and later.
 * @deprecated Deprecated in iOS 14.0. Use CarPlay framework
 */
/*</javadoc>*/
/*<annotations>*/@Library("MediaPlayer") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPPlayableContentManagerContext/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPPlayableContentManagerContextPtr extends Ptr<MPPlayableContentManagerContext, MPPlayableContentManagerContextPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPPlayableContentManagerContext.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPPlayableContentManagerContext() {}
    protected MPPlayableContentManagerContext(Handle h, long handle) { super(h, handle); }
    protected MPPlayableContentManagerContext(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "enforcedContentItemsCount")
    public native @MachineSizedSInt long getEnforcedContentItemsCount();
    @Property(selector = "enforcedContentTreeDepth")
    public native @MachineSizedSInt long getEnforcedContentTreeDepth();
    @Property(selector = "contentLimitsEnforced")
    public native boolean isContentLimitsEnforced();
    /**
     * @since Available in iOS 8.4 and later.
     * @deprecated Deprecated in iOS 9.0. Use contentLimitsEnforced
     */
    @Deprecated
    @Property(selector = "contentLimitsEnabled")
    public native boolean isContentLimitsEnabled();
    @Property(selector = "endpointAvailable")
    public native boolean isEndpointAvailable();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
