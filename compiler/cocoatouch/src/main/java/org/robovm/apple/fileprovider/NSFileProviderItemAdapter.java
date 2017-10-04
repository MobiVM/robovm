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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSFileProviderItemAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSFileProviderItem/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("itemIdentifier")
    public NSString getItemIdentifier() { return null; }
    @NotImplemented("parentItemIdentifier")
    public NSString getParentItemIdentifier() { return null; }
    @NotImplemented("filename")
    public String getFilename() { return null; }
    @NotImplemented("typeIdentifier")
    public String getTypeIdentifier() { return null; }
    @NotImplemented("capabilities")
    public NSFileProviderItemCapabilities getCapabilities() { return null; }
    @NotImplemented("documentSize")
    public NSNumber getDocumentSize() { return null; }
    @NotImplemented("childItemCount")
    public NSNumber getChildItemCount() { return null; }
    @NotImplemented("creationDate")
    public NSDate getCreationDate() { return null; }
    @NotImplemented("contentModificationDate")
    public NSDate getContentModificationDate() { return null; }
    @NotImplemented("lastUsedDate")
    public NSDate getLastUsedDate() { return null; }
    @NotImplemented("tagData")
    public NSData getTagData() { return null; }
    @NotImplemented("favoriteRank")
    public NSNumber getFavoriteRank() { return null; }
    @NotImplemented("isTrashed")
    public boolean isTrashed() { return false; }
    @NotImplemented("isUploaded")
    public boolean isUploaded() { return false; }
    @NotImplemented("isUploading")
    public boolean isUploading() { return false; }
    @NotImplemented("uploadingError")
    public NSError getUploadingError() { return null; }
    @NotImplemented("isDownloaded")
    public boolean isDownloaded() { return false; }
    @NotImplemented("isDownloading")
    public boolean isDownloading() { return false; }
    @NotImplemented("downloadingError")
    public NSError getDownloadingError() { return null; }
    @NotImplemented("isMostRecentVersionDownloaded")
    public boolean isMostRecentVersionDownloaded() { return false; }
    @NotImplemented("isShared")
    public boolean isShared() { return false; }
    @NotImplemented("isSharedByCurrentUser")
    public boolean isSharedByCurrentUser() { return false; }
    @NotImplemented("ownerNameComponents")
    public NSPersonNameComponents getOwnerNameComponents() { return null; }
    @NotImplemented("mostRecentEditorNameComponents")
    public NSPersonNameComponents getMostRecentEditorNameComponents() { return null; }
    @NotImplemented("versionIdentifier")
    public NSData getVersionIdentifier() { return null; }
    @NotImplemented("userInfo")
    public NSDictionary<?, ?> getUserInfo() { return null; }
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
