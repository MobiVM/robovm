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
package org.robovm.apple.foundation;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.security.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("Foundation") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/NSURLFileSystemProperty/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSURLFileSystemProperty/*</name>*/ 
    extends /*<extends>*/NSURLProperty/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/NSURLFileSystemProperty/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static NSURLFileSystemProperty toObject(Class<NSURLFileSystemProperty> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return NSURLFileSystemProperty.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(NSURLFileSystemProperty o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<NSURLFileSystemProperty> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<NSURLFileSystemProperty> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(NSURLFileSystemProperty.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<NSURLFileSystemProperty> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (NSURLFileSystemProperty o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final NSURLFileSystemProperty Name = new NSURLFileSystemProperty("Name");
    public static final NSURLFileSystemProperty LocalizedName = new NSURLFileSystemProperty("LocalizedName");
    public static final NSURLFileSystemProperty IsRegularFile = new NSURLFileSystemProperty("IsRegularFile");
    public static final NSURLFileSystemProperty IsDirectory = new NSURLFileSystemProperty("IsDirectory");
    public static final NSURLFileSystemProperty IsSymbolicLink = new NSURLFileSystemProperty("IsSymbolicLink");
    public static final NSURLFileSystemProperty IsVolume = new NSURLFileSystemProperty("IsVolume");
    public static final NSURLFileSystemProperty IsPackage = new NSURLFileSystemProperty("IsPackage");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final NSURLFileSystemProperty IsApplication = new NSURLFileSystemProperty("IsApplication");
    public static final NSURLFileSystemProperty IsSystemImmutable = new NSURLFileSystemProperty("IsSystemImmutable");
    public static final NSURLFileSystemProperty IsUserImmutable = new NSURLFileSystemProperty("IsUserImmutable");
    public static final NSURLFileSystemProperty IsHidden = new NSURLFileSystemProperty("IsHidden");
    public static final NSURLFileSystemProperty HasHiddenExtension = new NSURLFileSystemProperty("HasHiddenExtension");
    public static final NSURLFileSystemProperty CreationDate = new NSURLFileSystemProperty("CreationDate");
    public static final NSURLFileSystemProperty ContentAccessDate = new NSURLFileSystemProperty("ContentAccessDate");
    public static final NSURLFileSystemProperty ContentModificationDate = new NSURLFileSystemProperty("ContentModificationDate");
    public static final NSURLFileSystemProperty AttributeModificationDate = new NSURLFileSystemProperty("AttributeModificationDate");
    public static final NSURLFileSystemProperty LinkCount = new NSURLFileSystemProperty("LinkCount");
    public static final NSURLFileSystemProperty ParentDirectoryURL = new NSURLFileSystemProperty("ParentDirectoryURL");
    public static final NSURLFileSystemProperty VolumeURL = new NSURLFileSystemProperty("VolumeURL");
    /**
     * @deprecated Use NSURLContentTypeKey instead
     */
    @Deprecated
    public static final NSURLFileSystemProperty TypeIdentifier = new NSURLFileSystemProperty("TypeIdentifier");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final NSURLFileSystemProperty ContentType = new NSURLFileSystemProperty("ContentType");
    public static final NSURLFileSystemProperty LocalizedTypeDescription = new NSURLFileSystemProperty("LocalizedTypeDescription");
    public static final NSURLFileSystemProperty LabelNumber = new NSURLFileSystemProperty("LabelNumber");
    public static final NSURLFileSystemProperty LabelColor = new NSURLFileSystemProperty("LabelColor");
    public static final NSURLFileSystemProperty LocalizedLabel = new NSURLFileSystemProperty("LocalizedLabel");
    public static final NSURLFileSystemProperty EffectiveIcon = new NSURLFileSystemProperty("EffectiveIcon");
    public static final NSURLFileSystemProperty CustomIcon = new NSURLFileSystemProperty("CustomIcon");
    public static final NSURLFileSystemProperty FileResourceIdentifier = new NSURLFileSystemProperty("FileResourceIdentifier");
    public static final NSURLFileSystemProperty VolumeIdentifier = new NSURLFileSystemProperty("VolumeIdentifier");
    public static final NSURLFileSystemProperty PreferredIOBlockSize = new NSURLFileSystemProperty("PreferredIOBlockSize");
    public static final NSURLFileSystemProperty IsReadable = new NSURLFileSystemProperty("IsReadable");
    public static final NSURLFileSystemProperty IsWritable = new NSURLFileSystemProperty("IsWritable");
    public static final NSURLFileSystemProperty IsExecutable = new NSURLFileSystemProperty("IsExecutable");
    public static final NSURLFileSystemProperty FileSecurity = new NSURLFileSystemProperty("FileSecurity");
    public static final NSURLFileSystemProperty IsExcludedFromBackup = new NSURLFileSystemProperty("IsExcludedFromBackup");
    public static final NSURLFileSystemProperty Path = new NSURLFileSystemProperty("Path");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final NSURLFileSystemProperty CanonicalPath = new NSURLFileSystemProperty("CanonicalPath");
    public static final NSURLFileSystemProperty IsMountTrigger = new NSURLFileSystemProperty("IsMountTrigger");
    public static final NSURLFileSystemProperty GenerationIdentifier = new NSURLFileSystemProperty("GenerationIdentifier");
    public static final NSURLFileSystemProperty DocumentIdentifier = new NSURLFileSystemProperty("DocumentIdentifier");
    public static final NSURLFileSystemProperty AddedToDirectoryDate = new NSURLFileSystemProperty("AddedToDirectoryDate");
    public static final NSURLFileSystemProperty FileResourceType = new NSURLFileSystemProperty("FileResourceType");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final NSURLFileSystemProperty FileContentIdentifier = new NSURLFileSystemProperty("FileContentIdentifier");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final NSURLFileSystemProperty MayShareFileContent = new NSURLFileSystemProperty("MayShareFileContent");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final NSURLFileSystemProperty MayHaveExtendedAttributes = new NSURLFileSystemProperty("MayHaveExtendedAttributes");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final NSURLFileSystemProperty IsPurgeable = new NSURLFileSystemProperty("IsPurgeable");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final NSURLFileSystemProperty IsSparse = new NSURLFileSystemProperty("IsSparse");
    /**
     * @deprecated Use the QuickLookThumbnailing framework and extension point instead
     */
    @Deprecated
    public static final NSURLFileSystemProperty ThumbnailDictionary = new NSURLFileSystemProperty("ThumbnailDictionary");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final NSURLFileSystemProperty FileProtection = new NSURLFileSystemProperty("FileProtection");
    /*</constants>*/
    
    private static /*<name>*/NSURLFileSystemProperty/*</name>*/[] values = new /*<name>*/NSURLFileSystemProperty/*</name>*/[] {/*<value_list>*/Name, LocalizedName, IsRegularFile, IsDirectory, IsSymbolicLink, IsVolume, IsPackage, IsApplication, IsSystemImmutable, IsUserImmutable, IsHidden, HasHiddenExtension, CreationDate, ContentAccessDate, ContentModificationDate, AttributeModificationDate, LinkCount, ParentDirectoryURL, VolumeURL, TypeIdentifier, ContentType, LocalizedTypeDescription, LabelNumber, LabelColor, LocalizedLabel, EffectiveIcon, CustomIcon, FileResourceIdentifier, VolumeIdentifier, PreferredIOBlockSize, IsReadable, IsWritable, IsExecutable, FileSecurity, IsExcludedFromBackup, Path, CanonicalPath, IsMountTrigger, GenerationIdentifier, DocumentIdentifier, AddedToDirectoryDate, FileResourceType, FileContentIdentifier, MayShareFileContent, MayHaveExtendedAttributes, IsPurgeable, IsSparse, ThumbnailDictionary, FileProtection/*</value_list>*/};
    
    /*<name>*/NSURLFileSystemProperty/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/NSURLFileSystemProperty/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/NSURLFileSystemProperty/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/NSURLFileSystemProperty/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("Foundation") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="NSURLNameKey", optional=true)
        public static native NSString Name();
        @GlobalValue(symbol="NSURLLocalizedNameKey", optional=true)
        public static native NSString LocalizedName();
        @GlobalValue(symbol="NSURLIsRegularFileKey", optional=true)
        public static native NSString IsRegularFile();
        @GlobalValue(symbol="NSURLIsDirectoryKey", optional=true)
        public static native NSString IsDirectory();
        @GlobalValue(symbol="NSURLIsSymbolicLinkKey", optional=true)
        public static native NSString IsSymbolicLink();
        @GlobalValue(symbol="NSURLIsVolumeKey", optional=true)
        public static native NSString IsVolume();
        @GlobalValue(symbol="NSURLIsPackageKey", optional=true)
        public static native NSString IsPackage();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="NSURLIsApplicationKey", optional=true)
        public static native NSString IsApplication();
        @GlobalValue(symbol="NSURLIsSystemImmutableKey", optional=true)
        public static native NSString IsSystemImmutable();
        @GlobalValue(symbol="NSURLIsUserImmutableKey", optional=true)
        public static native NSString IsUserImmutable();
        @GlobalValue(symbol="NSURLIsHiddenKey", optional=true)
        public static native NSString IsHidden();
        @GlobalValue(symbol="NSURLHasHiddenExtensionKey", optional=true)
        public static native NSString HasHiddenExtension();
        @GlobalValue(symbol="NSURLCreationDateKey", optional=true)
        public static native NSString CreationDate();
        @GlobalValue(symbol="NSURLContentAccessDateKey", optional=true)
        public static native NSString ContentAccessDate();
        @GlobalValue(symbol="NSURLContentModificationDateKey", optional=true)
        public static native NSString ContentModificationDate();
        @GlobalValue(symbol="NSURLAttributeModificationDateKey", optional=true)
        public static native NSString AttributeModificationDate();
        @GlobalValue(symbol="NSURLLinkCountKey", optional=true)
        public static native NSString LinkCount();
        @GlobalValue(symbol="NSURLParentDirectoryURLKey", optional=true)
        public static native NSString ParentDirectoryURL();
        @GlobalValue(symbol="NSURLVolumeURLKey", optional=true)
        public static native NSString VolumeURL();
        /**
         * @deprecated Use NSURLContentTypeKey instead
         */
        @Deprecated
        @GlobalValue(symbol="NSURLTypeIdentifierKey", optional=true)
        public static native NSString TypeIdentifier();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="NSURLContentTypeKey", optional=true)
        public static native NSString ContentType();
        @GlobalValue(symbol="NSURLLocalizedTypeDescriptionKey", optional=true)
        public static native NSString LocalizedTypeDescription();
        @GlobalValue(symbol="NSURLLabelNumberKey", optional=true)
        public static native NSString LabelNumber();
        @GlobalValue(symbol="NSURLLabelColorKey", optional=true)
        public static native NSString LabelColor();
        @GlobalValue(symbol="NSURLLocalizedLabelKey", optional=true)
        public static native NSString LocalizedLabel();
        @GlobalValue(symbol="NSURLEffectiveIconKey", optional=true)
        public static native NSString EffectiveIcon();
        @GlobalValue(symbol="NSURLCustomIconKey", optional=true)
        public static native NSString CustomIcon();
        @GlobalValue(symbol="NSURLFileResourceIdentifierKey", optional=true)
        public static native NSString FileResourceIdentifier();
        @GlobalValue(symbol="NSURLVolumeIdentifierKey", optional=true)
        public static native NSString VolumeIdentifier();
        @GlobalValue(symbol="NSURLPreferredIOBlockSizeKey", optional=true)
        public static native NSString PreferredIOBlockSize();
        @GlobalValue(symbol="NSURLIsReadableKey", optional=true)
        public static native NSString IsReadable();
        @GlobalValue(symbol="NSURLIsWritableKey", optional=true)
        public static native NSString IsWritable();
        @GlobalValue(symbol="NSURLIsExecutableKey", optional=true)
        public static native NSString IsExecutable();
        @GlobalValue(symbol="NSURLFileSecurityKey", optional=true)
        public static native NSString FileSecurity();
        @GlobalValue(symbol="NSURLIsExcludedFromBackupKey", optional=true)
        public static native NSString IsExcludedFromBackup();
        @GlobalValue(symbol="NSURLPathKey", optional=true)
        public static native NSString Path();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="NSURLCanonicalPathKey", optional=true)
        public static native NSString CanonicalPath();
        @GlobalValue(symbol="NSURLIsMountTriggerKey", optional=true)
        public static native NSString IsMountTrigger();
        @GlobalValue(symbol="NSURLGenerationIdentifierKey", optional=true)
        public static native NSString GenerationIdentifier();
        @GlobalValue(symbol="NSURLDocumentIdentifierKey", optional=true)
        public static native NSString DocumentIdentifier();
        @GlobalValue(symbol="NSURLAddedToDirectoryDateKey", optional=true)
        public static native NSString AddedToDirectoryDate();
        @GlobalValue(symbol="NSURLFileResourceTypeKey", optional=true)
        public static native NSString FileResourceType();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="NSURLFileContentIdentifierKey", optional=true)
        public static native NSString FileContentIdentifier();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="NSURLMayShareFileContentKey", optional=true)
        public static native NSString MayShareFileContent();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="NSURLMayHaveExtendedAttributesKey", optional=true)
        public static native NSString MayHaveExtendedAttributes();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="NSURLIsPurgeableKey", optional=true)
        public static native NSString IsPurgeable();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="NSURLIsSparseKey", optional=true)
        public static native NSString IsSparse();
        /**
         * @deprecated Use the QuickLookThumbnailing framework and extension point instead
         */
        @Deprecated
        @GlobalValue(symbol="NSURLThumbnailDictionaryKey", optional=true)
        public static native NSString ThumbnailDictionary();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="NSURLFileProtectionKey", optional=true)
        public static native NSString FileProtection();
        /*</values>*/
    }
}
