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
@Marshaler(/*<name>*/CFURLVolumeProperty/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CFURLVolumeProperty/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<CFString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/CFURLVolumeProperty/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CFURLVolumeProperty toObject(Class<CFURLVolumeProperty> cls, long handle, long flags) {
            CFString o = (CFString) CFType.Marshaler.toObject(CFString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return CFURLVolumeProperty.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(CFURLVolumeProperty o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CFURLVolumeProperty> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(CFArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CFURLVolumeProperty> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(CFURLVolumeProperty.valueOf(o.get(i, CFString.class)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CFURLVolumeProperty> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray array = CFMutableArray.create();
            for (CFURLVolumeProperty o : l) {
                array.add(o.value());
            }
            return CFType.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final CFURLVolumeProperty URL = new CFURLVolumeProperty("URL");
    public static final CFURLVolumeProperty Identifier = new CFURLVolumeProperty("Identifier");
    public static final CFURLVolumeProperty LocalizedFormatDescription = new CFURLVolumeProperty("LocalizedFormatDescription");
    public static final CFURLVolumeProperty TotalCapacity = new CFURLVolumeProperty("TotalCapacity");
    public static final CFURLVolumeProperty AvailableCapacity = new CFURLVolumeProperty("AvailableCapacity");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final CFURLVolumeProperty AvailableCapacityForImportantUsage = new CFURLVolumeProperty("AvailableCapacityForImportantUsage");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final CFURLVolumeProperty AvailableCapacityForOpportunisticUsage = new CFURLVolumeProperty("AvailableCapacityForOpportunisticUsage");
    public static final CFURLVolumeProperty ResourceCount = new CFURLVolumeProperty("ResourceCount");
    public static final CFURLVolumeProperty SupportsPersistentIDs = new CFURLVolumeProperty("SupportsPersistentIDs");
    public static final CFURLVolumeProperty SupportsSymbolicLinks = new CFURLVolumeProperty("SupportsSymbolicLinks");
    public static final CFURLVolumeProperty SupportsHardLinks = new CFURLVolumeProperty("SupportsHardLinks");
    public static final CFURLVolumeProperty SupportsJournaling = new CFURLVolumeProperty("SupportsJournaling");
    public static final CFURLVolumeProperty IsJournaling = new CFURLVolumeProperty("IsJournaling");
    public static final CFURLVolumeProperty SupportsSparseFiles = new CFURLVolumeProperty("SupportsSparseFiles");
    public static final CFURLVolumeProperty SupportsZeroRuns = new CFURLVolumeProperty("SupportsZeroRuns");
    public static final CFURLVolumeProperty SupportsCaseSensitiveNames = new CFURLVolumeProperty("SupportsCaseSensitiveNames");
    public static final CFURLVolumeProperty SupportsCasePreservedNames = new CFURLVolumeProperty("SupportsCasePreservedNames");
    public static final CFURLVolumeProperty SupportsRootDirectoryDates = new CFURLVolumeProperty("SupportsRootDirectoryDates");
    public static final CFURLVolumeProperty SupportsVolumeSizes = new CFURLVolumeProperty("SupportsVolumeSizes");
    public static final CFURLVolumeProperty SupportsRenaming = new CFURLVolumeProperty("SupportsRenaming");
    public static final CFURLVolumeProperty SupportsAdvisoryFileLocking = new CFURLVolumeProperty("SupportsAdvisoryFileLocking");
    public static final CFURLVolumeProperty SupportsExtendedSecurity = new CFURLVolumeProperty("SupportsExtendedSecurity");
    public static final CFURLVolumeProperty IsBrowsable = new CFURLVolumeProperty("IsBrowsable");
    public static final CFURLVolumeProperty MaximumFileSize = new CFURLVolumeProperty("MaximumFileSize");
    public static final CFURLVolumeProperty IsEjectable = new CFURLVolumeProperty("IsEjectable");
    public static final CFURLVolumeProperty IsRemovable = new CFURLVolumeProperty("IsRemovable");
    public static final CFURLVolumeProperty IsInternal = new CFURLVolumeProperty("IsInternal");
    public static final CFURLVolumeProperty IsAutomounted = new CFURLVolumeProperty("IsAutomounted");
    public static final CFURLVolumeProperty IsLocal = new CFURLVolumeProperty("IsLocal");
    public static final CFURLVolumeProperty IsReadOnly = new CFURLVolumeProperty("IsReadOnly");
    public static final CFURLVolumeProperty CreationDate = new CFURLVolumeProperty("CreationDate");
    public static final CFURLVolumeProperty URLForRemounting = new CFURLVolumeProperty("URLForRemounting");
    public static final CFURLVolumeProperty UUIDString = new CFURLVolumeProperty("UUIDString");
    public static final CFURLVolumeProperty Name = new CFURLVolumeProperty("Name");
    public static final CFURLVolumeProperty LocalizedName = new CFURLVolumeProperty("LocalizedName");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CFURLVolumeProperty IsEncrypted = new CFURLVolumeProperty("IsEncrypted");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CFURLVolumeProperty IsRootFileSystem = new CFURLVolumeProperty("IsRootFileSystem");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CFURLVolumeProperty SupportsCompression = new CFURLVolumeProperty("SupportsCompression");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CFURLVolumeProperty SupportsFileCloning = new CFURLVolumeProperty("SupportsFileCloning");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CFURLVolumeProperty SupportsSwapRenaming = new CFURLVolumeProperty("SupportsSwapRenaming");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CFURLVolumeProperty SupportsExclusiveRenaming = new CFURLVolumeProperty("SupportsExclusiveRenaming");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final CFURLVolumeProperty SupportsImmutableFiles = new CFURLVolumeProperty("SupportsImmutableFiles");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final CFURLVolumeProperty SupportsAccessPermissions = new CFURLVolumeProperty("SupportsAccessPermissions");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final CFURLVolumeProperty SupportsFileProtection = new CFURLVolumeProperty("SupportsFileProtection");
    /*</constants>*/
    
    private static /*<name>*/CFURLVolumeProperty/*</name>*/[] values = new /*<name>*/CFURLVolumeProperty/*</name>*/[] {/*<value_list>*/URL, Identifier, LocalizedFormatDescription, TotalCapacity, AvailableCapacity, AvailableCapacityForImportantUsage, AvailableCapacityForOpportunisticUsage, ResourceCount, SupportsPersistentIDs, SupportsSymbolicLinks, SupportsHardLinks, SupportsJournaling, IsJournaling, SupportsSparseFiles, SupportsZeroRuns, SupportsCaseSensitiveNames, SupportsCasePreservedNames, SupportsRootDirectoryDates, SupportsVolumeSizes, SupportsRenaming, SupportsAdvisoryFileLocking, SupportsExtendedSecurity, IsBrowsable, MaximumFileSize, IsEjectable, IsRemovable, IsInternal, IsAutomounted, IsLocal, IsReadOnly, CreationDate, URLForRemounting, UUIDString, Name, LocalizedName, IsEncrypted, IsRootFileSystem, SupportsCompression, SupportsFileCloning, SupportsSwapRenaming, SupportsExclusiveRenaming, SupportsImmutableFiles, SupportsAccessPermissions, SupportsFileProtection/*</value_list>*/};
    
    /*<name>*/CFURLVolumeProperty/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/CFURLVolumeProperty/*</name>*/ valueOf(/*<type>*/CFString/*</type>*/ value) {
        for (/*<name>*/CFURLVolumeProperty/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/CFURLVolumeProperty/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("CoreFoundation") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="kCFURLVolumeURLKey", optional=true)
        public static native CFString URL();
        @GlobalValue(symbol="kCFURLVolumeIdentifierKey", optional=true)
        public static native CFString Identifier();
        @GlobalValue(symbol="kCFURLVolumeLocalizedFormatDescriptionKey", optional=true)
        public static native CFString LocalizedFormatDescription();
        @GlobalValue(symbol="kCFURLVolumeTotalCapacityKey", optional=true)
        public static native CFString TotalCapacity();
        @GlobalValue(symbol="kCFURLVolumeAvailableCapacityKey", optional=true)
        public static native CFString AvailableCapacity();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kCFURLVolumeAvailableCapacityForImportantUsageKey", optional=true)
        public static native CFString AvailableCapacityForImportantUsage();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kCFURLVolumeAvailableCapacityForOpportunisticUsageKey", optional=true)
        public static native CFString AvailableCapacityForOpportunisticUsage();
        @GlobalValue(symbol="kCFURLVolumeResourceCountKey", optional=true)
        public static native CFString ResourceCount();
        @GlobalValue(symbol="kCFURLVolumeSupportsPersistentIDsKey", optional=true)
        public static native CFString SupportsPersistentIDs();
        @GlobalValue(symbol="kCFURLVolumeSupportsSymbolicLinksKey", optional=true)
        public static native CFString SupportsSymbolicLinks();
        @GlobalValue(symbol="kCFURLVolumeSupportsHardLinksKey", optional=true)
        public static native CFString SupportsHardLinks();
        @GlobalValue(symbol="kCFURLVolumeSupportsJournalingKey", optional=true)
        public static native CFString SupportsJournaling();
        @GlobalValue(symbol="kCFURLVolumeIsJournalingKey", optional=true)
        public static native CFString IsJournaling();
        @GlobalValue(symbol="kCFURLVolumeSupportsSparseFilesKey", optional=true)
        public static native CFString SupportsSparseFiles();
        @GlobalValue(symbol="kCFURLVolumeSupportsZeroRunsKey", optional=true)
        public static native CFString SupportsZeroRuns();
        @GlobalValue(symbol="kCFURLVolumeSupportsCaseSensitiveNamesKey", optional=true)
        public static native CFString SupportsCaseSensitiveNames();
        @GlobalValue(symbol="kCFURLVolumeSupportsCasePreservedNamesKey", optional=true)
        public static native CFString SupportsCasePreservedNames();
        @GlobalValue(symbol="kCFURLVolumeSupportsRootDirectoryDatesKey", optional=true)
        public static native CFString SupportsRootDirectoryDates();
        @GlobalValue(symbol="kCFURLVolumeSupportsVolumeSizesKey", optional=true)
        public static native CFString SupportsVolumeSizes();
        @GlobalValue(symbol="kCFURLVolumeSupportsRenamingKey", optional=true)
        public static native CFString SupportsRenaming();
        @GlobalValue(symbol="kCFURLVolumeSupportsAdvisoryFileLockingKey", optional=true)
        public static native CFString SupportsAdvisoryFileLocking();
        @GlobalValue(symbol="kCFURLVolumeSupportsExtendedSecurityKey", optional=true)
        public static native CFString SupportsExtendedSecurity();
        @GlobalValue(symbol="kCFURLVolumeIsBrowsableKey", optional=true)
        public static native CFString IsBrowsable();
        @GlobalValue(symbol="kCFURLVolumeMaximumFileSizeKey", optional=true)
        public static native CFString MaximumFileSize();
        @GlobalValue(symbol="kCFURLVolumeIsEjectableKey", optional=true)
        public static native CFString IsEjectable();
        @GlobalValue(symbol="kCFURLVolumeIsRemovableKey", optional=true)
        public static native CFString IsRemovable();
        @GlobalValue(symbol="kCFURLVolumeIsInternalKey", optional=true)
        public static native CFString IsInternal();
        @GlobalValue(symbol="kCFURLVolumeIsAutomountedKey", optional=true)
        public static native CFString IsAutomounted();
        @GlobalValue(symbol="kCFURLVolumeIsLocalKey", optional=true)
        public static native CFString IsLocal();
        @GlobalValue(symbol="kCFURLVolumeIsReadOnlyKey", optional=true)
        public static native CFString IsReadOnly();
        @GlobalValue(symbol="kCFURLVolumeCreationDateKey", optional=true)
        public static native CFString CreationDate();
        @GlobalValue(symbol="kCFURLVolumeURLForRemountingKey", optional=true)
        public static native CFString URLForRemounting();
        @GlobalValue(symbol="kCFURLVolumeUUIDStringKey", optional=true)
        public static native CFString UUIDString();
        @GlobalValue(symbol="kCFURLVolumeNameKey", optional=true)
        public static native CFString Name();
        @GlobalValue(symbol="kCFURLVolumeLocalizedNameKey", optional=true)
        public static native CFString LocalizedName();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCFURLVolumeIsEncryptedKey", optional=true)
        public static native CFString IsEncrypted();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCFURLVolumeIsRootFileSystemKey", optional=true)
        public static native CFString IsRootFileSystem();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCFURLVolumeSupportsCompressionKey", optional=true)
        public static native CFString SupportsCompression();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCFURLVolumeSupportsFileCloningKey", optional=true)
        public static native CFString SupportsFileCloning();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCFURLVolumeSupportsSwapRenamingKey", optional=true)
        public static native CFString SupportsSwapRenaming();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCFURLVolumeSupportsExclusiveRenamingKey", optional=true)
        public static native CFString SupportsExclusiveRenaming();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kCFURLVolumeSupportsImmutableFilesKey", optional=true)
        public static native CFString SupportsImmutableFiles();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kCFURLVolumeSupportsAccessPermissionsKey", optional=true)
        public static native CFString SupportsAccessPermissions();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="kCFURLVolumeSupportsFileProtectionKey", optional=true)
        public static native CFString SupportsFileProtection();
        /*</values>*/
    }
}
