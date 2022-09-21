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
package org.robovm.apple.fileprovider;

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
import org.robovm.apple.uniformtypeid.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSFileProviderReplicatedExtensionAdapter/*</name>*/ 
    extends /*<extends>*/NSFileProviderEnumeratingAdapter/*</extends>*/ 
    /*<implements>*/implements NSFileProviderReplicatedExtension/*</implements>*/ {

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
    @NotImplemented("invalidate")
    public void invalidate() {}
    @NotImplemented("itemForIdentifier:request:completionHandler:")
    public NSProgress item(NSString identifier, NSFileProviderRequest request, @Block VoidBlock2<NSFileProviderItem, NSError> completionHandler) { return null; }
    @NotImplemented("fetchContentsForItemWithIdentifier:version:request:completionHandler:")
    public NSProgress fetchContentsForItem(NSString itemIdentifier, NSFileProviderItemVersion requestedVersion, NSFileProviderRequest request, @Block VoidBlock3<NSURL, NSFileProviderItem, NSError> completionHandler) { return null; }
    @NotImplemented("createItemBasedOnTemplate:fields:contents:options:request:completionHandler:")
    public NSProgress createItemBasedOnTemplate(NSFileProviderItem itemTemplate, NSFileProviderItemFields fields, NSURL url, NSFileProviderCreateItemOptions options, NSFileProviderRequest request, @Block VoidBlock4<NSFileProviderItem, NSFileProviderItemFields, Boolean, NSError> completionHandler) { return null; }
    @NotImplemented("modifyItem:baseVersion:changedFields:contents:options:request:completionHandler:")
    public NSProgress modifyItem(NSFileProviderItem item, NSFileProviderItemVersion version, NSFileProviderItemFields changedFields, NSURL newContents, NSFileProviderModifyItemOptions options, NSFileProviderRequest request, @Block VoidBlock4<NSFileProviderItem, NSFileProviderItemFields, Boolean, NSError> completionHandler) { return null; }
    @NotImplemented("deleteItemWithIdentifier:baseVersion:options:request:completionHandler:")
    public NSProgress deleteItem(NSString identifier, NSFileProviderItemVersion version, NSFileProviderDeleteItemOptions options, NSFileProviderRequest request, @Block VoidBlock1<NSError> completionHandler) { return null; }
    @NotImplemented("importDidFinishWithCompletionHandler:")
    public void importDidFinish(@Block Runnable completionHandler) {}
    @NotImplemented("materializedItemsDidChangeWithCompletionHandler:")
    public void materializedItemsDidChange(@Block Runnable completionHandler) {}
    /**
     * @since Available in iOS 16.0 and later.
     */
    @NotImplemented("pendingItemsDidChangeWithCompletionHandler:")
    public void pendingItemsDidChange(@Block Runnable completionHandler) {}
    /*</methods>*/
}
