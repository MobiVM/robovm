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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/STWebpageController/*</name>*/ 
    extends /*<extends>*/UIViewController/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class STWebpageControllerPtr extends Ptr<STWebpageController, STWebpageControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(STWebpageController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public STWebpageController() {}
    protected STWebpageController(Handle h, long handle) { super(h, handle); }
    protected STWebpageController(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "suppressUsageRecording")
    public native boolean isSuppressUsageRecording();
    @Property(selector = "setSuppressUsageRecording:")
    public native void setSuppressUsageRecording(boolean v);
    @Property(selector = "URL")
    public native NSURL getURL();
    @Property(selector = "setURL:")
    public native void setURL(NSURL v);
    @Property(selector = "URLIsPlayingVideo")
    public native boolean isURLIsPlayingVideo();
    @Property(selector = "setURLIsPlayingVideo:")
    public native void setURLIsPlayingVideo(boolean v);
    @Property(selector = "URLIsPictureInPicture")
    public native boolean isURLIsPictureInPicture();
    @Property(selector = "setURLIsPictureInPicture:")
    public native void setURLIsPictureInPicture(boolean v);
    @Property(selector = "URLIsBlocked")
    public native boolean isURLIsBlocked();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    public boolean setBundleIdentifier(String bundleIdentifier) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = setBundleIdentifier(bundleIdentifier, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "setBundleIdentifier:error:")
    private native boolean setBundleIdentifier(String bundleIdentifier, NSError.NSErrorPtr error);
    /*</methods>*/
}
