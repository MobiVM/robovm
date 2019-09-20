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
package org.robovm.apple.uikit;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.cloudkit.*;
import org.robovm.apple.fileprovider.*;
import org.robovm.apple.intents.*;
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.linkpresentation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/UIMenuIdentifier/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIMenuIdentifier/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/UIMenuIdentifier/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static UIMenuIdentifier toObject(Class<UIMenuIdentifier> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return UIMenuIdentifier.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(UIMenuIdentifier o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<UIMenuIdentifier> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<UIMenuIdentifier> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(UIMenuIdentifier.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<UIMenuIdentifier> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (UIMenuIdentifier o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final UIMenuIdentifier Application = new UIMenuIdentifier("Application");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final UIMenuIdentifier File = new UIMenuIdentifier("File");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final UIMenuIdentifier Edit = new UIMenuIdentifier("Edit");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final UIMenuIdentifier View = new UIMenuIdentifier("View");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final UIMenuIdentifier Window = new UIMenuIdentifier("Window");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final UIMenuIdentifier Help = new UIMenuIdentifier("Help");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final UIMenuIdentifier About = new UIMenuIdentifier("About");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final UIMenuIdentifier Preferences = new UIMenuIdentifier("Preferences");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final UIMenuIdentifier Services = new UIMenuIdentifier("Services");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final UIMenuIdentifier Hide = new UIMenuIdentifier("Hide");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final UIMenuIdentifier Quit = new UIMenuIdentifier("Quit");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final UIMenuIdentifier NewScene = new UIMenuIdentifier("NewScene");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final UIMenuIdentifier Close = new UIMenuIdentifier("Close");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final UIMenuIdentifier Print = new UIMenuIdentifier("Print");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final UIMenuIdentifier UndoRedo = new UIMenuIdentifier("UndoRedo");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final UIMenuIdentifier StandardEdit = new UIMenuIdentifier("StandardEdit");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final UIMenuIdentifier Find = new UIMenuIdentifier("Find");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final UIMenuIdentifier Replace = new UIMenuIdentifier("Replace");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final UIMenuIdentifier Share = new UIMenuIdentifier("Share");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final UIMenuIdentifier TextStyle = new UIMenuIdentifier("TextStyle");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final UIMenuIdentifier Spelling = new UIMenuIdentifier("Spelling");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final UIMenuIdentifier SpellingPanel = new UIMenuIdentifier("SpellingPanel");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final UIMenuIdentifier SpellingOptions = new UIMenuIdentifier("SpellingOptions");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final UIMenuIdentifier Substitutions = new UIMenuIdentifier("Substitutions");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final UIMenuIdentifier SubstitutionsPanel = new UIMenuIdentifier("SubstitutionsPanel");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final UIMenuIdentifier SubstitutionOptions = new UIMenuIdentifier("SubstitutionOptions");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final UIMenuIdentifier Transformations = new UIMenuIdentifier("Transformations");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final UIMenuIdentifier Speech = new UIMenuIdentifier("Speech");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final UIMenuIdentifier Lookup = new UIMenuIdentifier("Lookup");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final UIMenuIdentifier Learn = new UIMenuIdentifier("Learn");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final UIMenuIdentifier Format = new UIMenuIdentifier("Format");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final UIMenuIdentifier Font = new UIMenuIdentifier("Font");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final UIMenuIdentifier TextSize = new UIMenuIdentifier("TextSize");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final UIMenuIdentifier TextColor = new UIMenuIdentifier("TextColor");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final UIMenuIdentifier TextStylePasteboard = new UIMenuIdentifier("TextStylePasteboard");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final UIMenuIdentifier Text = new UIMenuIdentifier("Text");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final UIMenuIdentifier WritingDirection = new UIMenuIdentifier("WritingDirection");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final UIMenuIdentifier Alignment = new UIMenuIdentifier("Alignment");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final UIMenuIdentifier Toolbar = new UIMenuIdentifier("Toolbar");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final UIMenuIdentifier Fullscreen = new UIMenuIdentifier("Fullscreen");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final UIMenuIdentifier MinimizeAndZoom = new UIMenuIdentifier("MinimizeAndZoom");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final UIMenuIdentifier BringAllToFront = new UIMenuIdentifier("BringAllToFront");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final UIMenuIdentifier Root = new UIMenuIdentifier("Root");
    /*</constants>*/
    
    private static /*<name>*/UIMenuIdentifier/*</name>*/[] values = new /*<name>*/UIMenuIdentifier/*</name>*/[] {/*<value_list>*/Application, File, Edit, View, Window, Help, About, Preferences, Services, Hide, Quit, NewScene, Close, Print, UndoRedo, StandardEdit, Find, Replace, Share, TextStyle, Spelling, SpellingPanel, SpellingOptions, Substitutions, SubstitutionsPanel, SubstitutionOptions, Transformations, Speech, Lookup, Learn, Format, Font, TextSize, TextColor, TextStylePasteboard, Text, WritingDirection, Alignment, Toolbar, Fullscreen, MinimizeAndZoom, BringAllToFront, Root/*</value_list>*/};
    
    /*<name>*/UIMenuIdentifier/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/UIMenuIdentifier/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/UIMenuIdentifier/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/UIMenuIdentifier/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("UIKit") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="UIMenuApplication", optional=true)
        public static native NSString Application();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="UIMenuFile", optional=true)
        public static native NSString File();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="UIMenuEdit", optional=true)
        public static native NSString Edit();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="UIMenuView", optional=true)
        public static native NSString View();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="UIMenuWindow", optional=true)
        public static native NSString Window();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="UIMenuHelp", optional=true)
        public static native NSString Help();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="UIMenuAbout", optional=true)
        public static native NSString About();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="UIMenuPreferences", optional=true)
        public static native NSString Preferences();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="UIMenuServices", optional=true)
        public static native NSString Services();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="UIMenuHide", optional=true)
        public static native NSString Hide();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="UIMenuQuit", optional=true)
        public static native NSString Quit();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="UIMenuNewScene", optional=true)
        public static native NSString NewScene();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="UIMenuClose", optional=true)
        public static native NSString Close();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="UIMenuPrint", optional=true)
        public static native NSString Print();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="UIMenuUndoRedo", optional=true)
        public static native NSString UndoRedo();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="UIMenuStandardEdit", optional=true)
        public static native NSString StandardEdit();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="UIMenuFind", optional=true)
        public static native NSString Find();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="UIMenuReplace", optional=true)
        public static native NSString Replace();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="UIMenuShare", optional=true)
        public static native NSString Share();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="UIMenuTextStyle", optional=true)
        public static native NSString TextStyle();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="UIMenuSpelling", optional=true)
        public static native NSString Spelling();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="UIMenuSpellingPanel", optional=true)
        public static native NSString SpellingPanel();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="UIMenuSpellingOptions", optional=true)
        public static native NSString SpellingOptions();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="UIMenuSubstitutions", optional=true)
        public static native NSString Substitutions();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="UIMenuSubstitutionsPanel", optional=true)
        public static native NSString SubstitutionsPanel();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="UIMenuSubstitutionOptions", optional=true)
        public static native NSString SubstitutionOptions();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="UIMenuTransformations", optional=true)
        public static native NSString Transformations();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="UIMenuSpeech", optional=true)
        public static native NSString Speech();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="UIMenuLookup", optional=true)
        public static native NSString Lookup();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="UIMenuLearn", optional=true)
        public static native NSString Learn();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="UIMenuFormat", optional=true)
        public static native NSString Format();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="UIMenuFont", optional=true)
        public static native NSString Font();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="UIMenuTextSize", optional=true)
        public static native NSString TextSize();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="UIMenuTextColor", optional=true)
        public static native NSString TextColor();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="UIMenuTextStylePasteboard", optional=true)
        public static native NSString TextStylePasteboard();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="UIMenuText", optional=true)
        public static native NSString Text();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="UIMenuWritingDirection", optional=true)
        public static native NSString WritingDirection();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="UIMenuAlignment", optional=true)
        public static native NSString Alignment();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="UIMenuToolbar", optional=true)
        public static native NSString Toolbar();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="UIMenuFullscreen", optional=true)
        public static native NSString Fullscreen();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="UIMenuMinimizeAndZoom", optional=true)
        public static native NSString MinimizeAndZoom();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="UIMenuBringAllToFront", optional=true)
        public static native NSString BringAllToFront();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="UIMenuRoot", optional=true)
        public static native NSString Root();
        /*</values>*/
    }
}
