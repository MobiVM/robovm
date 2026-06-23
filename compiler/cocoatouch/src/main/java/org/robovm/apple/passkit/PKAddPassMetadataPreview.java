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
package org.robovm.apple.passkit;

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
import org.robovm.apple.addressbook.*;
import org.robovm.apple.contacts.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 18.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("PassKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PKAddPassMetadataPreview/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PKAddPassMetadataPreviewPtr extends Ptr<PKAddPassMetadataPreview, PKAddPassMetadataPreviewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PKAddPassMetadataPreview.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected PKAddPassMetadataPreview() {}
    protected PKAddPassMetadataPreview(Handle h, long handle) { super(h, handle); }
    protected PKAddPassMetadataPreview(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPassThumbnail:localizedDescription:")
    public PKAddPassMetadataPreview(CGImage passThumbnail, String description) { super((SkipInit) null); initObject(init(passThumbnail, description)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "passThumbnailImage")
    public native CGImage getPassThumbnailImage();
    @Property(selector = "localizedDescription")
    public native String getLocalizedDescription();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPassThumbnail:localizedDescription:")
    protected native @Pointer long init(CGImage passThumbnail, String description);
    /*</methods>*/
}
