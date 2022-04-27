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
package org.robovm.apple.imagecapturecore;

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
/*<annotations>*/@Library("ImageCaptureCore")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ICDownloadOption/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(ICDownloadOption.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="ICDownloadsDirectoryURL", optional=true)
    public static native NSString DownloadsDirectoryURL();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="ICSaveAsFilename", optional=true)
    public static native NSString SaveAsFilename();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="ICSavedFilename", optional=true)
    public static native NSString SavedFilename();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="ICSavedAncillaryFiles", optional=true)
    public static native NSString SavedAncillaryFiles();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="ICOverwrite", optional=true)
    public static native NSString Overwrite();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="ICDeleteAfterSuccessfulDownload", optional=true)
    public static native NSString DeleteAfterSuccessfulDownload();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="ICDownloadSidecarFiles", optional=true)
    public static native NSString DownloadSidecarFiles();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="ICTruncateAfterSuccessfulDownload", optional=true)
    public static native NSString TruncateAfterSuccessfulDownload();
    /*</methods>*/
}
