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
package org.robovm.apple.coretext;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreText")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CTFont/*</name>*/ 
    extends /*<extends>*/CFType/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CTFontPtr extends Ptr<CTFont, CTFontPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(CTFont.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CTFont() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /**
     * @since Available in iOS 3.2 and later.
     */
    public String getLocalizedName(CTFontNameKey nameKey) {
        return getLocalizedName(nameKey, null);
    }
    
    /**
     * @since Available in iOS 3.2 and later.
     */
    public short[] getGlyphs(short[] characters) {
        ShortPtr cptr = new ShortPtr();
        cptr.set(characters);
        ShortPtr ptr = new ShortPtr();
        getGlyphs(cptr, ptr, characters.length);
        return ptr.toShortArray(characters.length);
    }
    /**
     * @since Available in iOS 3.2 and later.
     */
    public CGRect[] getBoundingRects(CTFontOrientation orientation, short[] glyphs) {
        ShortPtr gptr = new ShortPtr();
        gptr.set(glyphs);
        CGRect.CGRectPtr ptr = new CGRect.CGRectPtr();
        getBoundingRects(orientation, gptr, ptr, glyphs.length);
        return ptr.get().toArray(glyphs.length);
    }
    /**
     * @since Available in iOS 6.0 and later.
     */
    public CGRect[] getOpticalBounds(short[] glyphs) {
        ShortPtr gptr = new ShortPtr();
        gptr.set(glyphs);
        CGRect.CGRectPtr ptr = new CGRect.CGRectPtr();
        getOpticalBounds(gptr, ptr, glyphs.length, 0);
        return ptr.get().toArray(glyphs.length);
    }
    /**
     * @since Available in iOS 3.2 and later.
     */
    public CGSize[] getAdvances(CTFontOrientation orientation, short[] glyphs) {
        ShortPtr gptr = new ShortPtr();
        gptr.set(glyphs);
        CGSize.CGSizePtr ptr = new CGSize.CGSizePtr();
        getAdvances(orientation, gptr, ptr, glyphs.length);
        return ptr.get().toArray(glyphs.length);
    }
    /**
     * @since Available in iOS 3.2 and later.
     */
    public CGSize[] getVerticalTranslations(short[] glyphs) {
        ShortPtr gptr = new ShortPtr();
        gptr.set(glyphs);
        CGSize.CGSizePtr ptr = new CGSize.CGSizePtr();
        getVerticalTranslations(gptr, ptr, glyphs.length);
        return ptr.get().toArray(glyphs.length);
    }
    /**
     * @since Available in iOS 3.2 and later.
     */
    public CGFont getGraphicsFont() {
        return getGraphicsFont(null);
    }
    /**
     * @since Available in iOS 4.2 and later.
     */
    public void drawGlyphs(short[] glyphs, CGPoint[] positions, CGContext context) {
        ShortPtr gptr = new ShortPtr();
        gptr.set(glyphs);
        CGPoint pos = new CGPoint();
        pos.update(positions);
        drawGlyphs(gptr, pos, positions.length, context);
    }
    /**
     * @since Available in iOS 3.2 and later.
     */
    public double[] getLigatureCaretPositions(short glyph, int maxPositions) {
        MachineSizedFloatPtr ptr = new MachineSizedFloatPtr();
        getLigatureCaretPositions(glyph, ptr, maxPositions);
        return ptr.toDoubleArray(maxPositions);
    }
    /*<methods>*/
    @Bridge(symbol="CTFontGetTypeID", optional=true)
    public static native @MachineSizedUInt long getClassTypeID();
    @Bridge(symbol="CTFontCreateWithName", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CTFont create(String name, @MachineSizedFloat double size, CGAffineTransform matrix);
    @Bridge(symbol="CTFontCreateWithFontDescriptor", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CTFont create(CTFontDescriptor descriptor, @MachineSizedFloat double size, CGAffineTransform matrix);
    @Bridge(symbol="CTFontCreateWithNameAndOptions", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CTFont create(String name, @MachineSizedFloat double size, CGAffineTransform matrix, CTFontOptions options);
    @Bridge(symbol="CTFontCreateWithFontDescriptorAndOptions", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CTFont create(CTFontDescriptor descriptor, @MachineSizedFloat double size, CGAffineTransform matrix, CTFontOptions options);
    @Bridge(symbol="CTFontCreateUIFontForLanguage", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CTFont createUIFont(CTFontUIFontType uiType, @MachineSizedFloat double size, String language);
    @Bridge(symbol="CTFontCreateCopyWithAttributes", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CTFont createCopy(CTFont font, @MachineSizedFloat double size, CGAffineTransform matrix, CTFontDescriptor attributes);
    @Bridge(symbol="CTFontCreateCopyWithSymbolicTraits", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CTFont createCopy(CTFont font, @MachineSizedFloat double size, CGAffineTransform matrix, CTFontSymbolicTraits symTraitValue, CTFontSymbolicTraits symTraitMask);
    @Bridge(symbol="CTFontCreateCopyWithFamily", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CTFont createCopy(CTFont font, @MachineSizedFloat double size, CGAffineTransform matrix, String family);
    @Bridge(symbol="CTFontCreateForString", optional=true)
    public native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CTFont create(String string, @ByVal CFRange range);
    @Bridge(symbol="CTFontCreateForStringWithLanguage", optional=true)
    public native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CTFont create(String string, @ByVal CFRange range, String language);
    @Bridge(symbol="CTFontCopyFontDescriptor", optional=true)
    public native CTFontDescriptor getFontDescriptor();
    @Bridge(symbol="CTFontCopyAttribute", optional=true)
    public native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CFType getAttribute(CTFontAttribute attribute);
    @Bridge(symbol="CTFontGetSize", optional=true)
    public native @MachineSizedFloat double getSize();
    @Bridge(symbol="CTFontGetMatrix", optional=true)
    public native @ByVal CGAffineTransform getMatrix();
    @Bridge(symbol="CTFontGetSymbolicTraits", optional=true)
    public native CTFontSymbolicTraits getSymbolicTraits();
    @Bridge(symbol="CTFontCopyTraits", optional=true)
    public native CTFontTraits getTraits();
    @Bridge(symbol="CTFontCopyPostScriptName", optional=true)
    public native @org.robovm.rt.bro.annotation.Marshaler(CFString.AsStringNoRetainMarshaler.class) String getPostScriptName();
    @Bridge(symbol="CTFontCopyFamilyName", optional=true)
    public native @org.robovm.rt.bro.annotation.Marshaler(CFString.AsStringNoRetainMarshaler.class) String getFamilyName();
    @Bridge(symbol="CTFontCopyFullName", optional=true)
    public native @org.robovm.rt.bro.annotation.Marshaler(CFString.AsStringNoRetainMarshaler.class) String getFullName();
    @Bridge(symbol="CTFontCopyDisplayName", optional=true)
    public native @org.robovm.rt.bro.annotation.Marshaler(CFString.AsStringNoRetainMarshaler.class) String getDisplayName();
    @Bridge(symbol="CTFontCopyName", optional=true)
    public native @org.robovm.rt.bro.annotation.Marshaler(CFString.AsStringNoRetainMarshaler.class) String getName(CTFontNameKey nameKey);
    @Bridge(symbol="CTFontCopyLocalizedName", optional=true)
    protected native @org.robovm.rt.bro.annotation.Marshaler(CFString.AsStringNoRetainMarshaler.class) String getLocalizedName(CTFontNameKey nameKey, CFString.CFStringPtr actualLanguage);
    @Bridge(symbol="CTFontCopyCharacterSet", optional=true)
    public native NSCharacterSet getCharacterSet();
    @Bridge(symbol="CTFontGetStringEncoding", optional=true)
    public native @org.robovm.rt.bro.annotation.Marshaler(CFStringEncodings.class) int getStringEncoding();
    @Bridge(symbol="CTFontCopySupportedLanguages", optional=true)
    public native @org.robovm.rt.bro.annotation.Marshaler(CFArray.AsStringListMarshaler.class) List<String> getSupportedLanguages();
    @Bridge(symbol="CTFontGetGlyphsForCharacters", optional=true)
    protected native boolean getGlyphs(ShortPtr characters, ShortPtr glyphs, @MachineSizedSInt long count);
    @Bridge(symbol="CTFontGetAscent", optional=true)
    public native @MachineSizedFloat double getAscent();
    @Bridge(symbol="CTFontGetDescent", optional=true)
    public native @MachineSizedFloat double getDescent();
    @Bridge(symbol="CTFontGetLeading", optional=true)
    public native @MachineSizedFloat double getLeading();
    @Bridge(symbol="CTFontGetUnitsPerEm", optional=true)
    public native int getUnitsPerEm();
    @Bridge(symbol="CTFontGetGlyphCount", optional=true)
    public native @MachineSizedSInt long getGlyphCount();
    @Bridge(symbol="CTFontGetBoundingBox", optional=true)
    public native @ByVal CGRect getBoundingBox();
    @Bridge(symbol="CTFontGetUnderlinePosition", optional=true)
    public native @MachineSizedFloat double getUnderlinePosition();
    @Bridge(symbol="CTFontGetUnderlineThickness", optional=true)
    public native @MachineSizedFloat double getUnderlineThickness();
    @Bridge(symbol="CTFontGetSlantAngle", optional=true)
    public native @MachineSizedFloat double getSlantAngle();
    @Bridge(symbol="CTFontGetCapHeight", optional=true)
    public native @MachineSizedFloat double getCapHeight();
    @Bridge(symbol="CTFontGetXHeight", optional=true)
    public native @MachineSizedFloat double getXHeight();
    @Bridge(symbol="CTFontGetGlyphWithName", optional=true)
    public native short getGlyph(String glyphName);
    @Bridge(symbol="CTFontCopyNameForGlyph", optional=true)
    public native String getNameForGlyph(short glyph);
    @Bridge(symbol="CTFontGetBoundingRectsForGlyphs", optional=true)
    protected native @ByVal CGRect getBoundingRects(CTFontOrientation orientation, ShortPtr glyphs, CGRect.CGRectPtr boundingRects, @MachineSizedSInt long count);
    @Bridge(symbol="CTFontGetOpticalBoundsForGlyphs", optional=true)
    protected native @ByVal CGRect getOpticalBounds(ShortPtr glyphs, CGRect.CGRectPtr boundingRects, @MachineSizedSInt long count, @MachineSizedUInt long options);
    @Bridge(symbol="CTFontGetAdvancesForGlyphs", optional=true)
    protected native double getAdvances(CTFontOrientation orientation, ShortPtr glyphs, CGSize.CGSizePtr advances, @MachineSizedSInt long count);
    @Bridge(symbol="CTFontGetVerticalTranslationsForGlyphs", optional=true)
    protected native void getVerticalTranslations(ShortPtr glyphs, CGSize.CGSizePtr translations, @MachineSizedSInt long count);
    @Bridge(symbol="CTFontCreatePathForGlyph", optional=true)
    public native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGPath createPath(short glyph, CGAffineTransform matrix);
    @Bridge(symbol="CTFontCopyVariationAxes", optional=true)
    public native @org.robovm.rt.bro.annotation.Marshaler(CTFontVariationAxes.AsListMarshaler.class) List<CTFontVariationAxes> getVariationAxes();
    @Bridge(symbol="CTFontCopyVariation", optional=true)
    public native @org.robovm.rt.bro.annotation.Marshaler(CFDictionary.AsStringMapMarshaler.class) Map<String, NSNumber> getVariation();
    @Bridge(symbol="CTFontCopyFeatures", optional=true)
    protected native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CFArray getFeatures();
    @Bridge(symbol="CTFontCopyFeatureSettings", optional=true)
    protected native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CFArray getFeatureSettings();
    @Bridge(symbol="CTFontCopyGraphicsFont", optional=true)
    protected native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGFont getGraphicsFont(CTFontDescriptor.CTFontDescriptorPtr attributes);
    @Bridge(symbol="CTFontCreateWithGraphicsFont", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CTFont create(CGFont graphicsFont, @MachineSizedFloat double size, CGAffineTransform matrix, CTFontDescriptor attributes);
    @Bridge(symbol="CTFontCopyAvailableTables", optional=true)
    public native @org.robovm.rt.bro.annotation.Marshaler(CTFontTableTag.AsListMarshaler.class) List<CTFontTableTag> getAvailableTables(CTFontTableOptions options);
    @Bridge(symbol="CTFontCopyTable", optional=true)
    public native @org.robovm.rt.bro.annotation.Marshaler(NSObject.NoRetainMarshaler.class) NSData getTable(CTFontTableTag table, CTFontTableOptions options);
    @Bridge(symbol="CTFontDrawGlyphs", optional=true)
    protected native void drawGlyphs(ShortPtr glyphs, CGPoint positions, @MachineSizedUInt long count, CGContext context);
    @Bridge(symbol="CTFontGetLigatureCaretPositions", optional=true)
    protected native @MachineSizedSInt long getLigatureCaretPositions(short glyph, MachineSizedFloatPtr positions, @MachineSizedSInt long maxPositions);
    @Bridge(symbol="CTFontCopyDefaultCascadeListForLanguages", optional=true)
    public native @org.robovm.rt.bro.annotation.Marshaler(CTFontDescriptor.AsListMarshaler.class) List<CTFontDescriptor> getDefaultCascadeList(@org.robovm.rt.bro.annotation.Marshaler(CFArray.AsStringListMarshaler.class) List<String> languagePrefList);
    /*</methods>*/
}
