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
package org.robovm.apple.quicklook;

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
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("QuickLook") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/QLThumbnailReply/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class QLThumbnailReplyPtr extends Ptr<QLThumbnailReply, QLThumbnailReplyPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(QLThumbnailReply.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected QLThumbnailReply() {}
    protected QLThumbnailReply(Handle h, long handle) { super(h, handle); }
    protected QLThumbnailReply(SkipInit skipInit) { super(skipInit); }
    public QLThumbnailReply(@ByVal CGSize contextSize, @Block Block1<CGContext, Boolean> drawingBlock) { super((Handle) null, create(contextSize, drawingBlock)); retain(getHandle()); }
    public QLThumbnailReply(@ByVal CGSize contextSize, @Block BooleanBlock drawingBlock) { super((Handle) null, create(contextSize, drawingBlock)); retain(getHandle()); }
    public QLThumbnailReply(NSURL fileURL) { super((Handle) null, create(fileURL)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "replyWithContextSize:drawingBlock:")
    protected static native @Pointer long create(@ByVal CGSize contextSize, @Block Block1<CGContext, Boolean> drawingBlock);
    @Method(selector = "replyWithContextSize:currentContextDrawingBlock:")
    protected static native @Pointer long create(@ByVal CGSize contextSize, @Block BooleanBlock drawingBlock);
    @Method(selector = "replyWithImageFileURL:")
    protected static native @Pointer long create(NSURL fileURL);
    /*</methods>*/
}
