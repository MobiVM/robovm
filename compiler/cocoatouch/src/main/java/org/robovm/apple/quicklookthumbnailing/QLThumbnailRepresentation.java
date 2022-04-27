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
package org.robovm.apple.quicklookthumbnailing;

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
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("QuickLookThumbnailing") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/QLThumbnailRepresentation/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class QLThumbnailRepresentationPtr extends Ptr<QLThumbnailRepresentation, QLThumbnailRepresentationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(QLThumbnailRepresentation.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public QLThumbnailRepresentation() {}
    protected QLThumbnailRepresentation(Handle h, long handle) { super(h, handle); }
    protected QLThumbnailRepresentation(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "type")
    public native QLThumbnailRepresentationType getType();
    @Property(selector = "CGImage")
    public native CGImage getCGImage();
    @Property(selector = "UIImage")
    public native UIImage getUIImage();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "contentRect")
    public native @ByVal CGRect getContentRect();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
