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
package org.robovm.apple.iad;

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
import org.robovm.apple.mediaplayer.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.avkit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("iAd") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ADInterstitialAdPresentationViewController/*</name>*/ 
    extends /*<extends>*/UIViewController/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ADInterstitialAdPresentationViewControllerPtr extends Ptr<ADInterstitialAdPresentationViewController, ADInterstitialAdPresentationViewControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ADInterstitialAdPresentationViewController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ADInterstitialAdPresentationViewController() {}
    protected ADInterstitialAdPresentationViewController(Handle h, long handle) { super(h, handle); }
    protected ADInterstitialAdPresentationViewController(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initForInterstitialAd:")
    public ADInterstitialAdPresentationViewController(ADInterstitialAd interstitialAd) { super((SkipInit) null); initObject(init(interstitialAd)); }
    @Method(selector = "initWithNibName:bundle:")
    public ADInterstitialAdPresentationViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { super(nibNameOrNil, nibBundleOrNil); }
    @Method(selector = "initWithCoder:")
    public ADInterstitialAdPresentationViewController(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initForInterstitialAd:")
    protected native @Pointer long init(ADInterstitialAd interstitialAd);
    @Method(selector = "shouldTestVisibilityAtPoint:")
    public native boolean shouldTestVisibilityAtPoint(@ByVal CGPoint point);
    /*</methods>*/
}
