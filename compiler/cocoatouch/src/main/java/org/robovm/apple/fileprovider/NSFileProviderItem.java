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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/NSFileProviderItem/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "itemIdentifier")
    NSString getItemIdentifier();
    @Property(selector = "parentItemIdentifier")
    NSString getParentItemIdentifier();
    @Property(selector = "filename")
    String getFilename();
    @Property(selector = "typeIdentifier")
    String getTypeIdentifier();
    @Property(selector = "capabilities")
    NSFileProviderItemCapabilities getCapabilities();
    @Property(selector = "documentSize")
    NSNumber getDocumentSize();
    @Property(selector = "childItemCount")
    NSNumber getChildItemCount();
    @Property(selector = "creationDate")
    NSDate getCreationDate();
    @Property(selector = "contentModificationDate")
    NSDate getContentModificationDate();
    @Property(selector = "lastUsedDate")
    NSDate getLastUsedDate();
    @Property(selector = "tagData")
    NSData getTagData();
    @Property(selector = "favoriteRank")
    NSNumber getFavoriteRank();
    @Property(selector = "isTrashed")
    boolean isTrashed();
    @Property(selector = "isUploaded")
    boolean isUploaded();
    @Property(selector = "isUploading")
    boolean isUploading();
    @Property(selector = "uploadingError")
    NSError getUploadingError();
    @Property(selector = "isDownloaded")
    boolean isDownloaded();
    @Property(selector = "isDownloading")
    boolean isDownloading();
    @Property(selector = "downloadingError")
    NSError getDownloadingError();
    @Property(selector = "isMostRecentVersionDownloaded")
    boolean isMostRecentVersionDownloaded();
    @Property(selector = "isShared")
    boolean isShared();
    @Property(selector = "isSharedByCurrentUser")
    boolean isSharedByCurrentUser();
    @Property(selector = "ownerNameComponents")
    NSPersonNameComponents getOwnerNameComponents();
    @Property(selector = "mostRecentEditorNameComponents")
    NSPersonNameComponents getMostRecentEditorNameComponents();
    @Property(selector = "versionIdentifier")
    NSData getVersionIdentifier();
    @Property(selector = "userInfo")
    NSDictionary<?, ?> getUserInfo();
    /*</properties>*/
    /*<methods>*/
    
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
