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
package org.robovm.apple.corespotlight;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/CSSearchableIndexDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "searchableIndex:reindexAllSearchableItemsWithAcknowledgementHandler:")
    void reindexAllSearchableItems(CSSearchableIndex searchableIndex, @Block Runnable acknowledgementHandler);
    @Method(selector = "searchableIndex:reindexSearchableItemsWithIdentifiers:acknowledgementHandler:")
    void reindexSearchableItems(CSSearchableIndex searchableIndex, NSArray<NSString> identifiers, @Block Runnable acknowledgementHandler);
    @Method(selector = "searchableIndexDidThrottle:")
    void searchableIndexDidThrottle(CSSearchableIndex searchableIndex);
    @Method(selector = "searchableIndexDidFinishThrottle:")
    void searchableIndexDidFinishThrottle(CSSearchableIndex searchableIndex);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "dataForSearchableIndex:itemIdentifier:typeIdentifier:error:")
    NSData getDataForSearchableIndex(CSSearchableIndex searchableIndex, String itemIdentifier, String typeIdentifier, NSError.NSErrorPtr outError);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "fileURLForSearchableIndex:itemIdentifier:typeIdentifier:inPlace:error:")
    NSURL getFileURLForSearchableIndex(CSSearchableIndex searchableIndex, String itemIdentifier, String typeIdentifier, boolean inPlace, NSError.NSErrorPtr outError);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
