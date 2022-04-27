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
@Marshaler(/*<name>*/NSURLVolumeProperty/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSURLVolumeProperty/*</name>*/ 
    extends /*<extends>*/NSURLProperty/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/NSURLVolumeProperty/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static NSURLVolumeProperty toObject(Class<NSURLVolumeProperty> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return NSURLVolumeProperty.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(NSURLVolumeProperty o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<NSURLVolumeProperty> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<NSURLVolumeProperty> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(NSURLVolumeProperty.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<NSURLVolumeProperty> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (NSURLVolumeProperty o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final NSURLVolumeProperty LocalizedFormatDescription = new NSURLVolumeProperty("LocalizedFormatDescription");
    public static final NSURLVolumeProperty TotalCapacity = new NSURLVolumeProperty("TotalCapacity");
    public static final NSURLVolumeProperty AvailableCapacity = new NSURLVolumeProperty("AvailableCapacity");
    public static final NSURLVolumeProperty ResourceCount = new NSURLVolumeProperty("ResourceCount");
    public static final NSURLVolumeProperty SupportsPersistentIDs = new NSURLVolumeProperty("SupportsPersistentIDs");
    public static final NSURLVolumeProperty SupportsSymbolicLinks = new NSURLVolumeProperty("SupportsSymbolicLinks");
    public static final NSURLVolumeProperty SupportsHardLinks = new NSURLVolumeProperty("SupportsHardLinks");
    public static final NSURLVolumeProperty SupportsJournaling = new NSURLVolumeProperty("SupportsJournaling");
    public static final NSURLVolumeProperty IsJournaling = new NSURLVolumeProperty("IsJournaling");
    public static final NSURLVolumeProperty SupportsSparseFiles = new NSURLVolumeProperty("SupportsSparseFiles");
    public static final NSURLVolumeProperty SupportsZeroRuns = new NSURLVolumeProperty("SupportsZeroRuns");
    public static final NSURLVolumeProperty SupportsCaseSensitiveNames = new NSURLVolumeProperty("SupportsCaseSensitiveNames");
    public static final NSURLVolumeProperty SupportsCasePreservedNames = new NSURLVolumeProperty("SupportsCasePreservedNames");
    public static final NSURLVolumeProperty SupportsRootDirectoryDates = new NSURLVolumeProperty("SupportsRootDirectoryDates");
    public static final NSURLVolumeProperty SupportsVolumeSizes = new NSURLVolumeProperty("SupportsVolumeSizes");
    public static final NSURLVolumeProperty SupportsRenaming = new NSURLVolumeProperty("SupportsRenaming");
    public static final NSURLVolumeProperty SupportsAdvisoryFileLocking = new NSURLVolumeProperty("SupportsAdvisoryFileLocking");
    public static final NSURLVolumeProperty SupportsExtendedSecurity = new NSURLVolumeProperty("SupportsExtendedSecurity");
    public static final NSURLVolumeProperty IsBrowsable = new NSURLVolumeProperty("IsBrowsable");
    public static final NSURLVolumeProperty MaximumFileSize = new NSURLVolumeProperty("MaximumFileSize");
    public static final NSURLVolumeProperty IsEjectable = new NSURLVolumeProperty("IsEjectable");
    public static final NSURLVolumeProperty IsRemovable = new NSURLVolumeProperty("IsRemovable");
    public static final NSURLVolumeProperty IsInternal = new NSURLVolumeProperty("IsInternal");
    public static final NSURLVolumeProperty IsAutomounted = new NSURLVolumeProperty("IsAutomounted");
    public static final NSURLVolumeProperty IsLocal = new NSURLVolumeProperty("IsLocal");
    public static final NSURLVolumeProperty IsReadOnly = new NSURLVolumeProperty("IsReadOnly");
    public static final NSURLVolumeProperty CreationDate = new NSURLVolumeProperty("CreationDate");
    public static final NSURLVolumeProperty URLForRemounting = new NSURLVolumeProperty("URLForRemounting");
    public static final NSURLVolumeProperty UUIDString = new NSURLVolumeProperty("UUIDString");
    public static final NSURLVolumeProperty Name = new NSURLVolumeProperty("Name");
    public static final NSURLVolumeProperty LocalizedName = new NSURLVolumeProperty("LocalizedName");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final NSURLVolumeProperty IsEncrypted = new NSURLVolumeProperty("IsEncrypted");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final NSURLVolumeProperty IsRootFileSystem = new NSURLVolumeProperty("IsRootFileSystem");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final NSURLVolumeProperty SupportsCompression = new NSURLVolumeProperty("SupportsCompression");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final NSURLVolumeProperty SupportsFileCloning = new NSURLVolumeProperty("SupportsFileCloning");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final NSURLVolumeProperty SupportsSwapRenaming = new NSURLVolumeProperty("SupportsSwapRenaming");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final NSURLVolumeProperty SupportsExclusiveRenaming = new NSURLVolumeProperty("SupportsExclusiveRenaming");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final NSURLVolumeProperty SupportsImmutableFiles = new NSURLVolumeProperty("SupportsImmutableFiles");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final NSURLVolumeProperty SupportsAccessPermissions = new NSURLVolumeProperty("SupportsAccessPermissions");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final NSURLVolumeProperty SupportsFileProtection = new NSURLVolumeProperty("SupportsFileProtection");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final NSURLVolumeProperty AvailableCapacityForImportantUsage = new NSURLVolumeProperty("AvailableCapacityForImportantUsage");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final NSURLVolumeProperty AvailableCapacityForOpportunisticUsage = new NSURLVolumeProperty("AvailableCapacityForOpportunisticUsage");
    /*</constants>*/
    
    private static /*<name>*/NSURLVolumeProperty/*</name>*/[] values = new /*<name>*/NSURLVolumeProperty/*</name>*/[] {/*<value_list>*/LocalizedFormatDescription, TotalCapacity, AvailableCapacity, ResourceCount, SupportsPersistentIDs, SupportsSymbolicLinks, SupportsHardLinks, SupportsJournaling, IsJournaling, SupportsSparseFiles, SupportsZeroRuns, SupportsCaseSensitiveNames, SupportsCasePreservedNames, SupportsRootDirectoryDates, SupportsVolumeSizes, SupportsRenaming, SupportsAdvisoryFileLocking, SupportsExtendedSecurity, IsBrowsable, MaximumFileSize, IsEjectable, IsRemovable, IsInternal, IsAutomounted, IsLocal, IsReadOnly, CreationDate, URLForRemounting, UUIDString, Name, LocalizedName, IsEncrypted, IsRootFileSystem, SupportsCompression, SupportsFileCloning, SupportsSwapRenaming, SupportsExclusiveRenaming, SupportsImmutableFiles, SupportsAccessPermissions, SupportsFileProtection, AvailableCapacityForImportantUsage, AvailableCapacityForOpportunisticUsage/*</value_list>*/};
    
    /*<name>*/NSURLVolumeProperty/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/NSURLVolumeProperty/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/NSURLVolumeProperty/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/NSURLVolumeProperty/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("Foundation") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="NSURLVolumeLocalizedFormatDescriptionKey", optional=true)
        public static native NSString LocalizedFormatDescription();
        @GlobalValue(symbol="NSURLVolumeTotalCapacityKey", optional=true)
        public static native NSString TotalCapacity();
        @GlobalValue(symbol="NSURLVolumeAvailableCapacityKey", optional=true)
        public static native NSString AvailableCapacity();
        @GlobalValue(symbol="NSURLVolumeResourceCountKey", optional=true)
        public static native NSString ResourceCount();
        @GlobalValue(symbol="NSURLVolumeSupportsPersistentIDsKey", optional=true)
        public static native NSString SupportsPersistentIDs();
        @GlobalValue(symbol="NSURLVolumeSupportsSymbolicLinksKey", optional=true)
        public static native NSString SupportsSymbolicLinks();
        @GlobalValue(symbol="NSURLVolumeSupportsHardLinksKey", optional=true)
        public static native NSString SupportsHardLinks();
        @GlobalValue(symbol="NSURLVolumeSupportsJournalingKey", optional=true)
        public static native NSString SupportsJournaling();
        @GlobalValue(symbol="NSURLVolumeIsJournalingKey", optional=true)
        public static native NSString IsJournaling();
        @GlobalValue(symbol="NSURLVolumeSupportsSparseFilesKey", optional=true)
        public static native NSString SupportsSparseFiles();
        @GlobalValue(symbol="NSURLVolumeSupportsZeroRunsKey", optional=true)
        public static native NSString SupportsZeroRuns();
        @GlobalValue(symbol="NSURLVolumeSupportsCaseSensitiveNamesKey", optional=true)
        public static native NSString SupportsCaseSensitiveNames();
        @GlobalValue(symbol="NSURLVolumeSupportsCasePreservedNamesKey", optional=true)
        public static native NSString SupportsCasePreservedNames();
        @GlobalValue(symbol="NSURLVolumeSupportsRootDirectoryDatesKey", optional=true)
        public static native NSString SupportsRootDirectoryDates();
        @GlobalValue(symbol="NSURLVolumeSupportsVolumeSizesKey", optional=true)
        public static native NSString SupportsVolumeSizes();
        @GlobalValue(symbol="NSURLVolumeSupportsRenamingKey", optional=true)
        public static native NSString SupportsRenaming();
        @GlobalValue(symbol="NSURLVolumeSupportsAdvisoryFileLockingKey", optional=true)
        public static native NSString SupportsAdvisoryFileLocking();
        @GlobalValue(symbol="NSURLVolumeSupportsExtendedSecurityKey", optional=true)
        public static native NSString SupportsExtendedSecurity();
        @GlobalValue(symbol="NSURLVolumeIsBrowsableKey", optional=true)
        public static native NSString IsBrowsable();
        @GlobalValue(symbol="NSURLVolumeMaximumFileSizeKey", optional=true)
        public static native NSString MaximumFileSize();
        @GlobalValue(symbol="NSURLVolumeIsEjectableKey", optional=true)
        public static native NSString IsEjectable();
        @GlobalValue(symbol="NSURLVolumeIsRemovableKey", optional=true)
        public static native NSString IsRemovable();
        @GlobalValue(symbol="NSURLVolumeIsInternalKey", optional=true)
        public static native NSString IsInternal();
        @GlobalValue(symbol="NSURLVolumeIsAutomountedKey", optional=true)
        public static native NSString IsAutomounted();
        @GlobalValue(symbol="NSURLVolumeIsLocalKey", optional=true)
        public static native NSString IsLocal();
        @GlobalValue(symbol="NSURLVolumeIsReadOnlyKey", optional=true)
        public static native NSString IsReadOnly();
        @GlobalValue(symbol="NSURLVolumeCreationDateKey", optional=true)
        public static native NSString CreationDate();
        @GlobalValue(symbol="NSURLVolumeURLForRemountingKey", optional=true)
        public static native NSString URLForRemounting();
        @GlobalValue(symbol="NSURLVolumeUUIDStringKey", optional=true)
        public static native NSString UUIDString();
        @GlobalValue(symbol="NSURLVolumeNameKey", optional=true)
        public static native NSString Name();
        @GlobalValue(symbol="NSURLVolumeLocalizedNameKey", optional=true)
        public static native NSString LocalizedName();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="NSURLVolumeIsEncryptedKey", optional=true)
        public static native NSString IsEncrypted();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="NSURLVolumeIsRootFileSystemKey", optional=true)
        public static native NSString IsRootFileSystem();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="NSURLVolumeSupportsCompressionKey", optional=true)
        public static native NSString SupportsCompression();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="NSURLVolumeSupportsFileCloningKey", optional=true)
        public static native NSString SupportsFileCloning();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="NSURLVolumeSupportsSwapRenamingKey", optional=true)
        public static native NSString SupportsSwapRenaming();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="NSURLVolumeSupportsExclusiveRenamingKey", optional=true)
        public static native NSString SupportsExclusiveRenaming();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="NSURLVolumeSupportsImmutableFilesKey", optional=true)
        public static native NSString SupportsImmutableFiles();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="NSURLVolumeSupportsAccessPermissionsKey", optional=true)
        public static native NSString SupportsAccessPermissions();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="NSURLVolumeSupportsFileProtectionKey", optional=true)
        public static native NSString SupportsFileProtection();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="NSURLVolumeAvailableCapacityForImportantUsageKey", optional=true)
        public static native NSString AvailableCapacityForImportantUsage();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="NSURLVolumeAvailableCapacityForOpportunisticUsageKey", optional=true)
        public static native NSString AvailableCapacityForOpportunisticUsage();
        /*</values>*/
    }
}
