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
package org.robovm.apple.mediaplayer;

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
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @deprecated Deprecated in iOS 14.0. Use CarPlay framework
 */
/*</javadoc>*/
/*<annotations>*/@Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/MPPlayableContentDataSource/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "beginLoadingChildItemsAtIndexPath:completionHandler:")
    void beginLoadingChildItems(NSIndexPath indexPath, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "childItemsDisplayPlaybackProgressAtIndexPath:")
    boolean childItemsDisplayPlaybackProgress(NSIndexPath indexPath);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use CarPlay framework
     */
    @Deprecated
    @Method(selector = "contentItemForIdentifier:completionHandler:")
    void getContentItem(String identifier, @Block VoidBlock2<MPContentItem, NSError> completionHandler);
    @Method(selector = "numberOfChildItemsAtIndexPath:")
    @MachineSizedSInt long getNumberOfChildItems(NSIndexPath indexPath);
    @Method(selector = "contentItemAtIndexPath:")
    MPContentItem getContentItem(NSIndexPath indexPath);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
