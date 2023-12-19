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
package org.robovm.apple.corefoundation;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreservices.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coretext.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreFoundation") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/CFURLFileSystemProperty/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CFURLFileSystemProperty/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<CFString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/CFURLFileSystemProperty/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CFURLFileSystemProperty toObject(Class<CFURLFileSystemProperty> cls, long handle, long flags) {
            CFString o = (CFString) CFType.Marshaler.toObject(CFString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return CFURLFileSystemProperty.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(CFURLFileSystemProperty o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CFURLFileSystemProperty> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(CFArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CFURLFileSystemProperty> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(CFURLFileSystemProperty.valueOf(o.get(i, CFString.class)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CFURLFileSystemProperty> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray array = CFMutableArray.create();
            for (CFURLFileSystemProperty o : l) {
                array.add(o.value());
            }
            return CFType.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final CFURLFileSystemProperty Name = new CFURLFileSystemProperty("Name");
    public static final CFURLFileSystemProperty LocalizedName = new CFURLFileSystemProperty("LocalizedName");
    public static final CFURLFileSystemProperty IsRegularFile = new CFURLFileSystemProperty("IsRegularFile");
    public static final CFURLFileSystemProperty IsDirectory = new CFURLFileSystemProperty("IsDirectory");
    public static final CFURLFileSystemProperty IsSymbolicLink = new CFURLFileSystemProperty("IsSymbolicLink");
    public static final CFURLFileSystemProperty IsVolume = new CFURLFileSystemProperty("IsVolume");
    public static final CFURLFileSystemProperty IsPackage = new CFURLFileSystemProperty("IsPackage");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final CFURLFileSystemProperty IsApplication = new CFURLFileSystemProperty("IsApplication");
    public static final CFURLFileSystemProperty IsSystemImmutable = new CFURLFileSystemProperty("IsSystemImmutable");
    public static final CFURLFileSystemProperty IsUserImmutable = new CFURLFileSystemProperty("IsUserImmutable");
    public static final CFURLFileSystemProperty IsHidden = new CFURLFileSystemProperty("IsHidden");
    public static final CFURLFileSystemProperty HasHiddenExtension = new CFURLFileSystemProperty("HasHiddenExtension");
    public static final CFURLFileSystemProperty CreationDate = new CFURLFileSystemProperty("CreationDate");
    public static final CFURLFileSystemProperty ContentAccessDate = new CFURLFileSystemProperty("ContentAccessDate");
    public static final CFURLFileSystemProperty ContentModificationDate = new CFURLFileSystemProperty("ContentModificationDate");
    public static final CFURLFileSystemProperty AttributeModificationDate = new CFURLFileSystemProperty("AttributeModificationDate");
    /**
     * @since Available in iOS 16.4 and later.
     */
    public static final CFURLFileSystemProperty FileIdentifier = new CFURLFileSystemProperty("FileIdentifier");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final CFURLFileSystemProperty FileContentIdentifier = new CFURLFileSystemProperty("FileContentIdentifier");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final CFURLFileSystemProperty MayShareFileContent = new CFURLFileSystemProperty("MayShareFileContent");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final CFURLFileSystemProperty MayHaveExtendedAttributes = new CFURLFileSystemProperty("MayHaveExtendedAttributes");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final CFURLFileSystemProperty IsPurgeable = new CFURLFileSystemProperty("IsPurgeable");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final CFURLFileSystemProperty IsSparse = new CFURLFileSystemProperty("IsSparse");
    public static final CFURLFileSystemProperty LinkCount = new CFURLFileSystemProperty("LinkCount");
    public static final CFURLFileSystemProperty ParentDirectoryURL = new CFURLFileSystemProperty("ParentDirectoryURL");
    /**
     * @deprecated Use NSURLContentTypeKey instead
     */
    @Deprecated
    public static final CFURLFileSystemProperty TypeIdentifier = new CFURLFileSystemProperty("TypeIdentifier");
    public static final CFURLFileSystemProperty LocalizedTypeDescription = new CFURLFileSystemProperty("LocalizedTypeDescription");
    public static final CFURLFileSystemProperty LabelNumber = new CFURLFileSystemProperty("LabelNumber");
    /**
     * @deprecated Deprecated in iOS 10.0. Use NSURLLabelColorKey
     */
    @Deprecated
    public static final CFURLFileSystemProperty LabelColor = new CFURLFileSystemProperty("LabelColor");
    public static final CFURLFileSystemProperty LocalizedLabel = new CFURLFileSystemProperty("LocalizedLabel");
    /**
     * @deprecated Deprecated in iOS 10.0. Use NSURLEffectiveIconKey
     */
    @Deprecated
    public static final CFURLFileSystemProperty EffectiveIcon = new CFURLFileSystemProperty("EffectiveIcon");
    /**
     * @deprecated Deprecated in iOS 10.0. Use NSURLCustomIconKey
     */
    @Deprecated
    public static final CFURLFileSystemProperty CustomIcon = new CFURLFileSystemProperty("CustomIcon");
    public static final CFURLFileSystemProperty FileResourceIdentifier = new CFURLFileSystemProperty("FileResourceIdentifier");
    public static final CFURLFileSystemProperty PreferredIOBlockSize = new CFURLFileSystemProperty("PreferredIOBlockSize");
    public static final CFURLFileSystemProperty IsReadable = new CFURLFileSystemProperty("IsReadable");
    public static final CFURLFileSystemProperty IsWritable = new CFURLFileSystemProperty("IsWritable");
    public static final CFURLFileSystemProperty IsExecutable = new CFURLFileSystemProperty("IsExecutable");
    public static final CFURLFileSystemProperty FileSecurity = new CFURLFileSystemProperty("FileSecurity");
    public static final CFURLFileSystemProperty IsExcludedFromBackup = new CFURLFileSystemProperty("IsExcludedFromBackup");
    public static final CFURLFileSystemProperty Path = new CFURLFileSystemProperty("Path");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CFURLFileSystemProperty CanonicalPath = new CFURLFileSystemProperty("CanonicalPath");
    public static final CFURLFileSystemProperty GenerationIdentifier = new CFURLFileSystemProperty("GenerationIdentifier");
    public static final CFURLFileSystemProperty DocumentIdentifier = new CFURLFileSystemProperty("DocumentIdentifier");
    public static final CFURLFileSystemProperty AddedToDirectoryDate = new CFURLFileSystemProperty("AddedToDirectoryDate");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final CFURLFileSystemProperty FileProtection = new CFURLFileSystemProperty("FileProtection");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final CFURLFileSystemProperty DirectoryEntryCount = new CFURLFileSystemProperty("DirectoryEntryCount");
    /*</constants>*/
    
    private static /*<name>*/CFURLFileSystemProperty/*</name>*/[] values = new /*<name>*/CFURLFileSystemProperty/*</name>*/[] {/*<value_list>*/Name, LocalizedName, IsRegularFile, IsDirectory, IsSymbolicLink, IsVolume, IsPackage, IsApplication, IsSystemImmutable, IsUserImmutable, IsHidden, HasHiddenExtension, CreationDate, ContentAccessDate, ContentModificationDate, AttributeModificationDate, FileIdentifier, FileContentIdentifier, MayShareFileContent, MayHaveExtendedAttributes, IsPurgeable, IsSparse, LinkCount, ParentDirectoryURL, TypeIdentifier, LocalizedTypeDescription, LabelNumber, LabelColor, LocalizedLabel, EffectiveIcon, CustomIcon, FileResourceIdentifier, PreferredIOBlockSize, IsReadable, IsWritable, IsExecutable, FileSecurity, IsExcludedFromBackup, Path, CanonicalPath, GenerationIdentifier, DocumentIdentifier, AddedToDirectoryDate, FileProtection, DirectoryEntryCount/*</value_list>*/};
    
    /*<name>*/CFURLFileSystemProperty/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/CFURLFileSystemProperty/*</name>*/ valueOf(/*<type>*/CFString/*</type>*/ value) {
        for (/*<name>*/CFURLFileSystemProperty/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/CFURLFileSystemProperty/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("CoreFoundation") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="kCFURLNameKey", optional=true)
        public static native CFString Name();
        @GlobalValue(symbol="kCFURLLocalizedNameKey", optional=true)
        public static native CFString LocalizedName();
        @GlobalValue(symbol="kCFURLIsRegularFileKey", optional=true)
        public static native CFString IsRegularFile();
        @GlobalValue(symbol="kCFURLIsDirectoryKey", optional=true)
        public static native CFString IsDirectory();
        @GlobalValue(symbol="kCFURLIsSymbolicLinkKey", optional=true)
        public static native CFString IsSymbolicLink();
        @GlobalValue(symbol="kCFURLIsVolumeKey", optional=true)
        public static native CFString IsVolume();
        @GlobalValue(symbol="kCFURLIsPackageKey", optional=true)
        public static native CFString IsPackage();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCFURLIsApplicationKey", optional=true)
        public static native CFString IsApplication();
        @GlobalValue(symbol="kCFURLIsSystemImmutableKey", optional=true)
        public static native CFString IsSystemImmutable();
        @GlobalValue(symbol="kCFURLIsUserImmutableKey", optional=true)
        public static native CFString IsUserImmutable();
        @GlobalValue(symbol="kCFURLIsHiddenKey", optional=true)
        public static native CFString IsHidden();
        @GlobalValue(symbol="kCFURLHasHiddenExtensionKey", optional=true)
        public static native CFString HasHiddenExtension();
        @GlobalValue(symbol="kCFURLCreationDateKey", optional=true)
        public static native CFString CreationDate();
        @GlobalValue(symbol="kCFURLContentAccessDateKey", optional=true)
        public static native CFString ContentAccessDate();
        @GlobalValue(symbol="kCFURLContentModificationDateKey", optional=true)
        public static native CFString ContentModificationDate();
        @GlobalValue(symbol="kCFURLAttributeModificationDateKey", optional=true)
        public static native CFString AttributeModificationDate();
        /**
         * @since Available in iOS 16.4 and later.
         */
        @GlobalValue(symbol="kCFURLFileIdentifierKey", optional=true)
        public static native CFString FileIdentifier();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="kCFURLFileContentIdentifierKey", optional=true)
        public static native CFString FileContentIdentifier();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="kCFURLMayShareFileContentKey", optional=true)
        public static native CFString MayShareFileContent();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="kCFURLMayHaveExtendedAttributesKey", optional=true)
        public static native CFString MayHaveExtendedAttributes();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="kCFURLIsPurgeableKey", optional=true)
        public static native CFString IsPurgeable();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="kCFURLIsSparseKey", optional=true)
        public static native CFString IsSparse();
        @GlobalValue(symbol="kCFURLLinkCountKey", optional=true)
        public static native CFString LinkCount();
        @GlobalValue(symbol="kCFURLParentDirectoryURLKey", optional=true)
        public static native CFString ParentDirectoryURL();
        /**
         * @deprecated Use NSURLContentTypeKey instead
         */
        @Deprecated
        @GlobalValue(symbol="kCFURLTypeIdentifierKey", optional=true)
        public static native CFString TypeIdentifier();
        @GlobalValue(symbol="kCFURLLocalizedTypeDescriptionKey", optional=true)
        public static native CFString LocalizedTypeDescription();
        @GlobalValue(symbol="kCFURLLabelNumberKey", optional=true)
        public static native CFString LabelNumber();
        /**
         * @deprecated Deprecated in iOS 10.0. Use NSURLLabelColorKey
         */
        @Deprecated
        @GlobalValue(symbol="kCFURLLabelColorKey", optional=true)
        public static native CFString LabelColor();
        @GlobalValue(symbol="kCFURLLocalizedLabelKey", optional=true)
        public static native CFString LocalizedLabel();
        /**
         * @deprecated Deprecated in iOS 10.0. Use NSURLEffectiveIconKey
         */
        @Deprecated
        @GlobalValue(symbol="kCFURLEffectiveIconKey", optional=true)
        public static native CFString EffectiveIcon();
        /**
         * @deprecated Deprecated in iOS 10.0. Use NSURLCustomIconKey
         */
        @Deprecated
        @GlobalValue(symbol="kCFURLCustomIconKey", optional=true)
        public static native CFString CustomIcon();
        @GlobalValue(symbol="kCFURLFileResourceIdentifierKey", optional=true)
        public static native CFString FileResourceIdentifier();
        @GlobalValue(symbol="kCFURLPreferredIOBlockSizeKey", optional=true)
        public static native CFString PreferredIOBlockSize();
        @GlobalValue(symbol="kCFURLIsReadableKey", optional=true)
        public static native CFString IsReadable();
        @GlobalValue(symbol="kCFURLIsWritableKey", optional=true)
        public static native CFString IsWritable();
        @GlobalValue(symbol="kCFURLIsExecutableKey", optional=true)
        public static native CFString IsExecutable();
        @GlobalValue(symbol="kCFURLFileSecurityKey", optional=true)
        public static native CFString FileSecurity();
        @GlobalValue(symbol="kCFURLIsExcludedFromBackupKey", optional=true)
        public static native CFString IsExcludedFromBackup();
        @GlobalValue(symbol="kCFURLPathKey", optional=true)
        public static native CFString Path();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCFURLCanonicalPathKey", optional=true)
        public static native CFString CanonicalPath();
        @GlobalValue(symbol="kCFURLGenerationIdentifierKey", optional=true)
        public static native CFString GenerationIdentifier();
        @GlobalValue(symbol="kCFURLDocumentIdentifierKey", optional=true)
        public static native CFString DocumentIdentifier();
        @GlobalValue(symbol="kCFURLAddedToDirectoryDateKey", optional=true)
        public static native CFString AddedToDirectoryDate();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCFURLFileProtectionKey", optional=true)
        public static native CFString FileProtection();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="kCFURLDirectoryEntryCountKey", optional=true)
        public static native CFString DirectoryEntryCount();
        /*</values>*/
    }
}
