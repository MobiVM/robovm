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
import org.robovm.apple.symbols.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/NSAttributedStringAttribute/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSAttributedStringAttribute/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/NSAttributedStringAttribute/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static NSAttributedStringAttribute toObject(Class<NSAttributedStringAttribute> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return NSAttributedStringAttribute.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(NSAttributedStringAttribute o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<NSAttributedStringAttribute> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<NSAttributedStringAttribute> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(NSAttributedStringAttribute.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<NSAttributedStringAttribute> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (NSAttributedStringAttribute o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final NSAttributedStringAttribute SpeechPunctuation = new NSAttributedStringAttribute("SpeechPunctuation");
    public static final NSAttributedStringAttribute SpeechLanguage = new NSAttributedStringAttribute("SpeechLanguage");
    public static final NSAttributedStringAttribute SpeechPitch = new NSAttributedStringAttribute("SpeechPitch");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final NSAttributedStringAttribute SpeechQueueAnnouncement = new NSAttributedStringAttribute("SpeechQueueAnnouncement");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final NSAttributedStringAttribute SpeechAnnouncementPriority = new NSAttributedStringAttribute("SpeechAnnouncementPriority");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final NSAttributedStringAttribute SpeechIPANotation = new NSAttributedStringAttribute("SpeechIPANotation");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final NSAttributedStringAttribute SpeechSpellOut = new NSAttributedStringAttribute("SpeechSpellOut");
    public static final NSAttributedStringAttribute Font = new NSAttributedStringAttribute("Font");
    public static final NSAttributedStringAttribute ParagraphStyle = new NSAttributedStringAttribute("ParagraphStyle");
    public static final NSAttributedStringAttribute ForegroundColor = new NSAttributedStringAttribute("ForegroundColor");
    public static final NSAttributedStringAttribute BackgroundColor = new NSAttributedStringAttribute("BackgroundColor");
    public static final NSAttributedStringAttribute Ligature = new NSAttributedStringAttribute("Ligature");
    public static final NSAttributedStringAttribute Kern = new NSAttributedStringAttribute("Kern");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final NSAttributedStringAttribute Tracking = new NSAttributedStringAttribute("Tracking");
    public static final NSAttributedStringAttribute StrikethroughStyle = new NSAttributedStringAttribute("StrikethroughStyle");
    public static final NSAttributedStringAttribute UnderlineStyle = new NSAttributedStringAttribute("UnderlineStyle");
    public static final NSAttributedStringAttribute StrokeColor = new NSAttributedStringAttribute("StrokeColor");
    public static final NSAttributedStringAttribute StrokeWidth = new NSAttributedStringAttribute("StrokeWidth");
    public static final NSAttributedStringAttribute Shadow = new NSAttributedStringAttribute("Shadow");
    public static final NSAttributedStringAttribute TextEffect = new NSAttributedStringAttribute("TextEffect");
    public static final NSAttributedStringAttribute Attachment = new NSAttributedStringAttribute("Attachment");
    public static final NSAttributedStringAttribute Link = new NSAttributedStringAttribute("Link");
    public static final NSAttributedStringAttribute BaselineOffset = new NSAttributedStringAttribute("BaselineOffset");
    public static final NSAttributedStringAttribute UnderlineColor = new NSAttributedStringAttribute("UnderlineColor");
    public static final NSAttributedStringAttribute StrikethroughColor = new NSAttributedStringAttribute("StrikethroughColor");
    public static final NSAttributedStringAttribute WritingDirection = new NSAttributedStringAttribute("WritingDirection");
    /**
     * @deprecated This attribute is no longer supported with TextKit 2
     */
    @Deprecated
    public static final NSAttributedStringAttribute Obliqueness = new NSAttributedStringAttribute("Obliqueness");
    /**
     * @deprecated This attribute is no longer supported with TextKit 2
     */
    @Deprecated
    public static final NSAttributedStringAttribute Expansion = new NSAttributedStringAttribute("Expansion");
    /**
     * @deprecated This attribute is no longer supported with TextKit 2
     */
    @Deprecated
    public static final NSAttributedStringAttribute VerticalGlyphForm = new NSAttributedStringAttribute("VerticalGlyphForm");
    /**
     * @deprecated Deprecated in iOS 7.0. Use NSFontAttributeName
     */
    @Deprecated
    public static final NSAttributedStringAttribute TextFont = new NSAttributedStringAttribute("TextFont");
    /**
     * @deprecated Deprecated in iOS 7.0. Use NSForegroundColorAttributeName
     */
    @Deprecated
    public static final NSAttributedStringAttribute TextColor = new NSAttributedStringAttribute("TextColor");
    /**
     * @deprecated Deprecated in iOS 7.0. Use NSShadowAttributeName with an NSShadow instance as the value
     */
    @Deprecated
    public static final NSAttributedStringAttribute TextShadowColor = new NSAttributedStringAttribute("TextShadowColor");
    /**
     * @deprecated Deprecated in iOS 7.0. Use NSShadowAttributeName with an NSShadow instance as the value
     */
    @Deprecated
    public static final NSAttributedStringAttribute TextShadowOffset = new NSAttributedStringAttribute("TextShadowOffset");
    /*</constants>*/
    
    private static /*<name>*/NSAttributedStringAttribute/*</name>*/[] values = new /*<name>*/NSAttributedStringAttribute/*</name>*/[] {/*<value_list>*/SpeechPunctuation, SpeechLanguage, SpeechPitch, SpeechQueueAnnouncement, SpeechAnnouncementPriority, SpeechIPANotation, SpeechSpellOut, Font, ParagraphStyle, ForegroundColor, BackgroundColor, Ligature, Kern, Tracking, StrikethroughStyle, UnderlineStyle, StrokeColor, StrokeWidth, Shadow, TextEffect, Attachment, Link, BaselineOffset, UnderlineColor, StrikethroughColor, WritingDirection, Obliqueness, Expansion, VerticalGlyphForm, TextFont, TextColor, TextShadowColor, TextShadowOffset/*</value_list>*/};
    
    /*<name>*/NSAttributedStringAttribute/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/NSAttributedStringAttribute/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/NSAttributedStringAttribute/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/NSAttributedStringAttribute/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("UIKit") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="UIAccessibilitySpeechAttributePunctuation", optional=true)
        public static native NSString SpeechPunctuation();
        @GlobalValue(symbol="UIAccessibilitySpeechAttributeLanguage", optional=true)
        public static native NSString SpeechLanguage();
        @GlobalValue(symbol="UIAccessibilitySpeechAttributePitch", optional=true)
        public static native NSString SpeechPitch();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="UIAccessibilitySpeechAttributeQueueAnnouncement", optional=true)
        public static native NSString SpeechQueueAnnouncement();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="UIAccessibilitySpeechAttributeAnnouncementPriority", optional=true)
        public static native NSString SpeechAnnouncementPriority();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="UIAccessibilitySpeechAttributeIPANotation", optional=true)
        public static native NSString SpeechIPANotation();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="UIAccessibilitySpeechAttributeSpellOut", optional=true)
        public static native NSString SpeechSpellOut();
        @GlobalValue(symbol="NSFontAttributeName", optional=true)
        public static native NSString Font();
        @GlobalValue(symbol="NSParagraphStyleAttributeName", optional=true)
        public static native NSString ParagraphStyle();
        @GlobalValue(symbol="NSForegroundColorAttributeName", optional=true)
        public static native NSString ForegroundColor();
        @GlobalValue(symbol="NSBackgroundColorAttributeName", optional=true)
        public static native NSString BackgroundColor();
        @GlobalValue(symbol="NSLigatureAttributeName", optional=true)
        public static native NSString Ligature();
        @GlobalValue(symbol="NSKernAttributeName", optional=true)
        public static native NSString Kern();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="NSTrackingAttributeName", optional=true)
        public static native NSString Tracking();
        @GlobalValue(symbol="NSStrikethroughStyleAttributeName", optional=true)
        public static native NSString StrikethroughStyle();
        @GlobalValue(symbol="NSUnderlineStyleAttributeName", optional=true)
        public static native NSString UnderlineStyle();
        @GlobalValue(symbol="NSStrokeColorAttributeName", optional=true)
        public static native NSString StrokeColor();
        @GlobalValue(symbol="NSStrokeWidthAttributeName", optional=true)
        public static native NSString StrokeWidth();
        @GlobalValue(symbol="NSShadowAttributeName", optional=true)
        public static native NSString Shadow();
        @GlobalValue(symbol="NSTextEffectAttributeName", optional=true)
        public static native NSString TextEffect();
        @GlobalValue(symbol="NSAttachmentAttributeName", optional=true)
        public static native NSString Attachment();
        @GlobalValue(symbol="NSLinkAttributeName", optional=true)
        public static native NSString Link();
        @GlobalValue(symbol="NSBaselineOffsetAttributeName", optional=true)
        public static native NSString BaselineOffset();
        @GlobalValue(symbol="NSUnderlineColorAttributeName", optional=true)
        public static native NSString UnderlineColor();
        @GlobalValue(symbol="NSStrikethroughColorAttributeName", optional=true)
        public static native NSString StrikethroughColor();
        @GlobalValue(symbol="NSWritingDirectionAttributeName", optional=true)
        public static native NSString WritingDirection();
        /**
         * @deprecated This attribute is no longer supported with TextKit 2
         */
        @Deprecated
        @GlobalValue(symbol="NSObliquenessAttributeName", optional=true)
        public static native NSString Obliqueness();
        /**
         * @deprecated This attribute is no longer supported with TextKit 2
         */
        @Deprecated
        @GlobalValue(symbol="NSExpansionAttributeName", optional=true)
        public static native NSString Expansion();
        /**
         * @deprecated This attribute is no longer supported with TextKit 2
         */
        @Deprecated
        @GlobalValue(symbol="NSVerticalGlyphFormAttributeName", optional=true)
        public static native NSString VerticalGlyphForm();
        /**
         * @deprecated Deprecated in iOS 7.0. Use NSFontAttributeName
         */
        @Deprecated
        @GlobalValue(symbol="UITextAttributeFont", optional=true)
        public static native NSString TextFont();
        /**
         * @deprecated Deprecated in iOS 7.0. Use NSForegroundColorAttributeName
         */
        @Deprecated
        @GlobalValue(symbol="UITextAttributeTextColor", optional=true)
        public static native NSString TextColor();
        /**
         * @deprecated Deprecated in iOS 7.0. Use NSShadowAttributeName with an NSShadow instance as the value
         */
        @Deprecated
        @GlobalValue(symbol="UITextAttributeTextShadowColor", optional=true)
        public static native NSString TextShadowColor();
        /**
         * @deprecated Deprecated in iOS 7.0. Use NSShadowAttributeName with an NSShadow instance as the value
         */
        @Deprecated
        @GlobalValue(symbol="UITextAttributeTextShadowOffset", optional=true)
        public static native NSString TextShadowOffset();
        /*</values>*/
    }
}
