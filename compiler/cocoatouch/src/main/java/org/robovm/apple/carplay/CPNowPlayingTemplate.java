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
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CarPlay") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPNowPlayingTemplate/*</name>*/ 
    extends /*<extends>*/CPTemplate/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CPNowPlayingTemplatePtr extends Ptr<CPNowPlayingTemplate, CPNowPlayingTemplatePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CPNowPlayingTemplate.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CPNowPlayingTemplate() {}
    protected CPNowPlayingTemplate(Handle h, long handle) { super(h, handle); }
    protected CPNowPlayingTemplate(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sharedTemplate")
    public static native CPNowPlayingTemplate getSharedTemplate();
    @Property(selector = "nowPlayingButtons")
    public native NSArray<CPNowPlayingButton> getNowPlayingButtons();
    @Property(selector = "isUpNextButtonEnabled")
    public native boolean isUpNextButtonEnabled();
    @Property(selector = "setUpNextButtonEnabled:")
    public native void setUpNextButtonEnabled(boolean v);
    @Property(selector = "upNextTitle")
    public native String getUpNextTitle();
    @Property(selector = "setUpNextTitle:")
    public native void setUpNextTitle(String v);
    @Property(selector = "isAlbumArtistButtonEnabled")
    public native boolean isAlbumArtistButtonEnabled();
    @Property(selector = "setAlbumArtistButtonEnabled:")
    public native void setAlbumArtistButtonEnabled(boolean v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "addObserver:")
    public native void addObserver(CPNowPlayingTemplateObserver observer);
    @Method(selector = "removeObserver:")
    public native void removeObserver(CPNowPlayingTemplateObserver observer);
    @Method(selector = "updateNowPlayingButtons:")
    public native void updateNowPlayingButtons(NSArray<CPNowPlayingButton> nowPlayingButtons);
    /*</methods>*/
}
