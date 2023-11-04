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
package org.robovm.apple.coredata;

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
import org.robovm.apple.corespotlight.*;
import org.robovm.apple.cloudkit.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreData")/*</annotations>*/
@Marshaler(/*<name>*/NSPersistentStoreOptions/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSPersistentStoreOptions/*</name>*/ 
    extends /*<extends>*/NSDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static NSPersistentStoreOptions toObject(Class<NSPersistentStoreOptions> cls, long handle, long flags) {
            NSDictionary o = (NSDictionary) NSObject.Marshaler.toObject(NSDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new NSPersistentStoreOptions(o);
        }
        @MarshalsPointer
        public static long toNative(NSPersistentStoreOptions o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<NSPersistentStoreOptions> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSDictionary> o = (NSArray<NSDictionary>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<NSPersistentStoreOptions> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new NSPersistentStoreOptions(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<NSPersistentStoreOptions> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSDictionary> array = new NSMutableArray<>();
            for (NSPersistentStoreOptions i : l) {
                array.add(i.getDictionary());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    NSPersistentStoreOptions(NSDictionary data) {
        super(data);
    }
    public NSPersistentStoreOptions() {}
    /*</constructors>*/

    /*<methods>*/
    public boolean has(NSString key) {
        return data.containsKey(key);
    }
    public NSObject get(NSString key) {
        if (has(key)) {
            return data.get(key);
        }
        return null;
    }
    public NSPersistentStoreOptions set(NSString key, NSObject value) {
        data.put(key, value);
        return this;
    }
    

    public boolean isReadOnly() {
        if (has(Keys.ReadOnly())) {
            NSNumber val = (NSNumber) get(Keys.ReadOnly());
            return val.booleanValue();
        }
        return false;
    }
    public NSPersistentStoreOptions setReadOnly(boolean readOnly) {
        set(Keys.ReadOnly(), NSNumber.valueOf(readOnly));
        return this;
    }
    public long getTimeout() {
        if (has(Keys.Timeout())) {
            NSNumber val = (NSNumber) get(Keys.Timeout());
            return val.longValue();
        }
        return 0;
    }
    public NSPersistentStoreOptions setTimeout(long timeout) {
        set(Keys.Timeout(), NSNumber.valueOf(timeout));
        return this;
    }
    public Map<String, NSObject> getSQLitePragmas() {
        if (has(Keys.SQLitePragmas())) {
            NSDictionary val = (NSDictionary) get(Keys.SQLitePragmas());
            return val.asStringMap();
        }
        return null;
    }
    public NSPersistentStoreOptions setSQLitePragmas(Map<String, NSObject> sQLitePragmas) {
        set(Keys.SQLitePragmas(), NSDictionary.fromStringMap(sQLitePragmas));
        return this;
    }
    public boolean isSQLiteAnalyzeEnabled() {
        if (has(Keys.SQLiteAnalyze())) {
            NSNumber val = (NSNumber) get(Keys.SQLiteAnalyze());
            return val.booleanValue();
        }
        return false;
    }
    public NSPersistentStoreOptions setSQLiteAnalyzeEnabled(boolean sQLiteAnalyzeEnabled) {
        set(Keys.SQLiteAnalyze(), NSNumber.valueOf(sQLiteAnalyzeEnabled));
        return this;
    }
    public boolean isSQLiteManualVacuumEnabled() {
        if (has(Keys.SQLiteManualVacuum())) {
            NSNumber val = (NSNumber) get(Keys.SQLiteManualVacuum());
            return val.booleanValue();
        }
        return false;
    }
    public NSPersistentStoreOptions setSQLiteManualVacuumEnabled(boolean sQLiteManualVacuumEnabled) {
        set(Keys.SQLiteManualVacuum(), NSNumber.valueOf(sQLiteManualVacuumEnabled));
        return this;
    }
    public boolean ignoresPersistentStoreVersioning() {
        if (has(Keys.IgnorePersistentStoreVersioning())) {
            NSNumber val = (NSNumber) get(Keys.IgnorePersistentStoreVersioning());
            return val.booleanValue();
        }
        return false;
    }
    public NSPersistentStoreOptions setIgnoresPersistentStoreVersioning(boolean ignoresPersistentStoreVersioning) {
        set(Keys.IgnorePersistentStoreVersioning(), NSNumber.valueOf(ignoresPersistentStoreVersioning));
        return this;
    }
    public boolean migratesPersistentStoresAutomatically() {
        if (has(Keys.MigratePersistentStoresAutomatically())) {
            NSNumber val = (NSNumber) get(Keys.MigratePersistentStoresAutomatically());
            return val.booleanValue();
        }
        return false;
    }
    public NSPersistentStoreOptions setMigratesPersistentStoresAutomatically(boolean migratesPersistentStoresAutomatically) {
        set(Keys.MigratePersistentStoresAutomatically(), NSNumber.valueOf(migratesPersistentStoresAutomatically));
        return this;
    }
    public boolean infersMappingModelAutomatically() {
        if (has(Keys.InferMappingModelAutomatically())) {
            NSNumber val = (NSNumber) get(Keys.InferMappingModelAutomatically());
            return val.booleanValue();
        }
        return false;
    }
    public NSPersistentStoreOptions setInfersMappingModelAutomatically(boolean infersMappingModelAutomatically) {
        set(Keys.InferMappingModelAutomatically(), NSNumber.valueOf(infersMappingModelAutomatically));
        return this;
    }
    public boolean isForceDestroy() {
        if (has(Keys.ForceDestroy())) {
            NSNumber val = (NSNumber) get(Keys.ForceDestroy());
            return val.booleanValue();
        }
        return false;
    }
    public NSPersistentStoreOptions setForceDestroy(boolean forceDestroy) {
        set(Keys.ForceDestroy(), NSNumber.valueOf(forceDestroy));
        return this;
    }
    public NSFileProtection getFileProtection() {
        if (has(Keys.FileProtection())) {
            NSString val = (NSString) get(Keys.FileProtection());
            return NSFileProtection.valueOf(val);
        }
        return null;
    }
    public NSPersistentStoreOptions setFileProtection(NSFileProtection fileProtection) {
        set(Keys.FileProtection(), fileProtection.value());
        return this;
    }
    /**
     * @deprecated Deprecated in iOS 10.0. Please see the release notes and Core Data documentation.
     */
    @Deprecated
    public String getUbiquitousContentName() {
        if (has(Keys.UbiquitousContentName())) {
            NSString val = (NSString) get(Keys.UbiquitousContentName());
            return val.toString();
        }
        return null;
    }
    /**
     * @deprecated Deprecated in iOS 10.0. Please see the release notes and Core Data documentation.
     */
    @Deprecated
    public NSPersistentStoreOptions setUbiquitousContentName(String ubiquitousContentName) {
        set(Keys.UbiquitousContentName(), new NSString(ubiquitousContentName));
        return this;
    }
    /**
     * @deprecated Deprecated in iOS 10.0. Please see the release notes and Core Data documentation.
     */
    @Deprecated
    public String getUbiquitousContentURL() {
        if (has(Keys.UbiquitousContentURL())) {
            NSString val = (NSString) get(Keys.UbiquitousContentURL());
            return val.toString();
        }
        return null;
    }
    /**
     * @deprecated Deprecated in iOS 10.0. Please see the release notes and Core Data documentation.
     */
    @Deprecated
    public NSPersistentStoreOptions setUbiquitousContentURL(String ubiquitousContentURL) {
        set(Keys.UbiquitousContentURL(), new NSString(ubiquitousContentURL));
        return this;
    }
    /**
     * @deprecated Deprecated in iOS 10.0. Please see the release notes and Core Data documentation.
     */
    @Deprecated
    public String getUbiquitousPeerToken() {
        if (has(Keys.UbiquitousPeerToken())) {
            NSString val = (NSString) get(Keys.UbiquitousPeerToken());
            return val.toString();
        }
        return null;
    }
    /**
     * @deprecated Deprecated in iOS 10.0. Please see the release notes and Core Data documentation.
     */
    @Deprecated
    public NSPersistentStoreOptions setUbiquitousPeerToken(String ubiquitousPeerToken) {
        set(Keys.UbiquitousPeerToken(), new NSString(ubiquitousPeerToken));
        return this;
    }
    /**
     * @deprecated Deprecated in iOS 10.0. Please see the release notes and Core Data documentation.
     */
    @Deprecated
    public boolean shouldRemoveUbiquitousMetadata() {
        if (has(Keys.RemoveUbiquitousMetadata())) {
            NSNumber val = (NSNumber) get(Keys.RemoveUbiquitousMetadata());
            return val.booleanValue();
        }
        return false;
    }
    /**
     * @deprecated Deprecated in iOS 10.0. Please see the release notes and Core Data documentation.
     */
    @Deprecated
    public NSPersistentStoreOptions setShouldRemoveUbiquitousMetadata(boolean shouldRemoveUbiquitousMetadata) {
        set(Keys.RemoveUbiquitousMetadata(), NSNumber.valueOf(shouldRemoveUbiquitousMetadata));
        return this;
    }
    /**
     * @deprecated Deprecated in iOS 10.0. Please see the release notes and Core Data documentation.
     */
    @Deprecated
    public String getUbiquitousContainerIdentifier() {
        if (has(Keys.UbiquitousContainerIdentifier())) {
            NSString val = (NSString) get(Keys.UbiquitousContainerIdentifier());
            return val.toString();
        }
        return null;
    }
    /**
     * @deprecated Deprecated in iOS 10.0. Please see the release notes and Core Data documentation.
     */
    @Deprecated
    public NSPersistentStoreOptions setUbiquitousContainerIdentifier(String ubiquitousContainerIdentifier) {
        set(Keys.UbiquitousContainerIdentifier(), new NSString(ubiquitousContainerIdentifier));
        return this;
    }
    /**
     * @deprecated Deprecated in iOS 10.0. Please see the release notes and Core Data documentation.
     */
    @Deprecated
    public boolean shouldRebuildFromUbiquitousContent() {
        if (has(Keys.RebuildFromUbiquitousContent())) {
            NSNumber val = (NSNumber) get(Keys.RebuildFromUbiquitousContent());
            return val.booleanValue();
        }
        return false;
    }
    /**
     * @deprecated Deprecated in iOS 10.0. Please see the release notes and Core Data documentation.
     */
    @Deprecated
    public NSPersistentStoreOptions setShouldRebuildFromUbiquitousContent(boolean shouldRebuildFromUbiquitousContent) {
        set(Keys.RebuildFromUbiquitousContent(), NSNumber.valueOf(shouldRebuildFromUbiquitousContent));
        return this;
    }
    /*</methods>*/
    
    /*<keys>*/
    @Library("CoreData")
    public static class Keys {
        static { Bro.bind(Keys.class); }
        @GlobalValue(symbol="NSReadOnlyPersistentStoreOption", optional=true)
        public static native NSString ReadOnly();
        @GlobalValue(symbol="NSPersistentStoreTimeoutOption", optional=true)
        public static native NSString Timeout();
        @GlobalValue(symbol="NSSQLitePragmasOption", optional=true)
        public static native NSString SQLitePragmas();
        @GlobalValue(symbol="NSSQLiteAnalyzeOption", optional=true)
        public static native NSString SQLiteAnalyze();
        @GlobalValue(symbol="NSSQLiteManualVacuumOption", optional=true)
        public static native NSString SQLiteManualVacuum();
        @GlobalValue(symbol="NSIgnorePersistentStoreVersioningOption", optional=true)
        public static native NSString IgnorePersistentStoreVersioning();
        @GlobalValue(symbol="NSMigratePersistentStoresAutomaticallyOption", optional=true)
        public static native NSString MigratePersistentStoresAutomatically();
        @GlobalValue(symbol="NSInferMappingModelAutomaticallyOption", optional=true)
        public static native NSString InferMappingModelAutomatically();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="NSPersistentStoreConnectionPoolMaxSizeKey", optional=true)
        public static native NSString ConnectionPoolMaxSize();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="NSPersistentStoreStagedMigrationManagerOptionKey", optional=true)
        public static native NSString StagedMigrationManagerOption();
        @GlobalValue(symbol="NSPersistentStoreForceDestroyOption", optional=true)
        public static native NSString ForceDestroy();
        @GlobalValue(symbol="NSPersistentStoreFileProtectionKey", optional=true)
        public static native NSString FileProtection();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="NSPersistentHistoryTrackingKey", optional=true)
        public static native NSString HistoryTrackingKey();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="NSBinaryStoreSecureDecodingClasses", optional=true)
        public static native NSString SecureDecodingClasses();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="NSBinaryStoreInsecureDecodingCompatibilityOption", optional=true)
        public static native String InsecureDecodingCompatibilityOption();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="NSPersistentStoreRemoteChangeNotificationPostOptionKey", optional=true)
        public static native NSString RemoteChangeNotificationPostOption();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NSPersistentStoreURLKey", optional=true)
        public static native NSString URL();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NSPersistentHistoryTokenKey", optional=true)
        public static native NSString HistoryTokenKey();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="NSPersistentStoreDeferredLightweightMigrationOptionKey", optional=true)
        public static native NSString DeferredLightweightMigrationOption();
        /**
         * @deprecated Deprecated in iOS 10.0. Please see the release notes and Core Data documentation.
         */
        @Deprecated
        @GlobalValue(symbol="NSPersistentStoreUbiquitousContentNameKey", optional=true)
        public static native NSString UbiquitousContentName();
        /**
         * @deprecated Deprecated in iOS 10.0. Please see the release notes and Core Data documentation.
         */
        @Deprecated
        @GlobalValue(symbol="NSPersistentStoreUbiquitousContentURLKey", optional=true)
        public static native NSString UbiquitousContentURL();
        /**
         * @deprecated Deprecated in iOS 10.0. Please see the release notes and Core Data documentation.
         */
        @Deprecated
        @GlobalValue(symbol="NSPersistentStoreUbiquitousPeerTokenOption", optional=true)
        public static native NSString UbiquitousPeerToken();
        /**
         * @deprecated Deprecated in iOS 10.0. Please see the release notes and Core Data documentation.
         */
        @Deprecated
        @GlobalValue(symbol="NSPersistentStoreRemoveUbiquitousMetadataOption", optional=true)
        public static native NSString RemoveUbiquitousMetadata();
        /**
         * @deprecated Deprecated in iOS 10.0. Please see the release notes and Core Data documentation.
         */
        @Deprecated
        @GlobalValue(symbol="NSPersistentStoreUbiquitousContainerIdentifierKey", optional=true)
        public static native NSString UbiquitousContainerIdentifier();
        /**
         * @deprecated Deprecated in iOS 10.0. Please see the release notes and Core Data documentation.
         */
        @Deprecated
        @GlobalValue(symbol="NSPersistentStoreRebuildFromUbiquitousContentOption", optional=true)
        public static native NSString RebuildFromUbiquitousContent();
    }
    /*</keys>*/
}
