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
package org.robovm.apple.uniformtypeid;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UniformTypeIdentifiers") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UTType/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class UTTypePtr extends Ptr<UTType, UTTypePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UTType.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UTType() {}
    protected UTType(Handle h, long handle) { super(h, handle); }
    protected UTType(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public UTType(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "identifier")
    public native String getIdentifier();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "preferredFilenameExtension")
    public native String getPreferredFilenameExtension();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "preferredMIMEType")
    public native String getPreferredMIMEType();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "localizedDescription")
    public native String getLocalizedDescription();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "version")
    public native NSNumber getVersion();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "referenceURL")
    public native NSURL getReferenceURL();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "isDynamic")
    public native boolean isDynamic();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "isDeclared")
    public native boolean isDeclared();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "isPublicType")
    public native boolean isPublicType();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "supertypes")
    public native NSSet<UTType> getSupertypes();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "tags")
    public native NSDictionary<?, ?> getTags();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Library("UniformTypeIdentifiers")
    public static class CoreTypes {
        static { Bro.bind(CoreTypes.class); }

        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeItem", optional=true)
        public static native UTType Item();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeContent", optional=true)
        public static native UTType Content();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeCompositeContent", optional=true)
        public static native UTType CompositeContent();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeDiskImage", optional=true)
        public static native UTType DiskImage();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeData", optional=true)
        public static native UTType Data();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeDirectory", optional=true)
        public static native UTType Directory();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeResolvable", optional=true)
        public static native UTType Resolvable();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeSymbolicLink", optional=true)
        public static native UTType SymbolicLink();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeExecutable", optional=true)
        public static native UTType Executable();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeMountPoint", optional=true)
        public static native UTType MountPoint();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeAliasFile", optional=true)
        public static native UTType AliasFile();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeURLBookmarkData", optional=true)
        public static native UTType URLBookmarkData();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeURL", optional=true)
        public static native UTType URL();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeFileURL", optional=true)
        public static native UTType FileURL();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeText", optional=true)
        public static native UTType Text();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypePlainText", optional=true)
        public static native UTType PlainText();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeUTF8PlainText", optional=true)
        public static native UTType UTF8PlainText();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeUTF16ExternalPlainText", optional=true)
        public static native UTType UTF16ExternalPlainText();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeUTF16PlainText", optional=true)
        public static native UTType UTF16PlainText();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeDelimitedText", optional=true)
        public static native UTType DelimitedText();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeCommaSeparatedText", optional=true)
        public static native UTType CommaSeparatedText();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeTabSeparatedText", optional=true)
        public static native UTType TabSeparatedText();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeUTF8TabSeparatedText", optional=true)
        public static native UTType UTF8TabSeparatedText();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeRTF", optional=true)
        public static native UTType RTF();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeHTML", optional=true)
        public static native UTType HTML();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeXML", optional=true)
        public static native UTType XML();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeYAML", optional=true)
        public static native UTType YAML();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeSourceCode", optional=true)
        public static native UTType SourceCode();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeAssemblyLanguageSource", optional=true)
        public static native UTType AssemblyLanguageSource();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeCSource", optional=true)
        public static native UTType CSource();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeObjectiveCSource", optional=true)
        public static native UTType ObjectiveCSource();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeSwiftSource", optional=true)
        public static native UTType SwiftSource();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeCPlusPlusSource", optional=true)
        public static native UTType CPlusPlusSource();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeObjectiveCPlusPlusSource", optional=true)
        public static native UTType ObjectiveCPlusPlusSource();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeCHeader", optional=true)
        public static native UTType CHeader();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeCPlusPlusHeader", optional=true)
        public static native UTType CPlusPlusHeader();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeScript", optional=true)
        public static native UTType Script();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeAppleScript", optional=true)
        public static native UTType AppleScript();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeOSAScript", optional=true)
        public static native UTType OSAScript();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeOSAScriptBundle", optional=true)
        public static native UTType OSAScriptBundle();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeJavaScript", optional=true)
        public static native UTType JavaScript();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeShellScript", optional=true)
        public static native UTType ShellScript();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypePerlScript", optional=true)
        public static native UTType PerlScript();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypePythonScript", optional=true)
        public static native UTType PythonScript();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeRubyScript", optional=true)
        public static native UTType RubyScript();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypePHPScript", optional=true)
        public static native UTType PHPScript();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="UTTypeMakefile", optional=true)
        public static native UTType Makefile();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeJSON", optional=true)
        public static native UTType JSON();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypePropertyList", optional=true)
        public static native UTType PropertyList();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeXMLPropertyList", optional=true)
        public static native UTType XMLPropertyList();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeBinaryPropertyList", optional=true)
        public static native UTType BinaryPropertyList();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypePDF", optional=true)
        public static native UTType PDF();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeRTFD", optional=true)
        public static native UTType RTFD();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeFlatRTFD", optional=true)
        public static native UTType FlatRTFD();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeWebArchive", optional=true)
        public static native UTType WebArchive();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeImage", optional=true)
        public static native UTType Image();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeJPEG", optional=true)
        public static native UTType JPEG();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeTIFF", optional=true)
        public static native UTType TIFF();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeGIF", optional=true)
        public static native UTType GIF();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypePNG", optional=true)
        public static native UTType PNG();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeICNS", optional=true)
        public static native UTType ICNS();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeBMP", optional=true)
        public static native UTType BMP();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeICO", optional=true)
        public static native UTType ICO();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeRAWImage", optional=true)
        public static native UTType RAWImage();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeSVG", optional=true)
        public static native UTType SVG();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeLivePhoto", optional=true)
        public static native UTType LivePhoto();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeHEIF", optional=true)
        public static native UTType HEIF();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeHEIC", optional=true)
        public static native UTType HEIC();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeWebP", optional=true)
        public static native UTType WebP();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTType3DContent", optional=true)
        public static native UTType _3DContent();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeUSD", optional=true)
        public static native UTType USD();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeUSDZ", optional=true)
        public static native UTType USDZ();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeRealityFile", optional=true)
        public static native UTType RealityFile();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeSceneKitScene", optional=true)
        public static native UTType SceneKitScene();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeARReferenceObject", optional=true)
        public static native UTType ARReferenceObject();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeAudiovisualContent", optional=true)
        public static native UTType AudiovisualContent();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeMovie", optional=true)
        public static native UTType Movie();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeVideo", optional=true)
        public static native UTType Video();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeAudio", optional=true)
        public static native UTType Audio();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeQuickTimeMovie", optional=true)
        public static native UTType QuickTimeMovie();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeMPEG", optional=true)
        public static native UTType MPEG();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeMPEG2Video", optional=true)
        public static native UTType MPEG2Video();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeMPEG2TransportStream", optional=true)
        public static native UTType MPEG2TransportStream();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeMP3", optional=true)
        public static native UTType MP3();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeMPEG4Movie", optional=true)
        public static native UTType MPEG4Movie();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeMPEG4Audio", optional=true)
        public static native UTType MPEG4Audio();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeAppleProtectedMPEG4Audio", optional=true)
        public static native UTType AppleProtectedMPEG4Audio();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeAppleProtectedMPEG4Video", optional=true)
        public static native UTType AppleProtectedMPEG4Video();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeAVI", optional=true)
        public static native UTType AVI();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeAIFF", optional=true)
        public static native UTType AIFF();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeWAV", optional=true)
        public static native UTType WAV();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeMIDI", optional=true)
        public static native UTType MIDI();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypePlaylist", optional=true)
        public static native UTType Playlist();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeM3UPlaylist", optional=true)
        public static native UTType M3UPlaylist();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeFolder", optional=true)
        public static native UTType Folder();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeVolume", optional=true)
        public static native UTType Volume();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypePackage", optional=true)
        public static native UTType Package();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeBundle", optional=true)
        public static native UTType Bundle();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypePluginBundle", optional=true)
        public static native UTType PluginBundle();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeSpotlightImporter", optional=true)
        public static native UTType SpotlightImporter();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeQuickLookGenerator", optional=true)
        public static native UTType QuickLookGenerator();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeXPCService", optional=true)
        public static native UTType XPCService();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeFramework", optional=true)
        public static native UTType Framework();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeApplication", optional=true)
        public static native UTType Application();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeApplicationBundle", optional=true)
        public static native UTType ApplicationBundle();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeApplicationExtension", optional=true)
        public static native UTType ApplicationExtension();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeUnixExecutable", optional=true)
        public static native UTType UnixExecutable();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeEXE", optional=true)
        public static native UTType EXE();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeSystemPreferencesPane", optional=true)
        public static native UTType SystemPreferencesPane();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeArchive", optional=true)
        public static native UTType Archive();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeGZIP", optional=true)
        public static native UTType GZIP();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeBZ2", optional=true)
        public static native UTType BZ2();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeZIP", optional=true)
        public static native UTType ZIP();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeAppleArchive", optional=true)
        public static native UTType AppleArchive();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeSpreadsheet", optional=true)
        public static native UTType Spreadsheet();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypePresentation", optional=true)
        public static native UTType Presentation();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeDatabase", optional=true)
        public static native UTType Database();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeMessage", optional=true)
        public static native UTType Message();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeContact", optional=true)
        public static native UTType Contact();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeVCard", optional=true)
        public static native UTType VCard();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeToDoItem", optional=true)
        public static native UTType ToDoItem();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeCalendarEvent", optional=true)
        public static native UTType CalendarEvent();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeEmailMessage", optional=true)
        public static native UTType EmailMessage();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeInternetLocation", optional=true)
        public static native UTType InternetLocation();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeInternetShortcut", optional=true)
        public static native UTType InternetShortcut();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeFont", optional=true)
        public static native UTType Font();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeBookmark", optional=true)
        public static native UTType Bookmark();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypePKCS12", optional=true)
        public static native UTType PKCS12();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeX509Certificate", optional=true)
        public static native UTType X509Certificate();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeEPUB", optional=true)
        public static native UTType EPUB();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTypeLog", optional=true)
        public static native UTType Log();
    }

    @Library("UniformTypeIdentifiers")
    public static class TagClasses {
        static { Bro.bind(TagClasses.class); }

        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTagClassFilenameExtension", optional=true)
        public static native String FilenameExtension();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="UTTagClassMIMEType", optional=true)
        public static native String MIMEType();
    }
    
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "typeWithIdentifier:")
    public static native UTType createUsingIdentifier(String identifier);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "typeWithFilenameExtension:")
    public static native UTType createUsingFilenameExtension(String filenameExtension);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "typeWithFilenameExtension:conformingToType:")
    public static native UTType createUsingFilenameExtension(String filenameExtension, UTType supertype);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "typeWithMIMEType:")
    public static native UTType createUsingMIMEType(String mimeType);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "typeWithMIMEType:conformingToType:")
    public static native UTType createUsingMIMEType(String mimeType, UTType supertype);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "conformsToType:")
    public native boolean conformsToType(UTType type);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "isSupertypeOfType:")
    public native boolean isSupertypeOfType(UTType type);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "isSubtypeOfType:")
    public native boolean isSubtypeOfType(UTType type);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "typeWithTag:tagClass:conformingToType:")
    public static native UTType createUsingTagClass(String tag, String tagClass, UTType supertype);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "typesWithTag:tagClass:conformingToType:")
    public static native NSArray<UTType> createTypesUsingTagClass(String tag, String tagClass, UTType supertype);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "exportedTypeWithIdentifier:")
    public static native UTType getExportedType(String identifier);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "exportedTypeWithIdentifier:conformingToType:")
    public static native UTType getExportedType(String identifier, UTType parentType);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "importedTypeWithIdentifier:")
    public static native UTType getImportedType(String identifier);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "importedTypeWithIdentifier:conformingToType:")
    public static native UTType getImportedType(String identifier, UTType parentType);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
