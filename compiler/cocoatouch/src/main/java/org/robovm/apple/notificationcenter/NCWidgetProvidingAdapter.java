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
package org.robovm.apple.notificationcenter;

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
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NCWidgetProvidingAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NCWidgetProviding/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @deprecated Deprecated in iOS 14.0. Use WidgetKit instead. Today View extensions have been deprecated.
     */
    @Deprecated
    @NotImplemented("widgetPerformUpdateWithCompletionHandler:")
    public void performUpdate(@Block VoidBlock1<NCUpdateResult> completionHandler) {}
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use WidgetKit instead. Today View extensions have been deprecated.
     */
    @Deprecated
    @NotImplemented("widgetActiveDisplayModeDidChange:withMaximumSize:")
    public void activeDisplayModeDidChange(NCWidgetDisplayMode activeDisplayMode, @ByVal CGSize maxSize) {}
    /**
     * @deprecated Deprecated in iOS 10.0. This method will not be called on widgets linked against iOS versions 10.0 and later.
     */
    @Deprecated
    @NotImplemented("widgetMarginInsetsForProposedMarginInsets:")
    public @ByVal UIEdgeInsets getMarginInsetsForProposedInsets(@ByVal UIEdgeInsets defaultMarginInsets) { return null; }
    /*</methods>*/
}
