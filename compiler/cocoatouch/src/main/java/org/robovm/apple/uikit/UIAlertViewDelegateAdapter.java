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
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIAlertViewDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UIAlertViewDelegate/*</implements>*/ {

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
     * @deprecated Deprecated in iOS 9.0. Use UIAlertController instead.
     */
    @Deprecated
    @NotImplemented("alertView:clickedButtonAtIndex:")
    public void clicked(UIAlertView alertView, @MachineSizedSInt long buttonIndex) {}
    /**
     * @deprecated Deprecated in iOS 9.0. Use UIAlertController instead.
     */
    @Deprecated
    @NotImplemented("alertViewCancel:")
    public void cancel(UIAlertView alertView) {}
    /**
     * @deprecated Deprecated in iOS 9.0. Use UIAlertController instead.
     */
    @Deprecated
    @NotImplemented("willPresentAlertView:")
    public void willPresent(UIAlertView alertView) {}
    /**
     * @deprecated Deprecated in iOS 9.0. Use UIAlertController instead.
     */
    @Deprecated
    @NotImplemented("didPresentAlertView:")
    public void didPresent(UIAlertView alertView) {}
    /**
     * @deprecated Deprecated in iOS 9.0. Use UIAlertController instead.
     */
    @Deprecated
    @NotImplemented("alertView:willDismissWithButtonIndex:")
    public void willDismiss(UIAlertView alertView, @MachineSizedSInt long buttonIndex) {}
    /**
     * @deprecated Deprecated in iOS 9.0. Use UIAlertController instead.
     */
    @Deprecated
    @NotImplemented("alertView:didDismissWithButtonIndex:")
    public void didDismiss(UIAlertView alertView, @MachineSizedSInt long buttonIndex) {}
    /**
     * @deprecated Deprecated in iOS 9.0. Use UIAlertController instead.
     */
    @Deprecated
    @NotImplemented("alertViewShouldEnableFirstOtherButton:")
    public boolean shouldEnableFirstOtherButton(UIAlertView alertView) { return false; }
    /*</methods>*/
}
