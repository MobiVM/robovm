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
package org.robovm.apple.messages;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Messages") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MSMessageLiveLayout/*</name>*/ 
    extends /*<extends>*/MSMessageLayout/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MSMessageLiveLayoutPtr extends Ptr<MSMessageLiveLayout, MSMessageLiveLayoutPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MSMessageLiveLayout.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MSMessageLiveLayout() {}
    protected MSMessageLiveLayout(Handle h, long handle) { super(h, handle); }
    protected MSMessageLiveLayout(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAlternateLayout:")
    public MSMessageLiveLayout(MSMessageTemplateLayout alternateLayout) { super((SkipInit) null); initObject(init(alternateLayout)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "alternateLayout")
    public native MSMessageTemplateLayout getAlternateLayout();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAlternateLayout:")
    protected native @Pointer long init(MSMessageTemplateLayout alternateLayout);
    /*</methods>*/
}
